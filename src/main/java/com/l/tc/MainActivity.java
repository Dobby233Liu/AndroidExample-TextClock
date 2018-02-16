package com.l.tc;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.pm.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
	setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);  
        setContentView(R.layout.a);
    }
}
