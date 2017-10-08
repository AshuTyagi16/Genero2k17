package in.genero.pirates.genero2k17.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;
import com.google.gson.Gson;

import butterknife.BindView;
import in.genero.pirates.genero2k17.R;
import in.genero.pirates.genero2k17.adapters.EventDetailsPagerAdapter;
import in.genero.pirates.genero2k17.models.Event;

/**
 * Created by Sasuke on 10/3/2017.
 */

public class EventDetailFragment extends BaseFragment {
    private static final String EXTRA_EVENT = "event";
    private Event mEvent;

    @BindView(R.id.hicvp)
    HorizontalInfiniteCycleViewPager horizontalInfiniteCycleViewPager;
    @BindView(R.id.kenbuns_view)
    KenBurnsView kenBurnsView;

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_event_detail;
    }

    public static EventDetailFragment newInstance(String event) {
        EventDetailFragment fragment = new EventDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_EVENT, event);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            String jsonEvent = getArguments().getString(EXTRA_EVENT);
            mEvent = new Gson().fromJson(jsonEvent, Event.class);
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        horizontalInfiniteCycleViewPager.setAdapter(new EventDetailsPagerAdapter(getContext(), mEvent));
    }
}
