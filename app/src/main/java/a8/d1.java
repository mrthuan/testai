package a8;

import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zziy;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class d1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zziq f129a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zziq f130b;
    public final /* synthetic */ long c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f131d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zziy f132e;

    public d1(zziy zziyVar, zziq zziqVar, zziq zziqVar2, long j10, boolean z10) {
        this.f132e = zziyVar;
        this.f129a = zziqVar;
        this.f130b = zziqVar2;
        this.c = j10;
        this.f131d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f132e.q(this.f129a, this.f130b, this.c, this.f131d, null);
    }
}
