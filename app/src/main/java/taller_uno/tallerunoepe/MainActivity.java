package taller_uno.tallerunoepe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Cliente c;
    Button btnMensajeUno;
    Button btnMensajeDos;
    Button btnMensajeTres;
    Button btnMensajeCuatro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c = new Cliente(this);
        c.start();

        btnMensajeUno = findViewById(R.id.btn_mensaje1);
        btnMensajeUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c.enviar("1");
            }
        });

        btnMensajeDos = findViewById(R.id.btn_mensaje2);
        btnMensajeDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c.enviar("2");
            }
        });

        btnMensajeTres = findViewById(R.id.btn_mensaje3);
        btnMensajeTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c.enviar("3");
            }
        });

        btnMensajeCuatro = findViewById(R.id.btn_mensaje4);
        btnMensajeCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c.enviar("4");
            }
        });
    }

}
