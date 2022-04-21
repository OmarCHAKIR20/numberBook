package com.example.numberbook;

import android.content.Intent;
import android.provider.ContactsContract;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class AddContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
    }

    public void btnAdd_Contact_onClick(View view) {
//--------------< btnAdd_Contact_onClick() --------------------

//< create intent Contact-add >
        Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
        intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
//</ create intent Contact-add >

//< get entered-data >
        EditText mEmailAddress = (EditText) findViewById(R.id.txtEmail);
        EditText mPhoneNumber = (EditText) findViewById(R.id.txtTelephone);
        EditText firstName = (EditText) findViewById(R.id.txtFirstname);
        EditText lasttName = (EditText) findViewById(R.id.txtFamilyname);
//</ get entered-data >

// Inserts an email address
        intent.putExtra(ContactsContract.Intents.Insert.EMAIL, mEmailAddress.getText())
                .putExtra(ContactsContract.Intents.Insert.EMAIL_TYPE, ContactsContract.CommonDataKinds.Email.TYPE_WORK)
                .putExtra(ContactsContract.Intents.Insert.PHONE, mPhoneNumber.getText())
                .putExtra(ContactsContract.Intents.Insert.NAME, firstName.getText() + " "+lasttName.getText())

//In this example, sets the phone type to be a work phone.
                .putExtra(ContactsContract.Intents.Insert.PHONE_TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_WORK);

//< start form >
        startActivity(intent);
//</ start form >
//--------------</ btnAdd_Contact_onClick() --------------------
    }
}