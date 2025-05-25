package r8;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: InsetDialogOnTouchListener.java */
/* loaded from: classes2.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final Dialog f29482a;

    /* renamed from: b  reason: collision with root package name */
    public final int f29483b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f29484d;

    public a(Dialog dialog, Rect rect) {
        this.f29482a = dialog;
        this.f29483b = rect.left;
        this.c = rect.top;
        this.f29484d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f29483b;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.c;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f29484d;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f29482a.onTouchEvent(obtain);
    }
}
