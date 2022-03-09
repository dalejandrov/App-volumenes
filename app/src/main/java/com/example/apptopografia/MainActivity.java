package com.example.apptopografia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;


public class MainActivity extends AppCompatActivity {
    private EditText et1,et2, et3;
    private TextView tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle("Volumenes");*/
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        et3 = (EditText)findViewById(R.id.et3);
        tv4 = (TextView) findViewById(R.id.tv4);

    }

    public void calcular(View view){
        int n1,n2,n3,volumen;

        n1=Integer.parseInt(et1.getText().toString());
        n2=Integer.parseInt(et2.getText().toString());
        n3=Integer.parseInt(et3.getText().toString());

        volumen= n1*n2*n3;
        tv4.setText("RESULTADO: "+ volumen);

    }
}