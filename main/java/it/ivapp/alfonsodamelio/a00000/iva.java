package it.ivapp.alfonsodamelio.a00000;

/**
 * Created by alfonsodamelio on 31/01/17.
 */

import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import it.ivapp.alfonsodamelio.a00000.R;


public class iva extends Fragment {



    String[] countries;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.iva, container, false);
        setHasOptionsMenu(true);

        Resources res =getResources();


        countries=res.getStringArray(R.array.countries);

        View view = inflater.inflate(R.layout.iva, container, false);



        final ListView listView=(ListView) view.findViewById(R.id.listView1);

        ArrayAdapter<String> listViewAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_expandable_list_item_1,
                countries);

        listView.setAdapter(listViewAdapter);










        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){

                    Intent newActivity = new Intent(getActivity(),austria.class);
                    startActivity(newActivity);

                }
                if(position==1){

                    Intent newActivity = new Intent(getActivity(),belgio.class);
                    startActivity(newActivity);

                }
                if(position==2){

                    Intent newActivity = new Intent(getActivity(),bulgaria.class);
                    startActivity(newActivity);
                }
                if(position==3){

                    Intent newActivity = new Intent(getActivity(),cipro.class);
                    startActivity(newActivity);
                }
                if(position==4){

                    Intent newActivity = new Intent(getActivity(),croazia.class);
                    startActivity(newActivity);
                }
                if(position==5){

                    Intent newActivity = new Intent(getActivity(),danish.class);
                    startActivity(newActivity);
                }
                if(position==6){

                    Intent newActivity = new Intent(getActivity(),estonia.class);
                    startActivity(newActivity);
                }
                if(position==7){

                    Intent newActivity = new Intent(getActivity(),finlandia.class);
                    startActivity(newActivity);
                }
                if(position==8){

                    Intent newActivity = new Intent(getActivity(),francia.class);
                    startActivity(newActivity);
                }
                if(position==9){

                    Intent newActivity = new Intent(getActivity(),germania.class);
                    startActivity(newActivity);
                }
                if(position==10){

                    Intent newActivity = new Intent(getActivity(),grecia.class);
                    startActivity(newActivity);
                }
                if(position==11){

                    Intent newActivity = new Intent(getActivity(),irlanda.class);
                    startActivity(newActivity);
                }
                if(position==12){

                    Intent newActivity = new Intent(getActivity(),italia.class);
                    startActivity(newActivity);
                }
                if(position==13){

                    Intent newActivity = new Intent(getActivity(),lituania.class);
                    startActivity(newActivity);
                }
                if(position==14){

                    Intent newActivity = new Intent(getActivity(),malta.class);
                    startActivity(newActivity);
                }
                if(position==15){

                    Intent newActivity = new Intent(getActivity(),olanda.class);
                    startActivity(newActivity);
                }
                if(position==16){

                    Intent newActivity = new Intent(getActivity(),polonia.class);
                    startActivity(newActivity);
                }
                if(position==17){

                    Intent newActivity = new Intent(getActivity(),porto.class);
                    startActivity(newActivity);
                }
                if(position==18){

                    Intent newActivity = new Intent(getActivity(),regno.class);
                    startActivity(newActivity);
                }
                if(position==19){

                    Intent newActivity = new Intent(getActivity(),rep.class);
                    startActivity(newActivity);
                }
                if(position==20){

                    Intent newActivity = new Intent(getActivity(),romania.class);
                    startActivity(newActivity);
                }
                if(position==21){

                    Intent newActivity = new Intent(getActivity(),slovacchia.class);
                    startActivity(newActivity);
                }
                if(position==22){

                    Intent newActivity = new Intent(getActivity(),slovenia.class);
                    startActivity(newActivity);
                }
                if(position==23){

                    Intent newActivity = new Intent(getActivity(),spagna.class);
                    startActivity(newActivity);
                }
                if(position==24){

                    Intent newActivity = new Intent(getActivity(),svezia.class);
                    startActivity(newActivity);
                }
                if(position==25){

                    Intent newActivity = new Intent(getActivity(),ungheria.class);
                    startActivity(newActivity);
                }
















            }



        });

        return (view);


    }


}





