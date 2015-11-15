
package com.letstart.gitapifrag.model.history;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.builder.ToStringBuilder;


public class Commit {

    @Expose
    private Author author;
    @Expose
    private Committer committer;
    @Expose
    private String message;
    @Expose
    private Tree tree;
    @Expose
    private String url;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;

    /**
     * 
     * @return
     *     The author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * 
     * @param author
     *     The author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * 
     * @return
     *     The committer
     */
    public Committer getCommitter() {
        return committer;
    }

    /**
     * 
     * @param committer
     *     The committer
     */
    public void setCommitter(Committer committer) {
        this.committer = committer;
    }

    /**
     * 
     * @return
     *     The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 
     * @return
     *     The tree
     */
    public Tree getTree() {
        return tree;
    }

    /**
     * 
     * @param tree
     *     The tree
     */
    public void setTree(Tree tree) {
        this.tree = tree;
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
     *     The commentCount
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * 
     * @param commentCount
     *     The comment_count
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
