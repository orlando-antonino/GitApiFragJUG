package com.letstart.gitapifrag.async;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by orlando on 19/04/15.
 */
public class NetworkConn  {

    private static final String TAG = "NetworkConn";
    Activity act;
    String url;
    WeakReference<IresponseFromAT> responseIntW;




    public interface IresponseFromAT{
        void responsse(String jsonStr);
    }


    public NetworkConn(Activity cont, IresponseFromAT response, String pathAndParams){
        this.act = cont;
        this.url = pathAndParams;

        responseIntW=  new WeakReference<>(response);
        Log.i(TAG,url);
        new NetworkConnection().execute(url);


    }

    public class NetworkConnection extends AsyncTask<String,Void,String> {


        @Override
        protected String doInBackground(String... urls) {

            try {
                String data = downloadUrl(urls[0]);

                return data;

            } catch (IOException e) {
                e.printStackTrace();

            }
            return null;


        }

        @Override
        protected void onPostExecute(String respGenericBean) {
            super.onPostExecute(respGenericBean);
            if(responseIntW.get()!=null) {
                responseIntW.get().responsse(respGenericBean);
            }
        }
    }

    // Given a URL, establishes an HttpUrlConnection and retrieves
// the web page content as a InputStream, which it returns as
// a string.
    private String downloadUrl(String myurl) throws IOException {
        InputStream is = null;


        try {
            URL url = new URL(myurl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(10000 /* milliseconds */);
            conn.setConnectTimeout(15000 /* milliseconds */);
            conn.setRequestMethod("GET");
            conn.setDoInput(true);
            // Starts the query
            conn.connect();
            int response = conn.getResponseCode();
            Log.d("", "The response is: " + response);
            is = conn.getInputStream();

            BufferedReader bufread = new BufferedReader(new InputStreamReader(is,"UTF-8"));
            StringBuilder contentAsString = new StringBuilder();
            String line ="";
            while((line = bufread.readLine()) != null) {
                contentAsString.append(line);
            }

            // Convert the InputStream into a string
            //String contentAsString = readIt(is, len);
            return contentAsString.toString();

            // Makes sure that the InputStream is closed after the app is
            // finished using it.
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }


}
