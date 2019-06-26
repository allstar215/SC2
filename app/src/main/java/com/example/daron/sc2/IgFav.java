package com.example.daron.sc2;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;

import com.example.daron.sc2.adapters.igfavrvadapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IgFav extends AppCompatActivity implements SearchView.OnQueryTextListener, igfavrvadapter.ViewHolder.OnNoteListener {

    private static final String TAG = "IgFav";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
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


        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/d2171cd8edabffba57a636c83bccbfff/5D23DBF8/t51.2885-19/s150x150/16790327_403358713348502_4758126789560107008_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Preston and Steve");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/8ba47cefea77939cebc8e0c4f64abef5/5D27A4D7/t51.2885-19/11820421_1639239966359747_1652335315_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Austin Wallace");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/299665f8bc912740ac9e367f0a21c32a/5D0459F9/t51.2885-19/s150x150/43985793_299018654159002_3102772305495851008_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Phila. Eagles");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/439c199a8f2940e1f2bfebdd4a3cad4a/5D16D11A/t51.2885-19/s150x150/44484333_256011951997990_2395104129115488256_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Idris Elba");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/6ebcdc1c366180c5362d6b39b9d6e2c7/5D248034/t51.2885-19/s150x150/32672202_1835065730122921_3740261781411463168_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Kim Zolciak");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/da12f3bf7dbe11c81843d433575205a0/5D21E62D/t51.2885-19/926234_643949229031569_1149886592_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Tara");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/5458fb06f379a800bcd8a458592cdf1b/5D2663FC/t51.2885-19/11850309_1674349799447611_206178162_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("The Rock");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/d38e50298129089c6d2a9a9c60501d80/5D221475/t51.2885-19/s150x150/26343200_2031055817138272_1453838565610881024_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Conor McGregor");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/a482671568f2cc9ed0a36632a5076bca/5D230ADE/t51.2885-19/s150x150/51550014_368692490387831_6019134848432603136_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Phila. Flyers");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/662c6aa82b3c2149e76ce266d8731fe8/5D02E20C/t51.2885-19/s150x150/44660222_205869913661907_9147546498072838144_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Knoll");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/9026aee7f55358ae03068bd1b2d25991/5D145A31/t51.2885-19/s150x150/18096183_101046150465002_3393547389640900608_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Kristen Bell");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/e05e39012740f8422b2185eb99d09472/5D0192D6/t51.2885-19/s150x150/26073781_169124867033689_8018312227729702912_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Nintendo");

        //break//

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/d2171cd8edabffba57a636c83bccbfff/5D23DBF8/t51.2885-19/s150x150/16790327_403358713348502_4758126789560107008_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Preston and Steve");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/8ba47cefea77939cebc8e0c4f64abef5/5D27A4D7/t51.2885-19/11820421_1639239966359747_1652335315_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Austin Wallace");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/299665f8bc912740ac9e367f0a21c32a/5D0459F9/t51.2885-19/s150x150/43985793_299018654159002_3102772305495851008_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Phila. Eagles");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/439c199a8f2940e1f2bfebdd4a3cad4a/5D16D11A/t51.2885-19/s150x150/44484333_256011951997990_2395104129115488256_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Idris Elba");


        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/6ebcdc1c366180c5362d6b39b9d6e2c7/5D248034/t51.2885-19/s150x150/32672202_1835065730122921_3740261781411463168_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Kim Zolciak");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/da12f3bf7dbe11c81843d433575205a0/5D21E62D/t51.2885-19/926234_643949229031569_1149886592_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Tara");


        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/5458fb06f379a800bcd8a458592cdf1b/5D2663FC/t51.2885-19/11850309_1674349799447611_206178162_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("The Rock");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/d38e50298129089c6d2a9a9c60501d80/5D221475/t51.2885-19/s150x150/26343200_2031055817138272_1453838565610881024_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Conor McGregor");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/a482671568f2cc9ed0a36632a5076bca/5D230ADE/t51.2885-19/s150x150/51550014_368692490387831_6019134848432603136_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Phila. Flyers");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/662c6aa82b3c2149e76ce266d8731fe8/5D02E20C/t51.2885-19/s150x150/44660222_205869913661907_9147546498072838144_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Knoll");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/9026aee7f55358ae03068bd1b2d25991/5D145A31/t51.2885-19/s150x150/18096183_101046150465002_3393547389640900608_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Kristen Bell");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/e05e39012740f8422b2185eb99d09472/5D0192D6/t51.2885-19/s150x150/26073781_169124867033689_8018312227729702912_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Nintendo");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/d2171cd8edabffba57a636c83bccbfff/5D23DBF8/t51.2885-19/s150x150/16790327_403358713348502_4758126789560107008_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Preston and Steve");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/8ba47cefea77939cebc8e0c4f64abef5/5D27A4D7/t51.2885-19/11820421_1639239966359747_1652335315_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Austin Wallace");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/299665f8bc912740ac9e367f0a21c32a/5D0459F9/t51.2885-19/s150x150/43985793_299018654159002_3102772305495851008_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Phila. Eagles");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/439c199a8f2940e1f2bfebdd4a3cad4a/5D16D11A/t51.2885-19/s150x150/44484333_256011951997990_2395104129115488256_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Idris Elba");


        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/6ebcdc1c366180c5362d6b39b9d6e2c7/5D248034/t51.2885-19/s150x150/32672202_1835065730122921_3740261781411463168_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Kim Zolciak");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/da12f3bf7dbe11c81843d433575205a0/5D21E62D/t51.2885-19/926234_643949229031569_1149886592_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Tara");


        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/5458fb06f379a800bcd8a458592cdf1b/5D2663FC/t51.2885-19/11850309_1674349799447611_206178162_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("The Rock");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/d38e50298129089c6d2a9a9c60501d80/5D221475/t51.2885-19/s150x150/26343200_2031055817138272_1453838565610881024_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Conor McGregor");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/a482671568f2cc9ed0a36632a5076bca/5D230ADE/t51.2885-19/s150x150/51550014_368692490387831_6019134848432603136_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Phila. Flyers");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/662c6aa82b3c2149e76ce266d8731fe8/5D02E20C/t51.2885-19/s150x150/44660222_205869913661907_9147546498072838144_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Knoll");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/9026aee7f55358ae03068bd1b2d25991/5D145A31/t51.2885-19/s150x150/18096183_101046150465002_3393547389640900608_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Kristen Bell");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/e05e39012740f8422b2185eb99d09472/5D0192D6/t51.2885-19/s150x150/26073781_169124867033689_8018312227729702912_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Nintendo");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/d2171cd8edabffba57a636c83bccbfff/5D23DBF8/t51.2885-19/s150x150/16790327_403358713348502_4758126789560107008_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Preston and Steve");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/8ba47cefea77939cebc8e0c4f64abef5/5D27A4D7/t51.2885-19/11820421_1639239966359747_1652335315_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Austin Wallace");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/299665f8bc912740ac9e367f0a21c32a/5D0459F9/t51.2885-19/s150x150/43985793_299018654159002_3102772305495851008_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Phila. Eagles");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/439c199a8f2940e1f2bfebdd4a3cad4a/5D16D11A/t51.2885-19/s150x150/44484333_256011951997990_2395104129115488256_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Idris Elba");


        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/6ebcdc1c366180c5362d6b39b9d6e2c7/5D248034/t51.2885-19/s150x150/32672202_1835065730122921_3740261781411463168_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Kim Zolciak");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/da12f3bf7dbe11c81843d433575205a0/5D21E62D/t51.2885-19/926234_643949229031569_1149886592_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Tara");


        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/5458fb06f379a800bcd8a458592cdf1b/5D2663FC/t51.2885-19/11850309_1674349799447611_206178162_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("The Rock");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/d38e50298129089c6d2a9a9c60501d80/5D221475/t51.2885-19/s150x150/26343200_2031055817138272_1453838565610881024_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Conor McGregor");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/a482671568f2cc9ed0a36632a5076bca/5D230ADE/t51.2885-19/s150x150/51550014_368692490387831_6019134848432603136_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Phila. Flyers");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/662c6aa82b3c2149e76ce266d8731fe8/5D02E20C/t51.2885-19/s150x150/44660222_205869913661907_9147546498072838144_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Knoll");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/9026aee7f55358ae03068bd1b2d25991/5D145A31/t51.2885-19/s150x150/18096183_101046150465002_3393547389640900608_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Kristen Bell");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/e05e39012740f8422b2185eb99d09472/5D0192D6/t51.2885-19/s150x150/26073781_169124867033689_8018312227729702912_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Nintendo");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/d2171cd8edabffba57a636c83bccbfff/5D23DBF8/t51.2885-19/s150x150/16790327_403358713348502_4758126789560107008_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Preston and Steve");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/8ba47cefea77939cebc8e0c4f64abef5/5D27A4D7/t51.2885-19/11820421_1639239966359747_1652335315_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Austin Wallace");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/299665f8bc912740ac9e367f0a21c32a/5D0459F9/t51.2885-19/s150x150/43985793_299018654159002_3102772305495851008_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Phila. Eagles");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/439c199a8f2940e1f2bfebdd4a3cad4a/5D16D11A/t51.2885-19/s150x150/44484333_256011951997990_2395104129115488256_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Idris Elba");


        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/6ebcdc1c366180c5362d6b39b9d6e2c7/5D248034/t51.2885-19/s150x150/32672202_1835065730122921_3740261781411463168_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Kim Zolciak");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/da12f3bf7dbe11c81843d433575205a0/5D21E62D/t51.2885-19/926234_643949229031569_1149886592_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Tara");


        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/5458fb06f379a800bcd8a458592cdf1b/5D2663FC/t51.2885-19/11850309_1674349799447611_206178162_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("The Rock");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/d38e50298129089c6d2a9a9c60501d80/5D221475/t51.2885-19/s150x150/26343200_2031055817138272_1453838565610881024_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Conor McGregor");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/a482671568f2cc9ed0a36632a5076bca/5D230ADE/t51.2885-19/s150x150/51550014_368692490387831_6019134848432603136_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Phila. Flyers");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/662c6aa82b3c2149e76ce266d8731fe8/5D02E20C/t51.2885-19/s150x150/44660222_205869913661907_9147546498072838144_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Knoll");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/9026aee7f55358ae03068bd1b2d25991/5D145A31/t51.2885-19/s150x150/18096183_101046150465002_3393547389640900608_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Kristen Bell");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/e05e39012740f8422b2185eb99d09472/5D0192D6/t51.2885-19/s150x150/26073781_169124867033689_8018312227729702912_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Nintendo");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/d2171cd8edabffba57a636c83bccbfff/5D23DBF8/t51.2885-19/s150x150/16790327_403358713348502_4758126789560107008_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Preston and Steve");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/8ba47cefea77939cebc8e0c4f64abef5/5D27A4D7/t51.2885-19/11820421_1639239966359747_1652335315_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Austin Wallace");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/299665f8bc912740ac9e367f0a21c32a/5D0459F9/t51.2885-19/s150x150/43985793_299018654159002_3102772305495851008_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Phila. Eagles");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/439c199a8f2940e1f2bfebdd4a3cad4a/5D16D11A/t51.2885-19/s150x150/44484333_256011951997990_2395104129115488256_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Idris Elba");


        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/6ebcdc1c366180c5362d6b39b9d6e2c7/5D248034/t51.2885-19/s150x150/32672202_1835065730122921_3740261781411463168_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Kim Zolciak");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/da12f3bf7dbe11c81843d433575205a0/5D21E62D/t51.2885-19/926234_643949229031569_1149886592_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Tara");


        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/5458fb06f379a800bcd8a458592cdf1b/5D2663FC/t51.2885-19/11850309_1674349799447611_206178162_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("The Rock");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/d38e50298129089c6d2a9a9c60501d80/5D221475/t51.2885-19/s150x150/26343200_2031055817138272_1453838565610881024_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Conor McGregor");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/a482671568f2cc9ed0a36632a5076bca/5D230ADE/t51.2885-19/s150x150/51550014_368692490387831_6019134848432603136_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Phila. Flyers");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/662c6aa82b3c2149e76ce266d8731fe8/5D02E20C/t51.2885-19/s150x150/44660222_205869913661907_9147546498072838144_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Knoll");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/9026aee7f55358ae03068bd1b2d25991/5D145A31/t51.2885-19/s150x150/18096183_101046150465002_3393547389640900608_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Kristen Bell");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/e05e39012740f8422b2185eb99d09472/5D0192D6/t51.2885-19/s150x150/26073781_169124867033689_8018312227729702912_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Nintendo");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/d2171cd8edabffba57a636c83bccbfff/5D23DBF8/t51.2885-19/s150x150/16790327_403358713348502_4758126789560107008_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Preston and Steve");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/8ba47cefea77939cebc8e0c4f64abef5/5D27A4D7/t51.2885-19/11820421_1639239966359747_1652335315_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Austin Wallace");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/299665f8bc912740ac9e367f0a21c32a/5D0459F9/t51.2885-19/s150x150/43985793_299018654159002_3102772305495851008_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Phila. Eagles");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/439c199a8f2940e1f2bfebdd4a3cad4a/5D16D11A/t51.2885-19/s150x150/44484333_256011951997990_2395104129115488256_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Idris Elba");


        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/6ebcdc1c366180c5362d6b39b9d6e2c7/5D248034/t51.2885-19/s150x150/32672202_1835065730122921_3740261781411463168_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Kim Zolciak");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/da12f3bf7dbe11c81843d433575205a0/5D21E62D/t51.2885-19/926234_643949229031569_1149886592_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Tara");


        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/5458fb06f379a800bcd8a458592cdf1b/5D2663FC/t51.2885-19/11850309_1674349799447611_206178162_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("The Rock");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/d38e50298129089c6d2a9a9c60501d80/5D221475/t51.2885-19/s150x150/26343200_2031055817138272_1453838565610881024_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Conor McGregor");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/a482671568f2cc9ed0a36632a5076bca/5D230ADE/t51.2885-19/s150x150/51550014_368692490387831_6019134848432603136_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Phila. Flyers");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/662c6aa82b3c2149e76ce266d8731fe8/5D02E20C/t51.2885-19/s150x150/44660222_205869913661907_9147546498072838144_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Knoll");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/9026aee7f55358ae03068bd1b2d25991/5D145A31/t51.2885-19/s150x150/18096183_101046150465002_3393547389640900608_a.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Kristen Bell");

        mImageUrls.add("https://instagram.fphl2-4.fna.fbcdn.net/vp/e05e39012740f8422b2185eb99d09472/5D0192D6/t51.2885-19/s150x150/26073781_169124867033689_8018312227729702912_n.jpg?_nc_ht=instagram.fphl2-4.fna.fbcdn.net");
        mNames.add("Nintendo");

        //break//


        initRecyclerView();
    }


    @Override
    public void onNoteClick(int position) {

    }
}
