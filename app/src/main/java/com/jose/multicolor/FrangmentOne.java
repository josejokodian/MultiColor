package com.jose.multicolor;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;


/**
 * A simple {@link Fragment} subclass.
 */
public class FrangmentOne extends Fragment implements View.OnClickListener {

    NavController navController=null;

    public FrangmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frangment_one, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        Button buttonFragOne=view.findViewById(R.id.buttonFragOne);
        buttonFragOne.setOnClickListener(this);
        Button buttonFragTwo=view.findViewById(R.id.buttonFragTwo);
        buttonFragTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonFragOne:
                navController.navigate(R.id.action_frangmentOne_to_fragmentTwo);
                break;
            case R.id.buttonFragTwo:
                navController.navigate(R.id.action_frangmentOne_to_fragmentThree);
                break;

        }
    }
}
