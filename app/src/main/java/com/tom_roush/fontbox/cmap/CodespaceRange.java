package com.tom_roush.fontbox.cmap;

/* loaded from: classes2.dex */
public class CodespaceRange {
    private int codeLength;
    private int[] end;
    private byte[] endBytes;
    private int[] start;
    private byte[] startBytes;

    public CodespaceRange(byte[] bArr, byte[] bArr2) {
        this.codeLength = 0;
        if (bArr.length != bArr2.length && bArr.length == 1 && bArr[0] == 0) {
            bArr = new byte[bArr2.length];
        } else if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("The start and the end values must not have different lengths.");
        }
        this.start = new int[bArr.length];
        this.end = new int[bArr2.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            this.start[i10] = bArr[i10] & 255;
            this.end[i10] = bArr2[i10] & 255;
        }
        this.codeLength = bArr2.length;
    }

    public int getCodeLength() {
        return this.codeLength;
    }

    public byte[] getEnd() {
        return this.endBytes;
    }

    public byte[] getStart() {
        return this.startBytes;
    }

    public boolean isFullMatch(byte[] bArr, int i10) {
        if (this.codeLength != i10) {
            return false;
        }
        for (int i11 = 0; i11 < this.codeLength; i11++) {
            int i12 = bArr[i11] & 255;
            if (i12 < this.start[i11] || i12 > this.end[i11]) {
                return false;
            }
        }
        return true;
    }

    public boolean matches(byte[] bArr) {
        return isFullMatch(bArr, bArr.length);
    }

    public void setEnd(byte[] bArr) {
        this.endBytes = bArr;
        this.end = new int[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            this.end[i10] = bArr[i10] & 255;
        }
    }

    public void setStart(byte[] bArr) {
        this.startBytes = bArr;
        this.start = new int[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            this.start[i10] = bArr[i10] & 255;
        }
        this.codeLength = bArr.length;
    }

    public CodespaceRange() {
        this.codeLength = 0;
    }
}
