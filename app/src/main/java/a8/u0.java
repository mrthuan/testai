package a8;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class u0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f333a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f334b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f335d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f336e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s f337f;

    public u0(zzij zzijVar, AtomicReference atomicReference, String str, String str2, boolean z10) {
        this.f337f = zzijVar;
        this.c = atomicReference;
        this.f335d = str;
        this.f336e = str2;
        this.f334b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzac zzacVar;
        int i10 = this.f333a;
        Object obj = this.f335d;
        Object obj2 = this.c;
        s sVar = this.f337f;
        switch (i10) {
            case 0:
                zzjy o10 = ((zzge) ((zzij) sVar).f3529a).o();
                boolean z10 = this.f334b;
                o10.m();
                o10.n();
                o10.y(new r1(o10, (AtomicReference) obj2, (String) obj, (String) this.f336e, o10.v(false), z10));
                return;
            default:
                zzjy zzjyVar = (zzjy) sVar;
                zzek zzekVar = zzjyVar.f11858d;
                if (zzekVar == null) {
                    zzeu zzeuVar = ((zzge) zzjyVar.f3529a).f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11712f.a("Discarding data. Failed to send conditional user property to service");
                    return;
                }
                zzq zzqVar = (zzq) obj2;
                Preconditions.j(zzqVar);
                if (this.f334b) {
                    zzacVar = null;
                } else {
                    zzacVar = (zzac) obj;
                }
                zzjyVar.q(zzekVar, zzacVar, zzqVar);
                zzjyVar.x();
                return;
        }
    }

    public u0(zzjy zzjyVar, zzq zzqVar, boolean z10, zzac zzacVar, zzac zzacVar2) {
        this.f337f = zzjyVar;
        this.c = zzqVar;
        this.f334b = z10;
        this.f335d = zzacVar;
        this.f336e = zzacVar2;
    }
}
