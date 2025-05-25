package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.g;

/* compiled from: Tuples.kt */
/* loaded from: classes.dex */
public final class Triple<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    public Triple(A a10, B b10, C c) {
        this.first = a10;
        this.second = b10;
        this.third = c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Triple copy$default(Triple triple, Object obj, Object obj2, Object obj3, int i10, Object obj4) {
        if ((i10 & 1) != 0) {
            obj = triple.first;
        }
        if ((i10 & 2) != 0) {
            obj2 = triple.second;
        }
        if ((i10 & 4) != 0) {
            obj3 = triple.third;
        }
        return triple.copy(obj, obj2, obj3);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final C component3() {
        return this.third;
    }

    public final Triple<A, B, C> copy(A a10, B b10, C c) {
        return new Triple<>(a10, b10, c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        if (g.a(this.first, triple.first) && g.a(this.second, triple.second) && g.a(this.third, triple.third)) {
            return true;
        }
        return false;
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public final C getThird() {
        return this.third;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        A a10 = this.first;
        int i10 = 0;
        if (a10 == null) {
            hashCode = 0;
        } else {
            hashCode = a10.hashCode();
        }
        int i11 = hashCode * 31;
        B b10 = this.second;
        if (b10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = b10.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        C c = this.third;
        if (c != null) {
            i10 = c.hashCode();
        }
        return i12 + i10;
    }

    public String toString() {
        return "(" + this.first + ", " + this.second + ", " + this.third + ')';
    }
}
