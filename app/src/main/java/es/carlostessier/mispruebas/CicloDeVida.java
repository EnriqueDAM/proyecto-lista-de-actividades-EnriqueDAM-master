package es.carlostessier.mispruebas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CicloDeVida extends AppCompatActivity {

    final static String TAG = CicloDeVida.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclo_de_vida);
        android.util.Log.i(TAG, "onCreate");
    }

    protected void onStart(){
        super.onStart();
        android.util.Log.i(TAG, "onStart");
    }

    protected void onRestart(){
        super.onRestart();
        android.util.Log.i(TAG, "onRestart");
    }

    protected void onResume(){
        super.onResume();
        android.util.Log.i(TAG, "onResume");
    }

    protected void onPause(){
        super.onPause();
        android.util.Log.i(TAG, "onPause");
    }

    protected void onStop(){
        super.onStop();
        android.util.Log.i(TAG, "onStop");
    }

    protected void onDestroy(){
        super.onDestroy();
        android.util.Log.i(TAG, "onDestroy");
    }
}
