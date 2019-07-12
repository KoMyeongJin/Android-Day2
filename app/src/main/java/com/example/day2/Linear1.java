package com.example.day2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Linear1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear1);

        LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.linear1);

        Toast.makeText(this, "화면을 터치하면 돌아갑니다", Toast.LENGTH_SHORT).show();

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
