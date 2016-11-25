package ndyazilim.toplamaislemi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ToplamaActivity extends AppCompatActivity {

    EditText sayi1Edt,sayi2Edt;
    Button toplaBtn;
    TextView sonucText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toplama);

        sayi1Edt=(EditText)findViewById(R.id.sayi1Edt);
        sayi2Edt=(EditText)findViewById(R.id.sayi2Edt);

        toplaBtn=(Button)findViewById(R.id.toplaBtn);

        sonucText=(TextView)findViewById(R.id.sonucText);

        toplaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int sayi1=Integer.parseInt(sayi1Edt.getText().toString());
                float sayi2=Float.parseFloat(sayi2Edt.getText().toString());

                float sonuc=sayi1+sayi2;

                sonucText.setText(String.valueOf(sonuc));
            }
        });

    }

}
