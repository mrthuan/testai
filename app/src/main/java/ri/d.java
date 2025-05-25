package ri;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: ScaleGestureDetector.java */
/* loaded from: classes3.dex */
public final class d extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f29598a;

    public d(e eVar) {
        this.f29598a = eVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        e eVar = this.f29598a;
        eVar.f29610m = x4;
        eVar.f29611n = motionEvent.getY();
        eVar.f29612o = 1;
        return true;
    }
}
