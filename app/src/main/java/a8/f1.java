package a8;

import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zziy;
import com.google.android.gms.measurement.internal.zzjy;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class f1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zziq f157a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f158b;
    public final /* synthetic */ zziy c;

    public f1(zziy zziyVar, zziq zziqVar, long j10) {
        this.c = zziyVar;
        this.f157a = zziqVar;
        this.f158b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziq zziqVar = this.f157a;
        long j10 = this.f158b;
        zziy zziyVar = this.c;
        zziyVar.r(zziqVar, false, j10);
        zziyVar.f11848e = null;
        zzjy o10 = ((zzge) zziyVar.f3529a).o();
        o10.m();
        o10.n();
        o10.y(new com.android.billingclient.api.e0(o10, (Object) null, 3));
    }
}
