
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
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int m_quantity = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display(m_quantity);
        displayPrice(m_quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(m_quantity);
        displayPrice(m_quantity * 2);
    }

    public void Decrement(View view)
    {
        if (m_quantity > 0)
        {
            m_quantity--;
            display(m_quantity);

        }
    }


    public void Increment(View view)
    {

            m_quantity++;
            display(m_quantity);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
     //   TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
     //   quantityTextView.setText("" + number);
    }



    private void displayPrice(int number) {
     //   TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
     //   priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
