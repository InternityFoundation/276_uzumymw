package com.example.vmac.WatBot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class Route_select extends AppCompatActivity implements OnMapReadyCallback{

    GoogleMap mapAPI;
    SupportMapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_select);

        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapAPI);
        mapFragment.getMapAsync(this);

        final Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityChangeIntent = new Intent(Route_select.this, MainActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                Route_select.this.startActivity(activityChangeIntent);
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mapAPI = googleMap;
        LatLng current = new LatLng(28.4583876,77.0716413);

        mapAPI.addMarker(new MarkerOptions().position(current));

        mapAPI.moveCamera(CameraUpdateFactory.newLatLngZoom(current,15.5f));
//        mapAPI.setMapType(mapAPI.MAP_TYPE_SATELLITE);

    }
}
