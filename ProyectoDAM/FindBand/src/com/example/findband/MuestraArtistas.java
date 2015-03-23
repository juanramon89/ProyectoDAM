package com.example.findband;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

@SuppressLint("NewApi") public class MuestraArtistas extends Activity {
	
	public String estilo;
	public String artista;
	private BaseDatos base;
	private Artistas[] datos;
	public ListView myListView;
	public TextView lblNomb;
	public TextView lblEsti;
	public String enlace;
	public String sentenciaSQL;
	public Cursor rs;
	

	
	class AdaptadorArtistas extends ArrayAdapter<Artistas>{
		Activity a;
		
		AdaptadorArtistas(Activity b){
			super(b,R.layout.artistas,datos);
			this.a = b;
		}
		
		public View getDropDownView(int position,View convertView,ViewGroup parent){
			return getView(position,convertView,parent);
		}
		
		public View getView(int position,View convertView, ViewGroup parent){
			
			LayoutInflater inflater = a.getLayoutInflater();
			View item = inflater.inflate(R.layout.artistas, null);
			
			final TextView nombre = (TextView)item.findViewById(R.id.textViewNom);
			final TextView estilo = (TextView)item.findViewById(R.id.textViewEst);
			
			nombre.setText(datos[position].getNombre());
			estilo.setText(datos[position].getEstilo());
			
			return (item);
		}
	}
	
	@SuppressLint("NewApi") @Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.muestra_artista);
		
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		
		base = new BaseDatos(this,"dbase",null,1);
		SQLiteDatabase db = base.getReadableDatabase();
		
		lblNomb = (TextView)findViewById(R.id.textViewNombre);
		lblEsti = (TextView)findViewById(R.id.textViewEstilo);
		Bundle b = this.getIntent().getExtras();
		estilo = b.getString("ESTILO");
		artista = b.getString("ARTISTA");

		if(estilo != null){
			rs = db.rawQuery("SELECT Nombre,Estilo,Enlaces FROM Artistas WHERE "+
									"Estilo LIKE '"+ estilo +"';", null);
		}else if(artista != null){
			rs = db.rawQuery("SELECT Estilo,Nivel FROM Artistas "+
					"WHERE Nombre LIKE '"+ artista +"';", null);
			rs.moveToFirst();
			String estilo = rs.getString(0);
			String nivel = rs.getString(1);
			
			rs = db.rawQuery("SELECT Nombre,Estilo,Enlaces FROM " +
					"(SELECT Nombre,Estilo,Enlaces FROM Artistas "+
					"WHERE Estilo LIKE '"+ estilo +"' AND "+
					"NOT Nombre = '"+ artista +"' AND Nivel >= '"+ nivel +"' "+
					"ORDER BY Nivel) T1 "+
					"UNION ALL SELECT Nombre,Estilo,Enlaces FROM " +
					"(SELECT Nombre,Estilo,Enlaces FROM Artistas "+
					"WHERE Estilo LIKE '"+ estilo +"' AND "+
					"NOT Nombre = '"+ artista +"' AND Nivel < '"+ nivel +"' "+
					"ORDER BY Nivel) T2 ;",null);
			
			rs.moveToFirst();
		}

			try{
				
				datos = new Artistas[rs.getCount()];
				int i = 0;
				if(rs.moveToFirst()){
					do{
						String nomb = rs.getString(0);
						String est = rs.getString(1);
						String enl = rs.getString(2);
						datos[i] = new Artistas(nomb,est,enl);
				//	Toast.makeText(getApplicationContext(), enl, Toast.LENGTH_LONG).show();
				//	Log.d("PALABRA DE XITI",enl);
						i++;
					}
					while (rs.moveToNext());
				}
			
			}catch (Exception e){
			
			}
		
		
		myListView = (ListView)findViewById(R.id.listViewArtistas);
		AdaptadorArtistas adaptador = new AdaptadorArtistas(this);
		adaptador.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		myListView.setAdapter(adaptador);
		
		
		myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent intent = new Intent(MuestraArtistas.this,MuestraEnlaces.class);
				Bundle b = new Bundle();
				enlace = ((Artistas)parent.getAdapter().getItem(position)).getEnlace();
				b.putString("ENLACES", enlace);
				

					intent.putExtras(b);
					startActivity(intent);
				
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		 switch (item.getItemId()) {
		 		
	        case R.id.acercaDe:
	        	Intent intent = new Intent(MuestraArtistas.this,AcercaDe.class);
	        	startActivity(intent);
	            return true;
	            
	        case R.id.ajustes:
	        	Intent intent2 = new Intent(MuestraArtistas.this,Ajustes.class);
	        	startActivity(intent2);
	        	return true;
	            
	        default:
	            return super.onOptionsItemSelected(item);
		 }
	}

}
