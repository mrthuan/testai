package com.pgl.ssdk;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.pgl.ssdk.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class ApkSigningBlockUtilsLite {
    static {
        "0123456789abcdef".toCharArray();
    }

    public static SignatureInfo a(DataSource dataSource, ZipSections zipSections, int i10) {
        try {
            ApkUtilsLite a10 = ApkUtils.a(dataSource, zipSections);
            long b10 = a10.b();
            FileChannelDataSource fileChannelDataSource = (FileChannelDataSource) a10.a();
            ByteBuffer a11 = fileChannelDataSource.a(0L, (int) fileChannelDataSource.a());
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            a11.order(byteOrder);
            if (a11.order() == byteOrder) {
                int capacity = a11.capacity() - 24;
                if (capacity >= 8) {
                    int capacity2 = a11.capacity();
                    if (capacity <= a11.capacity()) {
                        int limit = a11.limit();
                        int position = a11.position();
                        int i11 = 0;
                        try {
                            a11.position(0);
                            a11.limit(capacity);
                            a11.position(8);
                            ByteBuffer slice = a11.slice();
                            slice.order(a11.order());
                            while (slice.hasRemaining()) {
                                i11++;
                                if (slice.remaining() >= 8) {
                                    long j10 = slice.getLong();
                                    if (j10 >= 4 && j10 <= 2147483647L) {
                                        int i12 = (int) j10;
                                        int position2 = slice.position() + i12;
                                        if (i12 <= slice.remaining()) {
                                            if (slice.getInt() == i10) {
                                                return new SignatureInfo(a(slice, i12 - 4), b10, zipSections.a(), zipSections.e(), zipSections.d());
                                            }
                                            slice.position(position2);
                                        } else {
                                            StringBuilder f10 = a0.d.f("APK Signing Block entry #", i11, " size out of range: ", i12, ", available: ");
                                            f10.append(slice.remaining());
                                            throw new SignatureNotFoundException(f10.toString());
                                        }
                                    } else {
                                        throw new SignatureNotFoundException("APK Signing Block entry #" + i11 + " size out of range: " + j10);
                                    }
                                } else {
                                    throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i11)));
                                }
                            }
                            throw new SignatureNotFoundException("No APK Signature Scheme block in APK Signing Block with ID: ".concat(String.valueOf(i10)));
                        } finally {
                            a11.position(0);
                            a11.limit(limit);
                            a11.position(position);
                        }
                    }
                    throw new IllegalArgumentException(a0.d.b("end > capacity: ", capacity, " > ", capacity2));
                }
                throw new IllegalArgumentException(a0.a.g("end < start: ", capacity, " < 8"));
            }
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        } catch (ApkSigningBlockNotFoundException e10) {
            throw new SignatureNotFoundException(e10.getMessage(), e10);
        }
    }

    public static byte[] b(ByteBuffer byteBuffer) {
        int i10 = byteBuffer.getInt();
        if (i10 >= 0) {
            if (i10 <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i10];
                byteBuffer.get(bArr);
                return bArr;
            }
            StringBuilder e10 = androidx.appcompat.view.menu.d.e("Underflow while reading length-prefixed value. Length: ", i10, ", available: ");
            e10.append(byteBuffer.remaining());
            throw new ApkFormatException(e10.toString());
        }
        throw new ApkFormatException("Negative length");
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i10) {
        if (i10 >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i11 = i10 + position;
            if (i11 >= position && i11 <= limit) {
                byteBuffer.limit(i11);
                try {
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(i11);
                    return slice;
                } finally {
                    byteBuffer.limit(limit);
                }
            }
            throw new BufferUnderflowException();
        }
        throw new IllegalArgumentException("size: ".concat(String.valueOf(i10)));
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i10 = byteBuffer.getInt();
            if (i10 >= 0) {
                if (i10 <= byteBuffer.remaining()) {
                    return a(byteBuffer, i10);
                }
                StringBuilder e10 = androidx.appcompat.view.menu.d.e("Length-prefixed field longer than remaining buffer. Field length: ", i10, ", remaining: ");
                e10.append(byteBuffer.remaining());
                throw new ApkFormatException(e10.toString());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new ApkFormatException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }
}
