
/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.QuizAppWillie;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitAnswers(View view)
    {
        int Score = 0;
        EditText myEditText = (EditText) findViewById(R.id.studentName);
        String student = myEditText.getText().toString();


        CheckBox chkOp1 = (CheckBox) findViewById(R.id.Q1_option1);
        CheckBox chkOp2 = (CheckBox) findViewById(R.id.Q1_option2);
        CheckBox chkOp3 = (CheckBox) findViewById(R.id.Q1_option3);
        CheckBox chkOp4 = (CheckBox) findViewById(R.id.Q1_option4);

        if(!chkOp1.isChecked())
            Score+=5;
        else
            Score+=0;

        if(!chkOp2.isChecked())
            Score+=5;
        else
            Score+=0;

        if(!chkOp3.isChecked())
            Score+=0;
        else
            Score+=5;

        if(!chkOp4.isChecked())
            Score+=5;
        else
            Score+=0;


        chkOp1 = (CheckBox) findViewById(R.id.Q2_option1);
        chkOp2 = (CheckBox) findViewById(R.id.Q2_option2);
        chkOp3 = (CheckBox) findViewById(R.id.Q2_option3);
        chkOp4 = (CheckBox) findViewById(R.id.Q2_option4);

        if(!chkOp1.isChecked())
            Score+=0;
        else
            Score+=5;

        if(!chkOp2.isChecked())
            Score+=5;
        else
            Score+=0;

        if(!chkOp3.isChecked())
            Score+=0;
        else
            Score+=5;

        if(!chkOp4.isChecked())
            Score+=5;
        else
            Score+=0;


        RadioButton rOp = (RadioButton) findViewById(R.id.Q3_option1);

        if(rOp.isChecked())
            Score+=20;

        rOp = (RadioButton) findViewById(R.id.Q4_option2);

        if(rOp.isChecked())
            Score+=20;

        rOp = (RadioButton) findViewById(R.id.Q5_option1);

        if(rOp.isChecked())
            Score+=20;

        String result = student + " Scored " + Score;

        Toast.makeText(this,result,Toast.LENGTH_LONG).show();

    }


}
