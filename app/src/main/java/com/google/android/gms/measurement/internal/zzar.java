package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzar {

    /* renamed from: a  reason: collision with root package name */
    public final String f11540a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11541b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11542d;

    /* renamed from: e  reason: collision with root package name */
    public final long f11543e;

    /* renamed from: f  reason: collision with root package name */
    public final zzau f11544f;

    public zzar(zzge zzgeVar, String str, String str2, String str3, long j10, Bundle bundle) {
        zzau zzauVar;
        Preconditions.f(str2);
        Preconditions.f(str3);
        this.f11540a = str2;
        this.f11541b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.f11542d = j10;
        this.f11543e = 0L;
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzeu zzeuVar = zzgeVar.f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11712f.a("Param name can't be null");
                    it.remove();
                } else {
                    zzlo zzloVar = zzgeVar.f11783l;
                    zzge.d(zzloVar);
                    Object q5 = zzloVar.q(bundle2.get(next), next);
                    if (q5 == null) {
                        zzeu zzeuVar2 = zzgeVar.f11780i;
                        zzge.f(zzeuVar2);
                        zzeuVar2.f11715i.b(zzgeVar.f11784m.e(next), "Param value can't be null");
                        it.remove();
                    } else {
                        zzlo zzloVar2 = zzgeVar.f11783l;
                        zzge.d(zzloVar2);
                        zzloVar2.E(bundle2, next, q5);
                    }
                }
            }
            zzauVar = new zzau(bundle2);
        } else {
            zzauVar = new zzau(new Bundle());
        }
        this.f11544f = zzauVar;
    }

    public final zzar a(zzge zzgeVar, long j10) {
        return new zzar(zzgeVar, this.c, this.f11540a, this.f11541b, this.f11542d, j10, this.f11544f);
    }

    public final String toString() {
        String zzauVar = this.f11544f.toString();
        return "Event{appId='" + this.f11540a + "', name='" + this.f11541b + "', params=" + zzauVar + "}";
    }

    public zzar(zzge zzgeVar, String str, String str2, String str3, long j10, long j11, zzau zzauVar) {
        Preconditions.f(str2);
        Preconditions.f(str3);
        Preconditions.j(zzauVar);
        this.f11540a = str2;
        this.f11541b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.f11542d = j10;
        this.f11543e = j11;
        if (j11 != 0 && j11 > j10) {
            zzeu zzeuVar = zzgeVar.f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.c(zzeu.v(str2), "Event created with reverse previous/current timestamps. appId, name", zzeu.v(str3));
        }
        this.f11544f = zzauVar;
    }
}
