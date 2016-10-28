package com.example.kolin.testartinity.domain;

import com.example.kolin.testartinity.domain.model.Request;
import com.example.kolin.testartinity.domain.model.Statement;

import java.util.List;

import rx.Observable;

/**
 * Created by kolin on 26.10.2016.
 */

public interface Repository {

    Observable<List<Statement>> getListStatements();

    Observable<Request> getDetailInfo(String requestID);
}
