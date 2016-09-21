package com.example.volks.nanogrades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String studentId = intent.getStringExtra("STUDENT_ID");


        ArrayList<Grade> courseList =  new ArrayList<Grade>();

        /** Gets a List of Course IDs from XML resources*/
        String[] courseId = getResources().getStringArray(R.array.courseIDs);
        /** Gets a List of Course Names from XML resources*/
        String[] courseName = getResources().getStringArray(R.array.CourseNames);
        /** Get a list of Randomly Generated Grades by the generateGrades function */
        String[] courseGrade = generateGrades(courseId.length);
        /** Populates Grade List*/
        for(int i = 0; i < courseId.length; i++)
        {
            courseList.add(new Grade(courseId[i], courseName[i], courseGrade[i]));
        }
        GradeAdapter gradeAdapter = new GradeAdapter(this, courseList);
        /** Creates a Title Header for the Grades using Title_bar layout*/
        View titles = getLayoutInflater().inflate(R.layout.title_bar, null);
        TextView textView = (TextView)titles.findViewById(R.id.id_text);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.addHeaderView(titles);

        listView.setAdapter(gradeAdapter);
        textView.setText(studentId);
    }

    /**
     * Creates a list of Random Grades from 1 - 5
     * @param len number of grades to generate
     * @return returns String[] of the Grades generated
     */
    private String[] generateGrades(int len)
    {
        String[] finalGrades = new String[len];
        Random r = new Random();

        for(int i = 0; i < len; i++)
        {
            /**Generates Random Number between 1 and 5*/
            int rand = r.nextInt(5)+1;
            /** Stores it as String in the FinalGrades String array*/
            finalGrades[i] = Integer.toString(rand);
        }
        return finalGrades;
    }
}

