package com.tom_roush.pdfbox.pdmodel.font;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class PDPanose {
    private final byte[] bytes;

    public PDPanose(byte[] bArr) {
        this.bytes = bArr;
    }

    public int getFamilyClass() {
        byte[] bArr = this.bytes;
        return bArr[1] | (bArr[0] << 8);
    }

    public PDPanoseClassification getPanose() {
        return new PDPanoseClassification(Arrays.copyOfRange(this.bytes, 2, 12));
    }
}
