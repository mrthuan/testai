package lib.zj.office.fc.util;

import androidx.appcompat.view.menu.d;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DecimalFormat;

/* loaded from: classes3.dex */
public class HexDump {
    public static final String EOL = System.getProperty("line.separator");
    private static final char[] _hexcodes = "0123456789ABCDEF".toCharArray();
    private static final int[] _shifts = {60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0};

    private HexDump() {
    }

    public static char[] byteToHex(int i10) {
        return toHexChars(i10, 1);
    }

    public static void dump(byte[] bArr, long j10, OutputStream outputStream, int i10, int i11) {
        if (bArr.length == 0) {
            outputStream.write(("No Data" + System.getProperty("line.separator")).getBytes());
            outputStream.flush();
        } else if (i10 < 0 || i10 >= bArr.length) {
            StringBuilder e10 = d.e("illegal index: ", i10, " into array of length ");
            e10.append(bArr.length);
            throw new ArrayIndexOutOfBoundsException(e10.toString());
        } else if (outputStream != null) {
            long j11 = j10 + i10;
            StringBuffer stringBuffer = new StringBuffer(74);
            int min = Math.min(bArr.length, i11 + i10);
            while (i10 < min) {
                int i12 = min - i10;
                if (i12 > 16) {
                    i12 = 16;
                }
                stringBuffer.append(dump(j11));
                stringBuffer.append(' ');
                for (int i13 = 0; i13 < 16; i13++) {
                    if (i13 < i12) {
                        stringBuffer.append(dump(bArr[i13 + i10]));
                    } else {
                        stringBuffer.append("  ");
                    }
                    stringBuffer.append(' ');
                }
                for (int i14 = 0; i14 < i12; i14++) {
                    byte b10 = bArr[i14 + i10];
                    if (b10 >= 32 && b10 < Byte.MAX_VALUE) {
                        stringBuffer.append((char) b10);
                    } else {
                        stringBuffer.append('.');
                    }
                }
                stringBuffer.append(EOL);
                outputStream.write(stringBuffer.toString().getBytes());
                outputStream.flush();
                stringBuffer.setLength(0);
                j11 += i12;
                i10 += 16;
            }
        } else {
            throw new IllegalArgumentException("cannot write to nullstream");
        }
    }

    public static char[] intToHex(int i10) {
        return toHexChars(i10, 4);
    }

    public static char[] longToHex(long j10) {
        return toHexChars(j10, 8);
    }

    public static void main(String[] strArr) {
        File file = new File(strArr[0]);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        byte[] bArr = new byte[(int) file.length()];
        bufferedInputStream.read(bArr);
        System.out.println(dump(bArr, 0L, 0));
        bufferedInputStream.close();
    }

    public static char[] shortToHex(int i10) {
        return toHexChars(i10, 2);
    }

    public static String toHex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer("[");
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(toHex(bArr[i10]));
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    private static char[] toHexChars(long j10, int i10) {
        int i11 = (i10 * 2) + 2;
        char[] cArr = new char[i11];
        do {
            i11--;
            cArr[i11] = _hexcodes[(int) (15 & j10)];
            j10 >>>= 4;
        } while (i11 > 1);
        cArr[0] = '0';
        cArr[1] = 'x';
        return cArr;
    }

    public static String toHex(short[] sArr) {
        StringBuffer stringBuffer = new StringBuffer("[");
        for (short s4 : sArr) {
            stringBuffer.append(toHex(s4));
            stringBuffer.append(", ");
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public static String toHex(byte[] bArr, int i10) {
        int round = (int) Math.round((Math.log(bArr.length) / Math.log(10.0d)) + 0.5d);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < round; i11++) {
            stringBuffer.append('0');
        }
        stringBuffer.append(": ");
        DecimalFormat decimalFormat = new DecimalFormat(stringBuffer.toString());
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(decimalFormat.format(0L));
        int i12 = -1;
        for (int i13 = 0; i13 < bArr.length; i13++) {
            i12++;
            if (i12 == i10) {
                stringBuffer2.append('\n');
                stringBuffer2.append(decimalFormat.format(i13));
                i12 = 0;
            }
            stringBuffer2.append(toHex(bArr[i13]));
            stringBuffer2.append(", ");
        }
        return stringBuffer2.toString();
    }

    public static String toHex(short s4) {
        return toHex(s4, 4);
    }

    public static String toHex(byte b10) {
        return toHex(b10, 2);
    }

    public static String toHex(int i10) {
        return toHex(i10, 8);
    }

    public static String toHex(long j10) {
        return toHex(j10, 16);
    }

    private static String toHex(long j10, int i10) {
        StringBuffer stringBuffer = new StringBuffer(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            stringBuffer.append(_hexcodes[(int) ((j10 >> _shifts[(16 - i10) + i11]) & 15)]);
        }
        return stringBuffer.toString();
    }

    public static synchronized void dump(byte[] bArr, long j10, OutputStream outputStream, int i10) {
        synchronized (HexDump.class) {
            dump(bArr, j10, outputStream, i10, bArr.length - i10);
        }
    }

    public static String dump(byte[] bArr, long j10, int i10) {
        if (i10 >= 0 && i10 < bArr.length) {
            long j11 = j10 + i10;
            StringBuffer stringBuffer = new StringBuffer(74);
            while (i10 < bArr.length) {
                int length = bArr.length - i10;
                if (length > 16) {
                    length = 16;
                }
                stringBuffer.append(dump(j11));
                stringBuffer.append(' ');
                for (int i11 = 0; i11 < 16; i11++) {
                    if (i11 < length) {
                        stringBuffer.append(dump(bArr[i11 + i10]));
                    } else {
                        stringBuffer.append("  ");
                    }
                    stringBuffer.append(' ');
                }
                for (int i12 = 0; i12 < length; i12++) {
                    byte b10 = bArr[i12 + i10];
                    if (b10 >= 32 && b10 < Byte.MAX_VALUE) {
                        stringBuffer.append((char) b10);
                    } else {
                        stringBuffer.append('.');
                    }
                }
                stringBuffer.append(EOL);
                j11 += length;
                i10 += 16;
            }
            return stringBuffer.toString();
        }
        StringBuilder e10 = d.e("illegal index: ", i10, " into array of length ");
        e10.append(bArr.length);
        throw new ArrayIndexOutOfBoundsException(e10.toString());
    }

    private static String dump(long j10) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.setLength(0);
        for (int i10 = 0; i10 < 8; i10++) {
            char[] cArr = _hexcodes;
            int[] iArr = _shifts;
            stringBuffer.append(cArr[((int) (j10 >> iArr[(iArr.length + i10) - 8])) & 15]);
        }
        return stringBuffer.toString();
    }

    private static String dump(byte b10) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.setLength(0);
        for (int i10 = 0; i10 < 2; i10++) {
            stringBuffer.append(_hexcodes[(b10 >> _shifts[i10 + 6]) & 15]);
        }
        return stringBuffer.toString();
    }

    public static void dump(InputStream inputStream, PrintStream printStream, int i10, int i11) {
        int read;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (i11 != -1) {
            while (true) {
                int i12 = i11 - 1;
                if (i11 <= 0 || (read = inputStream.read()) == -1) {
                    break;
                }
                byteArrayOutputStream.write(read);
                i11 = i12;
            }
        } else {
            int read2 = inputStream.read();
            while (read2 != -1) {
                byteArrayOutputStream.write(read2);
                read2 = inputStream.read();
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        dump(byteArray, 0L, printStream, i10, byteArray.length);
    }
}
