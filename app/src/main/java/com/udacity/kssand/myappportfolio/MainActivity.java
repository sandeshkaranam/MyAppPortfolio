package com.udacity.kssand.myappportfolio;

import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Dynamic way of handling on click event
        /*Button button = (Button) findViewById(R.id.spotify_steamer_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "This Button will launch Spotify Steamer App", Toast.LENGTH_SHORT).show();
            }
        });*/
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

    public void buttonClick(View view){
        if(view instanceof Button) {
            Button button = (Button) view;
            switch (button.getText().toString()) {
                case "Spotify Steamer":
                    Toast.makeText(view.getContext(), "This Button will launch Spotify Steamer App", Toast.LENGTH_SHORT).show();
                    break;
                case "Scores App":
                    Toast.makeText(view.getContext(), "This Button will launch Scores App", Toast.LENGTH_SHORT).show();
                    break;
                case "Library App":
                    Toast.makeText(view.getContext(), "This Button will launch Library App", Toast.LENGTH_SHORT).show();
                    break;
                case "Build It Bigger":
                    Toast.makeText(view.getContext(), "This Button will launch Build It Bigger App", Toast.LENGTH_SHORT).show();
                    break;
                case "XYZ Reader":
                    Toast.makeText(view.getContext(), "This Button will launch XYZ Reader App", Toast.LENGTH_SHORT).show();
                    break;
                case "Capstone":
                    Toast.makeText(view.getContext(), "This Button will launch Capstone App", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    //do nothing
            }
        }
    }
}
