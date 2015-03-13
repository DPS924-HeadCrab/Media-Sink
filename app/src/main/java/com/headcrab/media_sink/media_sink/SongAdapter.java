package com.headcrab.media_sink.media_sink;

import java.util.ArrayList;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * Created by Rene on 2015-03-12.
 */
public class SongAdapter extends BaseAdapter {

    private ArrayList<Song> songs;
    private LayoutInflater songInf;

    public SongAdapter(Context c, ArrayList<Song> theSongs){
        songs = theSongs;
        songInf = LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        LinearLayout songLayout = (LinearLayout) songInf.inflate(R.layout.song, parent, false);

        TextView songView = (TextView) songLayout.findViewById(R.id.song_title);
        TextView artistView = (TextView) songLayout.findViewById(R.id.song_artist);

        Song currentSong = songs.get(position);

        songView.setText(currentSong.getTitle());
        artistView.setText(currentSong.getArtist());

        songLayout.setTag(position);
        return songLayout;
    }
}
