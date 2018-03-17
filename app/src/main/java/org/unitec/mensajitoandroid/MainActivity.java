package org.unitec.mensajitoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//AppCompatActivity es la que permite la compatibilidad de versiones de android con la aplicación
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
