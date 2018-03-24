package org.unitec.mensajitoandroid;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

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
    public class TareaBuscarMensajes extends AsyncTask<Void, Void, Void> {
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

            //Conexion por medio de nuestro servicio
            try {

                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                //Obtener todos
                Mensajito[] mensajitos = restTemplate.getForObject("https://jc-unitec.herokuapp.com/api/mensajito", Mensajito[].class);
            } catch (Exception e) {

            }

            return null;
        }
    }

    public class TareaGuardarMensaje extends AsyncTask<Void, Void, Void> {
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

            //Conexion por medio de nuestro servicio
            try {

                Mensajito mensa = new Mensajito();

                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
               //Guardar todos
                Estatus estatus = restTemplate.postForObject("https://jc-unitec.herokuapp.com/api/mensajito",mensa, Estatus.class);
            } catch (Exception e) {

            }

            return null;
        }
    }
}
