package uj;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import net.lingala.zip4j.exception.ZipException;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: StandardDecrypter.java */
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final vj.b f30400a;

    public c(long j10, long j11, boolean z10, byte[] bArr, char[] cArr) {
        vj.b bVar = new vj.b();
        this.f30400a = bVar;
        if (cArr != null && cArr.length > 0) {
            int[] iArr = bVar.f30830a;
            int i10 = 0;
            iArr[0] = 305419896;
            iArr[1] = 591751049;
            iArr[2] = 878082192;
            for (byte b10 : t0.y(cArr, z10)) {
                bVar.a((byte) (b10 & 255));
            }
            byte b11 = bArr[0];
            while (i10 < 12) {
                i10++;
                if (i10 == 12) {
                    int i11 = iArr[2] | 2;
                    byte b12 = (byte) (((byte) ((i11 * (i11 ^ 1)) >>> 8)) ^ b11);
                    if (b12 != ((byte) (j10 >> 24)) && b12 != ((byte) (j11 >> 8))) {
                        throw new ZipException("Wrong password!", ZipException.Type.WRONG_PASSWORD);
                    }
                }
                int i12 = iArr[2] | 2;
                bVar.a((byte) (((byte) ((i12 * (i12 ^ 1)) >>> 8)) ^ b11));
                if (i10 != 12) {
                    b11 = bArr[i10];
                }
            }
            return;
        }
        throw new ZipException("Wrong password!", ZipException.Type.WRONG_PASSWORD);
    }

    @Override // uj.b
    public final int a(int i10, int i11, byte[] bArr) {
        if (i10 >= 0 && i11 >= 0) {
            for (int i12 = i10; i12 < i10 + i11; i12++) {
                vj.b bVar = this.f30400a;
                int i13 = bVar.f30830a[2] | 2;
                byte b10 = (byte) (((bArr[i12] & 255) ^ ((byte) ((i13 * (i13 ^ 1)) >>> 8))) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                bVar.a(b10);
                bArr[i12] = b10;
            }
            return i11;
        }
        throw new ZipException("one of the input parameters were null in standard decrypt data");
    }
}
