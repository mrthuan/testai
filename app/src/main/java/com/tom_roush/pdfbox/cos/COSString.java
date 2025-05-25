package com.tom_roush.pdfbox.cos;

import com.tom_roush.pdfbox.util.Charsets;
import com.tom_roush.pdfbox.util.Hex;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class COSString extends COSBase {
    public static final boolean FORCE_PARSING = Boolean.getBoolean("com.tom_roush.pdfbox.forceParsing");
    private byte[] bytes;
    private boolean forceHexForm;

    public COSString(byte[] bArr) {
        setValue(bArr);
    }

    public static COSString parseHex(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        StringBuilder sb2 = new StringBuilder(str.trim());
        if (sb2.length() % 2 != 0) {
            sb2.append('0');
        }
        int length = sb2.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 2;
            try {
                byteArrayOutputStream.write(Integer.parseInt(sb2.substring(i10, i11), 16));
            } catch (NumberFormatException e10) {
                if (FORCE_PARSING) {
                    byteArrayOutputStream.write(63);
                } else {
                    throw new IOException("Invalid hex string: ".concat(str), e10);
                }
            }
            i10 = i11;
        }
        return new COSString(byteArrayOutputStream.toByteArray());
    }

    @Override // com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) {
        return iCOSVisitor.visitFromString(this);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof COSString)) {
            return false;
        }
        COSString cOSString = (COSString) obj;
        if (!getString().equals(cOSString.getString()) || this.forceHexForm != cOSString.forceHexForm) {
            return false;
        }
        return true;
    }

    public String getASCII() {
        return new String(this.bytes, Charsets.US_ASCII);
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public boolean getForceHexForm() {
        return this.forceHexForm;
    }

    public String getString() {
        byte[] bArr = this.bytes;
        if (bArr.length >= 2) {
            byte b10 = bArr[0];
            if ((b10 & 255) == 254 && (bArr[1] & 255) == 255) {
                return new String(bArr, 2, bArr.length - 2, Charsets.UTF_16BE);
            }
            if ((b10 & 255) == 255 && (bArr[1] & 255) == 254) {
                return new String(bArr, 2, bArr.length - 2, Charsets.UTF_16LE);
            }
        }
        return PDFDocEncoding.toString(bArr);
    }

    public int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.bytes);
        if (this.forceHexForm) {
            i10 = 17;
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public void setForceHexForm(boolean z10) {
        this.forceHexForm = z10;
    }

    public void setValue(byte[] bArr) {
        this.bytes = (byte[]) bArr.clone();
    }

    public String toHexString() {
        return Hex.getString(this.bytes);
    }

    public String toString() {
        return "COSString{" + getString() + "}";
    }

    public COSString(String str) {
        boolean z10;
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = true;
                break;
            } else if (!PDFDocEncoding.containsChar(charArray[i10])) {
                z10 = false;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            this.bytes = PDFDocEncoding.getBytes(str);
            return;
        }
        byte[] bytes = str.getBytes(Charsets.UTF_16BE);
        byte[] bArr = new byte[bytes.length + 2];
        this.bytes = bArr;
        bArr[0] = -2;
        bArr[1] = -1;
        System.arraycopy(bytes, 0, bArr, 2, bytes.length);
    }
}
