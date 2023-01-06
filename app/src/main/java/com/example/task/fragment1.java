package com.example.task;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class fragment1<i> extends Fragment {
    mod m = new mod();
    TextView txt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);

        return view;
//        int[] marks = m.sens(4);
//        int total = 0;
//        for (i =0 , i<marks.length();i++){
//            total = total+ marks[i];
//        }
//        marks
    }



}