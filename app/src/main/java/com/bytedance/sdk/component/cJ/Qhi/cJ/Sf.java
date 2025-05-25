package com.bytedance.sdk.component.cJ.Qhi.cJ;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentedByteString.java */
/* loaded from: classes.dex */
public final class Sf extends fl {
    final transient byte[][] ROR;
    final transient int[] Sf;

    public Sf(Qhi qhi, int i10) {
        super(null);
        WAv.Qhi(qhi.cJ, 0L, i10);
        Tgh tgh = qhi.Qhi;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = tgh.f8353ac;
            int i15 = tgh.cJ;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                tgh = tgh.Tgh;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.ROR = new byte[i13];
        this.Sf = new int[i13 * 2];
        Tgh tgh2 = qhi.Qhi;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.ROR;
            bArr[i16] = tgh2.Qhi;
            int i17 = tgh2.f8353ac;
            int i18 = tgh2.cJ;
            int i19 = (i17 - i18) + i11;
            if (i19 > i10) {
                i11 = i10;
            } else {
                i11 = i19;
            }
            int[] iArr = this.Sf;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            tgh2.CJ = true;
            i16++;
            tgh2 = tgh2.Tgh;
        }
    }

    private fl fl() {
        return new fl(CJ());
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.cJ.fl
    public byte[] CJ() {
        int[] iArr = this.Sf;
        byte[][] bArr = this.ROR;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.Sf;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.ROR[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.cJ.fl
    public String Qhi() {
        return fl().Qhi();
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.cJ.fl
    public int ac() {
        return this.Sf[this.ROR.length - 1];
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.cJ.fl
    public String cJ() {
        return fl().cJ();
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.cJ.fl
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fl) {
            fl flVar = (fl) obj;
            if (flVar.ac() == ac() && Qhi(0, flVar, 0, ac())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.cJ.fl
    public int hashCode() {
        int i10 = this.f8356fl;
        if (i10 != 0) {
            return i10;
        }
        int length = this.ROR.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.ROR[i11];
            int[] iArr = this.Sf;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f8356fl = i12;
        return i12;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.cJ.fl
    public String toString() {
        return fl().toString();
    }

    private int cJ(int i10) {
        int binarySearch = Arrays.binarySearch(this.Sf, 0, this.ROR.length, i10 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.cJ.fl
    public fl Qhi(int i10, int i11) {
        return fl().Qhi(i10, i11);
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.cJ.fl
    public byte Qhi(int i10) {
        WAv.Qhi(this.Sf[this.ROR.length - 1], i10, 1L);
        int cJ = cJ(i10);
        int i11 = cJ == 0 ? 0 : this.Sf[cJ - 1];
        int[] iArr = this.Sf;
        byte[][] bArr = this.ROR;
        return bArr[cJ][(i10 - i11) + iArr[bArr.length + cJ]];
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.cJ.fl
    public boolean Qhi(int i10, fl flVar, int i11, int i12) {
        if (i10 < 0 || i10 > ac() - i12) {
            return false;
        }
        int cJ = cJ(i10);
        while (i12 > 0) {
            int i13 = cJ == 0 ? 0 : this.Sf[cJ - 1];
            int min = Math.min(i12, ((this.Sf[cJ] - i13) + i13) - i10);
            int[] iArr = this.Sf;
            byte[][] bArr = this.ROR;
            if (!flVar.Qhi(i11, bArr[cJ], (i10 - i13) + iArr[bArr.length + cJ], min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            cJ++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.cJ.fl
    public boolean Qhi(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > ac() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int cJ = cJ(i10);
        while (i12 > 0) {
            int i13 = cJ == 0 ? 0 : this.Sf[cJ - 1];
            int min = Math.min(i12, ((this.Sf[cJ] - i13) + i13) - i10);
            int[] iArr = this.Sf;
            byte[][] bArr2 = this.ROR;
            if (!WAv.Qhi(bArr2[cJ], (i10 - i13) + iArr[bArr2.length + cJ], bArr, i11, min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            cJ++;
        }
        return true;
    }
}
