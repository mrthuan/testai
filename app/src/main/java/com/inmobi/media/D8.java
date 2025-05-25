package com.inmobi.media;

/* loaded from: classes2.dex */
public final class D8 {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC1849w3 f14201a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14202b;

    public D8(EnumC1849w3 errorCode, String str) {
        kotlin.jvm.internal.g.e(errorCode, "errorCode");
        this.f14201a = errorCode;
        this.f14202b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D8)) {
            return false;
        }
        D8 d82 = (D8) obj;
        if (this.f14201a == d82.f14201a && kotlin.jvm.internal.g.a(this.f14202b, d82.f14202b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f14201a.hashCode() * 31;
        String str = this.f14202b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkError(errorCode=");
        sb2.append(this.f14201a);
        sb2.append(", errorMessage=");
        return androidx.activity.r.f(sb2, this.f14202b, ')');
    }
}
