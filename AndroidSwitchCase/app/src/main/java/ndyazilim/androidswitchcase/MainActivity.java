package ndyazilim.androidswitchcase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn);
        btn1=(Button)findViewById(R.id.btn1);

        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){

        int id=v.getId();

        switch (id){

            case R.id.btn:
                Toast.makeText(getBaseContext(),"buton 1 tıkladınız.",Toast.LENGTH_LONG).show();
                Log.d("btn","buton 1");
                break;

            case R.id.btn1:
                Toast.makeText(getBaseContext(),"buton 2 tıkladınız.",Toast.LENGTH_SHORT).show();
                Log.d("btn","buton 2");
                break;

        }

    }

}
