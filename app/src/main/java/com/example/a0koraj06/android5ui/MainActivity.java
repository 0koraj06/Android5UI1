package com.example.a0koraj06.android5ui;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import static com.example.a0koraj06.android5ui.R.id.fab1;
import static com.example.a0koraj06.android5ui.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);


        View view = (View)findViewById(R.id.fab1);
        setSupportActionBar(view);

        fab1.setOnClickListener (new View.OnClickListener() {


            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this).setPositiveButton("OK", null).
                        setMessage("The FloatingActionButton was clicked!").show();
            }
        });


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView sv = (SearchView) MenuItemCompat.getActionView(item);
        sv.setOnQueryTextListener(new SearchHandler());
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.save){

            new AlertDialog.Builder(this).setPositiveButton("OK", null).
                    setMessage("Saving...").show();
            return true;
        }
        return false;
    }





    class SearchHandler implements SearchView.OnQueryTextListener {


        public SearchHandler(){

        }

        public boolean onQueryTextChange(String txt) {
            // do nothing... (this method runs when the user types a new character)
            return true;
        }

        public boolean onQueryTextSubmit(String txt) {
            // show the search text in an alert dialog
            new AlertDialog.Builder(MainActivity.this).setPositiveButton("OK", null).
                    setMessage(txt).show();
            return true;
        }
    }





}


