package pcstudent.ir.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;

public class main extends Activity {
    /**
     * Called when the activity is first created.
     */
    private String s="";
    private Float num1;
    private Float num2;
    private ArrayList<Integer> array;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ImageView btn0 = (ImageView) findViewById(R.id.btn0);
        ImageView btn1 = (ImageView) findViewById(R.id.btn1);
        ImageView btn2 = (ImageView) findViewById(R.id.btn2);
        ImageView btn3 = (ImageView) findViewById(R.id.btn3);
        ImageView btn4 = (ImageView) findViewById(R.id.btn4);
        ImageView btn5 = (ImageView) findViewById(R.id.btn5);
        ImageView btn6 = (ImageView) findViewById(R.id.btn6);
        ImageView btn7 = (ImageView) findViewById(R.id.btn7);
        ImageView btn8 = (ImageView) findViewById(R.id.btn8);
        ImageView btn9 = (ImageView) findViewById(R.id.btn9);
        ImageView btnpaint = (ImageView) findViewById(R.id.btnpaint);
        ImageView btnresult = (ImageView) findViewById(R.id.btnresult);

        ImageView btns = (ImageView) findViewById(R.id.btnsum);
        ImageView btnm = (ImageView) findViewById(R.id.btnmin);
        ImageView btnt = (ImageView) findViewById(R.id.btntaghsim);
        ImageView btnz = (ImageView) findViewById(R.id.btnzarb);

        ImageView btncc = (ImageView) findViewById(R.id.btncc);
        ImageView btnp = (ImageView) findViewById(R.id.btnp);

        final TextView view = (TextView) findViewById(R.id.view1);

        final EditText txt = (EditText) findViewById(R.id.txt);




        btnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),txt.length(),Toast.LENGTH_LONG).show();
            }
        });



        btnz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1 == null) {
                    num1 = Float.parseFloat(txt.getText().toString());
                    s = "*";
                    view.setText(num1.toString() + "*");
                    txt.setText("");
                }
                else{
                    float num3;
                    num3 = Float.parseFloat(txt.getText().toString());
                    num1 = num1 * num3;
                    String s;
                    s = view.getText().toString();
                    view.setText(s + num3 + "*");
                    txt.setText("");
                }
            }
        });


        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num1 == null) {
                    num1 = Float.parseFloat(txt.getText().toString());
                    s = "+";
                    view.setText(num1.toString() + "+");
                    txt.setText("");
                }
                else{
                    float num3;
                    num3 = Float.parseFloat(txt.getText().toString());
                    num1 = num1 + num3;
                    String s;
                    s = view.getText().toString();
                    view.setText(s + num3 + "+");
                    txt.setText("");
                }
            }
        });


        btnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1 == null) {
                    num1 = Float.parseFloat(txt.getText().toString());
                    s = "/";
                    view.setText(num1.toString() + "/");
                    txt.setText("");
                }else {

                    float num3;
                    num3 = Float.parseFloat(txt.getText().toString());
                    num1 = num1 / num3;
                    String s;
                    s = view.getText().toString();
                    view.setText(s + num3 + "/");
                    txt.setText("");
                }
            }
        });


        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1 == null) {
                    num1 = Float.parseFloat(txt.getText().toString());
                    s = "-";
                    view.setText(num1.toString() + "-");
                    txt.setText("");
                }else{
                    float num3;
                    num3 = Float.parseFloat(txt.getText().toString());
                    num1 = num1 - num3;
                    String s;
                    s = view.getText().toString();
                    view.setText(s + num3 + "-");
                    txt.setText("");
                }
            }
        });



        btncc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("");
                view.setText("");
                s = "0";
                num1 = null;
                num2 = null;
            }
        });

        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(txt.getText().toString());
                Float result;

                switch (s)
                {
                    case "*":
                        if(num2 == null){
                            result = num1;
                        }
                        else {
                            result = num1 * num2;
                        }
                        String s4,t4;
                        s4 = view.getText().toString();
                        t4 = txt.getText().toString();
                        if(t4 == "")
                        {
                            txt.setText(s4 + "=" + result.toString());

                        }else {
                            txt.setText(s4 + num2 + "=" + result.toString());
                        }
                        view.setText("");
                        s = "0";
                        num1 = null;
                        num2 = null;
                        break;


                    case "/":
                        if(num2 == null){
                            result = num1;
                        }
                        else {
                            result = num1 / num2;
                        }
                        String s3,t3;
                        s3 = view.getText().toString();
                        t3 = txt.getText().toString();
                        if(t3 == "")
                        {
                            txt.setText(s3 + "=" + result.toString());

                        }else {
                            txt.setText(s3 + num2 + "=" + result.toString());
                        }
                        view.setText("");
                        s = "0";
                        num1 = null;
                        num2 = null;
                        break;


                    case "-":
                        if(num2 == null){
                            result = num1;
                        }
                        else {
                            result = num1 - num2;
                        }
                        String s2,t2;
                        s2 = view.getText().toString();
                        t2 = txt.getText().toString();
                        if(t2 == "")
                        {
                            txt.setText(s2 + "=" + result.toString());

                        }else {
                            txt.setText(s2 + num2 + "=" + result.toString());
                        }
                        view.setText("");
                        s = "0";
                        num1 = null;
                        num2 = null;
                        break;

                    case "0":
                        Toast.makeText(getApplication(),"error",Toast.LENGTH_LONG).show();
                        txt.setText("");
                        break;


                    case "+":
                        if(num2 == null){
                            result = num1;
                        }
                        else {
                            result = num1 + num2;
                        }
                        String s,t;
                        s = view.getText().toString();
                        t = txt.getText().toString();
                        if(t == "")
                        {
                            txt.setText(s + "=" + result.toString());

                        }else {
                            txt.setText(s + num2 + "=" + result.toString());
                        }
                        view.setText("");
                        s = "0";
                        num1 = null;
                        num2 = null;
                        break;


                    default:
                        break;
                }
            }
        });



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "0");

            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "1");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "3");
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "4");
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "6");
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "7");
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "8");
            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "9");
            }
        });

        btnpaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + ".");
            }
        });
    }
}
