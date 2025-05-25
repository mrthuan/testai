package lib.zj.office.fc.util;

import a6.h;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class HexRead {
    public static byte[] readData(String str) {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        try {
            return readData(fileInputStream, -1);
        } finally {
            fileInputStream.close();
        }
    }

    public static byte[] readFromString(String str) {
        try {
            return readData(new ByteArrayInputStream(str.getBytes()), -1);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void readToEOL(InputStream inputStream) {
        int read = inputStream.read();
        while (read != -1 && read != 10 && read != 13) {
            read = inputStream.read();
        }
    }

    public static byte[] readData(InputStream inputStream, String str) {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            int read = inputStream.read();
            boolean z10 = false;
            while (read != -1) {
                if (read == 10 || read == 13) {
                    stringBuffer = new StringBuffer();
                } else {
                    if (read == 91) {
                        z10 = true;
                    } else if (read != 93) {
                        if (z10) {
                            stringBuffer.append((char) read);
                        }
                    } else if (stringBuffer.toString().equals(str)) {
                        return readData(inputStream, 91);
                    } else {
                        stringBuffer = new StringBuffer();
                    }
                    read = inputStream.read();
                }
                z10 = false;
                read = inputStream.read();
            }
            inputStream.close();
            throw new IOException(h.d("Section '", str, "' not found"));
        } finally {
            inputStream.close();
        }
    }

    public static byte[] readData(String str, String str2) {
        return readData(new FileInputStream(new File(str)), str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0009, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] readData(java.io.InputStream r8, int r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
            r3 = r2
        L8:
            r4 = r3
        L9:
            if (r2 != 0) goto L59
            int r5 = r8.read()
            if (r5 != r9) goto L12
            goto L59
        L12:
            r6 = -1
            if (r5 == r6) goto L57
            r6 = 35
            if (r5 == r6) goto L53
            r6 = 2
            switch(r5) {
                case 48: goto L3f;
                case 49: goto L3f;
                case 50: goto L3f;
                case 51: goto L3f;
                case 52: goto L3f;
                case 53: goto L3f;
                case 54: goto L3f;
                case 55: goto L3f;
                case 56: goto L3f;
                case 57: goto L3f;
                default: goto L1d;
            }
        L1d:
            switch(r5) {
                case 65: goto L27;
                case 66: goto L27;
                case 67: goto L27;
                case 68: goto L27;
                case 69: goto L27;
                case 70: goto L27;
                default: goto L20;
            }
        L20:
            switch(r5) {
                case 97: goto L24;
                case 98: goto L24;
                case 99: goto L24;
                case 100: goto L24;
                case 101: goto L24;
                case 102: goto L24;
                default: goto L23;
            }
        L23:
            goto L9
        L24:
            r7 = 97
            goto L29
        L27:
            r7 = 65
        L29:
            int r3 = r3 << 4
            byte r3 = (byte) r3
            int r5 = r5 + 10
            int r5 = r5 - r7
            byte r5 = (byte) r5
            int r3 = r3 + r5
            byte r3 = (byte) r3
            int r4 = r4 + 1
            if (r4 != r6) goto L9
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r0.add(r3)
        L3d:
            r3 = r1
            goto L8
        L3f:
            int r3 = r3 << 4
            byte r3 = (byte) r3
            int r5 = r5 + (-48)
            byte r5 = (byte) r5
            int r3 = r3 + r5
            byte r3 = (byte) r3
            int r4 = r4 + 1
            if (r4 != r6) goto L9
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r0.add(r3)
            goto L3d
        L53:
            readToEOL(r8)
            goto L9
        L57:
            r2 = 1
            goto L9
        L59:
            java.lang.Byte[] r8 = new java.lang.Byte[r1]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.Byte[] r8 = (java.lang.Byte[]) r8
            int r9 = r8.length
            byte[] r9 = new byte[r9]
        L64:
            int r0 = r8.length
            if (r1 >= r0) goto L72
            r0 = r8[r1]
            byte r0 = r0.byteValue()
            r9[r1] = r0
            int r1 = r1 + 1
            goto L64
        L72:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.util.HexRead.readData(java.io.InputStream, int):byte[]");
    }
}
