package com.example.stinxge.coursehelper;

import android.os.Bundle;

import com.example.stinxge.coursehelper.Fragments.CourseFragment;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;

/**
 * Created by stinxge on 2015/3/2.
 */
public class MainActivity extends MaterialNavigationDrawer {
    @Override
    public void init(Bundle savedInstanceState) {
        setDrawerHeaderImage(R.drawable.book_header);
        setUsername("Course Helper");
        setUserEmail("v 1.0");

        //create section
        this.addSection(newSection("Course", new CourseFragment()));
    }
}