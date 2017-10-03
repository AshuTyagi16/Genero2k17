package in.genero.pirates.genero2k17.activity;

/**
 * Created by Sasuke on 10/3/2017.
 */


import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import in.genero.pirates.genero2k17.R;

public abstract class SingleFragmentActivity extends GeneroActivity {


    protected abstract Fragment createFragment();

    protected abstract String setActionBarTitle();

    protected abstract boolean showActionBar();

    @ColorRes
    protected abstract int setActionBarColor();

    @BindView(R.id.action_bar_title)
    TextView mActionBarTitle;
    @BindView(R.id.actionbar_layout)
    RelativeLayout mActionBarLayout;

    @LayoutRes
    protected int getLayoutResId() {
        return R.layout.activity_single_fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());

        ButterKnife.bind(this);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }

        customizeActionBar();

    }


    private void customizeActionBar() {
        if (showActionBar()) {
            mActionBarLayout.setVisibility(View.VISIBLE);
            if (setActionBarTitle() != null) {
                mActionBarTitle.setVisibility(View.VISIBLE);
                mActionBarTitle.setText(setActionBarTitle());
            }
            if (setActionBarColor() != 0) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    mActionBarLayout.setBackground(new ColorDrawable(getColor(setActionBarColor())));
                } else {
                    mActionBarLayout.setBackground(new ColorDrawable(getResources().getColor(setActionBarColor())));
                }
            }
        } else {
            mActionBarLayout.setVisibility(View.GONE);
        }
    }

    @OnClick(R.id.action_bar_home_icon)
    public void homeButtonClick() {
        hideKeyboard();
        this.onBackPressed();
    }

    protected boolean hideKeyboard() {
        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        if (getCurrentFocus() != null) {
            return imm.hideSoftInputFromWindow(getCurrentFocus().getApplicationWindowToken(), 0);
        }
        return false;
    }

}
