package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* compiled from: ForwardingListener.java */
/* loaded from: classes.dex */
public abstract class d0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final float f2556a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2557b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final View f2558d;

    /* renamed from: e  reason: collision with root package name */
    public a f2559e;

    /* renamed from: f  reason: collision with root package name */
    public b f2560f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2561g;

    /* renamed from: h  reason: collision with root package name */
    public int f2562h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f2563i = new int[2];

    /* compiled from: ForwardingListener.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = d0.this.f2558d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d0 d0Var = d0.this;
            d0Var.a();
            View view = d0Var.f2558d;
            if (view.isEnabled() && !view.isLongClickable() && d0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                d0Var.f2561g = true;
            }
        }
    }

    public d0(View view) {
        this.f2558d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2556a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2557b = tapTimeout;
        this.c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f2560f;
        View view = this.f2558d;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.f2559e;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    public abstract androidx.appcompat.view.menu.q b();

    public abstract boolean c();

    public boolean d() {
        androidx.appcompat.view.menu.q b10 = b();
        if (b10 != null && b10.a()) {
            b10.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r4 != 3) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010c  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2561g = false;
        this.f2562h = -1;
        a aVar = this.f2559e;
        if (aVar != null) {
            this.f2558d.removeCallbacks(aVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
