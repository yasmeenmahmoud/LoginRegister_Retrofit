package com.example.dell.loginregister_retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by khaled.badawy on 8/7/2018.
 */

public class GithubResponse {


    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("node_id")
    @Expose
    private String node_id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("full_name")
    @Expose
    private String full_name;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("html_url")
    @Expose
    private String html_url;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("fork")
    @Expose
    private Boolean fork;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("forks_url")
    @Expose
    private String forks_url;
    @SerializedName("keys_url")
    @Expose
    private String keys_url;
    @SerializedName("collaborators_url")
    @Expose
    private String collaborators_url;
    @SerializedName("teams_url")
    @Expose
    private String teams_url;
    @SerializedName("hooks_url")
    @Expose
    private String hooks_url;
    @SerializedName("issue_events_url")
    @Expose
    private String issue_events_url;
    @SerializedName("events_url")
    @Expose
    private String events_url;
    @SerializedName("assignees_url")
    @Expose
    private String assignees_url;
    @SerializedName("branches_url")
    @Expose
    private String branches_url;
    @SerializedName("tags_url")
    @Expose
    private String tags_url;
    @SerializedName("blobs_url")
    @Expose
    private String blobs_url;
    @SerializedName("git_tags_url")
    @Expose
    private String git_tags_url;
    @SerializedName("git_refs_url")
    @Expose
    private String git_refs_url;
    @SerializedName("trees_url")
    @Expose
    private String trees_url;
    @SerializedName("statuses_url")
    @Expose
    private String statuses_url;
    @SerializedName("languages_url")
    @Expose
    private String languages_url;
    @SerializedName("stargazers_url")
    @Expose
    private String stargazers_url;
    @SerializedName("contributors_url")
    @Expose
    private String contributors_url;
    @SerializedName("subscribers_url")
    @Expose
    private String subscribers_url;
    @SerializedName("subscription_url")
    @Expose
    private String subscription_url;
    @SerializedName("commits_url")
    @Expose
    private String commits_url;
    @SerializedName("git_commits_url")
    @Expose
    private String git_commits_url;
    @SerializedName("comments_url")
    @Expose
    private String comments_url;
    @SerializedName("issue_comment_url")
    @Expose
    private String issue_comment_url;
    @SerializedName("contents_url")
    @Expose
    private String contents_url;
    @SerializedName("compare_url")
    @Expose
    private String compare_url;
    @SerializedName("merges_url")
    @Expose
    private String merges_url;
    @SerializedName("archive_url")
    @Expose
    private String archive_url;
    @SerializedName("downloads_url")
    @Expose
    private String downloads_url;
    @SerializedName("issues_url")
    @Expose
    private String issues_url;
    @SerializedName("pulls_url")
    @Expose
    private String pulls_url;
    @SerializedName("milestones_url")
    @Expose
    private String milestones_url;
    @SerializedName("notifications_url")
    @Expose
    private String notifications_url;
    @SerializedName("labels_url")
    @Expose
    private String labels_url;
    @SerializedName("releases_url")
    @Expose
    private String releases_url;
    @SerializedName("deployments_url")
    @Expose
    private String deployments_url;
    @SerializedName("created_at")
    @Expose
    private String created_at;
    @SerializedName("updated_at")
    @Expose
    private String updated_at;
    @SerializedName("pushed_at")
    @Expose
    private String pushed_at;
    @SerializedName("git_url")
    @Expose
    private String git_url;
    @SerializedName("ssh_url")
    @Expose
    private String ssh_url;
    @SerializedName("clone_url")
    @Expose
    private String clone_url;
    @SerializedName("svn_url")
    @Expose
    private String svn_url;
    @SerializedName("homepage")
    @Expose
    private String homepage;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("stargazers_count")
    @Expose
    private Integer stargazers_count;
    @SerializedName("watchers_count")
    @Expose
    private Integer watchers_count;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("has_issues")
    @Expose
    private Boolean has_issues;
    @SerializedName("has_projects")
    @Expose
    private Boolean has_projects;
    @SerializedName("has_downloads")
    @Expose
    private Boolean has_downloads;
    @SerializedName("has_wiki")
    @Expose
    private Boolean has_wiki;
    @SerializedName("has_pages")
    @Expose
    private Boolean has_pages;
    @SerializedName("forks_count")
    @Expose
    private Integer forks_count;
    @SerializedName("mirror_url")
    @Expose
    private Object mirror_url;
    @SerializedName("archived")
    @Expose
    private Boolean archived;
    @SerializedName("open_issues_count")
    @Expose
    private Integer open_issues_count;
    @SerializedName("license")
    @Expose
    private License license;
    @SerializedName("forks")
    @Expose
    private Integer forks;
    @SerializedName("open_issues")
    @Expose
    private Integer open_issues;
    @SerializedName("watchers")
    @Expose
    private Integer watchers;
    @SerializedName("default_branch")
    @Expose
    private String default_branch;

