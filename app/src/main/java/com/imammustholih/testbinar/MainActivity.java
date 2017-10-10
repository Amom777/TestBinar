package com.imammustholih.testbinar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String date,supplier,product,quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText date = (EditText)findViewById(R.id.et_date);
        EditText supplier = (EditText)findViewById(R.id.et_supplier);
        EditText product = (EditText)findViewById(R.id.et_product);
        EditText quantity = (EditText)findViewById(R.id.et_quantity);

    }
    public void onClick(View addView){
        TextView add = (TextView)addView.findViewById(R.id.tv_add);

    }
}
