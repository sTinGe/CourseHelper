package com.example.stinxge.coursehelper.Fragments;

import android.app.Fragment;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
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
import com.getbase.floatingactionbutton.FloatingActionsMenu;

/**
 * Created by stinxge on 2015/3/2.
 */
public class CourseFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View course = inflater.inflate(R.layout.course, container, false);

        final FloatingActionButton action1 = (FloatingActionButton) course.findViewById(R.id.action1);
        action1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action1.setTitle("action1 has been clicked!");
            }
        });

        final FloatingActionButton action2 = (FloatingActionButton) course.findViewById(R.id.action2);
        action2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action2.setTitle("action2 has been clicked!");
            }
        });

        return course;
    }
}