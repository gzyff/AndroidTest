package com.example.androidtest;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import big.work.FriendsViewAdapter;
import big.work.FriendsViewItemData;
import big.work.RecyclerViewAdapter;
import big.work.RecyclerViewItemData;

public class FriendsFragment extends Fragment {

    private FriendsViewModel mViewModel;
    private ArrayList<FriendsViewItemData> dataList;
    RecyclerView recyclerView;
    FriendsViewAdapter adapter;

    public static FriendsFragment newInstance() {
        return new FriendsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.friends_fragment, container, false);
        recyclerView = root.findViewById(R.id.recycle);
        initData();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new FriendsViewAdapter(dataList);
        recyclerView.setAdapter(adapter);
        return root;
    }
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    private void initData() {
        dataList = new ArrayList<>();
        dataList.add(new FriendsViewItemData(1,"特别关心"));
        dataList.add(new FriendsViewItemData(2,R.mipmap.tx56,
                "何勇能","[4G在线]好好好"));
        dataList.add(new FriendsViewItemData(2,R.mipmap.tx45,
                "曹春美","[4G在线]我想加一堆支付宝好友偷能量"));
        dataList.add(new FriendsViewItemData(2,R.mipmap.tx70,
                "憨憨","[手机线]怕失去，就想拥有"));
        dataList.add(new FriendsViewItemData(2,R.mipmap.tx19,
                "小宝贝儿","[4G在线]飞机翻了个跟头"));
        dataList.add(new FriendsViewItemData(2,R.mipmap.tx23,
                "余可爱","[手机在线]男神阿信，女神如下"));
        dataList.add(new FriendsViewItemData(2,R.mipmap.tx28,
                "张鹏","[4G在线]肉和蔬菜我都爱！"));
        dataList.add(new FriendsViewItemData(2,R.mipmap.tx18,
                "周春华","[4G在线]千年流芳景德镇"));
        dataList.add(new FriendsViewItemData(2,R.mipmap.tx7,
                "大头","[离线请留言]我的天...真的假的"));
        dataList.add(new FriendsViewItemData(1,"A"));
        dataList.add(new FriendsViewItemData(2,R.mipmap.tx49,
                "安蓉蓉","[WIFI在线]人总是在各种各样的感情中长大"));
        dataList.add(new FriendsViewItemData(2,R.mipmap.tx35,
                "A 17 计科-陈吉","[4G在线]终于让我熬到今天了"));
        dataList.add(new FriendsViewItemData(1,"B"));
        dataList.add(new FriendsViewItemData(2,R.mipmap.tx13,
                "不到100不改名字","[4G在线]上传一张照片到《跑步》"));
        dataList.add(new FriendsViewItemData(2,R.mipmap.tx55,
                "班明凤","[手机在线]晚安哟"));


    }


}
