package com.example.kolin.testartinity.presentation.screenlist.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kolin.testartinity.R;
import com.example.kolin.testartinity.domain.model.Statement;
import com.example.kolin.testartinity.presentation.screenlist.StatementsAdapter;

import java.io.Serializable;
import java.util.List;

public class ListFragment extends Fragment implements ListView {

    boolean dualPane;

    private static final String STATE_ARG = "state";

    private StatementsAdapter adapter;
    private ListPresenter presenter;
    private RecyclerView recyclerView;

    private ListFragmentListener listener;

    public interface ListFragmentListener{
        void onClickOpenInfoActivity(String requestID);

        void onClickOpenInfoFragment(String requestID);
    }

    public ListFragment() {
    }

    public static ListFragment newInstance() {
        ListFragment fragment = new ListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = new ListPresenter();
        presenter.attachView(this);

        adapter = new StatementsAdapter();
        adapter.setListener(new StatementsAdapter.StatementsAdapterListener() {
            @Override
            public void onClickItem(int position) {
                presenter.onClickItem(position);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.list_fragment_rv);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        if (savedInstanceState == null){
            presenter.loadData();
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        View detailView = getActivity().findViewById(R.id.main_activity_fl_content);
        dualPane = detailView != null && detailView.getVisibility() == View.VISIBLE;

        if (savedInstanceState !=  null){
            List<Statement> data = (List<Statement>) savedInstanceState.getSerializable(STATE_ARG);
            presenter.setLoadedData(data);
            showLoadedData(data);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof ListFragmentListener){
            listener = (ListFragmentListener) context;
        } else {
            throw new RuntimeException(context.toString() +
                    "must implement ListFragmentListener");
        }
    }

    @Override
    public void onDetach() {
        adapter.setListener(null);
        presenter.unsubscribe();
        super.onDetach();
    }

    @Override
    public void showLoadedData(List<Statement> statementList) {
        adapter.addAll(statementList);
    }

    @Override
    public void openInfo(String requestID) {
        if (dualPane){
            if (listener != null){
                listener.onClickOpenInfoFragment(requestID);
            }
        } else {
            if (listener != null) {
                listener.onClickOpenInfoActivity(requestID);
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putSerializable(STATE_ARG, (Serializable) presenter.getLoadedData());
    }
}
