package com.example.kolin.testartinity.presentation.screenlist.fragment;

import com.example.kolin.testartinity.domain.model.Statement;

import java.util.List;

/**
 * Created by kolin on 27.10.2016.
 */

public interface ListView {

    void showLoadedData(List<Statement> statementList);

    void openInfo(String requestID);
}
