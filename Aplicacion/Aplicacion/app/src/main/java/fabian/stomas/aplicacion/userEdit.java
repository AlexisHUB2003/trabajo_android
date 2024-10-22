package fabian.stomas.aplicacion;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import fabian.stomas.aplicacion.databinding.UserEditBinding;
import fabian.stomas.aplicacion.databinding.Ventana2Binding;

public class userEdit extends AppCompatActivity {
    UserEditBinding biding;

    @Override
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        biding = UserEditBinding.inflate(getLayoutInflater());
        setContentView(biding.getRoot());

        biding.returnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
