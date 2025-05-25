package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class h0 extends a {

    /* renamed from: b  reason: collision with root package name */
    public final int f13246b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13247d;

    public h0(int i10, String str, String str2) {
        this.f13246b = i10;
        this.c = str;
        this.f13247d = str2;
    }

    @Override // com.google.android.play.core.assetpacks.a
    public final String a() {
        return this.f13247d;
    }

    @Override // com.google.android.play.core.assetpacks.a
    public final int b() {
        return this.f13246b;
    }

    @Override // com.google.android.play.core.assetpacks.a
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f13246b == aVar.b() && ((str = this.c) != null ? str.equals(aVar.c()) : aVar.c() == null) && ((str2 = this.f13247d) != null ? str2.equals(aVar.a()) : aVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.f13247d;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i10 ^ ((hashCode ^ ((this.f13246b ^ 1000003) * 1000003)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssetPackLocation{packStorageMethod=");
        sb2.append(this.f13246b);
        sb2.append(", path=");
        sb2.append(this.c);
        sb2.append(", assetsPath=");
        return androidx.activity.r.g(sb2, this.f13247d, "}");
    }
}
