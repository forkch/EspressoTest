package fork.ch.espressotest;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class AActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.btnLaunchActivityB)
    public void btnLaucnActivityBClick(View v) {
        Intent intent = new Intent(this, BActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(this.getClass().getSimpleName(), "onResume");
        Toast.makeText(this, "Activity A resumed", Toast.LENGTH_SHORT).show();
    }
}
