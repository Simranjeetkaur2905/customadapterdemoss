package com.example.customadapterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        List<Person> personList = new ArrayList<>();

        for(int i = 1; i <= 20 ; i ++){
            Person person = new Person("Person" + i , i ,"person" +i + "mail.com");
            personList.add(person);

        }

        personadapter personadapter = new personadapter(this,R.layout.personlayout,personList);
        listView.setAdapter(personadapter);
    }
}
