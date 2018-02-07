package ccy.mygittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String a;
    String b;
    int asdasdasd;
    int p;
    int k;
    long ks;
    String modifyInGithub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String b1 = "分支1";
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        String k ="分支1内容修改";
        String kk ="分支1第二次修改内容";
    }

    @Override
    protected void onResume() {
        super.onResume();
        String m = "主分支修改内容-";
        String mm="主分支第二次修改内容";
    }

}
