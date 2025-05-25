package sp;

import java.io.File;

/* compiled from: ActivityOffice.java */
/* loaded from: classes3.dex */
public abstract class a extends rg.c {

    /* renamed from: d  reason: collision with root package name */
    public Runnable f29838d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f29839e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f29840f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f29841g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f29842h;

    @Override // lib.zj.office.system.i
    public final File G0() {
        return ((f) this).f29850i.f29853b.getCacheDir();
    }

    @Override // lib.zj.office.system.i
    public final void K() {
        Runnable runnable = this.f29839e;
        if (runnable != null) {
            runnable.run();
        }
        this.f29842h = true;
    }

    @Override // lib.zj.office.system.i
    public final void X0() {
        Runnable runnable = this.f29840f;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // lib.zj.office.system.i
    public final void l0(boolean z10) {
        Runnable runnable;
        if (z10 && (runnable = this.f29840f) != null) {
            runnable.run();
        }
    }

    @Override // lib.zj.office.system.i
    public final String x0() {
        return ((f) this).f29850i.f29853b.getPackageName();
    }
}
