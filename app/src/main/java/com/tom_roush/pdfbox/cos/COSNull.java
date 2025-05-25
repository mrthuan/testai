package com.tom_roush.pdfbox.cos;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class COSNull extends COSBase {
    public static final byte[] NULL_BYTES = {110, 117, 108, 108};
    public static final COSNull NULL = new COSNull();

    private COSNull() {
    }

    @Override // com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) {
        return iCOSVisitor.visitFromNull(this);
    }

    public String toString() {
        return "COSNull{}";
    }

    public void writePDF(OutputStream outputStream) {
        outputStream.write(NULL_BYTES);
    }
}
