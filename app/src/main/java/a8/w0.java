package a8;

import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class w0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzai f370a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f371b;
    public final /* synthetic */ long c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f372d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzai f373e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ zzij f374f;

    public w0(zzij zzijVar, zzai zzaiVar, int i10, long j10, boolean z10, zzai zzaiVar2) {
        this.f374f = zzijVar;
        this.f370a = zzaiVar;
        this.f371b = i10;
        this.c = j10;
        this.f372d = z10;
        this.f373e = zzaiVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzij zzijVar = this.f374f;
        zzai zzaiVar = this.f370a;
        zzijVar.A(zzaiVar);
        zzij.H(this.f374f, this.f370a, this.f371b, this.c, false, this.f372d);
        zzqr.zzc();
        if (((zzge) zzijVar.f3529a).f11778g.v(null, zzeh.f11660k0)) {
            zzij.G(zzijVar, zzaiVar, this.f373e);
        }
    }
}
