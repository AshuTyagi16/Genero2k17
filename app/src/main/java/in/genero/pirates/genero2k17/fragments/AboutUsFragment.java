package in.genero.pirates.genero2k17.fragments;

import in.genero.pirates.genero2k17.R;

/**
 * Created by Sasuke on 10/8/2017.
 */

public class AboutUsFragment extends BaseFragment {

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_about_us;
    }

    public static AboutUsFragment newInstance() {
        return new AboutUsFragment();
    }
}
