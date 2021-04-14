package com.example.gsontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Organisation org = JsonToObject.getOrganisationObject();
        System.out.println(org);

        Hero hero = JsonToObject.getHeroObject();
        System.out.println(hero.getId());
    }
}