package p4;

import java.io.FilterInputStream;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: MarkEnforcingInputStream.java */
/* loaded from: classes.dex */
public final class h extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public int f23700a;

    public h(d dVar) {
        super(dVar);
        this.f23700a = SlideAtom.USES_MASTER_SLIDE_ID;
    }

    public final long a(long j10) {
        int i10 = this.f23700a;
        if (i10 == 0) {
            return -1L;
        }
        if (i10 != Integer.MIN_VALUE && j10 > i10) {
            return i10;
        }
        return j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i10 = this.f23700a;
        if (i10 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i10, super.available());
    }

    public final void b(long j10) {
        int i10 = this.f23700a;
        if (i10 != Integer.MIN_VALUE && j10 != -1) {
            this.f23700a = (int) (i10 - j10);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        super.mark(i10);
        this.f23700a = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        b(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f23700a = SlideAtom.USES_MASTER_SLIDE_ID;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long a10 = a(j10);
        if (a10 == -1) {
            return 0L;
        }
        long skip = super.skip(a10);
        b(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int a10 = (int) a(i11);
        if (a10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, a10);
        b(read);
        return read;
    }
}
