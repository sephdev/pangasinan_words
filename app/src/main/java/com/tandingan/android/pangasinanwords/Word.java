package com.tandingan.android.pangasinanwords;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ADMIN on 3/13/2017.
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mPangasinanTranslation;

    // Drawable resource ID
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represent no image was provided for this word */
     private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new AndroidFlavor object.
     *
     * @param defaultTranslation is the word in English or default language
     * @param pangasinanTranslation is the word in Pangasinan language
     * */
    public Word(String defaultTranslation, String pangasinanTranslation) {
        mDefaultTranslation = defaultTranslation;
        mPangasinanTranslation = pangasinanTranslation;
    }

    /**
    * Create a new AndroidFlavor object.
    *
    * @param defaultTranslation is the word in English or default language
    * @param pangasinanTranslation is the word in Pangasinan language
    * @param imageResourceId is the image from drawable resource
    * */
    public Word(String defaultTranslation, String pangasinanTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mPangasinanTranslation = pangasinanTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getPangasinanTranslation() {
        return mPangasinanTranslation;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
