package com.example.myapplicationkkk;

import static java.util.Arrays.asList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    //ListView courseListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lvxml1);
        //courseListView = findViewById(R.id.listViewCourse);

        ArrayList<String> array = new ArrayList<String>(asList("HNDIT","HNDE","HNDA","HNDTHM","HNDM"));

        ArrayAdapter adopter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,array);
        lv.setAdapter(adopter);
        //courseListView.setAdapter(adopter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
                } else if (position == 1) {
                    startActivity(new Intent(MainActivity.this,MainActivity3.class));
                }else if (position == 2) {
                    //startActivity(new Intent(MainActivity.this,MainActivity.class));
                    Toast.makeText(MainActivity.this, "HNDA course is not in our Institute!", Toast.LENGTH_SHORT).show();
                }else if (position == 3) {
                    //startActivity(new Intent(MainActivity.this,MainActivity.class));
                    Toast.makeText(MainActivity.this, "HNDTHM course is not in our Institute!", Toast.LENGTH_SHORT).show();
                }else if (position == 4) {
                    //startActivity(new Intent(MainActivity.this,MainActivity.class));
                    Toast.makeText(MainActivity.this, "HNDM course is not in our Institute!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}