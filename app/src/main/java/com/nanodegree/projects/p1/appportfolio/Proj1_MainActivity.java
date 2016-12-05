package com.nanodegree.projects.p1.appportfolio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Proj1_MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button project2, project3, project4, project5, project6, project7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proj1__main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setButtonData();
    }

    private void setButtonData() {
        project2 = (Button) findViewById(R.id.btn_popular_movies);
        project3 = (Button) findViewById(R.id.btn_stok_hawk);
        project4 = (Button) findViewById(R.id.btn_build_it_bigger);
        project5 = (Button) findViewById(R.id.btn_make_material);
        project6 = (Button) findViewById(R.id.btn_go_u);
        project7 = (Button) findViewById(R.id.btn_capstone_app);
        project2.setOnClickListener(this);
        project3.setOnClickListener(this);
        project4.setOnClickListener(this);
        project5.setOnClickListener(this);
        project6.setOnClickListener(this);
        project7.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_proj1__main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent openMain1 = new Intent(Proj1_MainActivity.this, com.nanodegree.projects.p1.appportfolio.Developer.class);
            startActivity(openMain1);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_popular_movies:
                showToast((String) project2.getText());
                break;
            case R.id.btn_stok_hawk:
                showToast((String) project3.getText());
                break;
            case R.id.btn_build_it_bigger:
                showToast((String) project4.getText());
                break;
            case R.id.btn_make_material:
                showToast((String) project5.getText());
                break;
            case R.id.btn_go_u:
                showToast((String) project6.getText());
                break;
            case R.id.btn_capstone_app:
                showToast((String) project7.getText());
                break;

        }
    }

    private void showToast(String msg) {
        Toast.makeText(getApplicationContext(), "This button will launch " + msg + " Project", Toast.LENGTH_SHORT).show();
    }
}

