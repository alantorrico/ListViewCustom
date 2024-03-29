package com.alantor.listviewcustom;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        User u1 = new User("Noelia Zambrana", "Buenos Aires");
        User u2 = new User("Alan Torrico", "Cochabamba");
        User u3 = new User("Ana Roja", "Lima");
        User u4 = new User("Pablo Perez", "Bogota");

        ArrayList<User> listUsers = new ArrayList<User>();
        UsersAdapter adapter = new UsersAdapter(this, listUsers);

        adapter.add(u1);
        adapter.add(u2);
        adapter.add(u3);
        adapter.add(u4);

        ListView listView = (ListView) findViewById(R.id.lvItems);
        listView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
