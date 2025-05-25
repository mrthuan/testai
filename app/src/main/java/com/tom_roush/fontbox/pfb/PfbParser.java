package com.tom_roush.fontbox.pfb;

import a0.d;
import b.a;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class PfbParser {
    private static final int ASCII_MARKER = 1;
    private static final int BINARY_MARKER = 2;
    private static final int BUFFER_SIZE = 65535;
    private static final int PFB_HEADER_LENGTH = 18;
    private static final int[] PFB_RECORDS = {1, 2, 1};
    private static final int START_MARKER = 128;
    private int[] lengths;
    private byte[] pfbdata;

    public PfbParser(String str) {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(str), 65535);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            parsePfb(readFully(bufferedInputStream));
            bufferedInputStream.close();
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            throw th;
        }
    }

    private void parsePfb(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        this.pfbdata = new byte[bArr.length - 18];
        this.lengths = new int[PFB_RECORDS.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = PFB_RECORDS;
            if (i10 < iArr.length) {
                if (byteArrayInputStream.read() == 128) {
                    if (byteArrayInputStream.read() == iArr[i10]) {
                        int read = byteArrayInputStream.read() + (byteArrayInputStream.read() << 8) + (byteArrayInputStream.read() << 16) + (byteArrayInputStream.read() << 24);
                        if (read >= 0) {
                            this.lengths[i10] = read;
                            byte[] bArr2 = this.pfbdata;
                            if (i11 < bArr2.length) {
                                if (read <= bArr2.length - i11) {
                                    int read2 = byteArrayInputStream.read(bArr2, i11, read);
                                    if (read2 >= 0) {
                                        i11 += read2;
                                        i10++;
                                    } else {
                                        throw new EOFException();
                                    }
                                } else {
                                    StringBuilder f10 = d.f("PFB record size (", read, ") doesn't fit in buffer, position: ", i11, ", total length: ");
                                    f10.append(this.pfbdata.length);
                                    throw new IOException(f10.toString());
                                }
                            } else {
                                throw new EOFException("attempted to read past EOF");
                            }
                        } else {
                            throw new IOException(a.c("PFB record size is negative: ", read));
                        }
                    } else {
                        throw new IOException("Incorrect record type");
                    }
                } else {
                    throw new IOException("Start marker missing");
                }
            } else {
                return;
            }
        }
    }

    private byte[] readFully(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[65535];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.pfbdata);
    }

    public int[] getLengths() {
        return this.lengths;
    }

    public byte[] getPfbdata() {
        return this.pfbdata;
    }

    public byte[] getSegment1() {
        return Arrays.copyOfRange(this.pfbdata, 0, this.lengths[0]);
    }

    public byte[] getSegment2() {
        byte[] bArr = this.pfbdata;
        int[] iArr = this.lengths;
        int i10 = iArr[0];
        return Arrays.copyOfRange(bArr, i10, iArr[1] + i10);
    }

    public int size() {
        return this.pfbdata.length;
    }

    public PfbParser(InputStream inputStream) {
        parsePfb(readFully(inputStream));
    }

    public PfbParser(byte[] bArr) {
        parsePfb(bArr);
    }
}
