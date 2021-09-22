package com.example.bmi2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TampActivity extends AppCompatActivity {
    EditText she;
    TextView hua;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamp);
        she=findViewById(R.id.she);
        hua=findViewById(R.id.hua);
        submit=findViewById(R.id.submit);

    }

    public void onClick(View view) {
        if(she.getText().equals("")){
            Toast.makeText(this,"请输入后再点击转换",Toast.LENGTH_SHORT).show();
        }else {
            float she_f=Float.valueOf(she.getText().toString());
            float hua_f;
            hua_f=she_f*9/5+32;
            hua.setText(String.valueOf(hua_f)+" ℉");
        }



    }
}