package com.example.kolin.testartinity.presentation.screenlist.fragment;

import android.util.Log;

import com.example.kolin.testartinity.domain.interactor.GetListStatementUC;
import com.example.kolin.testartinity.domain.model.Statement;
import com.example.kolin.testartinity.presentation.common.AbstractPresenter;

import java.util.ArrayList;
import java.util.List;

import rx.Subscriber;

/**
 * Created by kolin on 27.10.2016.
 */

public class ListPresenter extends AbstractPresenter<ListView> {

    private static final String TAG = ListPresenter.class.getSimpleName();
    private GetListStatementUC getListStatementUC;

    private List<Statement> loadedData = new ArrayList<>();

    public ListPresenter() {
        this.getListStatementUC = new GetListStatementUC();
    }

    public void loadData(){
        getListStatementUC.execute(new PresenterSubscriber());
    }

    private final class PresenterSubscriber extends Subscriber<List<Statement>>{

        @Override
        public void onCompleted() {
            Log.i(TAG, "Subscriber complete!");
        }

        @Override
        public void onError(Throwable e) {
            Log.e(TAG, e.toString());
        }

        @Override
        public void onNext(List<Statement> statements) {
            showLoadedData(statements);
        }
    }

    public void showLoadedData(List<Statement> statements){
        setLoadedData(statements);

        if (!isViewAttach()){
            Log.e(TAG, "View is detach!");
        }

        getWeakReference().showLoadedData(statements);
    }

    public void unsubscribe(){
        getListStatementUC.unsubscribe();
    }

    public List<Statement> getLoadedData() {
        return loadedData;
    }

    public void setLoadedData(List<Statement> statementList){
        loadedData.clear();
        loadedData.addAll(statementList);
    }

    public void onClickItem(int position){
        Statement statement = loadedData.get(position);


        if (!isViewAttach()){
            Log.e(TAG, "View is detach!");
        }

        getWeakReference().openInfo(statement.getRequestID());
    }
}
