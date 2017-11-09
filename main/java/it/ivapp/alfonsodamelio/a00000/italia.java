package it.ivapp.alfonsodamelio.a00000;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import it.ivapp.alfonsodamelio.a00000.R;

/**
 * Created by alfonsodamelio on 06/02/17.
 */

public class italia extends AppCompatActivity {
    TextView TotalTextView;
    EditText numberTxt;
    TextView text2;
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.italia);

        TotalTextView=(TextView) findViewById(R.id.TotalTextView);
        text2=(TextView)findViewById(R.id.text2);
        text1=(TextView)findViewById(R.id.text1);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),MainActivity.class));
                Toast.makeText(view.getContext(), "turn to home",
                        Toast.LENGTH_SHORT).show();
            }
        });






        numberTxt=(EditText)findViewById(R.id.numberTxt);

         Button btn3 = (Button)findViewById(R.id.button3);
        Button btn4 = (Button)findViewById(R.id.button4);
        Button btn5 = (Button)findViewById(R.id.button5);


       btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(numberTxt.getText())) {
                    Toast.makeText(v.getContext(), " number field is empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                else{
                    float number=Float.parseFloat(numberTxt.getText().toString());
                    float total = (100 * number)/122;
                    TotalTextView.setText(Float.toString(Math.round(total)));
                    text2.setText(Float.toString(Math.round(number-total)));
                    float total1=(number*122)/100;
                    text1.setText(Float.toString(Math.round(total1)));
                    Toast.makeText(v.getContext(), " aliquota ordinaria: da applicare in tutti i casi in cui la normativa non " +
                            "prevede una delle due aliquote precedenti.", Toast.LENGTH_LONG).show();
                }


            }




        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(numberTxt.getText())) {
                    Toast.makeText(v.getContext(), " number field is empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                else{
                    float number=Float.parseFloat(numberTxt.getText().toString());
                    float total = (100 * number)/110;
                    TotalTextView.setText(Float.toString(Math.round(total)));
                    text2.setText(Float.toString(Math.round(number-total)));
                    float total1=(number*110)/100;
                    text1.setText(Float.toString(Math.round(total1)));
                    Toast.makeText(v.getContext(), " Aliquota ridotta: applicata ai servizi turistici (alberghi, bar, ristoranti e altri prodotti turistici)," +
                            " a determinati prodotti alimentari e particolari operazioni di recupero edilizio", Toast.LENGTH_LONG).show();
                }


            }




        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(numberTxt.getText())) {
                    Toast.makeText(v.getContext(), " number field is empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                else{
                    float number=Float.parseFloat(numberTxt.getText().toString());
                    float total = (100 * number)/104;
                    TotalTextView.setText(Float.toString(Math.round(total)));
                    text2.setText(Float.toString(Math.round(number-total)));
                    float total1=(number*104)/100;
                    text1.setText(Float.toString(Math.round(total1)));
                    Toast.makeText(v.getContext(), " Aliquota minima: applicata ad esempio alle vendite di generi " +
                            "di prima necessità (alimentari, stampa quotidiana o periodica, ecc.)", Toast.LENGTH_LONG).show();
                }


            }




        });

    }

}

