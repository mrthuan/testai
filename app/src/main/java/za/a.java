package za;

import java.io.OutputStream;

/* compiled from: LengthCountingOutputStream.java */
/* loaded from: classes2.dex */
public final class a extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public long f32325a = 0;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f32325a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f32325a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f32325a += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
