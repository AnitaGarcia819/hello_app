package com.example.anitagarcia.hello_world;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.i("Anita", "Anita clicked this button");
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.text_button).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.i("Anita", "Anita clicked this button");
                ((TextView) findViewById(R.id.textView)).setText("Android is Awesome!");
            }
        });

        findViewById(R.id.background_button).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.i("Anita", "Anita clicked this button");
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorSecondary));
            }
        });

        findViewById(R.id.default_button).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.i("Anita", "Anita clicked this button");
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                ((TextView) findViewById(R.id.textView)).setText(R.string.greeting);
            }
        });
    }


}
