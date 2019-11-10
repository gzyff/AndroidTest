package com.example.androidtest.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtest.R;

import java.util.ArrayList;

import big.work.RecyclerViewAdapter;
import big.work.RecyclerViewItemData;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    private ArrayList<RecyclerViewItemData> dataList;
    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_message, container, false);
        recyclerView = root.findViewById(R.id.recycle);
        initData();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new RecyclerViewAdapter(dataList);
        recyclerView.setAdapter(adapter);
        return root;
    }
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
    }

    private void initData() {
        dataList = new ArrayList<>();
        dataList.add(new RecyclerViewItemData(0)); //0
        dataList.add(new RecyclerViewItemData(1)); //1
        dataList.add(new RecyclerViewItemData(1)); //2
        dataList.add(new RecyclerViewItemData(2)); //3
        dataList.add(new RecyclerViewItemData(1)); //4
        dataList.add(new RecyclerViewItemData(1)); //5
        dataList.add(new RecyclerViewItemData(1)); //6
        dataList.add(new RecyclerViewItemData(1)); //7
        dataList.add(new RecyclerViewItemData(2)); //8
        dataList.add(new RecyclerViewItemData(1)); //9
        dataList.add(new RecyclerViewItemData(1)); //10
        dataList.add(new RecyclerViewItemData(2)); //11
        dataList.add(new RecyclerViewItemData(1)); //12
    }

}