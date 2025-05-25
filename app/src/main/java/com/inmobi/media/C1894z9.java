package com.inmobi.media;

/* renamed from: com.inmobi.media.z9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1894z9 {

    /* renamed from: a  reason: collision with root package name */
    public final byte f15709a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15710b;

    public C1894z9(byte b10, String assetUrl) {
        kotlin.jvm.internal.g.e(assetUrl, "assetUrl");
        this.f15709a = b10;
        this.f15710b = assetUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1894z9)) {
            return false;
        }
        C1894z9 c1894z9 = (C1894z9) obj;
        if (this.f15709a == c1894z9.f15709a && kotlin.jvm.internal.g.a(this.f15710b, c1894z9.f15710b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15710b.hashCode() + (this.f15709a * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RawAsset(mRawAssetType=");
        sb2.append((int) this.f15709a);
        sb2.append(", assetUrl=");
        return androidx.activity.r.f(sb2, this.f15710b, ')');
    }
}
