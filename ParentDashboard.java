package com.example.myapp4;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class ParentDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parent_dashboard);
    }

    public void onChild(View view) {
        Intent i= new Intent(this,ManageChildDetails.class);
        startActivity(i);
    }

    public void onProfile(View view) {
        Intent i= new Intent(this,ParentUpdate.class);
        startActivity(i);
    }

    public void onJournery(View view) {
    }

    public void onMsg(View view) {
    }

    public void onFees(View view) {
    }
}