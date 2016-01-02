package cardview.materialdesign.arifhasnat.com.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by arifhasnat on 1/2/16.
 */
public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.MyViewHolder> {

   List<Items> data= Collections.emptyList();


   private LayoutInflater inflater;
    public ItemsAdapter(Context context ,List<Items> data) {
       inflater = LayoutInflater.from(context);
        this.data=data;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=inflater.inflate(R.layout.customrowitems,parent,false);
        MyViewHolder viewHolder=new MyViewHolder(view);

        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Items items=data.get(position);
        holder.title.setText(items.title);



    }


    @Override


    public int getItemCount() {
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView imageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            title= (TextView) itemView.findViewById(R.id.textViewFromCustomRowItems);
            imageView= (ImageView) itemView.findViewById(R.id.imageViewFromCustomRowItems);


        }


    }
}
