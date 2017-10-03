package in.genero.pirates.genero2k17.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.gigamole.infinitecycleviewpager.VerticalInfiniteCycleViewPager;

import java.util.ArrayList;

import butterknife.BindView;
import in.genero.pirates.genero2k17.R;
import in.genero.pirates.genero2k17.adapters.VerticalPagerAdapter;
import in.genero.pirates.genero2k17.models.Sponsors;

/**
 * Created by Sasuke on 10/3/2017.
 */

public class SponsorsFragment extends BaseFragment {

    @BindView(R.id.vicvp)
    VerticalInfiniteCycleViewPager verticalInfiniteCycleViewPager;

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_sponsors;
    }

    public static SponsorsFragment newInstance() {
        return new SponsorsFragment();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        verticalInfiniteCycleViewPager.setAdapter(new VerticalPagerAdapter(getContext(), getSponsers()));
    }

    public ArrayList<Sponsors> getSponsers(){
        ArrayList<Sponsors> sponsorList = new ArrayList<>();
        Sponsors sponsor = new Sponsors();

        sponsor.setLogo(R.drawable.pulsifier);
        sponsor.setDescription("");
        sponsorList.add(sponsor);

        sponsor = new Sponsors();
        sponsor.setLogo(R.drawable.glued);
        sponsor.setDescription("");
        sponsorList.add(sponsor);

        sponsor = new Sponsors();
        sponsor.setLogo(R.drawable.kura);
        sponsor.setDescription("");
        sponsorList.add(sponsor);

        sponsor = new Sponsors();
        sponsor.setLogo(R.drawable.paisawapis);
        sponsor.setDescription("");
        sponsorList.add(sponsor);

        sponsor = new Sponsors();
        sponsor.setLogo(R.drawable.pure360);
        sponsor.setDescription("");
        sponsorList.add(sponsor);

        sponsor = new Sponsors();
        sponsor.setLogo(R.drawable.paytm);
        sponsor.setDescription("");
        sponsorList.add(sponsor);

        sponsor = new Sponsors();
        sponsor.setLogo(R.drawable.aptron);
        sponsor.setDescription("");
        sponsorList.add(sponsor);

        sponsor = new Sponsors();
        sponsor.setLogo(R.drawable.cadd_ventre);
        sponsor.setDescription("");
        sponsorList.add(sponsor);

        sponsor = new Sponsors();
        sponsor.setLogo(R.drawable.kvch);
        sponsor.setDescription("");
        sponsorList.add(sponsor);

        sponsor = new Sponsors();
        sponsor.setLogo(R.drawable.clinch_hub);
        sponsor.setDescription("");
        sponsorList.add(sponsor);

        return sponsorList;
    }
}
