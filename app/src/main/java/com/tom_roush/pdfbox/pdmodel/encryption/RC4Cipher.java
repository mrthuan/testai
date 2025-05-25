package com.tom_roush.pdfbox.pdmodel.encryption;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
class RC4Cipher {

    /* renamed from: b  reason: collision with root package name */
    private int f15991b;
    private int c;
    private final int[] salt = new int[256];

    private static int fixByte(byte b10) {
        if (b10 < 0) {
            return b10 + 256;
        }
        return b10;
    }

    private static void swap(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }

    public void setKey(byte[] bArr) {
        this.f15991b = 0;
        this.c = 0;
        if (bArr.length >= 1 && bArr.length <= 32) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.salt;
                if (i10 >= iArr.length) {
                    break;
                }
                iArr[i10] = i10;
                i10++;
            }
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < this.salt.length; i13++) {
                int fixByte = fixByte(bArr[i11]);
                int[] iArr2 = this.salt;
                i12 = ((fixByte + iArr2[i13]) + i12) % 256;
                swap(iArr2, i13, i12);
                i11 = (i11 + 1) % bArr.length;
            }
            return;
        }
        throw new IllegalArgumentException("number of bytes must be between 1 and 32");
    }

    public void write(byte b10, OutputStream outputStream) {
        int i10 = (this.f15991b + 1) % 256;
        this.f15991b = i10;
        int[] iArr = this.salt;
        int i11 = (iArr[i10] + this.c) % 256;
        this.c = i11;
        swap(iArr, i10, i11);
        int[] iArr2 = this.salt;
        outputStream.write(b10 ^ ((byte) iArr2[(iArr2[this.f15991b] + iArr2[this.c]) % 256]));
    }

    public void write(byte[] bArr, OutputStream outputStream) {
        for (byte b10 : bArr) {
            write(b10, outputStream);
        }
    }

    public void write(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            write(bArr, 0, read, outputStream);
        }
    }

    public void write(byte[] bArr, int i10, int i11, OutputStream outputStream) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            write(bArr[i12], outputStream);
        }
    }
}
