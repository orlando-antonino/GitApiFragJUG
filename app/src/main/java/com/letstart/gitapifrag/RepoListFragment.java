package com.letstart.gitapifrag;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.letstart.gitapifrag.adapter.ReposAdapter;
import com.letstart.gitapifrag.async.JsonParser;
import com.letstart.gitapifrag.async.NetworkConn;
import com.letstart.gitapifrag.model.RespGenericBean;
import com.letstart.gitapifrag.model.repos.Repos;
import com.letstart.gitapifrag.model.repos.ReposList;
import com.letstart.gitapifrag.utils.RestUrlBuilder;
import com.letstart.gitapifrag.utils.Utils;

import java.io.IOException;


/**
  * A list fragment representing a list of Repos. This fragment
  * also supports tablet devices by allowing list items to be given an
  * 'activated' state upon selection. This helps indicate which item is
  * currently being viewed in a {@link RepoDetailFragment}.
  * <p/>
  */
 public class RepoListFragment
         extends ListFragment
         implements NetworkConn.IresponseFromAT

{

    private static final String TAG = RepoListFragment.class.getSimpleName();
    ReposAdapter reposAdapter;


     /**
      * Mandatory empty constructor for the fragment manager to instantiate the
      * fragment (e.g. upon screen orientation changes).
      */
     public RepoListFragment() {
     }

     @Override
     public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setRetainInstance(true);

         reposAdapter = new ReposAdapter(getActivity().getApplicationContext(), 0);
      //  reposAdapter.setListnerTap((ReposAdapter.ShowHistoryInt) getActivity());
      //   reposAdapter.setListnerLongTap((ReposAdapter.ShowDialogInt) getActivity());
         setListAdapter(reposAdapter);


     }



    @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

         View rootView = inflater.inflate(R.layout.fragment_repo_list, container, false);





        return rootView;
     }


    @Override
     public void onViewCreated(View view, Bundle savedInstanceState) {
         super.onViewCreated(view, savedInstanceState);


        ListView lv = getListView();

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i(TAG, "");
                if (( getActivity()) != null) {
                    Repos temp_rep=reposAdapter.getItem(i);
                    ((RepoListActivity) getActivity()).mShowDialog(temp_rep.getOwner().getHtmlUrl(),temp_rep.getHtmlUrl());
                    return true;
                }
                return false;
            }
        }) ;

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i(TAG, "");
                if (getActivity() != null)
                    ((RepoListActivity) getActivity()).showHistory(reposAdapter.getItem(i).getName());


            }
        });

         if (Utils.isOnline(getActivity())) {
             loadDataRetry();
         }
         else {

             try {
                 String reposDataCached = (String) Utils.readReposData(getActivity(), "repos.data");
                 responsse(reposDataCached);
                 if (getActivity() != null)
                     Toast.makeText(getActivity(), "you are offline, cached data", Toast.LENGTH_LONG).show();

             } catch (IOException e) {
                 e.printStackTrace();
             } catch (ClassNotFoundException e) {
                 e.printStackTrace();
             }
         }


     }

     public void loadDataRetry() {



                 String[][] query_string = {

                 };
                 try {
                     String completeUri = new RestUrlBuilder().getUrl(getActivity().getApplicationContext().getResources().getString(R.string.git_server),
                             new String[]{"/users/orlando-antonino/repos"},
                             query_string);

                     new NetworkConn(getActivity(),
                             (NetworkConn.IresponseFromAT) getFragmentManager().findFragmentById(R.id.repo_list),
                             completeUri
                     );
                 } catch (Exception e) {
                     e.printStackTrace();
                 }



     }

     @Override
     public void responsse(String jsonStr) {
         if (jsonStr != null && !jsonStr.equals("")) {

             new JsonParser(getActivity(), respJson, jsonStr, "repos");
             if (getActivity() != null) {
                 try {
                     Utils.cacheReposData(getActivity(), "repos.data", jsonStr);
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
         } else {
             if (getActivity() != null) {
                 ProgressBar pb = (ProgressBar) getActivity().findViewById(R.id.progress_repo);
                 if (pb != null)
                     pb.setVisibility(View.GONE);

                 Toast.makeText(getActivity(),"Error on network request", Toast.LENGTH_LONG).show();
             }
         }
     }

     private JsonParser.IresponseFromJsonParserAT respJson = new JsonParser.IresponseFromJsonParserAT() {
         @Override
         public void responsseJson(RespGenericBean resp) {
             if (resp != null) {
                 reposAdapter.addAll(((ReposList) resp).getReposArray());

             } else {
                 if (getActivity() != null)
                     Toast.makeText(getActivity(),"Error on network request", Toast.LENGTH_LONG).show();
             }
             if (getActivity() != null) {
                 ProgressBar pb = (ProgressBar) getActivity().findViewById(R.id.progress_repo);
                 if (pb != null)
                     pb.setVisibility(View.GONE);


             }

         }
     };

     @Override
     public void onAttach(Activity activity) {
         super.onAttach(activity);

     }

     @Override
     public void onDetach() {
         super.onDetach();

     }

    @Override
     public void onSaveInstanceState(Bundle outState) {
             super.onSaveInstanceState(outState);

     }

     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
         int id = item.getItemId();
         if (id == R.id.action_retry) {
             loadDataRetry();
             return true;
         }
         return super.onOptionsItemSelected(item);
     }

     @Override
     public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
         inflater.inflate(R.menu.menu, menu);
         super.onCreateOptionsMenu(menu, inflater);
     }
 }
