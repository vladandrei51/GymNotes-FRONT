package com.example.vlada.licenta;

import android.content.Intent;
import android.os.Bundle;

import com.example.vlada.licenta.Views.Base.BaseDrawerActivity;
import com.example.vlada.licenta.Views.ExercisesFragment;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainActivity extends BaseDrawerActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration
                .Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(config);


        setContentView(R.layout.activity_main);
        Intent intent = new Intent(MainActivity.this, ExercisesFragment.class);
        startActivity(intent);
    }
}
