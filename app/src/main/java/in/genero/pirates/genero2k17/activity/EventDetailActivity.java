package in.genero.pirates.genero2k17.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.google.gson.Gson;

import in.genero.pirates.genero2k17.R;
import in.genero.pirates.genero2k17.fragments.EventDetailFragment;
import in.genero.pirates.genero2k17.models.Event;

/**
 * Created by Sasuke on 10/3/2017.
 */

public class EventDetailActivity extends SingleFragmentActivity {

    private static final String EXTRA_EVENT = "event";

    @Override
    protected Fragment createFragment() {
        return EventDetailFragment.newInstance(getIntent().getStringExtra(EXTRA_EVENT));
    }

    @Override
    protected String setActionBarTitle() {
        return "Event Detail";
    }

    @Override
    protected boolean showActionBar() {
        return true;
    }

    @Override
    protected int setActionBarColor() {
        return R.color.colorPrimary;
    }

    public static Intent newIntent(Context context, Event event) {
        Intent intent = new Intent(context, EventDetailActivity.class);
        intent.putExtra(EXTRA_EVENT, new Gson().toJson(event));
        return intent;
    }
}
