package edu.mnstate.cw3967me.fragmentexample;

import android.content.res.Configuration;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Configuration config = getResources().getConfiguration();
        FragmentManager fragMgr = getFragmentManager();
        FragmentTransaction fragTran = fragMgr.beginTransaction();

        //check which configuration is current
        if(config.orientation == Configuration.ORIENTATION_LANDSCAPE){
            LM_Fragment lm_fragment = new LM_Fragment();
            fragTran.replace(android.R.id.content, lm_fragment);
        }else{
            PM_Fragment pm_fragment = new PM_Fragment();
            fragTran.replace(android.R.id.content, pm_fragment);
        }
        fragTran.commit();
    }
}
