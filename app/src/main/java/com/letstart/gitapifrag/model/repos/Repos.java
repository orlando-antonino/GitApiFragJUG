
package com.letstart.gitapifrag.model.repos;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.letstart.gitapifrag.model.RespGenericBean;

import org.apache.commons.lang.builder.ToStringBuilder;


public class Repos extends RespGenericBean {

    @Expose
    private Integer id;
    @Expose
    private String name;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @Expose
    private Owner owner;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @Expose
    private String description;
    @Expose
    private Boolean fork;
    @Expose
    private String url;
    @SerializedName("forks_url")
    @Expose
    private String forksUrl;
    @SerializedName("keys_url")
    @Expose
    private String keysUrl;
    @SerializedName("collaborators_url")
    @Expose
    private String collaboratorsUrl;
    @SerializedName("teams_url")
    @Expose
    private String teamsUrl;
    @SerializedName("hooks_url")
    @Expose
    private String hooksUrl;
    @SerializedName("issue_events_url")
    @Expose
    private String issueEventsUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("assignees_url")
    @Expose
    private String assigneesUrl;
    @SerializedName("branches_url")
    @Expose
    private String branchesUrl;
    @SerializedName("tags_url")
    @Expose
    private String tagsUrl;
    @SerializedName("blobs_url")
    @Expose
    private String blobsUrl;
    @SerializedName("git_tags_url")
    @Expose
    private String gitTagsUrl;
    @SerializedName("git_refs_url")
    @Expose
    private String gitRefsUrl;
    @SerializedName("trees_url")
    @Expose
    private String treesUrl;
    @SerializedName("statuses_url")
    @Expose
    private String statusesUrl;
    @SerializedName("languages_url")
    @Expose
    private String languagesUrl;
    @SerializedName("stargazers_url")
    @Expose
    private String stargazersUrl;
    @SerializedName("contributors_url")
    @Expose
    private String contributorsUrl;
    @SerializedName("subscribers_url")
    @Expose
    private String subscribersUrl;
    @SerializedName("subscription_url")
    @Expose
    private String subscriptionUrl;
    @SerializedName("commits_url")
    @Expose
    private String commitsUrl;
    @SerializedName("git_commits_url")
    @Expose
    private String gitCommitsUrl;
    @SerializedName("comments_url")
    @Expose
    private String commentsUrl;
    @SerializedName("issue_comment_url")
    @Expose
    private String issueCommentUrl;
    @SerializedName("contents_url")
    @Expose
    private String contentsUrl;
    @SerializedName("compare_url")
    @Expose
    private String compareUrl;
    @SerializedName("merges_url")
    @Expose
    private String mergesUrl;
    @SerializedName("archive_url")
    @Expose
    private String archiveUrl;
    @SerializedName("downloads_url")
    @Expose
    private String downloadsUrl;
    @SerializedName("issues_url")
    @Expose
    private String issuesUrl;
    @SerializedName("pulls_url")
    @Expose
    private String pullsUrl;
    @SerializedName("milestones_url")
    @Expose
    private String milestonesUrl;
    @SerializedName("notifications_url")
    @Expose
    private String notificationsUrl;
    @SerializedName("labels_url")
    @Expose
    private String labelsUrl;
    @SerializedName("releases_url")
    @Expose
    private String releasesUrl;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("pushed_at")
    @Expose
    private String pushedAt;
    @SerializedName("git_url")
    @Expose
    private String gitUrl;
    @SerializedName("ssh_url")
    @Expose
    private String sshUrl;
    @SerializedName("clone_url")
    @Expose
    private String cloneUrl;
    @SerializedName("svn_url")
    @Expose
    private String svnUrl;
    @Expose
    private Object homepage;
    @Expose
    private Integer size;
    @SerializedName("stargazers_count")
    @Expose
    private Integer stargazersCount;
    @SerializedName("watchers_count")
    @Expose
    private Integer watchersCount;
    @Expose
    private String language;
    @SerializedName("has_issues")
    @Expose
    private Boolean hasIssues;
    @SerializedName("has_downloads")
    @Expose
    private Boolean hasDownloads;
    @SerializedName("has_wiki")
    @Expose
    private Boolean hasWiki;
    @SerializedName("has_pages")
    @Expose
    private Boolean hasPages;
    @SerializedName("forks_count")
    @Expose
    private Integer forksCount;
    @SerializedName("mirror_url")
    @Expose
    private Object mirrorUrl;
    @SerializedName("open_issues_count")
    @Expose
    private Integer openIssuesCount;
    @Expose
    private Integer forks;
    @SerializedName("open_issues")
    @Expose
    private Integer openIssues;
    @Expose
    private Integer watchers;
    @SerializedName("default_branch")
    @Expose
    private String defaultBranch;
    @Expose
    private Permissions permissions;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    public Repos withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Repos withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 
     * @param fullName
     *     The full_name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Repos withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * 
     * @return
     *     The owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * 
     * @param owner
     *     The owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Repos withOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 
     * @return
     *     The _private
     */
    public Boolean getPrivate() {
        return _private;
    }

