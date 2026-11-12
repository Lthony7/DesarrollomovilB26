package ec.edu.helloworld;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnActivity1, btnActivity2, btnActivity3;
    LinearLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = findViewById(R.id.main);
        btnActivity1 = findViewById(R.id.btn_activity_1);
        btnActivity2 = findViewById(R.id.btn_activity_2);
        btnActivity3 = findViewById(R.id.btn_activity_3);

        btnActivity1.setOnClickListener(this);
        btnActivity2.setOnClickListener(this);
        btnActivity3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_activity_1) {
            Snackbar.make(main, "Estás empleando Snackbar", Snackbar.LENGTH_LONG)
                    .setAction("Gracias", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Log.i(getApplicationContext().getPackageName(), "Gracias por usar Snackbar");
                        }
                    }).show();
            callAlertDialogActivity1();
        } else if (id == R.id.btn_activity_2) {
            callAlertDialogActivity2();
        } else if (id == R.id.btn_activity_3) {
            callAlertDialogActivity3();
        }
    }

    private void callAlertDialogActivity1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Mensaje");
        builder.setMessage("¿Deseas iniciar Actividad 1?");
        builder.setPositiveButton("Aceptar", (dialogInterface, i) -> {
            Intent intent = new Intent(this, PinkActivity.class);
            startActivity(intent);
        });
        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Usted ha pulsado la opción cancelar", Toast.LENGTH_LONG).show();
            }
        });
        builder.setCancelable(false);
        builder.show();
    }

    private void callAlertDialogActivity2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Mensaje");
        builder.setMessage("¿Deseas iniciar Actividad 2?");
        builder.setPositiveButton("Aceptar", (dialogInterface, i) -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });
        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Usted ha pulsado la opción cancelar", Toast.LENGTH_LONG).show();
            }
        });
        builder.setCancelable(false);
        builder.show();
    }

    private void callAlertDialogActivity3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Mensaje");
        builder.setMessage("¿Deseas iniciar Actividad 3?");
        builder.setPositiveButton("Aceptar", (dialogInterface, i) -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        });
        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Usted ha pulsado la opción cancelar", Toast.LENGTH_LONG).show();
            }
        });
        builder.setCancelable(false);
        builder.show();
    }
}
