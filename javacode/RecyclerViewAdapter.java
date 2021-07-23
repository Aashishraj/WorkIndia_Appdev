package com.example.myapplication;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;




public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Item[] myData;
    Context context;

    public RecyclerViewAdapter(Item[] myMovieData, Context activity) {
        this.myData = myMovieData;
        this.context = activity;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_adapter,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Item myDataList = myData[position];

        holder.textViewPrice.setText(myDataList.getPrice()+" ");
        holder.textViewName.setText(myDataList.getName()+" ");
        holder.textViewExtra.setText(myDataList.getExtra()+" ");

//        Bitmap bitmap= BitmapFactory.decodeFile(myDataList.getImage());
//        holder.movieImage.setImageBitmap(bitmap);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myDataList.getPrice()+" ", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return myData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView movieImage;
        TextView textViewName;
        TextView textViewPrice,textViewExtra;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            movieImage = itemView.findViewById(R.id.Image);
            textViewName = itemView.findViewById(R.id.Name);
            textViewPrice = itemView.findViewById(R.id.Price);
            textViewExtra = itemView.findViewById(R.id.Extra);


        }
    }

}