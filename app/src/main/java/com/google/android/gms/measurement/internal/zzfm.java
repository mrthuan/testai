package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzfm {

    /* renamed from: a  reason: collision with root package name */
    public final zzge f11744a;

    public zzfm(zzlg zzlgVar) {
        this.f11744a = zzlgVar.f11893l;
    }

    @VisibleForTesting
    public final boolean a() {
        zzge zzgeVar = this.f11744a;
        try {
            PackageManagerWrapper a10 = Wrappers.a(zzgeVar.f11773a);
            if (a10 == null) {
                zzeu zzeuVar = zzgeVar.f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11720n.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a10.c(128, "com.android.vending").versionCode < 80837300) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e10) {
            zzeu zzeuVar2 = zzgeVar.f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11720n.b(e10, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
