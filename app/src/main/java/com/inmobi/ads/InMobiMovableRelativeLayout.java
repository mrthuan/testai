package com.inmobi.ads;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.media.F4;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class InMobiMovableRelativeLayout extends RelativeLayout {
    public static final F4 Companion = new F4();

    /* renamed from: a  reason: collision with root package name */
    public WeakReference f14070a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup.LayoutParams f14071b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public float f14072d;

    /* renamed from: e  reason: collision with root package name */
    public float f14073e;

    public InMobiMovableRelativeLayout(Context context) {
        super(context);
        this.f14070a = new WeakReference(null);
        this.c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    private final void setParentView(ViewGroup viewGroup) {
        this.f14070a = new WeakReference(viewGroup);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        g.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        setParentView((ViewGroup) parent);
        if (this.f14071b == null) {
            this.f14071b = getLayoutParams();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setParentView(null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        ViewGroup viewGroup;
        g.e(ev, "ev");
        if (this.c) {
            float rawX = ev.getRawX();
            float rawY = ev.getRawY();
            int action = ev.getAction();
            if (action != 0) {
                if (action == 2 && (viewGroup = (ViewGroup) this.f14070a.get()) != null) {
                    int left = (int) (getLeft() + (rawX - this.f14072d));
                    int top = (int) (getTop() + (rawY - this.f14073e));
                    int paddingLeft = viewGroup.getPaddingLeft();
                    int paddingTop = viewGroup.getPaddingTop();
                    int width = viewGroup.getWidth() - viewGroup.getPaddingRight();
                    int height = viewGroup.getHeight() - viewGroup.getPaddingBottom();
                    int max = Math.max(paddingLeft, Math.min(left, width - getWidth()));
                    int max2 = Math.max(paddingTop, Math.min(top, height - getHeight()));
                    layout(max, max2, getWidth() + max, getHeight() + max2);
                    this.f14072d = rawX;
                    this.f14073e = rawY;
                }
            } else {
                this.f14072d = rawX;
                this.f14073e = rawY;
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    public final void resetPosition() {
        setLayoutParams(this.f14071b);
    }

    public final void setIsMovable(boolean z10) {
        this.c = z10;
    }

    public InMobiMovableRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14070a = new WeakReference(null);
        this.c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    public InMobiMovableRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14070a = new WeakReference(null);
        this.c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }
}
