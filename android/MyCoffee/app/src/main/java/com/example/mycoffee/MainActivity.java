package com.example.mycoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private int price = 5;
    private int coffeeCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        displayPrice();
    }

    public void incrementCoffeeNumber(View view) {
        coffeeCount++;
        displayPrice();
        displayQuantity();
    }

    public void decrementCoffeeNumber(View view) {
        if (coffeeCount > 0) {
            coffeeCount--;
            displayPrice();
            displayQuantity();
        }
    }

    private void displayQuantity() {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText(String.valueOf(coffeeCount));
    }

    private void displayPrice() {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(price * coffeeCount));
    }
}