package com.aerobola.mycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.aerobola.mycalculator.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button one, two, three, four, five, six, seven, eight, nine, zero, dot, add, sub,plus_minus,modulo,factorial,delete, multy, div,power, equal,root,inverse, sin, cos, tan, clear;
    TextView result;
    ImageButton dev,exit;
    double var1, var2, var3,var4;
    boolean b_add, b_sub, b_mul, b_div, b_power,b_mod;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find all ID.......................
        one=findViewById(R.id.btn_one);
        two=findViewById(R.id.btn_two);
        three=findViewById(R.id.btn_three);
        four=findViewById(R.id.btn_four);
        five=findViewById(R.id.btn_five);
        six=findViewById(R.id.btn_six);
        seven=findViewById(R.id.btn_seven);
        eight=findViewById(R.id.btn_eight);
        nine=findViewById(R.id.btn_nine);
        zero=findViewById(R.id.btn_zero);
        dot=findViewById(R.id.btn_dot);

        add=findViewById(R.id.btn_plus);
        sub=findViewById(R.id.btn_minus);
        multy=findViewById(R.id.btn_multiplication);
        div=findViewById(R.id.btn_division);
        equal=findViewById(R.id.btn_equal);


        plus_minus=findViewById(R.id.btn_plus_or_minus);
        modulo=findViewById(R.id.btn_modulo);
        factorial=findViewById(R.id.btn_factorial);
        delete=findViewById(R.id.btn_delete);
        power=findViewById(R.id.btn_power);
        inverse=findViewById(R.id.btn_inverse);
        root=findViewById(R.id.btn_root);
        sin=findViewById(R.id.btn_sin);
        cos=findViewById(R.id.btn_cos);
        tan=findViewById(R.id.btn_tan);


        dev=findViewById(R.id.developer_image);
        exit=findViewById(R.id.exit_image);
        clear=findViewById(R.id.btn_clear);
        result=findViewById(R.id.result);

        //Set onclick listner.........................
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);

        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        tan.setOnClickListener(this);
        dev.setOnClickListener(this);
        delete.setOnClickListener(this);
        factorial.setOnClickListener(this);
        modulo.setOnClickListener(this);
        plus_minus.setOnClickListener(this);

        clear.setOnClickListener(this);
        exit.setOnClickListener(this);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        multy.setOnClickListener(this);
        div.setOnClickListener(this);
        dot.setOnClickListener(this);
        equal.setOnClickListener(this);
        root.setOnClickListener(this);
        inverse.setOnClickListener(this);
        power.setOnClickListener(this);
        result.setMovementMethod(new ScrollingMovementMethod());
    }

    @Override
    public void onClick(View view) {
        try {
            // Here declare 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.........
            if(view==one)
            {
                result.setText(result.getText()+"1");
            }
            if(view==two)
            {
                result.setText(result.getText()+"2");
            }
            if(view==three)
            {
                result.setText(result.getText()+"3");
            }
            if(view==four)
            {
                result.setText(result.getText()+"4");
            }
            if(view==five)
            {
                result.setText(result.getText()+"5");
            }
            if(view==six)
            {
                result.setText(result.getText()+"6");
            }
            if(view==seven)
            {
                result.setText(result.getText()+"7");
            }
            if(view==eight)
            {
                result.setText(result.getText()+"8");
            }
            if(view==nine)
            {
                result.setText(result.getText()+"9");
            }
            if(view==zero)
            {
                result.setText(result.getText()+"0");
            }

//Here declare sin, cos, tan, dot..................
            if(view==sin)
            {
                //esult.setText(result.getText()+"sin");
                // result.setText(result.getText()+"Sin");
                var3=Double.parseDouble(result.getText()+"");
                result.setText(Math.sin(Math.toRadians(var3)) +"");
            }
            if(view==cos)
            {
                var3=Double.parseDouble(result.getText()+"");
                result.setText(Math.cos(Math.toRadians(var3)) +"");
            }
            if(view==tan)
            {
                var3=Double.parseDouble(result.getText()+"");
                result.setText(Math.tan(Math.toRadians(var3)) +"");
            }
            if(view==root){
                var3=Double.parseDouble(result.getText()+"");
                result.setText((int) Math.sqrt(var3)+"");
            }

            if (view==inverse){

                var3=Double.parseDouble(result.getText()+"");
                result.setText(1/(var3)+"");
            }

            if(view==dot)
            {
                result.setText(result.getText()+".");
            }

            if (view==delete){

                str=result.getText().toString();
                str=str.substring(0,str.length()-1);
                result.setText(str);
            }

            if (view==factorial){

                var1=Double.parseDouble(result.getText()+"");
                var4=1;
                for(int i=1;i<=var1;i++){
                    var4=var4*i;
                }
                result.setText(var4+"");
            }

            if (view==plus_minus){
                var3=Double.parseDouble(result.getText()+"");
                result.setText(-var3+"");
            }

// here declare +, -, * and /.....................
            if(view==add)
            {
                var1=Double.parseDouble(result.getText()+"");

                b_add=true;
                result.setText(null);
            }
            if(view==sub)
            {
                var1=Double.parseDouble(result.getText()+"");
                b_sub=true;
                result.setText(null);

            }
            if(view==multy)
            {
                var1=Double.parseDouble(result.getText()+"");
                b_mul=true;
                result.setText(null);
            }
            if(view==div)
            {
                var1=Double.parseDouble(result.getText()+"");
                b_div=true;
                result.setText(null);
            }

            if (view==modulo){

                var1=Double.parseDouble(result.getText()+"");
                b_mod=true;
                result.setText(null);
            }
            if (view==power){

                var1=Double.parseDouble(result.getText()+"");
                b_power=true;
                result.setText(null);
            }
            if(view==equal)
            {
                var2=Double.parseDouble(result.getText()+"");
                if(b_add==true)
                {
                    result.setText(var1+var2 +"");
                    b_add=false;
                }
                if(b_sub==true)
                {
                    result.setText(var1-var2 +"");
                    b_sub=false;
                }
                if(b_mul==true)
                {
                    result.setText(var1*var2 +"");
                    b_mul=false;
                }
                if(b_div==true)
                {
                    result.setText(var1/var2 +"");
                    b_div=false;
                }

                if (b_power==true){
                    var3=var1;
                    for (int i=1;i<var2;i++){
                        var4=var1*var3;
                        var1=var4;
                    }
                    result.setText(var4+"");
                }

                if (b_mod==true){
                    result.setText(var1%var2+"");
                }

            }
//Here declare image, clear, exit...................
            if(view==dev)
            {
                Intent intent=new Intent(this,SecondActivity.class);
                startActivity(intent);
            }
            if(view==clear)
            {
                result.setText(null);
                //result.setText(result.getText()+"clear");
            }
            if(view==exit)
            {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        }catch (Exception e)
        {
            Toast.makeText(MainActivity.this,"Enter number",Toast.LENGTH_SHORT).show();
        }


    }
}

