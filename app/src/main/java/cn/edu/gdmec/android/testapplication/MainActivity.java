package cn.edu.gdmec.android.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      List<ItemBean> mlist = new ArrayList<>();
        for (int i=0;i<20;i++){
            mlist.add(new ItemBean(R.mipmap.ic_launcher,"Title"+i,"content"+i));

        }
        ListView listView = (ListView) findViewById(R.id.lv_item);
        listView.setAdapter(new MyAdapter(this,mlist));
    }
}
