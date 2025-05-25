package k0;

import android.os.Build;
import android.widget.RemoteViews;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class q extends r {
    @Override // k0.r
    public final void b(s sVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            sVar.f19519b.setStyle(com.google.android.gms.internal.ads.b.b());
        }
    }

    @Override // k0.r
    public final String e() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    @Override // k0.r
    public final RemoteViews f() {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        p pVar = this.f19517a;
        RemoteViews remoteViews = pVar.f19511u;
        if (remoteViews == null) {
            remoteViews = pVar.f19510t;
        }
        if (remoteViews == null) {
            return null;
        }
        return j(remoteViews, true);
    }

    @Override // k0.r
    public final RemoteViews g() {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT >= 24 || (remoteViews = this.f19517a.f19510t) == null) {
            return null;
        }
        return j(remoteViews, false);
    }

    @Override // k0.r
    public final RemoteViews h() {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        p pVar = this.f19517a;
        RemoteViews remoteViews2 = pVar.f19512v;
        if (remoteViews2 != null) {
            remoteViews = remoteViews2;
        } else {
            remoteViews = pVar.f19510t;
        }
        if (remoteViews2 == null) {
            return null;
        }
        return j(remoteViews, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.widget.RemoteViews j(android.widget.RemoteViews r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.q.j(android.widget.RemoteViews, boolean):android.widget.RemoteViews");
    }
}
