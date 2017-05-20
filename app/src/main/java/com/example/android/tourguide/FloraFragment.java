package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of flora vocabulary words.
 */
public class FloraFragment extends Fragment {


    public FloraFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

                // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.common_flora_acebo, R.string.scientific_flora_acebo, R.drawable.flora_acebo));
        words.add(new Word(R.string.common_flora_grasilla, R.string.scientific_flora_grasilla, R.drawable.flora_grasilla));
        words.add(new Word(R.string.common_flora_mostajo, R.string.scientific_flora_mostajo, R.drawable.flora_mostajo));
        words.add(new Word(R.string.common_flora_verdegambre, R.string.scientific_flora_verdegambre, R.drawable.flora_verdegambre));
        words.add(new Word(R.string.common_flora_mundillo, R.string.scientific_flora_mundillo, R.drawable.flora_mundillo));
        
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_flora);

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


