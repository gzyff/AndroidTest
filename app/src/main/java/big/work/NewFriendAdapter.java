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

public class NewFriendAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {
    private ArrayList<NewFriendViemItemData> dataList;
    public NewFriendAdapter(ArrayList<NewFriendViemItemData> dataList) {
        this.dataList = dataList;

    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_new_friend_item1,
                parent,false);
        return new NewFriendViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, int position) {
        NewFriendViemItemData entity = dataList.get(position);
        ((NewFriendViewHolder)holder).new_friend_item1_image.setImageResource(entity.getNew_friend_item_image());
        ((NewFriendViewHolder)holder).new_friend_item1_name.setText(entity.getNew_friend_item_name());
        ((NewFriendViewHolder)holder).new_friend_item1_sexboy.setText(entity.getNew_friend_item_sexboy());
        ((NewFriendViewHolder)holder).new_friend_item1_sexgirl.setText(entity.getNew_friend_item_sexgirl());
        ((NewFriendViewHolder)holder).new_friend_item1_from.setText(entity.getNew_friend_item_from());
        ((NewFriendViewHolder)holder).new_friend_item1_common.setText(entity.getNew_friend_item_common());
        ((NewFriendViewHolder)holder).new_friend_item1_constellation.setText(entity.getNew_friend_item_constellation());
        ((NewFriendViewHolder)holder).new_friend_item1_case.setText(entity.getNew_friend_item_case());
        ((NewFriendViewHolder) holder).new_friend_item1_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataList.remove(holder.getAdapterPosition());
                notifyItemRemoved(holder.getAdapterPosition());
            }
        });
    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }
    static class NewFriendViewHolder extends RecyclerView.ViewHolder{
        public  ImageView new_friend_item1_image;
        public TextView new_friend_item1_name;
        public TextView new_friend_item1_sexboy;
        public TextView new_friend_item1_sexgirl;
        public TextView new_friend_item1_from;
        public TextView new_friend_item1_common;
        public TextView new_friend_item1_constellation;
        public TextView new_friend_item1_case;
        public ImageView new_friend_item1_delete;
        public NewFriendViewHolder(@NonNull View itemView) {
            super(itemView);
            new_friend_item1_image = itemView.findViewById(R.id.new_friend_item1_image);
            new_friend_item1_name = itemView.findViewById(R.id.new_friend_item1_name);
            new_friend_item1_sexboy = itemView.findViewById(R.id.new_friend_item1_sexboy);
            new_friend_item1_sexgirl = itemView.findViewById(R.id.new_friend_item1_sexgirl);
            new_friend_item1_from = itemView.findViewById(R.id.new_friend_item1_from);
            new_friend_item1_common = itemView.findViewById(R.id.new_friend_item1_common);
            new_friend_item1_constellation = itemView.findViewById(R.id.new_friend_item1_constellation);
            new_friend_item1_case = itemView.findViewById(R.id.new_friend_item1_case);
            new_friend_item1_delete = itemView.findViewById(R.id.new_friend_item1_delete);
        }
    }

}
