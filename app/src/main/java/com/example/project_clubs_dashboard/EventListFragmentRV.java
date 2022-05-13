package com.example.project_clubs_dashboard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.ArrayList;

public class EventListFragmentRV extends Fragment {
    RecyclerView recyclerView;
    public ArrayList<clubEventListModel> clubEventList;
    EventListAdaptorClass eventListAdaptorClass;
    ImageView clubLogo_IV;
    ImageButton menuItemButtom;
    ArrayList<clubEventListModel> todayAL,upcomingAL,pastAL;
    private final static String DEBUG_TAG = "EventListFragmentRV";

    public EventListFragmentRV() {
        // Required empty public constructor
    }

    public static EventListFragmentRV newInstance(String param1, String param2) {
        EventListFragmentRV fragment = new EventListFragmentRV();
        Bundle args = new Bundle();
        //        args.putString(ARG_PARAM1, param1);
        //        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(DEBUG_TAG, "onCreate");


        //        if (getArguments() != null) {
        //            mParam1 = getArguments().getString(ARG_PARAM1);
        //            mParam2 = getArguments().getString(ARG_PARAM2);
        //        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i(DEBUG_TAG, "onCreateView");
        View view = inflater.inflate(R.layout.fragment_event_list_rv, container, false);
        clubLogo_IV = (ImageView) view.findViewById(R.id.clubLogoIV);
        clubLogo_IV.setImageResource(R.drawable.machaan);
        recyclerView = (RecyclerView) view.findViewById(R.id.eventListRV);
        menuItemButtom=(ImageButton)view.findViewById(R.id.menuButton);
        //        clubLogoIV.setImageDrawable();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        clubEventList = new ArrayList<>();
        Log.e(DEBUG_TAG, "Adding objects to a ArrayList ");

        todayAL=new ArrayList();
        upcomingAL=new ArrayList();
        pastAL=new ArrayList();

        menuItemButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(DEBUG_TAG, "showpopup");
                PopupMenu popupMenu = new PopupMenu(getContext(), view);
                popupMenu.getMenuInflater().inflate(R.menu.popmenu,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.todayEventItem:
                                for(int i=0;i<clubEventList.size();i++){
                                    if(clubEventList.get(i).getFilter()==1){
                                        todayAL.add(clubEventList.get(i));
                                    }
                                }
                                //                                Log.e(DEBUG_TAG, ""+todayAL.get(0).getEventName());
                                Log.e(DEBUG_TAG, "today");
                                Toast.makeText(getContext(), "today", Toast.LENGTH_SHORT).show();
                                eventListAdaptorClass=new EventListAdaptorClass(todayAL, getActivity());
                                recyclerView.setAdapter(eventListAdaptorClass);
                                return true;
                            case R.id.pastEventItem:
                                //                                ArrayList<clubEventListModel> pastAL=new ArrayList();
                                for(int i=0;i<clubEventList.size();i++){
                                    if(clubEventList.get(i).getFilter()==0){
                                        pastAL.add(clubEventList.get(i));
                                    }
                                }
                                //                                Log.e(DEBUG_TAG, ""+pastAL.get(0).getEventName());
                                Log.i(DEBUG_TAG, "past");
                                Toast.makeText(getContext(), "today", Toast.LENGTH_SHORT).show();
                                eventListAdaptorClass=new EventListAdaptorClass(pastAL, getActivity());
                                recyclerView.setAdapter(eventListAdaptorClass);
                                return true;
                            case R.id.upcomingEventItem:
                                Log.i(DEBUG_TAG, "clubEventList size "+clubEventList.size());
                                //                                ArrayList<clubEventListModel> upcomingAL=new ArrayList();
                                for(int i=0;i<clubEventList.size();i++){
                                    Log.e(DEBUG_TAG, "hello 10");
                                    if(clubEventList.get(i).getFilter()==2){
                                        Log.e(DEBUG_TAG, "hello");
                                        upcomingAL.add(clubEventList.get(i));
                                    }
                                }
                                Log.e(DEBUG_TAG, ""+upcomingAL.size());
                                Log.e(DEBUG_TAG, "upcoming");
                                Toast.makeText(getContext(), "today", Toast.LENGTH_SHORT).show();
                                eventListAdaptorClass=new EventListAdaptorClass(upcomingAL, getActivity());
                                recyclerView.setAdapter(eventListAdaptorClass);
                                return true;
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
        //        menuItemButtom.setOnClickListener(new View.OnClickListener() {
        //            @Override
        //            public void onClick(View view) {
        //                Log.e(DEBUG_TAG, "showpopup");
        //                PopupMenu popupMenu = new PopupMenu(getContext(), view);
        //                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
        //                    @Override
        //                    public boolean onMenuItemClick(MenuItem menuItem) {
        //                        return true;
        //                    }
        ////                popupMenu.inflate(R.menu.popmenu);
        ////                popupMenu.show();
        //            }
        //        });

        //
        //        filter=0(past),1(today),2(upcoming)
        clubEventListModel n0 = new clubEventListModel();
        n0.setEventName("Garba Night");
        n0.setEventDate("01");
        n0.setEventMonth("Apr");
        n0.setEventDesc("Lets Do Garba!!");
        n0.setFilter(0);
        clubEventList.add(n0);
        Log.e(DEBUG_TAG, "AAAAAAA added");

        clubEventListModel n1 = new clubEventListModel();
        n1.setEventName("Char-Acts");
        n1.setEventDate("30");
        n1.setEventMonth("May");
        n1.setFilter(2);
        n1.setEventDesc("Let's play holi!!");
        clubEventList.add(n1);
        Log.e(DEBUG_TAG, "BBBBBB added");

        clubEventListModel n2 = new clubEventListModel();
        n2.setEventName("Crit-Kat");
        n2.setEventDate("05");
        n2.setEventMonth("Jul");
        n2.setFilter(2);
        n2.setEventDesc("Let's play holi!!");
        clubEventList.add(n2);
        Log.e(DEBUG_TAG, "CCCCCC added");

        clubEventListModel n3 = new clubEventListModel();
        n3.setEventName("Act-O-Mania");
        n3.setEventDate("03");
        n3.setEventMonth("Jun");
        n3.setFilter(2);
        n3.setEventDesc("Let's play holi!!");
        clubEventList.add(n3);
        Log.e(DEBUG_TAG, "DDDDD added");
        //        Log.e(DEBUG_TAG, clubEventList.get(3).getEventName());

        clubEventListModel n4 = new clubEventListModel();
        n4.setEventName("...4");
        n4.setEventDate("14");
        n4.setEventMonth("May");
        n4.setFilter(1);
        n4.setEventDesc("Let's play holi!!4444444444");
        clubEventList.add(n4);
        Log.e(DEBUG_TAG, "4 added");

        clubEventListModel n5 = new clubEventListModel();
        n5.setEventName("5");
        n5.setEventDate("01");
        n5.setEventMonth("Apr");
        n5.setFilter(0);
        n5.setEventDesc("Let's play holi!!333333333333");
        clubEventList.add(n5);
        Log.e(DEBUG_TAG, "5 added");

        clubEventListModel n6 = new clubEventListModel();
        n6.setEventName("5");
        n6.setEventDate("01");
        n6.setEventMonth("Dec");
        n6.setFilter(2);
        n6.setEventDesc("Let's play holi!!");
        clubEventList.add(n6);
        Log.e(DEBUG_TAG, "6 added");

        clubEventListModel n7 = new clubEventListModel();
        n7.setEventName("5");
        n7.setEventDate("01");
        n7.setEventMonth("Mar");
        n7.setFilter(0);
        n7.setEventDesc("Let's play holi!!!");
        clubEventList.add(n7);
        Log.e(DEBUG_TAG, "7 added");

        clubEventListModel n8 = new clubEventListModel();
        n8.setEventName("5");
        n8.setEventDate("31");
        n8.setEventMonth("Dec");
        n8.setEventDesc("New Year Party");
        n8.setFilter(2);
        clubEventList.add(n8);
        Log.e(DEBUG_TAG, "8 added");

        clubEventListModel n9 = new clubEventListModel();
        n9.setEventName("5");
        n9.setEventDate("01");


        n9.setEventMonth("Feb");
        n9.setFilter(0);
        n9.setEventDesc("Let's play holi!!");
        clubEventList.add(n9);
        Log.e(DEBUG_TAG, "9 added");

        eventListAdaptorClass=new EventListAdaptorClass(clubEventList, getActivity());
        recyclerView.setAdapter(eventListAdaptorClass);
        return view;
    }

    //    public void ShowPopup(View view) {
    //
    //    }

}