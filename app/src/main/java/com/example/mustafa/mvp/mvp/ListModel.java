package com.example.mustafa.mvp.mvp;

import com.example.mustafa.mvp.mvp.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ListModel implements IList.PresenterToModel {

    private ListPresenter mPresenter;


    @Override
    public void attachPresenter(ListPresenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void dataListReq() {
        List<Item> items = new ArrayList<>();
        Item item = new Item("ppasgdagsryh", 0);
        items.add(item);
        Item item1 = new Item("awfw4ardf", 1);
        items.add(item1);
        Item item2 = new Item("awfw4ardf", 2);
        items.add(item2);
        Item item3 = new Item("awfw4ardf", 3);
        items.add(item3);
        Item item4 = new Item("awfw4ardf", 2);
        items.add(item4);
        Item item5 = new Item("awfw4ardf", 1);
        items.add(item5);
        Item item6 = new Item("awfw4ardf", 0);
        items.add(item6);
        Item item7 = new Item("ppasgdagsryh", 2);
        items.add(item7);
        Item item8 = new Item("awfw4ardf", 2);
        items.add(item8);
        Item item9 = new Item("awfw4ardf", 2);
        items.add(item9);
        Item item10 = new Item("awfw4ardf", 2);
        items.add(item10);
        Item item11 = new Item("awfw4ardf", 2);
        items.add(item11);
        Item item12 = new Item("awfw4ardf", 2);
        items.add(item12);
        Item item13 = new Item("awfw4ardf", 2);
        items.add(item13);
        mPresenter.postList(items);
    }
}
