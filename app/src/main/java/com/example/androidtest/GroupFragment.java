package com.example.androidtest;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;

import big.work.GroupAdapter;
import big.work.GroupViewItemData;

public class GroupFragment extends Fragment {
    public ExpandableListView mExpandableListView;
    ArrayList<GroupViewItemData> group;
    ArrayList<ArrayList<GroupViewItemData>> itemList;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.group_fragment, container, false);
        initData_group();
        initData_itemList();
        mExpandableListView = root.findViewById(R.id.expand_lv);
        GroupAdapter adapter = new GroupAdapter(getContext(),group,itemList);
        mExpandableListView.setAdapter(adapter);
        return root;
    }
    private void initData_group(){
        group = new ArrayList<>();
        group.add(new GroupViewItemData("特别关心","7/8"));
        group.add(new GroupViewItemData("小学同学","6/6"));
        group.add(new GroupViewItemData("初中同学","7/8"));
        group.add(new GroupViewItemData("高中同学","5/5"));
        group.add(new GroupViewItemData("大学同学","4/6"));
    }
    private void initData_itemList(){
        itemList = new ArrayList<>();
        ArrayList<GroupViewItemData> itemList1 = new ArrayList<>();
        itemList1.add(new GroupViewItemData(R.mipmap.tx56,
                "何勇能","[4G在线]好好好"));
        itemList1.add(new GroupViewItemData(R.mipmap.tx45,
                "曹春美","[4G在线]我想加一堆支付宝好友偷能量"));
        itemList1.add(new GroupViewItemData(R.mipmap.tx70,
                "憨憨","[手机线]怕失去，就想拥有"));
        itemList1.add(new GroupViewItemData(R.mipmap.tx19,
                "小宝贝儿","[4G在线]飞机翻了个跟头"));
        itemList1.add(new GroupViewItemData(R.mipmap.tx23,
                "余可爱","[手机在线]男神阿信，女神如下"));
        itemList1.add(new GroupViewItemData(R.mipmap.tx28,
                "张鹏","[4G在线]肉和蔬菜我都爱！"));
        itemList1.add(new GroupViewItemData(R.mipmap.tx18,
                "周春华","[4G在线]千年流芳景德镇"));
        itemList1.add(new GroupViewItemData(R.mipmap.tx7,
                "大头","[离线请留言]我的天...真的假的"));

        ArrayList<GroupViewItemData> itemList2 = new ArrayList<>();
        itemList2.add(new GroupViewItemData(R.mipmap.tx47,
                "胡鑫宇","[4G在线]有想法的可以去试试"));
        itemList2.add(new GroupViewItemData(R.mipmap.tx26,
                "班承露","[iphone在线]晚安啦大家"));
        itemList2.add(new GroupViewItemData(R.mipmap.tx59,
                "陈义兰","[手机在线]认真的活着，优雅的老去"));
        itemList2.add(new GroupViewItemData(R.mipmap.tx71,
                "高云鸿","[手机在线]？？？？？"));
        itemList2.add(new GroupViewItemData(R.mipmap.tx67,
                "郭松","[4G在线]人生如此，给你酒"));
        itemList2.add(new GroupViewItemData(R.mipmap.tx37,
                "罗应红","[iphone在线]最新分享：快来帮我解锁"));
        itemList2.add(new GroupViewItemData(R.mipmap.tx39,
                "夏永超","[手机在线]更新了说说"));

        ArrayList<GroupViewItemData> itemList3 = new ArrayList<>();
        itemList3.add(new GroupViewItemData(R.mipmap.tx32,
                "班礼鹏","[平板在线]社会人聚餐/呲牙"));
        itemList3.add(new GroupViewItemData(R.mipmap.tx34,
                "刘健","[4G在线]"));
        itemList3.add(new GroupViewItemData(R.mipmap.tx41,
                "温雨馨","[iphone在线]或许我的硫代酸纳加多了"));
        itemList3.add(new GroupViewItemData(R.mipmap.tx42,
                "吴松帆","[4G在线]树叶都染成橙橘"));
        itemList3.add(new GroupViewItemData(R.mipmap.tx44,
                "陈辉欢","[4G在线]更新了说说"));
        itemList3.add(new GroupViewItemData(R.mipmap.tx45,
                "陈丽单","[4G在线]纪念一个月以来第一天不用学车"));
        itemList3.add(new GroupViewItemData(R.mipmap.tx48,
                "孙贻伟","[手机在线]爱心/爱心/爱心/爱心"));
        itemList3.add(new GroupViewItemData(R.mipmap.tx50,
                "姚凤单","[离线请留言]满地都是六便士，他抬头看见了月亮"));

        ArrayList<GroupViewItemData> itemList4 = new ArrayList<>();
        itemList4.add(new GroupViewItemData(R.mipmap.tx21,
                "王世明","[手机在线]我在场上唯一信任的就是队友"));
        itemList4.add(new GroupViewItemData(R.mipmap.tx22,
                "刘明安","[WIFI在线]神仙打架"));
        itemList4.add(new GroupViewItemData(R.mipmap.tx22,
                "魏国旗","[4G在线]踏碎虚空，斗破苍穹"));
        itemList4.add(new GroupViewItemData(R.mipmap.tx23,
                "安蓉蓉","[WIFI在线]人总是在各种各样的感情中长大"));
        itemList4.add(new GroupViewItemData(R.mipmap.tx25,
                "母凯","[4G在线]招暑假工"));

        ArrayList<GroupViewItemData> itemList5 = new ArrayList<>();
        itemList5.add(new GroupViewItemData(R.mipmap.tx60,
                "陈世杰","[4G在线]"));
        itemList5.add(new GroupViewItemData(R.mipmap.tx62,
                "成先杰","[4G在线]知道了么，各位憨批"));
        itemList5.add(new GroupViewItemData(R.mipmap.tx63,
                "谢小雪","[手机在线]生日快乐，我的大宝贝"));
        itemList5.add(new GroupViewItemData(R.mipmap.tx64,
                "叶鹏","[4G在线]麻烦各位小朋友小哥哥小姐姐"));
        itemList5.add(new GroupViewItemData(R.mipmap.tx67,
                "吴元彬","[离线请留言]以后我就是你大哥"));
        itemList5.add(new GroupViewItemData(R.mipmap.tx68,
                "张小波","[离线请留言]真不好意思"));

        itemList.add(itemList1);
        itemList.add(itemList2);
        itemList.add(itemList3);
        itemList.add(itemList4);
        itemList.add(itemList5);

    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

}
