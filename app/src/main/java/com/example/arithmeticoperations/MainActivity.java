package com.example.arithmeticoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2;
    Button badd, bsub, bmul, bdiv;
    String getFnum, getSnum, res;
    int num1, num2, num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText)findViewById(R.id.num1);
        ed2=(EditText)findViewById(R.id.num2);

        badd=(Button)findViewById(R.id.add);
        bsub=(Button)findViewById(R.id.sub);
        bmul=(Button)findViewById(R.id.mul);
        bdiv=(Button)findViewById(R.id.div);

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFnum=ed1.getText().toString();
                getSnum=ed2.getText().toString();

                num1=Integer.parseInt(getFnum);
                num2=Integer.parseInt(getSnum);
                num3=num1+num2;

                res=String.valueOf(num3);

                Toast.makeText(getApplicationContext(),res,Toast.LENGTH_SHORT).show();
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getFnum=ed1.getText().toString();
                getSnum=ed2.getText().toString();

                num1=Integer.parseInt(getFnum);
                num2=Integer.parseInt(getSnum);
                num3=num1-num2;

                res=String.valueOf(num3);

                Toast.makeText(getApplicationContext(),res,Toast.LENGTH_SHORT).show();

            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getFnum=ed1.getText().toString();
                getSnum=ed2.getText().toString();

                num1=Integer.parseInt(getFnum);
                num2=Integer.parseInt(getSnum);
                num3=num1*num2;

                res=String.valueOf(num3);

                Toast.makeText(getApplicationContext(),res,Toast.LENGTH_SHORT).show();

            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getFnum=ed1.getText().toString();
                getSnum=ed2.getText().toString();

                num1=Integer.parseInt(getFnum);
                num2=Integer.parseInt(getSnum);
                num3=num1/num2;

                res=String.valueOf(num3);

                Toast.makeText(getApplicationContext(),res,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
