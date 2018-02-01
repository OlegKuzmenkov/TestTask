package com.oleg_kuzmenkov.android.simplenotes;

/**
 * Created by nrg on 28.01.2018.
 */

public class Note {

    private String mTitle;
    private String mNote;
    private boolean mSelected;

    public Note() {

    }


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public boolean isSelected() {
        return mSelected;
    }

    public void setSolved(boolean selected) {
        mSelected = selected;
    }
}
