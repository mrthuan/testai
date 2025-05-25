package com.pgl.ssdk;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.ZipFile;

/* renamed from: com.pgl.ssdk.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class ApkUtils {

    /* compiled from: ApkUtils.java */
    /* renamed from: com.pgl.ssdk.c$a */
    /* loaded from: classes2.dex */
    public static class a extends ZipSections {
        public a(long j10, long j11, int i10, long j12, ByteBuffer byteBuffer) {
            super(j10, j11, i10, j12, byteBuffer);
        }
    }

    public static void a(Runnable runnable) {
        Q c = M.a().c();
        if (c != null) {
            c.post(runnable);
        }
    }

    public static a a(DataSource dataSource) {
        Pair<ByteBuffer, Long> a10 = ZipUtils.a(dataSource);
        if (a10 != null) {
            ByteBuffer a11 = a10.a();
            long longValue = a10.b().longValue();
            a11.order(ByteOrder.LITTLE_ENDIAN);
            long b10 = ZipUtils.b(a11);
            if (b10 <= longValue) {
                long c = ZipUtils.c(a11);
                long j10 = b10 + c;
                if (j10 <= longValue) {
                    ZipSections zipSections = new ZipSections(b10, c, ZipUtils.d(a11), longValue, a11);
                    return new a(zipSections.a(), zipSections.c(), zipSections.b(), zipSections.e(), zipSections.d());
                }
                StringBuilder h10 = androidx.activity.r.h("ZIP Central Directory overlaps with End of Central Directory. CD end: ", j10, ", EoCD start: ");
                h10.append(longValue);
                throw new ZipFormatException(h10.toString());
            }
            StringBuilder h11 = androidx.activity.r.h("ZIP Central Directory start offset out of range: ", b10, ". ZIP End of Central Directory offset: ");
            h11.append(longValue);
            throw new ZipFormatException(h11.toString());
        }
        throw new ZipFormatException("ZIP End of Central Directory record not found");
    }

    public static ApkUtilsLite a(DataSource dataSource, ZipSections zipSections) {
        long a10 = zipSections.a();
        long c = zipSections.c() + a10;
        long e10 = zipSections.e();
        if (c != e10) {
            StringBuilder h10 = androidx.activity.r.h("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: ", c, ", EoCD start: ");
            h10.append(e10);
            throw new ApkSigningBlockNotFoundException(h10.toString());
        } else if (a10 >= 32) {
            FileChannelDataSource fileChannelDataSource = (FileChannelDataSource) dataSource;
            ByteBuffer a11 = fileChannelDataSource.a(a10 - 24, 24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            a11.order(byteOrder);
            if (a11.getLong(8) == 2334950737559900225L && a11.getLong(16) == 3617552046287187010L) {
                long j10 = a11.getLong(0);
                if (j10 < a11.capacity() || j10 > 2147483639) {
                    throw new ApkSigningBlockNotFoundException("APK Signing Block size out of range: ".concat(String.valueOf(j10)));
                }
                long j11 = (int) (8 + j10);
                long j12 = a10 - j11;
                if (j12 >= 0) {
                    ByteBuffer a12 = fileChannelDataSource.a(j12, 8);
                    a12.order(byteOrder);
                    long j13 = a12.getLong(0);
                    if (j13 == j10) {
                        return new ApkUtilsLite(j12, fileChannelDataSource.a(j12, j11));
                    }
                    StringBuilder h11 = androidx.activity.r.h("APK Signing Block sizes in header and footer do not match: ", j13, " vs ");
                    h11.append(j10);
                    throw new ApkSigningBlockNotFoundException(h11.toString());
                }
                throw new ApkSigningBlockNotFoundException("APK Signing Block offset out of range: ".concat(String.valueOf(j12)));
            }
            throw new ApkSigningBlockNotFoundException("No APK Signing Block before ZIP Central Directory");
        } else {
            throw new ApkSigningBlockNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(a10)));
        }
    }

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static void a(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
    }
}
