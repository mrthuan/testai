package a8;

import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zziy;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class e1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f148a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zziy f149b;

    public e1(zziy zziyVar, long j10) {
        this.f149b = zziyVar;
        this.f148a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziy zziyVar = this.f149b;
        ((zzge) zziyVar.f3529a).h().p(this.f148a);
        zziyVar.f11848e = null;
    }
}
