package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.gesture.GestureLibraries;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.bumptech.glide.Glide;

public class BadgesActivity extends AppCompatActivity {

    ImageView pri;
    ImageView seg;
    ImageView ter;
    ImageView cuart;
    ImageView quint;
    ImageView sext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badges);

        pri = findViewById(R.id.pri);
        seg = findViewById(R.id.sec);
        ter = findViewById(R.id.terc);
        cuart = findViewById(R.id.cuart);
        quint = findViewById(R.id.quint);
        sext = findViewById(R.id.sext);
        context = getApplicationContext();
        getInsignias();


    }
    public static Context context;

    public void getInsignias(){
        Call<List<Badge>> call = ApiClient.getUserService().getBadges();
        call.enqueue(new Callback<List<Badge>>() {
            @Override
            public void onResponse(Call<List<Badge>> call, Response<List<Badge>> response) {
                if(response.code()==201) {
                    List<Badge> badges = response.body();
                    Badge badge = badges.get(0);
                    String url = badge.url;
                    Log.i("hola", badge.url);
                    Glide.with(context).load(badge.url).into(pri);
                    Badge badge1 = badges.get(1);
                    Log.i("hola", badge1.url);
                    Glide.with(context).load(badge1.url).into(seg);
                    Badge badge2 = badges.get(2);
                    Log.i("hola", badge2.url);
                    Glide.with(context).load(badge2.url).into(ter);
                    Badge badge3 = badges.get(3);
                    Log.i("hola", badge3.url);
                    Glide.with(context).load(badge3.url).into(cuart);
                    Badge badge4 = badges.get(4);
                    Log.i("hola", badge4.url);
                    Glide.with(context).load(badge4.url).into(quint);
                    Badge badge5 = badges.get(5);
                    Log.i("hola", badge5.url);
                    Glide.with(context).load(badge5.url).into(sext);


                }

            }

            @Override
            public void onFailure(Call<List<Badge>> call, Throwable t) {

            }
        });
    }
}