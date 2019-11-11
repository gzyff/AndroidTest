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

public class FriendsViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int type_itme1 = 1;
    private static final int type_itme2 = 2;
    private ArrayList<FriendsViewItemData> dataList;

    public FriendsViewAdapter(ArrayList<FriendsViewItemData> dataList) {
        this.dataList = dataList;
    }
    public int getItemViewType(int position) {
        if (1 == dataList.get(position).getFrineds_item_type()) {
            return type_itme1;
        } else if (2 == dataList.get(position).getFrineds_item_type()) {
            return type_itme2;
        } else {
            return 0;
        }
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == type_itme1){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_friends_item1,
                    parent,false);
            return new FriendsItem1(view);
        }
        if(viewType == type_itme2){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_friends_item2,
                    parent,false);
            return new FriendsItem2(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof FriendsItem1){
            FriendsViewItemData entity1 = dataList.get(position);
          ((FriendsItem1) holder).friends_item1_tags.setText(entity1.getFriends_item1_text());
        }
        if(holder instanceof FriendsItem2){
            FriendsViewItemData entity2 = dataList.get(position);
           ((FriendsItem2) holder).frineds_item2_iamge.setImageResource
                    (entity2.getFriends_item2_image());
            ((FriendsItem2) holder).friends_item2_name.setText(entity2.getFriends_item2_name());
            ((FriendsItem2) holder).frineds_item2_signature.setText(entity2.getFriends_item2_signature());
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
    static class FriendsItem1 extends RecyclerView.ViewHolder{
        public TextView friends_item1_tags;
        public FriendsItem1(@NonNull View itemView) {
            super(itemView);
            friends_item1_tags = itemView.findViewById(R.id.friends_item1_tag);
        }
    }
    static class FriendsItem2 extends RecyclerView.ViewHolder{
        public TextView friends_item2_name;
        public ImageView frineds_item2_iamge;
        public TextView frineds_item2_signature;
        public FriendsItem2(@NonNull View itemView) {
            super(itemView);
            friends_item2_name = itemView.findViewById(R.id.friends_item2_name);
            frineds_item2_iamge = itemView.findViewById(R.id.friends_item2_image);
            frineds_item2_signature = itemView.findViewById(R.id.friends_item2_signature);
        }
    }

}
