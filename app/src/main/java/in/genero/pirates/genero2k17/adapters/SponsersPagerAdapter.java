package in.genero.pirates.genero2k17.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joooonho.SelectableRoundedImageView;

import java.util.ArrayList;

import in.genero.pirates.genero2k17.R;
import in.genero.pirates.genero2k17.models.Sponsors;

/**
 * Created by Sasuke on 10/3/2017.
 */

public class SponsersPagerAdapter extends PagerAdapter {

    private ArrayList<Sponsors> mSponsorsList = new ArrayList<>();

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public SponsersPagerAdapter(final Context context, ArrayList<Sponsors> eventList) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mSponsorsList = eventList;
    }

    @Override
    public int getCount() {
        if (mSponsorsList != null)
            return mSponsorsList.size();
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
        view = mLayoutInflater.inflate(R.layout.cell_sponsors, container, false);
        setupItem(view, mSponsorsList.get(position));
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

    private void setupItem(final View view, final Sponsors sponsors) {
        final SelectableRoundedImageView img = (SelectableRoundedImageView) view.findViewById(R.id.img_sponsors);
        img.setImageResource(sponsors.getLogo());
    }

}
