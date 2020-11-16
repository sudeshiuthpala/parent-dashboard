package com.example.myapp4;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;

public class ChildDelete extends AppCompatActivity {
    EditText childIdEt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_child_delete);
        childIdEt=(EditText)findViewById(R.id.editTextChildIdDelete);
    }

    public void onChildDelete(View view) {
        String childId=childIdEt.getText().toString();
        String type="delete";
        ChildDeleteBackend bg=new ChildDeleteBackend(this);
        bg.execute(type,childId);

    }
}