package com.example.project_clubs_dashboard.controller;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_clubs_dashboard.R;
import com.example.project_clubs_dashboard.clubProfile;
import com.example.project_clubs_dashboard.model.clubs;

import java.io.Serializable;
import java.util.List;

public class adaptorClubsList extends RecyclerView.Adapter<adaptorClubsList.ViewHolder>{
    public static List<clubs> ClubsLists;


    public adaptorClubsList(List<clubs> ClubsLists)
    {
        System.out.println("XXXXXXXX");
        this.ClubsLists=ClubsLists;
        System.out.println(ClubsLists.get(0).getName());
        System.out.println(ClubsLists.get(1).getName());
        System.out.println(ClubsLists.get(2).getName());
    }
    @NonNull
    @Override
    public adaptorClubsList.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        System.out.println("inside oncreate adapter");
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_dashboard,parent,false);
        return new ViewHolder(v);


    }
    @Override
    public void onBindViewHolder(@NonNull adaptorClubsList.ViewHolder holder, int position) {
        System.out.println("inside onbind");
        String Clubname1=ClubsLists.get(position).getName();
        int clickedPosition = holder.getAbsoluteAdapterPosition();
        System.out.println("Club Name Clicked : "+ClubsLists.get(clickedPosition).getName());
        Bitmap image=ClubsLists.get(position).getImage_bm();
        System.out.println("Club Name : "+Clubname1);
        holder.setData(Clubname1,image);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity act = (AppCompatActivity) view.getContext();
                System.out.println("Club Name Clicked : "+ClubsLists.get(clickedPosition).getName());
                Fragment df = new clubProfile();
                act.getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView3,df).addToBackStack(null).commit();
                Bundle bundle = new Bundle();
                bundle.putSerializable("clickedClubObj", (Serializable) ClubsLists.get(clickedPosition));
                df.setArguments(bundle);
            }
        });
    }
    @Override
    public int getItemCount() {
        return ClubsLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView iv1;
        ImageView iv2;
        TextView tv1;
        TextView tv2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1=itemView.findViewById(R.id.logo1);
            iv1=itemView.findViewById(R.id.image_logo);
        }
        public void setData(String logoname1,Bitmap image)
        {
            tv1.setText(logoname1);
            iv1.setImageBitmap(image);
        }
    }
}