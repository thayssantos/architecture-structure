package br.com.thayssantos.architecturestructurestudies.view.navigation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import br.com.thayssantos.architecturestructurestudies.R;
import br.com.thayssantos.architecturestructurestudies.view.activities.MainActivity;
import br.com.thayssantos.architecturestructurestudies.view.fragments.HomeFragment;

/**
 * Created by thays on 27/08/15.
 */
public enum FragmentManager {

    HOME {
        @Override
        public void execute(MainActivity activity) {

            this.replaceFragmentInView(activity, new HomeFragment());
        }
    };

    /**
     * Replaces the current fragment to parameter fragment
     * @param activity
     * @param fragment
     */
    void replaceFragmentInView(MainActivity activity, Fragment fragment) {

        String tag = fragment.getClass().getSimpleName();

        if(activity != null) {
            android.support.v4.app.FragmentManager manager = activity.getSupportFragmentManager();
            FragmentTransaction tx = activity.getSupportFragmentManager().beginTransaction();
            tx.replace(R.id.main_fragment, fragment, tag);

            if (manager.findFragmentByTag(tag) != null) {
                manager.popBackStack(tag, android.support.v4.app.FragmentManager.POP_BACK_STACK_INCLUSIVE);
                tx.addToBackStack(tag);
            } else {
                tx.addToBackStack(tag);
            }

            tx.commit();
        }
    }

    public abstract void execute(MainActivity activity);
}
