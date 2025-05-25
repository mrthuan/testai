package ng;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: CustomScaleGestureDetector.java */
/* loaded from: classes.dex */
public final class a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f22462a;

    public a(b bVar) {
        this.f22462a = bVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        b bVar = this.f22462a;
        bVar.f22474m = x4;
        bVar.f22475n = motionEvent.getY();
        bVar.f22476o = 1;
        return true;
    }
}
