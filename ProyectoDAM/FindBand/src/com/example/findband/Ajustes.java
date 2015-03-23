package com.example.findband;

import java.util.Locale;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Ajustes extends Activity {
	
	TextView idioma;
	Spinner seleccionIdioma;
	private String[] languages = { "Español", "Ingles"};
	int posIdioma = 0;
	int lastIdioma = 0;
	Toast toast;
	SharedPreferences preferences;
	Editor editor;
	
	class AdaptadorIdioma extends ArrayAdapter<String>{
		
		Activity a;
		AdaptadorIdioma(Activity b){
			super(b,R.layout.seleccion_lenguaje,languages);
			this.a = b;
		}
		public View getDropDownView (int position,View convertView,ViewGroup parent){
			return getView(position,convertView,parent);
		}
		
		public View getView(int position,View convertView,ViewGroup parent){
			LayoutInflater inflater = a.getLayoutInflater();
			View item = inflater.inflate(R.layout.seleccion_lenguaje, null);
			
			final TextView lblIdioma = (TextView)item.findViewById(R.id.textViewIdioma);
			
			lblIdioma.setText(languages[position]);
			
			return(item);
		}
	}
	
	private void refresh(){
		finish();
		startActivity(getIntent());
		overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ajustes);
		
		seleccionIdioma = (Spinner)findViewById(R.id.spinnerIdioma);
		
		AdaptadorIdioma adaptador = new AdaptadorIdioma(this);
		
		preferences = getSharedPreferences("IdiomaPref",Context.MODE_PRIVATE);
		lastIdioma = preferences.getInt("VALOR_IDIOMA", -1);
		
		adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		seleccionIdioma.setAdapter(adaptador);
				
				
		seleccionIdioma.setOnItemSelectedListener(new OnItemSelectedListener() {
			

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				Configuration config = new Configuration();
				
				if(lastIdioma != position){
					refresh();
				}
				
				switch (position){
				case 0:
					config.locale = Locale.ROOT;
					posIdioma = 0;
					editor = preferences.edit();
					editor.putInt("VALOR_IDIOMA", posIdioma);
					editor.commit();
			//		Toast.makeText(getApplicationContext(), "posIdioma: "+ posIdioma +" lastIdioma: "+lastIdioma + " position:" + position + " caso 0", Toast.LENGTH_LONG).show();
					break;
				case 1:
					config.locale = Locale.ENGLISH;
					posIdioma = 1;
					editor = preferences.edit();
					editor.putInt("VALOR_IDIOMA", posIdioma);
					editor.commit();
			//		Toast.makeText(getApplicationContext(), "posIdioma: "+ posIdioma +" lastIdioma: "+lastIdioma + " position:" + position + " caso 1", Toast.LENGTH_LONG).show();
					break;	
				default:
					config.locale = Locale.ROOT;
					posIdioma = 2;
					editor = preferences.edit();
					editor.putInt("VALOR_IDIOMA", posIdioma);
					editor.commit();
			//		Toast.makeText(getApplicationContext(), "posIdioma: "+ posIdioma +" lastIdioma: "+lastIdioma + " position:" + position + " caso default", Toast.LENGTH_LONG).show();
					break;
				}
				getResources().updateConfiguration(config, null);
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
			}
			
		});
		
		seleccionIdioma.setSelection(lastIdioma);
	}	 
}
