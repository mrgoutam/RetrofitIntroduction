package in.goutamstark.retrofitdemo.api;

import java.util.List;

import in.goutamstark.retrofitdemo.models.RetroPhoto;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
