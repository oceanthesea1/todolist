package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> item;
    private ArrayAdapter<String> itemadapter;
    private ListView listView;

    public void AddItem(View view) {
        EditText edittext = (EditText) findViewById(R.id.edittext);
        String item = edittext.getText().toString();
        itemadapter.add(item);
        edittext.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item = new ArrayList<String>();
        itemadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item);
        listView = (ListView) findViewById(R.id.ListView);
        listView.setAdapter(itemadapter);



    }
}