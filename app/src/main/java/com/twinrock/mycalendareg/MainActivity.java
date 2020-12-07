package com.twinrock.mycalendareg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    CalendarCustomView calendarCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarCustomView = findViewById(R.id.custom_calendar_view);

    }
}
