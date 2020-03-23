package com.prf.ppjoke.ui.pulish;


import android.os.Bundle;

import com.prf.libnavannotation.ActivityDestination;
import com.prf.ppjoke.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

@ActivityDestination(pageUrl = "main/tabs/publish")
public class PublishActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publish);
    }
}
