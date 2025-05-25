package com.tom_roush.pdfbox.io;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class IOUtils {
    private IOUtils() {
    }

    public static IOException closeAndLogException(Closeable closeable, String str, IOException iOException) {
        try {
            closeable.close();
        } catch (IOException e10) {
            if (iOException == null) {
                return e10;
            }
        }
        return iOException;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                outputStream.write(bArr, 0, read);
                j10 += read;
            } else {
                return j10;
            }
        }
    }

    public static long populateBuffer(InputStream inputStream, byte[] bArr) {
        int length = bArr.length;
        while (length > 0) {
            int read = inputStream.read(bArr, bArr.length - length, length);
            if (read < 0) {
                break;
            }
            length -= read;
        }
        return bArr.length - length;
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
