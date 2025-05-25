package com.pgl.ssdk;

/* renamed from: com.pgl.ssdk.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class Pair<A, B> {

    /* renamed from: a  reason: collision with root package name */
    private final A f15831a;

    /* renamed from: b  reason: collision with root package name */
    private final B f15832b;

    public Pair(A a10, B b10) {
        this.f15831a = a10;
        this.f15832b = b10;
    }

    public A a() {
        return this.f15831a;
    }

    public B b() {
        return this.f15832b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Pair.class != obj.getClass()) {
            return false;
        }
        Pair pair = (Pair) obj;
        A a10 = this.f15831a;
        if (a10 == null) {
            if (pair.f15831a != null) {
                return false;
            }
        } else if (!a10.equals(pair.f15831a)) {
            return false;
        }
        B b10 = this.f15832b;
        if (b10 == null) {
            if (pair.f15832b != null) {
                return false;
            }
        } else if (!b10.equals(pair.f15832b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        A a10 = this.f15831a;
        int i10 = 0;
        if (a10 == null) {
            hashCode = 0;
        } else {
            hashCode = a10.hashCode();
        }
        int i11 = (hashCode + 31) * 31;
        B b10 = this.f15832b;
        if (b10 != null) {
            i10 = b10.hashCode();
        }
        return i11 + i10;
    }
}
