package in.genero.pirates.genero2k17.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import in.genero.pirates.genero2k17.R;
import in.genero.pirates.genero2k17.models.Event;
import in.genero.pirates.genero2k17.models.EventDetail;

/**
 * Created by Sasuke on 10/8/2017.
 */

public class EventDetailsPagerAdapter extends PagerAdapter {

    private ArrayList<EventDetail> mEventList = new ArrayList<>();
    private Event mEvent;

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public EventDetailsPagerAdapter(final Context context, Event event) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mEvent = event;
        mEventList = mEvent.getEventDetails();
    }

    @Override
    public int getCount() {
        if (mEventList != null)
            return mEventList.size();
        else
            return 0;
    }

    @Override
    public int getItemPosition(final Object object) {
        return POSITION_NONE;
    }

    @Override
    public Object instantiateItem(final ViewGroup container, final int position) {
        final View view;
        view = mLayoutInflater.inflate(R.layout.cell_event_details, container, false);
        setupItem(view, mEventList.get(position));
        container.addView(view);
        return view;
    }

    @Override
    public boolean isViewFromObject(final View view, final Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(final ViewGroup container, final int position, final Object object) {
        container.removeView((View) object);
    }

    private void setupItem(final View view, final EventDetail eventDetail) {
        final ImageView imgCv = (ImageView) view.findViewById(R.id.iv_event_image_cv);
        final TextView textViewCv = (TextView) view.findViewById(R.id.tv_event_name_cv);
        final TextView textViewDesctiption = (TextView) view.findViewById(R.id.tv_event_description);
        final TextView textViewRules = (TextView) view.findViewById(R.id.tv_event_rules);
        final TextView textViewDuration = (TextView) view.findViewById(R.id.tv_event_duration);
        final TextView textViewEventType = (TextView) view.findViewById(R.id.tv_event_type);

//        imgCv.setImageResource(mEvent.getImage());

        textViewCv.setText(eventDetail.getEvevtName());

        textViewDesctiption.setText(eventDetail.getEventDescription());
        textViewRules.setText(eventDetail.getEventRules());
        textViewDuration.setText(eventDetail.getEventDuration());
        textViewEventType.setText(eventDetail.getEventType());

    }

}

