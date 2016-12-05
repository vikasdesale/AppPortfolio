package com.nanodegree.projects.p1.appportfolio;


import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;


public class Developer extends AppCompatActivity implements View.OnClickListener {
    ImageView fbe, linkedin, googleplus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();

        actionbar.setTitle("Developed By");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        }

        fbe = (ImageView) findViewById(R.id.face);
        googleplus = (ImageView) findViewById(R.id.googlep);
        linkedin = (ImageView) findViewById(R.id.linkedi);
        fbe.setOnClickListener(this);
        googleplus.setOnClickListener(this);
        linkedin.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {

            NavUtils.navigateUpFromSameTask(this);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            case R.id.face:
                Uri uri6 = Uri.parse("https://www.facebook.com/vikas.desale.963");
                Intent intent6 = new Intent(Intent.ACTION_VIEW, uri6);
                startActivity(intent6);
                break;
            case R.id.linkedi:
                Uri uri7 = Uri.parse("https://www.linkedin.com/in/vikas-desale-01756774");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri7);
                startActivity(intent);
                break;

            case R.id.googlep:
                Uri uri2 = Uri.parse("https://plus.google.com/101910787809465436804/posts/p/pub");
                Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(intent2);
                break;

        }
    }
}
