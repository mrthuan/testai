package wj;

/* compiled from: ZipStandardCipherInputStream.java */
/* loaded from: classes3.dex */
public final class l extends b<uj.c> {
    @Override // wj.b
    public final uj.c b(xj.g gVar, char[] cArr, boolean z10) {
        long j10 = gVar.f31821e;
        long j11 = gVar.f31820d;
        byte[] bArr = new byte[12];
        c(bArr);
        return new uj.c(j10, j11, z10, bArr, cArr);
    }
}
