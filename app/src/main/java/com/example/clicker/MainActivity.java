package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickBtnAddStar(View view) {
        counter++;
        TextView counterView = findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
    }
    public void offClickaddStar(View view) {
        counter = counter+2;
        TextView countView = findViewById(R.id.txt_counter);
        countView.setText(counter.toString());
    }
    public void offClickaDdMStar(View view) {
        counter = 0;
        TextView countView = findViewById(R.id.txt_counter);
        countView.setText(counter.toString());}

}