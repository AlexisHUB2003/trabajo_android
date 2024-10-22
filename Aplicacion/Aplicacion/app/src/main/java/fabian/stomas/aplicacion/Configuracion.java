package fabian.stomas.aplicacion;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import fabian.stomas.aplicacion.databinding.ConfigurationBinding;

public class Configuracion extends AppCompatActivity {
    ConfigurationBinding biding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        biding = ConfigurationBinding.inflate(getLayoutInflater());
        setContentView(biding.getRoot());

        biding.returnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        biding.usereditBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Configuracion.this, userEdit.class);
                startActivity(intent);
            }
        });
        biding.cardNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Configuracion.this, Apuntes.class);
                startActivity(intent);
            }
        });
    }
}
