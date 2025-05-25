package com.tom_roush.pdfbox.cos;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class COSBoolean extends COSBase {
    private final boolean value;
    public static final byte[] TRUE_BYTES = {116, 114, 117, 101};
    public static final byte[] FALSE_BYTES = {102, 97, 108, 115, 101};
    public static final COSBoolean TRUE = new COSBoolean(true);
    public static final COSBoolean FALSE = new COSBoolean(false);

    private COSBoolean(boolean z10) {
        this.value = z10;
    }

    public static COSBoolean getBoolean(boolean z10) {
        return z10 ? TRUE : FALSE;
    }

    @Override // com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) {
        return iCOSVisitor.visitFromBoolean(this);
    }

    public boolean getValue() {
        return this.value;
    }

    public Boolean getValueAsObject() {
        if (this.value) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public void writePDF(OutputStream outputStream) {
        if (this.value) {
            outputStream.write(TRUE_BYTES);
        } else {
            outputStream.write(FALSE_BYTES);
        }
    }

    public static COSBoolean getBoolean(Boolean bool) {
        return getBoolean(bool.booleanValue());
    }
}
