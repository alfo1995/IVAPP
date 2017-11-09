package it.ivapp.alfonsodamelio.a00000;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import it.ivapp.alfonsodamelio.a00000.R;

/**
 * Created by alfonsodamelio on 07/05/17.
 */

public class activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(activity2.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}
