package ng.org.ddhub.basic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int currentValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void click(View btn){
        String newValue = "Digital Development Hub";
        TextView textView = (TextView) findViewById(R.id.textview);
        textView.setText(newValue);
    }

    public void add(View add){
        currentValue++;
        TextView value = (TextView) findViewById(R.id.value);
        value.setText(String.valueOf(currentValue));
    }

    public void reduce(View reduce){
        currentValue--;
        TextView value = (TextView) findViewById(R.id.value);
        value.setText(String.valueOf(currentValue));
    }

}
