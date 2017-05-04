package com.example.android.learninglogic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by Lucho on 5/21/2016.
 */
public class SecondActivity extends AppCompatActivity {
    int level, total;
    String name, lvl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);

        //Gets the intent and retrieves the extras @name and @level.
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if (extras != null){
            name = extras.getString("Name");
            level = extras.getInt("Level");
        }

        //Call the method printQuestions.
        printQuestions(name, level);


    }

    /*
    This method sets the texts of the Header and the Questions according to the selected Level.
     */
    public void printQuestions(String name, int level){
        TextView nivel = (TextView) findViewById(R.id.txtNivel);

        if (level==0){
            lvl = getText(R.string.txtLevelBasic).toString()+" "+ name;
            if (nivel != null) {
                nivel.setText(lvl);
            }
            levelBasic();
        } else if (level ==1){
            lvl = getText(R.string.txtLevelInter).toString() + " " + name;
            if (nivel != null) {
                nivel.setText(lvl);
            }
            levelInter();
        } else {
            lvl = getText(R.string.txtLevelAdvanced).toString() + " " + name;
            if (nivel != null) {
                nivel.setText(lvl);
            }
            levelAdvanced();
        }
    }

    /*
    This method Evaluates the answers the user selects and send the result to the ResultsActivity.
     */
    public void evaluateQuestions(View view){
        if (level==0)
            total = evLevelBasic();
        else if (level==1)
            total = evLevelInter();
        else
            total = evLevelAdvanced();

        Intent intent = new Intent(SecondActivity.this, ResultsActivity.class);
        intent.putExtra("Total", total);
        intent.putExtra("Name", name);
        startActivity(intent);
    }

    /*
    Method to create the questions for Basic Level and asign them to their respective TextViews and RadioButton texts.
    */
    public void levelBasic (){
        String preg1, pr1r1, pr1r2, pr1r3, pr1r4;
        TextView txtPreg1, txtP1RA, txtP1RB, txtP1RC, txtP1RD;

        //Question 1 and Answers A. B. C. and D.
        preg1 = getText(R.string.lvlBpreg1).toString();
        txtPreg1 = (TextView) findViewById(R.id.txtPreg1);
        if (txtPreg1 != null) {
            txtPreg1.setText(preg1);
        }
        pr1r1 = getText(R.string.lvlBpr1rA).toString();
        txtP1RA = (TextView) findViewById(R.id.rdoP1ResA);
        if (txtP1RA != null) {
            txtP1RA.setText(pr1r1);
        }
        pr1r2 = getText(R.string.lvlBpr1rB).toString();
        txtP1RB = (TextView) findViewById(R.id.rdoP1ResB);
        if (txtP1RB != null) {
            txtP1RB.setText(pr1r2);
        }
        pr1r3 = getText(R.string.lvlBpr1rC).toString();
        txtP1RC = (TextView) findViewById(R.id.rdoP1ResC);
        if (txtP1RC != null) {
            txtP1RC.setText(pr1r3);
        }
        pr1r4 = getText(R.string.lvlBpr1rD).toString();
        txtP1RD = (TextView) findViewById(R.id.rdoP1ResD);
        if (txtP1RD != null) {
            txtP1RD.setText(pr1r4);
        }

        String preg2, pr2r1, pr2r2, pr2r3, pr2r4;
        TextView txtPreg2, txtP2RA, txtP2RB, txtP2RC, txtP2RD;
        //Question 2 and Answers A. B. C. and D.
        preg2 = getText(R.string.lvlBpreg2).toString();
        txtPreg2 = (TextView) findViewById(R.id.txtPreg2);
        if (txtPreg2 != null) {
            txtPreg2.setText(preg2);
        }
        pr2r1 = getText(R.string.lvlBpr2rA).toString();
        txtP2RA = (TextView) findViewById(R.id.rdoP2ResA);
        if (txtP2RA != null) {
            txtP2RA.setText(pr2r1);
        }
        pr2r2 = getText(R.string.lvlBpr2rB).toString();
        txtP2RB = (TextView) findViewById(R.id.rdoP2ResB);
        if (txtP2RB != null) {
            txtP2RB.setText(pr2r2);
        }
        pr2r3 = getText(R.string.lvlBpr2rC).toString();
        txtP2RC = (TextView) findViewById(R.id.rdoP2ResC);
        if (txtP2RC != null) {
            txtP2RC.setText(pr2r3);
        }
        pr2r4 = getText(R.string.lvlBpr2rD).toString();
        txtP2RD = (TextView) findViewById(R.id.rdoP2ResD);
        if (txtP2RD != null) {
            txtP2RD.setText(pr2r4);
        }

        String preg3, pr3r1, pr3r2, pr3r3, pr3r4;
        TextView txtPreg3, txtP3RA, txtP3RB, txtP3RC, txtP3RD;
        //Question 3 and Answers A. B. C. and D.
        preg3 = getText(R.string.lvlBpreg3).toString();
        txtPreg3 = (TextView) findViewById(R.id.txtPreg3);
        if (txtPreg3 != null) {
            txtPreg3.setText(preg3);
        }
        pr3r1 = getText(R.string.lvlBpr3rA).toString();
        txtP3RA = (TextView) findViewById(R.id.rdoP3ResA);
        if (txtP3RA != null) {
            txtP3RA.setText(pr3r1);
        }
        pr3r2 = getText(R.string.lvlBpr3rB).toString();
        txtP3RB = (TextView) findViewById(R.id.rdoP3ResB);
        if (txtP3RB != null) {
            txtP3RB.setText(pr3r2);
        }
        pr3r3 = getText(R.string.lvlBpr3rC).toString();
        txtP3RC = (TextView) findViewById(R.id.rdoP3ResC);
        if (txtP3RC != null) {
            txtP3RC.setText(pr3r3);
        }
        pr3r4 = getText(R.string.lvlBpr3rD).toString();
        txtP3RD = (TextView) findViewById(R.id.rdoP3ResD);
        if (txtP3RD != null) {
            txtP3RD.setText(pr3r4);
        }

        String preg4, pr4r1, pr4r2, pr4r3, pr4r4;
        TextView txtPreg4, txtP4RA, txtP4RB, txtP4RC, txtP4RD;
        //Question 4 and Answers A. B. C. and D.
        preg4 = getText(R.string.lvlBpreg4).toString();
        txtPreg4 = (TextView) findViewById(R.id.txtPreg4);
        if (txtPreg4 != null) {
            txtPreg4.setText(preg4);
        }
        pr4r1 = getText(R.string.lvlBpr4rA).toString();
        txtP4RA = (TextView) findViewById(R.id.rdoP4ResA);
        if (txtP4RA != null) {
            txtP4RA.setText(pr4r1);
        }
        pr4r2 = getText(R.string.lvlBpr4rB).toString();
        txtP4RB = (TextView) findViewById(R.id.rdoP4ResB);
        if (txtP4RB != null) {
            txtP4RB.setText(pr4r2);
        }
        pr4r3 = getText(R.string.lvlBpr4rC).toString();
        txtP4RC = (TextView) findViewById(R.id.rdoP4ResC);
        if (txtP4RC != null) {
            txtP4RC.setText(pr4r3);
        }
        pr4r4 = getText(R.string.lvlBpr4rD).toString();
        txtP4RD = (TextView) findViewById(R.id.rdoP4ResD);
        if (txtP4RD != null) {
            txtP4RD.setText(pr4r4);
        }


        String preg5, pr5r1, pr5r2, pr5r3, pr5r4;
        TextView txtPreg5, txtP5RA, txtP5RB, txtP5RC, txtP5RD;
        //Question 5 and Answers A. B. C. and D.
        preg5 = getText(R.string.lvlBpreg5).toString();
        txtPreg5 = (TextView) findViewById(R.id.txtPreg5);
        if (txtPreg5 != null) {
            txtPreg5.setText(preg5);
        }
        pr5r1 = getText(R.string.lvlBpr5rA).toString();
        txtP5RA = (TextView) findViewById(R.id.rdoP5ResA);
        if (txtP5RA != null) {
            txtP5RA.setText(pr5r1);
        }
        pr5r2 = getText(R.string.lvlBpr5rB).toString();
        txtP5RB = (TextView) findViewById(R.id.rdoP5ResB);
        if (txtP5RB != null) {
            txtP5RB.setText(pr5r2);
        }
        pr5r3 = getText(R.string.lvlBpr5rC).toString();
        txtP5RC = (TextView) findViewById(R.id.rdoP5ResC);
        if (txtP5RC != null) {
            txtP5RC.setText(pr5r3);
        }
        pr5r4 = getText(R.string.lvlBpr5rD).toString();
        txtP5RD = (TextView) findViewById(R.id.rdoP5ResD);
        if (txtP5RD != null) {
            txtP5RD.setText(pr5r4);
        }

    }

    /*
    This method calculates the total of correct answers of the Basic Level.
     */
    public int evLevelBasic (){
        RadioGroup rgP1, rgP2, rgP3, rgP4, rgP5;
        int points = 0;
        rgP1 = (RadioGroup) findViewById(R.id.rgPreg1);
        rgP2 = (RadioGroup) findViewById(R.id.rgPreg2);
        rgP3 = (RadioGroup) findViewById(R.id.rgPreg3);
        rgP4 = (RadioGroup) findViewById(R.id.rgPreg4);
        rgP5 = (RadioGroup) findViewById(R.id.rgPreg5);

        if (rgP1.getCheckedRadioButtonId()==R.id.rdoP1ResB)
            points += 1;
        if (rgP2.getCheckedRadioButtonId()==R.id.rdoP2ResD)
            points += 1;
        if (rgP3.getCheckedRadioButtonId()==R.id.rdoP3ResC)
            points += 1;
        if (rgP4.getCheckedRadioButtonId()==R.id.rdoP4ResB)
            points += 1;
        if (rgP5.getCheckedRadioButtonId()==R.id.rdoP5ResB)
            points += 1;

        return points;
    }

    /*
    Method to create the questions for Intermediate Level and asign them to their respective TextViews and RadioButton texts.
    */
    public void levelInter (){
        String preg1, pr1r1, pr1r2, pr1r3, pr1r4;
        TextView txtPreg1, txtP1RA, txtP1RB, txtP1RC, txtP1RD;

        //Question 1 and Answers A. B. C. and D.
        preg1 = getText(R.string.lvlIpreg1).toString();
        txtPreg1 = (TextView) findViewById(R.id.txtPreg1);
        if (txtPreg1 != null) {
            txtPreg1.setText(preg1);
        }
        pr1r1 = getText(R.string.lvlIpr1rA).toString();
        txtP1RA = (TextView) findViewById(R.id.rdoP1ResA);
        if (txtP1RA != null) {
            txtP1RA.setText(pr1r1);
        }
        pr1r2 = getText(R.string.lvlIpr1rB).toString();
        txtP1RB = (TextView) findViewById(R.id.rdoP1ResB);
        if (txtP1RB != null) {
            txtP1RB.setText(pr1r2);
        }
        pr1r3 = getText(R.string.lvlIpr1rC).toString();
        txtP1RC = (TextView) findViewById(R.id.rdoP1ResC);
        if (txtP1RC != null) {
            txtP1RC.setText(pr1r3);
        }
        pr1r4 = getText(R.string.lvlIpr1rD).toString();
        txtP1RD = (TextView) findViewById(R.id.rdoP1ResD);
        if (txtP1RD != null) {
            txtP1RD.setText(pr1r4);
        }

        String preg2, pr2r1, pr2r2, pr2r3, pr2r4;
        TextView txtPreg2, txtP2RA, txtP2RB, txtP2RC, txtP2RD;
        //Question 2 and Answers A. B. C. and D.
        preg2 = getText(R.string.lvlIpreg2).toString();
        txtPreg2 = (TextView) findViewById(R.id.txtPreg2);
        if (txtPreg2 != null) {
            txtPreg2.setText(preg2);
        }
        pr2r1 = getText(R.string.lvlIpr2rA).toString();
        txtP2RA = (TextView) findViewById(R.id.rdoP2ResA);
        if (txtP2RA != null) {
            txtP2RA.setText(pr2r1);
        }
        pr2r2 = getText(R.string.lvlIpr2rB).toString();
        txtP2RB = (TextView) findViewById(R.id.rdoP2ResB);
        if (txtP2RB != null) {
            txtP2RB.setText(pr2r2);
        }
        pr2r3 = getText(R.string.lvlIpr2rC).toString();
        txtP2RC = (TextView) findViewById(R.id.rdoP2ResC);
        if (txtP2RC != null) {
            txtP2RC.setText(pr2r3);
        }
        pr2r4 = getText(R.string.lvlIpr2rD).toString();
        txtP2RD = (TextView) findViewById(R.id.rdoP2ResD);
        if (txtP2RD != null) {
            txtP2RD.setText(pr2r4);
        }

        String preg3, pr3r1, pr3r2, pr3r3, pr3r4;
        TextView txtPreg3, txtP3RA, txtP3RB, txtP3RC, txtP3RD;
        //Question 3 and Answers A. B. C. and D.
        preg3 = getText(R.string.lvlIpreg3).toString();
        txtPreg3 = (TextView) findViewById(R.id.txtPreg3);
        if (txtPreg3 != null) {
            txtPreg3.setText(preg3);
        }
        pr3r1 = getText(R.string.lvlIpr3rA).toString();
        txtP3RA = (TextView) findViewById(R.id.rdoP3ResA);
        if (txtP3RA != null) {
            txtP3RA.setText(pr3r1);
        }
        pr3r2 = getText(R.string.lvlIpr3rB).toString();
        txtP3RB = (TextView) findViewById(R.id.rdoP3ResB);
        if (txtP3RB != null) {
            txtP3RB.setText(pr3r2);
        }
        pr3r3 = getText(R.string.lvlIpr3rC).toString();
        txtP3RC = (TextView) findViewById(R.id.rdoP3ResC);
        if (txtP3RC != null) {
            txtP3RC.setText(pr3r3);
        }
        pr3r4 = getText(R.string.lvlIpr3rD).toString();
        txtP3RD = (TextView) findViewById(R.id.rdoP3ResD);
        if (txtP3RD != null) {
            txtP3RD.setText(pr3r4);
        }

        String preg4, pr4r1, pr4r2, pr4r3, pr4r4;
        TextView txtPreg4, txtP4RA, txtP4RB, txtP4RC, txtP4RD;
        //Question 4 and Answers A. B. C. and D.
        preg4 = getText(R.string.lvlIpreg4).toString();
        txtPreg4 = (TextView) findViewById(R.id.txtPreg4);
        if (txtPreg4 != null) {
            txtPreg4.setText(preg4);
        }
        pr4r1 = getText(R.string.lvlIpr4rA).toString();
        txtP4RA = (TextView) findViewById(R.id.rdoP4ResA);
        if (txtP4RA != null) {
            txtP4RA.setText(pr4r1);
        }
        pr4r2 = getText(R.string.lvlIpr4rB).toString();
        txtP4RB = (TextView) findViewById(R.id.rdoP4ResB);
        if (txtP4RB != null) {
            txtP4RB.setText(pr4r2);
        }
        pr4r3 = getText(R.string.lvlIpr4rC).toString();
        txtP4RC = (TextView) findViewById(R.id.rdoP4ResC);
        if (txtP4RC != null) {
            txtP4RC.setText(pr4r3);
        }
        pr4r4 = getText(R.string.lvlIpr4rD).toString();
        txtP4RD = (TextView) findViewById(R.id.rdoP4ResD);
        if (txtP4RD != null) {
            txtP4RD.setText(pr4r4);
        }


        String preg5, pr5r1, pr5r2, pr5r3, pr5r4;
        TextView txtPreg5, txtP5RA, txtP5RB, txtP5RC, txtP5RD;
        //Question 5 and Answers A. B. C. and D.
        preg5 = getText(R.string.lvlIpreg5).toString();
        txtPreg5 = (TextView) findViewById(R.id.txtPreg5);
        if (txtPreg5 != null) {
            txtPreg5.setText(preg5);
        }
        pr5r1 = getText(R.string.lvlIpr5rA).toString();
        txtP5RA = (TextView) findViewById(R.id.rdoP5ResA);
        if (txtP5RA != null) {
            txtP5RA.setText(pr5r1);
        }
        pr5r2 = getText(R.string.lvlIpr5rB).toString();
        txtP5RB = (TextView) findViewById(R.id.rdoP5ResB);
        if (txtP5RB != null) {
            txtP5RB.setText(pr5r2);
        }
        pr5r3 = getText(R.string.lvlIpr5rC).toString();
        txtP5RC = (TextView) findViewById(R.id.rdoP5ResC);
        if (txtP5RC != null) {
            txtP5RC.setText(pr5r3);
        }
        pr5r4 = getText(R.string.lvlIpr5rD).toString();
        txtP5RD = (TextView) findViewById(R.id.rdoP5ResD);
        if (txtP5RD != null) {
            txtP5RD.setText(pr5r4);
        }

    }

    /*
    This method calculates the total of correct answers of the Intermediate Level.
     */
    public int evLevelInter() {
        RadioGroup rgP1, rgP2, rgP3, rgP4, rgP5;
        int points = 0;
        rgP1 = (RadioGroup) findViewById(R.id.rgPreg1);
        rgP2 = (RadioGroup) findViewById(R.id.rgPreg2);
        rgP3 = (RadioGroup) findViewById(R.id.rgPreg3);
        rgP4 = (RadioGroup) findViewById(R.id.rgPreg4);
        rgP5 = (RadioGroup) findViewById(R.id.rgPreg5);

        if (rgP1.getCheckedRadioButtonId()==R.id.rdoP1ResB)
            points += 1;
        if (rgP2.getCheckedRadioButtonId()==R.id.rdoP2ResA)
            points += 1;
        if (rgP3.getCheckedRadioButtonId()==R.id.rdoP3ResB)
            points += 1;
        if (rgP4.getCheckedRadioButtonId()==R.id.rdoP4ResA)
            points += 1;
        if (rgP5.getCheckedRadioButtonId()==R.id.rdoP5ResC)
            points += 1;

        return points;
    }

    /*
    Method to create the questions for Advanced Level and asign them to their respective TextViews and RadioButton texts.
    */
    public void levelAdvanced (){
        String preg1, pr1r1, pr1r2, pr1r3, pr1r4;
        TextView txtPreg1, txtP1RA, txtP1RB, txtP1RC, txtP1RD;

        //Question 1 and Answers A. B. C. and D.
        preg1 = getText(R.string.lvlApreg1).toString();
        txtPreg1 = (TextView) findViewById(R.id.txtPreg1);
        if (txtPreg1 != null) {
            txtPreg1.setText(preg1);
        }
        pr1r1 = getText(R.string.lvlApr1rA).toString();
        txtP1RA = (TextView) findViewById(R.id.rdoP1ResA);
        if (txtP1RA != null) {
            txtP1RA.setText(pr1r1);
        }
        pr1r2 = getText(R.string.lvlApr1rB).toString();
        txtP1RB = (TextView) findViewById(R.id.rdoP1ResB);
        if (txtP1RB != null) {
            txtP1RB.setText(pr1r2);
        }
        pr1r3 = getText(R.string.lvlApr1rC).toString();
        txtP1RC = (TextView) findViewById(R.id.rdoP1ResC);
        if (txtP1RC != null) {
            txtP1RC.setText(pr1r3);
        }
        pr1r4 = getText(R.string.lvlApr1rD).toString();
        txtP1RD = (TextView) findViewById(R.id.rdoP1ResD);
        if (txtP1RD != null) {
            txtP1RD.setText(pr1r4);
        }

        String preg2, pr2r1, pr2r2, pr2r3, pr2r4;
        TextView txtPreg2, txtP2RA, txtP2RB, txtP2RC, txtP2RD;
        //Question 2 and Answers A. B. C. and D.
        preg2 = getText(R.string.lvlApreg2).toString();
        txtPreg2 = (TextView) findViewById(R.id.txtPreg2);
        if (txtPreg2 != null) {
            txtPreg2.setText(preg2);
        }
        pr2r1 = getText(R.string.lvlApr2rA).toString();
        txtP2RA = (TextView) findViewById(R.id.rdoP2ResA);
        if (txtP2RA != null) {
            txtP2RA.setText(pr2r1);
        }
        pr2r2 = getText(R.string.lvlApr2rB).toString();
        txtP2RB = (TextView) findViewById(R.id.rdoP2ResB);
        if (txtP2RB != null) {
            txtP2RB.setText(pr2r2);
        }
        pr2r3 = getText(R.string.lvlApr2rC).toString();
        txtP2RC = (TextView) findViewById(R.id.rdoP2ResC);
        if (txtP2RC != null) {
            txtP2RC.setText(pr2r3);
        }
        pr2r4 = getText(R.string.lvlApr2rD).toString();
        txtP2RD = (TextView) findViewById(R.id.rdoP2ResD);
        if (txtP2RD != null) {
            txtP2RD.setText(pr2r4);
        }

        String preg3, pr3r1, pr3r2, pr3r3, pr3r4;
        TextView txtPreg3, txtP3RA, txtP3RB, txtP3RC, txtP3RD;
        //Question 3 and Answers A. B. C. and D.
        preg3 = getText(R.string.lvlApreg3).toString();
        txtPreg3 = (TextView) findViewById(R.id.txtPreg3);
        if (txtPreg3 != null) {
            txtPreg3.setText(preg3);
        }
        pr3r1 = getText(R.string.lvlApr3rA).toString();
        txtP3RA = (TextView) findViewById(R.id.rdoP3ResA);
        if (txtP3RA != null) {
            txtP3RA.setText(pr3r1);
        }
        pr3r2 = getText(R.string.lvlApr3rB).toString();
        txtP3RB = (TextView) findViewById(R.id.rdoP3ResB);
        if (txtP3RB != null) {
            txtP3RB.setText(pr3r2);
        }
        pr3r3 = getText(R.string.lvlApr3rC).toString();
        txtP3RC = (TextView) findViewById(R.id.rdoP3ResC);
        if (txtP3RC != null) {
            txtP3RC.setText(pr3r3);
        }
        pr3r4 = getText(R.string.lvlApr3rD).toString();
        txtP3RD = (TextView) findViewById(R.id.rdoP3ResD);
        if (txtP3RD != null) {
            txtP3RD.setText(pr3r4);
        }

        String preg4, pr4r1, pr4r2, pr4r3, pr4r4;
        TextView txtPreg4, txtP4RA, txtP4RB, txtP4RC, txtP4RD;
        //Question 4 and Answers A. B. C. and D.
        preg4 = getText(R.string.lvlApreg4).toString();
        txtPreg4 = (TextView) findViewById(R.id.txtPreg4);
        if (txtPreg4 != null) {
            txtPreg4.setText(preg4);
        }
        pr4r1 = getText(R.string.lvlApr4rA).toString();
        txtP4RA = (TextView) findViewById(R.id.rdoP4ResA);
        if (txtP4RA != null) {
            txtP4RA.setText(pr4r1);
        }
        pr4r2 = getText(R.string.lvlApr4rB).toString();
        txtP4RB = (TextView) findViewById(R.id.rdoP4ResB);
        if (txtP4RB != null) {
            txtP4RB.setText(pr4r2);
        }
        pr4r3 = getText(R.string.lvlApr4rC).toString();
        txtP4RC = (TextView) findViewById(R.id.rdoP4ResC);
        if (txtP4RC != null) {
            txtP4RC.setText(pr4r3);
        }
        pr4r4 = getText(R.string.lvlApr4rD).toString();
        txtP4RD = (TextView) findViewById(R.id.rdoP4ResD);
        if (txtP4RD != null) {
            txtP4RD.setText(pr4r4);
        }


        String preg5, pr5r1, pr5r2, pr5r3, pr5r4;
        TextView txtPreg5, txtP5RA, txtP5RB, txtP5RC, txtP5RD;
        //Question 5 and Answers A. B. C. and D.
        preg5 = getText(R.string.lvlApreg5).toString();
        txtPreg5 = (TextView) findViewById(R.id.txtPreg5);
        if (txtPreg5 != null) {
            txtPreg5.setText(preg5);
        }
        pr5r1 = getText(R.string.lvlApr5rA).toString();
        txtP5RA = (TextView) findViewById(R.id.rdoP5ResA);
        if (txtP5RA != null) {
            txtP5RA.setText(pr5r1);
        }
        pr5r2 = getText(R.string.lvlApr5rB).toString();
        txtP5RB = (TextView) findViewById(R.id.rdoP5ResB);
        if (txtP5RB != null) {
            txtP5RB.setText(pr5r2);
        }
        pr5r3 = getText(R.string.lvlApr5rC).toString();
        txtP5RC = (TextView) findViewById(R.id.rdoP5ResC);
        if (txtP5RC != null) {
            txtP5RC.setText(pr5r3);
        }
        pr5r4 = getText(R.string.lvlApr5rD).toString();
        txtP5RD = (TextView) findViewById(R.id.rdoP5ResD);
        if (txtP5RD != null) {
            txtP5RD.setText(pr5r4);
        }

    }

    /*
    This method calculates the total of correct answers of the Advanced Level.
     */
    public int evLevelAdvanced(){
        RadioGroup rgP1, rgP2, rgP3, rgP4, rgP5;
        int points = 0;
        rgP1 = (RadioGroup) findViewById(R.id.rgPreg1);
        rgP2 = (RadioGroup) findViewById(R.id.rgPreg2);
        rgP3 = (RadioGroup) findViewById(R.id.rgPreg3);
        rgP4 = (RadioGroup) findViewById(R.id.rgPreg4);
        rgP5 = (RadioGroup) findViewById(R.id.rgPreg5);

        if (rgP1.getCheckedRadioButtonId()==R.id.rdoP1ResD)
            points += 1;
        if (rgP2.getCheckedRadioButtonId()==R.id.rdoP2ResA)
            points += 1;
        if (rgP3.getCheckedRadioButtonId()==R.id.rdoP3ResD)
            points += 1;
        if (rgP4.getCheckedRadioButtonId()==R.id.rdoP4ResA)
            points += 1;
        if (rgP5.getCheckedRadioButtonId()==R.id.rdoP5ResD)
            points += 1;

        return points;
    }
}
