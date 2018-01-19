package com.sreeyuktha.musical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<Music>();
        arrayList.add(new Music("Faded","Alan Walker",R.raw.com_faded));
        arrayList.add(new Music("All Falls Down","Alan Walker",R.raw.com_all_falls_down));
        arrayList.add(new Music("Routine","Alan Walker",R.raw.com_routine));
        arrayList.add(new Music("Sing Me to Sleep","Alan Walker",R.raw.com_sing_me_to_sleep));
        arrayList.add(new Music("Tired","Alan Walker",R.raw.com_tired));

        adapter = new CustomMusicAdapter(this,R.layout.custom_music_item,arrayList);
        songList.setAdapter(adapter);
    }
}
