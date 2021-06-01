package com.example.login;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UserService {

    @POST("user/")
    Call<Usuario> Registro (@Body Usuario usuario);

    @GET("user/{apodo}")
    Call<Usuario> getUsuario (@Path("apodo") String apodo);

    @DELETE("user/{apodo}")
    Call<Void>  Eliminar (@Path("apodo") String apodo);

    @PUT("user/")
    Call<Void> Actualizar (@Body Usuario usuario);

    @POST("user/login")
    Call<Usuario> Login (@Body Usuario usuario);


    @GET("user/badges")
    Call<List<Badge>> getBadges();

}
