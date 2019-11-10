package big.work;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtest.R;

public class DomesticViewHolder extends RecyclerView.ViewHolder {
    public TextView search;
    public ImageView domestic_image;
    public TextView user_name;
    public TextView chat_context;
    public TextView chat_time;
    public ImageView member_image;
    public TextView member_user_name;
    public TextView member_user_level;
    public TextView member_chat_context;
    public TextView member_chat_time;

    public DomesticViewHolder(@NonNull View itemView) {
        super(itemView);
         search = itemView.findViewById(R.id.search);
         domestic_image= itemView.findViewById(R.id.domestic_image);
         user_name = itemView.findViewById(R.id.user_name);
         chat_context = itemView.findViewById(R.id.chat_context);
         chat_time = itemView.findViewById(R.id.chat_time);
         member_image = itemView.findViewById(R.id.member_image);
         member_chat_context = itemView.findViewById(R.id.member_chat_context);
         member_chat_time = itemView.findViewById(R.id.member_chat_time);
         member_user_name = itemView.findViewById(R.id.member_user_name);
         member_user_level = itemView.findViewById(R.id.member_user_level);


    }
}
