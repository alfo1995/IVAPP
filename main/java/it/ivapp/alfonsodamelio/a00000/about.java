package it.ivapp.alfonsodamelio.a00000;

/**
 * Created by alfonsodamelio on 31/01/17.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import it.ivapp.alfonsodamelio.a00000.R;

public class about extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.about, container, false);
        setHasOptionsMenu(true);
        return rootView;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
    public void onPrepareOptionsMenu(Menu menu) {
        MenuItem item1=menu.findItem(R.id.mninGrey);
        MenuItem item2=menu.findItem(R.id.mninWhite);
        MenuItem item3=menu.findItem(R.id.mninYellow);
        item1.setVisible(false);
        item2.setVisible(false);
        item3.setVisible(false);

    }


}
