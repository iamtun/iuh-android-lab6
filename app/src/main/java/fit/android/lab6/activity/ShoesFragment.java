package fit.android.lab6.activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import fit.android.lab3.R;
import fit.android.lab6.adapter.ShoesAdapter;
import fit.android.lab6.model.Shoes;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShoesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShoesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ShoesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ShoesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ShoesFragment newInstance(String param1, String param2) {
        ShoesFragment fragment = new ShoesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private ListView lvShoesFragment;
    private ArrayList<Shoes> shoesList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shoes, container, false);

        lvShoesFragment = view.findViewById(R.id.lvShoes);
        shoesList = new ArrayList<>();

        shoesList.add( new Shoes(1, R.drawable.shoes_rm_preview_b,
                "Nike shoes-discount 50%", "Pls touch to see detail"));
        shoesList.add( new Shoes(2, R.drawable.shoes_rm_preview_a,
                "Adidas shoes-discount 80%", "Pls touch to see detail"));
        shoesList.add( new Shoes(3, R.drawable.shoes_rm_purple,
                "Nike Bicycle-discount 30%", "Pls touch to see detail"));
        shoesList.add( new Shoes(4, R.drawable.shoes_rm_preview,
                "Yonex shoes-discount 50%", "Pls touch to see detail"));
        shoesList.add( new Shoes(5, R.drawable.shoes_rm_yellow,
                "Victor shoes-discount 50%", "Pls touch to see detail"));
        shoesList.add( new Shoes(6, R.drawable.shoes_white_removebg_preview,
                "Lining shoes-discount 50%", "Pls touch to see detail"));
        shoesList.add( new Shoes(7, R.drawable.color_removebg_preview,
                "Binh Minh shoes-discount 90%", "Pls touch to see detail"));

        ShoesAdapter adapter = new ShoesAdapter(getActivity(), R.layout.item_shoes, shoesList);
        lvShoesFragment.setAdapter(adapter);

        return view;
    }
}