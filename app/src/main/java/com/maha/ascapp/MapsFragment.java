package com.maha.ascapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends Fragment {
    private GoogleMap mMap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_maps, container, false);
        com.google.android.gms.maps.SupportMapFragment supportMapFragment = (com.google.android.gms.maps.SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);

        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull GoogleMap googleMap) {
                mMap = googleMap;
                mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
                    @Override
                    public void onMapClick(@NonNull LatLng latLng) {
                        LatLng Irakkamam = new LatLng(7.217157, 81.746866);
                        mMap.addMarker(new MarkerOptions().position(Irakkamam).title("Current Location"));
                        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Irakkamam, 18.0f));
                        mMap.getUiSettings().setZoomControlsEnabled(true);
                    }
                });

            }
        });
        return view;
    }
}
