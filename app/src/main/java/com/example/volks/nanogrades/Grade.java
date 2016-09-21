package com.example.volks.nanogrades;



/**
 * Created by Volks on 9/4/2016.
 */
public class Grade {

    private String mCourseName;
    private int mGrade;
    private String mCourseId;
    final private int MAX_ID = 999999999;
    final private int MIN_ID = 100000000;
    private int mStudentId = 0;

    /** Public Grade Constructor initialized the private vars*/
    public Grade(String courseId, String courseName, int grade){
        mCourseName = courseName;
        mGrade = grade;
        mCourseId = courseId;
    }

    /**
     * Access the Grade
     * @return Grade String
     */
    public int getGrade(){
        return mGrade;
    }

    public void setGrade(int grade){
        mGrade = grade;
    }

    /**
     * Access the CourseName
     * @return courseName String
     */
    public String getCourseName(){
        return mCourseName;
    }

    /**
     * Access the Grade
     * @return grade String
     */
    public String getCourseId(){
        return mCourseId;
    }

    public void setCourseId(String id){
        mCourseName = id;
    }

    public void setStudentId(int id){
        if(verifyId(id))
        {
            mStudentId = id;
        }
        else
        {
            /**TODO SET ERROR MESSAGE ID INVALID*/
        }
    }

    public int getStudentId(){
        return mStudentId;
    }

    private boolean verifyId(int id){
        if(id >= MIN_ID && id <= MAX_ID)
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return String.format(mStudentId + mCourseId + mCourseName + mGrade);
    }


}
