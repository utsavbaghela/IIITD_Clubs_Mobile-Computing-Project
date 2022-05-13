package com.example.project_clubs_dashboard;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.provider.CalendarContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class EventDetailFragment extends Fragment {
    ArrayList<clubEventListModel> data;
    TextView tvEventMonth, tvEventDate, tvEventDesc, tvEventName;
    Button btnEventRegister;
    ImageView bellIV;
    String eventName,eventDesc,eventDate,eventMonth;
    ImageView bellicon;

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String startTime = "2022-06-1 09:00:00";
    String endTime = "2022-06-1 12:00:00";
//    String sampleEmail = "";

    private static final String DEBUG_TAG = "EventDetailFragment";

    public EventDetailFragment(ArrayList<clubEventListModel> data) {
        this.data=data;
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_event_detail, container, false);

        bellicon = (ImageView) view.findViewById(R.id.bellIconIV);
        tvEventDate=(TextView) view.findViewById(R.id.eventDateTV);
        tvEventMonth=(TextView) view.findViewById(R.id.eventMonthTV);
        tvEventName=(TextView) view.findViewById(R.id.eventNameTV);
        tvEventDesc=(TextView) view.findViewById(R.id.eventDescTV);
        btnEventRegister=(Button) view.findViewById(R.id.eventRegisterButton);
        bellIV=view.findViewById(R.id.bellIconIV);

        eventName=getArguments().getString("name");
        eventDesc=getArguments().getString("desc");
        eventDate=getArguments().getString("date");
        eventMonth=getArguments().getString("month");

        tvEventDate.setText(eventDate);
        tvEventDesc.setText(eventDesc);
        tvEventMonth.setText(eventMonth);
        tvEventName.setText(eventName);

        btnEventRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(DEBUG_TAG, "btnEventRegister");
                Toast.makeText(getActivity().getApplicationContext(), "Event Registered Successfully For Utsav Baghela", Toast.LENGTH_SHORT).show();
            }
        });

        bellicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(Intent.ACTION_INSERT);
                intent.setData(CalendarContract.Events.CONTENT_URI);
                intent.putExtra(CalendarContract.Events.TITLE, eventName);
                intent.putExtra(CalendarContract.Events.DESCRIPTION, eventDesc);
                intent.putExtra(Intent.EXTRA_EMAIL, "manask1998@gmail.com");
//                intent.putExtra(Intent.EXTRA_, "manask1998@gmail.com");

                intent.putExtra(CalendarContract.Events.EVENT_LOCATION, "C-102");
                intent.putExtra(CalendarContract.Events.ALLOWED_REMINDERS, "C-102");

//                intent.putExtra(CalendarContract.Events.ALL_DAY, "false");
                try {
                    intent.putExtra("beginTime", sdf.parse(startTime).getTime());
                    intent.putExtra("endTime", sdf.parse(endTime).getTime());
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                intent.putExtra(CalendarContract.Events.LAST_DATE, eventDesc);


//                if(intent.resolveActivity(getActivity().getPackageManager())!=null)
//                {
                    startActivity(intent);
//                }



            }
        });



        return view;
    }



}