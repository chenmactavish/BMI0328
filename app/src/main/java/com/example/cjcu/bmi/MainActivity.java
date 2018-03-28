package com.example.cjcu.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ed_weight;
    private EditText ed_height;
    private Button button;
    private Button btn_help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();


    }

    private void findView() {
        ed_weight = findViewById(R.id.ed_Weight);
        ed_height = findViewById(R.id.ed_Height);
        button = findViewById(R.id.button);
        btn_help = findViewById(R.id.button2);
    }

    public void calBMI(View view) {
        float w =Float.parseFloat(ed_weight.getText().toString());
        float h =Float.parseFloat(ed_height.getText().toString());
        float bmi = w / (h*h);
        Log.d("BMI=", String.valueOf(bmi));
        Toast.makeText(this,String.valueOf(bmi),Toast.LENGTH_LONG).show();
    }
}
