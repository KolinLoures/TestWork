package com.example.kolin.testartinity.presentation.screeninfo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.kolin.testartinity.R;
import com.example.kolin.testartinity.presentation.screeninfo.fragment.InfoFragment;

public class InfoActivity extends AppCompatActivity {

    private static final String TAG = InfoFragment.class.getSimpleName();

    private Fragment currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Toolbar toolbar = (Toolbar) findViewById(R.id.info_activity_toolbar);

        setSupportActionBar(toolbar);
        setTitle(getString(R.string.detail_information));

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        if (savedInstanceState != null){
            currentFragment = getSupportFragmentManager().getFragment(savedInstanceState, TAG);
        } else {
            currentFragment = InfoFragment.newInstance(getIntent().getStringExtra("requestId"));
        }

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.info_activity_fl, currentFragment, TAG)
                .commit();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        getSupportFragmentManager().putFragment(outState, TAG, currentFragment);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
