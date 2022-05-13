package com.example.project_clubs_dashboard;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_clubs_dashboard.controller.adaptorClubsList;
import com.example.project_clubs_dashboard.model.clubs;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Clubs_Rec_View_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Clubs_Rec_View_Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Clubs_Rec_View_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Clubs_Rec_View_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Clubs_Rec_View_Fragment newInstance(String param1, String param2) {
        Clubs_Rec_View_Fragment fragment = new Clubs_Rec_View_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        System.out.println("Inside fragment");
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    public  static RecyclerView recyclerView;
    public  LinearLayoutManager linearLayoutManager;
    public  GridLayoutManager gridLayoutManager;
    public static List<clubs> ClubsList;
    public static adaptorClubsList adaptorClubsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        System.out.println("Inside fragment View");
        View v =  inflater.inflate(R.layout.fragment_clubs__rec__view_, container, false);
        recyclerView = v.findViewById(R.id.rec_view_id);
        //linearLayoutManager=new LinearLayoutManager(getContext());
        ClubsList=new ArrayList<>();
        //linearLayoutManager.setOrientation(RecyclerView.VERTICAL);


        GridLayoutManager layoutManager=new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);

        //recyclerView.setLayoutManager(linearLayoutManager);
        clubs club_obj1= new clubs();
        clubs club_obj2= new clubs();
        clubs club_obj3= new clubs();
        clubs club_obj4= new clubs();
        clubs club_obj5= new clubs();
        clubs club_obj6= new clubs();
        clubs club_obj7= new clubs();
        clubs club_obj8= new clubs();
        clubs club_obj9= new clubs();
        clubs club_obj10= new clubs();
        clubs club_obj11= new clubs();
        clubs club_obj12= new clubs();
        clubs club_obj13= new clubs();
        clubs club_obj14= new clubs();
        clubs club_obj15= new clubs();
        clubs club_obj16= new clubs();

        Bitmap image1 = BitmapFactory.decodeResource(v.getResources(), R.drawable.acm);
        Bitmap image2 = BitmapFactory.decodeResource(v.getResources(), R.drawable.astronuts);
        Bitmap image3 = BitmapFactory.decodeResource(v.getResources(), R.drawable.audiobytes);
        Bitmap image4 = BitmapFactory.decodeResource(v.getResources(), R.drawable.biobytes);
        Bitmap image5 = BitmapFactory.decodeResource(v.getResources(), R.drawable.designhub);
        Bitmap image6 = BitmapFactory.decodeResource(v.getResources(), R.drawable.enactus);
        Bitmap image7 = BitmapFactory.decodeResource(v.getResources(), R.drawable.finnexia);
        Bitmap image8 = BitmapFactory.decodeResource(v.getResources(), R.drawable.foobar);
        Bitmap image9 = BitmapFactory.decodeResource(v.getResources(), R.drawable.machaan);
        Bitmap image10 = BitmapFactory.decodeResource(v.getResources(), R.drawable.madtoes);
        Bitmap image11 = BitmapFactory.decodeResource(v.getResources(), R.drawable.micdrop);
        Bitmap image12= BitmapFactory.decodeResource(v.getResources(), R.drawable.muse);
        Bitmap image13= BitmapFactory.decodeResource(v.getResources(), R.drawable.philosoc);
        Bitmap image14= BitmapFactory.decodeResource(v.getResources(), R.drawable.saltnpepper);
        Bitmap image15 = BitmapFactory.decodeResource(v.getResources(), R.drawable.tasveer);
        Bitmap image16 = BitmapFactory.decodeResource(v.getResources(), R.drawable.womenintech);

        club_obj1.setName("ACM");
        club_obj1.setImage_bm(image1);
        club_obj1.setSubTitle("IIIT-D Student Chapter");
        club_obj1.setDesc("At the IIIT-Delhi student chapter of ACM, we believe in developing an active and extensive platform where students can gain global exposure to a range of ideas and knowledge that the field of computing has offered. We majorly focus on the following objectives :- -Working towards advancing computing as a science and a profession -Serving as a dynamic hub of activities for the computing fraternity of IIIT Delhi -Providing students a platform where they are exposed to a plethora of ideas, knowledge, and trends in computing -Uniting educators, researchers, students, and professionals to inspire dialogue, share resources, and address the field’s challenges.");
        club_obj1.setTwitterUrl("https://acm.iiitd.edu.in/");
        club_obj1.setFacebookUrl("https://m.facebook.com/acmiiitd/");
        club_obj1.setInstaUrl("https://www.instagram.com/accounts/login/?next=/acmiiitd/");


        club_obj2.setName("Astronuts");
        club_obj2.setImage_bm(image2);
        club_obj2.setSubTitle("Look above the Sky");
        club_obj2.setDesc("Astronuts is the astronomy club of IIIT Delhi. We aim to enrich the astronomy culture on our campus and provide a home to all fellow students who love space and the stars. We regularly conduct watch parties for interesting celestial events, and trips and other astronomy related events.");
        club_obj2.setInstaUrl("https://www.instagram.com/accounts/login/?next=/astronuts_iiitd/");
        club_obj2.setTwitterUrl("https://astronuts.iiitd.edu.in/");

        club_obj3.setName("AudioBytes");
        club_obj3.setImage_bm(image3);
        club_obj3.setSubTitle("Sing Along");
        club_obj3.setDesc("Audiobytes is the music society of IIIT Delhi. We seek to increase the music culture among the students at our college by organizing vocal and instrumental events, and encourage the music enthusiasts to take part in inter-college competitions for the betterment of the individuals as musicians.");
        club_obj3.setInstaUrl("https://www.instagram.com/accounts/login/?next=/audiobytesiiitd/");

        club_obj4.setName("BioBytes");
        club_obj4.setImage_bm(image4);
        club_obj4.setSubTitle("Computation in Biology");
        club_obj4.setDesc("BioBytes aims to promote and work in computational biology and data science by providing guidance and experience towards solving biology/healthcare-related challenges using various elements of data science.");
        club_obj4.setInstaUrl("https://www.instagram.com/accounts/login/?next=/biobytesiiitd/");
        club_obj4.setFacebookUrl("https://www.facebook.com/biobytes.iiitd");
        club_obj4.setTwitterUrl("https://biobytes.iiitd.edu.in/");

        club_obj5.setName("Design Hub");
        club_obj5.setImage_bm(image5);
        club_obj5.setSubTitle("Budding Prod Designers");
        club_obj5.setDesc("DesignHub is a design club and an open community that aims at providing professional exposure to budding product designers. We aim to develop a healthy design culture at IIIT Delhi.");
        club_obj5.setInstaUrl("https://www.instagram.com/accounts/login/?next=/designhub.iiitd/");

        club_obj6.setName("Enactus");
        club_obj6.setImage_bm(image6);
        club_obj6.setSubTitle("Enactus IIITD");
        club_obj6.setDesc("Enactus IIITD is a student chapter in the global network of Enactus teams. Enactus is an international nonprofit, and as part of it, we work on social entrepreneurship projects to create a positive impact on the world. At Enactus IIITD, we currently have two projects: Well-Being Adda and Hidayat. Well-Being Adda aims to promote mental health and holistic well-being by raising awareness, creating solutions to make emotional support and therapy more accessible and building a supportive community. Hidayat aims to provide career guidance, close the digital divide and create employment opportunities for the underserved");
        club_obj6.setInstaUrl("https://www.instagram.com/accounts/login/?next=/enactusiiitdelhi/");
        club_obj6.setFacebookUrl("https://www.facebook.com/enactusIIITD/");
        club_obj6.setTwitterUrl("http://enactus.iiitd.edu.in/");

        club_obj7.setName("Finnexia");
        club_obj7.setImage_bm(image7);
        club_obj7.setSubTitle("Finance Club of IIITD");
        club_obj7.setDesc("The Finance Club of IIITD is a student-driven initiative for fostering a culture for Finance among its students. It was established with the purpose of enhancing the financial knowledge of students through various events, activities, workshops and knowledge sharing sessions.");
        club_obj7.setInstaUrl("https://www.instagram.com/accounts/login/?next=/finnexia.iiitd/");
        club_obj7.setTwitterUrl("https://finnexia.iiitd.edu.in/");

        club_obj8.setName("Foobar");
        club_obj8.setImage_bm(image8);
        club_obj8.setSubTitle("Code Code Code!!!");
        club_obj8.setDesc("The aim of FooBar is to encourage Competitive Programming at our college and develop a very active culture of CP, where everyone can learn from each other. To achieve this, we organize regular events like CodeClasses and ProSorts.");
        club_obj8.setFacebookUrl("https://www.facebook.com/iiitdfoobar");
        club_obj8.setTwitterUrl("http://foobar.iiitd.edu.in/");

        club_obj9.setName("Machaan");
        club_obj9.setImage_bm(image9);
        club_obj9.setSubTitle("Machaate Raho!!");
        club_obj9.setDesc("Machaan is a place where theater aficioanados meet. We at Machaan believe that drama is an art which only a few possess but has a tremendous power of changing the society, it is a constructive force which when used right, can do wonders! We conduct theater and street plays along with drama workshops and aim to make the life here at IIIT-D stress-free.");
        club_obj9.setInstaUrl("https://www.instagram.com/accounts/login/?next=/machaan_iiitd/");
        club_obj9.setFacebookUrl("https://www.facebook.com/CreativeTim/");
        club_obj9.setTwitterUrl("https://dribbble.com/creativetim");

        club_obj10.setName("MadToes");
        club_obj10.setImage_bm(image10);
        club_obj10.setSubTitle("Dance your heart out!");
        club_obj10.setDesc("MadToes is the Dance society of IIIT Delhi. Great dancers are not just great because of their techniques, they are great because of their passion! Our club MadToes nourishes the same.");
        club_obj10.setInstaUrl("https://www.instagram.com/accounts/login/?next=/madtoes_iiitd/");
        club_obj10.setFacebookUrl("https://www.facebook.com/madtoesdance/");
        club_obj10.setTwitterUrl("http://madtoes.iiitd.edu.in/");

        club_obj11.setName("Mic Drop");
        club_obj11.setImage_bm(image11);
        club_obj11.setSubTitle("Laugh out Loud!");
        club_obj11.setDesc("MicDrop is the club which appreciates and enhances the humour. We organize events like Stand-up , Make me laugh , Witty questions and many more which gives the students of IIITD to grow in field of comedy along with academics.");
        club_obj11.setInstaUrl("https://www.instagram.com/accounts/login/?next=/mic_drop.iiitd/");


        club_obj12.setName("Muse");
        club_obj12.setImage_bm(image12);
        club_obj12.setSubTitle("Slay your way!");
        club_obj12.setDesc("\"The club aims to: change how fashion is perceived- including but not only restricted to glamour promote fashion as a form of expression and a creative outlet for the students enable the students to portray their individuality and sense of self using fashion verse the students with why and how to dress well, especially in professional situations mould the students develop an observant, critical eye towards fashion make the college a relevant part of the fashion circuit by participating in fests take the annual fashion show at Odyssey to a greater level.\" ");
        club_obj12.setInstaUrl("https://www.instagram.com/accounts/login/?next=/muse_iiitd/");

        club_obj13.setName("Philosoc");
        club_obj13.setImage_bm(image13);
        club_obj13.setSubTitle("Tell us your Philosophy");
        club_obj13.setDesc("Philosoc is the philosophy club of IIIT Delhi. For all the inquisitive minds \uD83D\uDE24,we love to think for no reason. We house an avid group of people who love to talk. We got a bomb discord server where we stream movies and documentaries, and a cute book club. Don't miss our sessions! this is not a suggestion but a warning ");
        club_obj13.setInstaUrl("https://www.instagram.com/accounts/login/?next=/philosociiitd/");

        club_obj14.setName("SaltNPepper");
        club_obj14.setImage_bm(image14);
        club_obj14.setSubTitle("Cook It!");
        club_obj14.setDesc("The club aims to promote good living through the enjoyment of cuisines. The club is focused on providing social activities in a convivial environment. It’s a place where fun, party and food happens and focuses on a healthy yet delicious lifestyle. Through our club, we want to provide students with a platform where they can showcase their love for food and cooking.");
        club_obj14.setInstaUrl("https://www.instagram.com/accounts/login/?next=/saltnpepper_iiitd/");

        club_obj15.setName("Tasveer");
        club_obj15.setImage_bm(image15);
        club_obj15.setSubTitle("Take a Snap");
        club_obj15.setDesc("Tasveer is the photography club at IIIT Delhi. Born out of love for walking around, clicking pictures and hogging food, Tasveer aims to nurture the budding talent and photo enthusiasts in the beautiful campus situated in New Delhi.");
        club_obj15.setInstaUrl("https://www.instagram.com/accounts/login/?next=/tasveeriiitd/");
        club_obj15.setFacebookUrl("https://m.facebook.com/tasveeriiitd/");
        club_obj15.setTwitterUrl("http://tasveer.iiitd.edu.in/");

        club_obj16.setName("WomenInTech");
        club_obj16.setImage_bm(image16);
        club_obj6.setSubTitle("You Go Girl!!");
        club_obj16.setDesc("WiT aims to have a close-knit community of women with access to a better network, opportunities and a support system. Through WiT, we want to garner an ecosystem where all the women grow stronger and help their fellow peers grow with them.");
        club_obj16.setInstaUrl("https://www.instagram.com/accounts/login/?next=/womenintechiiitd/");
        club_obj16.setTwitterUrl("http://wit.iiitd.edu.in/");

        ClubsList.add(club_obj1);
        ClubsList.add(club_obj2);
        ClubsList.add(club_obj3);
        ClubsList.add(club_obj4);
        ClubsList.add(club_obj5);
        ClubsList.add(club_obj6);
        ClubsList.add(club_obj7);
        ClubsList.add(club_obj8);
        ClubsList.add(club_obj9);
        ClubsList.add(club_obj10);
        ClubsList.add(club_obj11);
        ClubsList.add(club_obj12);
        ClubsList.add(club_obj13);
        ClubsList.add(club_obj14);
        ClubsList.add(club_obj15);
        ClubsList.add(club_obj16);

        adaptorClubsList=new adaptorClubsList(ClubsList);
        recyclerView.setAdapter(adaptorClubsList);
        return v;
    }
}