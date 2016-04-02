package com.example.mycontactlist;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.os.Build;

public class ContactMapActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact_map);
		
		//initMapButton();
		initListButton();
		initSettingsButton();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contact_map, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_contact_map, container, false);
			return rootView;
		}
	}
	private void initListButton(){
		ImageButton list = (ImageButton)
	findViewById(R.id.imageButtonList);
		list.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v){
				Intent intent = new Intent(ContactMapActivity.this, 
	ContactListActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
			
			
		});
		
	}

	private void initMapButton(){
		
		ImageButton list = (ImageButton)
	findViewById(R.id.imageButtonMap);
		list.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v){
				Intent intent = new Intent(ContactMapActivity.this, 
	ContactMapActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
			
			
		});
	}
	
	private void initSettingsButton(){
		ImageButton list = (ImageButton)
	findViewById(R.id.imageButtonSettings);
		list.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v){
				Intent intent = new Intent(ContactMapActivity.this, 
	ContactSettingsActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
			
			
		});
	}
}
