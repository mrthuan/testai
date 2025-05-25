package ek;

import lib.zj.office.fc.hpsf.Variant;

/* compiled from: Settings.kt */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public int f16788a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f16789b = new int[10];

    public final int a() {
        if ((this.f16788a & 128) != 0) {
            return this.f16789b[7];
        }
        return Variant.VT_ILLEGAL;
    }

    public final void b(t other) {
        kotlin.jvm.internal.g.e(other, "other");
        int i10 = 0;
        while (i10 < 10) {
            int i11 = i10 + 1;
            boolean z10 = true;
            if (((1 << i10) & other.f16788a) == 0) {
                z10 = false;
            }
            if (z10) {
                c(i10, other.f16789b[i10]);
            }
            i10 = i11;
        }
    }

    public final void c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f16789b;
            if (i10 < iArr.length) {
                this.f16788a = (1 << i10) | this.f16788a;
                iArr[i10] = i11;
            }
        }
    }
}
