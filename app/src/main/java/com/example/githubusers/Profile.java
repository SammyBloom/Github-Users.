package com.example.githubusers;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Profile extends AppCompatActivity {
    TextView name, updatedAt, createdAt, location, email,
            followers, following, company, hireable, bio;
    CircleImageView circleImageView;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Just a sec...");
        progressDialog.show();
        String login = getIntent().getStringExtra("login");
        name = findViewById(R.id.name);
        hireable = findViewById(R.id.hireable);
        company = findViewById(R.id.company);
        updatedAt = findViewById(R.id.updated_at);
        followers = findViewById(R.id.followers);
        following = findViewById(R.id.following);
        bio = findViewById(R.id.bio);
        createdAt = findViewById(R.id.created_at);
        location = findViewById(R.id.location);
        circleImageView = findViewById(R.id.avatar);

        ApiInterface service = RetrofitInstance.getRetrofitInstance().create(ApiInterface.class);
        service.aUser(login).enqueue(new Callback<Users>() {
            @Override
            public void onResponse(Call<Users> call, Response<Users> response) {
                progressDialog.dismiss();
                name.setText(Objects.requireNonNull(response.body()).getName());
                hireable.setText(response.body().getHireable());
                company.setText(response.body().getCompany());
                createdAt.setText(response.body().getCreated_at());
                updatedAt.setText(response.body().getUpdated_at());
                followers.setText(String.valueOf(response.body().getFollowers()));
                following.setText(String.valueOf(response.body().getFollowing()));
                location.setText(response.body().getLocation());
                bio.setText(response.body().getBio());
                Picasso.get()
                        .load(response.body().getAvatar_url())
                        .into(circleImageView);
            }

            @Override
            public void onFailure(Call<Users> call, Throwable t) {

            }
        });
    }
}
