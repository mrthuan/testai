package com.inmobi.media;

/* renamed from: com.inmobi.media.i2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1663i2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15164a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15165b;

    public C1663i2(String url, String accountId) {
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(accountId, "accountId");
        this.f15164a = url;
        this.f15165b = accountId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1663i2)) {
            return false;
        }
        C1663i2 c1663i2 = (C1663i2) obj;
        if (kotlin.jvm.internal.g.a(this.f15164a, c1663i2.f15164a) && kotlin.jvm.internal.g.a(this.f15165b, c1663i2.f15165b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15165b.hashCode() + (this.f15164a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigIdentifier(url=");
        sb2.append(this.f15164a);
        sb2.append(", accountId=");
        return androidx.activity.r.f(sb2, this.f15165b, ')');
    }
}
