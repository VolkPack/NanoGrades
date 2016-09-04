package com.example.volks.nanogrades;

/**
 * Created by Volks on 9/4/2016.
 */
public class Grade {

    private String mCourseName;
    private String mGrade;
    private String mCourseId;

    public Grade(String courseId, String courseName, String grade)
    {
        mCourseName = courseName;
        mGrade = grade;
        mCourseId = courseId;
    }

    public String getGrade()
    {
        return mGrade;
    }

    public String getCourseName()
    {
        return mCourseName;
    }

    public String getCourseId()
    {
        return mCourseId;
    }
}
