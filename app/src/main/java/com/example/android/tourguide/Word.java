package com.example.android.tourguide;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, Miwok translation, audio file, and
 * optional image file for that word.
 */
public class Word {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * String resource ID for the default translation of the word
     */
    private int mCommonNameId;
    /**
     * String resource ID for the Miwok translation of the word
     */
    private int mScientificNameId;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Word object.
     *
     * @param CommonNameId     is the string resource ID for the word in a language that the
     *                         user is already familiar with (such as English)
     * @param ScientificNameId is the string resource Id for the word in the Miwok language
     * @param imageResourceId  is the drawable resource ID for the image associated with the word
     */
    public Word(int CommonNameId, int ScientificNameId, int imageResourceId) {
        mCommonNameId = CommonNameId;
        mScientificNameId = ScientificNameId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getCommonNameId() {
        return mCommonNameId;
    }

    /**
     * Get the string resource ID for the Miwok translation of the word.
     */
    public int getScientificNameId() {
        return mScientificNameId;
    }

    /**
     * Return the image resource ID of the word.
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