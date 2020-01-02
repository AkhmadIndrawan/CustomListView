package id.ac.poliban.mi.indrawan.customlistview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
//    ListView lvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        lvResult = (ListView) findViewById(R.id.lvResult);

//        String[][] dataNegara = new String[][]{{"Indonesia", "ASEAN", "indonesia"}, {"Palestina", "Timur Tengah", "palestine"}, {"Malaysia", "ASEAN", "malaysia"}};


//        NegaraAdapter adapter = new NegaraAdapter(MainActivity.this, dataNegara);
//        lvResult.setAdapter(adapter);
        Toolbar toolbar = findViewById(R.id.toolbar);
        //pasang toolbar
        getSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Akhmad Studio");
        toolbar.setSubtitle("https://github.com/AkhmadIndrawan");
        toolbar.setLogo(android.R.drawable.ic_dialog_map);
    }


}
