package com.example.gabrielmoura.ace1;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class apresenta_3_Fragment extends Fragment {
    private Button button2ss;
    Intent intent1 = ((Apresenta)getActivity()).getIntent();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.fragment_apresenta_3, container, false);
        Button next3 = (Button) view.findViewById(R.id.change_message_1);

        next3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((Apresenta)getActivity()).setViewPager(0);
            }
        });
        return view;
    }
}
