package com.example.githubusers;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

class Users {
    @SerializedName("login")
    private String login;
    @SerializedName("avatar_url")
    private String avatar_url;
    private ArrayList<Users> usersArrayList;
    @SerializedName("organizations_url")
    private String organizations_url;
    @SerializedName("repos_url")
    private String repos_url;
    @SerializedName("events_url")
    private String events_url;
    @SerializedName("received_events_url")
    private String received_events_url;
    @SerializedName("type")
    private String type;
    @SerializedName("name")
    private String name;
    @SerializedName("company")
    private String company;
    @SerializedName("blog")
    private String blog;
    @SerializedName("location")
    private String location;
    @SerializedName("email")
    private String email = null;
    @SerializedName("hireable")
    private String hireable = null;
    @SerializedName("bio")
    private String bio = null;
    @SerializedName("public_repos")
    private float public_repos;
    @SerializedName("public_gists")
    private float public_gists;
    @SerializedName("followers")
    private int followers;
    @SerializedName("following")
    private int following;
    @SerializedName("created_at")
    private String created_at;
    @SerializedName("updated_at")
    private String updated_at;
@SerializedName("id")
private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
// Getter Methods


    public Users() {

    }

    public String getOrganizations_url() {
        return organizations_url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public String getReceived_events_url() {
        return received_events_url;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getBlog() {
        return blog;
    }

    public String getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public String getHireable() {
        return hireable;
    }

    public String getBio() {
        return bio;
    }

    public float getPublic_repos() {
        return public_repos;
    }

    public float getPublic_gists() {
        return public_gists;
    }

    public int getFollowers() {
        return followers;
    }

    public int getFollowing() {
        return following;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    // Setter Methods

    public void setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHireable(String hireable) {
        this.hireable = hireable;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setPublic_repos(float public_repos) {
        this.public_repos = public_repos;
    }

    public void setPublic_gists(float public_gists) {
        this.public_gists = public_gists;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public ArrayList<Users> getUsersArrayList() {
        return usersArrayList;
    }

    public void setUsersArrayList(ArrayList<Users> usersArrayList) {
        this.usersArrayList = usersArrayList;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
