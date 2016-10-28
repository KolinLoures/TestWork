package com.example.kolin.testartinity.domain.interactor;

import com.example.kolin.testartinity.data.RepositoryImpl;
import com.example.kolin.testartinity.domain.Repository;
import com.example.kolin.testartinity.domain.usecases.NetUseCase;

import rx.Observable;

/**
 * Created by kolin on 27.10.2016.
 */

public class GetListStatementUC extends NetUseCase {

    private Repository repository;

    public GetListStatementUC() {
        this.repository = new RepositoryImpl();
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return repository.getListStatements();
    }
}
