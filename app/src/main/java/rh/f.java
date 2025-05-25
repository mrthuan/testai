package rh;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import lib.zj.office.pg.control.Presentation;

/* compiled from: PGEventManage.java */
/* loaded from: classes3.dex */
public final class f extends pi.b {

    /* renamed from: t  reason: collision with root package name */
    public final Presentation f29564t;

    public f(Presentation presentation, lib.zj.office.system.f fVar) {
        super(presentation.getContext(), fVar);
        this.f29564t = presentation;
        presentation.setOnTouchListener(this);
        presentation.setLongClickable(true);
    }

    @Override // pi.b
    public final void c() {
        super.c();
    }

    @Override // pi.b
    public final void d(int i10, int i11) {
        Presentation presentation = this.f29564t;
        if (presentation.f20936p) {
            if (Math.abs(i11) < 400 && Math.abs(i10) < 400) {
                presentation.o((byte) 3);
                return;
            }
            int currentIndex = presentation.getCurrentIndex();
            if (Math.abs(i11) > Math.abs(i10)) {
                if (i11 < 0 && currentIndex >= 0) {
                    presentation.o((byte) 3);
                } else if (i11 > 0 && currentIndex <= presentation.getRealSlideCount() - 1) {
                    presentation.o((byte) 2);
                }
            } else if (i10 < 0 && currentIndex >= 0) {
                presentation.o((byte) 4);
            } else if (i10 > 0 && currentIndex < presentation.getRealSlideCount() - 1) {
                presentation.o((byte) 5);
            }
        }
    }

    @Override // pi.b, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        super.onDoubleTap(motionEvent);
        return true;
    }

    @Override // pi.b, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        super.onScroll(motionEvent, motionEvent2, f10, f11);
        return true;
    }

    @Override // pi.b, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        super.onSingleTapUp(motionEvent);
        if (motionEvent.getAction() == 1) {
            Presentation presentation = this.f29564t;
            Rect slideDrawingRect = presentation.getSlideDrawingRect();
            if (presentation.f20936p && slideDrawingRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                presentation.o((byte) 3);
            }
        }
        return true;
    }

    @Override // pi.b, android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        super.onTouch(view, motionEvent);
        return false;
    }
}
