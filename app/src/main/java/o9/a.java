package o9;

import android.app.PendingIntent;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f22746a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22747b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22748d;

    /* renamed from: e  reason: collision with root package name */
    public final long f22749e;

    /* renamed from: f  reason: collision with root package name */
    public final long f22750f;

    /* renamed from: g  reason: collision with root package name */
    public final long f22751g;

    /* renamed from: h  reason: collision with root package name */
    public final long f22752h;

    /* renamed from: i  reason: collision with root package name */
    public final PendingIntent f22753i;

    /* renamed from: j  reason: collision with root package name */
    public final PendingIntent f22754j;

    /* renamed from: k  reason: collision with root package name */
    public final PendingIntent f22755k;

    /* renamed from: l  reason: collision with root package name */
    public final PendingIntent f22756l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f22757m = false;

    public a(int i10, int i11, int i12, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.f22746a = i10;
        this.f22747b = i11;
        this.c = i12;
        this.f22748d = i13;
        this.f22749e = j10;
        this.f22750f = j11;
        this.f22751g = j12;
        this.f22752h = j13;
        this.f22753i = pendingIntent;
        this.f22754j = pendingIntent2;
        this.f22755k = pendingIntent3;
        this.f22756l = pendingIntent4;
    }

    public final boolean a(int i10) {
        if (b(c.c(i10).a()) != null) {
            return true;
        }
        return false;
    }

    public final PendingIntent b(p pVar) {
        long j10 = this.f22752h;
        long j11 = this.f22751g;
        boolean z10 = false;
        boolean z11 = pVar.f22783b;
        int i10 = pVar.f22782a;
        if (i10 == 0) {
            PendingIntent pendingIntent = this.f22754j;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (z11 && j11 <= j10) {
                z10 = true;
            }
            if (!z10) {
                return null;
            }
            return this.f22756l;
        }
        if (i10 == 1) {
            PendingIntent pendingIntent2 = this.f22753i;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (z11 && j11 <= j10) {
                z10 = true;
            }
            if (z10) {
                return this.f22755k;
            }
        }
        return null;
    }
}
