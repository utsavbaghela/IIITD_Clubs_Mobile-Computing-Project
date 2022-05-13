package com.example.project_clubs_dashboard;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EventListAdaptorClass extends RecyclerView.Adapter<EventListAdaptorClass.EventViewHolderClass> {

    ArrayList<clubEventListModel> data;
    Context context;
    private final static String DEBUG_TAG="EventListAdaptorClass";
    public EventListAdaptorClass(ArrayList<clubEventListModel> data, Context context) {
        this.data = data;
        this.context = context;
        Log.i(DEBUG_TAG, "Constructor");
    }

    @NonNull
    @Override
    public EventViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.e(DEBUG_TAG, "onCreateViewHolder");
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_event_row,parent,false);
        EventViewHolderClass eventViewHolderClass=new EventViewHolderClass(view);
        return eventViewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolderClass holder, int position) {
        Log.i(DEBUG_TAG, "onBindViewHolder : "+position);
        holder.eventName_TV.setText(data.get(position).getEventName());
        holder.eventDate_TV.setText(data.get(position).getEventDate());
        holder.eventMonth_TV.setText(data.get(position).getEventMonth());
//        holder.eventDesc_TV.setText(data.get(position).getEventDesc());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(DEBUG_TAG, "onClick_1");
                AppCompatActivity activity=(AppCompatActivity) view.getContext();

                Bundle bundle=new Bundle();
                Log.e(DEBUG_TAG, "onClick_2");
                //Log.e(DEBUG_TAG, "onClick_3");
//                Container.newsArrayList.get(pos).get("body")
                bundle.putString("name",data.get(holder.getAdapterPosition()).getEventName());
                bundle.putString("desc",data.get(holder.getAdapterPosition()).getEventDesc());
                bundle.putString("date",data.get(holder.getAdapterPosition()).getEventDate());
                bundle.putString("month",data.get(holder.getAdapterPosition()).getEventMonth());
                bundle.putInt("position",holder.getAdapterPosition());

                Log.e(DEBUG_TAG, "onClick_3");

                Fragment eventDetailFragment=new EventDetailFragment(data);
                eventDetailFragment.setArguments(bundle);

                FragmentManager fragmentManager= activity.getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.activityFrameLayout,eventDetailFragment).addToBackStack(null).commit();

            }
        });
    }

    @Override
    public int getItemCount() {
        Log.i(DEBUG_TAG, "getItemCount");
        return data.size();
    }
    public class EventViewHolderClass  extends RecyclerView.ViewHolder {

        TextView eventName_TV;
        TextView eventDesc_TV, eventDate_TV, eventMonth_TV;

        public EventViewHolderClass(@NonNull View itemView) {
            super(itemView);
            eventName_TV=(TextView)itemView.findViewById(R.id.eventNameTV);
//            eventDesc_TV=(TextView)itemView.findViewById(R.id.eventDescTV);
            eventDate_TV=(TextView)itemView.findViewById(R.id.eventDateTV);
            eventMonth_TV=(TextView)itemView.findViewById(R.id.eventMonthTV);
        }
    }
}
