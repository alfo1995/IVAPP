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

public class slovacchia extends AppCompatActivity {
    TextView TotalTextView;
    EditText numberTxt;
    TextView text2;
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slovacchia);

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
        Button calcBtn = (Button)findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(numberTxt.getText())) {
                    Toast.makeText(v.getContext(), " number field is empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                else{
                    float number=Float.parseFloat(numberTxt.getText().toString());
                    float total = (100 * number)/120;
                    TotalTextView.setText(Float.toString(Math.round(total)));
                    text2.setText(Float.toString(Math.round(number-total)));
                    float total1=(number*120)/100;
                    text1.setText(Float.toString(Math.round(total1)));

                }

            }
        });

    }

}
