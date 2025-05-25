// Auto-fixed: added missing class declaration
public class PictureType {
package lib.zj.office.fc.hwpf.usermodel;

import lib.zj.office.fc.openxml4j.opc.ContentTypes;

/* loaded from: classes3.dex */
public enum PictureType {
    BMP("image/bmp", "bmp", new byte[][]{new byte[]{Field.SECTIONPAGES, 77}}),
    EMF("image/x-emf", "emf", new byte[][]{new byte[]{1, 0, 0, 0}}),
    GIF(ContentTypes.IMAGE_GIF, ContentTypes.EXTENSION_GIF, new byte[][]{new byte[]{Field.FORMCHECKBOX, Field.TOA, Field.FORMTEXT}}),
    JPEG(ContentTypes.IMAGE_JPEG, ContentTypes.EXTENSION_JPG_1, new byte[][]{new byte[]{-1, -40}}),
    PNG(ContentTypes.IMAGE_PNG, ContentTypes.EXTENSION_PNG, new byte[][]{new byte[]{-119, 80, 78, Field.FORMCHECKBOX, 13, 10, 26, 10}}),
    TIFF(ContentTypes.IMAGE_TIFF, "tiff", new byte[][]{new byte[]{Field.TOA, Field.TOA, 42, 0}, new byte[]{77, 77, 0, 42}}),
    UNKNOWN("image/unknown", "", new byte[0]),
    WMF("image/x-wmf", "wmf", new byte[][]{new byte[]{-41, -51, -58, -102, 0, 0}, new byte[]{1, 0, 9, 0, 0, 3}});
    
    private String _extension;
    private String _mime;
    private byte[][] _signatures;

    PictureType(String str, String str2, byte[][] bArr) {
        this._mime = str;
        this._extension = str2;
        this._signatures = bArr;
    }

    public static PictureType findMatchingType(byte[] bArr) {
        PictureType[] values;
        for (PictureType pictureType : values()) {
            for (byte[] bArr2 : pictureType.getSignatures()) {
                if (matchSignature(bArr, bArr2)) {
                    return pictureType;
                }
            }
        }
        return UNKNOWN;
    }

    private static boolean matchSignature(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public String getExtension() {
        return this._extension;
    }

    public String getMime() {
        return this._mime;
    }

    public byte[][] getSignatures() {
        return this._signatures;
    }

    public boolean matchSignature(byte[] bArr) {
        for (byte[] bArr2 : getSignatures()) {
            if (matchSignature(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }
}

}
