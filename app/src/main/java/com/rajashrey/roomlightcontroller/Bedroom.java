package com.rajashrey.roomlightcontroller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Rajashrey on 03-10-2017.
 */

public class Bedroom extends Fragment {
    public Bedroom(){
    }

    private static final String ARG_SECTION_NUMBER = "section_number";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText("Bedroom Switches...");
        return rootView;
    }
}
