package com.letstart.gitapifrag;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.letstart.gitapifrag.adapter.HistoryAdapter;
import com.letstart.gitapifrag.async.JsonParser;
import com.letstart.gitapifrag.async.NetworkConn;
import com.letstart.gitapifrag.model.RespGenericBean;
import com.letstart.gitapifrag.model.history.HistoryList;
import com.letstart.gitapifrag.utils.RestUrlBuilder;

/**
 * A fragment representing a single Repo detail screen.
 * This fragment is either contained in a {@link RepoListActivity}
 * in two-pane mode (on tablets) or a {@link RepoDetailActivity}
 * on handsets.
 */
public class RepoDetailFragment
        extends ListFragment
        implements NetworkConn.IresponseFromAT
        , JsonParser.IresponseFromJsonParserAT {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private String repoNAme;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */


    HistoryAdapter historyAdapter;

    public RepoDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            repoNAme = getArguments().getString(ARG_ITEM_ID);
            Log.i("", "");

            String[][] query_string = {

            };
            try {
                String completeUri = new RestUrlBuilder().getUrl(getActivity().getApplicationContext().getResources().getString(R.string.git_server),
                        new String[]{"/repos/orlando-antonino", "/" + repoNAme, "/commits"},
                            query_string );
                new NetworkConn(getActivity(),
                        (NetworkConn.IresponseFromAT) getFragmentManager().findFragmentById(R.id.repo_detail_container),
                        completeUri

                );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_repo_detail, container, false);


        if (repoNAme != null) {

            historyAdapter = new HistoryAdapter(getActivity().getApplicationContext(), 0);

            setListAdapter(historyAdapter);

        }


        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().findViewById(R.id.progress_detail).setVisibility(View.VISIBLE);

    }

    @Override
    public void responsse(String jsonStr) {
        if (jsonStr != null && !jsonStr.equals("")) {
            new JsonParser(getActivity(), this, jsonStr, "history");

        } else {
            if (getActivity() != null) {
                ProgressBar pb = (ProgressBar) getActivity().findViewById(R.id.progress_detail);
                if (pb != null)
                    pb.setVisibility(View.GONE);

                Toast.makeText(getActivity(),"Error on network request", Toast.LENGTH_LONG).show();


            }
        }
    }

    @Override
    public void responsseJson(RespGenericBean respObj) {
        if (respObj != null) {
            historyAdapter.addAll(((HistoryList) respObj).getReposArray());

        } else {
            if (getActivity() != null)
                Toast.makeText(getActivity(),"Error on network request", Toast.LENGTH_LONG).show();

        }
        if (getActivity() != null) {
            ProgressBar pb = (ProgressBar) getActivity().findViewById(R.id.progress_detail);
            if (pb != null)
                pb.setVisibility(View.GONE);


        }
    }

}
