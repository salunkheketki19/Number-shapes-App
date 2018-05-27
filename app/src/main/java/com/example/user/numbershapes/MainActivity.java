package com.example.user.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Numbers {
        int num;

        int sNum = 0;

        public boolean triangularNum() {
            int x = 1;
            int tnum = 1;
            while (tnum < num) {
                x++;
                tnum = tnum + x;
            }
            if (tnum == num) {
                return true;
            } else {
                return false;
            }
        }

        public boolean squareNum() {
            int snum = 0;
            int x = 1;
            while (snum < num) {
                snum = x * x;
                x++;
            }
            if (snum == num) {
                return true;
            } else {
                return false;
            }
        }
    }
    public void clickFunction(View view){

        EditText numberText = (EditText) findViewById(R.id.numberText);

        Numbers number = new Numbers();

        number.num = Integer.parseInt(numberText.getText().toString());

        String msg = "";

        if(number.squareNum()){

            msg = number.num + " is a square number";
        }else if (number. triangularNum()){
            
            msg = number.num + " is a triangular number";
        }else if(number.squareNum() && number. triangularNum()){
            
            msg = number.num + " is square as well as triangular";
        }else{
            
            msg =  number.num + " is neither square nor triangular";
        }

        Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
