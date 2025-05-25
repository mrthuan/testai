// Auto-fixed: added missing class declaration
public class AesKeyStrength {
package net.lingala.zip4j.model.enums;

/* loaded from: classes3.dex */
public enum AesKeyStrength {
    KEY_STRENGTH_128(8, 16, 16, "KEY_STRENGTH_128"),
    KEY_STRENGTH_192(12, 24, 24, "KEY_STRENGTH_192"),
    KEY_STRENGTH_256(16, 32, 32, "KEY_STRENGTH_256");
    
    private int keyLength;
    private int macLength;
    private int rawCode;
    private int saltLength;

    AesKeyStrength(int i10, int i11, int i12, String str) {
        this.rawCode = r2;
        this.saltLength = i10;
        this.macLength = i11;
        this.keyLength = i12;
    }

    public static AesKeyStrength getAesKeyStrengthFromRawCode(int i10) {
        AesKeyStrength[] values;
        for (AesKeyStrength aesKeyStrength : values()) {
            if (aesKeyStrength.getRawCode() == i10) {
                return aesKeyStrength;
            }
        }
        return null;
    }

    public int getKeyLength() {
        return this.keyLength;
    }

    public int getMacLength() {
        return this.macLength;
    }

    public int getRawCode() {
        return this.rawCode;
    }

    public int getSaltLength() {
        return this.saltLength;
    }
}

}
