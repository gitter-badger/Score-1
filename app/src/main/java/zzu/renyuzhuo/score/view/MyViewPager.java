package zzu.renyuzhuo.score.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by RenYuZhuo on 2016/5/17.
 */
public class MyViewPager extends ViewPager {

    private boolean canScrollTo = true;

    public MyViewPager(Context context) {
        super(context);
    }

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (canScrollTo) {
            return super.onInterceptTouchEvent(ev);
        } else {
            return false;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (canScrollTo) {
            return super.onTouchEvent(ev);
        } else {
            return false;
        }
    }

    public void setCanScrollTo(boolean canScrollTo) {
        this.canScrollTo = canScrollTo;
    }

}
