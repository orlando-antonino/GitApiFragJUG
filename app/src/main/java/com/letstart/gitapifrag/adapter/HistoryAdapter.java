package com.letstart.gitapifrag.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.letstart.gitapifrag.R;
import com.letstart.gitapifrag.model.history.CommitHistory;

import java.util.List;

public class HistoryAdapter extends ArrayAdapter<CommitHistory> {


    public HistoryAdapter(Context context, int resource) {
        super(context, resource);

    }

    public HistoryAdapter(Context context, int resource, CommitHistory[] objects) {
        super(context, resource, objects);

    }

    public HistoryAdapter(Context context, int resource, List<CommitHistory> objects) {
        super(context, resource, objects);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final HistoryHolder older;
        final CommitHistory currentObj = getItem(position);

        if(convertView == null){
            older = new HistoryHolder();
            convertView = ((LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.layout_history_git_item, null);
            older.commitAuthor = (TextView)convertView.findViewById(R.id.commit_author);
            older.commitDate = (TextView)convertView.findViewById(R.id.commit_date);
            older.commitMessage = (TextView)convertView.findViewById(R.id.commit_message);
            convertView.setTag(older);
        }else{
            older = (HistoryHolder)convertView.getTag();
        }

        older.commitAuthor.setText(currentObj.getCommit().getAuthor().getName());
        older.commitDate.setText(currentObj.getCommit().getAuthor().getDate());
        older.commitMessage.setText(currentObj.getCommit().getMessage());


        return convertView;
    }

    public static class HistoryHolder {
        TextView commitDate;
        TextView commitMessage;
        TextView commitAuthor;

    }


}
