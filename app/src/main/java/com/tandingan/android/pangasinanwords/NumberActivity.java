package com.tandingan.android.pangasinanwords;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();

        //words.add("one");
        words.add(new Word("one","sakey", R.drawable.number_one));
        words.add(new Word("two","duara", R.drawable.number_two));
        words.add(new Word("three","talura", R.drawable.number_three));
        words.add(new Word("four","apatira", R.drawable.number_four));
        words.add(new Word("five","limara", R.drawable.number_five));
        words.add(new Word("six","anemira", R.drawable.number_six));
        words.add(new Word("seven","pitura", R.drawable.number_seven));
        words.add(new Word("eight","walura", R.drawable.number_eight));
        words.add(new Word("nine","siamira", R.drawable.number_nine));
        words.add(new Word("ten","samplura", R.drawable.number_ten));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        /*ArrayAdapter<Word> itemsAdapter =
                new ArrayAdapter<Word>(this, R.layout.list_item, words);*/
        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            mMediaPlayer = MediaPlayer.create(NumberActivity.this, R.raw.hello);
            mMediaPlayer.start();
        }
    });

    }
}
