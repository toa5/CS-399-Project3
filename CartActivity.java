package com.CS399.ibuy;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;


public class CartActivity extends IBuyActivity 
{
	public CartActivity()
	{	super(R.layout.activity_cart);}
	
	@Override
	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
		LinearLayout layout = (LinearLayout) this.findViewById(R.id.cartLayout);
		layout.setWeightSum(items.size());
		for(String str : items)
		{
			TextView view = new TextView(this);
			view.setText(str);
			view.setLayoutParams(new LayoutParams(
								(int)getResources().getDimension(R.dimen.layout_width), 
								LayoutParams.WRAP_CONTENT, 1/items.size()));
			layout.addView(view);
		}
	}
}
