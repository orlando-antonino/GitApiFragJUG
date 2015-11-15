package com.letstart.gitapifrag.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.letstart.gitapifrag.R;
import com.letstart.gitapifrag.model.repos.Repos;

import java.util.List;

public class ReposAdapter extends ArrayAdapter<Repos> {


    ShowDialogInt showDialogInt;
    ShowHistoryInt showHistoryInt;

    public interface ShowHistoryInt{

        void showHistory(String repoName);

    }
    public interface ShowDialogInt{
        void mShowDialog(String link1, String link2);

    }

    public ReposAdapter(Context context, int resource) {
        super(context, resource);

    }

    public ReposAdapter(Context context, int resource, Repos[] objects) {
        super(context, resource, objects);

    }

    public ReposAdapter(Context context, int resource, List<Repos> objects) {
        super(context, resource, objects);

    }

    @Override
    public Repos getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final RepoHolder older;
        final Repos currentObj = getItem(position);

        if(convertView == null){
            older = new RepoHolder();
            convertView = ((LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.layout_git_item, null);
            older.repoDescription = (TextView)convertView.findViewById(R.id.repo_description);
            older.repoName = (TextView)convertView.findViewById(R.id.repo_name);
            older.repoOwner = (TextView)convertView.findViewById(R.id.repo_owner);
            convertView.setTag(older);
        }else{
            older = (RepoHolder)convertView.getTag();
        }

        older.repoDescription.setText(currentObj.getDescription());
        older.repoName.setText(currentObj.getName());
        older.repoOwner.setText(currentObj.getOwner().getLogin());

        if(currentObj.getFork())
            convertView.setBackgroundColor(getContext().getResources().getColor(android.R.color.holo_green_light));
        else
            convertView.setBackgroundColor(Color.WHITE);


        // This is a tricky memory issue

     /*   convertView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
               if(showDialogInt!=null){
                showDialogInt.mShowDialog( currentObj.getHtmlUrl(),currentObj.getOwner().getHtmlUrl());
                return true;
               }
                return false;
            }
        });
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(showHistoryInt!=null){
                    showHistoryInt.showHistory( currentObj.getName());

                }


            }
        });*/
        return convertView;
    }

    public static class RepoHolder{
        TextView repoName;
        TextView repoOwner;
        TextView repoDescription;

    }
 /*   public void setListnerLongTap(ShowDialogInt showDialogInt){
        this.showDialogInt = showDialogInt;
    }

    public void setListnerTap(ShowHistoryInt showHistoryInt){
        this.showHistoryInt = showHistoryInt;
    }*/
}
