package edu.ivytech.officecrimetracker;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private boolean mNewCrime;
    private String mSuspect;

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mID = id;
        mDate = new Date();
        mNewCrime = true;
    }

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public boolean isNewCrime() {
        return mNewCrime;
    }

    public void setNewCrime(boolean newCrime) {
        mNewCrime = newCrime;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }
}
