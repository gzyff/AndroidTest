package big.work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidtest.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private Context context;
    private Button btt_login;
    private EditText et_name;
    private EditText et_psd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        context=this;
        btt_login = findViewById(R.id.btt_login);
        et_name = findViewById(R.id.et_name);
        et_psd = findViewById(R.id.et_psd);
        btt_login.setOnClickListener(this);
    }
    public void login(){
       String name = et_name.getText().toString();
       String psd = et_psd.getText().toString();
        if (TextUtils.isEmpty(name)) {
            Toast.makeText(context, "请输入用户名", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(psd)) {
            Toast.makeText(context, "请输入密码", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.equals(name,"yff") && TextUtils.equals(psd,"123456")){
            starActivity();
            return;
        }

        Toast.makeText(context,"用户名或密码错误",Toast.LENGTH_SHORT).show();
    }
    public void starActivity(){
        Intent intent = new Intent(context, Main3Activity.class);
        startActivity(intent);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btt_login:
                login();
                break;
        }
    }
}
