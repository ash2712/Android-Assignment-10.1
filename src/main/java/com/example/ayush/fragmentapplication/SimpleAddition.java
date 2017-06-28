package com.example.ayush.fragmentapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SimpleAddition extends Fragment {

    // TODO: Rename and change types and number of parameters
    public static SimpleAddition newInstance(String param1, String param2) {
        //creates a new instance of class SimplaAddition
        SimpleAddition fragment = new SimpleAddition();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_simple_addition, container, false);
        //saves the fragment as a view before returning the view
        return view;
    }


}
