package com.example.androidtest;

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

import big.work.NewFriendAdapter;
import big.work.NewFriendViemItemData;
import big.work.RecyclerViewAdapter;

public class NewFriendFragment extends Fragment {
    private View root;
    private ArrayList<NewFriendViemItemData> dataList;
    RecyclerView recyclerView;
    NewFriendAdapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
       root= inflater.inflate(R.layout.new_friend_fragment, container, false);
        recyclerView = root.findViewById(R.id.new_friend_recycle);
        initData();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new NewFriendAdapter(dataList);
        recyclerView.setAdapter(adapter);
       return  root;
    }

    private void initData() {
        dataList = new ArrayList<>();
        dataList.add(new NewFriendViemItemData(R.mipmap.tx31,"大曲",
                " ♂ 31 ","",
                "来自德州","",
                "天秤座","你可能认识"));
        dataList.add(new NewFriendViemItemData(R.mipmap.tx65,"在人间",
                ""," ♀ 20",
                "","",
                "巨蟹座","你可能认识"));
        dataList.add(new NewFriendViemItemData(R.mipmap.tx61,"贩卖日落",
                " ♂ 20 ","",
                "在济南","",
                "天秤座","王者荣耀互赞队友"));
        dataList.add(new NewFriendViemItemData(R.mipmap.tx39,"即将满血复活的陈皮",
                " ♂ 19 ","",
                "","1位共同好友",
                "","来自群：贵州大学计算机协会"));
        dataList.add(new NewFriendViemItemData(R.mipmap.tx44,"鸽子",
                ""," ♀ 20 ",
                "","2位共同好友",
                "金牛座","来自群：贵州大学赛区2019"));
        dataList.add(new NewFriendViemItemData(R.mipmap.tx57,"2022",
                " ♂ 20 ","",
                "来自贵阳","7位共同好友",
                "","来自群：171班群"));
        dataList.add(new NewFriendViemItemData(R.mipmap.tx62,"啊呵呵哈哈哈",
                " ♂ 21 ","",
                "","3位共同好友",
                "狮子座","来自群：171班群"));
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}
