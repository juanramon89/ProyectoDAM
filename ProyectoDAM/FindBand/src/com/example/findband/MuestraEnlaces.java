package com.example.findband;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class MuestraEnlaces extends Activity {
	
	private String enlace;
	private BaseDatos base;
	private Cursor rs;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.muestra_enlaces);
		
		Bundle b = this.getIntent().getExtras();
		enlace = b.getString("ENLACES");
		TextView enlace1 = (TextView)findViewById(R.id.textViewEnl1);
		TextView enlace2 = (TextView)findViewById(R.id.textViewEnl2);
		TextView enlace3 = (TextView)findViewById(R.id.textViewEnl3);
		
		ImageView imagen1 = (ImageView)findViewById(R.id.imageView1);
		ImageView imagen2 = (ImageView)findViewById(R.id.imageView2);
		ImageView imagen3 = (ImageView)findViewById(R.id.imageView3);
		
		try{
			
			base = new BaseDatos(this,"dbase",null,1);
			SQLiteDatabase db = base.getReadableDatabase();
			
			rs = db.rawQuery("SELECT Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3 FROM Enlaces " +
					"WHERE Id_enlace LIKE '"+ enlace +"';", null);
			rs.moveToFirst();
			
			enlace1.setText(rs.getString(3));
			enlace2.setText(rs.getString(4));
			enlace3.setText(rs.getString(5));
			
			imagen1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					lanzaEnlace(rs.getString(0));
				}
			});
			
			imagen2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					lanzaEnlace(rs.getString(2));	
				}
			});
			
			imagen3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					lanzaEnlace(rs.getString(1));
				}
			});
			
		}catch(Exception e){
			
		}
	}
	
	public void lanzaEnlace(String enlaceVid){
		Intent intent = new Intent();
		intent.setAction(Intent.ACTION_VIEW);
		intent.addCategory(Intent.CATEGORY_BROWSABLE);
		intent.setData(Uri.parse(enlaceVid));
		startActivity(intent);
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
	        	Intent intent = new Intent(MuestraEnlaces.this,AcercaDe.class);
	        	startActivity(intent);
	            return true;
	            
	        case R.id.ajustes:
	        	Intent intent2 = new Intent(MuestraEnlaces.this,Ajustes.class);
	        	startActivity(intent2);
	        	return true;
	            
	        default:
	            return super.onOptionsItemSelected(item);
		 }
	}

}
