package dahkim.com.phoneemersionproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** When On chosen, start notifications */
    // find out how to call method on On
    // call method on Off
    public void startNotifications(View view) {
        Spinner hourSpinner = (Spinner) findViewById(R.id.hourSpinner);
        Spinner minSpinner = (Spinner) findViewById(R.id.minSpinner);

        // print and see it works
        // add hours and minutes together to get time interval
        // every interval, pop up notification from database
    }
}
