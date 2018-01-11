package com.calc.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15,
			b16;
	EditText e1;
	String d = "";
	String s = "";
	double num1 = 0;
	double num2 = 0;
	int flag = 0;
	double ans;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		e1 = (EditText) findViewById(R.id.editText1);
		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		b4 = (Button) findViewById(R.id.button4);
		b5 = (Button) findViewById(R.id.button5);
		b6 = (Button) findViewById(R.id.button6);
		b7 = (Button) findViewById(R.id.button7);
		b8 = (Button) findViewById(R.id.button8);
		b9 = (Button) findViewById(R.id.button9);
		b10 = (Button) findViewById(R.id.button10);
		b11 = (Button) findViewById(R.id.button11);
		b12 = (Button) findViewById(R.id.button12);
		b13 = (Button) findViewById(R.id.button13);
		b14 = (Button) findViewById(R.id.button14);
		b15 = (Button) findViewById(R.id.button15);
		b16 = (Button) findViewById(R.id.button16);

		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		b6.setOnClickListener(this);
		b7.setOnClickListener(this);
		b8.setOnClickListener(this);
		b9.setOnClickListener(this);
		b10.setOnClickListener(this);
		b11.setOnClickListener(this);
		b12.setOnClickListener(this);
		b13.setOnClickListener(this);
		b14.setOnClickListener(this);
		b15.setOnClickListener(this);
		b16.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			d = d + "1";
			display(d);
			break;
		case R.id.button2:
			d = d + "2";
			display(d);
			break;
		case R.id.button3:
			d = d + "3";
			display(d);
			break;
		case R.id.button4:
			d = d + "4";
			display(d);
			break;
		case R.id.button5:
			d = d + "5";
			display(d);
			break;
		case R.id.button6:
			d = d + "6";
			display(d);
			break;
		case R.id.button7:
			d = d + "7";
			display(d);
			break;
		case R.id.button8:
			d = d + "8";
			display(d);
			break;
		case R.id.button9:
			d = d + "9";
			display(d);
			break;
		case R.id.button10:
			d = d + "0";
			display(d);
			break;
		case R.id.button11:
			s="eq";
			display(s);
			break;
		case R.id.button12:
			s="";
			display(s);
			break;
		case R.id.button13:
			s="ps";
			display(s);
			break;
		case R.id.button14:
			s="min";
			display(s);
			break;
		case R.id.button15:
			s="mul";
			display(s);
			break;
		case R.id.button16:
			s="div";
			display(s);
			break;
		}
	}

	public void display(String n) 
	{
		// Do something here
		if(n=="ps"){
			num1=Double.parseDouble(d);
			flag=1;
			d="";
			display(d);
		}
		else if(n=="min"){
			num1=Double.parseDouble(d);
			flag=2;
			d="";
			display(d);
		}
		else if(n=="mul"){
			num1=Double.parseDouble(d);
			flag=3;
			d="";
			display(d);
		}
		else if(n=="div"){
			num1=Double.parseDouble(d);
			flag=4;
			d="";
			display(d);
		}
		else if(n=="eq"){
			num2=Double.parseDouble(d);
			
			if(flag==1){
			ans=num1+num2;
			d=String.valueOf(ans);
			display(d);
			}
			else if(flag==2){
				ans=num1-num2;
				d=String.valueOf(ans);
				display(d);
				}
			else if(flag==3){
				ans=num1*num2;
				d=String.valueOf(ans);
				display(d);
				}

			else if(flag==3){
				ans=num1*num2;
				d=String.valueOf(ans);
				display(d);
				}
			else
				flag=0;
		}
		else
		{
			e1.setText(n);
		}
	}

}
