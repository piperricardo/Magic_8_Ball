package com.supgro.magic_8_ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        TextView ask;
        final ImageView ballDisplay;
        Button myButton = findViewById( R.id.askButton );

        ballDisplay = (ImageView) findViewById( R.id.image_8ball );

        final int [] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,


        };

     myButton.setOnClickListener( new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Random randomNumberGenerator = new Random(  );

             int number = randomNumberGenerator.nextInt( 5 );

             Log.d("magic_8_ball", "Show" + number);

             ballDisplay.setImageResource( ballArray[number]);
         }
     } );

    }
}
