package in.genero.pirates.genero2k17.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;

import butterknife.BindView;
import in.genero.pirates.genero2k17.R;
import in.genero.pirates.genero2k17.adapters.CoreTeamAdapter;
import in.genero.pirates.genero2k17.models.Member;

/**
 * Created by Sasuke on 10/8/2017.
 */

public class CoreTeamFragment extends BaseFragment {

    @BindView(R.id.hicvp)
    HorizontalInfiniteCycleViewPager horizontalInfiniteCycleViewPager;

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_core_team;
    }

    public static CoreTeamFragment newInstance() {
        return new CoreTeamFragment();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        horizontalInfiniteCycleViewPager.setAdapter(new CoreTeamAdapter(getContext(), getMemberList()));
    }

    private ArrayList<Member> getMemberList() {
        ArrayList<Member> memberList = new ArrayList<>();

        Member member = new Member();
        member.setMemberImage(R.drawable.shivanshu_rao);
        member.setMemberName("Shivanshu Rao");
        member.setMemberDesignation("General Secretary");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.nihaal_patel);
        member.setMemberName("Nihaal Patel");
        member.setMemberDesignation("Joint General Secretary");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.dishant_chauhan);
        member.setMemberName("Dishant Chauhan");
        member.setMemberDesignation("Joint General Secretary");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.saurabh_singh);
        member.setMemberName("Saurabh Singh");
        member.setMemberDesignation("Manager Logistics");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.shantanu_sinha);
        member.setMemberName("Shantanu Sinha");
        member.setMemberDesignation("Manager (TECH -CS)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.neetisha_verma);
        member.setMemberName("Neetisha Verma");
        member.setMemberDesignation("Manager (TECH -CS)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.gaurav_patel);
        member.setMemberName("Gaurav Patel");
        member.setMemberDesignation("Manager (TECH-EE)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.sahil_gupta);
        member.setMemberName("Sahil Gupta");
        member.setMemberDesignation("Manager (TECH-EE)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.divyansh_garg);
        member.setMemberName("Divyansh Garg");
        member.setMemberDesignation("Manager (TECH-ME)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.satvik_gark);
        member.setMemberName("Satvik Garg");
        member.setMemberDesignation("Manager (TECH-ME)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.abhishek_singh_raj);
        member.setMemberName("Abhishek Singh Raj");
        member.setMemberDesignation("Manger (TECH CE)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.shashank_srivastav);
        member.setMemberName("Shashank Srivastava");
        member.setMemberDesignation("Manger (TECH CE)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.gaurav_joshi);
        member.setMemberName("Gaurav Joshi");
        member.setMemberDesignation("Manger (Literary)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.shivi_aggrawal);
        member.setMemberName("Shivi Agarwal");
        member.setMemberDesignation("Manger (Literary)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.srishti_sharma);
        member.setMemberName("Shrishti Sharma");
        member.setMemberDesignation("Manager (Cultural)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.shashwat_mishra);
        member.setMemberName("Shashwat Mishra");
        member.setMemberDesignation("Manager (Cultural)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.logo);
        member.setMemberName("Abhishek Chaudhary");
        member.setMemberDesignation("Manager (Decor)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.rakshita_gupta);
        member.setMemberName("Rakshita Gupta");
        member.setMemberDesignation("Manager (Cultural)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.rishabh_verma);
        member.setMemberName("Rishabh Verma");
        member.setMemberDesignation("Manager (Informals)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.akanksha_karnaal);
        member.setMemberName("Akansha Karnwal");
        member.setMemberDesignation("Manager (Informals)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.shobhit_singh);
        member.setMemberName("Shobhit Singh");
        member.setMemberDesignation("Manager (E-Gaming)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.vivek_pandey);
        member.setMemberName("Vivek Kumar Pandey");
        member.setMemberDesignation("Manager (E-Gaming)");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.sungadha_agarwal);
        member.setMemberName("Sugandha Agarwal");
        member.setMemberDesignation("Manager SA, Day 1");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.shubhashish_prakash);
        member.setMemberName("Shubhashish Prakash");
        member.setMemberDesignation("Manager SA, Day 2");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.harshit_rastogi);
        member.setMemberName("Harshit Kumar Rastogi");
        member.setMemberDesignation("Manager SA, Day 3");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.logo);
        member.setMemberName("Abhishek Chopra");
        member.setMemberDesignation("Manager WEB/App Designing");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.lakshya_deep);
        member.setMemberName("Lakshay Deep");
        member.setMemberDesignation("Manager WEB/App Designing");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.somesh_gupta);
        member.setMemberName("Somesh Gupta");
        member.setMemberDesignation("Manager WEB/App Designing");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.logo);
        member.setMemberName("Anurag Santhalia");
        member.setMemberDesignation("Manager Video & Poster Designing");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.divya_kshitij);
        member.setMemberName("Divya Kshitiz");
        member.setMemberDesignation("Manager Video & Poster Designing");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.himanshu_patel);
        member.setMemberName("Himanshu Patel");
        member.setMemberDesignation("Manager Registration");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.vaibhav_prasad);
        member.setMemberName("Vaibhav Prasad Singh");
        member.setMemberDesignation("Manager Registration");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.pranjal_mishra);
        member.setMemberName("Pranjal Mishra");
        member.setMemberDesignation("Manager Sponsorship");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.navneet_singh);
        member.setMemberName("Navneet singh Makan");
        member.setMemberDesignation("Manager Sponsorship");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.logo);
        member.setMemberName("Raja Badal");
        member.setMemberDesignation("Manager Sponsorship");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.amartya_singh);
        member.setMemberName("Amartya Veer Singh");
        member.setMemberDesignation("Manager Discipline");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.pragyan_singh);
        member.setMemberName("Pragyan Singh");
        member.setMemberDesignation("Manager Discipline");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.abhishek_gautam);
        member.setMemberName("Abhishek Gautam");
        member.setMemberDesignation("Manager Inventory");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.kshitij_saxena);
        member.setMemberName("Kshitiz Saxena");
        member.setMemberDesignation("Manager Promotions");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.adarsh_singh);
        member.setMemberName("Adarsh Singh");
        member.setMemberDesignation("Manager Promotions");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.logo);
        member.setMemberName("Vaibhav Sharma");
        member.setMemberDesignation("Manager Promotions");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.akash_chawla);
        member.setMemberName("Akash Chawla");
        member.setMemberDesignation("Purchase Officer");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.yash_nigam);
        member.setMemberName("Yash Nigam");
        member.setMemberDesignation("Manager Hospitality & Photography");
        memberList.add(member);

        member = new Member();
        member.setMemberImage(R.drawable.divyansh_tyagi);
        member.setMemberName("Divyansh Tyagi");
        member.setMemberDesignation("Manager Hospitality & Photography");
        memberList.add(member);

        return memberList;
    }
}
