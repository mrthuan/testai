package com.bytedance.adsdk.lottie.ac;

import android.util.Pair;
import com.bytedance.component.sdk.annotation.RestrictTo;

/* compiled from: MutablePair.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class Sf<T> {
    T Qhi;
    T cJ;

    private static boolean cJ(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void Qhi(T t4, T t10) {
        this.Qhi = t4;
        this.cJ = t10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (!cJ(pair.first, this.Qhi) || !cJ(pair.second, this.cJ)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        T t4 = this.Qhi;
        int i10 = 0;
        if (t4 == null) {
            hashCode = 0;
        } else {
            hashCode = t4.hashCode();
        }
        T t10 = this.cJ;
        if (t10 != null) {
            i10 = t10.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "Pair{" + this.Qhi + " " + this.cJ + "}";
    }
}
