package yi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DecompressableInputStream.java */
/* loaded from: classes3.dex */
public class b extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f32154a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32155b;
    public int c = 0;

    public b(FileInputStream fileInputStream) {
        this.f32154a = null;
        this.f32155b = 0;
        try {
            int available = fileInputStream.available();
            this.f32155b = available;
            byte[] bArr = new byte[available];
            this.f32154a = bArr;
            fileInputStream.read(bArr);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    @Override // java.io.InputStream
    /* renamed from: a */
    public final int read(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        if (i10 >= 0 && i11 >= 0 && i11 <= bArr.length - i10) {
            if (i11 == 0) {
                return 0;
            }
            e eVar = (e) this;
            int read = eVar.read();
            if (read == -1) {
                return -1;
            }
            bArr[i10] = (byte) read;
            int i12 = 1;
            while (i12 < i11) {
                int read2 = eVar.read();
                if (read2 == -1) {
                    break;
                }
                bArr[i10 + i12] = (byte) read2;
                i12++;
            }
            return i12;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        this.c = (int) (this.c + j10);
        return j10;
    }

    @Override // java.io.InputStream
    public int read() {
        int i10 = this.c;
        if (i10 >= this.f32155b) {
            return -1;
        }
        this.c = i10 + 1;
        return this.f32154a[i10] & 255;
    }
}
