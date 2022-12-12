package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView gamesList;
    ArrayList<String> gameName = new ArrayList<> ();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        gamesList = findViewById (R.id.gamesList);
        gameName.add ("PUBG");
        gameName.add ("Realm Defense");
        gameName.add ("PUBG Lite");
        gameName.add ("Candy Crush");
        gameName.add ("Ludo Star");
        gameName.add ("Clash of clans");
        gameName.add ("Plants vs Zombies");
        gameName.add ("Need For Speed");
        gameName.add ("Art of War");
        gameName.add ("Angry Birds");
        gameName.add ("Chess");
        gameName.add ("Shadow Fight");
        gameName.add ("T3 Arena");
        gameName.add ("Puzzles");
        gameName.add ("Survivor");
        gameName.add ("Real Cricket");
        gameName.add ("WWC 3");
        gameName.add ("Golf");
        gameName.add ("Hay Day");

        ArrayAdapter<String> adapter = new ArrayAdapter<> (getApplicationContext (), android.R.layout.simple_list_item_1, gameName);
        gamesList.setAdapter (adapter);

        gamesList.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Toast.makeText (MainActivity.this, "Hello PUBG!", Toast.LENGTH_SHORT).show ();
                }
            }
        });


    }
}