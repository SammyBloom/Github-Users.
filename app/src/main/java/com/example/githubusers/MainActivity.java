package com.example.githubusers;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Users> userArrayList = new ArrayList<>();
    private GitHubUsersAdapter gitHubUsersAdapter;
    private LinearLayoutManager linearLayoutManager;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Just a sec...");
        progressDialog.show();
        recyclerView = findViewById(R.id.recycler);
        gitHubUsersAdapter = new GitHubUsersAdapter(userArrayList);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(gitHubUsersAdapter);

        ApiInterface apiInterface = RetrofitInstance.getRetrofitInstance().create(ApiInterface.class);
apiInterface.allUsers().enqueue(new Callback<ArrayList<Users>>() {
    @Override
    public void onResponse(Call<ArrayList<Users>> call, Response<ArrayList<Users>> response) {
        progressDialog.dismiss();
        generateUserList(response.body());
    }

    @Override
    public void onFailure(Call<ArrayList<Users>> call, Throwable t) {

    }
});
    }

    private void generateUserList(ArrayList<Users> userArrayList) {
        recyclerView = findViewById(R.id.recycler);
        gitHubUsersAdapter = new GitHubUsersAdapter(userArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(gitHubUsersAdapter);
    }
}