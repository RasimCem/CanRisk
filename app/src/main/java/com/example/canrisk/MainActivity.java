package com.example.canrisk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg1,rg2,rg3,rg4,rg5,rg6,rg7,rg8,rg9,rg12,rg11m,rg11f;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6;
    Button btn;
    int[] points = new int[13];
    int point,i,q11=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg1 = findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg2);
        rg3 = findViewById(R.id.rg3);
        rg4 = findViewById(R.id.rg4);
        rg5 = findViewById(R.id.rg5);
        rg6 = findViewById(R.id.rg6);
        rg7 = findViewById(R.id.rg7);
        rg8 = findViewById(R.id.rg8);
        rg9 = findViewById(R.id.rg9);
        rg12 = findViewById(R.id.rg12);
        rg11f = findViewById(R.id.rg11f);
        rg11m = findViewById(R.id.rg11m);
        cb1 = findViewById(R.id.checkBox);
        cb2 = findViewById(R.id.checkBox2);
        cb3 = findViewById(R.id.checkBox3);
        cb4 = findViewById(R.id.checkBox4);
        cb5 = findViewById(R.id.checkBox5);
        cb6 = findViewById(R.id.checkBox6);
        btn = findViewById(R.id.btn);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                point=0;
                i=0;
                RadioButton s=findViewById(checkedId);
                //Toast.makeText(MainActivity.this, s.getText().toString(), Toast.LENGTH_SHORT).show();
                String choice = s.getText().toString();
                if(choice.equalsIgnoreCase("40-44 years")) {
                    point=0;
                }else if(choice.equalsIgnoreCase("45-54 years")){
                    point=7;
                }else if(choice.equalsIgnoreCase("55-64 years")) {
                    point=13;
                }else if(choice.equalsIgnoreCase("65-74 years")){
                    point=15;
                }
                points[i]=point;
                Toast.makeText(MainActivity.this, point+" points added.", Toast.LENGTH_SHORT).show();
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                point=0;
                i=1;
                RadioButton s=findViewById(checkedId);
                String choice = s.getText().toString();
                if(choice.equalsIgnoreCase("Male")) {
                    point=6;
                }else if(choice.equalsIgnoreCase("Female")){
                    point=0;
                }
                points[i]=point;
                Toast.makeText(MainActivity.this, point+" points added", Toast.LENGTH_SHORT).show();
            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                point=0;
                i=2;
                RadioButton s=findViewById(checkedId);
                String choice = s.getText().toString();
                if(choice.equalsIgnoreCase("White (BMI less than 25)")) {
                    point=0;
                }else if(choice.equalsIgnoreCase("Light Gray (BMI 25 to 29)")){
                    point=4;
                }else if(choice.equalsIgnoreCase("Dark Gray (BMI 30 to 34)")){
                    point=9;
                }else if(choice.equalsIgnoreCase("Black (BMI 35 and over)")){
                    point=14;
                }else {
                    Toast.makeText(MainActivity.this, "Err", Toast.LENGTH_SHORT).show();
                }
                points[i]=point;
                Toast.makeText(MainActivity.this, point+" points added", Toast.LENGTH_SHORT).show();
            }
        });

        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                point=0;
                i=3;
                RadioButton s=findViewById(checkedId);
                String choice = s.getText().toString();
                if(choice.equalsIgnoreCase("Less than 94 cm or 37 inches") || choice.equalsIgnoreCase("Less than 80 cm or 31.5 inches") ) {
                    point=0;
                }else if(choice.equalsIgnoreCase("Between 94-102 cm or 37-40 inches") || choice.equalsIgnoreCase("Between 80-88 cm or 31.5-35 inches") ){
                    point=4;
                }else if(choice.equalsIgnoreCase("Over 102 cm or 40 inches") || choice.equalsIgnoreCase("Over 88 cm or 35 inches")){
                    point=6;
                }else {
                    Toast.makeText(MainActivity.this, "Err", Toast.LENGTH_SHORT).show();
                }
                points[i]=point;
                Toast.makeText(MainActivity.this, point+" points added", Toast.LENGTH_SHORT).show();
            }
        });

        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                point=0;
                i=4;
                RadioButton s=findViewById(checkedId);
                String choice = s.getText().toString();
                if(choice.equalsIgnoreCase("Yes")) {
                    point=0;
                }else if(choice.equalsIgnoreCase("No")){
                    point=1;
                }else {
                    Toast.makeText(MainActivity.this, "Err", Toast.LENGTH_SHORT).show();
                }
                points[i]=point;
                Toast.makeText(MainActivity.this, point+" points added", Toast.LENGTH_SHORT).show();
            }
        });

        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                point=0;
                i=5;
                RadioButton s=findViewById(checkedId);
                String choice = s.getText().toString();
                if(choice.equalsIgnoreCase("Every day")) {
                    point=0;
                }else if(choice.equalsIgnoreCase("Not every day")){
                    point=2;
                }else {
                    Toast.makeText(MainActivity.this, "Err", Toast.LENGTH_SHORT).show();
                }
                points[i]=point;
                Toast.makeText(MainActivity.this, point+" points added", Toast.LENGTH_SHORT).show();
            }
        });

        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                point=0;
                i=6;
                RadioButton s=findViewById(checkedId);
                String choice = s.getText().toString();
                if(choice.equalsIgnoreCase("Yes")) {
                    point=4;
                }else if(choice.equalsIgnoreCase("No or don’t know")){
                    point=0;
                }else {
                    Toast.makeText(MainActivity.this, "Err", Toast.LENGTH_SHORT).show();
                }
                points[i]=point;
                Toast.makeText(MainActivity.this, point+" points added", Toast.LENGTH_SHORT).show();
            }
        });

        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                point=0;
                i=7;
                RadioButton s=findViewById(checkedId);
                String choice = s.getText().toString();
                if(choice.equalsIgnoreCase("Yes")) {
                    point=14;
                }else if(choice.equalsIgnoreCase("No or don’t know")){
                    point=0;
                }else {
                    Toast.makeText(MainActivity.this, "Err", Toast.LENGTH_SHORT).show();
                }
                points[i]=point;
                Toast.makeText(MainActivity.this, point+" points added", Toast.LENGTH_SHORT).show();
            }
        });

        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                point=0;
                i=8;
                RadioButton s=findViewById(checkedId);
                String choice = s.getText().toString();
                if(choice.equalsIgnoreCase("Yes")) {
                    point=1;
                }else if(choice.equalsIgnoreCase("No or don’t know")){
                    point=0;
                }else {
                    Toast.makeText(MainActivity.this, "Err", Toast.LENGTH_SHORT).show();
                }
                points[i]=point;
                Toast.makeText(MainActivity.this, point+" points added", Toast.LENGTH_SHORT).show();
            }
        });

        rg11m.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                point=0;
                i=10;
                RadioButton s=findViewById(checkedId);
                String choice = s.getText().toString();
                if(choice.equalsIgnoreCase("White (Caucasian)")) {
                    point=0;
                }else if(choice.equalsIgnoreCase("Aboriginal")){
                    point=3;
                }else if(choice.equalsIgnoreCase("Black (Afro-Caribbean)")){
                    point=5;
                }else if(choice.equalsIgnoreCase("East Asian")){
                    point=10;
                }else if(choice.equalsIgnoreCase("South Asian")){
                    point=11;
                }else if(choice.equalsIgnoreCase("Other non-white")){
                    point=3;
                }else {
                    Toast.makeText(MainActivity.this, "Err", Toast.LENGTH_SHORT).show();
                }
                points[i]=point;
                Toast.makeText(MainActivity.this, point+" points added", Toast.LENGTH_SHORT).show();
            }
        });

        rg11f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                point=0;
                i=11;
                RadioButton s=findViewById(checkedId);
                String choice = s.getText().toString();
                if(choice.equalsIgnoreCase("White (Caucasian)")) {
                    point=0;
                }else if(choice.equalsIgnoreCase("Aboriginal")){
                    point=3;
                }else if(choice.equalsIgnoreCase("Black (Afro-Caribbean)")){
                    point=5;
                }else if(choice.equalsIgnoreCase("East Asian")){
                    point=10;
                }else if(choice.equalsIgnoreCase("South Asian")){
                    point=11;
                }else if(choice.equalsIgnoreCase("Other non-white")){
                    point=3;
                }else {
                    Toast.makeText(MainActivity.this, "Err", Toast.LENGTH_SHORT).show();
                }
                points[i]=point;
                Toast.makeText(MainActivity.this, point+" points added", Toast.LENGTH_SHORT).show();
            }
        });

        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                point=0;
                i=12;
                RadioButton s=findViewById(checkedId);
                String choice = s.getText().toString();
                if(choice.equalsIgnoreCase("Some high school or less")) {
                    point=5;
                }else if(choice.equalsIgnoreCase("High school diploma")){
                    point=1;
                }else if(choice.equalsIgnoreCase("Some college or university ") || choice.equalsIgnoreCase("University or college degree")){
                    point=0;
                }else {
                    Toast.makeText(MainActivity.this, "Err", Toast.LENGTH_SHORT).show();
                }
                points[i]=point;
                Toast.makeText(MainActivity.this, point+" points added", Toast.LENGTH_SHORT).show();
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total=0,i=9;
                Boolean s;
                if(cb1.isChecked()){
                    total+=2;
                }if(cb2.isChecked()){
                    total+=2;
                }if(cb3.isChecked()){
                    total+=2;
                }if(cb4.isChecked()){
                    total+=2;
                }
                //System.out.println(total);
                points[i]=total;

                 Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                 intent.putExtra("array",points);
                 startActivity(intent);


            }
        });


    }
}
