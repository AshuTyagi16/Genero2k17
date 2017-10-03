package in.genero.pirates.genero2k17.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joooonho.SelectableRoundedImageView;

import java.util.ArrayList;

import in.genero.pirates.genero2k17.R;
import in.genero.pirates.genero2k17.models.Event;

/**
 * Created by Sasuke on 10/3/2017.
 */

public class HorizontalPagerAdapter extends PagerAdapter {

    private ArrayList<Event> mEventList = new ArrayList<>();

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public HorizontalPagerAdapter(final Context context, ArrayList<Event> eventList) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mEventList = eventList;
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
        view = mLayoutInflater.inflate(R.layout.cell_events, container, false);
        setupItem(view, mEventList.get(position));
        container.addView(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
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

    private void setupItem(final View view, final Event event) {
        final SelectableRoundedImageView img = (SelectableRoundedImageView) view.findViewById(R.id.img_event);
        img.setImageResource(event.getImage());
    }

}
