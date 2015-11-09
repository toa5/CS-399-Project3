package com.CS399.ibuy;

import android.app.Activity;
import android.os.Bundle;

public abstract class IBuyActivity extends Activity 
{
	final int layout;
	IBuyActivity(int layout)
	{	this.layout = layout;}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(layout);
	}
}
