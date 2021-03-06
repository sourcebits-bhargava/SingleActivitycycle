package splash.royal.com.singleactivitycycle;

import android.app.Activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends Activity {

    private final static String TAG="In this SingleActivity: ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        Log.v(TAG, "Activity Created");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start", Toast.LENGTH_SHORT);
        Log.i(TAG,"Activity started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "On resume", Toast.LENGTH_SHORT);
        Log.i(TAG, "Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "on Pause", Toast.LENGTH_SHORT);
        Log.i(TAG, "Activity Paused");

    }



    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "on Stop", Toast.LENGTH_SHORT);
        Log.i(TAG, "Activity Stopped");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "on Restart", Toast.LENGTH_SHORT);
        Log.i(TAG, "Activity Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "on Destroyed", Toast.LENGTH_SHORT);
        Log.i(TAG, "Activity Destroyed");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(this, "on Saved Instance", Toast.LENGTH_SHORT);
        Log.i(TAG, "Activity Saved Instance");

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(this, "on Restore Instance ", Toast.LENGTH_SHORT);
        Log.i(TAG, "Activity Restore Instance");
    }
}
