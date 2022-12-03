package id.ac.poligon.kuisioner_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.awt.font.NumericShaper;
import java.util.List;

import id.ac.poligon.kuisioner_app.Model.MainModel;
import id.ac.poligon.kuisioner_app.retrofit.ApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDataFromApi();
    }
    private void getDataFromApi(){
        ApiService.endPoint().getKuesioner()
                .enqueue(new Callback<MainModel>() {
                    @Override
                    public void onResponse(Call<MainModel> call, Response<MainModel> response) {
                        if(response.isSuccessful()){
                            List<MainModel.DataKuis> dataKuis = response.body().getData();
                            Log.d(TAG, dataKuis.toString());
                        }
                    }

                    @Override
                    public void onFailure(Call<MainModel> call, Throwable t) {
                        Log.d(TAG, t.toString());
                    }
                });
    }
}