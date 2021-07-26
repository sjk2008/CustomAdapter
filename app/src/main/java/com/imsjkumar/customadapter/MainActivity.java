package com.imsjkumar.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_View);

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_single_choice,
                getResources().getStringArray(R.array.android_version));
        listView.setAdapter(arrayAdapter);

        CustomAdapter customAdapter = new CustomAdapter(this, getAndroidVersion());
        listView.setAdapter(customAdapter);


    }

    private ArrayList<AndroidVersion> getAndroidVersion() {
        AndroidVersion version = new AndroidVersion();
        version.setVersionNum(0);
        version.setVersionName("History");

        AndroidVersion version1 = new AndroidVersion();
        version1.setVersionNum(1);
        version1.setVersionName("Chemistry");

        AndroidVersion version2 = new AndroidVersion();
        version2.setVersionNum(2);
        version2.setVersionName("Physics");

        AndroidVersion version3 = new AndroidVersion();
        version3.setVersionNum(3);
        version3.setVersionName("Mathematics");

        AndroidVersion version4 = new AndroidVersion();
        version4.setVersionNum(4);
        version4.setVersionName("ComputerScience");

        AndroidVersion version5 = new AndroidVersion();
        version5.setVersionNum(5);
        version5.setVersionName("Computer");

        AndroidVersion version6 = new AndroidVersion();
        version6.setVersionNum(6);
        version6.setVersionName("Science");

        AndroidVersion version8 = new AndroidVersion();
        version8.setVersionNum(8);
        version8.setVersionName("Biology");

        AndroidVersion version7 = new AndroidVersion();
        version7.setVersionNum(7);
        version7.setVersionName("Civics");

        AndroidVersion version9 = new AndroidVersion();
        version9.setVersionNum(9);
        version9.setVersionName("Polity");

        AndroidVersion version10 = new AndroidVersion();
        version10.setVersionNum(10);
        version10.setVersionName("Social Science");

        AndroidVersion version11 = new AndroidVersion();
        version11.setVersionNum(11);
        version11.setVersionName("Current Affair");

        ArrayList<AndroidVersion> versionArrayList = new ArrayList<>();
        versionArrayList.add(version);
        versionArrayList.add(version1);
        versionArrayList.add(version2);
        versionArrayList.add(version3);
        versionArrayList.add(version4);
        versionArrayList.add(version5);
        versionArrayList.add(version6);
        versionArrayList.add(version7);
        versionArrayList.add(version8);
        versionArrayList.add(version9);
        versionArrayList.add(version10);
        versionArrayList.add(version11);

        return versionArrayList;
    }
}