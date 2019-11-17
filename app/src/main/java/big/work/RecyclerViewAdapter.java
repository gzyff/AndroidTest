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
    public void addData(ArrayList<RecyclerViewItemData> dataList){
        if (this.dataList == null)
        {
            this.dataList = new ArrayList<>();
        }
        this.dataList.addAll(dataList);
        notifyDataSetChanged();
    }
    public void setData(ArrayList<RecyclerViewItemData> dataList)
    {
        this.dataList = dataList;
        // 刷新列表数据
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == type_search){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_search_item,
                    parent,false);
            return new SearchViewHolder(view);
        }
        if(viewType == type_domestic){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_demostic_item,
                    parent,false);
            return new DomesticViewHolder(view);
        }
        if(viewType == type_member){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_member_item,
                    parent,false);
            return new MemberViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if( holder instanceof SearchViewHolder){
            RecyclerViewItemData entity1 = dataList.get(position);
            ((SearchViewHolder) holder).search.setText(entity1.getSearch());
        }
        if(holder instanceof DomesticViewHolder){
            RecyclerViewItemData entity2 = dataList.get(position);
                ((DomesticViewHolder) holder).user_name.setText(entity2.getUser_name());
                ((DomesticViewHolder) holder).chat_context.setText(entity2.getChat_context());
                ((DomesticViewHolder) holder).chat_time.setText(entity2.getChat_time());
                ((DomesticViewHolder) holder).domestic_image.setImageResource(entity2.getDomestic_image());
        }
        if(holder instanceof MemberViewHolder) {
            RecyclerViewItemData entity3 = dataList.get(position);
            ((MemberViewHolder) holder).member_user_name.setText(entity3.getMember_user_name());
            ((MemberViewHolder) holder).member_chat_context.setText(entity3.getMember_chat_context());
            ((MemberViewHolder) holder).member_chat_time.setText(entity3.getMember_chat_time());
            ((MemberViewHolder) holder).member_user_level.setText(entity3.getMember_user_level());
            ((MemberViewHolder) holder).member_image.setImageResource(entity3.getMember_image());
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
