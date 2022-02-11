package com.example.colorassignment;

import android.widget.SeekBar;

/**
 * Listener for the the Red SeekBar
 *
 * implements the OnSeekBarChangeListener interface and its methods.
 */
public class RedListener implements SeekBar.OnSeekBarChangeListener {

    //private CustomElement instance variable to access its setRed() method.
    private CustomElement ce;

    //constructor for a RedListener with a parameter of a CustomElement Object
    public RedListener(CustomElement initCE){
        ce = initCE;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        //sets the red value in the CustomElement object to the progress of the seekbar
        ce.setRed(i);
        ce.setNewColor();
    }

    //not used
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //not used
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //not used
    }
}
