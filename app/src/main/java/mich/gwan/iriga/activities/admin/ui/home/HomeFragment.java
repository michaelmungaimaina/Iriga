package mich.gwan.iriga.activities.admin.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import mich.gwan.iriga.activities.UsersListActivity;
import mich.gwan.iriga.activities.bolt.BoltActionSale;
import mich.gwan.iriga.activities.bolt.BoltListActivity;
import mich.gwan.iriga.activities.bolt.BoltRegister;
import mich.gwan.iriga.activities.bolt.BoltSaleListActivity;
import mich.gwan.iriga.activities.gas.GasActionSale;
import mich.gwan.iriga.activities.gas.GasListActivity;
import mich.gwan.iriga.activities.gas.GasRegister;
import mich.gwan.iriga.activities.gas.GasSaleListActivity;
import mich.gwan.iriga.activities.oil.OilActionSale;
import mich.gwan.iriga.activities.oil.OilRegister;
import mich.gwan.iriga.activities.oil.OilSaleListActivity;
import mich.gwan.iriga.activities.oil.OilsListActivity;
import mich.gwan.iriga.activities.powersaw.PowersawActionSale;
import mich.gwan.iriga.activities.powersaw.PowersawListActivity;
import mich.gwan.iriga.activities.powersaw.PowersawRegister;
import mich.gwan.iriga.activities.powersaw.PowersawSaleListActivity;
import mich.gwan.iriga.activities.spanner.SpannerActionSale;
import mich.gwan.iriga.activities.spanner.SpannerListActivity;
import mich.gwan.iriga.activities.spanner.SpannerRegister;
import mich.gwan.iriga.activities.spanner.SpannerSaleListActivity;
import mich.gwan.iriga.activities.spare.SpareActionSale;
import mich.gwan.iriga.activities.spare.SpareRegister;
import mich.gwan.iriga.activities.spare.SpareSaleListActivity;
import mich.gwan.iriga.activities.spare.SparesListActivity;
import mich.gwan.iriga.activities.welding.WeldingActionSale;
import mich.gwan.iriga.activities.welding.WeldingListActivity;
import mich.gwan.iriga.activities.welding.WeldingRegister;
import mich.gwan.iriga.activities.welding.WeldingSaleListActivity;
import mich.gwan.iriga.databinding.ActivityControlBinding;
import mich.gwan.iriga.petty.PettyTransActivity;

public class HomeFragment extends Fragment {

    private ActivityControlBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //binding = FragmentHomeBinding.inflate(inflater, container, false);
        //View root = binding.getRoot();

        binding = ActivityControlBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        //setContentView(binding.getRoot());

