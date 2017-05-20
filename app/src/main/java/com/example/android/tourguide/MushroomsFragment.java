package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of Mushrooms.
 */
public class MushroomsFragment extends Fragment {




    public MushroomsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.common_mushroom_matamoscas, R.string.scientific_mushroom_matamoscas,
                R.drawable.mushroom_matamoscas));
        words.add(new Word(R.string.common_mushroom_hongo_blanco, R.string.scientific_mushroom_hongo_blanco,
                R.drawable.mushroom_hongoblanco));
        words.add(new Word(R.string.common_mushroom_pie_azul, R.string.scientific_mushroom_pie_azul,
                R.drawable.mushroom_pieazul));
        words.add(new Word(R.string.common_mushroom_nicalo, R.string.scientific_mushroom_nicalo,
                R.drawable.mushroom_nicalo));
        words.add(new Word(R.string.common_mushroom_entoloma,R.string.scientific_mushroom_entoloma,
                R.drawable.mushroom_entoloma));
        

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_mushrooms);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

                return rootView;
    }


    }