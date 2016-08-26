package example.saadat.com.ewldemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Saadat on 8/8/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>{

    private ArrayList<Data> arrayList = new ArrayList<Data>();

    public RecyclerAdapter(ArrayList<Data> arrayList){

        this.arrayList = arrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item, null);

        //Creating view Holder

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

            Data data = arrayList.get(position);
            holder.imageView.setImageResource(data.getImg());
            holder.tit1.setText(data.getTitle1());
            holder.tit2.setText(data.getTitle2());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tit1,tit2;
        Button btnmore;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.itemImage);
            tit1 = (TextView) itemView.findViewById(R.id.tvTitle);
            tit2 = (TextView) itemView.findViewById(R.id.tvTitle1);
            btnmore = (Button) itemView.findViewById(R.id.btnMore);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
}
