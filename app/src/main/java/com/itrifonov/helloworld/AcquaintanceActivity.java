package com.itrifonov.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AcquaintanceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acquaintance);

        Button btnIntroduce = (Button) findViewById(R.id.btn_introduce_my_self);
        btnIntroduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textHelloSmb;
                textHelloSmb = (TextView) findViewById(R.id.txt_hello_smb);
                textHelloSmb.setText(
                        String.format("Hello, %s!", ((EditText) findViewById(R.id.editText)).getText()));
            }
        });
    }
}
