package com.iamricky.pokerpal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] games = {"NL Texas Holdem","FL Holdem","PL Omaha","FL Omaha 8","7 Stud","7 Stud 8","Razz","Mixed"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin = (Spinner) findViewById(R.id.spinner_game);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,games);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }
}
