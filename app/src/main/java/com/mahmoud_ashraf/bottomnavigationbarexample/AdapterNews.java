package com.mahmoud_ashraf.bottomnavigationbarexample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;

/**
 * Created by Mah on 1/25/2017.
 */

public class AdapterNews extends RecyclerView.Adapter<AdapterNews.ViewHolder> implements View.OnClickListener{

    ArrayList<String> arrayList;
    Context context;
    MainActivity mainActivity;
    String encap ;

    public AdapterNews(ArrayList<String> arrayList, Context context, MainActivity mainActivity) {
        this.arrayList = arrayList;
        this.context = context;
        this.mainActivity = mainActivity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View Layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        ViewHolder viewHolder = new ViewHolder(Layout);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        encap = arrayList.get(position);

        holder.cardView.setTag(position);

        holder.textTitle.setText(encap);
        holder.textDesc.setText("Eheu.Festus navis sed mire attrahendams coordinatae est.Emeritis, " +
                "albus vitas superbe consumere de nobilis, bassus fraticinida.Demolitione regius cedrium " +
                "est.Eheu.Domuss manducare in brevis aboa!Pol, a bene triticum, talis cursus!");

    }

    @Override
    public int getItemCount() {
        return  arrayList.size();
    }

    @Override
    public void onClick(View view) {

    }


    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        CardView cardView;
        ImageView imageNews;
        TextView textTitle;
        TextView textDesc;

        public ViewHolder(View layout) {
            super(layout);

            cardView = (CardView) layout.findViewById(R.id.list_row_container);
            imageNews = (ImageView) layout.findViewById(R.id.news_image);
            textTitle = (TextView) layout.findViewById(R.id.title_news);
            textDesc = (TextView) layout.findViewById(R.id.desc_news);
            cardView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {



        }

    }

}
