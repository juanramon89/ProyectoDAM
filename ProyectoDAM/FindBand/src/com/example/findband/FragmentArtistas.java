package com.example.findband;

import org.apache.commons.lang3.text.WordUtils;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentArtistas extends Fragment {
	public BaseDatos base;
	public String text;
	public boolean comprueba;
	TextView artistas;
	Button ir;
	EditText editText;
	
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fm_artistas, container,false);
		artistas = (TextView)rootView.findViewById(R.id.lblArtistas);
		ir = (Button)rootView.findViewById(R.id.buttonIr);
		editText = (EditText)rootView.findViewById(R.id.editTextArtista);
		
		ir.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getActivity(),MuestraArtistas.class);
				Bundle b = new Bundle();
				String artista = editText.getText().toString();
				artista = WordUtils.capitalizeFully(artista);
				compruebaNombre(artista);
				
					if(comprueba == true){
						b.putString("ARTISTA", artista);
						intent.putExtras(b);
						startActivity(intent);
					}
				
			}
		});
		
		return rootView;
	}
	
public void compruebaNombre(String nomb){
		
		base = new BaseDatos(getActivity(),"dbase",null,1);
		SQLiteDatabase db = base.getReadableDatabase(); 
		
		Cursor rn = db.rawQuery("SELECT Nombre FROM Artistas;",null);
		
		comprueba = false;

		if(rn.moveToFirst()){
			do{
				if(nomb.equals(rn.getString(0))){
					comprueba = true;
					rn.moveToLast();
				}
			}
			while (rn.moveToNext());
		}
		
		if(comprueba == false){
			Toast.makeText(getActivity(), "No existe el artista introducido.", Toast.LENGTH_LONG).show();
		}
}

}
