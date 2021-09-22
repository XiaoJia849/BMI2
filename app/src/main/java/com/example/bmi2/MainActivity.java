package com.example.bmi2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText height;
    EditText weight;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height= findViewById(R.id.height);
        weight= findViewById(R.id.weight);
        text=findViewById(R.id.text);

    }

    public void onClick(View v) {
        String height_s=height.getText().toString();
        String weight_s=weight.getText().toString();
        if(height_s.equals("")||weight_s.equals("")){
            Toast.makeText(this,"请填完全部信息再提交",Toast.LENGTH_SHORT).show();
        }else{
            float h=Float.valueOf(height_s);
            float w=Float.valueOf(weight_s);
            if(h>=2.72||w>727){
                Toast.makeText(this,"恭喜您打破吉尼斯记录\n请输入真实数据谢谢",Toast.LENGTH_SHORT).show();
            } else {
                float bmi=w/(h*h);
                String te="BMI: "+ String.format("%.2f", bmi);
                if(bmi<=18.4){
                    te+=" 偏瘦,需要补充蛋白质哦";
                }else if(bmi<=23.9){
                    te+=" 正常,您的身体非常健康";
                }else if(bmi<=27.9){
                    te+=" 过重,可以考虑减肥了呢";
                }else{
                    te+="肥胖,请积极参与健身";
                }
                text.setText(te);
            }
        }
    }
}