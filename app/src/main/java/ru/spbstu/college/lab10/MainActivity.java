package ru.spbstu.college.lab10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by 429284-16 on 21.09.2018.
 */
public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] array = getResources().getStringArray(R.array.list);
        MyAdapter adap = new MyAdapter(this,array);
        ListView lv = (ListView)findViewById(R.id.lv);
        lv.setAdapter(adap);
    }
}
