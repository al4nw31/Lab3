package com.example.dnuch.lab3;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Richard's Stealth on 12/6/2017.
 */

public class Tab3Fragment extends Fragment {
    private static final String TAG = "Tab3Fragment";

//    private Button btnTEST;
    private ImageButton imageButton3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3_fragment,container,false);
        imageButton3 = (ImageButton) view.findViewById(R.id.imageButton3);

        imageButton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(getActivity(), "Still in development :(", Toast.LENGTH_SHORT).show();
            }
        });

//        btnTEST = (Button) view.findViewById(R.id.btnTEST);
//
//        btnTEST.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 3",Toast.LENGTH_SHORT).show();
//            }
//        });

        return view;
    }
}
