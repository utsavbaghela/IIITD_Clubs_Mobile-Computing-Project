package com.example.project_clubs_dashboard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_clubs_dashboard.model.clubs;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link clubProfile#newInstance} factory method to
 * create an instance of this fragment.
 */
public class clubProfile extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private TextView clubName,clubSubTitle,clubDescription;
    private ImageView imgViewLogo;
    private clubs clickedClub;
    public clubProfile() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment clubProfile.
     */
    // TODO: Rename and change types and number of parameters
    public static clubProfile newInstance(String param1, String param2) {
        clubProfile fragment = new clubProfile();
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
            System.out.println("Inside on Create of CLUB PROFILE");
            clickedClub=(clubs) getArguments().getSerializable("clickedClubObj");
            System.out.println("Club obj "+clickedClub);
        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_club_profile, container, false);
        Button btn = (Button) v.findViewById(R.id.buttonshowevents);
        imgViewLogo = (ImageView) v.findViewById(R.id.logo);
        clubName = (TextView)v.findViewById(R.id.clubname);
        clubSubTitle = (TextView)v.findViewById(R.id.clubSubtitle);
        clubDescription = (TextView)v.findViewById(R.id.clubDescription);
        imgViewLogo.setImageBitmap(clickedClub.getImage_bm());
        clubName.setText(clickedClub.getName());
        clubSubTitle.setText(clickedClub.getSubTitle());
        clubDescription.setText(clickedClub.getDesc());


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), clubEventsActivity.class);
                startActivity(i3);
            }
        });
        // code for on click of insta icon
        ImageView instaimg = (ImageView)v.findViewById(R.id.instaLogo);
        if(clickedClub.getInstaUrl()==null)instaimg.setVisibility(View.GONE);
        instaimg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(clickedClub.getInstaUrl()));
                startActivity(intent);
            }
        });

        // code for on click of twitter icon
        ImageView webimg = (ImageView)v.findViewById(R.id.webLogo);
        System.out.println("Web Url is "+clickedClub.getTwitterUrl());
        if(clickedClub.getTwitterUrl()==null)webimg.setVisibility(View.GONE);
        webimg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(clickedClub.getTwitterUrl()));
                startActivity(intent);
            }
        });

        // code for on click of facebook icon
        ImageView fbimg = (ImageView)v.findViewById(R.id.facebookLogo);
        if(clickedClub.getFacebookUrl()==null)fbimg.setVisibility(View.GONE);
        fbimg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(clickedClub.getFacebookUrl()));
                startActivity(intent);
            }
        });


        return v;
    }


    public void showEventsList(View v)
    {
//        FragmentManager fragmentManagerButton=getSupportFragmentManager();
//        FragmentTransaction fragmentTransactionButton=fragmentManagerButton.beginTransaction();
//        EventListFragmentRV eventListFragmentRV=new EventListFragmentRV();
//        fragmentTransactionButton.replace(R.id.activityFrameLayout,eventListFragmentRV);
//        fragmentTransactionButton.commit();
    }
}