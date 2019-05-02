package com.example.githubusers;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class GitHubUsersAdapter extends RecyclerView.Adapter<GitHubUsersAdapter.GitHubUsersHolder> {
    private ArrayList<Users> usersArrayList;
    private Context context;

    public GitHubUsersAdapter(ArrayList<Users> usersArrayList) {
        this.usersArrayList = usersArrayList;
    }

    @NonNull
    @Override
    public GitHubUsersHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.person_item, viewGroup, false);

        return new GitHubUsersHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GitHubUsersHolder gitHubUsersHolder, int i) {
        gitHubUsersHolder.login.setText(usersArrayList.get(i).getLogin());
        final String login = usersArrayList.get(i).getLogin();

        Picasso.get()
                .load(usersArrayList.get(i).getAvatar_url())
                .into(gitHubUsersHolder.circleImageView);
        gitHubUsersHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(v.getContext(), Profile.class);
                intent.putExtra("login", login);
                v.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return usersArrayList == null ? 0 : usersArrayList.size();
    }

    public class GitHubUsersHolder extends RecyclerView.ViewHolder {
        TextView login;
CircleImageView circleImageView;
        public GitHubUsersHolder(@NonNull View itemView) {
            super(itemView);
            login = itemView.findViewById(R.id.login);
            circleImageView = itemView.findViewById(R.id.avatar);
        }

    }


}
