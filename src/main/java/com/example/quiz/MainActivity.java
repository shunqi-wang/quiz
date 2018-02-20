package com.example.quiz;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

import java.util.*;

public class MainActivity extends ListActivity {

    private Button simpleAdapterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleAdapterBtn=(Button)findViewById(R.id.simpleAdapterBtn);
        simpleAdapterBtn.setOnClickListener(simpleAdapterBtnListener);
    }

    private View.OnClickListener simpleAdapterBtnListener=new View.OnClickListener(){
        public void onClick(View v){
            Log.v("MyListView","simpleAdapter");
            Intent intent=new Intent(MainActivity.this,MyListView.class);
            startActivity(intent);
        }
    };
}
