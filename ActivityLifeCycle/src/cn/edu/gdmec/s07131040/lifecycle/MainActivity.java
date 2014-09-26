package cn.edu.gdmec.s07131040.lifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
	@Override
	@Deprecated
	protected Dialog onCreateDialog(int id, Bundle args) {
		// TODO Auto-generated method stub
		return super.onCreateDialog(id, args);
	}


	public static final String TAG="LIFECYCLE";
    @Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i(TAG, "The activity state--->onDestroy"); 
	}


	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i(TAG, "The activity state--->onPause"); 
	}


	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i(TAG, "The activity state--->onReatart");
	}


	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i(TAG, "The activity state--->onResume");
	}


	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i(TAG,"This activity state--->onStart");
	}


	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		 Log.i(TAG, "The activity state--->onStop"); 
	}


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"this is a test string");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
