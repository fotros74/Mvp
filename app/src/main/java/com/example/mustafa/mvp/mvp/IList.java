package com.example.mustafa.mvp.mvp;

import com.example.mustafa.mvp.mvp.model.Item;

import java.util.List;

public interface IList {

    interface ViewToPresenter{
        void attachView(ListViewSh viewSh);
        void viewCreated();

    }

    interface PresenterToView{

        void showLoading();

        void showList(List<Item> myList);

        void hideDialog();

    }

    interface PresenterToModel{
        void attachPresenter(ListPresenter presenter);
        void dataListReq();
    }

    interface ModelToPresenter{

        void postList(List<Item> myList);

    }

}
