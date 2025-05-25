package w2;

import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30941a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f30942b;

    public e(SystemForegroundService systemForegroundService, int i10) {
        this.f30942b = systemForegroundService;
        this.f30941a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30942b.f4966e.cancel(this.f30941a);
    }
}
