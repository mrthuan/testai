package com.google.android.gms.measurement.internal;

import a8.c;
import a8.c2;
import a8.e;
import a8.n0;
import a8.w;
import android.text.TextUtils;
import androidx.appcompat.widget.i;
import com.android.billingclient.api.a0;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfj;
import com.google.android.gms.internal.measurement.zzgr;
import com.google.android.gms.internal.measurement.zzgt;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzu;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Callable;
import y.b;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzfv extends c2 implements c {

    /* renamed from: d  reason: collision with root package name */
    public final b f11753d;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    public final b f11754e;
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    public final b f11755f;
    @VisibleForTesting

    /* renamed from: g  reason: collision with root package name */
    public final b f11756g;

    /* renamed from: h  reason: collision with root package name */
    public final b f11757h;

    /* renamed from: i  reason: collision with root package name */
    public final b f11758i;
    @VisibleForTesting

    /* renamed from: j  reason: collision with root package name */
    public final w f11759j;

    /* renamed from: k  reason: collision with root package name */
    public final a0 f11760k;

    /* renamed from: l  reason: collision with root package name */
    public final b f11761l;

    /* renamed from: m  reason: collision with root package name */
    public final b f11762m;

    /* renamed from: n  reason: collision with root package name */
    public final b f11763n;

    public zzfv(zzlg zzlgVar) {
        super(zzlgVar);
        this.f11753d = new b();
        this.f11754e = new b();
        this.f11755f = new b();
        this.f11756g = new b();
        this.f11757h = new b();
        this.f11761l = new b();
        this.f11762m = new b();
        this.f11763n = new b();
        this.f11758i = new b();
        this.f11759j = new w(this);
        this.f11760k = new a0(this, 4);
    }

    public static final b u(com.google.android.gms.internal.measurement.zzff zzffVar) {
        b bVar = new b();
        if (zzffVar != null) {
            for (zzfj zzfjVar : zzffVar.zzp()) {
                bVar.put(zzfjVar.zzb(), zzfjVar.zzc());
            }
        }
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03bd, code lost:
        if (r1.zzk() == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03bf, code lost:
        r0 = java.lang.Boolean.valueOf(r1.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03c8, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03c9, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03dd, code lost:
        if (r9.F().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03df, code lost:
        r0 = ((com.google.android.gms.measurement.internal.zzge) r6).f11780i;
        com.google.android.gms.measurement.internal.zzge.f(r0);
        r0.f11712f.b(com.google.android.gms.measurement.internal.zzeu.v(r31), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03f3, code lost:
        r0 = r27;
        r3 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03fa, code lost:
        r1 = ((com.google.android.gms.measurement.internal.zzge) r6).f11780i;
        com.google.android.gms.measurement.internal.zzge.f(r1);
        r1.f11712f.c(com.google.android.gms.measurement.internal.zzeu.v(r31), "Error storing property filter. appId", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x040c, code lost:
        r9.n();
        r9.m();
        com.google.android.gms.common.internal.Preconditions.f(r31);
        r0 = r9.F();
        r5 = r21;
        r0.delete("property_filters", r5, new java.lang.String[]{r31, java.lang.String.valueOf(r7)});
        r0.delete("event_filters", r5, new java.lang.String[]{r31, java.lang.String.valueOf(r7)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0438, code lost:
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x043a, code lost:
        r21 = r5;
        r3 = r26;
        r1 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x020f, code lost:
        r8 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x021b, code lost:
        if (r8.hasNext() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0227, code lost:
        if (((com.google.android.gms.internal.measurement.zzet) r8.next()).zzj() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0229, code lost:
        r0 = ((com.google.android.gms.measurement.internal.zzge) r6).f11780i;
        com.google.android.gms.measurement.internal.zzge.f(r0);
        r0.f11715i.c(com.google.android.gms.measurement.internal.zzeu.v(r31), "Property filter with no ID. Audience definition ignored. appId, audienceId", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0241, code lost:
        r8 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x024d, code lost:
        r26 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0259, code lost:
        if (r8.hasNext() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x025b, code lost:
        r11 = (com.google.android.gms.internal.measurement.zzek) r8.next();
        r9.n();
        r9.m();
        com.google.android.gms.common.internal.Preconditions.f(r31);
        com.google.android.gms.common.internal.Preconditions.j(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0275, code lost:
        if (r11.zzg().isEmpty() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0277, code lost:
        r0 = ((com.google.android.gms.measurement.internal.zzge) r6).f11780i;
        com.google.android.gms.measurement.internal.zzge.f(r0);
        r0 = r0.f11715i;
        r4 = com.google.android.gms.measurement.internal.zzeu.v(r31);
        r5 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x028e, code lost:
        if (r11.zzp() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0290, code lost:
        r6 = java.lang.Integer.valueOf(r11.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0299, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x029a, code lost:
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r5, java.lang.String.valueOf(r6));
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02a5, code lost:
        r27 = r8;
        r8 = r11.zzbx();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02ab, code lost:
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02ad, code lost:
        r1 = new android.content.ContentValues();
        r1.put("app_id", r31);
        r1.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02c0, code lost:
        if (r11.zzp() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02c2, code lost:
        r3 = java.lang.Integer.valueOf(r11.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02cb, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02cc, code lost:
        r1.put("filter_id", r3);
        r1.put("event_name", r11.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02dc, code lost:
        if (r11.zzq() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02de, code lost:
        r3 = java.lang.Boolean.valueOf(r11.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02e7, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02e8, code lost:
        r1.put("session_scoped", r3);
        r1.put("data", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02fc, code lost:
        if (r9.F().insertWithOnConflict("event_filters", null, r1, 5) != (-1)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02fe, code lost:
        r1 = ((com.google.android.gms.measurement.internal.zzge) r6).f11780i;
        com.google.android.gms.measurement.internal.zzge.f(r1);
        r1.f11712f.b(com.google.android.gms.measurement.internal.zzeu.v(r31), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0311, code lost:
        r3 = r26;
        r8 = r27;
        r1 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0319, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x031a, code lost:
        r1 = ((com.google.android.gms.measurement.internal.zzge) r6).f11780i;
        com.google.android.gms.measurement.internal.zzge.f(r1);
        r1.f11712f.c(com.google.android.gms.measurement.internal.zzeu.v(r31), "Error storing event filter. appId", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x032e, code lost:
        r28 = r1;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x033c, code lost:
        if (r0.hasNext() == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x033e, code lost:
        r1 = (com.google.android.gms.internal.measurement.zzet) r0.next();
        r9.n();
        r9.m();
        com.google.android.gms.common.internal.Preconditions.f(r31);
        com.google.android.gms.common.internal.Preconditions.j(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0358, code lost:
        if (r1.zze().isEmpty() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x035a, code lost:
        r0 = ((com.google.android.gms.measurement.internal.zzge) r6).f11780i;
        com.google.android.gms.measurement.internal.zzge.f(r0);
        r0 = r0.f11715i;
        r4 = com.google.android.gms.measurement.internal.zzeu.v(r31);
        r5 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0371, code lost:
        if (r1.zzj() == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0373, code lost:
        r1 = java.lang.Integer.valueOf(r1.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x037c, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x037d, code lost:
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r4, r5, java.lang.String.valueOf(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0386, code lost:
        r8 = r1.zzbx();
        r11 = new android.content.ContentValues();
        r11.put(r3, r31);
        r27 = r0;
        r11.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x039f, code lost:
        if (r1.zzj() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03a1, code lost:
        r0 = java.lang.Integer.valueOf(r1.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03aa, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03ab, code lost:
        r11.put("filter_id", r0);
        r29 = r3;
        r11.put("property_name", r1.zze());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(java.lang.String r31, java.lang.String r32, java.lang.String r33, byte[] r34) {
        /*
            Method dump skipped, instructions count: 1481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfv.A(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    @Override // a8.c
    public final String e(String str, String str2) {
        m();
        s(str);
        Map map = (Map) this.f11753d.getOrDefault(str, null);
        if (map == null) {
            return null;
        }
        return (String) map.get(str2);
    }

    public final com.google.android.gms.internal.measurement.zzff q(String str, byte[] bArr) {
        Long l10;
        Object obj = this.f3529a;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzff.zzg();
        }
        try {
            com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzli.F(com.google.android.gms.internal.measurement.zzff.zze(), bArr)).zzaD();
            zzeu zzeuVar = ((zzge) obj).f11780i;
            zzge.f(zzeuVar);
            zzes zzesVar = zzeuVar.f11720n;
            String str2 = null;
            if (zzffVar.zzu()) {
                l10 = Long.valueOf(zzffVar.zzc());
            } else {
                l10 = null;
            }
            if (zzffVar.zzt()) {
                str2 = zzffVar.zzh();
            }
            zzesVar.c(l10, "Parsed config. version, gmp_app_id", str2);
            return zzffVar;
        } catch (zzll e10) {
            zzeu zzeuVar2 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11715i.c(zzeu.v(str), "Unable to merge remote config. appId", e10);
            return com.google.android.gms.internal.measurement.zzff.zzg();
        } catch (RuntimeException e11) {
            zzeu zzeuVar3 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar3);
            zzeuVar3.f11715i.c(zzeu.v(str), "Unable to merge remote config. appId", e11);
            return com.google.android.gms.internal.measurement.zzff.zzg();
        }
    }

    public final void r(String str, com.google.android.gms.internal.measurement.zzfe zzfeVar) {
        HashSet hashSet = new HashSet();
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        for (zzfb zzfbVar : zzfeVar.zzg()) {
            hashSet.add(zzfbVar.zzb());
        }
        for (int i10 = 0; i10 < zzfeVar.zza(); i10++) {
            zzfc zzfcVar = (zzfc) zzfeVar.zzb(i10).zzbB();
            boolean isEmpty = zzfcVar.zzc().isEmpty();
            Object obj = this.f3529a;
            if (isEmpty) {
                zzeu zzeuVar = ((zzge) obj).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11715i.a("EventConfig contained null event name");
            } else {
                String zzc = zzfcVar.zzc();
                String a10 = zzip.a(zzfcVar.zzc(), zzhb.f11802a, zzhb.c);
                if (!TextUtils.isEmpty(a10)) {
                    zzfcVar.zzb(a10);
                    zzfeVar.zzd(i10, zzfcVar);
                }
                if (zzfcVar.zzf() && zzfcVar.zzd()) {
                    bVar.put(zzc, Boolean.TRUE);
                }
                if (zzfcVar.zzg() && zzfcVar.zze()) {
                    bVar2.put(zzfcVar.zzc(), Boolean.TRUE);
                }
                if (zzfcVar.zzh()) {
                    if (zzfcVar.zza() >= 2 && zzfcVar.zza() <= 65535) {
                        bVar3.put(zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    } else {
                        zzeu zzeuVar2 = ((zzge) obj).f11780i;
                        zzge.f(zzeuVar2);
                        zzeuVar2.f11715i.c(zzfcVar.zzc(), "Invalid sampling rate. Event name, sample rate", Integer.valueOf(zzfcVar.zza()));
                    }
                }
            }
        }
        this.f11754e.put(str, hashSet);
        this.f11755f.put(str, bVar);
        this.f11756g.put(str, bVar2);
        this.f11758i.put(str, bVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
        if (r6 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfv.s(java.lang.String):void");
    }

    public final void t(final String str, com.google.android.gms.internal.measurement.zzff zzffVar) {
        int zza = zzffVar.zza();
        w wVar = this.f11759j;
        if (zza != 0) {
            Object obj = this.f3529a;
            zzge zzgeVar = (zzge) obj;
            zzeu zzeuVar = zzgeVar.f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11720n.b(Integer.valueOf(zzffVar.zza()), "EES programs found");
            zzgt zzgtVar = (zzgt) zzffVar.zzo().get(0);
            try {
                zzc zzcVar = new zzc();
                zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new zzn("internal.remoteConfig", new i(zzfv.this, str));
                    }
                });
                zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final zzfv zzfvVar = zzfv.this;
                        final String str2 = str;
                        return new zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfo
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                zzfv zzfvVar2 = zzfv.this;
                                e eVar = zzfvVar2.f117b.c;
                                zzlg.C(eVar);
                                String str3 = str2;
                                n0 G = eVar.G(str3);
                                HashMap hashMap = new HashMap();
                                hashMap.put("platform", "android");
                                hashMap.put(InMobiNetworkValues.PACKAGE_NAME, str3);
                                ((zzge) zzfvVar2.f3529a).f11778g.r();
                                hashMap.put("gmp_version", 77000L);
                                if (G != null) {
                                    String G2 = G.G();
                                    if (G2 != null) {
                                        hashMap.put("app_version", G2);
                                    }
                                    hashMap.put("app_version_int", Long.valueOf(G.A()));
                                    hashMap.put("dynamite_version", Long.valueOf(G.B()));
                                }
                                return hashMap;
                            }
                        });
                    }
                });
                zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfr
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new com.google.android.gms.internal.measurement.zzt(zzfv.this.f11760k);
                    }
                });
                zzcVar.zzc(zzgtVar);
                wVar.put(str, zzcVar);
                zzeu zzeuVar2 = ((zzge) obj).f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11720n.c(str, "EES program loaded for appId, activities", Integer.valueOf(zzgtVar.zza().zza()));
                for (zzgr zzgrVar : zzgtVar.zza().zzd()) {
                    zzeu zzeuVar3 = ((zzge) obj).f11780i;
                    zzge.f(zzeuVar3);
                    zzeuVar3.f11720n.b(zzgrVar.zzb(), "EES program activity");
                }
                return;
            } catch (com.google.android.gms.internal.measurement.zzd unused) {
                zzeu zzeuVar4 = zzgeVar.f11780i;
                zzge.f(zzeuVar4);
                zzeuVar4.f11712f.b(str, "Failed to load EES program. appId");
                return;
            }
        }
        wVar.remove(str);
    }

    public final int v(String str, String str2) {
        Integer num;
        m();
        s(str);
        Map map = (Map) this.f11758i.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final com.google.android.gms.internal.measurement.zzff w(String str) {
        n();
        m();
        Preconditions.f(str);
        s(str);
        return (com.google.android.gms.internal.measurement.zzff) this.f11757h.getOrDefault(str, null);
    }

    public final boolean x(String str) {
        com.google.android.gms.internal.measurement.zzff zzffVar;
        if (TextUtils.isEmpty(str) || (zzffVar = (com.google.android.gms.internal.measurement.zzff) this.f11757h.getOrDefault(str, null)) == null || zzffVar.zza() == 0) {
            return false;
        }
        return true;
    }

    public final boolean y(String str, String str2) {
        Boolean bool;
        m();
        s(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f11756g.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean z(String str, String str2) {
        Boolean bool;
        m();
        s(str);
        if ("1".equals(e(str, "measurement.upload.blacklist_internal")) && zzlo.a0(str2)) {
            return true;
        }
        if ("1".equals(e(str, "measurement.upload.blacklist_public")) && zzlo.b0(str2)) {
            return true;
        }
        Map map = (Map) this.f11755f.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // a8.c2
    public final void p() {
    }
}
