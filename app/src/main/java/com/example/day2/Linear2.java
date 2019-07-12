package com.example.day2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Linear2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear2);

        LinearLayout linearLayout2 = (LinearLayout)findViewById(R.id.linear2);

        Toast.makeText(this, "화면을 터치하면 돌아갑니다", Toast.LENGTH_SHORT).show();

        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
