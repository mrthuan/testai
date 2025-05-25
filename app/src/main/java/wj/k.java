package wj;

import c7.w;
import com.google.android.play.core.assetpacks.j1;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.model.enums.AesVersion;
import net.lingala.zip4j.model.enums.EncryptionMethod;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: ZipInputStream.java */
/* loaded from: classes3.dex */
public final class k extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final PushbackInputStream f31288a;

    /* renamed from: b  reason: collision with root package name */
    public c f31289b;

    /* renamed from: d  reason: collision with root package name */
    public char[] f31290d;

    /* renamed from: e  reason: collision with root package name */
    public xj.g f31291e;

    /* renamed from: h  reason: collision with root package name */
    public final u8.b f31294h;
    public final w c = new w();

    /* renamed from: f  reason: collision with root package name */
    public final CRC32 f31292f = new CRC32();

    /* renamed from: g  reason: collision with root package name */
    public boolean f31293g = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f31295i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f31296j = false;

    public k(h hVar, char[] cArr, u8.b bVar) {
        if (bVar.f30261a >= 512) {
            this.f31288a = new PushbackInputStream(hVar, bVar.f30261a);
            this.f31290d = cArr;
            this.f31294h = bVar;
            return;
        }
        throw new IllegalArgumentException("Buffer size cannot be less than 512 bytes");
    }

    public final void a() {
        boolean z10;
        long g10;
        long g11;
        c cVar = this.f31289b;
        PushbackInputStream pushbackInputStream = this.f31288a;
        this.f31289b.a(pushbackInputStream, cVar.b(pushbackInputStream));
        xj.g gVar = this.f31291e;
        boolean z11 = false;
        if (gVar.f31828l && !this.f31293g) {
            List<xj.e> list = gVar.f31832p;
            if (list != null) {
                Iterator<xj.e> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().f31837b == HeaderSignature.ZIP64_EXTRA_FIELD_SIGNATURE.getValue()) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            w wVar = this.c;
            wVar.getClass();
            byte[] bArr = new byte[4];
            t0.l0(pushbackInputStream, bArr);
            j1 j1Var = (j1) wVar.f5665b;
            long i10 = j1Var.i(0, bArr);
            if (i10 == HeaderSignature.EXTRA_DATA_RECORD.getValue()) {
                t0.l0(pushbackInputStream, bArr);
                i10 = j1Var.i(0, bArr);
            }
            if (z10) {
                Object obj = j1Var.c;
                byte[] bArr2 = (byte[]) obj;
                j1.e(pushbackInputStream, bArr2, bArr2.length);
                g10 = j1Var.i(0, bArr2);
                byte[] bArr3 = (byte[]) obj;
                j1.e(pushbackInputStream, bArr3, bArr3.length);
                g11 = j1Var.i(0, bArr3);
            } else {
                g10 = j1Var.g(pushbackInputStream);
                g11 = j1Var.g(pushbackInputStream);
            }
            xj.g gVar2 = this.f31291e;
            gVar2.f31822f = g10;
            gVar2.f31823g = g11;
            gVar2.f31821e = i10;
        }
        xj.g gVar3 = this.f31291e;
        EncryptionMethod encryptionMethod = gVar3.f31827k;
        EncryptionMethod encryptionMethod2 = EncryptionMethod.AES;
        CRC32 crc32 = this.f31292f;
        if ((encryptionMethod != encryptionMethod2 || !gVar3.f31830n.f31817b.equals(AesVersion.TWO)) && this.f31291e.f31821e != crc32.getValue()) {
            ZipException.Type type = ZipException.Type.CHECKSUM_MISMATCH;
            xj.g gVar4 = this.f31291e;
            if (gVar4.f31826j && EncryptionMethod.ZIP_STANDARD.equals(gVar4.f31827k)) {
                z11 = true;
            }
            if (z11) {
                type = ZipException.Type.WRONG_PASSWORD;
            }
            throw new ZipException("Reached end of entry, but crc verification failed for " + this.f31291e.f31825i, type);
        }
        this.f31291e = null;
        crc32.reset();
        this.f31296j = true;
    }

    @Override // java.io.InputStream
    public final int available() {
        if (!this.f31295i) {
            return !this.f31296j ? 1 : 0;
        }
        throw new IOException("Stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f31295i) {
            return;
        }
        c cVar = this.f31289b;
        if (cVar != null) {
            cVar.close();
        }
        this.f31295i = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (this.f31295i) {
            throw new IOException("Stream closed");
        }
        if (i11 >= 0) {
            boolean z10 = false;
            if (i11 == 0) {
                return 0;
            }
            if (this.f31291e == null) {
                return -1;
            }
            try {
                int read = this.f31289b.read(bArr, i10, i11);
                if (read == -1) {
                    a();
                } else {
                    this.f31292f.update(bArr, i10, read);
                }
                return read;
            } catch (IOException e10) {
                xj.g gVar = this.f31291e;
                if (gVar.f31826j && EncryptionMethod.ZIP_STANDARD.equals(gVar.f31827k)) {
                    z10 = true;
                }
                if (z10) {
                    throw new ZipException(e10.getMessage(), e10.getCause(), ZipException.Type.WRONG_PASSWORD);
                }
                throw e10;
            }
        }
        throw new IllegalArgumentException("Negative read length");
    }
}
