package g8;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import lib.zj.office.fc.hslf.record.SlideAtom;
import x0.f0;
import x0.n0;
import x0.s0;

/* compiled from: HeaderScrollingViewBehavior.java */
/* loaded from: classes2.dex */
public abstract class g extends h<View> {
    public final Rect c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f17688d;

    /* renamed from: e  reason: collision with root package name */
    public int f17689e;

    /* renamed from: f  reason: collision with root package name */
    public int f17690f;

    public g() {
        this.c = new Rect();
        this.f17688d = new Rect();
        this.f17689e = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        AppBarLayout v10;
        int i13;
        s0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 == -1 || i14 == -2) && (v10 = v(coordinatorLayout.i(view))) != null) {
            int size = View.MeasureSpec.getSize(i12);
            if (size > 0) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                if (f0.d.b(v10) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.b() + lastWindowInsets.e();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int x4 = x(v10) + size;
            int measuredHeight = v10.getMeasuredHeight();
            if (this instanceof SearchBar.ScrollingViewBehavior) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                x4 -= measuredHeight;
            }
            if (i14 == -1) {
                i13 = 1073741824;
            } else {
                i13 = SlideAtom.USES_MASTER_SLIDE_ID;
            }
            coordinatorLayout.v(view, i10, i11, View.MeasureSpec.makeMeasureSpec(x4, i13));
            return true;
        }
        return false;
    }

    @Override // g8.h
    public final void u(CoordinatorLayout coordinatorLayout, View view, int i10) {
        AppBarLayout v10 = v(coordinatorLayout.i(view));
        int i11 = 0;
        if (v10 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
            int bottom = v10.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
            int height = coordinatorLayout.getHeight();
            Rect rect = this.c;
            rect.set(paddingLeft, bottom, width, ((v10.getBottom() + height) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            s0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                if (f0.d.b(coordinatorLayout) && !f0.d.b(view)) {
                    rect.left = lastWindowInsets.c() + rect.left;
                    rect.right -= lastWindowInsets.d();
                }
            }
            Rect rect2 = this.f17688d;
            int i12 = fVar.c;
            if (i12 == 0) {
                i12 = 8388659;
            }
            x0.f.b(i12, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            if (this.f17690f != 0) {
                float w7 = w(v10);
                int i13 = this.f17690f;
                i11 = com.google.android.play.core.assetpacks.c.n((int) (w7 * i13), 0, i13);
            }
            view.layout(rect2.left, rect2.top - i11, rect2.right, rect2.bottom - i11);
            this.f17689e = rect2.top - v10.getBottom();
            return;
        }
        coordinatorLayout.u(view, i10);
        this.f17689e = 0;
    }

    public abstract AppBarLayout v(ArrayList arrayList);

    public float w(View view) {
        return 1.0f;
    }

    public int x(View view) {
        return view.getMeasuredHeight();
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.f17688d = new Rect();
        this.f17689e = 0;
    }
}
