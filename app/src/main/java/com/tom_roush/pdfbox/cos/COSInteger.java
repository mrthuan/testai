package com.tom_roush.pdfbox.cos;

import android.support.v4.media.session.h;
import java.io.OutputStream;
import lib.zj.office.fc.codec.CharEncoding;

/* loaded from: classes2.dex */
public final class COSInteger extends COSNumber {
    private static final int HIGH = 256;
    private static final int LOW = -100;
    private final boolean isValid;
    private final long value;
    private static final COSInteger[] STATIC = new COSInteger[357];
    public static final COSInteger ZERO = get(0);
    public static final COSInteger ONE = get(1);
    public static final COSInteger TWO = get(2);
    public static final COSInteger THREE = get(3);
    protected static final COSInteger OUT_OF_RANGE_MAX = getInvalid(true);
    protected static final COSInteger OUT_OF_RANGE_MIN = getInvalid(false);

    private COSInteger(long j10, boolean z10) {
        this.value = j10;
        this.isValid = z10;
    }

    public static COSInteger get(long j10) {
        if (-100 <= j10 && j10 <= 256) {
            int i10 = ((int) j10) + 100;
            COSInteger[] cOSIntegerArr = STATIC;
            if (cOSIntegerArr[i10] == null) {
                cOSIntegerArr[i10] = new COSInteger(j10, true);
            }
            return cOSIntegerArr[i10];
        }
        return new COSInteger(j10, true);
    }

    private static COSInteger getInvalid(boolean z10) {
        if (z10) {
            return new COSInteger(Long.MAX_VALUE, false);
        }
        return new COSInteger(Long.MIN_VALUE, false);
    }

    @Override // com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) {
        return iCOSVisitor.visitFromInt(this);
    }

    @Override // com.tom_roush.pdfbox.cos.COSNumber
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof COSInteger) && ((COSInteger) obj).intValue() == intValue()) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.cos.COSNumber
    public float floatValue() {
        return (float) this.value;
    }

    public int hashCode() {
        long j10 = this.value;
        return (int) (j10 ^ (j10 >> 32));
    }

    @Override // com.tom_roush.pdfbox.cos.COSNumber
    public int intValue() {
        return (int) this.value;
    }

    public boolean isValid() {
        return this.isValid;
    }

    @Override // com.tom_roush.pdfbox.cos.COSNumber
    public long longValue() {
        return this.value;
    }

    public String toString() {
        return h.e(new StringBuilder("COSInt{"), this.value, "}");
    }

    public void writePDF(OutputStream outputStream) {
        outputStream.write(String.valueOf(this.value).getBytes(CharEncoding.ISO_8859_1));
    }
}
