package ru.spbstu.college.lab10;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by 429284-16 on 21.09.2018.
 */
public class MyAdapter extends BaseAdapter {
    Context ctx;
    LayoutInflater inflater;
    String[] items;
    private static final String TAG = "Debug";

    MyAdapter(Context context,String[] list){
        ctx = context;
        items = list;
        inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        Log.d(TAG,"GetCount");
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        Log.d(TAG,"GetItem");
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        Log.d(TAG,"GetItemId");
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d(TAG,"GetVIew");
        View view = convertView;
        if (convertView == null){
            Log.d(TAG,"View = null");
            view = inflater.inflate(R.layout.item,parent,false);
            Log.d(TAG,"View set");
        }
        String s = items[position];
        Log.d(TAG,"before textView");
        TextView tv = (TextView) view.findViewById(R.id.tv);
        Log.d(TAG, "create tv");
        tv.setText(s);
        if (position%2 == 0) {
            Log.d(TAG,"green");
            tv.setBackgroundColor(ContextCompat.getColor(ctx,R.color.green));
        }else{
            Log.d(TAG,"pink");
            tv.setBackgroundColor(ContextCompat.getColor(ctx,R.color.pink));
        }
        return view;
    }
}
