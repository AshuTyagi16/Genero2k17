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
import in.genero.pirates.genero2k17.models.Member;

/**
 * Created by Sasuke on 10/8/2017.
 */

public class CoreTeamAdapter extends PagerAdapter {

    private ArrayList<Member> mMemberList = new ArrayList<>();

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public CoreTeamAdapter(final Context context, ArrayList<Member> members) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mMemberList = members;
    }

    @Override
    public int getCount() {
        if (mMemberList != null)
            return mMemberList.size();
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
        view = mLayoutInflater.inflate(R.layout.cell_core_team, container, false);
        setupItem(view, mMemberList.get(position));
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

    private void setupItem(final View view, final Member member) {
        final ImageView ivMember = (ImageView) view.findViewById(R.id.iv_member);
        final TextView tvName = (TextView) view.findViewById(R.id.tv_member_name);
        final TextView tvDesignation = (TextView) view.findViewById(R.id.tv_member_designation);

        ivMember.setImageResource(member.getMemberImage());
        tvName.setText(member.getMemberName());
        tvDesignation.setText(member.getMemberDesignation());
    }

}

