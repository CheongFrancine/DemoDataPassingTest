package sg.edu.rp.c346.id20020509.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    //Step 1
    TextView tvAnswer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        //Step 2
        tvAnswer3 = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        double value3 = intentReceived.getDoubleExtra("value3", 0.0);
        tvAnswer3.setText("Double value received is: " + value3);
    }
}