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
import android.widget.RadioGroup;
import android.widget.Spinner;

public class ChildReg extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    EditText FNameEt,MNameEt,LNameEt,childIdEt,dobEt,regDateEt;
    RadioGroup gender;
    Spinner mySpinner ;
    String selected,g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.child_reg_part1);

        FNameEt=(EditText)findViewById(R.id.editTextChildFName);
        MNameEt=(EditText)findViewById(R.id.editTextChildMName);
        LNameEt=(EditText)findViewById(R.id.editTextChildLName);
        childIdEt=(EditText)findViewById(R.id.editTextChildId);
        gender=(RadioGroup)findViewById(R.id.childGender);
        dobEt=(EditText)findViewById(R.id.editTextChildDob);
        regDateEt=(EditText)findViewById(R.id.editTextChildRegDate);
        mySpinner= findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.school, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(adapter);
        mySpinner.setOnItemSelectedListener(this);

    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        selected=parent.getItemAtPosition(pos).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void onChildRedio(View view) {
        int checkId=gender.getCheckedRadioButtonId();
        switch (checkId){
            case R.id.ChildMale:
                g="Male";
                break;
            case R.id.ChildFemale:
                g="Female";
                break;
            default:
                g="No";
        }
    }

    public void onChildReg(View view) {
        String FName=FNameEt.getText().toString();
        String MName=MNameEt.getText().toString();
        String LName=LNameEt.getText().toString();
        String childId=childIdEt.getText().toString();
        String child_gender=g;
        String dob=dobEt.getText().toString();
        String school=selected;
        String regDate=regDateEt.getText().toString();
        String type="Reg";
        ChildRegBack bg=new ChildRegBack(this);
        bg.execute(type,childId,FName,MName,LName,child_gender,dob,school,regDate);
    }
}