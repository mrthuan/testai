package com.google.android.gms.measurement.internal;

import a0.a;
import a6.h;
import android.os.Bundle;
import com.android.billingclient.api.a0;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzep {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference f11704b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReference f11705d = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    public final zzeo f11706a;

    public zzep(a0 a0Var) {
        this.f11706a = a0Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z10;
        String str2;
        Preconditions.j(atomicReference);
        if (strArr.length == strArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.b(z10);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str3 = strArr[i10];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder k10 = a.k("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = b((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (k10.length() != 1) {
                    k10.append(", ");
                }
                k10.append(valueOf);
            }
        }
        k10.append("]");
        return k10.toString();
    }

    public final String b(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f11706a.zza()) {
            return bundle.toString();
        }
        StringBuilder k10 = a.k("Bundle[{");
        for (String str : bundle.keySet()) {
            if (k10.length() != 8) {
                k10.append(", ");
            }
            k10.append(e(str));
            k10.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = a(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            k10.append(valueOf);
        }
        k10.append("}]");
        return k10.toString();
    }

    public final String c(zzaw zzawVar) {
        String b10;
        zzeo zzeoVar = this.f11706a;
        if (!zzeoVar.zza()) {
            return zzawVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(zzawVar.c);
        sb2.append(",name=");
        sb2.append(d(zzawVar.f11546a));
        sb2.append(",params=");
        zzau zzauVar = zzawVar.f11547b;
        if (zzauVar == null) {
            b10 = null;
        } else if (!zzeoVar.zza()) {
            b10 = zzauVar.toString();
        } else {
            b10 = b(zzauVar.d());
        }
        sb2.append(b10);
        return sb2.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f11706a.zza()) {
            return str;
        }
        return g(str, zzhb.c, zzhb.f11802a, f11704b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f11706a.zza()) {
            return str;
        }
        return g(str, zzhc.f11806b, zzhc.f11805a, c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f11706a.zza()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return h.d("experiment_id(", str, ")");
        }
        return g(str, zzhd.f11809b, zzhd.f11808a, f11705d);
    }
}
