package com.example.kolin.testartinity.presentation.screenlist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kolin.testartinity.R;
import com.example.kolin.testartinity.domain.model.Statement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kolin on 27.10.2016.
 */

public class StatementsAdapter extends RecyclerView.Adapter<StatementsAdapter.ViewHolder> {

    private List<Statement> statementList = new ArrayList<>();

    private StatementsAdapterListener listener;

    public interface StatementsAdapterListener{
        public void onClickItem(int position);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_statements, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Statement current = statementList.get(position);

        holder.textRequestNum.setText(current.getRequestNumber());
        holder.textCreatedAt.setText(current.getCreatedAt());
        holder.textName.setText(current.getName());
    }

    @Override
    public int getItemCount() {
        return statementList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textRequestNum;
        private TextView textName;
        private TextView textCreatedAt;


        public ViewHolder(final View itemView) {
            super(itemView);

            textRequestNum = (TextView) itemView.findViewById(R.id.item_list_request_number);
            textName = (TextView) itemView.findViewById(R.id.item_list_name);
            textCreatedAt = (TextView) itemView.findViewById(R.id.item_list_created_at);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        listener.onClickItem(getLayoutPosition());
                    }
                    itemView.setActivated(true);
                }
            });

        }
    }

    public void clear(){
        statementList.clear();
        notifyDataSetChanged();
    }

    public void addAll(List<Statement> statementList){
        this.statementList.clear();
        this.statementList.addAll(statementList);
        notifyDataSetChanged();
    }

    public void setListener(StatementsAdapterListener listener) {
        this.listener = listener;
    }
}
