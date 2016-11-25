package ndyazilim.fordongusu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText sayiEdt;
    TextView sonucText;
    int sayi,topla=0,faktoriyel=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayiEdt=(EditText)findViewById(R.id.sayiEdt);
        sonucText=(TextView)findViewById(R.id.sonucText);

    }

    public  void toplaOnClick(View view){

        sayi=Integer.parseInt(sayiEdt.getText().toString());

        for(int i=0;i<=sayi;i++){

            topla=topla+i; //topla+=i

        }

        sonucText.setText(String.valueOf(topla));
        topla=0;
    }

    public  void faktoriyelOnClick(View view){


        sayi=Integer.parseInt(sayiEdt.getText().toString());

        for(int i=1;i<=sayi;i++){

            faktoriyel=faktoriyel*i; //faktoriyel+=i

        }

        sonucText.setText(String.valueOf(faktoriyel));
        faktoriyel=1;
    }


}
