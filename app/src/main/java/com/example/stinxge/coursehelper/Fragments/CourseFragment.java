package com.example.stinxge.coursehelper.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.stinxge.coursehelper.MainActivity;
import com.example.stinxge.coursehelper.R;
import com.getbase.floatingactionbutton.FloatingActionButton;

/**
 * Created by stinxge on 2015/3/2.
 */
public class CourseFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.course, container, false);
        FloatingActionButton button = (FloatingActionButton) view.findViewById(R.id.course_icon);
        button.setIcon(R.drawable.course);
        button.setStrokeVisible(false);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "click button", Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }
}