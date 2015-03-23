package com.example.findband;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class PageAdapter extends FragmentPagerAdapter {

	public PageAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0) {
		switch (arg0){
		case 0:
			return new FragmentArtistas();
		case 1:
			return new FragmentEstilos();
		default:
			return null;
		}
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 2;
	}

}
