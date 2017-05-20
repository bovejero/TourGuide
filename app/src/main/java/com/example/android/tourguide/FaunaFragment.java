package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of fauna vocabulary words.
 */
public class FaunaFragment extends Fragment {


    public FaunaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.common_fauna_buitre_negro, R.string.scientific_fauna_buitre_negro, R.drawable.fauna_buitre_negro));
        words.add(new Word(R.string.common_fauna_aguila_imperial, R.string.scientific_fauna_aguila_imperial, R.drawable.fauna_aguila_imperial_iberica));
        words.add(new Word(R.string.common_fauna_acentor_alpino, R.string.scientific_fauna_acentor_alpino, R.drawable.fauna_acentor_alpino));
        words.add(new Word(R.string.common_fauna_corzo, R.string.scientific_fauna_corzo, R.drawable.fauna_corzo));
        words.add(new Word(R.string.common_fauna_lagarto_verdinegro, R.string.scientific_fauna_lagarto_verdinegro, R.drawable.fauna_lagarto_verdinegro));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_fauna);

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