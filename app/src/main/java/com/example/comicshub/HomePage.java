package com.example.comicshub;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        CardView cardView1 = findViewById(R.id.onepieceCardview);
        CardView cardView2 = findViewById(R.id.bleachCardview);
        CardView cardView3 = findViewById(R.id.berserkCardview);
        CardView cardView4 = findViewById(R.id.narutoCardview);


        cardView1.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, onepiece.class);
            startActivity(intent);
        });


        cardView2.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, bleach.class);
            startActivity(intent);
        });


        cardView3.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, berserk.class);
            startActivity(intent);
        });


        cardView4.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Naruto.class);
            startActivity(intent);
        });


        findViewById(R.id.exploreLayout).setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, HomePage.class);
            startActivity(intent);
        });

        findViewById(R.id.cartLayout).setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Cart.class);
            startActivity(intent);
        });

        findViewById(R.id.wishlistLayout).setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Wishlist.class);
            startActivity(intent);
        });

        findViewById(R.id.myOrderLayout).setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, MyOrder.class);
            startActivity(intent);
        });

        findViewById(R.id.profileLayout).setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Myprofile.class);
            startActivity(intent);
        });
    }
}