package com.example.kolin.testartinity.presentation.screenlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.kolin.testartinity.R;
import com.example.kolin.testartinity.presentation.screeninfo.InfoActivity;
import com.example.kolin.testartinity.presentation.screeninfo.fragment.InfoFragment;
import com.example.kolin.testartinity.presentation.screenlist.fragment.ListFragment;

public class MainActivity extends AppCompatActivity
        implements ListFragment.ListFragmentListener{

    private static final String TAG_LIST = ListFragment.class.getSimpleName();
    private static final String TAG_INFO = InfoFragment.class.getSimpleName();


    private Fragment currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_activity_toolbar);

        setSupportActionBar(toolbar);
        setTitle(getString(R.string.statements));

        if (savedInstanceState != null) {
            currentFragment = getSupportFragmentManager().getFragment(savedInstanceState, TAG_LIST);
        } else {
            currentFragment = ListFragment.newInstance();
        }


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_activity_fl, currentFragment, TAG_LIST)
                .commit();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        getSupportFragmentManager().putFragment(outState, TAG_LIST, currentFragment);
    }

    @Override
    public void onClickOpenInfoActivity(String requestID) {
        Intent intent = new Intent(getApplicationContext(), InfoActivity.class);
        intent.putExtra("requestId", requestID);
        startActivity(intent);
    }

    @Override
    public void onClickOpenInfoFragment(String requestID) {
        InfoFragment infoFragment = (InfoFragment) getSupportFragmentManager().findFragmentByTag(TAG_INFO);
        if (infoFragment == null) {
            infoFragment = InfoFragment.newInstance(requestID);
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.main_activity_fl_content, infoFragment)
                    .commit();
        }
    }
}
