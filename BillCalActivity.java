package com.example.bonusbillcalculator;


import com.example.bonusbillcalculator.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class BillCalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bill_cal);
	
		Button displayButton = (Button) findViewById(R.id.button1);
		Button clearButton = (Button) findViewById(R.id.button2);
		displayButton.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0){
				
				EditText billAmount = (EditText) findViewById(R.id.editText1);
				EditText tipRate = (EditText) findViewById(R.id.editText2);
				
								
				TextView textDisplay = (TextView) findViewById(R.id.textView2);
				
				String s1 = billAmount.getText().toString();
				String s2 = tipRate.getText().toString();
				final double a = Double.valueOf(s1.trim());
				final double b = Double.valueOf(s2.trim());
				
				
				double totalAmount = a * ( 1+ b / 100);
				double finalValue = Math.round( totalAmount * 100.0 ) / 100.0;
				
				textDisplay.setText("Your Total Bill is:  " + finalValue);
				
			}
			
			
		});
		clearButton.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0){
				
				findViewById(R.id.editText1);
				findViewById(R.id.editText2);
				TextView textDisplay = (TextView) findViewById(R.id.textView2);
				
				TextView editTextDisplay1 = (TextView) findViewById(R.id.editText1);
				TextView editTextDisplay2 = (TextView) findViewById(R.id.editText2);
				//String name = firstName.getText() + " " + lastName.getText();
				
				textDisplay.setText("Hello World ");
				
				editTextDisplay1.setText(" ");
				editTextDisplay2.setText(" ");
				
				
				
			}
			
			
		});
	
	
	
	
	
	
	
	
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bill_cal, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
