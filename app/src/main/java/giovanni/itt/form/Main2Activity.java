package giovanni.itt.form;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txtNombre, txtTelefono, txtDireccion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtNombre = (TextView) findViewById(R.id.textNombres);
        txtTelefono = (TextView) findViewById(R.id.textTelfonos);
        txtDireccion = (TextView) findViewById(R.id.textDirecciones);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {//ver si contiene datos
            String datoNombre = (String) extras.get("nombre");//Obtengo el nombre
            String datoTelefono = (String) extras.get("telefono");//Obtengo la edad
            String datoDireccion = (String) extras.get("telefono");

            txtNombre.setText(datoNombre);
            txtTelefono.setText(datoTelefono);
            txtDireccion.setText(datoDireccion);

        }
    }
}


