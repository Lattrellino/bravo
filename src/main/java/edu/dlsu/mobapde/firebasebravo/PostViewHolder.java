package edu.dlsu.mobapde.firebasebravo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import edu.dlsu.mobapde.labfirebaseposts2.R;

/**
 * Created by courtneyngo on 20/11/2017.
 */

public class PostViewHolder extends RecyclerView.ViewHolder {

    TextView tvPost;
    TextView tvUsername;

    public PostViewHolder(View itemView) {
        super(itemView);
        tvPost = (TextView) itemView.findViewById(R.id.tv_post);
        tvUsername = (TextView) itemView.findViewById(R.id.tv_username);
    }


}