        binding.oilsAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oilIntent = new Intent(HomeFragment.this.getActivity(), OilRegister.class);
                HomeFragment.this.startActivity(oilIntent);
            }
        });
        binding.cardPwrsawAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oilIntent = new Intent(HomeFragment.this.getActivity(), PowersawRegister.class);
                HomeFragment.this.startActivity(oilIntent);
            }
        });
        binding.pwrsawView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oilIntent = new Intent(HomeFragment.this.getActivity(), PowersawListActivity.class);
                HomeFragment.this.startActivity(oilIntent);
            }
        });
        binding.cardSpannerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oilIntent = new Intent(HomeFragment.this.getActivity(), SpannerListActivity.class);
                HomeFragment.this.startActivity(oilIntent);
            }
        });
        binding.cardWeldingView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oilIntent = new Intent(HomeFragment.this.getActivity(), WeldingListActivity.class);
                HomeFragment.this.startActivity(oilIntent);
            }
        });
        binding.cardBoltView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oilIntent = new Intent(HomeFragment.this.getActivity(), BoltListActivity.class);
                HomeFragment.this.startActivity(oilIntent);
            }
        });
        binding.cardGasView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment.this.getActivity(), GasListActivity.class);
                HomeFragment.this.startActivity(intent);
            }
        });
        binding.cardSpareAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment.this.getActivity(), SpareRegister.class);
                HomeFragment.this.startActivity(intent);
            }
        });
        binding.cardGasAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment.this.getActivity(), GasRegister.class);
                HomeFragment.this.startActivity(intent);
            }
        });
        binding.cardBoltAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment.this.getActivity(), BoltRegister.class);
                HomeFragment.this.startActivity(intent);
            }
        });
        binding.cardWeldingAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment.this.getActivity(), WeldingRegister.class);
                HomeFragment.this.startActivity(intent);
            }
        });
        binding.cardSpannerAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment.this.getActivity(), SpannerRegister.class);
                HomeFragment.this.startActivity(intent);
            }
        });
        binding.userView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accountsIntent = new Intent(HomeFragment.this.getActivity(), UsersListActivity.class);
                HomeFragment.this.startActivity(accountsIntent);
            }
        });
        binding.oilsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent accOil = new Intent(HomeFragment.this.getActivity(), OilsListActivity.class);
                    HomeFragment.this.startActivity(accOil);
            }
        });binding.spareView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment.this.getActivity(), SpareSaleListActivity.class);
                HomeFragment.this.startActivity(intent);
            }
        });
        binding.newSale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oilSale = new Intent(HomeFragment.this.getActivity(), OilActionSale.class);
                HomeFragment.this.startActivity(oilSale);
            }
        });
        binding.salesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oilSaleView = new Intent(HomeFragment.this.getActivity(), OilSaleListActivity.class);
                HomeFragment.this.startActivity(oilSaleView);
            }
        });
        binding.spareSale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sale = new Intent(HomeFragment.this.getActivity(), SpareActionSale.class);
                HomeFragment.this.startActivity(sale);
            }
        });
        binding.powersawSale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sale = new Intent(HomeFragment.this.getActivity(), PowersawActionSale.class);
                HomeFragment.this.startActivity(sale);
            }
        });
        binding.spannerSale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sale = new Intent(HomeFragment.this.getActivity(), SpannerActionSale.class);
                HomeFragment.this.startActivity(sale);
            }
        });
        binding.weldingSale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sale = new Intent(HomeFragment.this.getActivity(), WeldingActionSale.class);
                HomeFragment.this.startActivity(sale);
            }
        });
        binding.boltSale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sale = new Intent(HomeFragment.this.getActivity(), BoltActionSale.class);
                HomeFragment.this.startActivity(sale);
            }
        });
        binding.gasSale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sale = new Intent(HomeFragment.this.getActivity(), GasActionSale.class);
                HomeFragment.this.startActivity(sale);
            }
        });
        binding.managePettyTrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pettyRecords = new Intent(HomeFragment.this.getActivity(), PettyTransActivity.class);
                HomeFragment.this.startActivity(pettyRecords);
            }
        });
        binding.cardSpareView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent saleView = new Intent(HomeFragment.this.getActivity(), SparesListActivity.class);
                HomeFragment.this.startActivity(saleView);
            }
        });
        binding.powersawView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent saleView = new Intent(HomeFragment.this.getActivity(), PowersawSaleListActivity.class);
                HomeFragment.this.startActivity(saleView);
            }
        });
        binding.spannerCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent saleView = new Intent(HomeFragment.this.getActivity(), SpannerSaleListActivity.class);
                HomeFragment.this.startActivity(saleView);
            }
        });
        binding.weldingCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent saleView = new Intent(HomeFragment.this.getActivity(), WeldingSaleListActivity.class);
                HomeFragment.this.startActivity(saleView);
            }
        });
        binding.boltCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent saleView = new Intent(HomeFragment.this.getActivity(), BoltSaleListActivity.class);
                HomeFragment.this.startActivity(saleView);
            }
        });
        binding.gasCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent saleView = new Intent(HomeFragment.this.getActivity(), GasSaleListActivity.class);
                HomeFragment.this.startActivity(saleView);
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}