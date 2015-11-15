package com.letstart.gitapifrag.model.history;

import com.letstart.gitapifrag.model.RespGenericBean;
import com.letstart.gitapifrag.model.repos.Repos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by orlando on 19/04/15.
 */
public class HistoryList extends RespGenericBean implements Serializable {

//    ArrayList<CommitHistory> resposList;
    CommitHistory[] commitArray;

    public HistoryList(CommitHistory[] commitHistory) {
        this.commitArray = commitHistory;
    }

    public CommitHistory[] getReposArray() {
        return commitArray;
    }

/*
    public HistoryList(ArrayList<CommitHistory> resposList) {
        this.resposList = resposList;
    }

    public ArrayList<CommitHistory> getResposList() {
        return resposList;
    }

    public void setResposList(ArrayList<CommitHistory> resposList) {
        this.resposList = resposList;
    }

*/


}
