package com.example.volks.nanogrades;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Volks on 9/4/2016.
 */
public class Grade {

    private String mCourseName;
    private String mGrade;
    private String mCourseId;
    private int MAX_ID = 999999999;
    private int MIN_ID = 100000000;
    private int mStudentId = 0;

    /** Public Grade Constructor initialized the private vars*/
    public Grade(String courseId, String courseName, String grade)
    {
        mCourseName = courseName;
        mGrade = grade;
        mCourseId = courseId;
    }

    /**
     * Access the Grade
     * @return Grade String
     */
    public String getGrade()
    {
        return mGrade;
    }

    /**
     * Access the CourseName
     * @return courseName String
     */
    public String getCourseName()
    {
        return mCourseName;
    }

    /**
     * Access the Grade
     * @return grade String
     */
    public String getCourseId()
    {
        return mCourseId;
    }

    public void setStudentId(EditText editText)
    {
        if(verifyId(editText))
        {
            mStudentId = Integer.parseInt(editText.getText().toString());
        }
        else
        {
            /**TODO SET ERROR MESSAGE ID INVALID*/
        }
    }

    public int getStudentId()
    {
        return mStudentId;
    }

    private boolean verifyId(EditText editText)
    {
        int id = Integer.parseInt(editText.getText().toString());
        if(id >= MIN_ID && id <= MAX_ID)
        {
            return true;
        }
        return false;
    }
}
