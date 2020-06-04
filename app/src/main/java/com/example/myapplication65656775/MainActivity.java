package com.example.myapplication65656775;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import static com.example.myapplication65656775.R.drawable.ic_sort;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button) findViewById(R.id.start);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        menu.add("All");
        menu.add("Per Hour");
        menu.add("Per Day");
        menu.add("Per Month");
        return super.onCreateOptionsMenu(menu);
    }

    public void start(View view) {
        myButton.setBackgroundColor(Color.parseColor("#FFFF00"));
        Toast toast = Toast.makeText(getApplicationContext(),
                "Запущено", Toast.LENGTH_SHORT);
        toast.show();
    }
}
