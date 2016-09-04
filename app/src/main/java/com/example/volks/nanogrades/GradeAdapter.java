package com.example.volks.nanogrades;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Volks on 9/4/2016.
 */
public class GradeAdapter extends ArrayAdapter<Grade>
{

    public GradeAdapter(Activity context, ArrayList<Grade> grade)
    {
        super(context, 0, grade);
    }
    @Override
    public View getView(int pos, View convertView, ViewGroup parent)
    {
        Grade currentGrade = getItem(pos);
        View listItemView = convertView;

        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.grades_list, parent, false);
        }

        TextView idTextView = (TextView) listItemView.findViewById(R.id.courseId);
        idTextView.setText(currentGrade.getCourseId());

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.courseName);
        nameTextView.setText(currentGrade.getCourseName());

        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.courseGrade);
        gradeTextView.setText(currentGrade.getGrade());


        return listItemView;
    }
}
