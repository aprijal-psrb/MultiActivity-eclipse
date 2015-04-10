package com.asa.multiactivity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class Activity2 extends Activity {
	EditText editText;
	List<String> list;
	ArrayAdapter<String> adapter;
	
	@Override
	protected void onCreate(Bundle b){
		super.onCreate(b);
		setContentView(R.layout.activity2);
		editText = (EditText)findViewById(R.id.editText);
		Button btnTambah = (Button)findViewById(R.id.btnTambah);
		ListView listView = (ListView)findViewById(R.id.listView);
		list = new ArrayList<String>();
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
		listView.setAdapter(adapter);
		btnTambah.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(editText.getText().toString() != null){
					list.add(editText.getText().toString());
					editText.getText().clear();
					adapter.notifyDataSetChanged();
				}
			}
		});
	}

}
