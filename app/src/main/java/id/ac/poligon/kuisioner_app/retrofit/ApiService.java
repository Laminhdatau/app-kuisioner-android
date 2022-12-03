package id.ac.poligon.kuisioner_app.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {
    private  static String BASE_URL="https://55cb-114-142-175-63.ap.ngrok.io/RestApiKuesioner/api/";
    private static Retrofit retrofit;
    public static ApiEndPoint endPoint(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(ApiEndPoint.class);
    }
}
