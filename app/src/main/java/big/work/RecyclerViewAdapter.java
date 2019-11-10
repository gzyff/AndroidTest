package big.work;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtest.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int type_search = 0; //搜索框的布局
    public static final int type_domestic = 1; //普通好友的布局
    public static final int type_member = 2; //会员好友的布局
    private ArrayList<RecyclerViewItemData> dataList;

    public RecyclerViewAdapter(ArrayList<RecyclerViewItemData> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == type_search){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_search,
                    parent,false);
            return new SearchViewHolder(view);
        }
        if(viewType == type_domestic){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_demostic,
                    parent,false);
            return new DomesticViewHolder(view);
        }
        if(viewType == type_member){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_member,
                    parent,false);
            return new MemberViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if( holder instanceof SearchViewHolder){
            if(position == 0) {
                ((SearchViewHolder) holder).search.setText("搜索");
            }
        }
        if(holder instanceof DomesticViewHolder){
            if(position == 1){
                ((DomesticViewHolder) holder).user_name.setText("陈忘尘");
                ((DomesticViewHolder) holder).chat_context.setText("色即是空，空既是色");
                ((DomesticViewHolder) holder).chat_time.setText("下午 2:34");
                ((DomesticViewHolder) holder).domestic_image.setImageResource(R.mipmap.tx1);
            }
            if(position == 2){
                ((DomesticViewHolder) holder).user_name.setText("陈烜");
                ((DomesticViewHolder) holder).chat_context.setText("吃外卖吃外卖吃外卖");
                ((DomesticViewHolder) holder).chat_time.setText("上午 9:34");
                ((DomesticViewHolder) holder).domestic_image.setImageResource(R.mipmap.tx2);
            }
            if(position == 4){
                ((DomesticViewHolder) holder).user_name.setText("曹春美");
                ((DomesticViewHolder) holder).chat_context.setText("这里有镜子");
                ((DomesticViewHolder) holder).chat_time.setText("昨天");
                ((DomesticViewHolder) holder).domestic_image.setImageResource(R.mipmap.tx4);
            }
            if(position == 5){
                ((DomesticViewHolder) holder).user_name.setText("云计算172");
                ((DomesticViewHolder) holder).chat_context.setText("刘涔涔（班长）：今天中午全员都要来看篮球赛");
                ((DomesticViewHolder) holder).chat_time.setText("昨天");
                ((DomesticViewHolder) holder).domestic_image.setImageResource(R.mipmap.tx5);
            }
            if(position == 6){
                ((DomesticViewHolder) holder).user_name.setText("朱容");
                ((DomesticViewHolder) holder).chat_context.setText("我好饿我好饿");
                ((DomesticViewHolder) holder).chat_time.setText("星期三");
                ((DomesticViewHolder) holder).domestic_image.setImageResource(R.mipmap.tx6);
            }
            if(position == 7){
                ((DomesticViewHolder) holder).user_name.setText("余雪");
                ((DomesticViewHolder) holder).chat_context.setText("我安全到家啦，不要担心");
                ((DomesticViewHolder) holder).chat_time.setText("星期二");
                ((DomesticViewHolder) holder).domestic_image.setImageResource(R.mipmap.tx7);
            }
            if(position == 9){
                ((DomesticViewHolder) holder).user_name.setText("吴续莲");
                ((DomesticViewHolder) holder).chat_context.setText("[新签名]只要做有意义的事，再晚都是有意义的");
                ((DomesticViewHolder) holder).chat_time.setText("2019-11-2");
                ((DomesticViewHolder) holder).domestic_image.setImageResource(R.mipmap.tx9);
            }
            if(position == 10){
                ((DomesticViewHolder) holder).user_name.setText("劳动改造所");
                ((DomesticViewHolder) holder).chat_context.setText("小白菜：好久去吃饭啊");
                ((DomesticViewHolder) holder).chat_time.setText("2019-11-1");
                ((DomesticViewHolder) holder).domestic_image.setImageResource(R.mipmap.tx10);
            }
            if(position == 12){
                ((DomesticViewHolder) holder).user_name.setText("群通知");
                ((DomesticViewHolder) holder).chat_context.setText("柚子...邀请你加入群 ai比赛");
                ((DomesticViewHolder) holder).chat_time.setText("2019-11-1");
                ((DomesticViewHolder) holder).domestic_image.setImageResource(R.mipmap.tx12);
            }


        }
        if(holder instanceof MemberViewHolder){
            if(position == 3){
                ((MemberViewHolder) holder).member_user_name.setText("杨芳芳");
                ((MemberViewHolder) holder).member_chat_context.setText("我想吃肉肉");
                ((MemberViewHolder) holder).member_chat_time.setText("上午 00:20");
                ((MemberViewHolder) holder).member_user_level.setText("LV6");
                ((MemberViewHolder) holder).member_image.setImageResource(R.mipmap.tx3);

            }
            if(position == 8){
                ((MemberViewHolder) holder).member_user_name.setText("陈绪伟");
                ((MemberViewHolder) holder).member_chat_context.setText("大哥就是大哥");
                ((MemberViewHolder) holder).member_chat_time.setText("2019-11-2");
                ((MemberViewHolder) holder).member_user_level.setText("LV3");
                ((MemberViewHolder) holder).member_image.setImageResource(R.mipmap.tx8);

            }
            if(position == 11){
                ((MemberViewHolder) holder).member_user_name.setText("安南");
                ((MemberViewHolder) holder).member_chat_context.setText("[新签名]lalala");
                ((MemberViewHolder) holder).member_chat_time.setText("2019-10-31");
                ((MemberViewHolder) holder).member_user_level.setText("LV4");
                ((MemberViewHolder) holder).member_image.setImageResource(R.mipmap.tx11);

            }
        }
    }
    public int getItemViewType(int position) {
        if (0 == dataList.get(position).getDataType()) {
            return type_search; // 搜索框
        } else if (1 == dataList.get(position).getDataType()) {
            return type_domestic; // 普通用户
        } else if (2 == dataList.get(position).getDataType()) {
            return type_member; // 会员用户
        } else {
            return 0;
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
    static class DomesticViewHolder extends RecyclerView.ViewHolder
    {

        public ImageView domestic_image;
        public TextView user_name;
        public TextView chat_context;
        public TextView chat_time;

        public DomesticViewHolder(@NonNull View itemView)
        {
            super(itemView);
            // 初始化ItemView布局文件的控件
            domestic_image= itemView.findViewById(R.id.domestic_image);
            user_name = itemView.findViewById(R.id.user_name);
            chat_context = itemView.findViewById(R.id.chat_context);
            chat_time = itemView.findViewById(R.id.chat_time);
        }
    }
    static class SearchViewHolder extends RecyclerView.ViewHolder
    {

        public TextView search;

        public SearchViewHolder(@NonNull View itemView)
        {
            super(itemView);
            // 初始化ItemView布局文件的控件
            search = itemView.findViewById(R.id.search);
        }
    }
    static class MemberViewHolder extends RecyclerView.ViewHolder
    {
        public ImageView member_image;
        public TextView member_user_name;
        public TextView member_user_level;
        public TextView member_chat_context;
        public TextView member_chat_time;

        public MemberViewHolder(@NonNull View itemView)
        {
            super(itemView);
            // 初始化ItemView布局文件的控件
            member_image = itemView.findViewById(R.id.member_image);
            member_chat_context = itemView.findViewById(R.id.member_chat_context);
            member_chat_time = itemView.findViewById(R.id.member_chat_time);
            member_user_name = itemView.findViewById(R.id.member_user_name);
            member_user_level = itemView.findViewById(R.id.member_user_level);
        }
    }
}
