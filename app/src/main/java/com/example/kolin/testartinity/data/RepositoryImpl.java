package com.example.kolin.testartinity.data;

import com.example.kolin.testartinity.data.net.Rest;
import com.example.kolin.testartinity.domain.Repository;
import com.example.kolin.testartinity.domain.model.Request;
import com.example.kolin.testartinity.domain.model.RequestID;
import com.example.kolin.testartinity.domain.model.Statement;

import java.util.List;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by kolin on 26.10.2016.
 */

public class RepositoryImpl implements Repository {

    private Rest rest;

    public RepositoryImpl() {
        this.rest = new Rest();
    }


    @Override
    public Observable<List<Statement>> getListStatements() {
        return rest.getListStatement();
    }

    @Override
    public Observable<Request> getDetailInfo(String requestID) {
        return rest.getListInfo(requestID).flatMap(new Func1<RequestID, Observable<Request>>() {
            @Override
            public Observable<Request> call(RequestID requestID) {
                Request request = requestID.getRequest();
                return Observable.just(request);
            }
        });
    }
}
