package com.facebook.ads.redexgen.X;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* renamed from: com.facebook.ads.redexgen.X.Cu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0746Cu {
    public static String[] A04 = {"GYrJjryQ", "l1vtwRLciJO79TPd4dMzqXi", "am4ITL2jdxZMOs0tYLCUV7", "IopdsR38pvUxqoXTri8", "J32Wu8S230nd5RtY", "R18sfAJO8lXvTtHsdQUoUfRtHeQjtOXD", "R", "yrpLUS1axgX94y0Yd6UgIHXVf93X"};
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public C0746Cu(byte[] bArr) {
        this.A03 = bArr;
        this.A02 = bArr.length;
    }

    private void A00() {
        AbstractC0844Hf.A04(this.A01 >= 0 && (this.A01 < this.A02 || (this.A01 == this.A02 && this.A00 == 0)));
    }

    public final int A01() {
        return (this.A01 * 8) + this.A00;
    }

    public final int A02(int i10) {
        int i11 = this.A01;
        int tempByteOffset = Math.min(i10, 8 - this.A00);
        int bitsRead = i11 + 1;
        int i12 = ((this.A03[i11] & 255) >> this.A00) & (FunctionEval.FunctionID.EXTERNAL_FUNC >> (8 - tempByteOffset));
        while (tempByteOffset < i10) {
            int i13 = bitsRead + 1;
            int tempByteOffset2 = this.A03[bitsRead];
            int bitsRead2 = A04[5].charAt(24);
            if (bitsRead2 == 101) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[4] = "90jqTQXPeuHnGMLj";
            strArr[6] = "7";
            i12 |= (tempByteOffset2 & FunctionEval.FunctionID.EXTERNAL_FUNC) << tempByteOffset;
            tempByteOffset += 8;
            bitsRead = i13;
        }
        int bitsRead3 = 32 - i10;
        int returnValue = (-1) >>> bitsRead3;
        int i14 = i12 & returnValue;
        A03(i10);
        return i14;
    }

    public final void A03(int i10) {
        int i11 = i10 / 8;
        int numBytes = this.A01;
        this.A01 = numBytes + i11;
        int numBytes2 = i11 * 8;
        this.A00 += i10 - numBytes2;
        if (this.A00 > 7) {
            int numBytes3 = this.A01;
            this.A01 = numBytes3 + 1;
            int numBytes4 = this.A00;
            this.A00 = numBytes4 - 8;
        }
        A00();
    }

    public final boolean A04() {
        boolean returnValue = (((this.A03[this.A01] & 255) >> this.A00) & 1) == 1;
        A03(1);
        return returnValue;
    }
}
