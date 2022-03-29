package fit.android.lab6.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import fit.android.lab3.R;
import fit.android.lab6.activity.DetailActivity_Shoes;
import fit.android.lab6.model.Shoes;

public class ShoesAdapter extends BaseAdapter {
    private Context context;
    private int layoutItem;
    private ArrayList<Shoes> shoesList;

    public ShoesAdapter(Context context, int layoutItem, ArrayList<Shoes> shoesList) {
        this.context = context;
        this.layoutItem = layoutItem;
        this.shoesList = shoesList;
    }

    @Override
    public int getCount() {
        if(shoesList.size() != 0 && !shoesList.isEmpty())
            return shoesList.size();
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext())
                            .inflate(layoutItem, viewGroup, false);

        ImageView imgShoes = view.findViewById(R.id.imgShoes);
        TextView tvDiscount = view.findViewById(R.id.tvDiscount);
        TextView tvActionDetails = view.findViewById(R.id.tvActionDetails);

        imgShoes.setImageResource(shoesList.get(i).getImgShoes());
        tvDiscount.setText(shoesList.get(i).getDiscount());
        tvActionDetails.setText(shoesList.get(i).getActionDetail());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity_Shoes.class);
                Bundle bundle = new Bundle();
                bundle.putInt("imgShoes", shoesList.get(i).getImgShoes());
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
        return view;
    }
}
