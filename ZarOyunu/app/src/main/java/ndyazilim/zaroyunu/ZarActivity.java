package ndyazilim.zaroyunu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class ZarActivity extends AppCompatActivity {

    EditText tahminiSayiEdt;
    Button kontrolBtn;
    TextView puanText,OyunBittiText;
    ImageView zarImage;
    int tahminizar;
    int tahminisayi;
    int puan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zar);

        tahminiSayiEdt=(EditText)findViewById(R.id.tahminiSayiEdt);
        kontrolBtn=(Button)findViewById(R.id.KontrolBtn);
        puanText=(TextView)findViewById(R.id.sonucText);
        OyunBittiText=(TextView)findViewById(R.id.OyunBitti);
        zarImage=(ImageView)findViewById(R.id.zarImage);

        kontrolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random zar=new Random();
                tahminizar=1+zar.nextInt(6);

                tahminisayi=Integer.parseInt(tahminiSayiEdt.getText().toString());
                Log.d("puan",String.valueOf(tahminizar));

                if(tahminisayi==tahminizar){

                    puan+=10; //puan=puan+10;
                    puanText.setText(String.valueOf(puan));
                    Log.d("puan",String.valueOf(puan));

                }

                if (tahminizar==1){
                    zarImage.setImageResource(R.drawable.bir);
                }else if (tahminizar==2){
                    zarImage.setImageResource(R.drawable.iki);
                }else if (tahminizar==3){
                    zarImage.setImageResource(R.drawable.uc);
                }else if (tahminizar==4){
                    zarImage.setImageResource(R.drawable.dort);
                }else if (tahminizar==5){
                    zarImage.setImageResource(R.drawable.bes);
                }else if (tahminizar==6){
                    zarImage.setImageResource(R.drawable.alti);
                }
                if(puan==100){
                    OyunBittiText.setText("Oyun Bitti");
                    kontrolBtn.setClickable(false);
                }
            }
        });

    }
}
