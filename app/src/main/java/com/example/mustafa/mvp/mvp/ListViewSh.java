package com.example.mustafa.mvp.mvp;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mustafa.mvp.R;
import com.example.mustafa.mvp.mvp.adapter.ListRvDataAdapter;
import com.example.mustafa.mvp.mvp.model.Item;

import java.util.List;

public class ListViewSh extends AppCompatActivity implements IList.PresenterToView{
    private RecyclerView mRecyclerView;
    private ListPresenter mPresenter;
    private   ProgressDialog mDialog;


    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        viewSetId();
        setupView();
        ListModel model= new ListModel();
        mPresenter = new ListPresenter(model);
        mPresenter.attachView(this);
        mPresenter.viewCreated();
    }

    private void setupView() {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
    }

    private void viewSetId() {
        mRecyclerView = findViewById(R.id.rv_list_data);
    }

    @Override
    public void showLoading() {
        mDialog= ProgressDialog.show(this, "",
                "Loading. Please wait...", true);
    }

    @Override
    public void showList(List<Item> myList) {
        ListRvDataAdapter dataAdapter = new ListRvDataAdapter(myList, this);
        mRecyclerView.setAdapter(dataAdapter);

    }

    @Override
    public void hideDialog() {
        mDialog.dismiss();
    }
}
