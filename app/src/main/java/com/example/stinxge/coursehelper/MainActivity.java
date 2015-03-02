package com.example.stinxge.coursehelper;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.stinxge.coursehelper.Fragments.FragmentIndex;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;
import it.neokree.materialnavigationdrawer.elements.MaterialAccount;

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
        this.addSection(newSection("Section1", new FragmentIndex()));
        this.addSection(newSection("Section2", new FragmentIndex()));
    }
}