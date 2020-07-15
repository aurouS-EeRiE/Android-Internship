package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {

    int MyImages[];
    String MyCodeName[];
    String MyVersionNumbers[];
    String MyAPILevel[];
    String MyReleaseDate[];
    Context ct;

    public adapter(MainActivity mainActivity, int[] images, String[] codeName, String[] versionNumbers, String[] apiLevel, String[] releaseDate) {

        MyImages = images;
        MyAPILevel = apiLevel;
        MyCodeName = codeName;
        MyReleaseDate = releaseDate;
        MyVersionNumbers = versionNumbers;
        ct = mainActivity;

    }

    @NonNull
    @Override
    public adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ct).inflate(R.layout.mydata, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.MyViewHolder holder, int position) {

        holder.image.setImageResource(MyImages[position]);
        holder.codename.setText( MyCodeName[position]);
        holder.version.setText("Version: " + MyVersionNumbers[position]);
        holder.api.setText("API: " + MyAPILevel[position]);
        holder.date.setText("Release: " + MyReleaseDate[position]);

    }

    @Override
    public int getItemCount() {
        return MyImages.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView codename, version, api, date;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            codename = itemView.findViewById(R.id.codename);
            version = itemView.findViewById(R.id.version);
            api = itemView.findViewById(R.id.api);
            date = itemView.findViewById(R.id.date);

        }
    }
}