    /**
     * No args constructor for use in serialization
     */
    public GithubResponse() {
    }

    /**
     * @param has_issues
     * @param teams_url
     * @param compare_url
     * @param releases_url
     * @param keys_url
     * @param has_pages
     * @param _private
     * @param description
     * @param milestones_url
     * @param has_wiki
     * @param events_url
     * @param archive_url
     * @param subscribers_url
     * @param contributors_url
     * @param pushed_at
     * @param fork
     * @param svn_url
     * @param collaborators_url
     * @param subscription_url
     * @param clone_url
     * @param trees_url
     * @param homepage
     * @param url
     * @param size
     * @param notifications_url
     * @param deployments_url
     * @param updated_at
     * @param branches_url
     * @param owner
     * @param issue_events_url
     * @param language
     * @param forks_count
     * @param contents_url
     * @param watchers_count
     * @param blobs_url
     * @param commits_url
     * @param has_downloads
     * @param git_commits_url
     * @param node_id
     * @param default_branch
     * @param open_issues
     * @param id
     * @param downloads_url
     * @param mirror_url
     * @param has_projects
     * @param archived
     * @param comments_url
     * @param name
     * @param created_at
     * @param stargazers_count
     * @param assignees_url
     * @param license
     * @param pulls_url
     * @param watchers
     * @param stargazers_url
     * @param hooks_url
     * @param languages_url
     * @param issues_url
     * @param git_tags_url
     * @param merges_url
     * @param git_refs_url
     * @param open_issues_count
     * @param ssh_url
     * @param html_url
     * @param forks
     * @param forks_url
     * @param statuses_url
     * @param issue_comment_url
     * @param labels_url
     * @param git_url
     * @param tags_url
     * @param full_name
     */
    public GithubResponse(Integer id, String node_id, String name, String full_name, Owner owner, Boolean _private, String html_url, String description, Boolean fork, String url, String forks_url, String keys_url, String collaborators_url, String teams_url, String hooks_url, String issue_events_url, String events_url, String assignees_url, String branches_url, String tags_url, String blobs_url, String git_tags_url, String git_refs_url, String trees_url, String statuses_url, String languages_url, String stargazers_url, String contributors_url, String subscribers_url, String subscription_url, String commits_url, String git_commits_url, String comments_url, String issue_comment_url, String contents_url, String compare_url, String merges_url, String archive_url, String downloads_url, String issues_url, String pulls_url, String milestones_url, String notifications_url, String labels_url, String releases_url, String deployments_url, String created_at, String updated_at, String pushed_at, String git_url, String ssh_url, String clone_url, String svn_url, String homepage, Integer size, Integer stargazers_count, Integer watchers_count, String language, Boolean has_issues, Boolean has_projects, Boolean has_downloads, Boolean has_wiki, Boolean has_pages, Integer forks_count, Object mirror_url, Boolean archived, Integer open_issues_count, License license, Integer forks, Integer open_issues, Integer watchers, String default_branch) {
        super();
        this.id = id;
        this.node_id = node_id;
        this.name = name;
        this.full_name = full_name;
        this.owner = owner;
        this._private = _private;
        this.html_url = html_url;
        this.description = description;
        this.fork = fork;
        this.url = url;
        this.forks_url = forks_url;
        this.keys_url = keys_url;
        this.collaborators_url = collaborators_url;
        this.teams_url = teams_url;
        this.hooks_url = hooks_url;
        this.issue_events_url = issue_events_url;
        this.events_url = events_url;
        this.assignees_url = assignees_url;
        this.branches_url = branches_url;
        this.tags_url = tags_url;
        this.blobs_url = blobs_url;
        this.git_tags_url = git_tags_url;
        this.git_refs_url = git_refs_url;
        this.trees_url = trees_url;
        this.statuses_url = statuses_url;
        this.languages_url = languages_url;
        this.stargazers_url = stargazers_url;
        this.contributors_url = contributors_url;
        this.subscribers_url = subscribers_url;
        this.subscription_url = subscription_url;
        this.commits_url = commits_url;
        this.git_commits_url = git_commits_url;
        this.comments_url = comments_url;
        this.issue_comment_url = issue_comment_url;
        this.contents_url = contents_url;
        this.compare_url = compare_url;
        this.merges_url = merges_url;
        this.archive_url = archive_url;
        this.downloads_url = downloads_url;
        this.issues_url = issues_url;
        this.pulls_url = pulls_url;
        this.milestones_url = milestones_url;
        this.notifications_url = notifications_url;
        this.labels_url = labels_url;
        this.releases_url = releases_url;
        this.deployments_url = deployments_url;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.pushed_at = pushed_at;
        this.git_url = git_url;
        this.ssh_url = ssh_url;
        this.clone_url = clone_url;
        this.svn_url = svn_url;
        this.homepage = homepage;
        this.size = size;
        this.stargazers_count = stargazers_count;
        this.watchers_count = watchers_count;
        this.language = language;
        this.has_issues = has_issues;
        this.has_projects = has_projects;
        this.has_downloads = has_downloads;
        this.has_wiki = has_wiki;
        this.has_pages = has_pages;
        this.forks_count = forks_count;
        this.mirror_url = mirror_url;
        this.archived = archived;
        this.open_issues_count = open_issues_count;
        this.license = license;
        this.forks = forks;
        this.open_issues = open_issues;
        this.watchers = watchers;
        this.default_branch = default_branch;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getForks_url() {
        return forks_url;
    }

    public void setForks_url(String forks_url) {
        this.forks_url = forks_url;
    }

    public String getKeys_url() {
        return keys_url;
    }

    public void setKeys_url(String keys_url) {
        this.keys_url = keys_url;
    }

    public String getCollaborators_url() {
        return collaborators_url;
    }

    public void setCollaborators_url(String collaborators_url) {
        this.collaborators_url = collaborators_url;
    }

    public String getTeams_url() {
        return teams_url;
    }

    public void setTeams_url(String teams_url) {
        this.teams_url = teams_url;
    }

    public String getHooks_url() {
        return hooks_url;
    }

    public void setHooks_url(String hooks_url) {
        this.hooks_url = hooks_url;
    }

    public String getIssue_events_url() {
        return issue_events_url;
    }

    public void setIssue_events_url(String issue_events_url) {
        this.issue_events_url = issue_events_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getAssignees_url() {
        return assignees_url;
    }

    public void setAssignees_url(String assignees_url) {
        this.assignees_url = assignees_url;
    }

    public String getBranches_url() {
        return branches_url;
    }

    public void setBranches_url(String branches_url) {
        this.branches_url = branches_url;
    }

    public String getTags_url() {
        return tags_url;
    }

    public void setTags_url(String tags_url) {
        this.tags_url = tags_url;
    }

    public String getBlobs_url() {
        return blobs_url;
    }

    public void setBlobs_url(String blobs_url) {
        this.blobs_url = blobs_url;
    }

    public String getGit_tags_url() {
        return git_tags_url;
    }

    public void setGit_tags_url(String git_tags_url) {
        this.git_tags_url = git_tags_url;
    }

    public String getGit_refs_url() {
        return git_refs_url;
    }

    public void setGit_refs_url(String git_refs_url) {
        this.git_refs_url = git_refs_url;
    }

    public String getTrees_url() {
        return trees_url;
    }

    public void setTrees_url(String trees_url) {
        this.trees_url = trees_url;
    }

    public String getStatuses_url() {
        return statuses_url;
    }

    public void setStatuses_url(String statuses_url) {
        this.statuses_url = statuses_url;
    }

    public String getLanguages_url() {
        return languages_url;
    }

    public void setLanguages_url(String languages_url) {
        this.languages_url = languages_url;
    }

    public String getStargazers_url() {
        return stargazers_url;
    }

    public void setStargazers_url(String stargazers_url) {
        this.stargazers_url = stargazers_url;
    }

    public String getContributors_url() {
        return contributors_url;
    }

    public void setContributors_url(String contributors_url) {
        this.contributors_url = contributors_url;
    }

    public String getSubscribers_url() {
        return subscribers_url;
    }

    public void setSubscribers_url(String subscribers_url) {
        this.subscribers_url = subscribers_url;
    }

    public String getSubscription_url() {
        return subscription_url;
    }

    public void setSubscription_url(String subscription_url) {
        this.subscription_url = subscription_url;
    }

    public String getCommits_url() {
        return commits_url;
    }

    public void setCommits_url(String commits_url) {
        this.commits_url = commits_url;
    }

    public String getGit_commits_url() {
        return git_commits_url;
    }

    public void setGit_commits_url(String git_commits_url) {
        this.git_commits_url = git_commits_url;
    }

    public String getComments_url() {
        return comments_url;
    }

    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    public String getIssue_comment_url() {
        return issue_comment_url;
    }

    public void setIssue_comment_url(String issue_comment_url) {
        this.issue_comment_url = issue_comment_url;
    }

    public String getContents_url() {
        return contents_url;
    }

    public void setContents_url(String contents_url) {
        this.contents_url = contents_url;
    }

    public String getCompare_url() {
        return compare_url;
    }

    public void setCompare_url(String compare_url) {
        this.compare_url = compare_url;
    }

    public String getMerges_url() {
        return merges_url;
    }

    public void setMerges_url(String merges_url) {
        this.merges_url = merges_url;
    }

    public String getArchive_url() {
        return archive_url;
    }

    public void setArchive_url(String archive_url) {
        this.archive_url = archive_url;
    }

    public String getDownloads_url() {
        return downloads_url;
    }

    public void setDownloads_url(String downloads_url) {
        this.downloads_url = downloads_url;
    }

    public String getIssues_url() {
        return issues_url;
    }

    public void setIssues_url(String issues_url) {
        this.issues_url = issues_url;
    }

    public String getPulls_url() {
        return pulls_url;
    }

    public void setPulls_url(String pulls_url) {
        this.pulls_url = pulls_url;
    }

    public String getMilestones_url() {
        return milestones_url;
    }

    public void setMilestones_url(String milestones_url) {
        this.milestones_url = milestones_url;
    }

    public String getNotifications_url() {
        return notifications_url;
    }

    public void setNotifications_url(String notifications_url) {
        this.notifications_url = notifications_url;
    }

    public String getLabels_url() {
        return labels_url;
    }

    public void setLabels_url(String labels_url) {
        this.labels_url = labels_url;
    }

    public String getReleases_url() {
        return releases_url;
    }

    public void setReleases_url(String releases_url) {
        this.releases_url = releases_url;
    }

    public String getDeployments_url() {
        return deployments_url;
    }

    public void setDeployments_url(String deployments_url) {
        this.deployments_url = deployments_url;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getPushed_at() {
        return pushed_at;
    }

    public void setPushed_at(String pushed_at) {
        this.pushed_at = pushed_at;
    }

    public String getGit_url() {
        return git_url;
    }

    public void setGit_url(String git_url) {
        this.git_url = git_url;
    }

    public String getSsh_url() {
        return ssh_url;
    }

    public void setSsh_url(String ssh_url) {
        this.ssh_url = ssh_url;
    }

    public String getClone_url() {
        return clone_url;
    }

    public void setClone_url(String clone_url) {
        this.clone_url = clone_url;
    }

    public String getSvn_url() {
        return svn_url;
    }

    public void setSvn_url(String svn_url) {
        this.svn_url = svn_url;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getStargazers_count() {
        return stargazers_count;
    }

    public void setStargazers_count(Integer stargazers_count) {
        this.stargazers_count = stargazers_count;
    }

    public Integer getWatchers_count() {
        return watchers_count;
    }

    public void setWatchers_count(Integer watchers_count) {
        this.watchers_count = watchers_count;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getHas_issues() {
        return has_issues;
    }

    public void setHas_issues(Boolean has_issues) {
        this.has_issues = has_issues;
    }

    public Boolean getHas_projects() {
        return has_projects;
    }

    public void setHas_projects(Boolean has_projects) {
        this.has_projects = has_projects;
    }

    public Boolean getHas_downloads() {
        return has_downloads;
    }

    public void setHas_downloads(Boolean has_downloads) {
        this.has_downloads = has_downloads;
    }

    public Boolean getHas_wiki() {
        return has_wiki;
    }

    public void setHas_wiki(Boolean has_wiki) {
        this.has_wiki = has_wiki;
    }

    public Boolean getHas_pages() {
        return has_pages;
    }

    public void setHas_pages(Boolean has_pages) {
        this.has_pages = has_pages;
    }

    public Integer getForks_count() {
        return forks_count;
    }

    public void setForks_count(Integer forks_count) {
        this.forks_count = forks_count;
    }

    public Object getMirror_url() {
        return mirror_url;
    }

    public void setMirror_url(Object mirror_url) {
        this.mirror_url = mirror_url;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Integer getOpen_issues_count() {
        return open_issues_count;
    }

    public void setOpen_issues_count(Integer open_issues_count) {
        this.open_issues_count = open_issues_count;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public Integer getForks() {
        return forks;
    }

    public void setForks(Integer forks) {
        this.forks = forks;
    }

    public Integer getOpen_issues() {
        return open_issues;
    }

    public void setOpen_issues(Integer open_issues) {
        this.open_issues = open_issues;
    }

    public Integer getWatchers() {
        return watchers;
    }

    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    public String getDefault_branch() {
        return default_branch;
    }

    public void setDefault_branch(String default_branch) {
        this.default_branch = default_branch;
    }


    public class License {

        @SerializedName("key")
        @Expose
        private String key;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("spdx_id")
        @Expose
        private String spdx_id;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("node_id")
        @Expose
        private String node_id;

        /**
         * No args constructor for use in serialization
         */
        public License() {
        }

        /**
         * @param spdx_id
         * @param name
         * @param url
         * @param key
         * @param node_id
         */
        public License(String key, String name, String spdx_id, String url, String node_id) {
            super();
            this.key = key;
            this.name = name;
            this.spdx_id = spdx_id;
            this.url = url;
            this.node_id = node_id;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSpdx_id() {
            return spdx_id;
        }

        public void setSpdx_id(String spdx_id) {
            this.spdx_id = spdx_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

    }


    public class Owner {

        @SerializedName("login")
        @Expose
        private String login;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("node_id")
        @Expose
        private String node_id;
        @SerializedName("avatar_url")
        @Expose
        private String avatar_url;
        @SerializedName("gravatar_id")
        @Expose
        private String gravatar_id;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("html_url")
        @Expose
        private String html_url;
        @SerializedName("followers_url")
        @Expose
        private String followers_url;
        @SerializedName("following_url")
        @Expose
        private String following_url;
        @SerializedName("gists_url")
        @Expose
        private String gists_url;
        @SerializedName("starred_url")
        @Expose
        private String starred_url;
        @SerializedName("subscriptions_url")
        @Expose
        private String subscriptions_url;
        @SerializedName("organizations_url")
        @Expose
        private String organizations_url;
        @SerializedName("repos_url")
        @Expose
        private String repos_url;
        @SerializedName("events_url")
        @Expose
        private String events_url;
        @SerializedName("received_events_url")
        @Expose
        private String received_events_url;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("site_admin")
        @Expose
        private Boolean site_admin;

        /**
         * No args constructor for use in serialization
         */
        public Owner() {
        }

        /**
         * @param received_events_url
         * @param organizations_url
         * @param avatar_url
         * @param gravatar_id
         * @param gists_url
         * @param starred_url
         * @param site_admin
         * @param type
         * @param url
         * @param node_id
         * @param id
         * @param html_url
         * @param following_url
         * @param events_url
         * @param login
         * @param subscriptions_url
         * @param repos_url
         * @param followers_url
         */
        public Owner(String login, Integer id, String node_id, String avatar_url, String gravatar_id, String url, String html_url, String followers_url, String following_url, String gists_url, String starred_url, String subscriptions_url, String organizations_url, String repos_url, String events_url, String received_events_url, String type, Boolean site_admin) {
            super();
            this.login = login;
            this.id = id;
            this.node_id = node_id;
            this.avatar_url = avatar_url;
            this.gravatar_id = gravatar_id;
            this.url = url;
            this.html_url = html_url;
            this.followers_url = followers_url;
            this.following_url = following_url;
            this.gists_url = gists_url;
            this.starred_url = starred_url;
            this.subscriptions_url = subscriptions_url;
            this.organizations_url = organizations_url;
            this.repos_url = repos_url;
            this.events_url = events_url;
            this.received_events_url = received_events_url;
            this.type = type;
            this.site_admin = site_admin;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getGravatar_id() {
            return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
            this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getFollowers_url() {
            return followers_url;
        }

        public void setFollowers_url(String followers_url) {
            this.followers_url = followers_url;
        }

        public String getFollowing_url() {
            return following_url;
        }

        public void setFollowing_url(String following_url) {
            this.following_url = following_url;
        }

        public String getGists_url() {
            return gists_url;
        }

        public void setGists_url(String gists_url) {
            this.gists_url = gists_url;
        }

        public String getStarred_url() {
            return starred_url;
        }

        public void setStarred_url(String starred_url) {
            this.starred_url = starred_url;
        }

        public String getSubscriptions_url() {
            return subscriptions_url;
        }

        public void setSubscriptions_url(String subscriptions_url) {
            this.subscriptions_url = subscriptions_url;
        }

        public String getOrganizations_url() {
            return organizations_url;
        }

        public void setOrganizations_url(String organizations_url) {
            this.organizations_url = organizations_url;
        }

        public String getRepos_url() {
            return repos_url;
        }

        public void setRepos_url(String repos_url) {
            this.repos_url = repos_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getReceived_events_url() {
            return received_events_url;
        }

        public void setReceived_events_url(String received_events_url) {
            this.received_events_url = received_events_url;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getSite_admin() {
            return site_admin;
        }

        public void setSite_admin(Boolean site_admin) {
            this.site_admin = site_admin;
        }

    }


}