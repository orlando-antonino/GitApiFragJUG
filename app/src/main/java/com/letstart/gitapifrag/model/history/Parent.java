
package com.letstart.gitapifrag.model.history;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.builder.ToStringBuilder;


public class Parent {

    @Expose
    private String sha;
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
