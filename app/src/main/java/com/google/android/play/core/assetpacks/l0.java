package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class l0 extends i2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f13290a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13291b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13292d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13293e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f13294f;

    public l0(String str, long j10, int i10, boolean z10, boolean z11, byte[] bArr) {
        this.f13290a = str;
        this.f13291b = j10;
        this.c = i10;
        this.f13292d = z10;
        this.f13293e = z11;
        this.f13294f = bArr;
    }

    @Override // com.google.android.play.core.assetpacks.i2
    public final int a() {
        return this.c;
    }

    @Override // com.google.android.play.core.assetpacks.i2
    public final long b() {
        return this.f13291b;
    }

    @Override // com.google.android.play.core.assetpacks.i2
    public final String c() {
        return this.f13290a;
    }

    @Override // com.google.android.play.core.assetpacks.i2
    public final boolean d() {
        return this.f13293e;
    }

    @Override // com.google.android.play.core.assetpacks.i2
    public final boolean e() {
        return this.f13292d;
    }

    public final boolean equals(Object obj) {
        byte[] f10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i2) {
            i2 i2Var = (i2) obj;
            String str = this.f13290a;
            if (str != null ? str.equals(i2Var.c()) : i2Var.c() == null) {
                if (this.f13291b == i2Var.b() && this.c == i2Var.a() && this.f13292d == i2Var.e() && this.f13293e == i2Var.d()) {
                    if (i2Var instanceof l0) {
                        f10 = ((l0) i2Var).f13294f;
                    } else {
                        f10 = i2Var.f();
                    }
                    if (Arrays.equals(this.f13294f, f10)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.i2
    public final byte[] f() {
        return this.f13294f;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        String str = this.f13290a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = 1237;
        if (true != this.f13292d) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        long j10 = this.f13291b;
        int i12 = ((((hashCode ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.c;
        if (true == this.f13293e) {
            i11 = 1231;
        }
        return (((((i12 * 1000003) ^ i10) * 1000003) ^ i11) * 1000003) ^ Arrays.hashCode(this.f13294f);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f13294f);
        return "ZipEntry{name=" + this.f13290a + ", size=" + this.f13291b + ", compressionMethod=" + this.c + ", isPartial=" + this.f13292d + ", isEndOfArchive=" + this.f13293e + ", headerBytes=" + arrays + "}";
    }
}
