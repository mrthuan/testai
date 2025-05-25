package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class i0 extends AssetPackState {

    /* renamed from: a  reason: collision with root package name */
    public final String f13256a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13257b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13258d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13259e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13260f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13261g;

    /* renamed from: h  reason: collision with root package name */
    public final String f13262h;

    /* renamed from: i  reason: collision with root package name */
    public final String f13263i;

    public i0(String str, int i10, int i11, long j10, long j11, int i12, int i13, String str2, String str3) {
        if (str != null) {
            this.f13256a = str;
            this.f13257b = i10;
            this.c = i11;
            this.f13258d = j10;
            this.f13259e = j11;
            this.f13260f = i12;
            this.f13261g = i13;
            if (str2 != null) {
                this.f13262h = str2;
                if (str3 != null) {
                    this.f13263i = str3;
                    return;
                }
                throw new NullPointerException("Null installedVersionTag");
            }
            throw new NullPointerException("Null availableVersionTag");
        }
        throw new NullPointerException("Null name");
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String b() {
        return this.f13262h;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long d() {
        return this.f13258d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f13256a.equals(assetPackState.g()) && this.f13257b == assetPackState.h() && this.c == assetPackState.e() && this.f13258d == assetPackState.d() && this.f13259e == assetPackState.i() && this.f13260f == assetPackState.j() && this.f13261g == assetPackState.k() && this.f13262h.equals(assetPackState.b()) && this.f13263i.equals(assetPackState.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String f() {
        return this.f13263i;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String g() {
        return this.f13256a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int h() {
        return this.f13257b;
    }

    public final int hashCode() {
        long j10 = this.f13259e;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.f13258d;
        return ((((((((((((((((this.f13256a.hashCode() ^ 1000003) * 1000003) ^ this.f13257b) * 1000003) ^ this.c) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ ((int) j11)) * 1000003) ^ this.f13260f) * 1000003) ^ this.f13261g) * 1000003) ^ this.f13262h.hashCode()) * 1000003) ^ this.f13263i.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long i() {
        return this.f13259e;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int j() {
        return this.f13260f;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int k() {
        return this.f13261g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssetPackState{name=");
        sb2.append(this.f13256a);
        sb2.append(", status=");
        sb2.append(this.f13257b);
        sb2.append(", errorCode=");
        sb2.append(this.c);
        sb2.append(", bytesDownloaded=");
        sb2.append(this.f13258d);
        sb2.append(", totalBytesToDownload=");
        sb2.append(this.f13259e);
        sb2.append(", transferProgressPercentage=");
        sb2.append(this.f13260f);
        sb2.append(", updateAvailability=");
        sb2.append(this.f13261g);
        sb2.append(", availableVersionTag=");
        sb2.append(this.f13262h);
        sb2.append(", installedVersionTag=");
        return androidx.activity.r.g(sb2, this.f13263i, "}");
    }
}
