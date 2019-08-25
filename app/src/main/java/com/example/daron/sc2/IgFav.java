package com.example.daron.sc2;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.daron.sc2.adapters.igfavrvadapter;

import java.util.ArrayList;
import java.util.List;

public class IgFav extends AppCompatActivity implements SearchView.OnQueryTextListener, igfavrvadapter.ViewHolder.OnNoteListener {

    private static final String TAG = "IgFav";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mIgUrls = new ArrayList<>();
    public igfavrvadapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ig_fav);
        initImageBitmaps();

    }

    private void initRecyclerView(){

        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        adapter = new igfavrvadapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 5));



                    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);

        MenuItem menuItem = menu.findItem(R.id.ig_search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(this);

           return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {

        String userInput = newText.toLowerCase();
        List<String> newList = new ArrayList<>();

        for (String mNames : mNames)
        {
            if (mNames.toLowerCase().contains(userInput))

            {
                newList.add(mNames);

            }

        }
        adapter.updateList(newList);


        return true;

                    }


    private void initImageBitmaps(){

        mImageUrls.add("https://scontent-ort2-2.cdninstagram.com/vp/90279ff5e8086e833f3241de5c56eba3/5DE02608/t51.2885-19/s320x320/16790327_403358713348502_4758126789560107008_a.jpg?_nc_ht=scontent-ort2-2.cdninstagram.com");
        mNames.add("Preston and Steve");
        mIgUrls.add("https://www.instagram.com/aus_teaches/");


        mImageUrls.add("https://scontent-ort2-2.cdninstagram.com/vp/0edda8be8af0bc91f80a246bd82b17ea/5E14F2D7/t51.2885-19/11820421_1639239966359747_1652335315_a.jpg?_nc_ht=scontent-ort2-2.cdninstagram.com");
        mNames.add("Austin Wallace");
        mIgUrls.add("https://www.instagram.com/aus_teaches/");

        mImageUrls.add("https://scontent-ort2-2.cdninstagram.com/vp/10b9fa1880cb2e7775d7f13338e358cd/5DCF1B09/t51.2885-19/s320x320/43985793_299018654159002_3102772305495851008_n.jpg?_nc_ht=scontent-ort2-2.cdninstagram.com");
        mNames.add("Phila. Eagles");

        mImageUrls.add("https://scontent-ort2-2.cdninstagram.com/vp/376e9061c341ebfa0a40f03f7ed5e425/5DD18699/t51.2885-19/s320x320/66428595_1158814134318928_8384210511834644480_n.jpg?_nc_ht=scontent-ort2-2.cdninstagram.com");
        mNames.add("Idris Elba");

        mImageUrls.add("https://scontent-ort2-2.cdninstagram.com/vp/8babb9fe704b17118d558540160a2dac/5DD0B74C/t51.2885-19/s320x320/32672202_1835065730122921_3740261781411463168_n.jpg?_nc_ht=scontent-ort2-2.cdninstagram.com");
        mNames.add("Kim Zolciak");

        mImageUrls.add("https://scontent-ort2-2.cdninstagram.com/vp/439aa2057579568f9c2e429775801417/5DD2E830/t51.2885-19/s320x320/13725590_606876646150486_1841144755_a.jpg?_nc_ht=scontent-ort2-2.cdninstagram.com");
        mNames.add("Tara");

        mImageUrls.add("https://scontent-ort2-2.cdninstagram.com/vp/f92e12463edd757a4f5a244f515244a1/5E13B1FC/t51.2885-19/11850309_1674349799447611_206178162_a.jpg?_nc_ht=scontent-ort2-2.cdninstagram.com");
        mNames.add("The Rock");

        mImageUrls.add("https://scontent-ort2-2.cdninstagram.com/vp/8336ae46d24881a807f7236f839a4f4c/5DE6330D/t51.2885-19/s320x320/26343200_2031055817138272_1453838565610881024_n.jpg?_nc_ht=scontent-ort2-2.cdninstagram.com");
        mNames.add("Conor McGregor");

        mImageUrls.add("https://scontent-ort2-2.cdninstagram.com/vp/d85fb0fc16c8557c38a035bb415b5c8c/5DE4719A/t51.2885-19/s320x320/61711954_666421717156524_6837856598321266688_n.jpg?_nc_ht=scontent-ort2-2.cdninstagram.com");
        mNames.add("Phila. Flyers");

        mImageUrls.add("https://scontent-ort2-2.cdninstagram.com/vp/7cfe313b428f3bf8d9fb467c5d9ae49c/5DE2511B/t51.2885-19/s320x320/65958879_2313459622247793_6134322542711668736_n.jpg?_nc_ht=scontent-ort2-2.cdninstagram.com");
        mNames.add("Knoll");

        mImageUrls.add("https://scontent-ort2-2.cdninstagram.com/vp/4f4fd66cd5f0091b7c41a30be851c64d/5DD4DF67/t51.2885-19/s320x320/67168672_386762918643499_6636756175004106752_n.jpg?_nc_ht=scontent-ort2-2.cdninstagram.com");
        mNames.add("Kristen Bell");

        mImageUrls.add("https://scontent-ort2-2.cdninstagram.com/vp/1133682895ea06c7f5f168034df860ca/5DE4015E/t51.2885-19/s320x320/52641496_654714378294589_1628709928594046976_n.jpg?_nc_ht=scontent-ort2-2.cdninstagram.com");
        mNames.add("Nintendo");




        initRecyclerView();
    }


    @Override
    public void onNoteClick(int position) {

    }
}
