package com.google.android.gms.measurement.internal;

import a8.c2;
import a8.s1;
import a8.v;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzka extends c2 {

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f11864d;

    /* renamed from: e  reason: collision with root package name */
    public final zzff f11865e;

    /* renamed from: f  reason: collision with root package name */
    public final zzff f11866f;

    /* renamed from: g  reason: collision with root package name */
    public final zzff f11867g;

    /* renamed from: h  reason: collision with root package name */
    public final zzff f11868h;

    /* renamed from: i  reason: collision with root package name */
    public final zzff f11869i;

    public zzka(zzlg zzlgVar) {
        super(zzlgVar);
        this.f11864d = new HashMap();
        v vVar = ((zzge) this.f3529a).f11779h;
        zzge.d(vVar);
        this.f11865e = new zzff(vVar, "last_delete_stale", 0L);
        v vVar2 = ((zzge) this.f3529a).f11779h;
        zzge.d(vVar2);
        this.f11866f = new zzff(vVar2, "backoff", 0L);
        v vVar3 = ((zzge) this.f3529a).f11779h;
        zzge.d(vVar3);
        this.f11867g = new zzff(vVar3, "last_upload", 0L);
        v vVar4 = ((zzge) this.f3529a).f11779h;
        zzge.d(vVar4);
        this.f11868h = new zzff(vVar4, "last_upload_attempt", 0L);
        v vVar5 = ((zzge) this.f3529a).f11779h;
        zzge.d(vVar5);
        this.f11869i = new zzff(vVar5, "midnight_offset", 0L);
    }

    @Deprecated
    public final Pair q(String str) {
        s1 s1Var;
        AdvertisingIdClient.Info info;
        m();
        Object obj = this.f3529a;
        zzge zzgeVar = (zzge) obj;
        zzgeVar.f11785n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.f11864d;
        s1 s1Var2 = (s1) hashMap.get(str);
        if (s1Var2 != null && elapsedRealtime < s1Var2.c) {
            return new Pair(s1Var2.f322a, Boolean.valueOf(s1Var2.f323b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long s4 = zzgeVar.f11778g.s(str, zzeh.f11642b) + elapsedRealtime;
        try {
            long s10 = ((zzge) obj).f11778g.s(str, zzeh.c);
            if (s10 > 0) {
                try {
                    info = AdvertisingIdClient.getAdvertisingIdInfo(((zzge) obj).f11773a);
                } catch (PackageManager.NameNotFoundException unused) {
                    if (s1Var2 != null && elapsedRealtime < s1Var2.c + s10) {
                        return new Pair(s1Var2.f322a, Boolean.valueOf(s1Var2.f323b));
                    }
                    info = null;
                }
            } else {
                info = AdvertisingIdClient.getAdvertisingIdInfo(((zzge) obj).f11773a);
            }
        } catch (Exception e10) {
            zzeu zzeuVar = zzgeVar.f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11719m.b(e10, "Unable to get advertising id");
            s1Var = new s1(false, "", s4);
        }
        if (info == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id2 = info.getId();
        if (id2 != null) {
            s1Var = new s1(info.isLimitAdTrackingEnabled(), id2, s4);
        } else {
            s1Var = new s1(info.isLimitAdTrackingEnabled(), "", s4);
        }
        hashMap.put(str, s1Var);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(s1Var.f322a, Boolean.valueOf(s1Var.f323b));
    }

    @Deprecated
    public final String r(String str, boolean z10) {
        String str2;
        m();
        if (z10) {
            str2 = (String) q(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest u7 = zzlo.u();
        if (u7 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, u7.digest(str2.getBytes())));
    }

    @Override // a8.c2
    public final void p() {
    }
}
