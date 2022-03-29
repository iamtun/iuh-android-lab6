package fit.android.lab6.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import fit.android.lab3.R;
import fit.android.lab6.model.Shoes;
import fit.android.lab6.adapter.ShoesAdapter;


public class MainActivity_Shoes extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ShoesFragment shoesFragment = new ShoesFragment();
        getSupportFragmentManager().beginTransaction()
                                    .add(R.id.frmLayout, shoesFragment, "shoesFragment")
                                    .commit();//gán fragment vào frmLayout
    }
}