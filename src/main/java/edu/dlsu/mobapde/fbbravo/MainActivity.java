package edu.dlsu.mobapde.fbbravo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    RecyclerView rvPosts;
    EditText etPost;
    EditText etUsername;
    Button buttonPost;
    String key;

    DatabaseReference databaseReference;
    FirebaseRecyclerAdapter<Post, PostViewHolder>  postPostViewHolderFirevaseRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPosts = (RecyclerView) findViewById(R.id.rv_posts);
        etPost = (EditText) findViewById(R.id.et_post);
        etUsername = (EditText) findViewById(R.id.et_username);
        buttonPost = (Button) findViewById(R.id.button_post);

        databaseReference = FirebaseDatabase.getInstance().getReference();
        final DatabaseReference postDatabaseReference = databaseReference.child("posts");



        postPostViewHolderFirevaseRecyclerAdapter = new firebase

    }




}
