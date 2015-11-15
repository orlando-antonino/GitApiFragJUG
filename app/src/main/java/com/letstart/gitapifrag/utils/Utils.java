package com.letstart.gitapifrag.utils;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;

/**
 * Created by antonino.orlando on 15/04/2015.
 */
public class Utils {
    private static final String TAG = "Utils";

    /*
	 * [START] Shared Preferences
	 */

/*    private static SharedPreferences getSharedPreferences(Context context) {

        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static boolean saveBooleanInSP(Context context, String key,
                                          boolean value) {

        SharedPreferences settings = getSharedPreferences(context);

        // Writing data to SharedPreferences
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(key, value);
        return editor.commit();
    }

    public static boolean containsSP(Context context, String key) {


        SharedPreferences settings = getSharedPreferences(context);

        return settings.contains(key);


    }

    public static boolean getBooleanFromSP(Context context, String key) {

        SharedPreferences settings = getSharedPreferences(context);
        // Reading from SharedPreferences
        return settings.getBoolean(key,false);


    }

    public static boolean saveIntInSP(Context context, String key, int value) {

        SharedPreferences settings = getSharedPreferences(context);

        // Writing data to SharedPreferences
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt(key, value);
        return editor.commit();
    }
    public static int getIntFromSP(Context context, String key) {


        SharedPreferences settings = getSharedPreferences(context);
        // Reading from SharedPreferences
        return settings.getInt(key,-1);
    }
    public static boolean saveLongInSP(Context context, String key, long value) {

        SharedPreferences settings = getSharedPreferences(context);

        // Writing data to SharedPreferences
        SharedPreferences.Editor editor = settings.edit();
        editor.putLong(key, value);
        return editor.commit();
    }

    public static String getStringFromSP(Context context, String key) {

        SharedPreferences settings = getSharedPreferences(context);
        // Reading from SharedPreferences
        return settings.getString(key, "");
    }

    public static boolean saveStringInSP(Context context, String key,
                                         String value) {

        SharedPreferences settings = getSharedPreferences(context);

        // Writing data to SharedPreferences
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(key, value);
        return editor.commit();
    }

    public static String getBase64(String toEncode){

        byte[] encodedBytes = Base64.encode(toEncode.getBytes(), Base64.DEFAULT);
        String encStr =new String(encodedBytes);
        Log.d(TAG,encStr );
        return encStr;

    }
    public static String fromRetroRespToString(Response resp){
        TypedInput body = resp.getBody();
        StringBuilder out = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(body.in()));

            String newLine = System.getProperty("line.separator");
            String line;
            while ((line = reader.readLine()) != null) {
                out.append(line);
                out.append(newLine);
            }

            // Prints the correct String representation of body.
            System.out.println(out);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return out.toString();
    }*/

    public static boolean isOnline(Activity act) {
        ConnectivityManager cm =
                (ConnectivityManager) act.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }
    public static void cacheReposData(Activity act,String fileName, String object) throws FileNotFoundException,IOException{
        FileOutputStream fileOutputStream = act.openFileOutput(fileName, Context.MODE_PRIVATE);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();

    }
    public static Object readReposData(Activity act, String fileName)
            throws FileNotFoundException,StreamCorruptedException,
            IOException,ClassNotFoundException {
        FileInputStream fileInputStream = act.openFileInput(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object yourObject = (Object)objectInputStream.readObject();
        objectInputStream.close();
        return yourObject;
    }



}
