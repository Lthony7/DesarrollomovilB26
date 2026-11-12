package ec.edu.helloworld;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        showConfirmationDialog();
    }

    private void showConfirmationDialog() {
        new AlertDialog.Builder(this)
                .setTitle("Actividad 1")
                .setMessage("¿Deseas iniciar actividad 1?")
                .setCancelable(false)
                .setPositiveButton("Aceptar", (dialog, which) -> {
                    Intent intent = new Intent(FirstActivity.this, PinkActivity.class);
                    startActivity(intent);
                    finish();
                })
                .setNegativeButton("Cancelar", (dialog, which) -> {
                    dialog.dismiss();
                    finish();
                })
                .show();
    }
}
