package lib.zj.office.fc.hpsf;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Date;

/* loaded from: classes3.dex */
public class Util {
    public static final long EPOCH_DIFF = 11644473600000L;

    public static byte[] cat(byte[][] bArr) {
        int i10 = 0;
        for (byte[] bArr2 : bArr) {
            i10 += bArr2.length;
        }
        byte[] bArr3 = new byte[i10];
        int i11 = 0;
        for (byte[] bArr4 : bArr) {
            int i12 = 0;
            while (true) {
                if (i12 < bArr4.length) {
                    bArr3[i11] = bArr4[i12];
                    i12++;
                    i11++;
                }
            }
        }
        return bArr3;
    }

    public static void copy(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        for (int i13 = 0; i13 < i11; i13++) {
            bArr2[i12 + i13] = bArr[i10 + i13];
        }
    }

    public static long dateToFileTime(Date date) {
        return (date.getTime() + EPOCH_DIFF) * 10000;
    }

    public static boolean equal(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean equals(Collection<?> collection, Collection<?> collection2) {
        return internalEquals(collection.toArray(), collection2.toArray());
    }

    public static Date filetimeToDate(int i10, int i11) {
        return filetimeToDate((i11 & 4294967295L) | (i10 << 32));
    }

    private static boolean internalEquals(Object[] objArr, Object[] objArr2) {
        for (Object obj : objArr) {
            boolean z10 = false;
            for (int i10 = 0; !z10 && i10 < objArr.length; i10++) {
                if (obj.equals(objArr2[i10])) {
                    objArr2[i10] = null;
                    z10 = true;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public static byte[] pad4(byte[] bArr) {
        int length = bArr.length % 4;
        if (length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length + (4 - length)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static String toString(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.close();
        try {
            stringWriter.close();
            return stringWriter.toString();
        } catch (IOException e10) {
            StringBuffer stringBuffer = new StringBuffer(th2.getMessage());
            stringBuffer.append("\nCould not create a stacktrace. Reason: ");
            stringBuffer.append(e10.getMessage());
            return stringBuffer.toString();
        }
    }

    public static byte[] copy(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        copy(bArr, i10, i11, bArr2, 0);
        return bArr2;
    }

    public static Date filetimeToDate(long j10) {
        return new Date((j10 / 10000) - EPOCH_DIFF);
    }

    public static boolean equals(Object[] objArr, Object[] objArr2) {
        return internalEquals((Object[]) objArr.clone(), (Object[]) objArr2.clone());
    }

    public static char[] pad4(char[] cArr) {
        int length = cArr.length % 4;
        if (length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length + (4 - length)];
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        return cArr2;
    }

    public static char[] pad4(String str) {
        return pad4(str.toCharArray());
    }
}
