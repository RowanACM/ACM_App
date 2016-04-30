package com.example.acm.acmapp.Fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.acm.acmapp.Activities.CheckInActivity;
import com.example.acm.acmapp.R;

/**
 * Created by Nick on 4/30/2016.
 */
public class CheckInFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_check_in, container, false);

        final Intent switchActivityIntent = new Intent(getActivity(), CheckInActivity.class);

        Button checkIn = (Button) rootView.findViewById(R.id.check_in_button);
        checkIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(switchActivityIntent);
            }
        });



        return rootView;
    }


}
