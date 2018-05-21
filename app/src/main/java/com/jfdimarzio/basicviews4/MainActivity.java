package com.jfdimarzio.basicviews4;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TimePicker timePicker;
    DatePicker datePicker;
    int hour, minute;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = (TimePicker) findViewById(R.id.timePicker);
        timePicker.setIs24HourView(true);
        datePicker = (DatePicker) findViewById(R.id.datePicker);

    }
    private TimePickerDialog.OnTimeSetListener mTimeSetListener =
            new TimePickerDialog.OnTimeSetListener()

            {
 public void onTimeSet(
         TimePicker view, int hourOfDay, int minuteOfHour)
 {
     hour = hourOfDay;
     minute = minuteOfHour;
     SimpleDateFormat timeFormat = new
         SimpleDateFormat("hh:mm aa");

     Date date = new Date();
     String strDate = timeFormat.format(date);
     Toast.makeText(getBaseContext(),
          "You have selected " + strDate,
          Toast.LENGTH_SHORT).show();
      }
 };

                public void onClick(View view) {
        Toast.makeText(getBaseContext(),
                "Time selected:" +
                        timePicker.getHour() +
                        ":" + timePicker.getMinute(),
                Toast.LENGTH_SHORT).show();
    }

}



