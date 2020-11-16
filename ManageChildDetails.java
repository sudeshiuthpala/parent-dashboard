package com.example.myapp4;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class ManageChildDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_manage_child_details);

    }

    public void onChildInsert(View view) {
        Intent i= new Intent(this,ChildReg.class);
        startActivity(i);
    }


    public void onCDelete(View view) {
        Intent i= new Intent(this,ChildDelete.class);
        startActivity(i);
    }

    public void onCDisplay(View view) {
        Intent i= new Intent(this,SelectChild.class);
        startActivity(i);
    }

    public void onCUpdate(View view) {
        Intent i= new Intent(this,ChildUpdate.class);
        startActivity(i);
    }
}