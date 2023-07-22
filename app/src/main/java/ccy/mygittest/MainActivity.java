package ccy.mygittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ccy", "test log out put to adb");
        Toast.makeText(this, "this us macbranch1 modified", Toast.LENGTH_LONG).show();
        //modified in origin
        //21122
        //add some but not commit
        //1
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //this is macbran【哈哈哈qqq】ce1 modif[q branch modified]bbbbbied;
        //
    }

    @Override
    protected void onResume() {
        super.onResume();
        //this is master modified;
        //this is modified in b2;、
        //-1
        //qqqasdasdq
        //[q branch modified]
    }

}
