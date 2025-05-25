package com.tom_roush.pdfbox.pdmodel.encryption;

/* loaded from: classes2.dex */
public class StandardDecryptionMaterial extends DecryptionMaterial {
    private String password;

    public StandardDecryptionMaterial(String str) {
        this.password = str;
    }

    public String getPassword() {
        return this.password;
    }
}
