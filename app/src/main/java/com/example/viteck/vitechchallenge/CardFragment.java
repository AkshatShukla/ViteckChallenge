package com.example.viteck.vitechchallenge;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Eric on 12/2/2017.
 */

public class CardFragment extends Fragment {
    private static final String TAG = "CardFragment";

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        final View rootview = inflater.inflate(R.layout.cardlist, container, false);

        recycler = rootview.findViewById(R.id.cardRecycler);
        adapter = new CardListAdapter(null);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootview;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onAttach(Context ctx) {
        //This method is only called on API >= 23
        super.onAttach(ctx);
    }

    @Override
    public void onAttach(Activity ctx) {
        //This method is only called on API < 23. THIS IS NECESSARY.
        super.onAttach(ctx);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }
}
