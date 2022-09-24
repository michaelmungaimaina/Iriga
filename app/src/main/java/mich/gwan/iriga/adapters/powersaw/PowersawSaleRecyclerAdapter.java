package mich.gwan.iriga.adapters.powersaw;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import mich.gwan.iriga.R;
import mich.gwan.iriga.activities.gas.GasSaleListActivity;
import mich.gwan.iriga.model.powersaw.PowersawSale;

public class PowersawSaleRecyclerAdapter extends RecyclerView.Adapter<PowersawSaleRecyclerAdapter.PowersawSaleViewHolder>{


    private final List<PowersawSale> list;
    private int index = RecyclerView.NO_POSITION;

    public PowersawSaleRecyclerAdapter(List<PowersawSale> list) {
        this.list = list;
    }

    @Override
    public PowersawSaleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflating recycler item view
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_powersawsale_recycler, parent, false);

        return new PowersawSaleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PowersawSaleViewHolder holder, int position) {
        holder.saleDate.setText(list.get(position).getPowersawSaleDate());
        holder.saleTime.setText(list.get(position).getPowersawSaleTime());
        holder.saleCategory.setText(list.get(position).getPowersawSalecategory());
        holder.saleQnty.setText(String.valueOf(list.get(position).getPowersawSaleQnty()));
        holder.saleUprice.setText(String.valueOf(list.get(position).getPowersawSaleUprice()));
        holder.saleTotal.setText(String.valueOf(list.get(position).getPowersawSaleTotal()));
        holder.saleProfit.setText(String.valueOf(list.get(position).getPowersawSaleProfit()));

    }

    @Override
    public int getItemCount() {
        Log.v(PowersawSaleRecyclerAdapter.class.getSimpleName(),""+list.size());
        return list.size();
    }


    /**
     * ViewHolder class
     */
    public class PowersawSaleViewHolder extends RecyclerView.ViewHolder {

        public TextView saleDate;
        public TextView saleTime;
        public TextView saleCategory;
        public TextView saleQnty;
        public TextView saleUprice;
        public TextView saleTotal;
        public TextView saleProfit;
        private GasSaleListActivity saleActivity;

        public PowersawSaleViewHolder(View view) {
            super(view);
            saleDate = (TextView) view.findViewById(R.id.textSawSaleDate);
            saleTime = (TextView) view.findViewById(R.id.textSawSaleTime);
            saleCategory = (TextView) view.findViewById(R.id.textSawSaleCategory);
            saleQnty = (TextView) view.findViewById(R.id.textSawSaleQnty);
            saleUprice = (TextView) view.findViewById(R.id.textSawSaleUprice);
            saleTotal = (TextView) view.findViewById(R.id.textSawSaleTotal);
            saleProfit = (TextView) view.findViewById(R.id.textSawSaleProfit);
            saleActivity = new GasSaleListActivity();
        }
    }

}
