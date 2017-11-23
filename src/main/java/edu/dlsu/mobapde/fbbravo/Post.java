package edu.dlsu.mobapde.fbbravo;

/**
 * Created by G301 on 23/11/2017.
 */

public class Post {
    private String uid;
    private String username;
    private String post;

    public Post(String username, String post){
        this.username = username;
        this.post = post;
    }

    public Post(String uid, String username, String post){
        this.uid=uid;
        this.username = username;
        this.post = post;
    }

    public String getPost() {
        return post;
    }

    public String getUid() {
        return uid;
    }

    public String getUsername() {
        return username;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // constructors

    // getters and setters
}