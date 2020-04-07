package com.aamir.fragmentwithdata;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class MalikFragment extends Fragment {


    public MalikFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_malik, container, false);

        Bundle bundle=getArguments();
        if(bundle!=null){
            String message=bundle.getString("key");

            TextView textView=view.findViewById(R.id.textview);
            textView.setText(message);
        }
        return view;
    }

}
