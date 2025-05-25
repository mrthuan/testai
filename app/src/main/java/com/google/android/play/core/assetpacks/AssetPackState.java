package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public abstract class AssetPackState {
    public static i0 a(String str, int i10, int i11, long j10, long j11, double d10, int i12, String str2, String str3) {
        return new i0(str, i10, i11, j10, j11, (int) Math.rint(100.0d * d10), i12, str2, str3);
    }

    public static i0 c(Bundle bundle, String str, y0 y0Var, v1 v1Var, c0 c0Var) {
        double doubleValue;
        int i10;
        int a10 = c0Var.a(bundle.getInt(r9.b.a("status", str)), str);
        int i11 = bundle.getInt(r9.b.a("error_code", str));
        long j10 = bundle.getLong(r9.b.a("bytes_downloaded", str));
        long j11 = bundle.getLong(r9.b.a("total_bytes_to_download", str));
        synchronized (y0Var) {
            Double d10 = (Double) y0Var.f13447a.get(str);
            if (d10 == null) {
                doubleValue = 0.0d;
            } else {
                doubleValue = d10.doubleValue();
            }
        }
        long j12 = bundle.getLong(r9.b.a("pack_version", str));
        long j13 = bundle.getLong(r9.b.a("pack_base_version", str));
        int i12 = 1;
        int i13 = 4;
        if (a10 == 4) {
            if (j13 != 0 && j13 != j12) {
                i12 = 2;
            }
            i10 = i12;
        } else {
            i10 = 1;
            i13 = a10;
        }
        return a(str, i13, i11, j10, j11, doubleValue, i10, bundle.getString(r9.b.a("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), v1Var.a(str));
    }

    public abstract String b();

    public abstract long d();

    public abstract int e();

    public abstract String f();

    public abstract String g();

    public abstract int h();

    public abstract long i();

    public abstract int j();

    public abstract int k();
}
