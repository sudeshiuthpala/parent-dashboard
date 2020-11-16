package com.example.myapp4;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;

public class SelectChild extends AppCompatActivity {
    EditText childIdEt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_select_child);
        childIdEt=(EditText)findViewById(R.id.editTextChildId2);
    }

    public void onChildSelect(View view) {
        String childId=childIdEt.getText().toString();
        String type="search";
        ChildSelectBackend bg=new ChildSelectBackend(this);
        bg.execute(type,childId);
    }
}