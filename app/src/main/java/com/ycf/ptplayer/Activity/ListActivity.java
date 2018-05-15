package com.ycf.ptplayer.Activity;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

import com.ycf.ptplayer.Fragment.ListVideosFragment;
import com.ycf.ptplayer.R;

public class ListActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
//		加载Fragment

		FragmentTransaction ft = getFragmentManager().beginTransaction();
		ft.add(R.layout.fragment_listvideoitem_list,ListVideosFragment.newInstance());
	}
}
