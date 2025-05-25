package com.inmobi.media;

/* loaded from: classes2.dex */
public final class Q5 {

    /* renamed from: a  reason: collision with root package name */
    public final String f14592a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14593b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final long f14594d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14595e;

    /* renamed from: f  reason: collision with root package name */
    public final int f14596f;

    public Q5(String fileName, long j10, int i10, long j11, boolean z10, int i11) {
        kotlin.jvm.internal.g.e(fileName, "fileName");
        this.f14592a = fileName;
        this.f14593b = j10;
        this.c = i10;
        this.f14594d = j11;
        this.f14595e = z10;
        this.f14596f = i11;
    }

    public /* synthetic */ Q5(String str, long j10, int i10, long j11, boolean z10, int i11, int i12) {
        this(str, j10, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0L : j11, (i12 & 16) != 0 ? false : z10, (i12 & 32) != 0 ? 0 : i11);
    }
}
