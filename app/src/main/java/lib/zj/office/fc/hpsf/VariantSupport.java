package lib.zj.office.fc.hpsf;

import b.a;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import lib.zj.office.fc.codec.CharEncoding;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class VariantSupport extends Variant {
    public static final int[] SUPPORTED_TYPES = {0, 2, 3, 20, 5, 64, 30, 31, 71, 11};
    private static boolean logUnsupportedTypes = false;
    protected static List unsupportedMessage;

    public static String codepageToEncoding(int i10) {
        if (i10 > 0) {
            if (i10 != 1200) {
                if (i10 != 1201) {
                    if (i10 != 10081) {
                        if (i10 != 10082) {
                            switch (i10) {
                                case 37:
                                    return "cp037";
                                case Constants.CP_SJIS /* 932 */:
                                    return "SJIS";
                                case Constants.CP_GBK /* 936 */:
                                    return "GBK";
                                case Constants.CP_MS949 /* 949 */:
                                    return "ms949";
                                case Constants.CP_JOHAB /* 1361 */:
                                    return "johab";
                                case Constants.CP_MAC_ROMANIA /* 10010 */:
                                    return "MacRomania";
                                case Constants.CP_MAC_UKRAINE /* 10017 */:
                                    return "MacUkraine";
                                case Constants.CP_MAC_THAI /* 10021 */:
                                    return "MacThai";
                                case Constants.CP_MAC_CENTRAL_EUROPE /* 10029 */:
                                    return "MacCentralEurope";
                                case Constants.CP_MAC_ICELAND /* 10079 */:
                                    return "MacIceland";
                                case Constants.CP_US_ACSII /* 20127 */:
                                    return CharEncoding.US_ASCII;
                                case Constants.CP_KOI8_R /* 20866 */:
                                    return "KOI8-R";
                                case Constants.CP_ISO_2022_KR /* 50225 */:
                                    return "ISO-2022-KR";
                                case Constants.CP_EUC_JP /* 51932 */:
                                    return "EUC-JP";
                                case Constants.CP_EUC_KR /* 51949 */:
                                    return "EUC-KR";
                                case Constants.CP_GB2312 /* 52936 */:
                                    return "GB2312";
                                case Constants.CP_GB18030 /* 54936 */:
                                    return "GB18030";
                                default:
                                    switch (i10) {
                                        case Constants.CP_WINDOWS_1250 /* 1250 */:
                                            return "windows-1250";
                                        case Constants.CP_WINDOWS_1251 /* 1251 */:
                                            return "windows-1251";
                                        case Constants.CP_WINDOWS_1252 /* 1252 */:
                                            return "windows-1252";
                                        case Constants.CP_WINDOWS_1253 /* 1253 */:
                                            return "windows-1253";
                                        case Constants.CP_WINDOWS_1254 /* 1254 */:
                                            return "windows-1254";
                                        case Constants.CP_WINDOWS_1255 /* 1255 */:
                                            return "windows-1255";
                                        case Constants.CP_WINDOWS_1256 /* 1256 */:
                                            return "windows-1256";
                                        case Constants.CP_WINDOWS_1257 /* 1257 */:
                                            return "windows-1257";
                                        case Constants.CP_WINDOWS_1258 /* 1258 */:
                                            return "windows-1258";
                                        default:
                                            switch (i10) {
                                                case Constants.CP_MAC_ROMAN /* 10000 */:
                                                    return "MacRoman";
                                                case Constants.CP_MAC_JAPAN /* 10001 */:
                                                    return "SJIS";
                                                case Constants.CP_MAC_CHINESE_TRADITIONAL /* 10002 */:
                                                    return "Big5";
                                                case Constants.CP_MAC_KOREAN /* 10003 */:
                                                    return "EUC-KR";
                                                case Constants.CP_MAC_ARABIC /* 10004 */:
                                                    return "MacArabic";
                                                case Constants.CP_MAC_HEBREW /* 10005 */:
                                                    return "MacHebrew";
                                                case Constants.CP_MAC_GREEK /* 10006 */:
                                                    return "MacGreek";
                                                case Constants.CP_MAC_CYRILLIC /* 10007 */:
                                                    return "MacCyrillic";
                                                case Constants.CP_MAC_CHINESE_SIMPLE /* 10008 */:
                                                    return "EUC_CN";
                                                default:
                                                    switch (i10) {
                                                        case Constants.CP_ISO_8859_1 /* 28591 */:
                                                            return CharEncoding.ISO_8859_1;
                                                        case Constants.CP_ISO_8859_2 /* 28592 */:
                                                            return "ISO-8859-2";
                                                        case Constants.CP_ISO_8859_3 /* 28593 */:
                                                            return "ISO-8859-3";
                                                        case Constants.CP_ISO_8859_4 /* 28594 */:
                                                            return "ISO-8859-4";
                                                        case Constants.CP_ISO_8859_5 /* 28595 */:
                                                            return "ISO-8859-5";
                                                        case Constants.CP_ISO_8859_6 /* 28596 */:
                                                            return "ISO-8859-6";
                                                        case Constants.CP_ISO_8859_7 /* 28597 */:
                                                            return "ISO-8859-7";
                                                        case Constants.CP_ISO_8859_8 /* 28598 */:
                                                            return "ISO-8859-8";
                                                        case Constants.CP_ISO_8859_9 /* 28599 */:
                                                            return "ISO-8859-9";
                                                        default:
                                                            switch (i10) {
                                                                case Constants.CP_ISO_2022_JP1 /* 50220 */:
                                                                case Constants.CP_ISO_2022_JP2 /* 50221 */:
                                                                case Constants.CP_ISO_2022_JP3 /* 50222 */:
                                                                    return "ISO-2022-JP";
                                                                default:
                                                                    switch (i10) {
                                                                        case Constants.CP_US_ASCII2 /* 65000 */:
                                                                            return CharEncoding.US_ASCII;
                                                                        case Constants.CP_UTF8 /* 65001 */:
                                                                            return "UTF-8";
                                                                        default:
                                                                            return a.c("cp", i10);
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                        }
                        return "MacCroatian";
                    }
                    return "MacTurkish";
                }
                return CharEncoding.UTF_16BE;
            }
            return CharEncoding.UTF_16;
        }
        throw new UnsupportedEncodingException(a.c("Codepage number may not be ", i10));
    }

    public static boolean isLogUnsupportedTypes() {
        return logUnsupportedTypes;
    }

    public static Object read(byte[] bArr, int i10, int i11, long j10, int i12) {
        long j11;
        Object obj;
        int i13 = i11 - 4;
        if (i12 == 1200 && j10 == 30) {
            j11 = 31;
        } else {
            j11 = j10;
        }
        int i14 = (int) j11;
        if (i14 != 0) {
            if (i14 != 5) {
                if (i14 != 11) {
                    if (i14 != 20) {
                        if (i14 != 64) {
                            int i15 = 0;
                            if (i14 != 71) {
                                if (i14 != 2) {
                                    if (i14 != 3) {
                                        if (i14 != 30) {
                                            if (i14 != 31) {
                                                byte[] bArr2 = new byte[i13];
                                                while (i15 < i13) {
                                                    bArr2[i15] = bArr[i10 + i15];
                                                    i15++;
                                                }
                                                throw new ReadingNotSupportedException(j10, bArr2);
                                            }
                                            int i16 = i10 + 4;
                                            long j12 = i16;
                                            long uInt = ((LittleEndian.getUInt(bArr, i10) + j12) - 1) - j12;
                                            StringBuffer stringBuffer = new StringBuffer((int) uInt);
                                            while (i15 <= uInt) {
                                                int i17 = (i15 * 2) + i16;
                                                stringBuffer.append((char) ((bArr[i17] & 255) | (bArr[i17 + 1] << 8)));
                                                i15++;
                                            }
                                            while (stringBuffer.length() > 0 && stringBuffer.charAt(stringBuffer.length() - 1) == 0) {
                                                stringBuffer.setLength(stringBuffer.length() - 1);
                                            }
                                            return stringBuffer.toString();
                                        }
                                        int i18 = i10 + 4;
                                        long j13 = i18;
                                        long uInt2 = LittleEndian.getUInt(bArr, i10) + j13;
                                        do {
                                            uInt2--;
                                            if (bArr[(int) uInt2] != 0) {
                                                break;
                                            }
                                        } while (j13 <= uInt2);
                                        int i19 = (int) ((uInt2 - j13) + 1);
                                        if (i12 != -1) {
                                            obj = new String(bArr, i18, i19, codepageToEncoding(i12));
                                        } else {
                                            obj = new String(bArr, i18, i19);
                                        }
                                    } else {
                                        return Integer.valueOf(LittleEndian.getInt(bArr, i10));
                                    }
                                } else {
                                    return Integer.valueOf(LittleEndian.getShort(bArr, i10));
                                }
                            } else {
                                if (i13 < 0) {
                                    i13 = LittleEndian.getInt(bArr, i10);
                                    i10 += 4;
                                }
                                obj = new byte[i13];
                                System.arraycopy(bArr, i10, obj, 0, i13);
                            }
                            return obj;
                        }
                        return Util.filetimeToDate((int) LittleEndian.getUInt(bArr, i10 + 4), (int) LittleEndian.getUInt(bArr, i10));
                    }
                    return Long.valueOf(LittleEndian.getLong(bArr, i10));
                } else if (LittleEndian.getUInt(bArr, i10) != 0) {
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            }
            return new Double(LittleEndian.getDouble(bArr, i10));
        }
        return null;
    }

    public static void setLogUnsupportedTypes(boolean z10) {
        logUnsupportedTypes = z10;
    }

    public static int write(OutputStream outputStream, long j10, Object obj, int i10) {
        int writeToStream;
        byte[] bytes;
        String str;
        int i11 = (int) j10;
        if (i11 != 0) {
            if (i11 != 5) {
                if (i11 != 11) {
                    if (i11 != 20) {
                        if (i11 != 64) {
                            if (i11 != 71) {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        if (i11 != 30) {
                                            if (i11 != 31) {
                                                if (obj instanceof byte[]) {
                                                    byte[] bArr = (byte[]) obj;
                                                    outputStream.write(bArr);
                                                    int length = bArr.length;
                                                    writeUnsupportedTypeMessage(new WritingNotSupportedException(j10, obj));
                                                    return length;
                                                }
                                                throw new WritingNotSupportedException(j10, obj);
                                            }
                                            int writeUIntToStream = TypeWriter.writeUIntToStream(outputStream, str.length() + 1) + 0;
                                            char[] pad4 = Util.pad4((String) obj);
                                            for (char c : pad4) {
                                                outputStream.write((byte) (c & 255));
                                                outputStream.write((byte) ((65280 & c) >> 8));
                                                writeUIntToStream += 2;
                                            }
                                            outputStream.write(0);
                                            outputStream.write(0);
                                            return writeUIntToStream + 2;
                                        }
                                        if (i10 == -1) {
                                            bytes = ((String) obj).getBytes();
                                        } else {
                                            bytes = ((String) obj).getBytes(codepageToEncoding(i10));
                                        }
                                        int writeUIntToStream2 = TypeWriter.writeUIntToStream(outputStream, bytes.length + 1);
                                        int length2 = bytes.length + 1;
                                        byte[] bArr2 = new byte[length2];
                                        System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
                                        bArr2[length2 - 1] = 0;
                                        outputStream.write(bArr2);
                                        return writeUIntToStream2 + length2;
                                    } else if (obj instanceof Integer) {
                                        writeToStream = TypeWriter.writeToStream(outputStream, ((Integer) obj).intValue());
                                    } else {
                                        throw new ClassCastException("Could not cast an object to " + Integer.class.toString() + ": " + obj.getClass().toString() + ", " + obj.toString());
                                    }
                                } else {
                                    TypeWriter.writeToStream(outputStream, ((Integer) obj).shortValue());
                                    return 2;
                                }
                            } else {
                                byte[] bArr3 = (byte[]) obj;
                                outputStream.write(bArr3);
                                return bArr3.length;
                            }
                        } else {
                            long dateToFileTime = Util.dateToFileTime((Date) obj);
                            return TypeWriter.writeUIntToStream(outputStream, ((int) ((dateToFileTime >> 32) & 4294967295L)) & 4294967295L) + TypeWriter.writeUIntToStream(outputStream, ((int) (dateToFileTime & 4294967295L)) & 4294967295L) + 0;
                        }
                    } else {
                        TypeWriter.writeToStream(outputStream, ((Long) obj).longValue());
                        return 8;
                    }
                } else {
                    return TypeWriter.writeUIntToStream(outputStream, ((Boolean) obj).booleanValue() ? 1L : 0L);
                }
            } else {
                writeToStream = TypeWriter.writeToStream(outputStream, ((Double) obj).doubleValue());
            }
            return writeToStream + 0;
        }
        TypeWriter.writeUIntToStream(outputStream, 0L);
        return 4;
    }

    public static void writeUnsupportedTypeMessage(UnsupportedVariantTypeException unsupportedVariantTypeException) {
        if (isLogUnsupportedTypes()) {
            if (unsupportedMessage == null) {
                unsupportedMessage = new LinkedList();
            }
            Long valueOf = Long.valueOf(unsupportedVariantTypeException.getVariantType());
            if (!unsupportedMessage.contains(valueOf)) {
                System.err.println(unsupportedVariantTypeException.getMessage());
                unsupportedMessage.add(valueOf);
            }
        }
    }

    public boolean isSupportedType(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = SUPPORTED_TYPES;
            if (i11 >= iArr.length) {
                return false;
            }
            if (i10 == iArr[i11]) {
                return true;
            }
            i11++;
        }
    }
}
