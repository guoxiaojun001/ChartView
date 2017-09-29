package pie.test.com.chartview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import pie.test.com.chartview.view.RingView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RingView ringView = (RingView) findViewById(R.id.ringView);
        // 添加的是颜色
        List<Integer> colorList = new ArrayList<>();
        colorList.add(R.color.color_ff3e60);
        colorList.add(R.color.color_ffa200);
        colorList.add(R.color.color_31cc64);
        colorList.add(R.color.color_3377ff);

        //  添加的是百分比
        List<Float> rateList = new ArrayList<>();
        rateList.add(10f);
        rateList.add(5f);
        rateList.add(45f);
        rateList.add(40f);
        ringView.setShow(colorList, rateList,false,true);
    }
}
