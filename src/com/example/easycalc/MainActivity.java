package com.example.easycalc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Button;
import android.view.View;


public class MainActivity extends Activity {

	String myoperator;
	double res;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        EditText val1 = (EditText) findViewById(R.id.editText1);
    	EditText val2 = (EditText) findViewById(R.id.editText2);
    	final EditText val3 = (EditText) findViewById(R.id.editText3);
    
    	double num1=Double.parseDouble(val1.getText().toString());
    	double num2=Double.parseDouble(val2.getText().toString());
    
    	Spinner Text = (Spinner) findViewById(R.id.spinner1);
    	myoperator=Text.getSelectedItem().toString();
    
    	if(myoperator.equals("add"))
    		res = num1+num2;
    		
    	if(myoperator.equals("sub"))
    	 	res = num1-num2;
    	
    	if(myoperator.equals("prod"))
    	 	res = num1*num2;
    	
    	if(myoperator.equals("divide"))
    	 	res = num1/num2;
    		
    	Button submit = (Button) findViewById(R.id.button1);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	val3.setText(new Double(res).toString());
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
