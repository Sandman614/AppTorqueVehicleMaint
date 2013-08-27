package com.sandz.apptorquevehiclemaint;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Vehicles extends Activity {
//small change
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vehicles);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.vehicles, menu);
		return true;
	}

}
