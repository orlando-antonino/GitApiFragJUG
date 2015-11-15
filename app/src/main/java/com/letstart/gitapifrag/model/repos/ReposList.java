package com.letstart.gitapifrag.model.repos;

import com.letstart.gitapifrag.model.RespGenericBean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by orlando on 19/04/15.
 */
public class ReposList extends RespGenericBean implements Serializable {

//    ArrayList<Repos> resposList;
    Repos[] reposArray;

/*    public ReposList(ArrayList<Repos> resposList) {
        this.resposList = resposList;
    }*/

    public ReposList(Repos[] reposArray) {
        this.reposArray = reposArray;
    }

    public Repos[] getReposArray() {
        return reposArray;
    }
/*
    public void setReposList(Repos[] reposArray) {
        this.reposArray = reposArray;
    }


    public ArrayList<Repos> getResposList() {
        return resposList;
    }*/
/*
    public void setResposList(ArrayList<Repos> resposList) {
        this.resposList = resposList;
    }
*/



}
