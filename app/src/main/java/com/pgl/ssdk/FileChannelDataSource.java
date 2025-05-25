package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: com.pgl.ssdk.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class FileChannelDataSource implements DataSource {

    /* renamed from: a  reason: collision with root package name */
    private final FileChannel f15829a;

    /* renamed from: b  reason: collision with root package name */
    private final long f15830b;
    private final long c;

    public FileChannelDataSource(FileChannel fileChannel, long j10, long j11) {
        if (j10 >= 0) {
            if (j11 >= 0) {
                this.f15829a = fileChannel;
                this.f15830b = j10;
                this.c = j11;
                return;
            }
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j11)));
        }
        throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j11)));
    }

    public long a() {
        long j10 = this.c;
        if (j10 == -1) {
            try {
                return this.f15829a.size();
            } catch (IOException unused) {
                return 0L;
            }
        }
        return j10;
    }

    public DataSource a(long j10, long j11) {
        long a10 = a();
        a(j10, j11, a10);
        return (j10 == 0 && j11 == a10) ? this : new FileChannelDataSource(this.f15829a, this.f15830b + j10, j11);
    }

    public ByteBuffer a(long j10, int i10) {
        int read;
        if (i10 >= 0) {
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            a(j10, i10, a());
            if (i10 != 0) {
                if (i10 <= allocate.remaining()) {
                    long j11 = this.f15830b + j10;
                    int limit = allocate.limit();
                    try {
                        allocate.limit(allocate.position() + i10);
                        while (i10 > 0) {
                            synchronized (this.f15829a) {
                                this.f15829a.position(j11);
                                read = this.f15829a.read(allocate);
                            }
                            j11 += read;
                            i10 -= read;
                        }
                    } finally {
                        allocate.limit(limit);
                    }
                } else {
                    throw new BufferOverflowException();
                }
            }
            allocate.flip();
            return allocate;
        }
        throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(i10)));
    }

    private static void a(long j10, long j11, long j12) {
        if (j10 < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j10)));
        }
        if (j11 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j11)));
        }
        if (j10 > j12) {
            throw new IndexOutOfBoundsException(android.support.v4.media.session.h.e(androidx.activity.r.h("offset (", j10, ") > source size ("), j12, ")"));
        }
        long j13 = j10 + j11;
        if (j13 < j10) {
            throw new IndexOutOfBoundsException(android.support.v4.media.session.h.e(androidx.activity.r.h("offset (", j10, ") + size ("), j11, ") overflow"));
        }
        if (j13 <= j12) {
            return;
        }
        StringBuilder h10 = androidx.activity.r.h("offset (", j10, ") + size (");
        h10.append(j11);
        h10.append(") > source size (");
        h10.append(j12);
        h10.append(")");
        throw new IndexOutOfBoundsException(h10.toString());
    }
}
