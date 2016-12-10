package edu.mnstate.cw3967me.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by marikonoguchi on 10/12/16.
 */
public class PM_Fragment extends Fragment{
    public View onCreateView(LayoutInflater inf, ViewGroup container, Bundle savedInstanceState) {
        //inflate the layout for this fragment
        return inf.inflate(R.layout.pm_fragment, container, false);
    }
}

