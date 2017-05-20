package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class TreesFragment extends Fragment {


    public TreesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.common_tree_tejo, R.string.scientific_tree_tejo,
                R.drawable.tree_tejo));
        words.add(new Word(R.string.common_tree_nogal, R.string.scientific_tree_nogal,
                R.drawable.tree_nogal));
        words.add(new Word(R.string.common_tree_rebollo, R.string.scientific_tree_rebollo,
                R.drawable.tree_rebollo));
        words.add(new Word(R.string.common_tree_enebro, R.string.scientific_tree_enebro,
                R.drawable.tree_enebro));
        words.add(new Word(R.string.common_tree_alcornoque, R.string.scientific_tree_alcornoque,
                R.drawable.tree_alcornoque));
        
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_trees);

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