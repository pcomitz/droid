package com.is413.simpleeventspring2013;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	//Mac - cmd |shift| o for auto import, Win ctrl|shift|o 
	private TextView tv; 
	private Button b1; 
	private Button b2; 
	private static int count =0; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//get the id of each view
		tv = (TextView)findViewById(R.id.textView);
		b1 = (Button)findViewById(R.id.button1);
		b2 = (Button)findViewById(R.id.button2);
		
		b1.setOnClickListener(new MyListener());
		b2.setOnClickListener(new MyListener());
	}	
	private class MyListener implements OnClickListener
	{		
		@Override
		public void onClick(View arg0) {
			switch(arg0.getId())
			{
				case  R.id.button1 :
				{
					count++;
					if(count % 2 == 0)
					{
						b1.setText("Increment Count");
					}
					else
					{
						b1.setText("increment count");
					}
					break;
				}
				
				case R.id.button2 :
				{
					tv.setText("Click Count is:"+count);
				}
				default :
				{
					System.out.println("No mathcing event id");
				}
			}		
		}
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
