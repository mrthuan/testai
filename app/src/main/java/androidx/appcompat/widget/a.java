package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: AbsActionBarView.java */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final C0008a f2479a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2480b;
    public ActionMenuView c;

    /* renamed from: d  reason: collision with root package name */
    public c f2481d;

    /* renamed from: e  reason: collision with root package name */
    public int f2482e;

    /* renamed from: f  reason: collision with root package name */
    public x0.n0 f2483f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2484g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2485h;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0008a implements x0.o0 {

        /* renamed from: b  reason: collision with root package name */
        public boolean f2486b = false;
        public int c;

        public C0008a() {
        }

        @Override // x0.o0
        public final void a() {
            if (this.f2486b) {
                return;
            }
            a aVar = a.this;
            aVar.f2483f = null;
            a.super.setVisibility(this.c);
        }

        @Override // x0.o0
        public final void d(View view) {
            this.f2486b = true;
        }

        @Override // x0.o0
        public final void f() {
            a.super.setVisibility(0);
            this.f2486b = false;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int c(int i10, int i11, View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, SlideAtom.USES_MASTER_SLIDE_ID), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - 0);
    }

    public static int d(View view, boolean z10, int i10, int i11, int i12) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        if (z10) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final x0.n0 e(int i10, long j10) {
        x0.n0 n0Var = this.f2483f;
        if (n0Var != null) {
            n0Var.b();
        }
        C0008a c0008a = this.f2479a;
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            x0.n0 a10 = x0.f0.a(this);
            a10.a(1.0f);
            a10.c(j10);
            a.this.f2483f = a10;
            c0008a.c = i10;
            a10.d(c0008a);
            return a10;
        }
        x0.n0 a11 = x0.f0.a(this);
        a11.a(0.0f);
        a11.c(j10);
        a.this.f2483f = a11;
        c0008a.c = i10;
        a11.d(c0008a);
        return a11;
    }

    public int getAnimatedVisibility() {
        if (this.f2483f != null) {
            return this.f2479a.c;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f2482e;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, k.a.f19429a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f2481d;
        if (cVar != null) {
            Configuration configuration2 = cVar.f2002b.getResources().getConfiguration();
            int i11 = configuration2.screenWidthDp;
            int i12 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i11 <= 600 && ((i11 <= 960 || i12 <= 720) && (i11 <= 720 || i12 <= 960))) {
                if (i11 < 500 && ((i11 <= 640 || i12 <= 480) && (i11 <= 480 || i12 <= 640))) {
                    if (i11 >= 360) {
                        i10 = 3;
                    } else {
                        i10 = 2;
                    }
                } else {
                    i10 = 4;
                }
            } else {
                i10 = 5;
            }
            cVar.f2537q = i10;
            androidx.appcompat.view.menu.h hVar = cVar.c;
            if (hVar != null) {
                hVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2485h = false;
        }
        if (!this.f2485h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2485h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2485h = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2484g = false;
        }
        if (!this.f2484g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2484g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2484g = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f2482e = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            x0.n0 n0Var = this.f2483f;
            if (n0Var != null) {
                n0Var.b();
            }
            super.setVisibility(i10);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2479a = new C0008a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f2480b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f2480b = context;
        }
    }
}
