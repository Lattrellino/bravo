package edu.dlsu.mobapde.firebasebravo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import edu.dlsu.mobapde.labfirebaseposts2.R;

public class ViewPostActivity extends AppCompatActivity {

    TextView tvPost, tvUsername;
    Button buttonEdit, buttonDelete;

    DatabaseReference curPostRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_post);

        String key = getIntent().getExtras().getString("key");

        curPostRef = FirebaseDatabase.getInstance().getReference().child("posts").child(key);


        tvPost = (TextView) findViewById(R.id.tv_post);
        tvUsername = (TextView) findViewById(R.id.tv_username);
        buttonEdit = (Button) findViewById(R.id.button_edit);
        buttonDelete = (Button) findViewById(R.id.button_delete);

        curPostRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Post p = dataSnapshot.getValue(Post.class);
                tvPost.setText(p.getPost());
                tvUsername.setText(p.getUsername());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curPostRef.setValue(null);
            }
        });
    }
}
