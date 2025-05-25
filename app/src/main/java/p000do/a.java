package p000do;

import android.view.ScaleGestureDetector;
import p000do.k;

/* compiled from: CustomGestureDetector.java */
/* renamed from: do.a  reason: invalid package */
/* loaded from: classes3.dex */
public final class a implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f16266a;

    public a(b bVar) {
        this.f16266a = bVar;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
            if (scaleFactor >= 0.0f) {
                ((k.a) this.f16266a.f16275j).a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
