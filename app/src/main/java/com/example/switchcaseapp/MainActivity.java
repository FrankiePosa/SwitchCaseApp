package com.example.switchcaseapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText course;
    Button submit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        course = findViewById(R.id.course1);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String coursestr = course.getText().toString();



                if(coursestr.equals("")){
                    Toast.makeText(MainActivity.this, "Missing field", Toast.LENGTH_SHORT).show();
                }else{

                    switch(coursestr){
                        case "information technology":
                            openActivity2();
                            break;
                        case "materials engineering":
                            openActivity3();
                            break;
                        case "computer engineering":
                            openActivity4();
                            break;
                        case "chemical engineering":
                            openActivity5();
                            break;
                        case "computer science":
                            openActivity6();
                            break;
                        case "electronics engineering":
                            String res5 = "";
                            openActivity7();
                            break;
                        case "electrical engineering":
                            openActivity8();
                            break;
                        case "dean":
                            openActivity9();
                            break;
                    }

                }
            }
        });

    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void openActivity3() {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

    public void openActivity4() {
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void openActivity5() {
        Intent intent = new Intent(this, Activity5.class);
        startActivity(intent);
    }

    public void openActivity6() {
        Intent intent = new Intent(this, Activity6.class);
        startActivity(intent);
    }

    public void openActivity7() {
        Intent intent = new Intent(this, Activity7.class);
        startActivity(intent);
    }

    public void openActivity8() {
        Intent intent = new Intent(this, Activity8.class);
        startActivity(intent);
    }

    public void openActivity9() {
        Intent intent = new Intent(this, Activity9.class);
        startActivity(intent);
    }





}