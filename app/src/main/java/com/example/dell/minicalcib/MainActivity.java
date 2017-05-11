package com.example.dell.minicalcib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView T1,T2,t;
    EditText e;
    Button o1,o2,o3,o4,o5,o6,o7,o8,o9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T1=(TextView)findViewById(R.id.t1);
        T2=(TextView)findViewById(R.id.t2);
        t=(TextView)findViewById(R.id.tt);
        e=(EditText)findViewById(R.id.e2);


        o1=(Button)findViewById(R.id.b1);o2=(Button)findViewById(R.id.b2);
        o3=(Button)findViewById(R.id.b3);o4=(Button)findViewById(R.id.b4);o5=(Button)findViewById(R.id.b5);o6=(Button)findViewById(R.id.b6);
        o7=(Button)findViewById(R.id.b7);o8=(Button)findViewById(R.id.b8);o9=(Button)findViewById(R.id.b9);

        o1.setOnClickListener(this);
        o2.setOnClickListener(this);
        o3.setOnClickListener(this); o4.setOnClickListener(this); o5.setOnClickListener(this); o6.setOnClickListener(this);
        o7.setOnClickListener(this); o8.setOnClickListener(this); o9.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {



        switch (v.getId())
        {
            case R.id.b1:
                T1.setText("0");
                T2.setText("");
                e.setText("0");
                t.setText("0");
                value.a=0.0;
                value.b=0.0;
                value.c=0.0;
                value.d=0;
                break;

            case R.id.b2:
                value.b=Double.parseDouble(e.getText().toString());
                if(value.d==1)
                {t.setText("= "+(value.a+value.b));}
                if(value.d==2)
                {t.setText("= "+(value.a-value.b));}
                if(value.d==3)
                {t.setText("= "+(value.a*value.b));}
                if(value.d==4)
                {t.setText("= "+(value.a/value.b));}
                if(value.d==5)
                {t.setText("= "+(Math.pow(value.a,value.b)));}
                if(value.d==6)
                {t.setText("= "+(value.a*value.b/100.0));}
                if(value.d==7)
                {
                    T1.setText("ln("+value.b+")");
                    e.setText("0");
                    t.setText("= "+(Math.log(value.b)));}

                break;

            case R.id.b3:
                value.b=Double.parseDouble(e.getText().toString());
                if(value.d==0)
                {value.a=value.b;}
                if(value.d==1)
                {value.a=value.a+value.b;}
                if(value.d==2)
                {value.a=value.a-value.b;}
                if(value.d==3)
                {value.a=value.a*value.b;}
                if(value.d==4)
                {value.a=value.a/value.b;}
                if(value.d==5)
                { value.a=Math.pow(value.a,value.b);}
                if(value.d==6)
                {value.a=value.a*value.b/100.0;}
                if(value.d==7)
                {value.a=Math.log(value.b);}

                T1.setText(""+value.a);
                T2.setText("+");
                value.d=1;
                e.setText("0");



                break;

            case R.id.b4:
                value.b=Double.parseDouble(e.getText().toString());
                if(value.d==0)
                {value.a=value.b;}
                if(value.d==1)
                {value.a=value.a+value.b;}
                if(value.d==2)
                {value.a=value.a-value.b;}
                if(value.d==3)
                {value.a=value.a*value.b;}
                if(value.d==4)
                {value.a=value.a/value.b;}
                if(value.d==5)
                { value.a=Math.pow(value.a,value.b);}
                if(value.d==6)
                {value.a=value.a*value.b/100.0;}
                if(value.d==7)
                {value.a=Math.log(value.b);}

                T1.setText(""+value.a);
                T2.setText("-");
                value.d=2;
                e.setText("0");


                break;

            case R.id.b5:
                value.b=Double.parseDouble(e.getText().toString());
                if(value.d==0)
                {value.a=value.b;}
                if(value.d==1)
                {value.a=value.a+value.b;}
                if(value.d==2)
                {value.a=value.a-value.b;}
                if(value.d==3)
                {value.a=value.a*value.b;}
                if(value.d==4)
                {value.a=value.a/value.b;}
                if(value.d==5)
                { value.a=Math.pow(value.a,value.b);}
                if(value.d==6)
                {value.a=value.a*value.b/100.0;}
                if(value.d==7)
                {value.a=Math.log(value.b);}

                T1.setText(""+value.a);
                T2.setText("x");
                value.d=3;
                e.setText("0");
                break;

            case R.id.b6:
                value.b=Double.parseDouble(e.getText().toString());
                if(value.d==0)
                {value.a=value.b;}
                if(value.d==1)
                {value.a=value.a+value.b;}
                if(value.d==2)
                {value.a=value.a-value.b;}
                if(value.d==3)
                {value.a=value.a*value.b;}
                if(value.d==4)
                {value.a=value.a/value.b;}
                if(value.d==5)
                { value.a=Math.pow(value.a,value.b);}
                if(value.d==6)
                {value.a=value.a*value.b/100.0;}
                if(value.d==7)
                {value.a=Math.log(value.b);}

                T1.setText(""+value.a);
                T2.setText("-");
                value.d=4;
                e.setText("0");
                break;

            case R.id.b7:

                value.b=Double.parseDouble(e.getText().toString());
                if(value.d==0)
                {value.a=value.b;}
                if(value.d==1)
                {value.a=value.a+value.b;}
                if(value.d==2)
                {value.a=value.a-value.b;}
                if(value.d==3)
                {value.a=value.a*value.b;}
                if(value.d==4)
                {value.a=value.a/value.b;}
                if(value.d==5)
                { value.a=Math.pow(value.a,value.b);}
                if(value.d==6)
                {value.a=value.a*value.b/100.0;}
                if(value.d==7)
                {value.a=Math.log(value.b);}

                T1.setText(""+value.a);
                T2.setText("^");
                value.d=5;
                e.setText("0");


                break;

            case R.id.b8:

                value.b=Double.parseDouble(e.getText().toString());
                if(value.d==0)
                {value.a=value.b;}
                if(value.d==1)
                {value.a=value.a+value.b;}
                if(value.d==2)
                {value.a=value.a-value.b;}
                if(value.d==3)
                {value.a=value.a*value.b;}
                if(value.d==4)
                {value.a=value.a/value.b;}
                if(value.d==5)
                { value.a=Math.pow(value.a,value.b);}
                if(value.d==6)
                {value.a=value.a*value.b/100.0;}
                if(value.d==7)
                {value.a=Math.log(value.b);}

                T1.setText(""+value.a);
                T2.setText("%");
                value.d=6;
                e.setText("0");

                break;

            case R.id.b9:
                T1.setText("ln(<value>)");
                T2.setText("");
                value.d=7;
                e.setText("0");


                break;

            default:
                break;

        }

    }
}
