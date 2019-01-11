package com.example.mustafa.mvp.mvp;

import com.example.mustafa.mvp.mvp.model.Item;

import java.util.List;

public class ListPresenter implements IList.ViewToPresenter,IList.ModelToPresenter {

    private ListViewSh mView;
    private ListModel mModel;

    public ListPresenter( ListModel model) {
        mModel = model;
        model.attachPresenter(this);
    }

    @Override
    public void attachView(ListViewSh viewSh) {
        mView = viewSh;

    }

    @Override
    public void viewCreated() {
        mView.showLoading();
        mModel.dataListReq();

    }

    @Override
    public void postList(List<Item> myList) {
        mView.hideDialog();
        mView.showList(myList);

    }
}
