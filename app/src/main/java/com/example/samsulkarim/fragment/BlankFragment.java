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
public class BlankFragment extends Fragment implements View.OnClickListener{

    Button fragment2,fragment3;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_blank,container,false);

        fragment2 = v.findViewById(R.id.fragment2);
        fragment3 = v.findViewById(R.id.fragment3);
        fragment2.setOnClickListener(this);
        fragment3.setOnClickListener(this);


        return v;

    }

    @Override
    public void onClick(View v) {


        if(v == fragment2){

            Fragment fragment2 = new BlankFragment2();

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.frag,fragment2);
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
