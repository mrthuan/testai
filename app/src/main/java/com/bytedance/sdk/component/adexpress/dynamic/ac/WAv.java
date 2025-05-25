package com.bytedance.sdk.component.adexpress.dynamic.ac;

import java.util.Arrays;

/* compiled from: DynamicPoint.java */
/* loaded from: classes.dex */
public class WAv {
    public float Qhi;
    public float cJ;

    public WAv(float f10, float f11) {
        this.Qhi = f10;
        this.cJ = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            WAv wAv = (WAv) obj;
            if (Float.compare(wAv.Qhi, this.Qhi) == 0 && Float.compare(wAv.cJ, this.cJ) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.Qhi), Float.valueOf(this.cJ)});
    }
}
