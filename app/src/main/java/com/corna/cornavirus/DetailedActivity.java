package com.corna.cornavirus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {
    private  int positionCountry;
    TextView tvCountry,tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
        initViews();


        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of "+Affected_Countries.countryModelsList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tvCountry.setText(Affected_Countries.countryModelsList.get(positionCountry).getCountry());
        tvCases.setText(Affected_Countries.countryModelsList.get(positionCountry).getCases());
        tvRecovered.setText(Affected_Countries.countryModelsList.get(positionCountry).getRecovered());
        tvCritical.setText(Affected_Countries.countryModelsList.get(positionCountry).getCritical());
        tvActive.setText(Affected_Countries.countryModelsList.get(positionCountry).getActive());
        tvTodayCases.setText(Affected_Countries.countryModelsList.get(positionCountry).getTodayCases());
        tvTotalDeaths.setText(Affected_Countries.countryModelsList.get(positionCountry).getDeaths());
        tvTodayDeaths.setText(Affected_Countries.countryModelsList.get(positionCountry).getTodayDeaths());

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

    private void initViews() {

        tvCountry = findViewById(R.id.tvCountry);
        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);
    }
}
