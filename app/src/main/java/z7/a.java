package z7;

import a8.s0;
import a8.u0;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zziy;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzlo;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final zzge f32297a;

    /* renamed from: b  reason: collision with root package name */
    public final zzij f32298b;

    public a(zzge zzgeVar) {
        Preconditions.j(zzgeVar);
        this.f32297a = zzgeVar;
        zzij zzijVar = zzgeVar.f11787p;
        zzge.e(zzijVar);
        this.f32298b = zzijVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final List a(String str, String str2) {
        zzij zzijVar = this.f32298b;
        zzge zzgeVar = (zzge) zzijVar.f3529a;
        zzgb zzgbVar = zzgeVar.f11781j;
        zzge.f(zzgbVar);
        boolean w7 = zzgbVar.w();
        zzeu zzeuVar = zzgeVar.f11780i;
        if (w7) {
            zzge.f(zzeuVar);
            zzeuVar.f11712f.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        } else if (zzab.a()) {
            zzge.f(zzeuVar);
            zzeuVar.f11712f.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            zzgb zzgbVar2 = zzgeVar.f11781j;
            zzge.f(zzgbVar2);
            zzgbVar2.r(atomicReference, TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL, "get conditional user properties", new s0(zzijVar, atomicReference, str, str2));
            List list = (List) atomicReference.get();
            if (list == null) {
                zzge.f(zzeuVar);
                zzeuVar.f11712f.b(null, "Timed out waiting for get conditional user properties");
                return new ArrayList();
            }
            return zzlo.w(list);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void b(Bundle bundle, String str, String str2) {
        zzij zzijVar = this.f32297a.f11787p;
        zzge.e(zzijVar);
        zzijVar.q(bundle, str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final Map c(String str, String str2, boolean z10) {
        zzij zzijVar = this.f32298b;
        zzge zzgeVar = (zzge) zzijVar.f3529a;
        zzgb zzgbVar = zzgeVar.f11781j;
        zzge.f(zzgbVar);
        boolean w7 = zzgbVar.w();
        zzeu zzeuVar = zzgeVar.f11780i;
        if (w7) {
            zzge.f(zzeuVar);
            zzeuVar.f11712f.a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (zzab.a()) {
            zzge.f(zzeuVar);
            zzeuVar.f11712f.a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            zzgb zzgbVar2 = zzgeVar.f11781j;
            zzge.f(zzgbVar2);
            zzgbVar2.r(atomicReference, TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL, "get user properties", new u0(zzijVar, atomicReference, str, str2, z10));
            List<zzlj> list = (List) atomicReference.get();
            if (list == null) {
                zzge.f(zzeuVar);
                zzeuVar.f11712f.b(Boolean.valueOf(z10), "Timed out waiting for handle get user properties, includeInternal");
                return Collections.emptyMap();
            }
            y.b bVar = new y.b(list.size());
            for (zzlj zzljVar : list) {
                Object d10 = zzljVar.d();
                if (d10 != null) {
                    bVar.put(zzljVar.f11910b, d10);
                }
            }
            return bVar;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void d(Bundle bundle) {
        zzij zzijVar = this.f32298b;
        ((zzge) zzijVar.f3529a).f11785n.getClass();
        zzijVar.x(bundle, System.currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void e(Bundle bundle, String str, String str2) {
        zzij zzijVar = this.f32298b;
        ((zzge) zzijVar.f3529a).f11785n.getClass();
        zzijVar.s(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final int zza(String str) {
        zzij zzijVar = this.f32298b;
        zzijVar.getClass();
        Preconditions.f(str);
        ((zzge) zzijVar.f3529a).getClass();
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final long zzb() {
        zzlo zzloVar = this.f32297a.f11783l;
        zzge.d(zzloVar);
        return zzloVar.r0();
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final String zzh() {
        return this.f32298b.F();
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final String zzi() {
        zziy zziyVar = ((zzge) this.f32298b.f3529a).f11786o;
        zzge.e(zziyVar);
        zziq zziqVar = zziyVar.c;
        if (zziqVar != null) {
            return zziqVar.f11843b;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final String zzj() {
        zziy zziyVar = ((zzge) this.f32298b.f3529a).f11786o;
        zzge.e(zziyVar);
        zziq zziqVar = zziyVar.c;
        if (zziqVar != null) {
            return zziqVar.f11842a;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final String zzk() {
        return this.f32298b.F();
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void zzp(String str) {
        zzge zzgeVar = this.f32297a;
        zzd h10 = zzgeVar.h();
        zzgeVar.f11785n.getClass();
        h10.n(str, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void zzr(String str) {
        zzge zzgeVar = this.f32297a;
        zzd h10 = zzgeVar.h();
        zzgeVar.f11785n.getClass();
        h10.o(str, SystemClock.elapsedRealtime());
    }
}
