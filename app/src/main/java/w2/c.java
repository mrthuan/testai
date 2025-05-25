package w2;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30936a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Notification f30937b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f30938d;

    public c(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f30938d = systemForegroundService;
        this.f30936a = i10;
        this.f30937b = notification;
        this.c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = Build.VERSION.SDK_INT;
        Notification notification = this.f30937b;
        int i11 = this.f30936a;
        SystemForegroundService systemForegroundService = this.f30938d;
        if (i10 >= 29) {
            systemForegroundService.startForeground(i11, notification, this.c);
        } else {
            systemForegroundService.startForeground(i11, notification);
        }
    }
}
