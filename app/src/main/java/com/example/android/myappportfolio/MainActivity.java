package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

        return super.onOptionsItemSelected(item);
    }

    //placeholder for project launcher
    public void launchSpotifyStreamer(View view){
        Toast.makeText(getApplicationContext(),
                "This button will launch Spotify Streamer app!",
                Toast.LENGTH_SHORT).show();
    }

    //placeholder for project launcher
    public void launchScoresApp(View view){
        Toast.makeText(getApplicationContext(),
                "This button will launch scores app!",
                Toast.LENGTH_SHORT).show();
    }

    //placeholder for project launcher
    public void launchLibraryApp(View view){
        Toast.makeText(getApplicationContext(),
                "This button will launch library app!",
                Toast.LENGTH_SHORT).show();
    }

    //placeholder for project launcher
    public void launchBuildItBigger(View view){
        Toast.makeText(getApplicationContext(),
                "This button will launch Build It Bigger app!",
                Toast.LENGTH_SHORT).show();
    }

    //placeholder for project launcher
    public void launchXYZReader(View view){
        Toast.makeText(getApplicationContext(),
                "This button will launch XYZ Reader app!",
                Toast.LENGTH_SHORT).show();
    }

    //placeholder for project launcher
    public void launchMyOwnApp(View view){
        Toast.makeText(getApplicationContext(),
                "This button will launch my app!",
                Toast.LENGTH_SHORT).show();
    }




}
