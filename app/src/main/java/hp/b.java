package hp;

import android.content.Context;
import java.lang.ref.WeakReference;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;

/* compiled from: CameraRotationObserver.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f18391a;

    /* renamed from: b  reason: collision with root package name */
    public a f18392b;
    public final c c;

    /* renamed from: d  reason: collision with root package name */
    public int f18393d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f18394e = 0;

    static {
        ea.a.p("DGFcZQthZW8uYT5pGm4nYkZlHHYgcg==", "MhPlPgxZ");
    }

    public b(CameraActivity cameraActivity, CameraActivity cameraActivity2) {
        this.f18391a = new WeakReference<>(cameraActivity);
        this.c = cameraActivity2;
        a aVar = new a(this, cameraActivity);
        this.f18392b = aVar;
        if (aVar.canDetectOrientation()) {
            this.f18392b.enable();
        }
    }
}
