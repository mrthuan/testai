package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import java.io.InputStream;

/* loaded from: classes2.dex */
public interface ExternalSigningSupport {
    InputStream getContent();

    void setSignature(byte[] bArr);
}
