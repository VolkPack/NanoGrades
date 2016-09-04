package com.example.volks.nanogrades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Grade> courseList =  new ArrayList<Grade>();
        courseList.add(new Grade("ABC123", "Adanced Calculus", "C"));
        courseList.add(new Grade("ABC124", "Adanced Calculus", "d"));
        courseList.add(new Grade("ABC125", "Adanced Calculus", "5"));
        courseList.add(new Grade("ABC127", "Adanced Calculus", "g"));
        courseList.add(new Grade("ABC128", "Adanced Calculus", "d"));
        courseList.add(new Grade("ABC124", "Adanced Calculus", "NA"));
        courseList.add(new Grade("ABC122", "Adanced Calculus", "4"));
        courseList.add(new Grade("ABC113", "Adanced Calculus", "4"));
        courseList.add(new Grade("ABC143", "Adanced Calculus", "6"));
        courseList.add(new Grade("ABC523", "Adanced Calculus", "8"));
        courseList.add(new Grade("ABC123", "Adanced Calculus", "C"));
        courseList.add(new Grade("ABC124", "Adanced Calculus", "d"));
        courseList.add(new Grade("ABC125", "Adanced Calculus", "5"));
        courseList.add(new Grade("ABC127", "Adanced Calculus", "g"));
        courseList.add(new Grade("ABC128", "Adanced Calculus", "d"));
        courseList.add(new Grade("ABC124", "Adanced Calculus", "NA"));
        courseList.add(new Grade("ABC122", "Adanced Calculus", "4"));
        courseList.add(new Grade("ABC113", "Adanced Calculus", "4"));
        courseList.add(new Grade("ABC143", "Adanced Calculus", "6"));
        courseList.add(new Grade("ABC523", "Adanced Calculus", "8"));
        courseList.add(new Grade("ABC123", "Adanced Calculus", "C"));
        courseList.add(new Grade("ABC124", "Adanced Calculus", "d"));
        courseList.add(new Grade("ABC125", "Adanced Calculus", "5"));
        courseList.add(new Grade("ABC127", "Adanced Calculus", "g"));
        courseList.add(new Grade("ABC128", "Adanced Calculus", "d"));
        courseList.add(new Grade("ABC124", "Adanced Calculus", "NA"));
        courseList.add(new Grade("ABC122", "Adanced Calculus", "4"));
        courseList.add(new Grade("ABC113", "Adanced Calculus", "4"));
        courseList.add(new Grade("ABC143", "Adanced Calculus", "6"));
        courseList.add(new Grade("ABC523", "Adanced Calculus", "8"));



        GradeAdapter gradeAdapter = new GradeAdapter(this, courseList);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(gradeAdapter);
    }
}
