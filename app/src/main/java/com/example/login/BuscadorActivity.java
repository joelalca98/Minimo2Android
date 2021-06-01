package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BuscadorActivity extends AppCompatActivity {

TextView correo;
TextView apodo;
TextView nombre;
TextView apellido;
ImageView insignia;


EditText apodoBuscador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscador);

        correo=findViewById(R.id.correoResultado);
        apodo=findViewById(R.id.apodoResultado);
        nombre=findViewById(R.id.nombreResultado);
        apellido=findViewById(R.id.apellidoRes);

        apodoBuscador=findViewById(R.id.apodoBuscador);
        insignia=findViewById(R.id.insigniaUser);
        context = getApplicationContext();

    }

    public static Context context;




    public void Buscador (View view){
        Call<Usuario> call = ApiClient.getUserService().getUsuario(apodoBuscador.getText().toString());

        call.enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                if(response.code()==201){

                    correo.setText(response.body().getCorreo());
                    apodo.setText(response.body().getApodo());
                    nombre.setText(response.body().getNombre());
                    apellido.setText(response.body().getApellido());
                    Glide.with(context).load(response.body().avatar).into(insignia);

                }
            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {

            }
        });
    }
}