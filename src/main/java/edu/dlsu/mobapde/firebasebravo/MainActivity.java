package edu.dlsu.mobapde.firebasebravo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;

import edu.dlsu.mobapde.labfirebaseposts2.R;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvPosts;
    EditText etUsername, etPost;
    Button buttonPost;

    DatabaseReference postsRef;
    FirebaseRecyclerAdapter<Post, PostViewHolder> firebaseRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPosts = (RecyclerView) findViewById(R.id.rv_posts);
        etPost = (EditText) findViewById(R.id.et_post);
        etUsername = (EditText) findViewById(R.id.et_username);
        buttonPost = (Button) findViewById(R.id.button_post);

        postsRef =;

        firebaseRecyclerAdapter
                = new FirebaseRecyclerAdapter<Post, PostViewHolder>(
                Post.class, R.layout.list_post,
                PostViewHolder.class, postsRef
        ) {
            @Override
            protected void populateViewHolder(PostViewHolder viewHolder,
                                              Post model, int position) {
                // onBindViewHolder

            }
        };

        buttonPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
