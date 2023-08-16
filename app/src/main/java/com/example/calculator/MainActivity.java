package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2;
     Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ac,dot,slash,percent,backspace,star,minus,plus,equalsTo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Double[] first = new Double[1];
        final Double[] second = new Double[1];

        final char[] operator = new char[1];

        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);

        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);

        ac=findViewById(R.id.bAc);
        dot=findViewById(R.id.dot);
        slash=findViewById(R.id.slash);
        percent = findViewById(R.id.percent);
        backspace=findViewById(R.id.backspace);
        star=findViewById(R.id.star);
        minus=findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        equalsTo=findViewById(R.id.equalsto);


        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(null);
                tv2.setText(null);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=tv2.getText().toString()+""+b0.getText().toString();
                tv2.setText(text);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=tv2.getText().toString()+""+b1.getText().toString();
                tv2.setText(text);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=tv2.getText().toString()+""+b2.getText().toString();
                tv2.setText(text);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=tv2.getText().toString()+""+b3.getText().toString();
                tv2.setText(text);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=tv2.getText().toString()+""+b4.getText().toString();
                tv2.setText(text);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=tv2.getText().toString()+""+b5.getText().toString();
                tv2.setText(text);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=tv2.getText().toString()+""+b6.getText().toString();
                tv2.setText(text);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=tv2.getText().toString()+""+b7.getText().toString();
                tv2.setText(text);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=tv2.getText().toString()+""+b8.getText().toString();
                tv2.setText(text);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=tv2.getText().toString()+""+b9.getText().toString();
                tv2.setText(text);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=tv2.getText().toString()+""+dot.getText().toString();
                tv2.setText(text);
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = null;

                if(tv2.getText().length()-1>=0)
                {
StringBuilder sb = new StringBuilder(tv2.getText());
sb.deleteCharAt(tv2.length()-1);
tv2.setText(sb);
                }
            }
        });

//CODE FOR OPERATORS

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String text ;
              text=tv2.getText().toString()+""+percent.getText().toString();

              if(tv2.getText()==null)
              {
                  tv2.setText("");
              }
              else{
                  first[0] =Double.parseDouble(tv2.getText().toString());
                  operator[0] ='%';
                  tv2.setText("");
              }
            }
        });
        slash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String text ;
              text=tv2.getText().toString()+""+slash.getText().toString();
              if(tv2.getText()==null)
              {
                  tv2.setText("");
              }
              else {
                  first[0] =Double.parseDouble(tv2.getText().toString());
                  operator[0]='/';
                  tv2.setText("");

              }
            }
        });
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String text ;
              text=tv2.getText().toString()+""+star.getText().toString();
              if(tv2.getText()==null)
              {
                  tv2.setText("");
              }
              else{
                  first[0] =Double.parseDouble(tv2.getText().toString());
operator[0]='*';
                  tv2.setText("");
              }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text ;
                text=tv2.getText().toString()+""+minus.getText().toString();
                if(tv2.getText()==null)
                {
                    tv2.setText("");
                }
                else {
                    first[0] =Double.parseDouble(tv2.getText().toString());
                   operator[0]='-';
                    tv2.setText("");
                }
            }
        });
              plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text ;
                text=tv2.getText().toString()+""+minus.getText().toString();
                if (tv2.getText()==null)
                {
                    tv2.setText("");
                }
                else {
                    first[0] =Double.parseDouble(tv2.getText().toString());
                   operator[0]='+';
                    tv2.setText("");
                }
            }
        });
              dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text ;
                text=tv2.getText().toString()+".";
                tv2.setText(text);
            }
        });
              equalsTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                second[0]=Double.parseDouble(tv2.getText()+"");


                switch(operator[0])
                {

                    case '+' : tv2.setText((first[0]+second[0])+"");
                                tv1.setText(Double.toString(first[0])+"+"+Double.toString(second[0]));
                    break;
                    case '-' :
                                 tv2.setText((first[0]-second[0])+"");
                        tv1.setText(Double.toString(first[0])+"-"+Double.toString(second[0]));
                    break;
                    case '*' :
                                 tv2.setText((first[0]*second[0])+"");
                        tv1.setText(Double.toString(first[0])+"x"+Double.toString(second[0]));
                    break;
                    case '/' :
                        tv2.setText((first[0]/second[0])+"");
                        tv1.setText(Double.toString(first[0])+"÷"+Double.toString(second[0]));
                    break;
                    case '%' :
                        tv2.setText((first[0]/100)*second[0]+"");
                        tv1.setText(first[0]+"% of "+second[0]);
                        break;
                    default: tv2.setText("");
                    tv1.setText("");
                }

            }
        });




    }
}