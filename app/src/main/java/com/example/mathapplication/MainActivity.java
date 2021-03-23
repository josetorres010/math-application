package com.example.mathapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt1_number, edt2_number, edt3_number;
    Button btn_acept;
    TextView view_result;
    double a, b, c, d, x1, x2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1_number = (EditText)findViewById(R.id.edt1_number);
        edt2_number = (EditText)findViewById(R.id.edt2_number);
        edt3_number = (EditText)findViewById(R.id.edt3_number);

        btn_acept = (Button)findViewById(R.id.btn_acept);
        view_result = (TextView)findViewById(R.id.view_result);

        btn_acept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edt1_number.getText().toString().equals("") && !edt2_number.getText().toString().equals("") && !edt3_number.getText().toString().equals("")){
                    a = Double.parseDouble(edt1_number.getText().toString());
                    b = Double.parseDouble(edt2_number.getText().toString());
                    c = Double.parseDouble(edt3_number.getText().toString());

                    d = Math.pow(b,2) - 4*a*c;
                    // condicional if si es 0
                    if (d == 0){
                        x1 = -b / (2*a);
                        view_result.setText("El resultado de: "+d+" con \nx1= "+x1);
                    }else if (d < 0){
                        view_result.setText("No hay forma de resolver!");
                    }else if (d > 0){
                        x1 = (-b + Math.sqrt(d)) / (2*a);
                        x2 = (-b + Math.sqrt(d)) / (2*a);
                        view_result.setText("El resultado es: "+d+ " con \nx1= "+x1+", x2 = "+x2);
                    }

                }
            }
        });
    }
}