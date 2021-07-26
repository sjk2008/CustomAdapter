package com.imsjkumar.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<AndroidVersion> androidVersionArrayList;
    private Object ViewGroup;

    public CustomAdapter(Context context, ArrayList<AndroidVersion> versionArrayList) {
        this.context = context;
        this.androidVersionArrayList = versionArrayList;
    }


    @Override
    public int getCount() {
        if (androidVersionArrayList != null && androidVersionArrayList.size() > 0) {
            return androidVersionArrayList.size();
        } else {
            return 0;
        }
    }

    @Override
    public Object getItem(int position) {
        return androidVersionArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.version_list_item,
                    (android.view.ViewGroup) ViewGroup,false);
            TextView txtVersionName = view.findViewById(R.id.tv_version_name);
            TextView txtVersionNum = view.findViewById(R.id.tv_version_num);

           int i=0 ;
            txtVersionNum.setText("UPSC BOOKS "+androidVersionArrayList.get(i).getVersionNum());
            txtVersionName.setText(androidVersionArrayList.get(i).getVersionName());

            View mainLayout = view.findViewById(R.id.main_layout);
            mainLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,"clicked"+androidVersionArrayList.get(i).getVersionName(),Toast.LENGTH_SHORT).show();
                }
            });


        }
        return view;
    }
}
