package fr.yncrea.domozique;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*@Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.bankloginpage);
    }*/
   // final MediaPlayer mp = MediaPlayer.create(this, R.raw.soundu);
    Button do_;
    Button re;
    Button mi;
    Button fa;
    Button sol;
    Button la;
    Button si;
    Button doa;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.piano);
        do_ = (Button)findViewById(R.id.doButton);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.do1);
        do_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        re = (Button)findViewById(R.id.reButton);
        final MediaPlayer mpr = MediaPlayer.create(this, R.raw.re);
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpr.start();
            }
        });
        mi = (Button)findViewById(R.id.miButton);
        final MediaPlayer mpm = MediaPlayer.create(this, R.raw.mi);
        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpm.start();
            }
        });
        fa = (Button)findViewById(R.id.faButton);
        final MediaPlayer mpf = MediaPlayer.create(this, R.raw.fa);
        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpf.start();
            }
        });
        sol = (Button)findViewById(R.id.solButton);
        final MediaPlayer mps = MediaPlayer.create(this, R.raw.sol);
        sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mps.start();
            }
        });
        la = (Button)findViewById(R.id.laButton);
        final MediaPlayer mpl = MediaPlayer.create(this, R.raw.la);
        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpl.start();
            }
        });
        si = (Button)findViewById(R.id.siButton);
        final MediaPlayer mpsi = MediaPlayer.create(this, R.raw.si);
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpsi.start();
            }
        });
        doa = (Button)findViewById(R.id.doaButton);
        final MediaPlayer mpdoa = MediaPlayer.create(this, R.raw.doa);
        doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpdoa.start();
            }
        });
    }
}