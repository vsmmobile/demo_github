package or.th.test.demo_github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LOG_N", "onCreate: ");
        Log.d("LOG_N", "onCreate1: ");
        Log.d("LOG_N", "onCreate2: ");
        Log.d("LOG_N", "onCreate3: ");
    }
}
