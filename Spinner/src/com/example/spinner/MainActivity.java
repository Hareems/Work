
package com.example.spinner;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

  private Spinner spinner1, spinner2, spinner3;
  private Button button;

  @Override
  public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);

	addItemsOnSpinner2();
	addItemsOnSpinner3();
	addListenerOnButton();
	addListenerOnSpinnerItemSelection();
  }

  // add items into spinner dynamically
  public void addItemsOnSpinner2() {

	spinner2 = (Spinner) findViewById(R.id.spinner2);
	List list = new ArrayList();
	list.add("1");
	list.add("2");
	list.add("3");
	list.add("4");
	list.add("5");
	list.add("6");
	list.add("7");
	list.add("8");
	list.add("9");
	list.add("10");
	ArrayAdapter dataAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, list);
	dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinner2.setAdapter(dataAdapter);
  }

  public void addItemsOnSpinner3() {

		spinner3 = (Spinner) findViewById(R.id.spinner3);
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
		ArrayAdapter dataAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner3.setAdapter(dataAdapter);
	  }
  public void addListenerOnSpinnerItemSelection() {
	spinner1 = (Spinner) findViewById(R.id.spinner1);
	spinner1.setOnItemSelectedListener(new MyOnItemSelectedListener());
  }

  public void addListenerOnButton() {

	spinner1 = (Spinner) findViewById(R.id.spinner1);
	spinner2 = (Spinner) findViewById(R.id.spinner2);
	spinner3 = (Spinner) findViewById(R.id.spinner3);
	button = (Button) findViewById(R.id.button);

	button.setOnClickListener(new OnClickListener() {

	  @Override
	  public void onClick(View v) {

	    Toast.makeText(MainActivity.this,
		"Result : " + 
                "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()) + 
                "\nSpinner 2 : "+ String.valueOf(spinner2.getSelectedItem()) +
                "\nSpinner 2 : "+ String.valueOf(spinner2.getSelectedItem()),
			Toast.LENGTH_SHORT).show();
	  }

	});
  }
}