package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.a;
import g0.d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Carousel extends MotionHelper {

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<View> f2942m;

    /* renamed from: n  reason: collision with root package name */
    public int f2943n;

    /* renamed from: o  reason: collision with root package name */
    public MotionLayout f2944o;

    /* renamed from: p  reason: collision with root package name */
    public int f2945p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2946q;

    /* renamed from: r  reason: collision with root package name */
    public int f2947r;

    /* renamed from: s  reason: collision with root package name */
    public int f2948s;

    /* renamed from: t  reason: collision with root package name */
    public int f2949t;

    /* renamed from: u  reason: collision with root package name */
    public int f2950u;

    /* renamed from: v  reason: collision with root package name */
    public float f2951v;

    /* renamed from: w  reason: collision with root package name */
    public int f2952w;

    /* renamed from: x  reason: collision with root package name */
    public int f2953x;

    /* renamed from: y  reason: collision with root package name */
    public float f2954y;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Carousel carousel = Carousel.this;
            carousel.f2944o.setProgress(0.0f);
            carousel.getClass();
            carousel.getClass();
            int i10 = carousel.f2943n;
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public Carousel(Context context) {
        super(context);
        this.f2942m = new ArrayList<>();
        this.f2943n = 0;
        this.f2945p = -1;
        this.f2946q = false;
        this.f2947r = -1;
        this.f2948s = -1;
        this.f2949t = -1;
        this.f2950u = -1;
        this.f2951v = 0.9f;
        this.f2952w = 4;
        this.f2953x = 1;
        this.f2954y = 2.0f;
        new a();
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.i
    public final void b(int i10, MotionLayout motionLayout) {
        int i11 = this.f2943n;
        if (i10 == this.f2950u) {
            this.f2943n = i11 + 1;
        } else if (i10 == this.f2949t) {
            this.f2943n = i11 - 1;
        }
        if (this.f2946q) {
            throw null;
        }
        throw null;
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return this.f2943n;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i10 = 0; i10 < this.f3272b; i10++) {
                this.f2942m.add(motionLayout.c(this.f3271a[i10]));
            }
            this.f2944o = motionLayout;
            if (this.f2953x == 2) {
                a.b y10 = motionLayout.y(this.f2948s);
                if (y10 != null && (bVar2 = y10.f3096l) != null) {
                    bVar2.c = 5;
                }
                a.b y11 = this.f2944o.y(this.f2947r);
                if (y11 != null && (bVar = y11.f3096l) != null) {
                    bVar.c = 5;
                }
            }
        }
    }

    public final void v(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f17339a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 2) {
                    this.f2945p = obtainStyledAttributes.getResourceId(index, this.f2945p);
                } else if (index == 0) {
                    this.f2947r = obtainStyledAttributes.getResourceId(index, this.f2947r);
                } else if (index == 3) {
                    this.f2948s = obtainStyledAttributes.getResourceId(index, this.f2948s);
                } else if (index == 1) {
                    this.f2952w = obtainStyledAttributes.getInt(index, this.f2952w);
                } else if (index == 6) {
                    this.f2949t = obtainStyledAttributes.getResourceId(index, this.f2949t);
                } else if (index == 5) {
                    this.f2950u = obtainStyledAttributes.getResourceId(index, this.f2950u);
                } else if (index == 8) {
                    this.f2951v = obtainStyledAttributes.getFloat(index, this.f2951v);
                } else if (index == 7) {
                    this.f2953x = obtainStyledAttributes.getInt(index, this.f2953x);
                } else if (index == 9) {
                    this.f2954y = obtainStyledAttributes.getFloat(index, this.f2954y);
                } else if (index == 4) {
                    this.f2946q = obtainStyledAttributes.getBoolean(index, this.f2946q);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2942m = new ArrayList<>();
        this.f2943n = 0;
        this.f2945p = -1;
        this.f2946q = false;
        this.f2947r = -1;
        this.f2948s = -1;
        this.f2949t = -1;
        this.f2950u = -1;
        this.f2951v = 0.9f;
        this.f2952w = 4;
        this.f2953x = 1;
        this.f2954y = 2.0f;
        new a();
        v(context, attributeSet);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.i
    public final void a() {
    }

    public void setAdapter(b bVar) {
    }

    public Carousel(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2942m = new ArrayList<>();
        this.f2943n = 0;
        this.f2945p = -1;
        this.f2946q = false;
        this.f2947r = -1;
        this.f2948s = -1;
        this.f2949t = -1;
        this.f2950u = -1;
        this.f2951v = 0.9f;
        this.f2952w = 4;
        this.f2953x = 1;
        this.f2954y = 2.0f;
        new a();
        v(context, attributeSet);
    }
}
