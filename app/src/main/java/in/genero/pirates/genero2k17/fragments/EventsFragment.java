package in.genero.pirates.genero2k17.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;
import com.gigamole.infinitecycleviewpager.OnInfiniteCyclePageTransformListener;

import java.util.ArrayList;

import butterknife.BindView;
import in.genero.pirates.genero2k17.R;
import in.genero.pirates.genero2k17.activity.EventDetailActivity;
import in.genero.pirates.genero2k17.adapters.EventsPagerAdapter;
import in.genero.pirates.genero2k17.models.Event;
import in.genero.pirates.genero2k17.models.EventDetail;

/**
 * Created by Sasuke on 10/3/2017.
 */

public class EventsFragment extends BaseFragment {

    @BindView(R.id.hicvp)
    HorizontalInfiniteCycleViewPager horizontalInfiniteCycleViewPager;
    private ArrayList<Event> mList;

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_events;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        horizontalInfiniteCycleViewPager.setAdapter(new EventsPagerAdapter(getContext(), getEventList()));
        mList = getEventList();
        horizontalInfiniteCycleViewPager.setOnInfiniteCyclePageTransformListener(new OnInfiniteCyclePageTransformListener() {
            @Override
            public void onPreTransform(View page, final float position) {
                page.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(EventDetailActivity.newIntent(getActivity(), mList.get(horizontalInfiniteCycleViewPager.getRealItem())));
                    }
                });
            }

            @Override
            public void onPostTransform(View page, float position) {

            }
        });
    }

    public static EventsFragment newInstance() {
        return new EventsFragment();
    }

    private ArrayList<Event> getEventList() {
        ArrayList<Event> list = new ArrayList<>();
        Event event = new Event();

        ArrayList<EventDetail> eventDetailsList = new ArrayList<>();
        EventDetail eventDetail = new EventDetail();

        // ** TECH CS **
        event.setImage(R.drawable.tech_cs);
        event.setClubName(getResources().getString(R.string.techcs));


        //DUEL FREAKS
        eventDetail.setEvevtName(getResources().getString(R.string.duel_freaks));
        eventDetail.setEventDescription(getResources().getString(R.string.duel_freaks_description));
        eventDetail.setEventDuration(getResources().getString(R.string.duel_freaks_duration));
        eventDetail.setEventType(getResources().getString(R.string.duel_freaks_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.duel_freaks_rules));
        eventDetailsList.add(eventDetail);

        //GLOBAL OPTIMAL
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.global_optimal));
        eventDetail.setEventDescription(getResources().getString(R.string.global_optimal_description));
        eventDetail.setEventDuration(getResources().getString(R.string.global_optimal_duration));
        eventDetail.setEventType(getResources().getString(R.string.global_optimal_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.global_optimal_rules));
        eventDetailsList.add(eventDetail);

        //SHUT THE BUG UP
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.shut_the_bug));
        eventDetail.setEventDescription(getResources().getString(R.string.shut_the_bug_description));
        eventDetail.setEventDuration(getResources().getString(R.string.shut_the_bug_duration));
        eventDetail.setEventRules(getResources().getString(R.string.shut_the_bug_rules));
        eventDetail.setEventType(getResources().getString(R.string.shut_the_bug_event_type));
        eventDetailsList.add(eventDetail);

        //NO LEISURE FOR LINGUISTICS
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.no_leisure));
        eventDetail.setEventRules(getResources().getString(R.string.no_leisure_rules));
        eventDetail.setEventDescription(getResources().getString(R.string.no_leisure_description));
        eventDetail.setEventDuration(getResources().getString(R.string.no_leisure_duration));
        eventDetail.setEventType(getResources().getString(R.string.no_leisure_event_type));
        eventDetailsList.add(eventDetail);

        //SIMPLY WEBLOGICAL
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.simply_weblogical));
        eventDetail.setEventDescription(getResources().getString(R.string.simply_weblogical_description));
        eventDetail.setEventDuration(getResources().getString(R.string.simply_weblogical_duration));
        eventDetail.setEventRules(getResources().getString(R.string.simply_weblogical_rules));
        eventDetail.setEventType(getResources().getString(R.string.simply_weblogical_event_type));
        eventDetailsList.add(eventDetail);

        //HACK TREC
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.hack_trec));
        eventDetail.setEventDescription(getResources().getString(R.string.hack_trec_description));
        eventDetail.setEventDuration(getResources().getString(R.string.hack_trec_duration));
        eventDetail.setEventType(getResources().getString(R.string.hack_trec_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.hack_trec_rules));
        eventDetailsList.add(eventDetail);

        //AL-KHWARIZMI PROGRAMMING EVENT
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.al_khwarizmi));
        eventDetail.setEventDescription(getResources().getString(R.string.al_khwarizmi_description));
        eventDetail.setEventDuration(getResources().getString(R.string.al_khwarizmi_duration));
        eventDetail.setEventRules(getResources().getString(R.string.al_khwarizmi_rules));
        eventDetail.setEventType(getResources().getString(R.string.al_khwarizmi_event_type));
        eventDetailsList.add(eventDetail);

        event.setEventDetails(eventDetailsList);
        list.add(event);

        // ** TECH ME **
        event = new Event();
        eventDetail = new EventDetail();
        eventDetailsList = new ArrayList<>();

        event.setImage(R.drawable.tech_me);
        event.setClubName(getResources().getString(R.string.techme));


        //LATHE WAR
        eventDetail.setEvevtName(getResources().getString(R.string.lathe_war));
        eventDetail.setEventDescription(getResources().getString(R.string.lathe_war_description));
        eventDetail.setEventDuration(getResources().getString(R.string.lathe_war_duration));
        eventDetail.setEventType(getResources().getString(R.string.lathe_war_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.lathe_war_rules));
        eventDetailsList.add(eventDetail);

        //PIRATES BATTLE
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.pirates_battle));
        eventDetail.setEventDescription(getResources().getString(R.string.pirates_battle_description));
        eventDetail.setEventDuration(getResources().getString(R.string.pirates_battle_duration));
        eventDetail.setEventType(getResources().getString(R.string.pirates_battle_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.pirates_battle_rules));
        eventDetailsList.add(eventDetail);

        //MODELLING
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.modelling));
        eventDetail.setEventDescription(getResources().getString(R.string.modelling_description));
        eventDetail.setEventDuration(getResources().getString(R.string.modelling_duration));
        eventDetail.setEventType(getResources().getString(R.string.modelling_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.modelling_rules));
        eventDetailsList.add(eventDetail);

        //ROAD RASH
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.road_rash));
        eventDetail.setEventDescription(getResources().getString(R.string.road_rash_description));
        eventDetail.setEventDuration(getResources().getString(R.string.road_rash_duration));
        eventDetail.setEventType(getResources().getString(R.string.road_rash_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.road_rash_rules));
        eventDetailsList.add(eventDetail);

        //WATER ROCKET
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.water_rocket));
        eventDetail.setEventDescription(getResources().getString(R.string.rwater_rocket_description));
        eventDetail.setEventDuration(getResources().getString(R.string.water_rocket_duration));
        eventDetail.setEventType(getResources().getString(R.string.water_rocket_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.water_rocket_rules));
        eventDetailsList.add(eventDetail);

        //AUTOMOBILE QUIZ
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.automobile_quiz));
        eventDetail.setEventDescription(getResources().getString(R.string.automobile_quiz_description));
        eventDetail.setEventDuration(getResources().getString(R.string.automobile_quiz_duration));
        eventDetail.setEventType(getResources().getString(R.string.automobile_quiz_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.automobile_quiz_rules));
        eventDetailsList.add(eventDetail);


        event.setEventDetails(eventDetailsList);
        list.add(event);

        // ** TECH CE **
        event = new Event();
        eventDetail = new EventDetail();
        eventDetailsList = new ArrayList<>();

        event.setImage(R.drawable.tech_ce);
        event.setClubName(getResources().getString(R.string.techce));


        //BOB THE BUILDER
        eventDetail.setEvevtName(getResources().getString(R.string.bob_the_builder));
        eventDetail.setEventDescription(getResources().getString(R.string.bob_the_builder_description));
        eventDetail.setEventDuration(getResources().getString(R.string.bob_the_builder_duration));
        eventDetail.setEventType(getResources().getString(R.string.bob_the_builder_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.bob_the_builder_rules));
        eventDetailsList.add(eventDetail);

        //CARTES
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.cartes));
        eventDetail.setEventDescription(getResources().getString(R.string.cartes_description));
        eventDetail.setEventDuration(getResources().getString(R.string.cartes_duration));
        eventDetail.setEventType(getResources().getString(R.string.cartes_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.cartes_rules));
        eventDetailsList.add(eventDetail);

        //CADD-O-MANIA
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.cadd_mania));
        eventDetail.setEventDescription(getResources().getString(R.string.cadd_mania_description));
        eventDetail.setEventDuration(getResources().getString(R.string.cadd_mania_duration));
        eventDetail.setEventType(getResources().getString(R.string.cadd_mania_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.cadd_mania_rules));
        eventDetailsList.add(eventDetail);

        //FLOATING CONCRETE
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.floating_concrete));
        eventDetail.setEventDescription(getResources().getString(R.string.floating_concrete_description));
        eventDetail.setEventDuration(getResources().getString(R.string.floating_concrete_duration));
        eventDetail.setEventType(getResources().getString(R.string.floating_concrete_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.floating_concrete_rules));
        eventDetailsList.add(eventDetail);

        //SNAPSHOT
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.snapshot));
        eventDetail.setEventDescription(getResources().getString(R.string.snapshot_description));
        eventDetail.setEventDuration(getResources().getString(R.string.snapshot_duration));
        eventDetail.setEventType(getResources().getString(R.string.snapshot_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.snapshot_rules));
        eventDetailsList.add(eventDetail);

        //ROLLER COASTER
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.roller_coaster));
        eventDetail.setEventDescription(getResources().getString(R.string.roller_coaster_description));
        eventDetail.setEventDuration(getResources().getString(R.string.sroller_coaster_duration));
        eventDetail.setEventType(getResources().getString(R.string.roller_coaster_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.roller_coaster_rules));
        eventDetailsList.add(eventDetail);


        event.setEventDetails(eventDetailsList);
        list.add(event);

        // ** TECH EE **
        event = new Event();
        eventDetail = new EventDetail();
        eventDetailsList = new ArrayList<>();

        event.setImage(R.drawable.tech_ee);
        event.setClubName(getResources().getString(R.string.techee));


        //DIGITAL QUIZ
        eventDetail.setEvevtName(getResources().getString(R.string.digi_quiz));
        eventDetail.setEventDescription(getResources().getString(R.string.digi_quiz_description));
        eventDetail.setEventDuration(getResources().getString(R.string.digi_quiz_duration));
        eventDetail.setEventType(getResources().getString(R.string.digi_quiz_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.digi_quiz_rules));
        eventDetailsList.add(eventDetail);

        //LINE FOLLOWER
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.line_follower));
        eventDetail.setEventDescription(getResources().getString(R.string.line_follower_description));
        eventDetail.setEventDuration(getResources().getString(R.string.line_follower_duration));
        eventDetail.setEventType(getResources().getString(R.string.line_follower_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.line_follower_rules));
        eventDetailsList.add(eventDetail);

        //MINI ROBO
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.mini_robo));
        eventDetail.setEventDescription(getResources().getString(R.string.mini_robo_description));
        eventDetail.setEventDuration(getResources().getString(R.string.mini_robo_duration));
        eventDetail.setEventType(getResources().getString(R.string.mini_robo_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.mini_robo_rules));
        eventDetailsList.add(eventDetail);

        //RACE
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.race));
        eventDetail.setEventDescription(getResources().getString(R.string.race_description));
        eventDetail.setEventDuration(getResources().getString(R.string.race_duration));
        eventDetail.setEventType(getResources().getString(R.string.race_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.race_rules));
        eventDetailsList.add(eventDetail);

        //SOCCER
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.soccer));
        eventDetail.setEventDescription(getResources().getString(R.string.soccer_description));
        eventDetail.setEventDuration(getResources().getString(R.string.soccer_duration));
        eventDetail.setEventType(getResources().getString(R.string.soccer_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.soccer_rules));
        eventDetailsList.add(eventDetail);

        //SUMO WAR
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.sumo_war));
        eventDetail.setEventDescription(getResources().getString(R.string.sumo_war_description));
        eventDetail.setEventDuration(getResources().getString(R.string.sumo_war_duration));
        eventDetail.setEventType(getResources().getString(R.string.sumo_war_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.sumo_war_rules));
        eventDetailsList.add(eventDetail);

        //ROBO WAR
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.robo_war));
        eventDetail.setEventDescription(getResources().getString(R.string.robo_war_description));
        eventDetail.setEventDuration(getResources().getString(R.string.robo_war_duration));
        eventDetail.setEventType(getResources().getString(R.string.robo_war_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.robo_war_rules));
        eventDetailsList.add(eventDetail);


        event.setEventDetails(eventDetailsList);
        list.add(event);

        // ** eGaming **
        event = new Event();
        eventDetail = new EventDetail();
        eventDetailsList = new ArrayList<>();

        event.setImage(R.drawable.egaming);
        event.setClubName(getResources().getString(R.string.egaming));


        //CALL OF DUTY
        eventDetail.setEvevtName(getResources().getString(R.string.cod));
        eventDetail.setEventDescription(getResources().getString(R.string.cod_description));
        eventDetail.setEventDuration(getResources().getString(R.string.cod_duration));
        eventDetail.setEventType(getResources().getString(R.string.cod_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.cod_rules));
        eventDetailsList.add(eventDetail);

        //CRICKET
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.cricket));
        eventDetail.setEventDescription(getResources().getString(R.string.cricket_description));
        eventDetail.setEventDuration(getResources().getString(R.string.cricket_duration));
        eventDetail.setEventType(getResources().getString(R.string.cricket_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.cricket_rules));
        eventDetailsList.add(eventDetail);

        //COUNTER STRIKE
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.cs));
        eventDetail.setEventDescription(getResources().getString(R.string.cs_description));
        eventDetail.setEventDuration(getResources().getString(R.string.cs_duration));
        eventDetail.setEventType(getResources().getString(R.string.cs_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.cs_rules));
        eventDetailsList.add(eventDetail);

        //FIFA
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.fifa));
        eventDetail.setEventDescription(getResources().getString(R.string.fifa_description));
        eventDetail.setEventDuration(getResources().getString(R.string.fifa_duration));
        eventDetail.setEventType(getResources().getString(R.string.fifa_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.fifa_rules));
        eventDetailsList.add(eventDetail);

        //MINI MILITIA
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.mini_militia));
        eventDetail.setEventDescription(getResources().getString(R.string.mini_militia_description));
        eventDetail.setEventDuration(getResources().getString(R.string.mini_militia_duration));
        eventDetail.setEventType(getResources().getString(R.string.mini_militia_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.mini_militia_rules));
        eventDetailsList.add(eventDetail);

        //TEKKEN 3
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.tekken));
        eventDetail.setEventDescription(getResources().getString(R.string.tekken_description));
        eventDetail.setEventDuration(getResources().getString(R.string.tekken_duration));
        eventDetail.setEventType(getResources().getString(R.string.tekken_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.tekken_rules));
        eventDetailsList.add(eventDetail);

        //NEED FOR SPEED
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.nfs));
        eventDetail.setEventDescription(getResources().getString(R.string.nfs_description));
        eventDetail.setEventDuration(getResources().getString(R.string.nfs_duration));
        eventDetail.setEventType(getResources().getString(R.string.nfs_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.nfs_rules));
        eventDetailsList.add(eventDetail);


        event.setEventDetails(eventDetailsList);
        list.add(event);

        // ** LITERARY **
        event = new Event();
        eventDetail = new EventDetail();
        eventDetailsList = new ArrayList<>();

        event.setImage(R.drawable.literary);
        event.setClubName(getResources().getString(R.string.literary));


        //BILINGUAL DEBATE
        eventDetail.setEvevtName(getResources().getString(R.string.bili_debate));
        eventDetail.setEventDescription(getResources().getString(R.string.bili_debate_description));
        eventDetail.setEventDuration(getResources().getString(R.string.bili_debate_duration));
        eventDetail.setEventType(getResources().getString(R.string.bili_debate_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.bili_debate_rules));
        eventDetailsList.add(eventDetail);

        //QUIZ
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.quiz));
        eventDetail.setEventDescription(getResources().getString(R.string.quiz_description));
        eventDetail.setEventDuration(getResources().getString(R.string.quiz_duration));
        eventDetail.setEventType(getResources().getString(R.string.quiz_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.quiz_rules));
        eventDetailsList.add(eventDetail);

        //CREATIVE WRITING
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.creative_writing));
        eventDetail.setEventDescription(getResources().getString(R.string.creative_writing_description));
        eventDetail.setEventDuration(getResources().getString(R.string.creative_writing_duration));
        eventDetail.setEventType(getResources().getString(R.string.creative_writinge_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.creative_writing_rules));
        eventDetailsList.add(eventDetail);

        //JUST A MINUTE (JAM)
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.jam));
        eventDetail.setEventDescription(getResources().getString(R.string.jam_description));
        eventDetail.setEventDuration(getResources().getString(R.string.jam_duration));
        eventDetail.setEventType(getResources().getString(R.string.jam_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.jam_rules));
        eventDetailsList.add(eventDetail);

        //TREASURE HUNT
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.treasure_hunt));
        eventDetail.setEventDescription(getResources().getString(R.string.treasure_hunt_description));
        eventDetail.setEventDuration(getResources().getString(R.string.treasure_hunt_duration));
        eventDetail.setEventType(getResources().getString(R.string.treasure_hunt_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.treasure_hunt_rules));
        eventDetailsList.add(eventDetail);

        //YOUTH PARLIAMENT
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.youth_parliamant));
        eventDetail.setEventDescription(getResources().getString(R.string.youth_parliamant_description));
        eventDetail.setEventDuration(getResources().getString(R.string.youth_parliamant_duration));
        eventDetail.setEventType(getResources().getString(R.string.youth_parliamant_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.youth_parliamant_rules));
        eventDetailsList.add(eventDetail);


        event.setEventDetails(eventDetailsList);
        list.add(event);

        // ** CULTURAL **
        event = new Event();
        eventDetail = new EventDetail();
        eventDetailsList = new ArrayList<>();

        event.setImage(R.drawable.cultural);
        event.setClubName(getResources().getString(R.string.cultural));


        //SOLO DANCE
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.solo_dance));
        eventDetail.setEventDescription(getResources().getString(R.string.solo_dance_description));
        eventDetail.setEventDuration(getResources().getString(R.string.solo_dance_duration));
        eventDetail.setEventType(getResources().getString(R.string.solo_dance_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.solo_dance_rules));
        eventDetailsList.add(eventDetail);

        //SUPER SINGER
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.super_singer));
        eventDetail.setEventDescription(getResources().getString(R.string.super_singer_description));
        eventDetail.setEventDuration(getResources().getString(R.string.super_singer_duration));
        eventDetail.setEventType(getResources().getString(R.string.super_singer_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.super_singer_rules));
        eventDetailsList.add(eventDetail);

        //NRITYA SHAKTI
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.nritya_shakti));
        eventDetail.setEventDescription(getResources().getString(R.string.nritya_shakti_duration));
        eventDetail.setEventDuration(getResources().getString(R.string.nritya_shakti_duration));
        eventDetail.setEventType(getResources().getString(R.string.nritya_shakti_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.nritya_shakti_rules));
        eventDetailsList.add(eventDetail);

        //BEAT THE BEATS (FACE OFF)
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.beat_beats));
        eventDetail.setEventDescription(getResources().getString(R.string.beat_beats_description));
        eventDetail.setEventDuration(getResources().getString(R.string.beat_beats_duration));
        eventDetail.setEventType(getResources().getString(R.string.beat_beats_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.beat_beats_rules));
        eventDetailsList.add(eventDetail);

        //FASHION SHOW
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.fashion_show));
        eventDetail.setEventDescription(getResources().getString(R.string.fashion_show_description));
        eventDetail.setEventDuration(getResources().getString(R.string.fashion_show_duration));
        eventDetail.setEventType(getResources().getString(R.string.fashion_show_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.fashion_show_rules));
        eventDetailsList.add(eventDetail);

        //NUKKAD NATAK
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.nukkad_natak));
        eventDetail.setEventDescription(getResources().getString(R.string.snukkad_natak_description));
        eventDetail.setEventDuration(getResources().getString(R.string.nukkad_natak_duration));
        eventDetail.setEventType(getResources().getString(R.string.nukkad_natak_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.snukkad_natak_rules));
        eventDetailsList.add(eventDetail);


        event.setEventDetails(eventDetailsList);
        list.add(event);

        // ** INFORMALS **
        event = new Event();
        eventDetail = new EventDetail();
        eventDetailsList = new ArrayList<>();

        event.setImage(R.drawable.informals);
        event.setClubName(getResources().getString(R.string.informals));


        //DALAL STREET
        eventDetail.setEvevtName(getResources().getString(R.string.dalal_street));
        eventDetail.setEventDescription(getResources().getString(R.string.dalal_street_description));
        eventDetail.setEventDuration(getResources().getString(R.string.dalal_street_duration));
        eventDetail.setEventType(getResources().getString(R.string.dalal_street_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.dalal_street_rules));
        eventDetailsList.add(eventDetail);

        //TAMBOLA
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.tambola));
        eventDetail.setEventDescription(getResources().getString(R.string.tambola_description));
        eventDetail.setEventDuration(getResources().getString(R.string.tambola_duration));
        eventDetail.setEventType(getResources().getString(R.string.tambola_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.tambola_rules));
        eventDetailsList.add(eventDetail);

        //TUG OF WAR
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.tug_of_war));
        eventDetail.setEventDescription(getResources().getString(R.string.tug_of_war_description));
        eventDetail.setEventDuration(getResources().getString(R.string.ttug_of_war_duration));
        eventDetail.setEventType(getResources().getString(R.string.tug_of_wara_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.tug_of_war_rules));
        eventDetailsList.add(eventDetail);

        //MOCK CID
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.mock_cid));
        eventDetail.setEventDescription(getResources().getString(R.string.mock_cid_description));
        eventDetail.setEventDuration(getResources().getString(R.string.mock_cid_duration));
        eventDetail.setEventType(getResources().getString(R.string.mock_cid_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.mock_cid_rules));
        eventDetailsList.add(eventDetail);

        //SKETCHING
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.sketching));
        eventDetail.setEventDescription(getResources().getString(R.string.sketching_description));
        eventDetail.setEventDuration(getResources().getString(R.string.sketching_duration));
        eventDetail.setEventType(getResources().getString(R.string.sketching_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.sketching_rules));
        eventDetailsList.add(eventDetail);

        //MINUTE TO WIN IT
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.minute_to_win_it));
        eventDetail.setEventDescription(getResources().getString(R.string.minute_to_win_it_description));
        eventDetail.setEventDuration(getResources().getString(R.string.minute_to_win_it_duration));
        eventDetail.setEventType(getResources().getString(R.string.minute_to_win_it_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.minute_to_win_it_rules));
        eventDetailsList.add(eventDetail);

        //ROADIES
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.roadies));
        eventDetail.setEventDescription(getResources().getString(R.string.roadies_description));
        eventDetail.setEventDuration(getResources().getString(R.string.roadies_duration));
        eventDetail.setEventType(getResources().getString(R.string.roadies_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.roadies_rules));
        eventDetailsList.add(eventDetail);

        //NEWSPAPER DANCE
        eventDetail = new EventDetail();
        eventDetail.setEvevtName(getResources().getString(R.string.newspaper_dance));
        eventDetail.setEventDescription(getResources().getString(R.string.newspaper_dance_description));
        eventDetail.setEventDuration(getResources().getString(R.string.newspaper_dance_duration));
        eventDetail.setEventType(getResources().getString(R.string.newspaper_dance_event_type));
        eventDetail.setEventRules(getResources().getString(R.string.newspaper_dance_rules));
        eventDetailsList.add(eventDetail);

        event.setEventDetails(eventDetailsList);
        list.add(event);

        return list;
    }
}
