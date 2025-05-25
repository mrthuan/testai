package com.google.android.gms.ads;

import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public class VersionInfo {

    /* renamed from: a  reason: collision with root package name */
    public final int f10051a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10052b;
    public final int c;

    public VersionInfo(int i10, int i11, int i12) {
        this.f10051a = i10;
        this.f10052b = i11;
        this.c = i12;
    }

    public final String toString() {
        return String.format(Locale.US, "%d.%d.%d", Integer.valueOf(this.f10051a), Integer.valueOf(this.f10052b), Integer.valueOf(this.c));
    }
}
