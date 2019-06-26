package com.example.daron.sc2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.view.Menu
import android.view.MenuItem


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)


        val mainfb = findViewById<ImageButton>(R.id.main_fb)
        mainfb.setOnClickListener { }
        run {
            val maininsta = findViewById<ImageButton>(R.id.main_insta)
            val mainreddit = findViewById<ImageButton>(R.id.main_reddit)
            val mainpint = findViewById<ImageButton>(R.id.main_pint)
            val maintwit = findViewById<ImageButton>(R.id.main_twit)
            val maintumb = findViewById<ImageButton>(R.id.main_tumb)
            val mainyt = findViewById<ImageButton>(R.id.main_yt)
            val mainsnap = findViewById<ImageButton>(R.id.main_snap)
            val maingp = findViewById<ImageButton>(R.id.main_gp)
            val mainflickr = findViewById<ImageButton>(R.id.main_flickr)


            mainfb.setOnClickListener(this)
            maininsta.setOnClickListener(this)
            mainreddit.setOnClickListener(this)
            mainpint.setOnClickListener(this)
            maintwit.setOnClickListener(this)
            maintumb.setOnClickListener(this)
            mainyt.setOnClickListener(this)
            mainsnap.setOnClickListener(this)
            maingp.setOnClickListener(this)
            mainflickr.setOnClickListener(this)


        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


    override fun onClick(v: View) {

        when (v.id) {
            R.id.main_insta -> {
                var intent = Intent(baseContext, InstagramFolders::class.java)
                startActivity(intent)
            }
            R.id.main_fb -> {
                intent = Intent(baseContext, FacebookFolders::class.java)
                startActivity(intent)
            }
            R.id.main_reddit -> {
                intent = Intent(baseContext, RedditFolders::class.java)
                startActivity(intent)
            }

            R.id.main_pint -> {
                intent = Intent(baseContext, PinterestFolders::class.java)
                startActivity(intent)
            }

            R.id.main_twit -> {
                intent = Intent(baseContext, TwitterFolders::class.java)
                startActivity(intent)
            }

            R.id.main_tumb -> {
                intent = Intent(baseContext, TumblrFolders::class.java)
                startActivity(intent)
            }

            R.id.main_yt -> {
                intent = Intent(baseContext, YoutubeFolders::class.java)
                startActivity(intent)
            }

            R.id.main_snap -> {
                intent = Intent(baseContext, SnapchatFolders::class.java)
                startActivity(intent)
            }

            R.id.main_gp -> {
                intent = Intent(baseContext, GoogleplusFolders::class.java)
                startActivity(intent)
            }

            R.id.main_flickr -> {
                intent = Intent(baseContext, FlickrFolders::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {

            R.id.nav_facebook -> {
                var intent = Intent(baseContext, FacebookFolders::class.java)
                startActivity(intent)
            }
            R.id.nav_instagram -> {
                intent = Intent(baseContext, InstagramFolders::class.java)
                startActivity(intent)
            }
        }



        return super.onOptionsItemSelected(item)
    }

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }


}
