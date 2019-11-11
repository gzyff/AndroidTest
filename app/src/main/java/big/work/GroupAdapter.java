package big.work;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtest.GroupFragment;
import com.example.androidtest.R;

import java.util.ArrayList;

public class GroupAdapter extends BaseExpandableListAdapter {
    private Context mContext;
    private ArrayList<GroupViewItemData> group;
    private ArrayList<ArrayList<GroupViewItemData>> itemList;
    private LayoutInflater mInflater;
    public GroupAdapter(Context context, ArrayList<GroupViewItemData> group,
                        ArrayList<ArrayList<GroupViewItemData>> itemList){
        this.mContext = context;
        this.group = group;
        this.itemList = itemList;
        mInflater = LayoutInflater.from(context);
    }
    @Override
    public int getGroupCount() {
        return group.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return itemList.get(groupPosition).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return group.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return itemList.get(groupPosition).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = mInflater.inflate(R.layout.activity_group_item1, parent, false);
        TextView group_name = convertView.findViewById(R.id.group_name);
        TextView group_number = convertView.findViewById(R.id.group_number);
        group_name.setText(group.get(groupPosition).getGroup_name());
        group_number.setText(group.get(groupPosition).getGroup_number());
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = mInflater.inflate(R.layout.activity_friends_item2,parent,false);
        }
        ImageView friends_item2_image= convertView.findViewById(R.id.friends_item2_image);
        TextView friends_item2_name= convertView.findViewById(R.id.friends_item2_name);
        TextView friends_item2_signature= convertView.findViewById(R.id.friends_item2_signature);
        friends_item2_image.setImageResource(
                itemList.get(groupPosition).get(childPosition).getFriends_item2_image());
        friends_item2_name.setText(
                itemList.get(groupPosition).get(childPosition).getFriends_item2_name());
        friends_item2_signature.setText(
                itemList.get(groupPosition).get(childPosition).getFriends_item2_signature());
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
