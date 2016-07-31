package traffic.masterung.ms.tasspool.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private String urlYoutubeString;
    private ListView listView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        //setup Array for Integer
        int[] iconInts = new int[20];
        iconInts[0] = R.drawable.traffic_01;
        iconInts[1] = R.drawable.traffic_02;
        iconInts[2] = R.drawable.traffic_03;
        iconInts[3] = R.drawable.traffic_04;
        iconInts[4] = R.drawable.traffic_05;
        iconInts[5] = R.drawable.traffic_06;
        iconInts[6] = R.drawable.traffic_07;
        iconInts[7] = R.drawable.traffic_08;
        iconInts[8] = R.drawable.traffic_09;
        iconInts[9] = R.drawable.traffic_10;
        iconInts[10] = R.drawable.traffic_11;
        iconInts[11] = R.drawable.traffic_12;
        iconInts[12] = R.drawable.traffic_13;
        iconInts[13] = R.drawable.traffic_14;
        iconInts[14] = R.drawable.traffic_15;
        iconInts[15] = R.drawable.traffic_16;
        iconInts[16] = R.drawable.traffic_17;
        iconInts[17] = R.drawable.traffic_18;
        iconInts[18] = R.drawable.traffic_19;
        iconInts[19] = R.drawable.traffic_20;

        //For Set Title
        String[] titleString = getResources().getStringArray(R.array.my_title);

        String[] detaillongString = getResources().getStringArray(R.array.my_detail);

        String[] detailShort = new String[detaillongString.length];
        for (int i=0;i<detaillongString.length;i+=1){
            detailShort[i] = detaillongString[i].substring(0, 20) + "...";
        }


        //Create Listview
        MyAdapter myAdapter = new MyAdapter(this, iconInts, titleString,detailShort );
        listView.setAdapter(myAdapter);


    }    //Main Method


    public void clickAboutMe(View view) {

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.effect_btn_shut);
        mediaPlayer.start();

        //intent to WebView
        urlYoutubeString = "https://youtu.be/AFmWqLIqDZA";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(urlYoutubeString));
        startActivity(intent);
    }

}   //Main Class นี่คือ class หลัก
