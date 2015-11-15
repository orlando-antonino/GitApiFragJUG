
package com.letstart.gitapifrag.model.history;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.letstart.gitapifrag.model.RespGenericBean;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;


public class CommitHistory extends RespGenericBean {

    @Expose
    private String sha;
    @Expose
    private Commit commit;
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("comments_url")
    @Expose
    private String commentsUrl;
    @Expose
    private Author_ author;
    @Expose
    private Committer_ committer;
    @Expose
    private List<Parent> parents = new ArrayList<Parent>();

    /**
     * 
     * @return
     *     The sha
     */
    public String getSha() {
        return sha;
    }

    /**
     * 
     * @param sha
     *     The sha
     */
    public void setSha(String sha) {
        this.sha = sha;
    }

    /**
     * 
     * @return
     *     The commit
     */
    public Commit getCommit() {
        return commit;
    }

    /**
     * 
     * @param commit
     *     The commit
     */
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The htmlUrl
     */
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * 
     * @param htmlUrl
     *     The html_url
     */
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * 
     * @return
     *     The commentsUrl
     */
    public String getCommentsUrl() {
        return commentsUrl;
    }

    /**
     * 
     * @param commentsUrl
     *     The comments_url
     */
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    /**
     * 
     * @return
     *     The author
     */
    public Author_ getAuthor() {
        return author;
    }

    /**
     * 
     * @param author
     *     The author
     */
    public void setAuthor(Author_ author) {
        this.author = author;
    }

    /**
     * 
     * @return
     *     The committer
     */
    public Committer_ getCommitter() {
        return committer;
    }

    /**
     * 
     * @param committer
     *     The committer
     */
    public void setCommitter(Committer_ committer) {
        this.committer = committer;
    }

    /**
     * 
     * @return
     *     The parents
     */
    public List<Parent> getParents() {
        return parents;
    }

    /**
     * 
     * @param parents
     *     The parents
     */
    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
