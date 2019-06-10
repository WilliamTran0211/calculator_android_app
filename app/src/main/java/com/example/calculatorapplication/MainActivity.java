package com.example.calculatorapplication;


import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import nguyenvanquan7826.com.Balan;

public class MainActivity extends AppCompatActivity {

    //Using Balan Libs by NguyenVanQuan7826

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSevent, btnEight, btnNine, btnZero, btnPlus, btnMinus, btnMultiply, btnDivied, btnEquals, btnAC;
    TextView txtScreen;

    public String math = "";

    View.OnClickListener myClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addControls();
        addEvents();

    }

    private void addControls() {
        btnZero = (Button) findViewById(R.id.btnZero);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSevent = (Button) findViewById(R.id.btnSevent);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);

        btnEquals = (Button) findViewById(R.id.btnEquals);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivied = (Button) findViewById(R.id.btnDivided);
        btnAC = (Button) findViewById(R.id.btnAC);


        txtScreen = (TextView) findViewById(R.id.txtScreen);
    }

    private void  addEvents(){
         myClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.btnZero:
                        math = math + "0";
                        txtScreen.setText(math+"");
                        break;
                    case R.id.btnOne:
                        math = math + "1";
                        txtScreen.setText(math+"");
                        break;
                    case R.id.btnTwo:
                        math = math + "2";
                        txtScreen.setText(math+"");
                        break;
                    case R.id.btnThree:
                        math = math + "3";
                        txtScreen.setText(math+"");
                        break;
                    case R.id.btnFour:
                        math = math + "4";
                        txtScreen.setText(math+"");
                        break;
                    case R.id.btnFive:
                        math = math + "5";
                        txtScreen.setText(math+"");
                        break;
                    case R.id.btnSix:
                        math = math + "6";
                        txtScreen.setText(math+"");
                        break;
                    case R.id.btnSevent:
                        math = math + "7";
                        txtScreen.setText(math+"");
                        break;
                    case R.id.btnEight:
                        math = math + "8";
                        txtScreen.setText(math+"");
                        break;
                    case R.id.btnNine:
                        math = math + "9";
                        txtScreen.setText(math+"");
                        break;
                    case R.id.btnPlus:
                        math = math + "+";
                        txtScreen.setText(math+"");
                        break;
                    case R.id.btnMinus:
                        math = math + "-";
                        txtScreen.setText(math+"");
                        break;
                    case R.id.btnMultiply:
                        math = math + "*";
                        txtScreen.setText(math+"");
                        break;
                    case R.id.btnDivided:
                        math = math + "/";
                        txtScreen.setText(math+"");
                        break;
                    case R.id.btnEquals:
                    {
                        String tmp = math.toString().trim();

                        if(tmp.length() > 0) {
                            Balan bl = new Balan();
                            String result = bl.valueMath(math) + "";
                            String error = bl.getError();

                            // check error
                            if (error != null) {
                                Snackbar.make(view, error, Snackbar.LENGTH_LONG)
                                        .setAction("", null).show();
                            } else { // show result
                                math = result;
                                txtScreen.setText(math);
                            }
                        }
                        break;
                    }
                    case R.id.btnAC:
                        math="";
                        txtScreen.setText(math+"");
                        break;
                    default:

                        break;
                }
            }
        };

        btnZero.setOnClickListener(myClick);
        btnOne.setOnClickListener(myClick);
        btnTwo.setOnClickListener(myClick);
        btnThree.setOnClickListener(myClick);
        btnFour.setOnClickListener(myClick);
        btnFive.setOnClickListener(myClick);
        btnSix.setOnClickListener(myClick);
        btnSevent.setOnClickListener(myClick);
        btnEight.setOnClickListener(myClick);
        btnNine.setOnClickListener(myClick);

        btnPlus.setOnClickListener(myClick);
        btnMinus.setOnClickListener(myClick);
        btnMultiply.setOnClickListener(myClick);
        btnDivied.setOnClickListener(myClick);
        btnEquals.setOnClickListener(myClick);
        btnAC.setOnClickListener(myClick);

    }
}