    /**
     * 
     * @param _private
     *     The private
     */
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public Repos withPrivate(Boolean _private) {
        this._private = _private;
        return this;
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

    public Repos withHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Repos withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The fork
     */
    public Boolean getFork() {
        return fork;
    }

    /**
     * 
     * @param fork
     *     The fork
     */
    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public Repos withFork(Boolean fork) {
        this.fork = fork;
        return this;
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

    public Repos withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 
     * @return
     *     The forksUrl
     */
    public String getForksUrl() {
        return forksUrl;
    }

    /**
     * 
     * @param forksUrl
     *     The forks_url
     */
    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public Repos withForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The keysUrl
     */
    public String getKeysUrl() {
        return keysUrl;
    }

    /**
     * 
     * @param keysUrl
     *     The keys_url
     */
    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public Repos withKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The collaboratorsUrl
     */
    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    /**
     * 
     * @param collaboratorsUrl
     *     The collaborators_url
     */
    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public Repos withCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The teamsUrl
     */
    public String getTeamsUrl() {
        return teamsUrl;
    }

    /**
     * 
     * @param teamsUrl
     *     The teams_url
     */
    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public Repos withTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The hooksUrl
     */
    public String getHooksUrl() {
        return hooksUrl;
    }

    /**
     * 
     * @param hooksUrl
     *     The hooks_url
     */
    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public Repos withHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The issueEventsUrl
     */
    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    /**
     * 
     * @param issueEventsUrl
     *     The issue_events_url
     */
    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public Repos withIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     * 
     * @param eventsUrl
     *     The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public Repos withEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The assigneesUrl
     */
    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    /**
     * 
     * @param assigneesUrl
     *     The assignees_url
     */
    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public Repos withAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The branchesUrl
     */
    public String getBranchesUrl() {
        return branchesUrl;
    }

    /**
     * 
     * @param branchesUrl
     *     The branches_url
     */
    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public Repos withBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The tagsUrl
     */
    public String getTagsUrl() {
        return tagsUrl;
    }

    /**
     * 
     * @param tagsUrl
     *     The tags_url
     */
    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public Repos withTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The blobsUrl
     */
    public String getBlobsUrl() {
        return blobsUrl;
    }

    /**
     * 
     * @param blobsUrl
     *     The blobs_url
     */
    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public Repos withBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The gitTagsUrl
     */
    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    /**
     * 
     * @param gitTagsUrl
     *     The git_tags_url
     */
    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public Repos withGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The gitRefsUrl
     */
    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    /**
     * 
     * @param gitRefsUrl
     *     The git_refs_url
     */
    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public Repos withGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The treesUrl
     */
    public String getTreesUrl() {
        return treesUrl;
    }

    /**
     * 
     * @param treesUrl
     *     The trees_url
     */
    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public Repos withTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The statusesUrl
     */
    public String getStatusesUrl() {
        return statusesUrl;
    }

    /**
     * 
     * @param statusesUrl
     *     The statuses_url
     */
    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public Repos withStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The languagesUrl
     */
    public String getLanguagesUrl() {
        return languagesUrl;
    }

    /**
     * 
     * @param languagesUrl
     *     The languages_url
     */
    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public Repos withLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The stargazersUrl
     */
    public String getStargazersUrl() {
        return stargazersUrl;
    }

    /**
     * 
     * @param stargazersUrl
     *     The stargazers_url
     */
    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public Repos withStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The contributorsUrl
     */
    public String getContributorsUrl() {
        return contributorsUrl;
    }

    /**
     * 
     * @param contributorsUrl
     *     The contributors_url
     */
    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public Repos withContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The subscribersUrl
     */
    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    /**
     * 
     * @param subscribersUrl
     *     The subscribers_url
     */
    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public Repos withSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The subscriptionUrl
     */
    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    /**
     * 
     * @param subscriptionUrl
     *     The subscription_url
     */
    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public Repos withSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The commitsUrl
     */
    public String getCommitsUrl() {
        return commitsUrl;
    }

    /**
     * 
     * @param commitsUrl
     *     The commits_url
     */
    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public Repos withCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The gitCommitsUrl
     */
    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    /**
     * 
     * @param gitCommitsUrl
     *     The git_commits_url
     */
    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public Repos withGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
        return this;
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

    public Repos withCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The issueCommentUrl
     */
    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    /**
     * 
     * @param issueCommentUrl
     *     The issue_comment_url
     */
    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public Repos withIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The contentsUrl
     */
    public String getContentsUrl() {
        return contentsUrl;
    }

    /**
     * 
     * @param contentsUrl
     *     The contents_url
     */
    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public Repos withContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The compareUrl
     */
    public String getCompareUrl() {
        return compareUrl;
    }

    /**
     * 
     * @param compareUrl
     *     The compare_url
     */
    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public Repos withCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The mergesUrl
     */
    public String getMergesUrl() {
        return mergesUrl;
    }

    /**
     * 
     * @param mergesUrl
     *     The merges_url
     */
    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public Repos withMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The archiveUrl
     */
    public String getArchiveUrl() {
        return archiveUrl;
    }

    /**
     * 
     * @param archiveUrl
     *     The archive_url
     */
    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public Repos withArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The downloadsUrl
     */
    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    /**
     * 
     * @param downloadsUrl
     *     The downloads_url
     */
    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public Repos withDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The issuesUrl
     */
    public String getIssuesUrl() {
        return issuesUrl;
    }

    /**
     * 
     * @param issuesUrl
     *     The issues_url
     */
    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public Repos withIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The pullsUrl
     */
    public String getPullsUrl() {
        return pullsUrl;
    }

    /**
     * 
     * @param pullsUrl
     *     The pulls_url
     */
    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public Repos withPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The milestonesUrl
     */
    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    /**
     * 
     * @param milestonesUrl
     *     The milestones_url
     */
    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public Repos withMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The notificationsUrl
     */
    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    /**
     * 
     * @param notificationsUrl
     *     The notifications_url
     */
    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public Repos withNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The labelsUrl
     */
    public String getLabelsUrl() {
        return labelsUrl;
    }

    /**
     * 
     * @param labelsUrl
     *     The labels_url
     */
    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public Repos withLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The releasesUrl
     */
    public String getReleasesUrl() {
        return releasesUrl;
    }

    /**
     * 
     * @param releasesUrl
     *     The releases_url
     */
    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public Repos withReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Repos withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Repos withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The pushedAt
     */
    public String getPushedAt() {
        return pushedAt;
    }

    /**
     * 
     * @param pushedAt
     *     The pushed_at
     */
    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public Repos withPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    /**
     * 
     * @param gitUrl
     *     The git_url
     */
    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public Repos withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The sshUrl
     */
    public String getSshUrl() {
        return sshUrl;
    }

    /**
     * 
     * @param sshUrl
     *     The ssh_url
     */
    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public Repos withSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The cloneUrl
     */
    public String getCloneUrl() {
        return cloneUrl;
    }

    /**
     * 
     * @param cloneUrl
     *     The clone_url
     */
    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public Repos withCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The svnUrl
     */
    public String getSvnUrl() {
        return svnUrl;
    }

    /**
     * 
     * @param svnUrl
     *     The svn_url
     */
    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public Repos withSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The homepage
     */
    public Object getHomepage() {
        return homepage;
    }

    /**
     * 
     * @param homepage
     *     The homepage
     */
    public void setHomepage(Object homepage) {
        this.homepage = homepage;
    }

    public Repos withHomepage(Object homepage) {
        this.homepage = homepage;
        return this;
    }

    /**
     * 
     * @return
     *     The size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    public Repos withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 
     * @return
     *     The stargazersCount
     */
    public Integer getStargazersCount() {
        return stargazersCount;
    }

    /**
     * 
     * @param stargazersCount
     *     The stargazers_count
     */
    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public Repos withStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
        return this;
    }

    /**
     * 
     * @return
     *     The watchersCount
     */
    public Integer getWatchersCount() {
        return watchersCount;
    }

    /**
     * 
     * @param watchersCount
     *     The watchers_count
     */
    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    public Repos withWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
        return this;
    }

