package com.inmobi.media;

/* renamed from: com.inmobi.media.q2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1771q2 {

    /* renamed from: a  reason: collision with root package name */
    public final byte f15385a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15386b;

    public C1771q2(byte b10, String str) {
        this.f15385a = b10;
        this.f15386b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1771q2)) {
            return false;
        }
        C1771q2 c1771q2 = (C1771q2) obj;
        if (this.f15385a == c1771q2.f15385a && kotlin.jvm.internal.g.a(this.f15386b, c1771q2.f15386b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = this.f15385a * 31;
        String str = this.f15386b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i10 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigError(errorCode=");
        sb2.append((int) this.f15385a);
        sb2.append(", errorMessage=");
        return androidx.activity.r.f(sb2, this.f15386b, ')');
    }
}
