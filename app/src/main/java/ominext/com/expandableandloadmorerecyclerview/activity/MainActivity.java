package ominext.com.expandableandloadmorerecyclerview.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ominext.com.expandableandloadmorerecyclerview.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void expandableRecyclerView(View v) {
        Intent i = new Intent(this, ExpandableRecyclerViewActivity.class);
        startActivity(i);
    }

    public void loadMoreRecyclerView(View v) {

    }
}
