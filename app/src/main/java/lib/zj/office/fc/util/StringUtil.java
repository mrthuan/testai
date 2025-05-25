package lib.zj.office.fc.util;

import a6.h;
import androidx.appcompat.view.menu.d;
import b.a;
import java.io.UnsupportedEncodingException;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.Iterator;
import lib.zj.office.fc.codec.CharEncoding;

/* loaded from: classes3.dex */
public class StringUtil {
    private static final String ENCODING_ISO_8859_1 = "ISO-8859-1";

    /* loaded from: classes3.dex */
    public static class StringsIterator implements Iterator<String> {
        private int position = 0;
        private String[] strings;

        public StringsIterator(String[] strArr) {
            if (strArr != null) {
                this.strings = strArr;
            } else {
                this.strings = new String[0];
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.position < this.strings.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public String next() {
            int i10 = this.position;
            this.position = i10 + 1;
            String[] strArr = this.strings;
            if (i10 < strArr.length) {
                return strArr[i10];
            }
            throw new ArrayIndexOutOfBoundsException(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    private StringUtil() {
    }

    public static String format(String str, Object[] objArr) {
        int i10;
        int i11;
        StringBuffer stringBuffer = new StringBuffer();
        int i12 = 0;
        int i13 = 0;
        while (i12 < str.length()) {
            if (str.charAt(i12) == '%') {
                if (i13 >= objArr.length) {
                    stringBuffer.append("?missing data?");
                } else if ((objArr[i13] instanceof Number) && (i11 = i12 + 1) < str.length()) {
                    i12 += matchOptionalFormatting((Number) objArr[i13], str.substring(i11), stringBuffer);
                    i13++;
                } else {
                    stringBuffer.append(objArr[i13].toString());
                    i13++;
                }
            } else if (str.charAt(i12) == '\\' && (i10 = i12 + 1) < str.length() && str.charAt(i10) == '%') {
                stringBuffer.append('%');
                i12 = i10;
            } else {
                stringBuffer.append(str.charAt(i12));
            }
            i12++;
        }
        return stringBuffer.toString();
    }

    public static int getEncodedSize(String str) {
        int i10;
        int length = str.length();
        if (hasMultibyte(str)) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        return (length * i10) + 3;
    }

    public static String getFromCompressedUnicode(byte[] bArr, int i10, int i11) {
        try {
            return new String(bArr, i10, Math.min(i11, bArr.length - i10), "ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String getFromUnicodeLE(byte[] bArr, int i10, int i11) {
        if (i10 >= 0 && i10 < bArr.length) {
            if (i11 >= 0 && (bArr.length - i10) / 2 >= i11) {
                try {
                    return new String(bArr, i10, i11 * 2, CharEncoding.UTF_16LE);
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            }
            throw new IllegalArgumentException(a.c("Illegal length ", i11));
        }
        throw new ArrayIndexOutOfBoundsException(h.g(d.e("Illegal offset ", i10, " (String data is of length "), bArr.length, ")"));
    }

    public static String getPreferredEncoding() {
        return "ISO-8859-1";
    }

    public static boolean hasMultibyte(String str) {
        if (str == null) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (str.charAt(i10) > 255) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUnicodeString(String str) {
        try {
            return !str.equals(new String(str.getBytes("ISO-8859-1"), "ISO-8859-1"));
        } catch (UnsupportedEncodingException unused) {
            return true;
        }
    }

    private static int matchOptionalFormatting(Number number, String str, StringBuffer stringBuffer) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        if (str.length() > 0 && Character.isDigit(str.charAt(0))) {
            numberFormat.setMinimumIntegerDigits(Integer.parseInt(str.charAt(0) + ""));
            if (2 < str.length() && str.charAt(1) == '.' && Character.isDigit(str.charAt(2))) {
                numberFormat.setMaximumFractionDigits(Integer.parseInt(str.charAt(2) + ""));
                numberFormat.format(number, stringBuffer, new FieldPosition(0));
                return 3;
            }
            numberFormat.format(number, stringBuffer, new FieldPosition(0));
            return 1;
        } else if (str.length() > 0 && str.charAt(0) == '.' && 1 < str.length() && Character.isDigit(str.charAt(1))) {
            numberFormat.setMaximumFractionDigits(Integer.parseInt(str.charAt(1) + ""));
            numberFormat.format(number, stringBuffer, new FieldPosition(0));
            return 2;
        } else {
            numberFormat.format(number, stringBuffer, new FieldPosition(0));
            return 1;
        }
    }

    public static void putCompressedUnicode(String str, byte[] bArr, int i10) {
        try {
            byte[] bytes = str.getBytes("ISO-8859-1");
            System.arraycopy(bytes, 0, bArr, i10, bytes.length);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void putUnicodeLE(String str, byte[] bArr, int i10) {
        try {
            byte[] bytes = str.getBytes(CharEncoding.UTF_16LE);
            System.arraycopy(bytes, 0, bArr, i10, bytes.length);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String readCompressedUnicode(LittleEndianInput littleEndianInput, int i10) {
        char[] cArr = new char[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            cArr[i11] = (char) littleEndianInput.readUByte();
        }
        return new String(cArr);
    }

    public static String readUnicodeLE(LittleEndianInput littleEndianInput, int i10) {
        char[] cArr = new char[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            cArr[i11] = (char) littleEndianInput.readUShort();
        }
        return new String(cArr);
    }

    public static String readUnicodeString(LittleEndianInput littleEndianInput) {
        int readUShort = littleEndianInput.readUShort();
        if ((littleEndianInput.readByte() & 1) == 0) {
            return readCompressedUnicode(littleEndianInput, readUShort);
        }
        return readUnicodeLE(littleEndianInput, readUShort);
    }

    public static void writeUnicodeString(LittleEndianOutput littleEndianOutput, String str) {
        littleEndianOutput.writeShort(str.length());
        boolean hasMultibyte = hasMultibyte(str);
        littleEndianOutput.writeByte(hasMultibyte ? 1 : 0);
        if (hasMultibyte) {
            putUnicodeLE(str, littleEndianOutput);
        } else {
            putCompressedUnicode(str, littleEndianOutput);
        }
    }

    public static void writeUnicodeStringFlagAndData(LittleEndianOutput littleEndianOutput, String str) {
        boolean hasMultibyte = hasMultibyte(str);
        littleEndianOutput.writeByte(hasMultibyte ? 1 : 0);
        if (hasMultibyte) {
            putUnicodeLE(str, littleEndianOutput);
        } else {
            putCompressedUnicode(str, littleEndianOutput);
        }
    }

    public static void putCompressedUnicode(String str, LittleEndianOutput littleEndianOutput) {
        try {
            littleEndianOutput.write(str.getBytes("ISO-8859-1"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void putUnicodeLE(String str, LittleEndianOutput littleEndianOutput) {
        try {
            littleEndianOutput.write(str.getBytes(CharEncoding.UTF_16LE));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String readUnicodeString(LittleEndianInput littleEndianInput, int i10) {
        if ((littleEndianInput.readByte() & 1) == 0) {
            return readCompressedUnicode(littleEndianInput, i10);
        }
        return readUnicodeLE(littleEndianInput, i10);
    }

    public static String getFromUnicodeLE(byte[] bArr) {
        return bArr.length == 0 ? "" : getFromUnicodeLE(bArr, 0, bArr.length / 2);
    }
}
