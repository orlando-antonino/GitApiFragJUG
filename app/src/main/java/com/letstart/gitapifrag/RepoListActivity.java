package com.letstart.gitapifrag;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.letstart.gitapifrag.adapter.ReposAdapter;


/**
 * An activity representing a list of Repos. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link RepoDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 * <p/>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link RepoListFragment} and the item details
 * (if present) is a {@link RepoDetailFragment}.
 * <p/>
 */
public class RepoListActivity extends ActionBarActivity
        implements ReposAdapter.ShowDialogInt
        , ReposAdapter.ShowHistoryInt {

    private static final String TAG = RepoListActivity.class.getSimpleName();
    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repo_list);

        if (findViewById(R.id.repo_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-large and
            // res/values-sw600dp). If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;

            // In two-pane mode, list items should be given the
            // 'activated' state when touched.


        }

    }

    /**
     * Callback method from {@link ReposAdapter.ShowDialogInt}
     * indicating that the item with the given ID was selected.
     * @param link1
     * @param link2
     */
    @Override
    public void mShowDialog(final String link1, final String link2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final Intent i = new Intent(Intent.ACTION_VIEW);

        builder.setMessage(getString(R.string.open_repos_string))
                .setPositiveButton(getString(R.string.open_repos_url), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        i.setData(Uri.parse(link1));
                        startBrowser(i);
                    }
                })
                .setNegativeButton(getString(R.string.open_owner_url), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {


                        i.setData(Uri.parse(link2));
                        startBrowser(i);
                    }
                });

        builder.create().show();

    }


    public void startBrowser(Intent in) {
        startActivity(in);
    }

    @Override
    public void showHistory(String repoName) {
        if (mTwoPane) {
            // In two-pane mode, show the detail view in this activity by
            // adding or replacing the detail fragment using a
            // fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(RepoDetailFragment.ARG_ITEM_ID, repoName);
            RepoDetailFragment fragment = new RepoDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.repo_detail_container, fragment)
                    .commit();

        } else {
            // In single-pane mode, simply start the detail activity
            // for the selected item ID.
            Intent detailIntent = new Intent(this, RepoDetailActivity.class);
            detailIntent.putExtra(RepoDetailFragment.ARG_ITEM_ID, repoName);
            startActivity(detailIntent);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_retry) {
                RepoListFragment articleFrag = (RepoListFragment)
                                 getSupportFragmentManager().findFragmentById(R.id.repo_list);
                if(articleFrag!=null)
                    articleFrag.loadDataRetry();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "lifecycle destroyed");
    }
}
