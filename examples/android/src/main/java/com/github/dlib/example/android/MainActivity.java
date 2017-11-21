package com.github.dlib.example.android;

import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.main_activity)
public class MainActivity extends AppCompatActivity {

    @ViewById
    ImageView imageView;

}
