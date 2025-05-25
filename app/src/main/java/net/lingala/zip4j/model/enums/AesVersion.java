// Auto-fixed: added missing class declaration
public class AesVersion {
package net.lingala.zip4j.model.enums;

import net.lingala.zip4j.exception.ZipException;

/* loaded from: classes3.dex */
public enum AesVersion {
    ONE(1),
    TWO(2);
    
    private int versionNumber;

    AesVersion(int i10) {
        this.versionNumber = i10;
    }

    public static AesVersion getFromVersionNumber(int i10) {
        AesVersion[] values;
        for (AesVersion aesVersion : values()) {
            if (aesVersion.versionNumber == i10) {
                return aesVersion;
            }
        }
        throw new ZipException("Unsupported Aes version");
    }

    public int getVersionNumber() {
        return this.versionNumber;
    }
}

}
