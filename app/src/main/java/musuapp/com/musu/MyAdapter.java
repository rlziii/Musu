package musuapp.com.musu;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.*;

import java.util.List;


/**
 * Provide views to RecyclerView with data from mDataSet.

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ContactViewHolder> {

    private List<Post> postList;

    public MyAdapter( RecyclerView recyclerView, FragmentActivity fragment, List<Post> posts)
    {
        RecyclerView.LayoutManager rvlm;
        rvlm = new LinearLayoutManager(fragment);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(rvlm);

        this.postList = posts;

        recyclerView.setAdapter(this);

    }
    public void addPost(Post newPost)
    {
        this.postList.add(newPost);
    }
    @Override
    public int getItemCount() {
        return postList.size();
    }

    @Override
    public void onBindViewHolder(ContactViewHolder contactViewHolder, int i) {
        Post post = postList.get(i);
        contactViewHolder.postDetail.setText(post.getBodyText());
        contactViewHolder.author.setText(post.getUserName());
        contactViewHolder.like.setChecked(false);
        Picasso.with(contactViewHolder.context).load(post.getImageURL()).into(contactViewHolder.img);
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View itemView = LayoutInflater.
                    from(viewGroup.getContext()).
                    inflate(R.layout.personal_cardview, viewGroup, false);

            return new ContactViewHolder(itemView);
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        protected TextView postDetail;
        protected TextView author;
        protected ImageView img;
        protected Context context;
        protected CheckBox like;

        public ContactViewHolder(View v) {
            super(v);
            context = v.getContext();
            postDetail =  (TextView) v.findViewById(R.id.post_text);
            author = (TextView) v.findViewById(R.id.user_name);
            img = (ImageView) v.findViewById(R.id.post_pic);
            like =  (CheckBox) v.findViewById(R.id.like);

        }
    }
}
*/