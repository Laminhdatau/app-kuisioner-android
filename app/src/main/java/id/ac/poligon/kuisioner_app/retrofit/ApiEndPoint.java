package id.ac.poligon.kuisioner_app.retrofit;

import id.ac.poligon.kuisioner_app.Model.MainModel;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiEndPoint {
    @GET("kuesioner/")
    Call<MainModel> getKuesioner();

    @FormUrlEncoded
    @POST("kuesioner/")
    Call<MainModel> createKuesioner(
            @Field("quisioner") String quisioner,
            @Field("id_jenis_quisioner") String id_jenis_kuisioner
    );
}
