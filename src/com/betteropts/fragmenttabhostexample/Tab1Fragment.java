package com.betteropts.fragmenttabhostexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Tab1Fragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.tab_fragment, null);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		initView();
	}
	
	private void initView() {
		((TextView)getView().findViewById(R.id.tab_text)).setText("Tab 1");
		Button button = (Button) getView().findViewById(R.id.tab_btn);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				replaceFragment();
			}
		});
	}
	
	private void replaceFragment() {
		((BaseContainerFragment)getParentFragment()).replaceFragment(new Tab1AddOnFragment(), true);
	}
	
}
