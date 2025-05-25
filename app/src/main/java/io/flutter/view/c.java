package io.flutter.view;

import android.view.SurfaceHolder;

/* compiled from: FlutterView.java */
/* loaded from: classes.dex */
public final class c implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FlutterView f18944a;

    public c(FlutterView flutterView) {
        this.f18944a = flutterView;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        FlutterView flutterView = this.f18944a;
        flutterView.h();
        flutterView.f18916k.f18940d.onSurfaceChanged(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        FlutterView flutterView = this.f18944a;
        flutterView.h();
        flutterView.f18916k.f18940d.onSurfaceCreated(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        FlutterView flutterView = this.f18944a;
        flutterView.h();
        flutterView.f18916k.f18940d.onSurfaceDestroyed();
    }
}
