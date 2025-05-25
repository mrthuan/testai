package com.inmobi.media;

/* loaded from: classes2.dex */
public final class C5 {

    /* renamed from: a  reason: collision with root package name */
    public final int f14160a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f14161b;

    public C5(int i10) {
        this.f14160a = i10;
        this.f14161b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5)) {
            return false;
        }
        C5 c52 = (C5) obj;
        if (this.f14160a == c52.f14160a && kotlin.jvm.internal.g.a(this.f14161b, c52.f14161b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = this.f14160a * 31;
        Integer num = this.f14161b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return i10 + hashCode;
    }

    public final String toString() {
        return "OpenRequestResultData(result=" + this.f14160a + ", errorCode=" + this.f14161b + ')';
    }

    public C5(int i10, Integer num) {
        this.f14160a = i10;
        this.f14161b = num;
    }
}
