package pdf.pdfreader.viewer.editor.free.ui.myview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes3.dex */
public class ReaderViewPager extends ViewPager {

    /* renamed from: d0  reason: collision with root package name */
    public boolean f28108d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f28109e0;

    public ReaderViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!this.f28108d0) {
                return false;
            }
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.f28108d0) {
                if (super.onTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return true;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i10) {
        if (!this.f28109e0) {
            w(i10, false);
        } else if (this.f28108d0) {
            super.setCurrentItem(i10);
        } else {
            w(i10, false);
        }
    }

    public void setEnableScroll(boolean z10) {
        this.f28108d0 = z10;
    }

    public void setSmoothScroll(boolean z10) {
        this.f28109e0 = z10;
    }

    public ReaderViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
