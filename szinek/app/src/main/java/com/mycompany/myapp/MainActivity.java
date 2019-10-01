package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.graphics.*;
import java.util.*;

public class MainActivity extends Activity 
{
	SeekBar csuszkar;
	SeekBar csuszkag;
	SeekBar csuszkab;
	TextView red;
	TextView green;
	TextView blue;
	TextView szin;
	int r=0;
	int g=0;
	int b=0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		init();
		csuszkar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
		{
			@Override
			public void onStartTrackingTouch(SeekBar seekBar)
			{
				
			}

			public void onStopTrackingTouch(SeekBar seekBar)
			{
				
			}
			
		    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				r=csuszkar.getProgress();
				szin.setBackgroundColor(Color.rgb(r,g,b));
				red.setText("red: "+r);
				szin.setText("("+r+";"+g+";"+b+")");
			}
				
		});
		csuszkag.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
		{
				@Override
				public void onStartTrackingTouch(SeekBar seekBar)
				{

				}

				public void onStopTrackingTouch(SeekBar seekBar)
				{

				}

				public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
					g=csuszkag.getProgress();
					szin.setBackgroundColor(Color.rgb(r,g,b));
					green.setText("green: "+g);
					szin.setText("("+r+";"+g+";"+b+")");
				}
		});
		csuszkab.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
		{
				@Override
				public void onStartTrackingTouch(SeekBar seekBar)
				{

				}

				public void onStopTrackingTouch(SeekBar seekBar)
				{

				}

				public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
					b=csuszkab.getProgress();
					szin.setBackgroundColor(Color.rgb(r,g,b));
					blue.setText("blue: "+b);
					szin.setText("("+r+";"+g+";"+b+")");
				}
		});
	}
	
	public void init()
	{
		csuszkar=findViewById(R.id.csuszkar);
		csuszkag=findViewById(R.id.csuszkag);
		csuszkab=findViewById(R.id.csuszkab);
		red=findViewById(R.id.red);
		green=findViewById(R.id.green);
		blue=findViewById(R.id.blue);
		szin=findViewById(R.id.szin);
	}
	
}
