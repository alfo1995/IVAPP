package it.ivapp.alfonsodamelio.a00000;

/**
 * Created by alfonsodamelio on 31/01/17.
 */

import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import it.ivapp.alfonsodamelio.a00000.R;

public class home extends Fragment{
    TextView TotalTextView;
    EditText percentageTxt;
    EditText numberTxt;
    TextView text7;
    TextView text17;
    TextView text21;
    FloatingActionButton fab_plus, fab_fb, fab_insta, fab_google;
    Animation fabOpen, fabClose, fabRClockwise, fabRanticlockwise;
    boolean isOpen = false;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View View = inflater.inflate(R.layout.home, container, false);
        TotalTextView=(TextView)View.findViewById(R.id.TotalTextView);
        percentageTxt=(EditText) View.findViewById(R.id.percentageTxt);
        text7=(TextView)View.findViewById(R.id.text7);
        text17=(TextView)View.findViewById(R.id.textView17);
        text21=(TextView)View.findViewById(R.id.textView21);
        /**text25=(TextView)View.findViewById(R.id.textView25);**/
        numberTxt=(EditText)View.findViewById(R.id.numberTxt);
        Button calcBtn = (Button) View.findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (TextUtils.isEmpty(percentageTxt.getText())||TextUtils.isEmpty(numberTxt.getText())) {
                    Toast.makeText(getContext(), "percentage or number field could be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                else{
                    float percentage = Float.parseFloat(percentageTxt.getText().toString());
                    float number=Float.parseFloat(numberTxt.getText().toString());
                    float dec = percentage / 100;
                    float total = Math.round(dec * number);
                    TotalTextView.setText(Float.toString(total));
                    text7.setText(Float.toString(number-total));

                    float total2 = (100 * number)/(100+percentage);
                    text17.setText(Float.toString(Math.round(total2)));
                    text21.setText(Float.toString(Math.round(number-total2)));

                    /**float total3=(number*(100+percentage))/100;
                    text25.setText(Float.toString(Math.round(total3)));**/

                }








            }


        });
        return View;

    }




}
