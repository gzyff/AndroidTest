package big.work;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.androidtest.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<RecyclerViewItemData> dataList;
    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle);
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

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }
}
