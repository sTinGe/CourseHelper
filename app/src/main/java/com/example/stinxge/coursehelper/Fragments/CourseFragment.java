package com.example.stinxge.coursehelper.Fragments;

import android.app.Fragment;
import android.drm.DrmManagerClient;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.alamkanak.weekview.WeekView;
import com.alamkanak.weekview.WeekViewEvent;
import com.example.stinxge.coursehelper.R;
import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

import java.util.List;

/**
 * Created by stinxge on 2015/3/2.
 */
public class CourseFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View course = inflater.inflate(R.layout.course, container, false);

        // Three behavior for WeekView

        final FloatingActionsMenu menu = (FloatingActionsMenu) course.findViewById(R.id.menu);
        final FloatingActionButton action1 = (FloatingActionButton) course.findViewById(R.id.action1);
        final FloatingActionButton action2 = (FloatingActionButton) course.findViewById(R.id.action2);
        action1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.collapse();

            }
        });
        action2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.collapse();

            }
        });

        return course;
    }


}