package com.example.viewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button log;
    EditText gameInput;
    ListView history;
    ArrayList<String> games;

    public void onClickAdd(View v){

        String text = gameInput.getText().toString();

        if(!text.equals("")) {
            games.add(text);
            ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, games);
            history.setAdapter(adapter);
            gameInput.setText("");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        log = findViewById(R.id.log);
        gameInput = findViewById(R.id.gameTextLogger);
        history = findViewById(R.id.gameHistory);
        games = new ArrayList<>();
    }
}