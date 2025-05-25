package k0;

import android.app.Notification;
import android.os.Bundle;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class o extends r {

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f19491b;

    @Override // k0.r
    public final void a(Bundle bundle) {
        super.a(bundle);
    }

    @Override // k0.r
    public final void b(s sVar) {
        new Notification.BigTextStyle(sVar.f19519b).setBigContentTitle(null).bigText(this.f19491b);
    }

    @Override // k0.r
    public final String e() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
