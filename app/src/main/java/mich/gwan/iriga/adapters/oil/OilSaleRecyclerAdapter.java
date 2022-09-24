package mich.gwan.iriga.adapters.oil;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import mich.gwan.iriga.R;
import mich.gwan.iriga.activities.oil.OilSaleListActivity;
import mich.gwan.iriga.model.oil.OilSale;

public class OilSaleRecyclerAdapter extends RecyclerView.Adapter<OilSaleRecyclerAdapter.OilSaleViewHolder>{


    private final List<OilSale> listOilSale;
    private int index = RecyclerView.NO_POSITION;

    public OilSaleRecyclerAdapter(List<OilSale> listOilSale) {
        this.listOilSale = listOilSale;
    }

    @Override
    public OilSaleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflating recycler item view
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_oilsale_recycler, parent, false);

        return new OilSaleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(OilSaleViewHolder holder, int position) {
        holder.oilSaleDate.setText(listOilSale.get(position).getOilSaleDate());
        holder.oilSaleTime.setText(listOilSale.get(position).getOilSaleTime());
        holder.oilSaleCategory.setText(listOilSale.get(position).getOilSalecategory());
        holder.oilSaleQnty.setText(String.valueOf(listOilSale.get(position).getOilSaleQnty()));
        holder.oilSaleUprice.setText(String.valueOf(listOilSale.get(position).getOilSaleUprice()));
        holder.oilSaleTotal.setText(String.valueOf(listOilSale.get(position).getOilSaleTotal()));
        holder.oilSaleProfit.setText(String.valueOf(listOilSale.get(position).getOilSaleProfit()));

        holder.itemView.setSelected(index == position);
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                notifyItemChanged(index);
                index = holder.getLayoutPosition();
                notifyItemChanged(index);
                return true;
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notifyItemChanged(index);
                index = holder.getLayoutPosition();
                notifyItemChanged(index);
            }
        });


    }

    public int getTotalProfit(){
        int profit = 0;
        for (int i = 0; i < listOilSale.size(); i++){
            profit += listOilSale.get(i).getOilSaleProfit();
        }
        return profit;
    }

    public  int getSumProfit(){
        int totalProfit = 0;
        for (int i = 0; i < listOilSale.size(); i++){
            OilSale profit = listOilSale.get(i);
            int tprofit = profit.getOilSaleProfit();
            totalProfit += tprofit;
        }
        return totalProfit;
    }

    @Override
    public int getItemCount() {
        Log.v(OilSaleRecyclerAdapter.class.getSimpleName(),""+listOilSale.size());
        return listOilSale.size();
    }


    /**
     * ViewHolder class
     */
    public class OilSaleViewHolder extends RecyclerView.ViewHolder {

        public TextView oilSaleDate;
        public TextView oilSaleTime;
        public TextView oilSaleCategory;
        public TextView oilSaleQnty;
        public TextView oilSaleUprice;
        public TextView oilSaleTotal;
        public TextView oilSaleProfit;
        private OilSaleListActivity oilSale;

        public OilSaleViewHolder(View view) {
            super(view);
            oilSaleDate = (TextView) view.findViewById(R.id.textOilSaleDate);
            oilSaleTime = (TextView) view.findViewById(R.id.textOilSaleTime);
            oilSaleCategory = (TextView) view.findViewById(R.id.textOilSaleCategory);
            oilSaleQnty = (TextView) view.findViewById(R.id.textOilSaleQnty);
            oilSaleUprice = (TextView) view.findViewById(R.id.textOilSaleUprice);
            oilSaleTotal = (TextView) view.findViewById(R.id.textOilSaleTotal);
            oilSaleProfit = (TextView) view.findViewById(R.id.textOilSaleProfit);
            oilSale = new OilSaleListActivity();
        }
    }

}
