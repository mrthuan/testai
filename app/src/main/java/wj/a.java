package wj;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.Arrays;
import javax.crypto.Mac;
import kotlinx.coroutines.flow.x;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.enums.AesKeyStrength;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: AesCipherInputStream.java */
/* loaded from: classes3.dex */
public final class a extends b<uj.a> {

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f31263e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f31264f;

    /* renamed from: g  reason: collision with root package name */
    public int f31265g;

    /* renamed from: h  reason: collision with root package name */
    public int f31266h;

    /* renamed from: i  reason: collision with root package name */
    public int f31267i;

    /* renamed from: j  reason: collision with root package name */
    public int f31268j;

    /* renamed from: k  reason: collision with root package name */
    public int f31269k;

    /* renamed from: l  reason: collision with root package name */
    public int f31270l;

    public a(j jVar, xj.g gVar, char[] cArr, int i10, boolean z10) {
        super(jVar, gVar, cArr, i10, z10);
        this.f31263e = new byte[1];
        this.f31264f = new byte[16];
        this.f31265g = 0;
        this.f31266h = 0;
        this.f31267i = 0;
        this.f31268j = 0;
        this.f31269k = 0;
        this.f31270l = 0;
    }

    @Override // wj.b
    public final void a(PushbackInputStream pushbackInputStream, int i10) {
        byte[] bArr = new byte[10];
        if (t0.l0(pushbackInputStream, bArr) == 10) {
            x xVar = ((uj.a) this.f31272b).f30397b;
            if (((ByteArrayOutputStream) xVar.f20152d).size() > 0) {
                xVar.a(i10);
            }
            byte[] bArr2 = new byte[10];
            System.arraycopy(((Mac) xVar.f20151b).doFinal(), 0, bArr2, 0, 10);
            if (Arrays.equals(bArr, bArr2)) {
                return;
            }
            throw new IOException("Reached end of data for this entry, but aes verification failed");
        }
        throw new ZipException("Invalid AES Mac bytes. Could not read sufficient data");
    }

    @Override // wj.b
    public final uj.a b(xj.g gVar, char[] cArr, boolean z10) {
        xj.a aVar = gVar.f31830n;
        if (aVar != null) {
            AesKeyStrength aesKeyStrength = aVar.c;
            if (aesKeyStrength != null) {
                byte[] bArr = new byte[aesKeyStrength.getSaltLength()];
                c(bArr);
                byte[] bArr2 = new byte[2];
                c(bArr2);
                return new uj.a(aVar, z10, bArr, bArr2, cArr);
            }
            throw new IOException("Invalid aes key strength in aes extra data record");
        }
        throw new IOException("invalid aes extra data record");
    }

    public final void d(int i10, byte[] bArr) {
        int i11 = this.f31267i;
        int i12 = this.f31266h;
        if (i11 >= i12) {
            i11 = i12;
        }
        this.f31270l = i11;
        System.arraycopy(this.f31264f, this.f31265g, bArr, i10, i11);
        int i13 = this.f31270l;
        int i14 = this.f31265g + i13;
        this.f31265g = i14;
        if (i14 >= 15) {
            this.f31265g = 15;
        }
        int i15 = this.f31266h - i13;
        this.f31266h = i15;
        if (i15 <= 0) {
            this.f31266h = 0;
        }
        this.f31269k += i13;
        this.f31267i -= i13;
        this.f31268j += i13;
    }

    @Override // wj.b, java.io.InputStream
    public final int read() {
        byte[] bArr = this.f31263e;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // wj.b, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // wj.b, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        this.f31267i = i11;
        this.f31268j = i10;
        this.f31269k = 0;
        if (this.f31266h != 0) {
            d(i10, bArr);
            int i12 = this.f31269k;
            if (i12 == i11) {
                return i12;
            }
        }
        if (this.f31267i < 16) {
            byte[] bArr2 = this.f31264f;
            int read = super.read(bArr2, 0, bArr2.length);
            this.f31265g = 0;
            if (read == -1) {
                this.f31266h = 0;
                int i13 = this.f31269k;
                if (i13 > 0) {
                    return i13;
                }
                return -1;
            }
            this.f31266h = read;
            d(this.f31268j, bArr);
            int i14 = this.f31269k;
            if (i14 == i11) {
                return i14;
            }
        }
        int i15 = this.f31268j;
        int i16 = this.f31267i;
        int read2 = super.read(bArr, i15, i16 - (i16 % 16));
        if (read2 == -1) {
            int i17 = this.f31269k;
            if (i17 > 0) {
                return i17;
            }
            return -1;
        }
        return read2 + this.f31269k;
    }
}
