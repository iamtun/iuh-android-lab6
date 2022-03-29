package fit.android.lab6.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import fit.android.lab3.R;

public class DetailActivity_Shoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_shoes);

        ImageView imgShoes = findViewById(R.id.imgShoesDetail);
        Intent intent = getIntent();
        imgShoes.setImageResource(intent.getIntExtra("imgShoes", 0));
    }
}