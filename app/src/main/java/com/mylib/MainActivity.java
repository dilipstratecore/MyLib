package com.mylib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.myutils.MyMath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int sum = MyMath.Plus(140, 40);
        Toast.makeText(this, "" + sum, Toast.LENGTH_SHORT).show();
    }
}