package com.example.volks.nanogrades;

/**
 * Created by Volks on 9/4/2016.
 */
public class Grade {

    private String mCourseName;
    private String mGrade;
    private String mCourseId;

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
}
