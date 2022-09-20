package betanzo.nelly.a01_ejercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import betanzo.nelly.a01_ejercicio01.modelos.Users;

public class MainActivity extends AppCompatActivity {

    //PASO 1 DEFINIR VARIABLES

    //Variables tipo vista

    private EditText txtNombre;
    private TextView lblSaludo;
    private Button btnSaludar;
    private Button btnReset;

    //Variables logicas

    private ArrayList<Users>listaUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // PASO 2 INICIALIZACIÓN DE VARIABLES VISTAS
        inicializaVistas();

        listaUsers = new ArrayList<>();

      // PASO 3 EVENTOS

        //Cuando le das click al boton reset, el label se pone vacio.

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblSaludo.setText("");
            }
        });
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtNombre.getText().toString().trim().isEmpty()){
                    Toast.makeText(MainActivity.this, "Escribe algo bob@", Toast.LENGTH_SHORT).show();
                } else{
                    lblSaludo.setText("Hola"+txtNombre.getText()+". Buenos días.");
                    txtNombre.setText("");
                }
            }
        });
    }
    private void inicializaVistas(){

        txtNombre = findViewById(R.id.txtNombeMain);
        lblSaludo = findViewById(R.id.lblSaludoMain);
        btnReset = findViewById(R.id.btnResetMain);
        btnSaludar = findViewById(R.id.btnSaludarMain);

    }
}
