package com.google.android.gms.measurement.internal;

import a8.a0;
import a8.b0;
import a8.c0;
import a8.d0;
import a8.e;
import a8.e2;
import a8.f0;
import a8.h0;
import a8.i0;
import a8.i2;
import a8.k0;
import a8.y;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.common.api.internal.r0;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzgw extends zzej {

    /* renamed from: a  reason: collision with root package name */
    public final zzlg f11800a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f11801b;
    public String c;

    public zzgw(zzlg zzlgVar) {
        Preconditions.j(zzlgVar);
        this.f11800a = zzlgVar;
        this.c = null;
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void I(zzaw zzawVar, zzq zzqVar) {
        Preconditions.j(zzawVar);
        M0(zzqVar);
        L0(new r0(2, this, zzawVar, zzqVar));
    }

    public final void K(zzaw zzawVar, zzq zzqVar) {
        zzlg zzlgVar = this.f11800a;
        zzlgVar.a();
        zzlgVar.d(zzawVar, zzqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void L(zzq zzqVar) {
        M0(zzqVar);
        L0(new f0(this, zzqVar, 1));
    }

    @VisibleForTesting
    public final void L0(Runnable runnable) {
        zzlg zzlgVar = this.f11800a;
        if (zzlgVar.zzaB().w()) {
            runnable.run();
        } else {
            zzlgVar.zzaB().u(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final List M(String str, String str2, zzq zzqVar) {
        M0(zzqVar);
        String str3 = zzqVar.f11920a;
        Preconditions.j(str3);
        zzlg zzlgVar = this.f11800a;
        try {
            return (List) zzlgVar.zzaB().s(new d0(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            zzlgVar.zzaA().f11712f.b(e10, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    public final void M0(zzq zzqVar) {
        Preconditions.j(zzqVar);
        String str = zzqVar.f11920a;
        Preconditions.f(str);
        N0(str, false);
        this.f11800a.K().N(zzqVar.f11921b, zzqVar.f11935q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (com.google.android.gms.common.GooglePlayServicesUtilLight.a(r8.f10889a) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N0(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r0 = "com.google.android.gms"
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            com.google.android.gms.measurement.internal.zzlg r2 = r6.f11800a
            if (r1 != 0) goto Lc1
            r1 = 0
            r3 = 1
            if (r8 == 0) goto L81
            java.lang.Boolean r8 = r6.f11801b     // Catch: java.lang.SecurityException -> Lb0
            if (r8 != 0) goto L79
            java.lang.String r8 = r6.c     // Catch: java.lang.SecurityException -> Lb0
            boolean r8 = r0.equals(r8)     // Catch: java.lang.SecurityException -> Lb0
            if (r8 != 0) goto L72
            com.google.android.gms.measurement.internal.zzge r8 = r2.f11893l     // Catch: java.lang.SecurityException -> Lb0
            android.content.Context r8 = r8.f11773a     // Catch: java.lang.SecurityException -> Lb0
            int r4 = android.os.Binder.getCallingUid()     // Catch: java.lang.SecurityException -> Lb0
            boolean r4 = com.google.android.gms.common.util.UidVerifier.a(r8, r4, r0)     // Catch: java.lang.SecurityException -> Lb0
            if (r4 != 0) goto L29
            goto L5a
        L29:
            android.content.pm.PackageManager r4 = r8.getPackageManager()     // Catch: java.lang.SecurityException -> Lb0
            r5 = 64
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r0, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54 java.lang.SecurityException -> Lb0
            com.google.android.gms.common.GoogleSignatureVerifier r8 = com.google.android.gms.common.GoogleSignatureVerifier.a(r8)     // Catch: java.lang.SecurityException -> Lb0
            r8.getClass()     // Catch: java.lang.SecurityException -> Lb0
            if (r0 != 0) goto L3d
            goto L5a
        L3d:
            boolean r4 = com.google.android.gms.common.GoogleSignatureVerifier.d(r0, r1)     // Catch: java.lang.SecurityException -> Lb0
            if (r4 == 0) goto L44
            goto L52
        L44:
            boolean r0 = com.google.android.gms.common.GoogleSignatureVerifier.d(r0, r3)     // Catch: java.lang.SecurityException -> Lb0
            if (r0 == 0) goto L5a
            android.content.Context r8 = r8.f10889a     // Catch: java.lang.SecurityException -> Lb0
            boolean r8 = com.google.android.gms.common.GooglePlayServicesUtilLight.a(r8)     // Catch: java.lang.SecurityException -> Lb0
            if (r8 == 0) goto L5a
        L52:
            r8 = r3
            goto L5b
        L54:
            java.lang.String r8 = "UidVerifier"
            r0 = 3
            android.util.Log.isLoggable(r8, r0)     // Catch: java.lang.SecurityException -> Lb0
        L5a:
            r8 = r1
        L5b:
            if (r8 != 0) goto L72
            com.google.android.gms.measurement.internal.zzge r8 = r2.f11893l     // Catch: java.lang.SecurityException -> Lb0
            android.content.Context r8 = r8.f11773a     // Catch: java.lang.SecurityException -> Lb0
            com.google.android.gms.common.GoogleSignatureVerifier r8 = com.google.android.gms.common.GoogleSignatureVerifier.a(r8)     // Catch: java.lang.SecurityException -> Lb0
            int r0 = android.os.Binder.getCallingUid()     // Catch: java.lang.SecurityException -> Lb0
            boolean r8 = r8.b(r0)     // Catch: java.lang.SecurityException -> Lb0
            if (r8 == 0) goto L70
            goto L72
        L70:
            r8 = r1
            goto L73
        L72:
            r8 = r3
        L73:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.SecurityException -> Lb0
            r6.f11801b = r8     // Catch: java.lang.SecurityException -> Lb0
        L79:
            java.lang.Boolean r8 = r6.f11801b     // Catch: java.lang.SecurityException -> Lb0
            boolean r8 = r8.booleanValue()     // Catch: java.lang.SecurityException -> Lb0
            if (r8 != 0) goto L9f
        L81:
            java.lang.String r8 = r6.c     // Catch: java.lang.SecurityException -> Lb0
            if (r8 != 0) goto L97
            com.google.android.gms.measurement.internal.zzge r8 = r2.f11893l     // Catch: java.lang.SecurityException -> Lb0
            android.content.Context r8 = r8.f11773a     // Catch: java.lang.SecurityException -> Lb0
            int r0 = android.os.Binder.getCallingUid()     // Catch: java.lang.SecurityException -> Lb0
            java.util.concurrent.atomic.AtomicBoolean r4 = com.google.android.gms.common.GooglePlayServicesUtilLight.f10886a     // Catch: java.lang.SecurityException -> Lb0
            boolean r8 = com.google.android.gms.common.util.UidVerifier.a(r8, r0, r7)     // Catch: java.lang.SecurityException -> Lb0
            if (r8 == 0) goto L97
            r6.c = r7     // Catch: java.lang.SecurityException -> Lb0
        L97:
            java.lang.String r8 = r6.c     // Catch: java.lang.SecurityException -> Lb0
            boolean r8 = r7.equals(r8)     // Catch: java.lang.SecurityException -> Lb0
            if (r8 == 0) goto La0
        L9f:
            return
        La0:
            java.lang.SecurityException r8 = new java.lang.SecurityException     // Catch: java.lang.SecurityException -> Lb0
            java.lang.String r0 = "Unknown calling package name '%s'."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.SecurityException -> Lb0
            r3[r1] = r7     // Catch: java.lang.SecurityException -> Lb0
            java.lang.String r0 = java.lang.String.format(r0, r3)     // Catch: java.lang.SecurityException -> Lb0
            r8.<init>(r0)     // Catch: java.lang.SecurityException -> Lb0
            throw r8     // Catch: java.lang.SecurityException -> Lb0
        Lb0:
            r8 = move-exception
            com.google.android.gms.measurement.internal.zzeu r0 = r2.zzaA()
            a8.o r7 = com.google.android.gms.measurement.internal.zzeu.v(r7)
            java.lang.String r1 = "Measurement Service called with invalid calling package. appId"
            com.google.android.gms.measurement.internal.zzes r0 = r0.f11712f
            r0.b(r7, r1)
            throw r8
        Lc1:
            com.google.android.gms.measurement.internal.zzeu r7 = r2.zzaA()
            com.google.android.gms.measurement.internal.zzes r7 = r7.f11712f
            java.lang.String r8 = "Measurement Service called without app package"
            r7.a(r8)
            java.lang.SecurityException r7 = new java.lang.SecurityException
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgw.N0(java.lang.String, boolean):void");
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void S(long j10, String str, String str2, String str3) {
        L0(new k0(this, str2, str3, str, j10, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void b(zzq zzqVar) {
        M0(zzqVar);
        L0(new f0(this, zzqVar, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void c(final Bundle bundle, zzq zzqVar) {
        M0(zzqVar);
        final String str = zzqVar.f11920a;
        Preconditions.j(str);
        L0(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgf
            @Override // java.lang.Runnable
            public final void run() {
                String str2 = str;
                Bundle bundle2 = bundle;
                e eVar = zzgw.this.f11800a.c;
                zzlg.C(eVar);
                eVar.m();
                eVar.n();
                Object obj = eVar.f3529a;
                zzge zzgeVar = (zzge) obj;
                zzar zzarVar = new zzar(zzgeVar, "", str2, "dep", 0L, bundle2);
                zzli zzliVar = eVar.f117b.f11888g;
                zzlg.C(zzliVar);
                byte[] zzbx = zzliVar.E(zzarVar).zzbx();
                zzeu zzeuVar = zzgeVar.f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11720n.c(zzgeVar.f11784m.d(str2), "Saving default event parameters, appId, data size", Integer.valueOf(zzbx.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str2);
                contentValues.put("parameters", zzbx);
                try {
                    if (eVar.F().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        zzeu zzeuVar2 = ((zzge) obj).f11780i;
                        zzge.f(zzeuVar2);
                        zzeuVar2.f11712f.b(zzeu.v(str2), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e10) {
                    zzeu zzeuVar3 = zzgeVar.f11780i;
                    zzge.f(zzeuVar3);
                    zzeuVar3.f11712f.c(zzeu.v(str2), "Error storing default event parameters. appId", e10);
                }
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void d(zzlj zzljVar, zzq zzqVar) {
        Preconditions.j(zzljVar);
        M0(zzqVar);
        L0(new i0(this, zzljVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final List e(String str, String str2, String str3, boolean z10) {
        N0(str, true);
        zzlg zzlgVar = this.f11800a;
        try {
            List<i2> list = (List) zzlgVar.zzaB().s(new c0(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (i2 i2Var : list) {
                if (z10 || !zzlo.a0(i2Var.c)) {
                    arrayList.add(new zzlj(i2Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            zzeu zzaA = zzlgVar.zzaA();
            zzaA.f11712f.c(zzeu.v(str), "Failed to get user properties as. appId", e10);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void e0(zzq zzqVar) {
        Preconditions.f(zzqVar.f11920a);
        Preconditions.j(zzqVar.f11940v);
        e0 e0Var = new e0(3, this, zzqVar);
        zzlg zzlgVar = this.f11800a;
        if (zzlgVar.zzaB().w()) {
            e0Var.run();
        } else {
            zzlgVar.zzaB().v(e0Var);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final List f0(String str, String str2, boolean z10, zzq zzqVar) {
        M0(zzqVar);
        String str3 = zzqVar.f11920a;
        Preconditions.j(str3);
        zzlg zzlgVar = this.f11800a;
        try {
            List<i2> list = (List) zzlgVar.zzaB().s(new b0(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (i2 i2Var : list) {
                if (z10 || !zzlo.a0(i2Var.c)) {
                    arrayList.add(new zzlj(i2Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            zzeu zzaA = zzlgVar.zzaA();
            zzaA.f11712f.c(zzeu.v(str3), "Failed to query user properties. appId", e10);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final byte[] j(zzaw zzawVar, String str) {
        Preconditions.f(str);
        Preconditions.j(zzawVar);
        N0(str, true);
        zzlg zzlgVar = this.f11800a;
        zzeu zzaA = zzlgVar.zzaA();
        zzge zzgeVar = zzlgVar.f11893l;
        zzep zzepVar = zzgeVar.f11784m;
        String str2 = zzawVar.f11546a;
        zzaA.f11719m.b(zzepVar.d(str2), "Log and bundle. event");
        ((DefaultClock) zzlgVar.zzax()).getClass();
        long nanoTime = System.nanoTime() / 1000000;
        zzgb zzaB = zzlgVar.zzaB();
        h0 h0Var = new h0(this, zzawVar, str);
        zzaB.o();
        y yVar = new y(zzaB, h0Var, true);
        if (Thread.currentThread() == zzaB.c) {
            yVar.run();
        } else {
            zzaB.x(yVar);
        }
        try {
            byte[] bArr = (byte[]) yVar.get();
            if (bArr == null) {
                zzlgVar.zzaA().f11712f.b(zzeu.v(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((DefaultClock) zzlgVar.zzax()).getClass();
            zzlgVar.zzaA().f11719m.d("Log and bundle processed. event, size, time_ms", zzgeVar.f11784m.d(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            zzeu zzaA2 = zzlgVar.zzaA();
            zzaA2.f11712f.d("Failed to log and bundle. appId, event, error", zzeu.v(str), zzgeVar.f11784m.d(str2), e10);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void m0(zzq zzqVar) {
        Preconditions.f(zzqVar.f11920a);
        N0(zzqVar.f11920a, false);
        L0(new com.android.billingclient.api.e0(this, zzqVar, 2));
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final String p(zzq zzqVar) {
        M0(zzqVar);
        zzlg zzlgVar = this.f11800a;
        try {
            return (String) zzlgVar.zzaB().s(new e2(zzlgVar, zzqVar)).get(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzeu zzaA = zzlgVar.zzaA();
            zzaA.f11712f.c(zzeu.v(zzqVar.f11920a), "Failed to get app instance id. appId", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final List t(String str, String str2, String str3) {
        N0(str, true);
        zzlg zzlgVar = this.f11800a;
        try {
            return (List) zzlgVar.zzaB().s(new a8.e0(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            zzlgVar.zzaA().f11712f.b(e10, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void t0(zzac zzacVar, zzq zzqVar) {
        Preconditions.j(zzacVar);
        Preconditions.j(zzacVar.c);
        M0(zzqVar);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.f11516a = zzqVar.f11920a;
        L0(new a0(this, zzacVar2, zzqVar));
    }
}
