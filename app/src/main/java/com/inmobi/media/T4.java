package com.inmobi.media;

/* loaded from: classes2.dex */
public final class T4 {
    private final boolean GPID;

    public T4() {
        this(false, 1, null);
    }

    public final boolean a() {
        return this.GPID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof T4) && this.GPID == ((T4) obj).GPID) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z10 = this.GPID;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return "IncludeIdParams(GPID=" + this.GPID + ')';
    }

    public T4(boolean z10) {
        this.GPID = z10;
    }

    public /* synthetic */ T4(boolean z10, int i10, kotlin.jvm.internal.d dVar) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
