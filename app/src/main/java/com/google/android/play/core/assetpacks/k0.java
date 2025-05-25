package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class k0 extends c2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f13281a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13282b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13283d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13284e;

    public k0(int i10, int i11, long j10, long j11, String str) {
        this.f13281a = i10;
        this.f13282b = str;
        this.c = j10;
        this.f13283d = j11;
        this.f13284e = i11;
    }

    @Override // com.google.android.play.core.assetpacks.c2
    public final int a() {
        return this.f13281a;
    }

    @Override // com.google.android.play.core.assetpacks.c2
    public final int b() {
        return this.f13284e;
    }

    @Override // com.google.android.play.core.assetpacks.c2
    public final long c() {
        return this.c;
    }

    @Override // com.google.android.play.core.assetpacks.c2
    public final long d() {
        return this.f13283d;
    }

    @Override // com.google.android.play.core.assetpacks.c2
    public final String e() {
        return this.f13282b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            c2 c2Var = (c2) obj;
            if (this.f13281a == c2Var.a() && ((str = this.f13282b) != null ? str.equals(c2Var.e()) : c2Var.e() == null) && this.c == c2Var.c() && this.f13283d == c2Var.d() && this.f13284e == c2Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f13282b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f13283d;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.c;
        return ((((((hashCode ^ ((this.f13281a ^ 1000003) * 1000003)) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ ((int) j11)) * 1000003) ^ this.f13284e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SliceCheckpoint{fileExtractionStatus=");
        sb2.append(this.f13281a);
        sb2.append(", filePath=");
        sb2.append(this.f13282b);
        sb2.append(", fileOffset=");
        sb2.append(this.c);
        sb2.append(", remainingBytes=");
        sb2.append(this.f13283d);
        sb2.append(", previousChunk=");
        return a6.h.g(sb2, this.f13284e, "}");
    }
}
