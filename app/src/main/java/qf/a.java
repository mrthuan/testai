package qf;

import jp.co.cyberagent.android.gpuimage.GPUImage;

/* compiled from: GPUImage.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GPUImage f29315a;

    public a(GPUImage gPUImage) {
        this.f29315a = gPUImage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f29315a.f19393f) {
            this.f29315a.f19393f.d();
            this.f29315a.f19393f.notify();
        }
    }
}
