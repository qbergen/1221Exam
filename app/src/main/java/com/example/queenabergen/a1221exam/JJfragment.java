package com.example.queenabergen.a1221exam;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by queenabergen on 12/21/16.
 */

public class JJfragment extends Fragment {
    public TextView mTextView;
    String getBackColor;


    public JJfragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.jjserverfragment, container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTextView = (TextView) view.findViewById(R.id.textView);


        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animal animal = new Animal();
                String mUpdateBackgroundColor = animal.getBackground().toString();
                mTextView.setText(mUpdateBackgroundColor);

            }
        });
    }
}
