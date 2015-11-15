
package com.letstart.gitapifrag.model.repos;


import com.google.gson.annotations.Expose;

import org.apache.commons.lang.builder.ToStringBuilder;


public class Permissions {

    @Expose
    private Boolean admin;
    @Expose
    private Boolean push;
    @Expose
    private Boolean pull;

    /**
     * 
     * @return
     *     The admin
     */
    public Boolean getAdmin() {
        return admin;
    }

    /**
     * 
     * @param admin
     *     The admin
     */
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Permissions withAdmin(Boolean admin) {
        this.admin = admin;
        return this;
    }

    /**
     * 
     * @return
     *     The push
     */
    public Boolean getPush() {
        return push;
    }

    /**
     * 
     * @param push
     *     The push
     */
    public void setPush(Boolean push) {
        this.push = push;
    }

    public Permissions withPush(Boolean push) {
        this.push = push;
        return this;
    }

    /**
     * 
     * @return
     *     The pull
     */
    public Boolean getPull() {
        return pull;
    }

    /**
     * 
     * @param pull
     *     The pull
     */
    public void setPull(Boolean pull) {
        this.pull = pull;
    }

    public Permissions withPull(Boolean pull) {
        this.pull = pull;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
