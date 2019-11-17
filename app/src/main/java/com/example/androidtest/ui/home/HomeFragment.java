package com.example.androidtest.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.androidtest.FriendsFragment;
import com.example.androidtest.NewFriendFragment;
import com.example.androidtest.GroupFragment;
import com.example.androidtest.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import big.work.RecyclerViewAdapter;
import big.work.RecyclerViewItemData;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private TabLayout tabLayout;
    private ViewPager viewpager;
    private ArrayList<RecyclerViewItemData> dataList1;
    RecyclerView recyclerView;
    RecyclerViewAdapter adapter1;
    private View root;
    ArrayList fragmentList = new ArrayList<Fragment>();
    String[] temp = {"朋友","分组","新朋友"};


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_friend, container, false);
        tabLayout = root.findViewById(R.id.friend_tab);
        viewpager = root.findViewById(R.id.friend_view_page);
        recyclerView = root.findViewById(R.id.recycle);
        initData1();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter1 = new RecyclerViewAdapter(dataList1);
        recyclerView.setAdapter(adapter1);
        return root;
    }
    private void initData1() {
        dataList1 = new ArrayList<>();
        dataList1.add(new RecyclerViewItemData(0,"搜索")); //0
    }
     public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData1();
        MPagerAdapter mPagerAdapter = new MPagerAdapter(getChildFragmentManager());
        initFragment();
        tabLayout.setupWithViewPager(viewpager);
        viewpager.setAdapter(mPagerAdapter);
    }
    private void initFragment() {
        fragmentList.add(new FriendsFragment());
        fragmentList.add(new GroupFragment());
        fragmentList.add(new NewFriendFragment());
    }

    class MPagerAdapter extends FragmentPagerAdapter {


        public MPagerAdapter(FragmentManager fm) {

            super(fm);
        }

        public Fragment getItem(int position) {
            return (Fragment) fragmentList.get(position);
        }
        public int getCount() {

            return fragmentList.size();
        }

        public Object instantiateItem(ViewGroup container, int position) {
            return super.instantiateItem(container, position);
        }

        //返回tablayout的标题文字;
        public CharSequence getPageTitle(int position) {
            return temp[position];
        }
    }



}