package com.example.kuldeep.slidingmenu;

import android.app.Fragment;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by kuldeep on 8/24/2015.
 */
public class WhatsHotFragment extends Fragment {

    public WhatsHotFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_hot, container, false);

        return rootView;
    }
}
