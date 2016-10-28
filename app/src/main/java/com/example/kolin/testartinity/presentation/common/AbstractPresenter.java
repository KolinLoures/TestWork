package com.example.kolin.testartinity.presentation.common;

import java.lang.ref.WeakReference;

/**
 * Created by kolin on 27.10.2016.
 */

public class AbstractPresenter<T> {

    private WeakReference<T> weakReference = null;

    public void attachView(T view){
        weakReference  = new WeakReference<T>(view);
    }

    public void detachView(){
        if (weakReference != null){
            weakReference.clear();
            weakReference = null;
        }
    }

    protected boolean isViewAttach(){
        return weakReference.get() != null && weakReference != null;
    }

    public T getWeakReference() {
        return weakReference == null ? null : weakReference.get();
    }
}
