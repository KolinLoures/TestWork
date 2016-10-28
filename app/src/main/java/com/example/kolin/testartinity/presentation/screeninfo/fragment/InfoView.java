package com.example.kolin.testartinity.presentation.screeninfo.fragment;

import com.example.kolin.testartinity.domain.model.Request;

/**
 * Created by kolin on 27.10.2016.
 */

public interface InfoView {

    void showLoadedData(Request request);

    void showProgressBar(boolean value);
}
