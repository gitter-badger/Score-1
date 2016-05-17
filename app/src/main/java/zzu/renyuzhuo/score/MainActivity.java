package zzu.renyuzhuo.score;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import zzu.renyuzhuo.score.fragment.OneFragment;
import zzu.renyuzhuo.score.fragment.SectionsPagerAdapter;
import zzu.renyuzhuo.score.fragment.TwoFragment;
import zzu.renyuzhuo.score.fragment.ZeroFragment;
import zzu.renyuzhuo.score.view.MyViewPager;

public class MainActivity extends AppCompatActivity {

    private MyViewPager mViewPager;
    private TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (MyViewPager) findViewById(R.id.container);
        mViewPager.setCanScrollTo(false);
        tabs = (TabLayout) findViewById(R.id.tabs);

        initViews();

    }

    private void initViews() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new ZeroFragment());
        fragments.add(new OneFragment());
        fragments.add(new TwoFragment());

        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager(), fragments);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        tabs.setupWithViewPager(mViewPager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        if (ZzuApplication.ISLOGIN) {
            menu.removeItem(R.id.login);
        } else {
            menu.removeItem(R.id.me);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.login: {
                break;
            }
            case R.id.me: {
                break;
            }
            case R.id.share: {
                break;
            }
            case R.id.about: {
                break;
            }
        }

        return super.onOptionsItemSelected(item);
    }
}
