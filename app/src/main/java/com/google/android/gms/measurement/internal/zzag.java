package com.google.android.gms.measurement.internal;

import a8.c;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.content.e;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzag extends e {

    /* renamed from: b  reason: collision with root package name */
    public Boolean f11527b;
    public c c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f11528d;

    public zzag(zzge zzgeVar) {
        super(zzgeVar);
        this.c = new c() { // from class: com.google.android.gms.measurement.internal.zzae
            @Override // a8.c
            public final String e(String str, String str2) {
                return null;
            }
        };
    }

    public final String n(String str) {
        Object obj = this.f3529a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.j(str2);
            return str2;
        } catch (ClassNotFoundException e10) {
            zzeu zzeuVar = ((zzge) obj).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11712f.b(e10, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e11) {
            zzeu zzeuVar2 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11712f.b(e11, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e12) {
            zzeu zzeuVar3 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar3);
            zzeuVar3.f11712f.b(e12, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e13) {
            zzeu zzeuVar4 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar4);
            zzeuVar4.f11712f.b(e13, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final double o(String str, zzeg zzegVar) {
        if (str == null) {
            return ((Double) zzegVar.a(null)).doubleValue();
        }
        String e10 = this.c.e(str, zzegVar.f11635a);
        if (TextUtils.isEmpty(e10)) {
            return ((Double) zzegVar.a(null)).doubleValue();
        }
        try {
            return ((Double) zzegVar.a(Double.valueOf(Double.parseDouble(e10)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzegVar.a(null)).doubleValue();
        }
    }

    public final int p(String str, zzeg zzegVar) {
        if (str == null) {
            return ((Integer) zzegVar.a(null)).intValue();
        }
        String e10 = this.c.e(str, zzegVar.f11635a);
        if (TextUtils.isEmpty(e10)) {
            return ((Integer) zzegVar.a(null)).intValue();
        }
        try {
            return ((Integer) zzegVar.a(Integer.valueOf(Integer.parseInt(e10)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzegVar.a(null)).intValue();
        }
    }

    public final int q(String str, zzeg zzegVar, int i10, int i11) {
        return Math.max(Math.min(p(str, zzegVar), i11), i10);
    }

    public final void r() {
        ((zzge) this.f3529a).getClass();
    }

    public final long s(String str, zzeg zzegVar) {
        if (str == null) {
            return ((Long) zzegVar.a(null)).longValue();
        }
        String e10 = this.c.e(str, zzegVar.f11635a);
        if (TextUtils.isEmpty(e10)) {
            return ((Long) zzegVar.a(null)).longValue();
        }
        try {
            return ((Long) zzegVar.a(Long.valueOf(Long.parseLong(e10)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzegVar.a(null)).longValue();
        }
    }

    @VisibleForTesting
    public final Bundle t() {
        Object obj = this.f3529a;
        try {
            if (((zzge) obj).f11773a.getPackageManager() == null) {
                zzeu zzeuVar = ((zzge) obj).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11712f.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a10 = Wrappers.a(((zzge) obj).f11773a).a(128, ((zzge) obj).f11773a.getPackageName());
            if (a10 == null) {
                zzeu zzeuVar2 = ((zzge) obj).f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11712f.a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return a10.metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            zzeu zzeuVar3 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar3);
            zzeuVar3.f11712f.b(e10, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    @VisibleForTesting
    public final Boolean u(String str) {
        Preconditions.f(str);
        Bundle t4 = t();
        if (t4 == null) {
            zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11712f.a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!t4.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(t4.getBoolean(str));
        }
    }

    public final boolean v(String str, zzeg zzegVar) {
        if (str == null) {
            return ((Boolean) zzegVar.a(null)).booleanValue();
        }
        String e10 = this.c.e(str, zzegVar.f11635a);
        if (TextUtils.isEmpty(e10)) {
            return ((Boolean) zzegVar.a(null)).booleanValue();
        }
        return ((Boolean) zzegVar.a(Boolean.valueOf("1".equals(e10)))).booleanValue();
    }

    public final boolean w() {
        Boolean u7 = u("google_analytics_automatic_screen_reporting_enabled");
        if (u7 != null && !u7.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean x() {
        ((zzge) this.f3529a).getClass();
        Boolean u7 = u("firebase_analytics_collection_deactivated");
        if (u7 != null && u7.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean y(String str) {
        return "1".equals(this.c.e(str, "measurement.event_sampling_enabled"));
    }

    public final boolean z() {
        if (this.f11527b == null) {
            Boolean u7 = u("app_measurement_lite");
            this.f11527b = u7;
            if (u7 == null) {
                this.f11527b = Boolean.FALSE;
            }
        }
        if (!this.f11527b.booleanValue() && ((zzge) this.f3529a).f11776e) {
            return false;
        }
        return true;
    }
}
