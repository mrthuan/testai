package pdf.pdfreader.viewer.editor.free.camera.widget;

import android.view.SurfaceHolder;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.camera.widget.CameraView;

/* compiled from: CameraView.kt */
/* loaded from: classes3.dex */
public final class b implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CameraView f24122a;

    public b(CameraView cameraView) {
        this.f24122a = cameraView;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder holder, int i10, int i11, int i12) {
        g.e(holder, "holder");
        CameraView.a aVar = this.f24122a.f24114e;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder holder) {
        CameraView.a aVar;
        g.e(holder, "holder");
        if (holder.getSurface() != null && (aVar = this.f24122a.f24114e) != null) {
            aVar.c();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder holder) {
        g.e(holder, "holder");
        CameraView.a aVar = this.f24122a.f24114e;
        if (aVar != null) {
            aVar.a();
        }
    }
}
