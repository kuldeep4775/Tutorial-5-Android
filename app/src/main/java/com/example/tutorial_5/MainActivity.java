package com.example.tutorial_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    EditText firstname,lastname,email1,pw;
    RadioGroup gender;
    Spinner spinner;
    Switch swt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void details(View view) {
        firstname = findViewById(R.id.first_name);
        lastname = findViewById(R.id.last_name);
        email1 = findViewById(R.id.email);
        pw = findViewById(R.id.password);
        gender = findViewById(R.id.radioGrp);
        swt = findViewById(R.id.Aswt);

        String Sval = "";
        if (swt.isChecked()) {
            Sval = "MCA";
        } else {
            Sval = "BCA";
        }

        int selectedID = gender.getCheckedRadioButtonId();
        RadioButton gn = findViewById(selectedID);

        spinner = findViewById(R.id.spinner);

        String fname = firstname.getText().toString();
        String lname = lastname.getText().toString();
        String email = email1.getText().toString();
        String pass = pw.getText().toString();
        String gender = gn.getText().toString();
        String city = spinner.getSelectedItem().toString();

        Intent a = new Intent(MainActivity.this, MainActivity2.class);

        a.putExtra("fname", fname);
        a.putExtra("lname", lname);
        a.putExtra("email", email);
        a.putExtra("pass", pass);
        a.putExtra("gen", gender);
        a.putExtra("branch", Sval);
        a.putExtra("city", city);

        startActivity(a);
    }
}