package com.tom_roush.pdfbox.pdmodel.encryption;

import a0.a;

/* loaded from: classes2.dex */
public abstract class ProtectionPolicy {
    private static final int DEFAULT_KEY_LENGTH = 40;
    private int encryptionKeyLength = 40;
    private boolean preferAES = false;

    public int getEncryptionKeyLength() {
        return this.encryptionKeyLength;
    }

    public boolean isPreferAES() {
        return this.preferAES;
    }

    public void setEncryptionKeyLength(int i10) {
        if (i10 != 40 && i10 != 128 && i10 != 256) {
            throw new IllegalArgumentException(a.g("Invalid key length '", i10, "' value must be 40, 128 or 256!"));
        }
        this.encryptionKeyLength = i10;
    }

    public void setPreferAES(boolean z10) {
        this.preferAES = z10;
    }
}
