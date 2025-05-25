package com.bytedance.sdk.component.cJ.Qhi.cJ;

import a6.h;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: ByteString.java */
/* loaded from: classes.dex */
public class fl implements Serializable, Comparable<fl> {
    final byte[] CJ;
    transient String Tgh;

    /* renamed from: fl  reason: collision with root package name */
    transient int f8356fl;
    static final char[] Qhi = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Charset cJ = Charset.forName("UTF-8");

    /* renamed from: ac  reason: collision with root package name */
    public static final fl f8355ac = Qhi(new byte[0]);

    public fl(byte[] bArr) {
        this.CJ = bArr;
    }

    public static fl Qhi(byte... bArr) {
        if (bArr != null) {
            return new fl((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public byte[] CJ() {
        return (byte[]) this.CJ.clone();
    }

    public int ac() {
        return this.CJ.length;
    }

    public String cJ() {
        byte[] bArr = this.CJ;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = Qhi;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fl) {
            fl flVar = (fl) obj;
            int ac2 = flVar.ac();
            byte[] bArr = this.CJ;
            if (ac2 == bArr.length && flVar.Qhi(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f8356fl;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.CJ);
        this.f8356fl = hashCode;
        return hashCode;
    }

    public String toString() {
        if (this.CJ.length == 0) {
            return "[size=0]";
        }
        String Qhi2 = Qhi();
        int Qhi3 = Qhi(Qhi2, 64);
        if (Qhi3 == -1) {
            if (this.CJ.length <= 64) {
                return "[hex=" + cJ() + "]";
            }
            return "[size=" + this.CJ.length + " hex=" + Qhi(0, 64).cJ() + "…]";
        }
        String replace = Qhi2.substring(0, Qhi3).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (Qhi3 < Qhi2.length()) {
            return "[size=" + this.CJ.length + " text=" + replace + "…]";
        }
        return h.d("[text=", replace, "]");
    }

    public String Qhi() {
        String str = this.Tgh;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.CJ, cJ);
        this.Tgh = str2;
        return str2;
    }

    public fl Qhi(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.CJ;
            if (i11 <= bArr.length) {
                int i12 = i11 - i10;
                if (i12 >= 0) {
                    if (i10 == 0 && i11 == bArr.length) {
                        return this;
                    }
                    byte[] bArr2 = new byte[i12];
                    System.arraycopy(bArr, i10, bArr2, 0, i12);
                    return new fl(bArr2);
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(h.g(new StringBuilder("endIndex > length("), this.CJ.length, ")"));
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte Qhi(int i10) {
        return this.CJ[i10];
    }

    public boolean Qhi(int i10, fl flVar, int i11, int i12) {
        return flVar.Qhi(i11, this.CJ, i10, i12);
    }

    public boolean Qhi(int i10, byte[] bArr, int i11, int i12) {
        if (i10 >= 0) {
            byte[] bArr2 = this.CJ;
            return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && WAv.Qhi(bArr2, i10, bArr, i11, i12);
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: Qhi */
    public int compareTo(fl flVar) {
        int ac2 = ac();
        int ac3 = flVar.ac();
        int min = Math.min(ac2, ac3);
        for (int i10 = 0; i10 < min; i10++) {
            int Qhi2 = Qhi(i10) & 255;
            int Qhi3 = flVar.Qhi(i10) & 255;
            if (Qhi2 != Qhi3) {
                return Qhi2 < Qhi3 ? -1 : 1;
            }
        }
        if (ac2 == ac3) {
            return 0;
        }
        return ac2 < ac3 ? -1 : 1;
    }

    public static int Qhi(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            if (i12 == i10) {
                return i11;
            }
            int codePointAt = str.codePointAt(i11);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i12++;
            i11 += Character.charCount(codePointAt);
        }
        return str.length();
    }
}
