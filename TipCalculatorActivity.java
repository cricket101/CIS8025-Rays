package com.example.tipcalculator;

import com.example.tipcalculator.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class TipCalculatorActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);
		onDefault();
		onFinishEntry();
		onClickRadioButton();
		onClickPlusButton();
		onClickMinusButton();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tip_calculator, menu);
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
	
	public void onDefault() {
		EditText editName1 = (EditText) findViewById(R.id.editText2);
		EditText editName2 = (EditText) findViewById(R.id.editText3);
		editName1.setText(String.valueOf(0));
		editName2.setText(String.valueOf(0));
		RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
		radioGroup1.clearCheck();
		
	}
	
	public void onFinishEntry() {
		EditText editName1 = (EditText) findViewById(R.id.editText1);
		editName1.setOnFocusChangeListener(new OnFocusChangeListener() 
		{
			public void onFocusChange(View v, boolean hasFocus) {
				if (!hasFocus) {
					EditText editName2 = (EditText) findViewById(R.id.editText1);
					EditText editName3 = (EditText) findViewById(R.id.editText4);
					double bill_amount = Double.parseDouble(editName2.getText().toString());
					editName3.setText(String.valueOf(bill_amount));
				      }
			}
			
		});
	}
	
	public void onClickPlusButton() {
		Button plusButton = (Button) findViewById(R.id.button1);
		plusButton.setOnClickListener(new OnClickListener() 
		{
			
			public void onClick(View arg0) {
				//RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
				//radioGroup1.clearCheck();
				EditText editName1 = (EditText) findViewById(R.id.editText1);
				EditText editName2 = (EditText) findViewById(R.id.editText2);
				EditText editName3 = (EditText) findViewById(R.id.editText3);
				EditText editName4 = (EditText) findViewById(R.id.editText4);
				double bill_amount = Double.parseDouble(editName1.getText().toString());
				int tip_per = Integer.parseInt(editName2.getText().toString());
				double tip_amount = (bill_amount * (tip_per + 1)) / 100;
				editName2.setText(String.valueOf(tip_per + 1));
				editName3.setText(String.valueOf(tip_amount));
				editName4.setText(String.valueOf(bill_amount + tip_amount));
			}
		});
	}
	
	public void onClickMinusButton() {
		Button minusButton = (Button) findViewById(R.id.button2);
		minusButton.setOnClickListener(new OnClickListener() 
		{
			
			public void onClick(View arg0) {
				//RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
				//radioGroup1.clearCheck();
				EditText editName1 = (EditText) findViewById(R.id.editText1);
				EditText editName2 = (EditText) findViewById(R.id.editText2);
				EditText editName3 = (EditText) findViewById(R.id.editText3);
				EditText editName4 = (EditText) findViewById(R.id.editText4);
				double bill_amount = Double.parseDouble(editName1.getText().toString());
				int tip_per = Integer.parseInt(editName2.getText().toString());
				double tip_amount = (bill_amount * (tip_per - 1)) / 100;
				if(tip_amount >= 0){
				editName2.setText(String.valueOf(tip_per - 1));
				editName3.setText(String.valueOf(tip_amount));
				editName4.setText(String.valueOf(bill_amount + tip_amount));
				}
			}
		});
	}
	
	public void onClickRadioButton() {
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
		radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() 
		{
			
			public void onCheckedChanged (RadioGroup rGroup, int checkedId)  {
				RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
				RadioButton radioButton = (RadioButton) radioGroup1.findViewById(checkedId);
			    String selection = (String) radioButton.getText();
			    Log.d("tag", "Selection Value: " + selection);
			    
			
			    if (selection.equals("15"))
			    {
			    	EditText editName1 = (EditText) findViewById(R.id.editText1);
					EditText editName2 = (EditText) findViewById(R.id.editText2);
					EditText editName3 = (EditText) findViewById(R.id.editText3);
					EditText editName4 = (EditText) findViewById(R.id.editText4);
					
			    	double bill_amount = Double.parseDouble(editName1.getText().toString());
					int tip_per = 15;
					double tip_amount = (bill_amount * tip_per) / 100;
					editName2.setText(String.valueOf(tip_per));
					editName3.setText(String.valueOf(tip_amount));
					editName4.setText(String.valueOf(bill_amount + tip_amount));
				
			    }
			    
			    if (selection.equals("20"))
			    {
			    	EditText editName1 = (EditText) findViewById(R.id.editText1);
					EditText editName2 = (EditText) findViewById(R.id.editText2);
					EditText editName3 = (EditText) findViewById(R.id.editText3);
					EditText editName4 = (EditText) findViewById(R.id.editText4);
					
			    	double bill_amount = Double.parseDouble(editName1.getText().toString());
			    	Log.d("tag", "Bill Amount: " + bill_amount);
					int tip_per = 20;
					double tip_amount = (bill_amount * tip_per) / 100;
					Log.d("tag", "Tip Amount: " + tip_amount);
					editName2.setText(String.valueOf(tip_per));
					editName3.setText(String.valueOf(tip_amount));
					editName4.setText(String.valueOf(bill_amount + tip_amount));
				
			    }
			    
			    if (selection.equals("25"))
			    {
			    	EditText editName1 = (EditText) findViewById(R.id.editText1);
					EditText editName2 = (EditText) findViewById(R.id.editText2);
					EditText editName3 = (EditText) findViewById(R.id.editText3);
					EditText editName4 = (EditText) findViewById(R.id.editText4);
					
			    	double bill_amount = Double.parseDouble(editName1.getText().toString());
					int tip_per = 25;
					double tip_amount = (bill_amount * tip_per) / 100;
					editName2.setText(String.valueOf(tip_per));
					editName3.setText(String.valueOf(tip_amount));
					editName4.setText(String.valueOf(bill_amount + tip_amount));
				
			    }
				
			}
		});
	}
}
