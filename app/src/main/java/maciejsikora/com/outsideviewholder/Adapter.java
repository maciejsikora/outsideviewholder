package maciejsikora.com.outsideviewholder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Adapter use outside class ViewHolder
 * Created by maciej on 06.09.16.
 */
public class Adapter extends RecyclerView.Adapter<ViewHolder>{

    private final ArrayList<String> list;

    public Adapter(ArrayList<String> list){

        this.list=list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //create view holder
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


            holder.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
