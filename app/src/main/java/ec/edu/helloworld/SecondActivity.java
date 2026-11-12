package ec.edu.helloworld;

import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showConfirmationDialog();
    }

    private void showConfirmationDialog() {
        new AlertDialog.Builder(this)
                .setTitle("Actividad 2")
                .setMessage("¿Deseas iniciar actividad 2?")
                .setCancelable(false)
                .setPositiveButton("Aceptar", (dialog, which) -> {
                    setContentView(R.layout.activity_second);
                })
                .setNegativeButton("Cancelar", (dialog, which) -> {
                    dialog.dismiss();
                    finish();
                })
                .show();
    }
}
