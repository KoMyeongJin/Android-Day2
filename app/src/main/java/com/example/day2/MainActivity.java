package com.example.day2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtId = (EditText)findViewById(R.id.edtId);
        final EditText edtPw = (EditText)findViewById(R.id.edtPw);
        ImageView ivCheck = (ImageView)findViewById(R.id.ivCheck);
        ivCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtId.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this, "아이디를 입력하시오", Toast.LENGTH_SHORT).show();
                else if(edtPw.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this, "비번을 입력하시오", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "아이디 : " + edtId.getText().toString() + "  비번 : " + edtPw.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        final Button btLinear1 = (Button)findViewById(R.id.btLinear1);
        btLinear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Linear1.class);
                startActivity(intent);
            }
        });
        final Button btLinear2 = (Button)findViewById(R.id.btLinear2);
        btLinear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Linear2.class);
                startActivity(intent);
            }
        });
    }
}
