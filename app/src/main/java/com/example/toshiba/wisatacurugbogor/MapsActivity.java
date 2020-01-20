package com.example.toshiba.wisatacurugbogor;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker curug cibeureum
        LatLng CurugCibereum = new LatLng(-6.7542305, 106.9839382);
        mMap.addMarker(new MarkerOptions().position(CurugCibereum).title("Curug Cibeureum")).setSnippet("JL. Cisarua Puncak KM. 10, Desa Cilember, Kec. Cisarua, Puncak, Cimacan, Cipanas, Kabupaten Cianjur, Jawa Barat 43253");
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CurugCibereum,10));

        // Add a marker curug leuwi hejo
        LatLng CurugLeuwiHejo = new LatLng(-6.5927001,106.9531813);
        mMap.addMarker(new MarkerOptions().position(CurugLeuwiHejo).title("Curug Leuwi Hejo")).setSnippet("Cibadak, Sukamakmur, Cibadak, Sukamakmur, Bogor, Jawa Barat 16830");
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CurugLeuwiHejo,10));

        // Add a marker curug bidadari
        LatLng CurugBidadari = new LatLng(-6.6140213,106.9062115);
        mMap.addMarker(new MarkerOptions().position(CurugBidadari).title("Curug Bidadari")).setSnippet("Jl. Sentul Paradise Park, Bojong Koneng, Babakan Madang, Bogor, Jawa Barat 16810");
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CurugBidadari,10));

        //Add a marker curug cilember
        LatLng CurugCilember = new LatLng(-6.660793,106.9434515);
        mMap.addMarker(new MarkerOptions().position(CurugCilember).title("Curug Cilember")).setSnippet("Jl. Raya Puncak KM. 15, Megamendung, Cisarua, Megamendung, Bogor, Jawa Barat 16750");
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CurugCilember,10));

        //Add a marker curug lieuk
        LatLng CurugNgumpet = new LatLng(6.6969404,106.6879616);
        mMap.addMarker(new MarkerOptions().position(CurugNgumpet).title("Curug Ngumpet")).setSnippet("Gunung Salak, Gn. Sari, Pamijahan, Bogor, Jawa Barat 16810");
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CurugNgumpet,10));

        //Add a marker curug leuwi lieuk
        LatLng CurugLeuwiLieuk = new LatLng(-6.5945241,106.9530417);
        mMap.addMarker(new MarkerOptions().position(CurugLeuwiLieuk).title("Curug Leuwi Lieuk")).setSnippet("Pabuaran, Sukamakmur, Cibadak, Sukamakmur, Bogor, Jawa Barat 16830");
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CurugLeuwiLieuk,10));

        //Add a marker curug barong
        LatLng CurugBarong = new LatLng(-6.5929016,106.9545131);
        mMap.addMarker(new MarkerOptions().position(CurugBarong).title("Curug Barong")).setSnippet("Pabuaran, Sukamakmur, Bogor, Jawa Barat 16810");
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CurugBarong,10));

        //Add a marker curug panjang
        LatLng CurugPanjang = new LatLng(-6.6461391,106.9429269);
        mMap.addMarker(new MarkerOptions().position(CurugPanjang).title("Curug Panjang")).setSnippet("Megamendung, Bogor, Jawa Barat 16770");
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CurugPanjang,10));

        //Add a marker curug luhur
        LatLng CurugLuhur = new LatLng(-6.660011,106.7058569);
        mMap.addMarker(new MarkerOptions().position(CurugLuhur).title("Curug Luhur")).setSnippet("Jl. Hegarmanah, Pamijahan, Tapos I, Tenjolaya, Tapos I, Tenjolaya, Bogor, Jawa Barat 16370");
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CurugLuhur,10));

        //Add a marker curug ciherang
        LatLng CurugCiherang = new LatLng(-6.6367678,106.9962804);
        mMap.addMarker(new MarkerOptions().position(CurugCiherang).title("Curug Ciherang")).setSnippet("Sirnajaya, Sukamakmur, Wargajaya, Sukamakmur, Bogor, Jawa Barat 16830");
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CurugCiherang,10));
        
        

    }
}
