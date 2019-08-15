package com.ly.autoscrolllayout;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class AActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_activity);
        initVTextView();
    }
    private void initVTextView() {
        final VerticalScrollTextView  vTextView = (VerticalScrollTextView) findViewById(R.id.v_text_view);
        final List<String> data = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            data.add("i="+i);
        }
        vTextView.setDataSource(data);
        vTextView.startPlay();
        vTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println(">]="+data.get(vTextView.getCurrentItemIndex())+"----mTvContentTop="+vTextView.mTvContentTop.getText()+"----"+vTextView.mTvContentBottom.getText());
            }
        });
    }
}
