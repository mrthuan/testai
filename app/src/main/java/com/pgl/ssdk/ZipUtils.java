package com.pgl.ssdk;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import lib.zj.office.fc.hpsf.Variant;

/* renamed from: com.pgl.ssdk.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class ZipUtils {
    public static Pair<ByteBuffer, Long> a(DataSource dataSource) {
        FileChannelDataSource fileChannelDataSource = (FileChannelDataSource) dataSource;
        if (fileChannelDataSource.a() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> a10 = a(fileChannelDataSource, 0);
        return a10 != null ? a10 : a(fileChannelDataSource, Variant.VT_ILLEGAL);
    }

    public static long b(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
    }

    public static long c(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L;
    }

    public static int d(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return byteBuffer.getShort(byteBuffer.position() + 10) & 65535;
    }

    private static Pair<ByteBuffer, Long> a(DataSource dataSource, int i10) {
        int i11;
        if (i10 >= 0 && i10 <= 65535) {
            FileChannelDataSource fileChannelDataSource = (FileChannelDataSource) dataSource;
            long a10 = fileChannelDataSource.a();
            if (a10 < 22) {
                return null;
            }
            int min = ((int) Math.min(i10, a10 - 22)) + 22;
            long j10 = a10 - min;
            ByteBuffer a11 = fileChannelDataSource.a(j10, min);
            a11.order(ByteOrder.LITTLE_ENDIAN);
            a(a11);
            int capacity = a11.capacity();
            if (capacity >= 22) {
                int i12 = capacity - 22;
                int min2 = Math.min(i12, (int) Variant.VT_ILLEGAL);
                for (int i13 = 0; i13 <= min2; i13++) {
                    i11 = i12 - i13;
                    if (a11.getInt(i11) == 101010256 && (a11.getShort(i11 + 20) & 65535) == i13) {
                        break;
                    }
                }
            }
            i11 = -1;
            if (i11 == -1) {
                return null;
            }
            a11.position(i11);
            ByteBuffer slice = a11.slice();
            slice.order(ByteOrder.LITTLE_ENDIAN);
            return new Pair<>(slice, Long.valueOf(j10 + i11));
        }
        throw new IllegalArgumentException("maxCommentSize: ".concat(String.valueOf(i10)));
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