    /**
     * 
     * @return
     *     The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    public Repos withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 
     * @return
     *     The hasIssues
     */
    public Boolean getHasIssues() {
        return hasIssues;
    }

    /**
     * 
     * @param hasIssues
     *     The has_issues
     */
    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public Repos withHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
        return this;
    }

    /**
     * 
     * @return
     *     The hasDownloads
     */
    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    /**
     * 
     * @param hasDownloads
     *     The has_downloads
     */
    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public Repos withHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
        return this;
    }

    /**
     * 
     * @return
     *     The hasWiki
     */
    public Boolean getHasWiki() {
        return hasWiki;
    }

    /**
     * 
     * @param hasWiki
     *     The has_wiki
     */
    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public Repos withHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
        return this;
    }

    /**
     * 
     * @return
     *     The hasPages
     */
    public Boolean getHasPages() {
        return hasPages;
    }

    /**
     * 
     * @param hasPages
     *     The has_pages
     */
    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    public Repos withHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
        return this;
    }

    /**
     * 
     * @return
     *     The forksCount
     */
    public Integer getForksCount() {
        return forksCount;
    }

    /**
     * 
     * @param forksCount
     *     The forks_count
     */
    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    public Repos withForksCount(Integer forksCount) {
        this.forksCount = forksCount;
        return this;
    }

    /**
     * 
     * @return
     *     The mirrorUrl
     */
    public Object getMirrorUrl() {
        return mirrorUrl;
    }

    /**
     * 
     * @param mirrorUrl
     *     The mirror_url
     */
    public void setMirrorUrl(Object mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public Repos withMirrorUrl(Object mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The openIssuesCount
     */
    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    /**
     * 
     * @param openIssuesCount
     *     The open_issues_count
     */
    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public Repos withOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
        return this;
    }

    /**
     * 
     * @return
     *     The forks
     */
    public Integer getForks() {
        return forks;
    }

    /**
     * 
     * @param forks
     *     The forks
     */
    public void setForks(Integer forks) {
        this.forks = forks;
    }

    public Repos withForks(Integer forks) {
        this.forks = forks;
        return this;
    }

    /**
     * 
     * @return
     *     The openIssues
     */
    public Integer getOpenIssues() {
        return openIssues;
    }

    /**
     * 
     * @param openIssues
     *     The open_issues
     */
    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    public Repos withOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
        return this;
    }

    /**
     * 
     * @return
     *     The watchers
     */
    public Integer getWatchers() {
        return watchers;
    }

    /**
     * 
     * @param watchers
     *     The watchers
     */
    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    public Repos withWatchers(Integer watchers) {
        this.watchers = watchers;
        return this;
    }

    /**
     * 
     * @return
     *     The defaultBranch
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    /**
     * 
     * @param defaultBranch
     *     The default_branch
     */
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public Repos withDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    /**
     * 
     * @return
     *     The permissions
     */
    public Permissions getPermissions() {
        return permissions;
    }

    /**
     * 
     * @param permissions
     *     The permissions
     */
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    public Repos withPermissions(Permissions permissions) {
        this.permissions = permissions;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
