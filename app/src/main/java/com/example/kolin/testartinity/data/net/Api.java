package com.example.kolin.testartinity.data.net;

import com.example.kolin.testartinity.domain.model.RequestID;
import com.example.kolin.testartinity.domain.model.Statement;

import java.util.List;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by kolin on 26.10.2016.
 */

public interface Api {

    @POST("api/service")
    Observable<List<Statement>> getListStatements(@Query("ApiKey") String apiKey,
                                                  @Query("Login") String login,
                                                  @Query("Password") String password,
                                                  @Query("ObjectCode") String objectCode,
                                                  @Query("Action") String action,
                                                  @Query(value = "Fields%5BFilterID%5D",encoded = true) String field);

    @POST("api/service")
    Observable<RequestID> getInfo(@Query("ApiKey") String apiKey,
                                  @Query("Login") String login,
                                  @Query("Password") String password,
                                  @Query("ObjectCode") String objectCode,
                                  @Query("Action") String action,
                                  @Query(value = "Fields%5BRequestID%5D",encoded = true) String field);

}
