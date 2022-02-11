package com.example.colorassignment;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class GreenListener implements SeekBar.OnSeekBarChangeListener {

    //private CustomElement instance variable to access its setGreen() method.
    private CustomElement ce;

    /**
     * Listener for the the Green SeekBar
     *
     * implements the OnSeekBarChangeListener interface and its methods.
     */
    public GreenListener(CustomElement initCE){
        ce = initCE;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        //sets the green value in the CustomElement object to the progress of the seekbar
        ce.setGreen(i);
        ce.setNewColor();
    }

    //not used
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //not used
    }

    //not used
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //not used
    }
}
