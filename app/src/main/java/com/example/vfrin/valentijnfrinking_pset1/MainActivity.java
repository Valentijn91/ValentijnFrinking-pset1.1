package com.example.vfrin.valentijnfrinking_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends AppCompatActivity {


    ImageView arms, shoes, hat, eyes, eyebrow, ears, mouth, nose, glasses, mustache;
    Switch arms1, shoes1, hat1, eyes1, eyebrow1, ears1, mouth1, nose1, glasses1, mustache1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        arms1 = (Switch) findViewById(R.id.switch7);
        shoes1 = (Switch) findViewById(R.id.switch6);
        hat1 = (Switch) findViewById(R.id.switch5);
        eyes1 = (Switch) findViewById(R.id.switch1);
        eyebrow1 = (Switch) findViewById(R.id.switch8);
        ears1 = (Switch) findViewById(R.id.switch4);
        mouth1 = (Switch) findViewById(R.id.switch3);
        nose1 = (Switch) findViewById(R.id.switch2);
        glasses1 = (Switch) findViewById(R.id.switch9);
        mustache1 = (Switch) findViewById(R.id.switch10);


        arms = (ImageView) findViewById(R.id.imageView2);
        ears = (ImageView) findViewById(R.id.imageView3);
        shoes = (ImageView) findViewById(R.id.imageView11);
        hat = (ImageView) findViewById(R.id.imageView7);
        eyes = (ImageView) findViewById(R.id.imageView5);
        eyebrow = (ImageView) findViewById(R.id.imageView4);
        mouth = (ImageView) findViewById(R.id.imageView8);
        nose = (ImageView) findViewById(R.id.imageView9);
        glasses = (ImageView) findViewById(R.id.imageView6);
        mustache = (ImageView) findViewById(R.id.imageView10);


        //attach a listener to check for changes in state
        arms1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    arms.setVisibility(View.VISIBLE);
                } else {
                    arms.setVisibility(View.INVISIBLE);
                }
            }
        });
        //attach a listener to check for changes in state
        shoes1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    shoes.setVisibility(View.VISIBLE);
                } else {
                    shoes.setVisibility(View.INVISIBLE);
                }
            }
        });
        //attach a listener to check for changes in state
        ears1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    ears.setVisibility(View.VISIBLE);
                } else {
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });//attach a listener to check for changes in state
        hat1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    hat.setVisibility(View.VISIBLE);
                } else {
                    hat.setVisibility(View.INVISIBLE);
                }
            }
        });//attach a listener to check for changes in state
        eyes1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    eyes.setVisibility(View.VISIBLE);
                } else {
                    eyes.setVisibility(View.INVISIBLE);
                }
            }
        });//attach a listener to check for changes in state
        eyebrow1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    eyebrow.setVisibility(View.VISIBLE);
                } else {
                    eyebrow.setVisibility(View.INVISIBLE);
                }
            }
        });//attach a listener to check for changes in state
        mouth1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mouth.setVisibility(View.VISIBLE);
                } else {
                    mouth.setVisibility(View.INVISIBLE);
                }
            }
        });//attach a listener to check for changes in state
        nose1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    nose.setVisibility(View.VISIBLE);
                } else {
                    nose.setVisibility(View.INVISIBLE);
                }
            }
        });
        //attach a listener to check for changes in state
        glasses1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    glasses.setVisibility(View.VISIBLE);
                } else {
                    glasses.setVisibility(View.INVISIBLE);
                }
            }
        });//attach a listener to check for changes in state
        mustache1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mustache.setVisibility(View.VISIBLE);
                } else {
                    mustache.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

}