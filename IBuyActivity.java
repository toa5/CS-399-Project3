package com.CS399.ibuy;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public abstract class IBuyActivity extends Activity 
{
	final int layout;
	protected static ArrayList<String> items = new ArrayList<String>();
	
	IBuyActivity(int layout)
	{	this.layout = layout;}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(layout);
	}
	
	private void start(Class<?> cls)
	{	startActivity(new Intent(this, cls));}
	
	public void gotoCategories(View view)
	{	start(CategoryActivity.class);}
	
	public void gotoCart(View view)
	{	start(CartActivity.class);}
	
	public void gotoFood(View view)
	{	start(FoodActivity.class);}
	
	public void gotoCleaning(View view)
	{	start(CleaningActivity.class);}
	
	public void gotoElec(View view)
	{	start(ElectronicsActivity.class);}
	
	public void gotoServices(View view)
	{	start(ServicesActivity.class);}
}
