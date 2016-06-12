package com.bignerdranch.android.geoquiz;

/**
 * Created by viktor on 23.10.2015.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }

    TrueFalse(int question,boolean trueQuestion){
        mQuestion=question;
        mTrueQuestion=trueQuestion;

    }
}
