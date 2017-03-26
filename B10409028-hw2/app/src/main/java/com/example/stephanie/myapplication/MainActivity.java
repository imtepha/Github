package com.example.stephanie.myapplication;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuInflater;
        import android.view.MenuItem;


//import android.os.Bundle;
//import android.app.Activity;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntentA1A2 = new Intent(MainActivity.this,
                mainactivity2.class);

        switch (item.getItemId()) {
            case R.id.activity1:
                return true;
            case R.id.activity2:
                startActivity(myIntentA1A2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



}

