package com.example.CoffeeOrder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //Global variables

    TextView price, ednoofcoffe;
    Button order, incr, dec;
    int totalprice = 0;
    int newNoCoffe;
    int quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initalize all vews by findviewbyid
        ednoofcoffe = findViewById(R.id.quantity_text_view);
        price = findViewById(R.id.price_view);
        incr = findViewById(R.id.increase_btn);
        dec = findViewById(R.id.decrease_btn);
        order = findViewById(R.id.order_btn);


        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display();
            }

        });

        incr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increase();
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrease();
            }
        });


    }


    public void increase() {
        quantity = Integer.parseInt(ednoofcoffe.getText().toString());
        newNoCoffe = quantity + 1;
        ednoofcoffe.setText("" + newNoCoffe);
    }

    public void decrease() {
        quantity = Integer.parseInt(ednoofcoffe.getText().toString());
        if (quantity > 0) {
            newNoCoffe = quantity - 1;
            ednoofcoffe.setText("" + newNoCoffe);
        } else {
            ednoofcoffe.setText("0");
        }
    }

    public void display() {
        quantity = Integer.parseInt(ednoofcoffe.getText().toString());
        if (quantity > 0) {
            totalprice = 5 * quantity;

            price.setText("Total Price is :$ " + totalprice + " \n Thanks for order!..");
        } else {
            price.setText("please provide no of coffee!");
        }
    }


}
