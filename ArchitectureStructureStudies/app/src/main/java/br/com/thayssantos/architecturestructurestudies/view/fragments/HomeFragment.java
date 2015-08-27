package br.com.thayssantos.architecturestructurestudies.view.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.thayssantos.architecturestructurestudies.R;

/**
 * Created by thays on 27/08/15.
 */
public class HomeFragment extends Fragment{

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(view == null) {
            view = inflater.inflate(R.layout.home_fragment, container, false);

        }

        return view;
    }
}
