package com.inmobi.media;

import java.io.File;

/* renamed from: com.inmobi.media.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1674j {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f15195m = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f15196a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15197b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public int f15198d;

    /* renamed from: e  reason: collision with root package name */
    public long f15199e;

    /* renamed from: f  reason: collision with root package name */
    public final long f15200f;

    /* renamed from: g  reason: collision with root package name */
    public final long f15201g;

    /* renamed from: h  reason: collision with root package name */
    public final long f15202h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15203i;

    /* renamed from: j  reason: collision with root package name */
    public String f15204j;

    /* renamed from: k  reason: collision with root package name */
    public long f15205k;

    /* renamed from: l  reason: collision with root package name */
    public byte f15206l;

    public C1674j(int i10, String url, String str, int i11, long j10, long j11, long j12, long j13) {
        kotlin.jvm.internal.g.e(url, "url");
        this.f15196a = i10;
        this.f15197b = url;
        this.c = str;
        this.f15198d = i11;
        this.f15199e = j10;
        this.f15200f = j11;
        this.f15201g = j12;
        this.f15202h = j13;
    }

    public final void a(byte b10) {
        this.f15206l = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1674j)) {
            return false;
        }
        return kotlin.jvm.internal.g.a(this.f15197b, ((C1674j) obj).f15197b);
    }

    public final int hashCode() {
        return this.f15197b.hashCode();
    }

    public final String toString() {
        return androidx.activity.r.g(new StringBuilder("AdAsset{url='"), this.f15197b, "'}");
    }

    public final boolean a() {
        return AbstractC1579c2.a(this.c) && new File(this.c).exists();
    }
}
