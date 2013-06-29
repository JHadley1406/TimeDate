package com.jhadley.timedate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class TimeDateActivity extends Activity 
{
	
	Button time;
	Button day;
	Button year;
	Button month;
	
	TextView timeView;
	TextView dayView;
	TextView yearView;
	TextView monthView;
	
	Calendar c; 
	SimpleDateFormat sdfTime;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        time = (Button) this.findViewById(R.id.timeButton);
        
        sdfTime = new SimpleDateFormat("HH:mm");
        
        time.setOnClickListener(new OnClickListener()
        				{
        					@Override
        					public void onClick(View v)
        					{
        						 timeView.setText(sdfTime.format(new Date()));       						
        					}
        		
        				});
        day.setOnClickListener(new OnClickListener()
        					{
								@Override
								public void onClick(View v)
								{
									dayView.setText(c.get(Calendar.DAY_OF_WEEK));
								}    	
        					});
        year.setOnClickListener(new OnClickListener()
        					{
								@Override
								public void onClick(View v)
								{
									yearView.setText(c.get(Calendar.YEAR));
								}
        					});
        month.setOnClickListener(new OnClickListener()
        					{
								@Override
								public void onClick(View v)
								{
									monthView.setText(c.get(Calendar.MONTH));
								}
        					});
    }
}