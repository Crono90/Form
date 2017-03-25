package giovanni.itt.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnEnviar;
    private EditText ediNombre, ediTelefono,ediDireccion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar=(Button)findViewById(R.id.ButtonEnviar);
        ediNombre = (EditText) findViewById( R.id.txtNombre );
        ediTelefono = (EditText) findViewById( R.id.txtTelefono );
        ediDireccion = (EditText) findViewById( R.id.txtVilla );

        btnEnviar.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        Intent explicit_intent;

        //Instanciamos el Intent dandole:
        // el contexto y la clase a la cual nos deseamos dirigir
        explicit_intent = new Intent(this,Main2Activity.class);
        String auxEdiNombre=ediNombre.getText().toString();
        String auxEdiTelefono=ediTelefono.getText().toString();
        String auxEdiDireccion=ediDireccion.getText().toString();

        explicit_intent.putExtra("nombre",auxEdiNombre);//Guardamos una cadena
        explicit_intent.putExtra("telefono",auxEdiTelefono);//Guardamos un entero
        explicit_intent.putExtra("direccion",auxEdiNombre);

        startActivity(explicit_intent);


    }
}
