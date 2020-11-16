package com.example.myapp4;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class ChildUpdate extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    EditText childIdEt,dataEt;
    String selected;
    Spinner mySpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_child_update);
        childIdEt=(EditText)findViewById(R.id.editTextUpdateChildId);
        dataEt=(EditText)findViewById(R.id.editTextChildData);

        mySpinner= findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.childField, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(adapter);
        mySpinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        selected=parent.getItemAtPosition(pos).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

    public void onChildUpdate(View view) {
        String childId=childIdEt.getText().toString();
        String Data=dataEt.getText().toString();
        String field=selected;
        String type="update";
        ChildUpdateBackend bg=new ChildUpdateBackend(this);
        bg.execute(type,childId,field,Data);
    }

}