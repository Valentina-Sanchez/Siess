package co.example.prueba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import co.example.prueba.modelo.Adaptador2;
import co.example.prueba.modelo.item;

public class inicio2 extends AppCompatActivity {


    ArrayList<item> lista2;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio2);
        getSupportActionBar().hide();

        FloatingActionButton fab = findViewById(R.id.fab);

        FloatingActionButton salir=findViewById(R.id.sal);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(inicio2.this, inicio.class);
                startActivity(in);
            }
        });

        lista2= new ArrayList<>();
        recyclerView= findViewById(R.id.opRecicler);

        recyclerView.setLayoutManager(new LinearLayoutManager(inicio2.this));

        llenarLista();

        Adaptador2 adaptador2 = new Adaptador2(lista2);

        recyclerView.setAdapter(adaptador2);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Snackbar.make(view, "Lista de consumo", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/

                Toast.makeText(inicio2.this, "solicitud prestamo", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(inicio2.this, listaConsumo.class);
                startActivity(intent);
            }
        });


    }

    private void llenarLista() {
        lista2.add(new item("Prestamo realizado el 12/06/2019","Fecha devolución 25/06/2019","https://www.konfest.com/wp-content/uploads/2019/05/Konfest-PNG-JPG-Image-Pic-Photo-Free-Download-Royalty-Unlimited-clip-art-sticker-Check-Mark-Symbol-Right-Tick-Yes-Green-27.png"));

        lista2.add(new item("Prestamo realizado el 22/06/2019","Fecha devolución 30/06/2019","https://www.konfest.com/wp-content/uploads/2019/05/Konfest-PNG-JPG-Image-Pic-Photo-Free-Download-Royalty-Unlimited-clip-art-sticker-Check-Mark-Symbol-Right-Tick-Yes-Green-27.png"));

        lista2.add(new item("Prestamo realizado el 02/07/2019","Fecha devolución 12/07/2019","https://www.konfest.com/wp-content/uploads/2019/05/Konfest-PNG-JPG-Image-Pic-Photo-Free-Download-Royalty-Unlimited-clip-art-sticker-Check-Mark-Symbol-Right-Tick-Yes-Green-27.png"));

        lista2.add(new item("Prestamo realizado el 30/08/2019","Fecha devolución 05/09/2019","https://www.konfest.com/wp-content/uploads/2019/05/Konfest-PNG-JPG-Image-Pic-Photo-Free-Download-Royalty-Unlimited-clip-art-sticker-Check-Mark-Symbol-Right-Tick-Yes-Green-27.png"));

    }
}
