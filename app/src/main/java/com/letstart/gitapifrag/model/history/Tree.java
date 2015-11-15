
package com.letstart.gitapifrag.model.history;

import com.google.gson.annotations.Expose;

import org.apache.commons.lang.builder.ToStringBuilder;


public class Tree {

    @Expose
    private String sha;
    @Expose
    private String url;

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
