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

public class ParentUpdate extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    EditText parentIdEt,dataEt;
    String selected;
    Spinner mySpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_parent_update);

        parentIdEt=(EditText)findViewById(R.id.editTextUpdateParent);
        dataEt=(EditText)findViewById(R.id.editTextParentData);

        mySpinner= findViewById(R.id.spinner5);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.parentField, android.R.layout.simple_spinner_item);
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
    public void onParentUpdate(View view) {
        String parentId=parentIdEt.getText().toString();
        String Data=dataEt.getText().toString();
        String field=selected;
        String type="update";
        ParentUpdateBackend bg=new ParentUpdateBackend(this);
        bg.execute(type,parentId,field,Data);
    }
}