package demo.bwei.com.vedio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {


    private FrameLayout Frame;
    private RadioButton Button1;
    private RadioButton Button2;
    private RadioButton Button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    //查找控件
    private void initView() {
        Frame = (FrameLayout) findViewById(R.id.Frame);
        Button1 = (RadioButton) findViewById(R.id.Button1);
        Button2 = (RadioButton) findViewById(R.id.Button2);
        Button3 = (RadioButton) findViewById(R.id.Button3);
    }
}
