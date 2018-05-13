package com.example.android.reportcardjava;

/**
 * Created by Tudor on 19.02.2017.
 */

public class ReportCardTudor {
    // Private String for StudentName
    private String mStudentName;

    // Private String for MathClass
    private String mMathClass;

    // Private String for ProgramingClass
    private String mProgramingClass;

    // Private String for ArtClass
    private String mArtClass;

    // Private int for MathGrade
    private int mMathGrade;

    // Private int for ProgramingGrade
    private int mProgramingGrade;

    // Private int for ArtGrade
    private int mArtGrade;

    // Public Constructor so that we can use the private int and Strings
    public ReportCardTudor(String mStudentName, String mMathClass, int mMathGrade, String mProgramingClass, int mProgramingGrade, String mArtClass, int mArtGrade) {
        setSchool(mStudentName, mMathClass, mMathGrade, mProgramingClass, mProgramingGrade, mArtClass, mArtGrade);
    }

    // Private method in which we created constructors for the int and Strings
    public void setSchool(String mStudentName, String mMathClass, int mMathGrade, String mProgramingClass, int mProgramingGrade, String mArtClass, int mArtGrade) {
        setSnmae(mStudentName);
        setMclass(mMathClass);
        setMgrade(mMathGrade);
        setPclass(mProgramingClass);
        setPgradde(mProgramingGrade);
        setAclass(mArtClass);
        setAgrade(mArtGrade);
    }

    // Assigning setSname a constructor
    public void setSnmae(String mStudentName) {
        this.mStudentName = mStudentName;
    }

    // Assigning setMclass a constructor
    public void setMclass(String mMathClass) {
        this.mMathClass = mMathClass;
    }

    // Assigning setMgrade a constructor
    public void setMgrade(int mMathGrade) {
        this.mMathGrade = mMathGrade;
    }

    // Assigning setPclass a constructor
    public void setPclass(String mProgramingClass) {
        this.mProgramingClass = mProgramingClass;
    }

    // Assigning setPgrade a constructor
    public void setPgradde(int mProgramingGrade) {
        this.mProgramingGrade = mProgramingGrade;
    }

    // Assigning setAclass a constructor
    public void setAclass(String mArtClass) {
        this.mArtClass = mArtClass;
    }

    // Assigning setAgrade a constructor
    public void setAgrade(int mArtGrade) {
        this.mArtGrade = mArtGrade;
    }

    // Creating a format-able String
    public String getmStudentName() {
        return mStudentName;
    }

    // Creating a format-able String
    public String getmMathClass() {
        return mMathClass;
    }

    // Creating a format-able int
    public int getmMathGrade() {
        return mMathGrade;
    }

    // Creating a format-able String
    public String getmProgramingClass() {
        return mProgramingClass;
    }

    // Creating a format-able int
    public int getmProgramingGrade() {
        return mProgramingGrade;
    }

    // Creating a format-able String
    public String getmArtClass() {
        return mArtClass;
    }

    // Creating a format-able int
    public int getmArtGrade() {
        return mArtGrade;
    }


    @Override
    // Public  method StringBuilder to help us print on screen the Strings and int
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student Name: Tudor");
        sb.append("\nMath Class: " + mArtGrade);
        sb.append("\nPrograming Class: " + mProgramingGrade);
        sb.append("\nArt Class: " + mArtGrade);
        return sb.toString();
    }

}
