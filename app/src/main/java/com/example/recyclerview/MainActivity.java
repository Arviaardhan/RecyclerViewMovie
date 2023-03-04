package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvKontakName;
    ArrayList<ContactModel> listDataKontak;
    private ContactsAdapter adapterListKontak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listDataKontak = new ArrayList<>();
        rvKontakName = findViewById(R.id.rvkontakname);

        ContactModel kontakOne = new ContactModel();
        kontakOne.setName("Moch Siril Wafa Zidane Feliano");
        kontakOne.setPhone("081xxxxxx");
        listDataKontak.add(kontakOne);

        ContactModel kontakTwo = new ContactModel();
        kontakTwo.setName("Adam Aji Langit");
        kontakTwo.setPhone("081xxxxxx");
        listDataKontak.add(kontakTwo);


        ContactModel kontakThree = new ContactModel();
        kontakThree.setName("Damar Fikri Haikal");
        kontakThree.setPhone("081xxxxxx");
        listDataKontak.add(kontakThree);

        adapterListKontak = new ContactsAdapter(this, listDataKontak);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rvKontakName.setHasFixedSize(true);
        rvKontakName.setLayoutManager(mLayoutManager);
        rvKontakName.setAdapter(adapterListKontak);
    }
}