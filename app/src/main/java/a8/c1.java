package a8;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zziy;
import com.google.android.gms.measurement.internal.zzlo;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class c1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f121a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zziq f122b;
    public final /* synthetic */ zziq c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f123d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zziy f124e;

    public c1(zziy zziyVar, Bundle bundle, zziq zziqVar, zziq zziqVar2, long j10) {
        this.f124e = zziyVar;
        this.f121a = bundle;
        this.f122b = zziqVar;
        this.c = zziqVar2;
        this.f123d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziq zziqVar = this.f122b;
        zziq zziqVar2 = this.c;
        long j10 = this.f123d;
        Bundle bundle = this.f121a;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zziy zziyVar = this.f124e;
        zzlo zzloVar = ((zzge) zziyVar.f3529a).f11783l;
        zzge.d(zzloVar);
        zziyVar.q(zziqVar, zziqVar2, j10, true, zzloVar.u0("screen_view", bundle, null, false));
    }
}
