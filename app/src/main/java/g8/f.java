package g8;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.api.Api;
import java.util.WeakHashMap;
import lib.zj.office.fc.hslf.record.SlideAtom;
import x0.f0;
import x0.n0;

/* compiled from: HeaderBehavior.java */
/* loaded from: classes2.dex */
public abstract class f<V extends View> extends h<V> {
    public a c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f17680d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17681e;

    /* renamed from: f  reason: collision with root package name */
    public int f17682f;

    /* renamed from: g  reason: collision with root package name */
    public int f17683g;

    /* renamed from: h  reason: collision with root package name */
    public int f17684h;

    /* renamed from: i  reason: collision with root package name */
    public VelocityTracker f17685i;

    /* compiled from: HeaderBehavior.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final CoordinatorLayout f17686a;

        /* renamed from: b  reason: collision with root package name */
        public final V f17687b;

        public a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f17686a = coordinatorLayout;
            this.f17687b = v10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar;
            OverScroller overScroller;
            V v10 = this.f17687b;
            if (v10 != null && (overScroller = (fVar = f.this).f17680d) != null) {
                boolean computeScrollOffset = overScroller.computeScrollOffset();
                CoordinatorLayout coordinatorLayout = this.f17686a;
                if (computeScrollOffset) {
                    fVar.A(coordinatorLayout, v10, fVar.f17680d.getCurrY());
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    f0.d.m(v10, this);
                    return;
                }
                fVar.y(v10, coordinatorLayout);
            }
        }
    }

    public f() {
        this.f17682f = -1;
        this.f17684h = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(CoordinatorLayout coordinatorLayout, View view, int i10) {
        z(coordinatorLayout, view, i10, SlideAtom.USES_MASTER_SLIDE_ID, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        int findPointerIndex;
        if (this.f17684h < 0) {
            this.f17684h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f17681e) {
            int i10 = this.f17682f;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f17683g) > this.f17684h) {
                this.f17683g = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f17682f = -1;
            int x4 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            if (v(v10) && coordinatorLayout.s(v10, x4, y11)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f17681e = z10;
            if (z10) {
                this.f17683g = y11;
                this.f17682f = motionEvent.getPointerId(0);
                if (this.f17685i == null) {
                    this.f17685i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f17680d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f17680d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f17685i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.f.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean v(V v10) {
        return false;
    }

    public int w(V v10) {
        return -v10.getHeight();
    }

    public int x(V v10) {
        return v10.getHeight();
    }

    public int z(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int n10;
        int s4 = s();
        if (i11 != 0 && s4 >= i11 && s4 <= i12 && s4 != (n10 = com.google.android.play.core.assetpacks.c.n(i10, i11, i12))) {
            i iVar = this.f17691a;
            if (iVar != null) {
                iVar.b(n10);
            } else {
                this.f17692b = n10;
            }
            return s4 - n10;
        }
        return 0;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17682f = -1;
        this.f17684h = -1;
    }

    public void y(View view, CoordinatorLayout coordinatorLayout) {
    }
}
