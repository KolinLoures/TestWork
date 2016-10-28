package com.example.kolin.testartinity.data.net;

import com.example.kolin.testartinity.domain.model.RequestID;
import com.example.kolin.testartinity.domain.model.Statement;

import java.util.List;

import rx.Observable;

/**
 * Created by kolin on 26.10.2016.
 */

public class Rest {

    private static final String apiKey = "e8e6a311d54985a067ece5a008da280a";
    private static final String login = "d_blinov";
    private static final String password = "Passw0rd";
    private static final String objectCode = "300";

    private static final String actionGetList = "GET_LIST";
    private static final String actionGetInfo = "GET_INFO";

    private static final String fieldsFilter = "3CD0E650-4B81-E511-A39A-1CC1DEAD694D";


    private Api api;

    public Rest() {
        this.api = RetrofitSingleton.getInstanse().create(Api.class);
    }

    public Observable<List<Statement>> getListStatement(){
        return api.getListStatements(apiKey, login, password, objectCode, actionGetList, fieldsFilter);
    }

    public Observable<RequestID> getListInfo(String requestId){
        return api.getInfo(apiKey, login, password, objectCode, actionGetInfo, requestId);
    }

}

