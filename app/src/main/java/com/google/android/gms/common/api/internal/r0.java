package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzes;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzfl;
import com.google.android.gms.measurement.internal.zzfv;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzhb;
import com.google.android.gms.measurement.internal.zzip;
import com.google.android.gms.measurement.internal.zzlg;
import com.google.android.gms.measurement.internal.zzli;
import com.google.android.gms.measurement.internal.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.m1;
import com.google.android.play.core.common.LocalTestingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class r0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11031a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f11032b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f11033d;

    public /* synthetic */ r0(int i10, Object obj, Object obj2, Object obj3) {
        this.f11031a = i10;
        this.f11033d = obj;
        this.f11032b = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzau zzauVar;
        int i10 = this.f11031a;
        Object obj = this.c;
        Bundle bundle = null;
        zzc zzcVar = null;
        Object obj2 = this.f11032b;
        Object obj3 = this.f11033d;
        switch (i10) {
            case 0:
                zzd zzdVar = (zzd) obj3;
                if (zzdVar.Z > 0) {
                    LifecycleCallback lifecycleCallback = (LifecycleCallback) obj2;
                    Bundle bundle2 = zzdVar.f11159a0;
                    if (bundle2 != null) {
                        bundle = bundle2.getBundle((String) obj);
                    }
                    lifecycleCallback.e(bundle);
                }
                if (zzdVar.Z >= 2) {
                    ((LifecycleCallback) obj2).i();
                }
                if (zzdVar.Z >= 3) {
                    ((LifecycleCallback) obj2).g();
                }
                if (zzdVar.Z >= 4) {
                    ((LifecycleCallback) obj2).j();
                }
                if (zzdVar.Z >= 5) {
                    ((LifecycleCallback) obj2).f();
                    return;
                }
                return;
            case 1:
                zzfl zzflVar = (zzfl) obj3;
                zzbr zzbrVar = (zzbr) obj2;
                zzge zzgeVar = zzflVar.f11743b.f11744a;
                zzgb zzgbVar = zzgeVar.f11781j;
                zzeu zzeuVar = zzgeVar.f11780i;
                zzge.f(zzgbVar);
                zzgbVar.m();
                Bundle bundle3 = new Bundle();
                bundle3.putString(InMobiNetworkValues.PACKAGE_NAME, zzflVar.f11742a);
                try {
                    if (zzbrVar.zzd(bundle3) == null) {
                        zzge.f(zzeuVar);
                        zzeuVar.f11712f.a("Install Referrer Service returned a null response");
                    }
                } catch (Exception e10) {
                    zzge.f(zzeuVar);
                    zzeuVar.f11712f.b(e10.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                zzgb zzgbVar2 = zzgeVar.f11781j;
                zzge.f(zzgbVar2);
                zzgbVar2.m();
                throw new IllegalStateException("Unexpected call on client side");
            case 2:
                zzgw zzgwVar = (zzgw) obj3;
                zzaw zzawVar = (zzaw) obj2;
                zzgwVar.getClass();
                boolean equals = "_cmp".equals(zzawVar.f11546a);
                zzlg zzlgVar = zzgwVar.f11800a;
                if (equals && (zzauVar = zzawVar.f11547b) != null) {
                    Bundle bundle4 = zzauVar.f11545a;
                    if (bundle4.size() != 0) {
                        String string = bundle4.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            zzlgVar.zzaA().f11718l.b(zzawVar.toString(), "Event has been filtered ");
                            zzawVar = new zzaw("_cmpx", zzawVar.f11547b, zzawVar.c, zzawVar.f11548d);
                        }
                    }
                }
                String str = zzawVar.f11546a;
                zzq zzqVar = (zzq) obj;
                zzfv zzfvVar = zzlgVar.f11883a;
                zzli zzliVar = zzlgVar.f11888g;
                zzlg.C(zzfvVar);
                if (!zzfvVar.x(zzqVar.f11920a)) {
                    zzgwVar.K(zzawVar, zzqVar);
                    return;
                }
                zzes zzesVar = zzlgVar.zzaA().f11720n;
                String str2 = zzqVar.f11920a;
                zzesVar.b(str2, "EES config found for");
                zzfv zzfvVar2 = zzlgVar.f11883a;
                zzlg.C(zzfvVar2);
                if (!TextUtils.isEmpty(str2)) {
                    zzcVar = (zzc) zzfvVar2.f11759j.get(str2);
                }
                if (zzcVar != null) {
                    try {
                        zzlg.C(zzliVar);
                        HashMap K = zzli.K(zzawVar.f11547b.d(), true);
                        String a10 = zzip.a(str, zzhb.c, zzhb.f11802a);
                        if (a10 == null) {
                            a10 = str;
                        }
                        if (zzcVar.zze(new zzaa(a10, zzawVar.f11548d, K))) {
                            if (zzcVar.zzg()) {
                                zzlgVar.zzaA().f11720n.b(str, "EES edited event");
                                zzlg.C(zzliVar);
                                zzgwVar.K(zzli.D(zzcVar.zza().zzb()), zzqVar);
                            } else {
                                zzgwVar.K(zzawVar, zzqVar);
                            }
                            if (zzcVar.zzf()) {
                                for (zzaa zzaaVar : zzcVar.zza().zzc()) {
                                    zzlgVar.zzaA().f11720n.b(zzaaVar.zzd(), "EES logging created event");
                                    zzlg.C(zzliVar);
                                    zzgwVar.K(zzli.D(zzaaVar), zzqVar);
                                }
                                return;
                            }
                            return;
                        }
                    } catch (com.google.android.gms.internal.measurement.zzd unused) {
                        zzlgVar.zzaA().f11712f.c(zzqVar.f11921b, "EES error. appId, eventName", str);
                    }
                    zzlgVar.zzaA().f11720n.b(str, "EES was not applied to event");
                    zzgwVar.K(zzawVar, zzqVar);
                    return;
                }
                zzlgVar.zzaA().f11720n.b(str2, "EES not loaded for");
                zzgwVar.K(zzawVar, zzqVar);
                return;
            default:
                m1 m1Var = (m1) obj2;
                List<String> list = (List) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj3;
                m1Var.getClass();
                HashMap hashMap = new HashMap();
                long j10 = 0;
                for (String str3 : list) {
                    try {
                        com.google.android.play.core.assetpacks.i0 l10 = m1Var.l(1, str3);
                        j10 += l10.f13259e;
                        hashMap.put(str3, l10);
                    } catch (LocalTestingException e11) {
                        taskCompletionSource.a(e11);
                        return;
                    }
                }
                for (String str4 : list) {
                    try {
                        int andIncrement = m1.f13306j.getAndIncrement();
                        m1Var.k(andIncrement, 1, str4);
                        m1Var.k(andIncrement, 2, str4);
                        m1Var.k(andIncrement, 3, str4);
                    } catch (LocalTestingException e12) {
                        taskCompletionSource.a(e12);
                        return;
                    }
                }
                taskCompletionSource.b(new com.google.android.play.core.assetpacks.j0(j10, hashMap));
                return;
        }
    }

    public /* synthetic */ r0(m1 m1Var, ArrayList arrayList, TaskCompletionSource taskCompletionSource) {
        this.f11031a = 3;
        this.f11032b = m1Var;
        this.c = arrayList;
        this.f11033d = taskCompletionSource;
    }
}
