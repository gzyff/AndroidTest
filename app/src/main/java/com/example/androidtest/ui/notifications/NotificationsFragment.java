package com.example.androidtest.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtest.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;

import big.work.RecyclerViewAdapter;
import big.work.RecyclerViewItemData;

import static com.scwang.smartrefresh.layout.util.SmartUtil.dp2px;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    private ArrayList<RecyclerViewItemData> dataList ;
    private ArrayList<RecyclerViewItemData> dataList1 ;
    private ArrayList<RecyclerViewItemData> dataList2 ;
    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;
    private SmartRefreshLayout refreshLayout;


    public View onCreateView(@NonNull final LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_message, container, false);
        recyclerView = root.findViewById(R.id.recycle);
        refreshLayout = root.findViewById(R.id.refresh_layout);
        initData();
        refreshLayout.setRefreshHeader(new ClassicsHeader(getContext()));
        refreshLayout.setRefreshFooter(new ClassicsFooter(getContext()));
        refreshLayout.setOnRefreshListener(new OnRefreshListener()
        {
            public void onRefresh(@NonNull RefreshLayout refreshLayout)
            {
                initData1();
                adapter.addData(dataList1);
                refreshLayout.finishRefresh(2000);
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener()
        {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout)
            {
                initData2();
                adapter.addData(dataList2);
                refreshLayout.finishLoadMore(2000);
            }
        });

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
        dataList.add((new RecyclerViewItemData(0,"搜索"))); //0
        dataList.add(new RecyclerViewItemData(1,R.mipmap.tx1,"陈忘尘","色即是空，空既是色","下午 2:34")); //1
        dataList.add(new RecyclerViewItemData(1,R.mipmap.tx2,"陈烜","吃外卖吃外卖吃外卖","上午 9:34")); //2
        dataList.add(new RecyclerViewItemData(2,R.mipmap.tx3,"杨芳芳",
                "我想吃肉肉","上午00：40","LV6")); //3
        dataList.add(new RecyclerViewItemData(1,R.mipmap.tx4,"曹春美","这里有镜子","昨天")); //4
        dataList.add(new RecyclerViewItemData(1,R.mipmap.tx5,"云计算172",
                "刘涔涔（班长）今天中午全员都要来看","昨天")); //5
        dataList.add(new RecyclerViewItemData(1,R.mipmap.tx6,"朱容","我好饿我好饿","星期三")); //6
        dataList.add(new RecyclerViewItemData(1,R.mipmap.tx7,"余雪","我安全到家了，不要担心","星期二")); //7
        dataList.add(new RecyclerViewItemData(2,R.mipmap.tx8,"陈绪伟",
                "大哥就是大哥","2019-11-2","LV3")); //8
        dataList.add(new RecyclerViewItemData(1,R.mipmap.tx9,"吴续莲",
                "[新签名]只有做有意义的事，再晚都是有意义的","2019-11-2")); //9
        dataList.add(new RecyclerViewItemData(1,R.mipmap.tx10,"劳动改造所","[小白菜]好久去吃饭啊","2019-11-1")); //10
        dataList.add(new RecyclerViewItemData(2,R.mipmap.tx11,"安南",
                "[新签名]lalala","2019-10-31","LV4")); //11
        dataList.add(new RecyclerViewItemData(1,R.mipmap.tx12,"群通知","柚子...邀请你加入群 ai比赛","2019-11-1")); //12
    }
    private void initData1() {
        dataList1 = new ArrayList<>();
        dataList1.add(new RecyclerViewItemData(1,R.mipmap.tx56,"谢小雪","我是个温柔的人","下午 6:34")); //1
        dataList1.add(new RecyclerViewItemData(2,R.mipmap.tx55,"成先杰","嘿嘿嘿","下午 4:04","LV2")); //2
    }
    private void initData2() {
        dataList2 = new ArrayList<>();
        dataList2.add(new RecyclerViewItemData(1,R.mipmap.tx45,"吴续莲",
                "[新签名]只有做有意义的事，再晚都是有意义的","2019-10-30")); //9
        dataList2.add(new RecyclerViewItemData(1,R.mipmap.tx28,"劳动改造所","[小白菜]好久去吃饭啊","2019-10-29")); //10
        dataList2.add(new RecyclerViewItemData(2,R.mipmap.tx39,"安南",
                "[新签名]lalala","2019-10-29","LV4")); //11
        dataList2.add(new RecyclerViewItemData(1,R.mipmap.tx50,"群通知","柚子...邀请你加入群 ai比赛","2019-10-25")); //12
    }

}