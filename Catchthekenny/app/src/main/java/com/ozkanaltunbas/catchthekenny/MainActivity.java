package com.ozkanaltunbas.catchthekenny;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {
    int count=0;
    TextView textView,textView2;
    View image1,image2,image3,image4,image5,image6;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.counter);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image1.setVisibility(View.INVISIBLE);
        image2.setVisibility(View.INVISIBLE);
        image3.setVisibility(View.INVISIBLE);
        image4.setVisibility(View.INVISIBLE);
        image5.setVisibility(View.INVISIBLE);
        image6.setVisibility(View.INVISIBLE);


        new CountDownTimer(20000,1000){

            @Override
            public void onTick(long l) {
                textView2.setText("LEFT: "+l/1000);
                int minimum = 0;
                int maksimum = 7;
                int randomSayi = ThreadLocalRandom.current().nextInt(minimum, maksimum);
                if(randomSayi==1){
                    image1.setVisibility(View.VISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    image4.setVisibility(View.INVISIBLE);
                    image5.setVisibility(View.INVISIBLE);
                    image6.setVisibility(View.INVISIBLE);
                }else if(randomSayi==2){
                    image2.setVisibility(View.VISIBLE);
                    image1.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    image4.setVisibility(View.INVISIBLE);
                    image5.setVisibility(View.INVISIBLE);
                    image6.setVisibility(View.INVISIBLE);
                }else if(randomSayi==3){
                    image3.setVisibility(View.VISIBLE);
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image4.setVisibility(View.INVISIBLE);
                    image5.setVisibility(View.INVISIBLE);
                    image6.setVisibility(View.INVISIBLE);

                }else if(randomSayi==4){
                    image4.setVisibility(View.VISIBLE);
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    image5.setVisibility(View.INVISIBLE);
                    image6.setVisibility(View.INVISIBLE);
                }else if(randomSayi==5){
                    image5.setVisibility(View.VISIBLE);
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    image4.setVisibility(View.INVISIBLE);
                    image6.setVisibility(View.INVISIBLE);

                }else if(randomSayi==6){
                    image6.setVisibility(View.VISIBLE);
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    image4.setVisibility(View.INVISIBLE);
                    image5.setVisibility(View.INVISIBLE);
                }

            }
            @Override
            public void onFinish() {
                image1.setVisibility(View.INVISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.INVISIBLE);
                image4.setVisibility(View.INVISIBLE);
                image5.setVisibility(View.INVISIBLE);
                image6.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(),"GAME OVER ! SCORE : "+count,Toast.LENGTH_SHORT).show();
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setMessage("Do you want to play one more time ?");
                alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"OKAY LETS PLAY !",Toast.LENGTH_LONG).show();
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);

                    }
                });
                alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"OKAY THANKS !",Toast.LENGTH_LONG).show();
                    }
                });
                alert.show();
            }
        }.start();
    }
    public void click1(View view){
        count++;
        textView.setText("SCORE"+count);
    }
    public void click2(View view){
        count++;
        textView.setText("SCORE"+count);
    }
    public void click3(View view){
        count++;
        textView.setText("SCORE"+count);
    }
    public void click4(View view){
        count++;
        textView.setText("SCORE"+count);

    }
    public void click5(View view){
        count++;
        textView.setText("SCORE"+count);

    }
    public void click6(View view){
        count++;
        textView.setText("SCORE"+count);

    }
}