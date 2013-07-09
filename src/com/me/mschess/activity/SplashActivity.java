package com.me.mschess.activity;

import java.util.Timer;
import java.util.TimerTask;

import com.example.mschess.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

	private long splashDelay = 6000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

	    TimerTask task = new TimerTask() {
	        @Override
	        public void run() {
	          Intent mainIntent = new Intent().setClass(SplashActivity.this, MainActivity.class);
	          startActivity(mainIntent);
	          finish();
	        }
	      };
	      Timer timer = new Timer();
	      timer.schedule(task, splashDelay);
	}
}
