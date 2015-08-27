package br.com.thayssantos.architecturestructurestudies.view.activities;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import br.com.thayssantos.architecturestructurestudies.R;
import br.com.thayssantos.architecturestructurestudies.view.navigation.FragmentManager;


public class MainActivity extends AppCompatActivity {


    private FragmentManager mCurrentFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mCurrentFrag = FragmentManager.HOME;
        this.mCurrentFrag.execute(this);

    }

    @Override
    public void onBackPressed() {

        int count = getFragmentManager().getBackStackEntryCount();

        if (count == 0) {
            super.onBackPressed();
        } else {
            getFragmentManager().popBackStack();
        }

    }
}
