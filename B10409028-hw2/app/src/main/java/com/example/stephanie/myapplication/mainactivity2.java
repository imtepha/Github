package com.example.stephanie.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class mainactivity2 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntentA2A1 = new Intent(mainactivity2.this,
                MainActivity.class);

        switch (item.getItemId()) {
            case R.id.activity1:
                startActivity(myIntentA2A1);
                return true;
            case R.id.activity2:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
