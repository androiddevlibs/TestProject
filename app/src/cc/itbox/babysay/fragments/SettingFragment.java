package cc.itbox.babysay.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cc.itbox.babysay.R;
import cc.itbox.babysay.activities.MainActivity.BaseFragment;

/**
 * 设置页面
 * 
 * @author baoyz 
 * 
 * 2014-2-22 下午10:47:01
 *
 */
public class SettingFragment extends BaseFragment {


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_guide, container, false);
		return view;
	}
}
