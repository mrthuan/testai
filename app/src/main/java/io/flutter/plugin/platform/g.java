package io.flutter.plugin.platform;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* compiled from: PlatformViewWrapper.java */
@TargetApi(23)
/* loaded from: classes.dex */
public final class g extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public int f18807a;

    /* renamed from: b  reason: collision with root package name */
    public int f18808b;
    public SurfaceTexture c;

    /* renamed from: d  reason: collision with root package name */
    public Surface f18809d;

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public final void draw(Canvas canvas) {
        SurfaceTexture surfaceTexture;
        boolean isReleased;
        Surface surface = this.f18809d;
        if (surface == null) {
            super.draw(canvas);
        } else if (surface.isValid() && (surfaceTexture = this.c) != null) {
            isReleased = surfaceTexture.isReleased();
            if (!isReleased) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 != 29) {
                    Canvas lockHardwareCanvas = this.f18809d.lockHardwareCanvas();
                    try {
                        lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        super.draw(lockHardwareCanvas);
                        if (i10 != 29) {
                            return;
                        }
                        throw null;
                    } finally {
                        this.f18809d.unlockCanvasAndPost(lockHardwareCanvas);
                    }
                }
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"NewApi"})
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getImportantForAccessibility() == 4) {
            return false;
        }
        return super.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
