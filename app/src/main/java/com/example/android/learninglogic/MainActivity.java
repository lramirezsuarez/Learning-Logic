package com.example.android.learninglogic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String name="";
    int level;
    Button btnBasic, btnInter, btnAdvanced;
    TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = (TextView) findViewById(R.id.txtName);

        btnBasic = (Button) findViewById(R.id.btnBasic);
        btnInter = (Button) findViewById(R.id.btnInter);
        btnAdvanced = (Button) findViewById(R.id.btnAdvanced);

        btnBasic.setOnClickListener(this);
        btnInter.setOnClickListener(this);
        btnAdvanced.setOnClickListener(this);
    }


    /*
    This method creates an intent according to the selected Button, asigning the Level and the Name that was typed.
     */
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnBasic:
                level = 0;
                name = txtName.getText().toString();
                if (name.equals("")) {
                    Toast.makeText(MainActivity.this, R.string.txtNoName, Toast.LENGTH_SHORT).show();
                    break;
                }
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Level", level);
                intent.putExtra("Name", name);
                startActivity(intent);
                break;

            case R.id.btnInter:
                level = 1;
                name = txtName.getText().toString();
                if (name.equals("")) {
                    Toast.makeText(MainActivity.this, R.string.txtNoName, Toast.LENGTH_SHORT).show();
                    break;
                }

                Intent intent2 = new Intent(MainActivity.this, SecondActivity.class);
                intent2.putExtra("Level", level);
                intent2.putExtra("Name", name);
                startActivity(intent2);
                break;

            case R.id.btnAdvanced:
                level = 2;
                name = txtName.getText().toString();
                if (name.equals("")) {
                    Toast.makeText(MainActivity.this, R.string.txtNoName, Toast.LENGTH_SHORT).show();
                    break;
                }

                Intent intent3 = new Intent(MainActivity.this, SecondActivity.class);
                intent3.putExtra("Level", level);
                intent3.putExtra("Name", name);
                startActivity(intent3);
                break;
        }
    }
}
