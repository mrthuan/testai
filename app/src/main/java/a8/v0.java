package a8;

import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class v0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzai f361a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f362b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f363d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f364e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ zzai f365f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ zzij f366g;

    public v0(zzij zzijVar, zzai zzaiVar, long j10, int i10, long j11, boolean z10, zzai zzaiVar2) {
        this.f366g = zzijVar;
        this.f361a = zzaiVar;
        this.f362b = j10;
        this.c = i10;
        this.f363d = j11;
        this.f364e = z10;
        this.f365f = zzaiVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzij zzijVar = this.f366g;
        zzai zzaiVar = this.f361a;
        zzijVar.A(zzaiVar);
        zzijVar.w(this.f362b, false);
        zzij.H(this.f366g, this.f361a, this.c, this.f363d, true, this.f364e);
        zzqr.zzc();
        if (((zzge) zzijVar.f3529a).f11778g.v(null, zzeh.f11660k0)) {
            zzij.G(zzijVar, zzaiVar, this.f365f);
        }
    }
}
