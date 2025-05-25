package a8;

import a8.v;
import a8.v1;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzko;
import j3.h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class v1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final long f367a;

    /* renamed from: b  reason: collision with root package name */
    public final long f368b;
    public final /* synthetic */ j3.h c;

    public v1(j3.h hVar, long j10, long j11) {
        this.c = hVar;
        this.f367a = j10;
        this.f368b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgb zzgbVar = ((zzge) ((zzko) this.c.c).f3529a).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzki
            @Override // java.lang.Runnable
            public final void run() {
                v1 v1Var = v1.this;
                h hVar = v1Var.c;
                long j10 = v1Var.f367a;
                ((zzko) hVar.c).m();
                zzeu zzeuVar = ((zzge) ((zzko) hVar.c).f3529a).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11719m.a("Application going to the background");
                v vVar = ((zzge) ((zzko) hVar.c).f3529a).f11779h;
                zzge.d(vVar);
                vVar.f354q.a(true);
                if (!((zzge) ((zzko) hVar.c).f3529a).f11778g.w()) {
                    ((zzko) hVar.c).f11878e.c.a();
                    ((zzko) hVar.c).f11878e.a(v1Var.f368b, false, false);
                }
                zzql.zzc();
                if (((zzge) ((zzko) hVar.c).f3529a).f11778g.v(null, zzeh.f11682v0)) {
                    zzeu zzeuVar2 = ((zzge) ((zzko) hVar.c).f3529a).f11780i;
                    zzge.f(zzeuVar2);
                    zzeuVar2.f11718l.b(Long.valueOf(j10), "Application backgrounded at: timestamp_millis");
                    return;
                }
                zzij zzijVar = ((zzge) ((zzko) hVar.c).f3529a).f11787p;
                zzge.e(zzijVar);
                zzijVar.u("auto", "_ab", new Bundle(), j10);
            }
        });
    }
}
