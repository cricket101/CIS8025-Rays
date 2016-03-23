package com.example.firstexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloWorldActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_world);
		
		Button displayButton = (Button) findViewById(R.id.button1);
		Button clearButton = (Button) findViewById(R.id.button2);
		displayButton.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0){
				
				EditText firstName = (EditText) findViewById(R.id.editText1);
				EditText lastName = (EditText) findViewById(R.id.editText2);
				TextView textDisplay = (TextView) findViewById(R.id.textView2);
				
				String name = firstName.getText() + " " + lastName.getText();
				
				textDisplay.setText("Hello " + name);
				
			}
			
			
		});
		clearButton.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0){
				
				EditText firstName = (EditText) findViewById(R.id.editText1);
				EditText lastName = (EditText) findViewById(R.id.editText2);
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
		getMenuInflater().inflate(R.menu.hello_world, menu);
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
	
	public void initDisplayButton(){
		
		
	}
	
	
	
	
	
	
	
	
}
