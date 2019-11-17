package big.work;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;


import com.example.androidtest.R;
import com.example.androidtest.ui.dashboard.DashboardFragment;
import com.example.androidtest.ui.home.HomeFragment;
import com.example.androidtest.ui.notifications.NotificationsFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class Main3Activity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = findViewById(R.id.home_toolbar);
        setSupportActionBar(toolbar);
        mDrawerLayout = findViewById(R.id.home);
        findViewById(R.id.slide_menu_button).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mDrawerLayout.openDrawer(GravityCompat.START);
            }
        });
       // 初始界面（聊天界面）
        replaceFragment(new NotificationsFragment());
        findViewById(R.id.navigation_message).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                replaceFragment(new NotificationsFragment());
            }
        });
        findViewById(R.id.navigation_friend).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                replaceFragment(new HomeFragment());
            }
        });
        findViewById(R.id.navigation_set).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                replaceFragment(new DashboardFragment());
            }
        });
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.nav_host_fragment,fragment);
        transaction.commit();
    }
    public boolean onCreateOptionsMenu(Menu menu){
       getMenuInflater() .inflate(R.menu.toobar,menu);
       return true;
    }
}
