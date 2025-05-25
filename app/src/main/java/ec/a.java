package ec;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.viewpager.widget.ViewPager;
import dc.b;

/* compiled from: RefreshContentWrapper.java */
/* loaded from: classes2.dex */
public final class a implements bc.a, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public View f16551a;

    /* renamed from: b  reason: collision with root package name */
    public final View f16552b;
    public View c;

    /* renamed from: d  reason: collision with root package name */
    public View f16553d;

    /* renamed from: e  reason: collision with root package name */
    public View f16554e;

    /* renamed from: f  reason: collision with root package name */
    public int f16555f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16556g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16557h = true;

    /* renamed from: i  reason: collision with root package name */
    public cc.a f16558i = new cc.a();

    public a(View view) {
        this.c = view;
        this.f16552b = view;
        this.f16551a = view;
    }

    public static View c(View view, PointF pointF, View view2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            PointF pointF2 = new PointF();
            while (childCount > 0) {
                childCount--;
                View childAt = viewGroup.getChildAt(childCount);
                if (b.e(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if ((childAt instanceof ViewPager) || !b.d(childAt)) {
                        pointF.offset(pointF2.x, pointF2.y);
                        View c = c(childAt, pointF, view2);
                        pointF.offset(-pointF2.x, -pointF2.y);
                        return c;
                    }
                    return childAt;
                }
            }
        }
        return view2;
    }

    public final boolean a() {
        if (this.f16557h && this.f16558i.a(this.f16551a)) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f16556g && this.f16558i.b(this.f16551a)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r7, int r8, int r9) {
        /*
            r6 = this;
            r0 = 1
            android.view.View r1 = r6.f16552b
            r2 = 0
            r3 = 0
            r4 = -1
            if (r8 == r4) goto L21
            android.view.View r8 = r1.findViewById(r8)
            if (r8 == 0) goto L21
            if (r7 <= 0) goto L16
            float r5 = (float) r7
            r8.setTranslationY(r5)
            r8 = r0
            goto L22
        L16:
            float r5 = r8.getTranslationY()
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 <= 0) goto L21
            r8.setTranslationY(r2)
        L21:
            r8 = r3
        L22:
            if (r9 == r4) goto L3c
            android.view.View r9 = r1.findViewById(r9)
            if (r9 == 0) goto L3c
            if (r7 >= 0) goto L31
            float r8 = (float) r7
            r9.setTranslationY(r8)
            goto L3d
        L31:
            float r0 = r9.getTranslationY()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3c
            r9.setTranslationY(r2)
        L3c:
            r0 = r8
        L3d:
            if (r0 != 0) goto L44
            float r8 = (float) r7
            r1.setTranslationY(r8)
            goto L47
        L44:
            r1.setTranslationY(r2)
        L47:
            android.view.View r8 = r6.f16553d
            if (r8 == 0) goto L53
            int r9 = java.lang.Math.max(r3, r7)
            float r9 = (float) r9
            r8.setTranslationY(r9)
        L53:
            android.view.View r8 = r6.f16554e
            if (r8 == 0) goto L5f
            int r7 = java.lang.Math.min(r3, r7)
            float r7 = (float) r7
            r8.setTranslationY(r7)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.a.d(int, int, int):void");
    }

    public final a e(int i10) {
        View view = this.c;
        if (view != null && i10 != 0) {
            if ((i10 < 0 && view.canScrollVertically(1)) || (i10 > 0 && this.c.canScrollVertically(-1))) {
                this.f16555f = i10;
                return this;
            }
            return null;
        }
        return null;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = (intValue - this.f16555f) * this.c.getScaleY();
            View view = this.c;
            if (view instanceof AbsListView) {
                float f10 = b.f16186a;
                ((AbsListView) view).scrollListBy((int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        this.f16555f = intValue;
    }
}
