package com.android.billingclient.api;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzq;
import com.google.android.play.core.assetpacks.a2;
import com.google.android.play.core.assetpacks.z1;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6255a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6256b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h0(int i10, Object obj, Object obj2) {
        this.f6255a = i10;
        this.f6256b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhe zzheVar;
        boolean z10;
        int i10 = this.f6255a;
        Object obj = this.c;
        Object obj2 = this.f6256b;
        switch (i10) {
            case 0:
                c cVar = (c) obj2;
                cVar.getClass();
                f fVar = y.f6297k;
                cVar.D(w.a(24, 3, fVar));
                ((b) obj).c(fVar);
                return;
            case 1:
                zzjy zzjyVar = (zzjy) obj;
                zzek zzekVar = zzjyVar.f11858d;
                Object obj3 = zzjyVar.f3529a;
                if (zzekVar == null) {
                    zzeu zzeuVar = ((zzge) obj3).f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11712f.a("Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    Preconditions.j((zzq) obj2);
                    zzekVar.m0((zzq) obj2);
                } catch (RemoteException e10) {
                    zzeu zzeuVar2 = ((zzge) obj3).f11780i;
                    zzge.f(zzeuVar2);
                    zzeuVar2.f11712f.b(e10, "Failed to reset data on the service: remote exception");
                }
                zzjyVar.x();
                return;
            case 2:
                zzij zzijVar = ((AppMeasurementDynamiteService) obj).f11514a.f11787p;
                zzge.e(zzijVar);
                a2.a aVar = (a2.a) obj2;
                zzijVar.m();
                zzijVar.n();
                if (aVar != null && aVar != (zzheVar = zzijVar.f11826d)) {
                    if (zzheVar == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Preconditions.l("EventInterceptor already set.", z10);
                }
                zzijVar.f11826d = aVar;
                return;
            case 3:
                try {
                    ((d8.o) obj2).u(((Callable) obj).call());
                    return;
                } catch (Exception e11) {
                    ((d8.o) obj2).t(e11);
                    return;
                } catch (Throwable th2) {
                    ((d8.o) obj2).t(new RuntimeException(th2));
                    return;
                }
            default:
                a2 a2Var = (a2) obj2;
                z1 z1Var = (z1) obj;
                a2Var.getClass();
                a2Var.f13166a.a(z1Var.f13458d, z1Var.f13459e, z1Var.f13249b);
                return;
        }
    }

    public /* synthetic */ h0(Object obj, Object obj2, int i10) {
        this.f6255a = i10;
        this.c = obj;
        this.f6256b = obj2;
    }
}
