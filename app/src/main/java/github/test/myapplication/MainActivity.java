package github.test.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void MyOnClick(View view){
        switch (view.getId()){
            case R.id.button:
                //跳转
                Intent intent=new Intent(this,Main2Activity.class);
                this.startActivity(intent);
                break;
            case R.id.button2:
                Toast.makeText(MainActivity.this, "修改", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
