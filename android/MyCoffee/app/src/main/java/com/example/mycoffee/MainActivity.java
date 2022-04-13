package com.example.mycoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    private int price = 5;
    private int quantity = 0;
    private Set<Toppings> toppings = new HashSet<>();

    String message;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("NonConstantResourceId")
    public void addTopping(View view) {
        boolean isChecked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.whipped_cream:
                if (isChecked) {
                    toppings.add(Toppings.WrappedCream);
                } else {
                    toppings.remove(Toppings.WrappedCream);
                }
        }
        System.out.println(toppings.size());
    }

    public void submitOrder(View view) {
        int totalPrice = price * quantity;
        message = String.format(
                "Name:%s\n" +
                "Quantity: %s\n" +
                "Total: %s\n" +
                "Thank you!",
                name, quantity, totalPrice);
        displayMessage();
    }

    public void incrementCoffeeNumber(View view) {
        quantity++;
        displayPrice();
        displayQuantity();
    }

    public void decrementCoffeeNumber(View view) {
        if (quantity > 0) {
            quantity--;
            displayPrice();
            displayQuantity();
        }
    }

    private void displayQuantity() {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText(String.valueOf(quantity));
    }

    private void displayPrice() {
        TextView priceTextView = findViewById(R.id.order_summary_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(price * quantity));
    }

    private void displayMessage() {
        TextView messageView = findViewById(R.id.order_summary_text_view);
        messageView.setText(message);
        findViewById(R.id.quantity_layout_view).setVisibility(View.INVISIBLE);
    }
}