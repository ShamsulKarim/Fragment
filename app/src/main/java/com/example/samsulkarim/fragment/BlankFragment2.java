package com.example.samsulkarim.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment implements View.OnClickListener {


    Button fragment1, fragment3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blank_fragment2,container,false);
        fragment1 = v.findViewById(R.id.fragment1);
        fragment3 = v.findViewById(R.id.fragment3);

        fragment1.setOnClickListener(this);
        fragment3.setOnClickListener(this);


        return v;

    }

    @Override
    public void onClick(View v) {


        if(v == fragment1){

            Fragment fragment1 = new BlankFragment();

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.frag,fragment1);
            transaction.addToBackStack(null);
            transaction.commit();


        }else {


            Fragment fragment3 = new BlankFragment3();

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.frag,fragment3);
            transaction.addToBackStack(null);
            transaction.commit();


        }

    }

}
