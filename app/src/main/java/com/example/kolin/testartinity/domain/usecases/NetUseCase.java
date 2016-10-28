package com.example.kolin.testartinity.domain.usecases;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;

/**
 * Created by kolin on 26.10.2016.
 */

public abstract class NetUseCase {

    private Subscription subscription = Subscriptions.empty();

    public NetUseCase() {
    }

    protected abstract Observable buildUseCaseObservable();

    @SuppressWarnings("unchecked")
    public void execute(Subscriber subscriber){
        subscription = buildUseCaseObservable()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(subscriber);
    }

    public void unsubscribe(){
        if (!subscription.isUnsubscribed()){
            subscription.unsubscribe();
        }
    }
}
