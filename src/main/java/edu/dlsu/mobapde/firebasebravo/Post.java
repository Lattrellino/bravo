package edu.dlsu.mobapde.firebasebravo;

/**
 * Created by courtneyngo on 20/11/2017.
 */

public class Post {

    private String username;
    private String post;


    public Post(String username, String post) {
        this.username = username;
        this.post = post;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

}
