package com.example.findband;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PantallaInicio extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	}
	

	public void forwardZoom(View vista){
		startActivity(new Intent(PantallaInicio.this,MenuPrincipal.class));
		overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
	}
	

}
