package com.bradleege.twomaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.mapbox.mapboxsdk.constants.Style;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.views.MapView;

public class MainActivity extends AppCompatActivity {

    private MapView mv, miniMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mv = (MapView) findViewById(R.id.map_view);
        mv.setStyleUrl(Style.MAPBOX_STREETS);
        mv.setCenterCoordinate(new LatLng(38.889, -77.019));
        mv.setRotateEnabled(true);
        mv.setScrollEnabled(true);
        mv.setCompassEnabled(true);
        mv.setLogoVisibility(View.VISIBLE);
        mv.setAttributionVisibility(View.VISIBLE);
        mv.setZoomLevel(16);
        mv.onCreate(savedInstanceState);

        miniMap = (MapView) this.findViewById(R.id.mini_map);
        miniMap.setStyleUrl(Style.MAPBOX_STREETS);
        miniMap.setCenterCoordinate(new LatLng(38.889, -77.019));
        miniMap.setRotateEnabled(false);
        miniMap.setScrollEnabled(false);
        miniMap.setCompassEnabled(false);
        miniMap.setLogoVisibility(View.GONE);
        miniMap.setZoomLevel(6);
        miniMap.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mv.onStart();
        miniMap.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mv.onStop();
        miniMap.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mv.onDestroy();
        miniMap.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mv.onResume();
        miniMap.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mv.onPause();
        miniMap.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        mv.onSaveInstanceState(outState);
        miniMap.onSaveInstanceState(outState);
    }
}

