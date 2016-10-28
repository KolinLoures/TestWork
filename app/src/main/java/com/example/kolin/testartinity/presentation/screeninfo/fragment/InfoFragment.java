package com.example.kolin.testartinity.presentation.screeninfo.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.kolin.testartinity.R;
import com.example.kolin.testartinity.domain.model.Request;

public class InfoFragment extends Fragment implements InfoView {

    private static final String ARG_KEY = "requestID";
    private static final String ARG_STATE = "state";


    private TextView textViewStatus;
    private TextView textViewFullName;
    private TextView textViewDescription;
    private TextView textViewDateSupply;
    private TextView textViewFinishTime;

    private TextView textViewCompleteTime;

    private EditText editTextSolution;

    private ProgressBar progressBar;

    private LinearLayout linearLayout;

    private InfoPresenter presenter;

    public InfoFragment() {
    }

    public static InfoFragment newInstance(String requestID) {
        InfoFragment fragment = new InfoFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_KEY, requestID);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = new InfoPresenter();
        presenter.attachView(this);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        textViewStatus = (TextView) view.findViewById(R.id.info_fragment_status);
        textViewFullName = (TextView) view.findViewById(R.id.info_fragment_full_name);
        textViewDescription = (TextView) view.findViewById(R.id.info_fragment_description);
        textViewDateSupply = (TextView) view.findViewById(R.id.info_fragment_date_supply);
        textViewFinishTime = (TextView) view.findViewById(R.id.info_fragment_finish_time);
        textViewCompleteTime = (TextView) view.findViewById(R.id.info_fragment_complete_time);

        editTextSolution = (EditText) view.findViewById(R.id.info_fragment_solution);

        progressBar = (ProgressBar) view.findViewById(R.id.info_fragment_progress_bar);
        progressBar.setVisibility(View.GONE);

        linearLayout = (LinearLayout) view.findViewById(R.id.info_fragment_l);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        if (savedInstanceState == null){
            String requestID = getArguments().getString(ARG_KEY);
            presenter.loadData(requestID);
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (savedInstanceState != null){
            Request request = (Request) savedInstanceState.get(ARG_STATE);
            presenter.setLoadedRequest(request);
            showLoadedData(request);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void showLoadedData(Request request) {
        textViewStatus.setText(request.getStatusText());
        textViewFullName.setText(request.getContactContactID().getUserID().getFullName());
        textViewDescription.setText(request.getDescription());
        editTextSolution.setText(request.getSolutionDescription());
        textViewDateSupply.setText(request.getCreatedAt());
        textViewFinishTime.setText(request.getSLARecoveryTime());
        textViewCompleteTime.setText(request.getActualRecoveryTime());
    }

    @Override
    public void showProgressBar(boolean value) {
        if (value){
            progressBar.setVisibility(View.VISIBLE);
            linearLayout.setVisibility(View.GONE);
        } else {
            linearLayout.setVisibility(View.VISIBLE);
            progressBar.setVisibility(View.GONE);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putSerializable(ARG_STATE, presenter.getLoadedRequest());
    }
}
