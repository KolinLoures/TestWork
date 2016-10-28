package com.example.kolin.testartinity.domain.interactor;

import com.example.kolin.testartinity.data.RepositoryImpl;
import com.example.kolin.testartinity.domain.Repository;
import com.example.kolin.testartinity.domain.usecases.NetUseCase;

import rx.Observable;

/**
 * Created by kolin on 27.10.2016.
 */

public class GetDetailInfoUC extends NetUseCase {

    private Repository repository;
    private String requestID;

    public GetDetailInfoUC() {
        repository = new RepositoryImpl();
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return requestID == null ? null : repository.getDetailInfo(requestID);
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }
}
