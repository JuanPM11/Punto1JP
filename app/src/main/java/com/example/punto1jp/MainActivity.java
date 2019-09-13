package com.example.punto1jp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText);

        //  while (true) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();


        }
        fun(50, 30);


        // }
    }

    void fun(int x, int y) {


        //   Log.d("Sum", String.valueOf(x + y));
        editText1.setText(String.valueOf(x + y));
    }

}
