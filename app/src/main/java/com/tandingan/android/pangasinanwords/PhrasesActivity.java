package com.tandingan.android.pangasinanwords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //words.add("one");
        words.add(new Word("Where are you going?","Iner so laen mo?"));
        words.add(new Word("What is your name?","Antoy ngaran mo?"));
        words.add(new Word("My name is...","Say ngaran ko'y"));
        words.add(new Word("How are you feeling?","Antoy pakaliknam?"));
        words.add(new Word("I’m feeling good.","Balebale so pakalikas ko"));
        words.add(new Word("Are you coming?","Unla ka?"));
        words.add(new Word("Yes, I’m coming.","On, unla ak"));
        words.add(new Word("I’m coming.","Paunla ak la"));
        words.add(new Word("Let’s go.","Galila"));
        words.add(new Word("Come here.","Gala'd dya"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        /*ArrayAdapter<Word> itemsAdapter =
                new ArrayAdapter<Word>(this, R.layout.list_item, words);*/
        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}
