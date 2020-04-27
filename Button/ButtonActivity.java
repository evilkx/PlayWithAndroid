package com.vilogy.hellojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button mBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mBtn3 = findViewById(R.id.btn_3);
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"You clicked Btn3!!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showToast(View v){
        Toast.makeText(this,"You clicked button 4!!",Toast.LENGTH_SHORT).show();
    }

    public void ClickText(View v){
        Toast.makeText(this, "You even clicked me?",Toast.LENGTH_SHORT).show();
    }
}
