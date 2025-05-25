package w2;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30939a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Notification f30940b;
    public final /* synthetic */ SystemForegroundService c;

    public d(SystemForegroundService systemForegroundService, int i10, Notification notification) {
        this.c = systemForegroundService;
        this.f30939a = i10;
        this.f30940b = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f4966e.notify(this.f30939a, this.f30940b);
    }
}
