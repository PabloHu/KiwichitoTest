package com.software.test.huaman.kiwichitotest;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FragmentActivity extends AppCompatActivity implements BlueFragment.OnFragmentInteractionListener {
    private static final String BLUE_FRAGMENT_TAG = "bluefragmentRAG";
    private static final String GREEN_FRAGMENT_TAG = "greenfragmentRAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }

    public void addFragment(View view) {
        switch (view.getId()) {
            case R.id.btnRedFragment:

                GreenFragment greenFragment =  GreenFragment.newInstance("a", "b");
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.flFragHolderBlue, greenFragment, GREEN_FRAGMENT_TAG)
                        .addToBackStack(GREEN_FRAGMENT_TAG)
                        .commit();

                break;

            case R.id.btnBlueFragment:

                Toast.makeText(this, "Blue", Toast.LENGTH_SHORT).show();

                String firstArg = "John";
                String secondArg = "Doe";

              //  BlueFragment blueFragment1 = BlueFragment.newInstance(firstArg, secondArg);
              //  getSupportFragmentManager().beginTransaction().
                BlueFragment blueFragment = new BlueFragment();//.newInstance(firstArg, secondArg);
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.flFragHolderBlue, blueFragment, BLUE_FRAGMENT_TAG)
                        .addToBackStack(BLUE_FRAGMENT_TAG)
                        .commit();
                break;
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
