package com.example.easycalc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends Activity {

	String myoperator;
	double res;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		Button submit = (Button) findViewById(R.id.button1);
		submit.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				EditText value1 = (EditText) findViewById(R.id.editText1);
				EditText value2 = (EditText) findViewById(R.id.editText2);
				final TextView val3 = (TextView) findViewById(R.id.textView4);

				String val1 = value1.getText().toString();
				if(val1 == null || val1.length() == 0 || val1.trim().length() == 0)
				{
					//prompt user to enter a value and remove spaces
					return;
				}
				double num1 = 0.0;

				try
				{
					num1 = Double.parseDouble(val1);
				}
				catch(NumberFormatException nfe)
				{
					
					//prompt user to enter string
					return;
				}

				String val2 = value2.getText().toString();
				if(val2 == null || val2.length() == 0 || val2.trim().length() == 0)
				{
					//prompt user to enter a value and remove spaces
					return;
				}
				double num2 = 0.0;

				try
				{
					num2 = Double.parseDouble(val2);
				}
				catch(NumberFormatException nfe)
				{
					//prompt user to enter string
					return;
				}
				

				Spinner Text = (Spinner) findViewById(R.id.spinner1);
				myoperator=Text.getSelectedItem().toString();


			    if(myoperator.equals("add"))
				{
					res = num1+num2;
				}	
				if(myoperator.equals("sub"))
				{
					res = num1-num2;
				}
				if(myoperator.equals("prod"))
				{
					res = num1*num2;
				}
				if(myoperator.equals("divide"))
				{
					res = num1/num2;
				}
				val3.setText(Double.valueOf(res).toString());
			}
		});


	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


}
