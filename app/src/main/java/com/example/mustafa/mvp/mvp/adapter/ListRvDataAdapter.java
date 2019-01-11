package com.example.mustafa.mvp.mvp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.mustafa.mvp.R;
import com.example.mustafa.mvp.mvp.ListViewSh;
import com.example.mustafa.mvp.mvp.model.Item;

import java.util.List;


public class ListRvDataAdapter extends RecyclerView.Adapter<ListRvDataAdapter.VH> {
    private List<Item> mList;
    private Context mContext;
    private Integer mItemNumber, mAnswerNumber;
    private String mQueItem;
    private boolean isChange = false;

    public ListRvDataAdapter(List<Item> list, Context context) {
        mList = list;
        mContext = context;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.adapter_layout, viewGroup, false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VH vh, final int i) {
//        if (isChange){
//            Item oldItem = mList.get(mItemNumber);
//            mQueItem = oldItem.getQuText();
//            Item newItem = new Item(mQueItem,mAnswerNumber);
//            mList.set(mItemNumber,newItem);

//        }
        Item item = mList.get(i);
        vh.mTextView.setText(item.getQuText());
        switch (item.getAnswer()) {
            case 0:
                vh.mRadioGroup.check(R.id.rb_1);
                break;
            case 1:
                vh.mRadioGroup.check(R.id.rb_2);
                break;
            case 2:
                vh.mRadioGroup.check(R.id.rb_3);
                break;
            case 3:
                vh.mRadioGroup.check(R.id.rb_4);
                break;
        }
        vh.mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                isChange = true;
//                mItemNumber = i;
                switch (checkedId) {
                    case R.id.rb_1:
//                        mAnswerNumber = 0;
                        break;
                    case R.id.rb_2:
//                        mAnswerNumber = 1;
                        break;
                    case R.id.rb_3:
//                        mAnswerNumber = 2;
                        break;
                    case R.id.rb_4:
//                        mAnswerNumber = 3 ;
                        break;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        private TextView mTextView;
        private RadioGroup mRadioGroup;

        public VH(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.rv_item_tv);
            mRadioGroup = itemView.findViewById(R.id.rgAnswer);

        }
    }
}
