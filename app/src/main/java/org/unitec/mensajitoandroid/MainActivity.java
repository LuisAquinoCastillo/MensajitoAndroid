package org.unitec.mensajitoandroid;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//AppCompatActivity es la que permite la compatibilidad de versiones de android con la aplicación
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Funcion asincronica
    /*
    Funciones para llamadas asincronicas
    1.-Preexecute
    2.-Postexecute
    3.-Background
    * */
    public class TareaBuscarMensajes extends AsyncTask<Void,Void,Void>{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
        }

        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }
}
