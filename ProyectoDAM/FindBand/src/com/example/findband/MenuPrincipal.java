package com.example.findband;

import java.lang.reflect.Field;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.widget.Toast;


public class MenuPrincipal extends ActionBarActivity implements 
											ActionBar.TabListener, OnPageChangeListener{
	
	ViewPager mViewPager;
	private Toast backtoast;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
			
		setContentView(R.layout.menu_principal);
	
		PageAdapter adapter = new PageAdapter(getSupportFragmentManager());
		mViewPager = (ViewPager)findViewById(R.id.pager);
		mViewPager.setAdapter(adapter);
		
		mViewPager.setOnPageChangeListener(this);
		
		ActionBar actionBar = getSupportActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		Tab tab = actionBar.newTab().setText(R.string.tab_artistas).setTabListener(this);

		actionBar.addTab(tab);
		
		Tab tab2 = actionBar.newTab().setText(R.string.tab_estilos).setTabListener(this);

		actionBar.addTab(tab2);
		
	    try {
	        ViewConfiguration config = ViewConfiguration.get(this);
	        Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
	        if(menuKeyField != null) {
	            menuKeyField.setAccessible(true);
	            menuKeyField.setBoolean(config, false);
	        }
	    } catch (Exception ex) {
	        // Ignore
	    }

	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageSelected(int arg0) {
		getSupportActionBar().setSelectedNavigationItem(arg0);
		
	}

	@Override
	public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabSelected(Tab arg0, FragmentTransaction arg1) {
		mViewPager.setCurrentItem(arg0.getPosition());
		
	}

	@Override
	public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}
	
	@Override	
	public void onBackPressed() {
	        if(backtoast!=null&&backtoast.getView().getWindowToken()!=null) {
	            finish();
	        } else {
	            backtoast = Toast.makeText(this, "Pulsa otra vez para salir", Toast.LENGTH_SHORT);
	            backtoast.show();
	        }
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
	        	Intent intent = new Intent(MenuPrincipal.this,AcercaDe.class);
	        	startActivity(intent);
	            return true;
	            
	        case R.id.ajustes:
	        	Intent intent2 = new Intent(MenuPrincipal.this,Ajustes.class);
	        	startActivity(intent2);
	        	return true;
	            
	        default:
	            return super.onOptionsItemSelected(item);
		 }
	}
	
}
