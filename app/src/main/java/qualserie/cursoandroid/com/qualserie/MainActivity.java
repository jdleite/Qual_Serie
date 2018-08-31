package qualserie.cursoandroid.com.qualserie;

import android.app.Activity;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity {

    private SeekBar seekBar;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.skbId);
        image = (ImageView) findViewById(R.id.imgExId);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                int valorProg = progress;

                if(valorProg <= 1){

                    image.setImageResource(R.drawable.pouco);



                }else if(valorProg == 2){


                    image.setImageResource(R.drawable.medio);

                }else if(valorProg == 3){

                    image.setImageResource(R.drawable.muito);
                }else if(valorProg ==4){
                    image.setImageResource(R.drawable.susto);
                }


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
