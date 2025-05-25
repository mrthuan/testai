package com.android.billingclient.api;

import a8.b1;
import android.content.ComponentName;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzff;
import com.google.android.gms.measurement.internal.zzfm;
import com.google.android.gms.measurement.internal.zzfv;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzjx;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzka;
import com.google.android.gms.measurement.internal.zzkr;
import com.google.android.gms.measurement.internal.zzlg;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6267a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6268b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.f6267a = i10;
        this.c = obj;
        this.f6268b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6267a) {
            case 0:
                c cVar = (c) this.f6268b;
                cVar.getClass();
                f fVar = y.f6297k;
                cVar.D(w.a(24, 9, fVar));
                ((j) this.c).a(fVar, zzai.zzk());
                return;
            case 1:
                synchronized (((AtomicReference) this.f6268b)) {
                    Object obj = this.c;
                    ((AtomicReference) this.f6268b).set(Long.valueOf(((zzge) ((zzij) obj).f3529a).f11778g.s(((zzge) ((zzij) obj).f3529a).k().r(), zzeh.N)));
                    ((AtomicReference) this.f6268b).notify();
                }
                return;
            case 2:
                zzjy.A(((zzjx) this.c).c, (ComponentName) this.f6268b);
                return;
            case 3:
                zzlg zzlgVar = (zzlg) this.c;
                zzlgVar.zzaB().m();
                zzlgVar.f11892k = new zzfm(zzlgVar);
                a8.e eVar = new a8.e(zzlgVar);
                eVar.o();
                zzlgVar.c = eVar;
                zzag E = zzlgVar.E();
                zzfv zzfvVar = zzlgVar.f11883a;
                Preconditions.j(zzfvVar);
                E.c = zzfvVar;
                zzka zzkaVar = new zzka(zzlgVar);
                zzkaVar.o();
                zzlgVar.f11890i = zzkaVar;
                a8.b bVar = new a8.b(zzlgVar);
                bVar.o();
                zzlgVar.f11887f = bVar;
                b1 b1Var = new b1(zzlgVar);
                b1Var.o();
                zzlgVar.f11889h = b1Var;
                zzkr zzkrVar = new zzkr(zzlgVar);
                zzkrVar.o();
                zzlgVar.f11886e = zzkrVar;
                zzlgVar.f11885d = new a8.u(zzlgVar);
                if (zzlgVar.f11898q != zzlgVar.f11899r) {
                    zzeu zzaA = zzlgVar.zzaA();
                    zzaA.f11712f.c(Integer.valueOf(zzlgVar.f11898q), "Not all upload components initialized", Integer.valueOf(zzlgVar.f11899r));
                }
                zzlgVar.f11894m = true;
                zzlgVar.zzaB().m();
                a8.e eVar2 = zzlgVar.c;
                zzlg.C(eVar2);
                eVar2.V();
                if (zzlgVar.f11890i.f11867g.a() == 0) {
                    zzff zzffVar = zzlgVar.f11890i.f11867g;
                    ((DefaultClock) zzlgVar.zzax()).getClass();
                    zzffVar.b(System.currentTimeMillis());
                }
                zzlgVar.x();
                return;
            default:
                Object obj2 = this.f6268b;
                boolean m10 = ((Task) obj2).m();
                Object obj3 = this.c;
                if (m10) {
                    ((d8.d) obj3).c.v();
                    return;
                }
                try {
                    ((d8.d) obj3).c.u(((d8.d) obj3).f16131b.then((Task) obj2));
                    return;
                } catch (RuntimeExecutionException e10) {
                    if (e10.getCause() instanceof Exception) {
                        ((d8.d) obj3).c.t((Exception) e10.getCause());
                        return;
                    } else {
                        ((d8.d) obj3).c.t(e10);
                        return;
                    }
                } catch (Exception e11) {
                    ((d8.d) obj3).c.t(e11);
                    return;
                }
        }
    }

    public /* synthetic */ n(c cVar, j jVar) {
        this.f6267a = 0;
        this.f6268b = cVar;
        this.c = jVar;
    }
}
