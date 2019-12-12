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


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentThree extends Fragment implements View.OnClickListener {
    NavController navController = null;

    public FragmentThree() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_three, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        Button btnFragThreeToFour = view.findViewById(R.id.btnFragThreeToFour);
        Button btnFragThreeCancel = view.findViewById(R.id.btnFragThreeCancel);
        btnFragThreeCancel.setOnClickListener(this);
        btnFragThreeToFour.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnFragThreeToFour:
                navController.navigate(R.id.action_fragmentThree_to_fragmentFive);
                break;
            case R.id.btnFragThreeCancel:
                getActivity().onBackPressed();
        }
    }
}
