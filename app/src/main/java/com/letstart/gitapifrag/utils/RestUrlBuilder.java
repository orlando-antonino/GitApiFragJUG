package com.letstart.gitapifrag.utils;

import android.util.Log;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 * Created by antonino.orlando on 21/04/2015.
 */
public class RestUrlBuilder {
    private static final String TAG = "RestUrlBuilder";

    public RestUrlBuilder() {

    }
    public String getUrl(String url,String[] path, String[][] query) throws Exception{

        StringBuilder mUrl =new StringBuilder(url);

        for (int i=0;i< path.length; i++){
            if (!path[i].startsWith("/")){
                Log.e(TAG, "path params must be with heading /");
                throw new Exception();

            }

            mUrl.append(path[i]);
        }


        for (int i=0;i< query.length; i++){
            if(i==0){
                mUrl.append("?").append(query[i][0]).append("=").append(query[i][1]);
            }
            else {
                mUrl.append("&").append(query[i][0]).append("=").append(query[i][1]);
            }

        }
        String mUrlStr = mUrl.toString();
        return mUrlStr;
    }
}
