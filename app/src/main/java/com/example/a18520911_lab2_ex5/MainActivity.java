package com.example.a18520911_lab2_ex5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button)findViewById(R.id.myButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent myIntent = new Intent();
//                myIntent.setType("image/pictures/*");
//                myIntent.setAction(Intent.ACTION_GET_CONTENT);
//                startActivity(myIntent);

//                Intent myActivity2 = new Intent("android.intent.action.MUSIC_PLAYER");
//
//                startActivity(myActivity2);

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));

                Intent pickIntent = new Intent(Intent.ACTION_PICK_ACTIVITY);
                pickIntent.putExtra(Intent.EXTRA_INTENT, intent);

                startActivity(pickIntent);

            }
        });
    }
}