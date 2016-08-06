package com.example.xinthe.contactsapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditContacts extends AppCompatActivity {
EditText etName,etPhone,etMail;
    DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contacts);
        etName= (EditText)findViewById(R.id.et1);
        etPhone= (EditText)findViewById(R.id.et2);
        etMail= (EditText)findViewById(R.id.et3);
        dbHelper = new DBHelper(getApplicationContext());
    }
    public void saveContact(View view){
        String name = etName.getText().toString();
        String phone = etPhone.getText().toString().trim();
        String email = etMail.getText().toString().trim();
        ContactHolder values = new ContactHolder(name,phone,email);
        dbHelper.insertContact(values);
        if(dbHelper.insertContact(values)!= -1){
            Toast.makeText(this,"added",Toast.LENGTH_SHORT).show();
        }
    }
}
