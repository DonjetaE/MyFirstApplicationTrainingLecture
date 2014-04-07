package com.komaniaueue.myfirstapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity_layout);
		
		Button btnRegjistro = (Button) findViewById(R.id.btnRegjistro);
		final EditText edtFirstName = (EditText) findViewById(R.id.edtFirstName);
		final EditText edtLastname = (EditText) findViewById(R.id.edtLastname);
		final EditText edtUsername = (EditText) findViewById(R.id.edtUsername);
		final EditText edtPassword = (EditText) findViewById(R.id.edtPassword);
		final EditText edtEmail = (EditText) findViewById(R.id.edtEmail);
		btnRegjistro.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent();
				intent.putExtra("FirstName", edtFirstName.getText().toString());
				intent.putExtra("LastName", edtLastname.getText().toString());
				intent.putExtra("Username", edtUsername.getText().toString());					
				intent.putExtra("Password", edtPassword.getText().toString());
				intent.putExtra("Email", edtEmail.getText().toString());
				startActivity(intent);
			}
		});
	}
}
