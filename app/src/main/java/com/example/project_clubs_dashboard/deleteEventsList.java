package com.example.project_clubs_dashboard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link deleteEventsList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class deleteEventsList extends Fragment {

    RecyclerView recyclerView;
    ArrayList<clubEventListModel> clubEventList;
    EventListAdaptorClass eventListAdaptorClass;
    ImageView clubLogo_IV;
    private final static String DEBUG_TAG="DeleteEventList";

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public deleteEventsList() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment deleteEventsList.
     */
    // TODO: Rename and change types and number of parameters
    public static deleteEventsList newInstance(String param1, String param2) {
        deleteEventsList fragment = new deleteEventsList();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_delete_events_list, container, false);

        clubLogo_IV=(ImageView) view.findViewById(R.id.clubLogoIV);
        clubLogo_IV.setImageResource(R.drawable.machaan);
        recyclerView=(RecyclerView) view.findViewById(R.id.eventListRV);
//        clubLogoIV.setImageDrawable();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        clubEventList=new ArrayList<>();
        Log.e(DEBUG_TAG, "Adding objects to a ArrayList ");

        clubEventListModel n0=new clubEventListModel();
        n0.setEventName("Garba Night");
        n0.setEventDate("01");
        n0.setEventMonth("Apr");
        n0.setEventDesc("Lets Do Garba!!");
        clubEventList.add(n0);
        Log.e(DEBUG_TAG, "AAAAAAA added");

        clubEventListModel n1=new clubEventListModel();
        n1.setEventName("Char-Acts");
        n1.setEventDate("30");
        n1.setEventMonth("May");
        n1.setEventDesc("Let's play holi!!");
        clubEventList.add(n1);
        Log.e(DEBUG_TAG, "BBBBBB added");

        clubEventListModel n2=new clubEventListModel();
        n2.setEventName("Crit-Kat");
        n2.setEventDate("05");
        n2.setEventMonth("Jul");
        n2.setEventDesc("Let's play holi!!");
        clubEventList.add(n2);
        Log.e(DEBUG_TAG, "CCCCCC added");

        clubEventListModel n3=new clubEventListModel();
        n3.setEventName("Act-O-Mania");
        n3.setEventDate("03");
        n3.setEventMonth("Jun");
        n3.setEventDesc("Let's play holi!!");
        clubEventList.add(n3);
        Log.e(DEBUG_TAG, "DDDDD added");
//        Log.e(DEBUG_TAG, clubEventList.get(3).getEventName());

        clubEventListModel n4=new clubEventListModel();
        n4.setEventName("...4");
        n4.setEventDate("02");
        n4.setEventMonth("Aug");
        n4.setEventDesc("Let's play holi!!4444444444");
        clubEventList.add(n4);
        Log.e(DEBUG_TAG, "4 added");

        clubEventListModel n5=new clubEventListModel();
        n5.setEventName("5");
        n5.setEventDate("01");
        n5.setEventMonth("Dec");
        n5.setEventDesc("Let's play holi!!333333333333");
        clubEventList.add(n5);
        Log.e(DEBUG_TAG, "5 added");

        clubEventListModel n6=new clubEventListModel();
        n6.setEventName("5");
        n6.setEventDate("01");
        n6.setEventMonth("Dec");
        n6.setEventDesc("Let's play holi!!");
        clubEventList.add(n6);
        Log.e(DEBUG_TAG, "6 added");

        clubEventListModel n7=new clubEventListModel();
        n7.setEventName("5");
        n7.setEventDate("01");
        n7.setEventMonth("Dec");
        n7.setEventDesc("Let's play holi!!111111111111");
        clubEventList.add(n7);
        Log.e(DEBUG_TAG, "7 added");

        clubEventListModel n8=new clubEventListModel();
        n8.setEventName("5");
        n8.setEventDate("01");
        n8.setEventMonth("Dec");
        n8.setEventDesc("AAAA");
        clubEventList.add(n8);
        Log.e(DEBUG_TAG, "8 added");

        clubEventListModel n9=new clubEventListModel();
        n9.setEventName("5");
        n9.setEventDate("01");
        n9.setEventMonth("Dec");
        n9.setEventDesc("Let's play holi!!22222222222222222");
        clubEventList.add(n9);
        Log.e(DEBUG_TAG, "9 added");

        recyclerView.setAdapter(new EventListAdaptorClass(clubEventList, getActivity()));

        return view;
    }
}