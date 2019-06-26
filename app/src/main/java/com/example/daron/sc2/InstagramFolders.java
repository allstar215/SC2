package com.example.daron.sc2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class InstagramFolders extends AppCompatActivity {

    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram_folders);

        imageButton = (ImageButton) findViewById(R.id.igheart);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIgFav();
            }
        });
    }

    public void openIgFav () {
        Intent intent = new Intent (this, IgFav.class);
        startActivity(intent);
    }

}
