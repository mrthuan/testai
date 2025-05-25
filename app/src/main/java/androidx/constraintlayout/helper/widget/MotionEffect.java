package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import g0.d;

/* loaded from: classes.dex */
public class MotionEffect extends MotionHelper {

    /* renamed from: m  reason: collision with root package name */
    public float f2987m;

    /* renamed from: n  reason: collision with root package name */
    public int f2988n;

    /* renamed from: o  reason: collision with root package name */
    public int f2989o;

    /* renamed from: p  reason: collision with root package name */
    public int f2990p;

    /* renamed from: q  reason: collision with root package name */
    public int f2991q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2992r;

    /* renamed from: s  reason: collision with root package name */
    public int f2993s;

    /* renamed from: t  reason: collision with root package name */
    public int f2994t;

    public MotionEffect(Context context) {
        super(context);
        this.f2987m = 0.1f;
        this.f2988n = 49;
        this.f2989o = 50;
        this.f2990p = 0;
        this.f2991q = 0;
        this.f2992r = true;
        this.f2993s = -1;
        this.f2994t = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0184, code lost:
        if (r14 == 0.0f) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b5  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(androidx.constraintlayout.motion.widget.MotionLayout r21, java.util.HashMap<android.view.View, f0.n> r22) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.u(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    public final void v(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f17355r);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 3) {
                    int i11 = obtainStyledAttributes.getInt(index, this.f2988n);
                    this.f2988n = i11;
                    this.f2988n = Math.max(Math.min(i11, 99), 0);
                } else if (index == 1) {
                    int i12 = obtainStyledAttributes.getInt(index, this.f2989o);
                    this.f2989o = i12;
                    this.f2989o = Math.max(Math.min(i12, 99), 0);
                } else if (index == 5) {
                    this.f2990p = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2990p);
                } else if (index == 6) {
                    this.f2991q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2991q);
                } else if (index == 0) {
                    this.f2987m = obtainStyledAttributes.getFloat(index, this.f2987m);
                } else if (index == 2) {
                    this.f2994t = obtainStyledAttributes.getInt(index, this.f2994t);
                } else if (index == 4) {
                    this.f2992r = obtainStyledAttributes.getBoolean(index, this.f2992r);
                } else if (index == 7) {
                    this.f2993s = obtainStyledAttributes.getResourceId(index, this.f2993s);
                }
            }
            int i13 = this.f2988n;
            int i14 = this.f2989o;
            if (i13 == i14) {
                if (i13 > 0) {
                    this.f2988n = i13 - 1;
                } else {
                    this.f2989o = i14 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2987m = 0.1f;
        this.f2988n = 49;
        this.f2989o = 50;
        this.f2990p = 0;
        this.f2991q = 0;
        this.f2992r = true;
        this.f2993s = -1;
        this.f2994t = -1;
        v(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2987m = 0.1f;
        this.f2988n = 49;
        this.f2989o = 50;
        this.f2990p = 0;
        this.f2991q = 0;
        this.f2992r = true;
        this.f2993s = -1;
        this.f2994t = -1;
        v(context, attributeSet);
    }
}
