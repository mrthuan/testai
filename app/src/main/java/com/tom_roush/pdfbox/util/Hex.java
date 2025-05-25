package com.tom_roush.pdfbox.util;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: classes2.dex */
public final class Hex {
    private static final byte[] HEX_BYTES = {48, Field.EQ, Field.GOTOBUTTON, Field.MACROBUTTON, Field.AUTONUMOUT, Field.AUTONUMLGL, Field.AUTONUM, Field.IMPORT, 56, Field.SYMBOL, Field.SECTION, Field.SECTIONPAGES, Field.INCLUDEPICTURE, Field.INCLUDETEXT, Field.FILESIZE, Field.FORMTEXT};
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private Hex() {
    }

    public static byte[] decodeBase64(String str) {
        try {
            Class<?> cls = Class.forName("java.util.Base64");
            Object invoke = cls.getMethod("getDecoder", new Class[0]).invoke(cls, new Object[0]);
            return (byte[]) invoke.getClass().getMethod("decode", String.class).invoke(invoke, str.replaceAll("\\s", ""));
        } catch (ClassNotFoundException e10) {
            e10.getMessage();
            try {
                return (byte[]) Class.forName("javax.xml.bind.DatatypeConverter").getMethod("parseBase64Binary", String.class).invoke(null, str);
            } catch (ClassNotFoundException e11) {
                e11.getMessage();
                return new byte[0];
            } catch (IllegalAccessException e12) {
                e12.getMessage();
                return new byte[0];
            } catch (IllegalArgumentException e13) {
                e13.getMessage();
                return new byte[0];
            } catch (NoSuchMethodException e14) {
                e14.getMessage();
                return new byte[0];
            } catch (SecurityException e15) {
                e15.getMessage();
                return new byte[0];
            } catch (InvocationTargetException e16) {
                e16.getMessage();
                return new byte[0];
            }
        } catch (IllegalAccessException e17) {
            e17.getMessage();
            return (byte[]) Class.forName("javax.xml.bind.DatatypeConverter").getMethod("parseBase64Binary", String.class).invoke(null, str);
        } catch (IllegalArgumentException e18) {
            e18.getMessage();
            return (byte[]) Class.forName("javax.xml.bind.DatatypeConverter").getMethod("parseBase64Binary", String.class).invoke(null, str);
        } catch (NoSuchMethodException e19) {
            e19.getMessage();
            return (byte[]) Class.forName("javax.xml.bind.DatatypeConverter").getMethod("parseBase64Binary", String.class).invoke(null, str);
        } catch (SecurityException e20) {
            e20.getMessage();
            return (byte[]) Class.forName("javax.xml.bind.DatatypeConverter").getMethod("parseBase64Binary", String.class).invoke(null, str);
        } catch (InvocationTargetException e21) {
            e21.getMessage();
            return (byte[]) Class.forName("javax.xml.bind.DatatypeConverter").getMethod("parseBase64Binary", String.class).invoke(null, str);
        }
    }

    public static byte[] decodeHex(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        while (i10 < str.length() - 1) {
            if (str.charAt(i10) != '\n' && str.charAt(i10) != '\r') {
                int i11 = i10 + 2;
                try {
                    byteArrayOutputStream.write(Integer.parseInt(str.substring(i10, i11), 16));
                    i10 = i11;
                } catch (NumberFormatException unused) {
                }
            } else {
                i10++;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] getBytes(byte b10) {
        byte[] bArr = HEX_BYTES;
        return new byte[]{bArr[getHighNibble(b10)], bArr[getLowNibble(b10)]};
    }

    public static char[] getChars(short s4) {
        char[] cArr = HEX_CHARS;
        return new char[]{cArr[(s4 >> 12) & 15], cArr[(s4 >> 8) & 15], cArr[(s4 >> 4) & 15], cArr[s4 & 15]};
    }

    public static char[] getCharsUTF16BE(String str) {
        char[] cArr = new char[str.length() * 4];
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            int i12 = i10 + 1;
            char[] cArr2 = HEX_CHARS;
            cArr[i10] = cArr2[(charAt >> '\f') & 15];
            int i13 = i12 + 1;
            cArr[i12] = cArr2[(charAt >> '\b') & 15];
            int i14 = i13 + 1;
            cArr[i13] = cArr2[(charAt >> 4) & 15];
            i10 = i14 + 1;
            cArr[i14] = cArr2[charAt & 15];
        }
        return cArr;
    }

    private static int getHighNibble(byte b10) {
        return (b10 & 240) >> 4;
    }

    private static int getLowNibble(byte b10) {
        return b10 & 15;
    }

    public static String getString(byte b10) {
        char[] cArr = HEX_CHARS;
        return new String(new char[]{cArr[getHighNibble(b10)], cArr[getLowNibble(b10)]});
    }

    public static void writeHexByte(byte b10, OutputStream outputStream) {
        byte[] bArr = HEX_BYTES;
        outputStream.write(bArr[getHighNibble(b10)]);
        outputStream.write(bArr[getLowNibble(b10)]);
    }

    public static void writeHexBytes(byte[] bArr, OutputStream outputStream) {
        for (byte b10 : bArr) {
            writeHexByte(b10, outputStream);
        }
    }

    public static byte[] getBytes(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 * 2;
            byte[] bArr3 = HEX_BYTES;
            bArr2[i11] = bArr3[getHighNibble(bArr[i10])];
            bArr2[i11 + 1] = bArr3[getLowNibble(bArr[i10])];
        }
        return bArr2;
    }

    public static String getString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            char[] cArr = HEX_CHARS;
            sb2.append(cArr[getHighNibble(b10)]);
            sb2.append(cArr[getLowNibble(b10)]);
        }
        return sb2.toString();
    }
}
