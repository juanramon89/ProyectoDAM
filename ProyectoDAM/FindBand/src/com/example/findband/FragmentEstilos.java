package com.example.findband;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class FragmentEstilos extends Fragment {
	
	public BaseDatos base;
	public ListView myListView;
	private Estilos[] datos;
	public String estilo;
	
	class AdaptadorEstilos extends ArrayAdapter<Estilos>{
		Activity a;
		AdaptadorEstilos(Activity b){
			super(b, R.layout.estilos,datos);
			this.a = b;
		}
		public View getDropDownView (int position,View convertView,ViewGroup parent){
			return getView(position,convertView,parent);
		}
		
		public View getView(int position,View convertView,ViewGroup parent){
			LayoutInflater inflater = a.getLayoutInflater();
			View item = inflater.inflate(R.layout.estilos, null);
			
			final TextView lblEstilo = (TextView)item.findViewById(R.id.nombre);
			
			lblEstilo.setText(datos[position].getNomEstilo());
			
			return(item);
		}
	}
	
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fm_estilos, container,false);
		
		try{
			
			base = new BaseDatos(getActivity(),"dbase",null,1);
			SQLiteDatabase db = base.getReadableDatabase();

			Cursor rs = db.rawQuery("SELECT Estilo FROM Artistas GROUP BY Estilo", null);
					datos = new Estilos[rs.getCount()];
					rs.moveToFirst();
			//datos[0] = new Estilos("Estilos");
			int i = 0;
			if (rs.moveToFirst())
			{
				do
				{
					String nom = rs.getString(0);
					
					datos[i]=new Estilos(nom);
					i++;
				}
				while (rs.moveToNext());
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		myListView = (ListView)rootView.findViewById(R.id.listViewEstilos);
		AdaptadorEstilos adaptador = new AdaptadorEstilos(getActivity());
		adaptador.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		myListView.setAdapter(adaptador);

		myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
		Intent intent = new Intent(getActivity(),MuestraArtistas.class);
		Bundle b = new Bundle();
		estilo = ((Estilos)parent.getAdapter().getItem(position)).getNomEstilo();
		b.putString("ESTILO",estilo);


			intent.putExtras(b);
			startActivity(intent);

		}
		});
		
		return rootView;
	}

}
