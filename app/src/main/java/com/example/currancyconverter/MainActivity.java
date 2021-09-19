package com.example.currancyconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void changeToRupees(View view){
        EditText inDollar = (EditText) findViewById(R.id.inDollar);
        Double dollarAmount = Double.parseDouble(inDollar.getText().toString());
        Double inRupees = dollarAmount*81.2;
        Toast.makeText(MainActivity.this,"R. "+(inRupees.toString()),Toast.LENGTH_LONG).show();
        Log.i("Amount",inDollar.getText().toString());
     }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}