package com.example.kolin.testartinity.presentation.screeninfo.fragment;

import android.util.Log;

import com.example.kolin.testartinity.domain.interactor.GetDetailInfoUC;
import com.example.kolin.testartinity.domain.model.Request;
import com.example.kolin.testartinity.presentation.common.AbstractPresenter;

import rx.Subscriber;

/**
 * Created by kolin on 27.10.2016.
 */

public class InfoPresenter extends AbstractPresenter<InfoView> {

    private final static String TAG = InfoPresenter.class.getSimpleName();

    private GetDetailInfoUC getDetailInfoUC;
    private Request loadedRequest;

    public InfoPresenter() {
        getDetailInfoUC = new GetDetailInfoUC();
    }

    public void loadData(String requestID){
        if (!isViewAttach()){
            Log.e(TAG, "View is detach");
        }

        getWeakReference().showProgressBar(true);

        getDetailInfoUC.setRequestID(requestID);
        getDetailInfoUC.execute(new InfoSubscriber());
    }

    private final class InfoSubscriber extends Subscriber<Request>{

        @Override
        public void onCompleted() {
            Log.i(TAG, "Subscriber complete!");
            getWeakReference().showProgressBar(false);
        }

        @Override
        public void onError(Throwable e) {
            Log.e(TAG, e.toString());
        }

        @Override
        public void onNext(Request request) {
            showLoadedData(request);
        }
    }

    public void showLoadedData(Request request){
        setLoadedRequest(request);

        if (!isViewAttach()){
            Log.e(TAG, "View is detach");
        }

        getWeakReference().showLoadedData(request);
    }

    public Request getLoadedRequest() {
        return loadedRequest;
    }

    public void setLoadedRequest(Request loadedRequest) {
        this.loadedRequest = loadedRequest;
    }
}
