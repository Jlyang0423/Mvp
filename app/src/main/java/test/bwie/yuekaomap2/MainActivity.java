package test.bwie.yuekaomap2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import test.bwie.yuekaomap2.Ppresenter.OKPresenter;
import test.bwie.yuekaomap2.view.Okview;

public class MainActivity extends AppCompatActivity implements Okview {
 private OKPresenter okPresenter;
    private String uid="185";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        okPresenter = new OKPresenter(this);
        okPresenter.login(uid);
    }
    @Override
    public void successed(final String a) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this,a,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
