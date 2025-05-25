package o2;

import android.app.Notification;

/* compiled from: ForegroundInfo.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f22682a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22683b;
    public final Notification c;

    public d(int i10, int i11, Notification notification) {
        this.f22682a = i10;
        this.c = notification;
        this.f22683b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f22682a != dVar.f22682a || this.f22683b != dVar.f22683b) {
            return false;
        }
        return this.c.equals(dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f22682a * 31) + this.f22683b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f22682a + ", mForegroundServiceType=" + this.f22683b + ", mNotification=" + this.c + '}';
    }
}
