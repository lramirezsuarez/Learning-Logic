package com.example.android.learninglogic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Lucho on 5/21/2016.
 */
public class ResultsActivity extends AppCompatActivity {
    String name, results="";
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if (extras != null) {
            name = extras.getString("Name");
            total = extras.getInt("Total");
        }


        TextView resultados = (TextView) findViewById(R.id.txtResults);
        results = getText(R.string.txtResults).toString() + " " + name;
        if (resultados != null) {
            resultados.setText(results);
        }

        TextView txtTotal = (TextView) findViewById(R.id.txtTotal);
        String textTotal = "" + total;
        if (txtTotal != null) {
            txtTotal.setText(textTotal);
        }

        if (total == 5) {
            TextView txtMensaje = (TextView) findViewById(R.id.txtResMensaje);
            String msg = getText(R.string.msg1).toString();
            if (txtMensaje != null) {
                txtMensaje.setText(msg);
            }
        } else if (total >= 3) {
            TextView txtMensaje = (TextView) findViewById(R.id.txtResMensaje);
            String msg = getText(R.string.msg2).toString();
            if (txtMensaje != null) {
                txtMensaje.setText(msg);
            }
        } else if (total < 3) {
            TextView txtMensaje = (TextView) findViewById(R.id.txtResMensaje);
            String msg = getText(R.string.msg3).toString();
            if (txtMensaje != null) {
                txtMensaje.setText(msg);
            }
        }

    }

    //This method creates an intent to restart the app and do the test again with a different level or a new one.
    public void restartTest(View view) {
        Intent intent = new Intent(ResultsActivity.this, MainActivity.class);
        startActivity(intent);
    }


    public void shareResults(View view) {
        String mensaje = results + " " + total + "/5.";
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, mensaje);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
