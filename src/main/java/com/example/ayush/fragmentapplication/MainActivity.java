package com.example.ayush.fragmentapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText enterValue = (EditText) findViewById(R.id.et_value);
        Button bt1 = (Button) findViewById(R.id.bt_showFragment);
        final TextView text = (TextView) findViewById(R.id.tv_fragment);
        //components have been declared

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //on click of the button, the input will be taken from the edittext and will be shown through the Textview
                String valueGiven = enterValue.getText().toString();
                text.setText(valueGiven);
            }
        });
    }
}
