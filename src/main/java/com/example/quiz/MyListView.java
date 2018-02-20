package com.example.quiz;


import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import java.util.*;

public class MyListView extends ListActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SimpleAdapter adapter = new SimpleAdapter(this,getData(),R.layout.vlist,
                new String[]{"title"},
                new int[]{R.id.title});
        setListAdapter(adapter);
    }

    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "Question 1");
//        map.put("type", null);
//        map.put("description", "");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "Question 2");
//        map.put("info", null);
//        map.put("description", "");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "Question 3");
//        map.put("info", null);
//        map.put("description", "");
        list.add(map);

        return list;
    }
}