package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgvu;
import com.google.android.gms.internal.ads.zzgvv;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgvv<MessageType extends zzgvv<MessageType, BuilderType>, BuilderType extends zzgvu<MessageType, BuilderType>> implements zzgzj {
    protected int zzq = 0;

    public static <T> void zzaQ(Iterable<T> iterable, List<? super T> list) {
        zzgvu.zzbd(iterable, list);
    }

    public static void zzaR(zzgwm zzgwmVar) {
        if (zzgwmVar.zzp()) {
            return;
        }
        throw new IllegalArgumentException("Byte string is not UTF-8.");
    }

    private String zzdI(String str) {
        return a0.d.d("Serializing ", getClass().getName(), " to a ", str, " threw an IOException (should never happen).");
    }

    public int zzaL() {
        throw new UnsupportedOperationException();
    }

    public int zzaM(zzhae zzhaeVar) {
        return zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    public zzgwm zzaN() {
        try {
            int zzaY = zzaY();
            zzgwm zzgwmVar = zzgwm.zzb;
            byte[] bArr = new byte[zzaY];
            zzgxd zzF = zzgxd.zzF(bArr, 0, zzaY);
            zzda(zzF);
            zzF.zzG();
            return new zzgwk(bArr);
        } catch (IOException e10) {
            throw new RuntimeException(zzdI("ByteString"), e10);
        }
    }

    public zzgzo zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public zzhar zzaP() {
        return new zzhar(this);
    }

    public void zzaS(int i10) {
        throw new UnsupportedOperationException();
    }

    public void zzaT(OutputStream outputStream) {
        int zzaY = zzaY();
        zzgxb zzgxbVar = new zzgxb(outputStream, zzgxd.zzB(zzgxd.zzD(zzaY) + zzaY));
        zzgxbVar.zzu(zzaY);
        zzda(zzgxbVar);
        zzgxbVar.zzL();
    }

    public void zzaU(OutputStream outputStream) {
        zzgxb zzgxbVar = new zzgxb(outputStream, zzgxd.zzB(zzaY()));
        zzda(zzgxbVar);
        zzgxbVar.zzL();
    }

    public byte[] zzaV() {
        try {
            int zzaY = zzaY();
            byte[] bArr = new byte[zzaY];
            zzgxd zzF = zzgxd.zzF(bArr, 0, zzaY);
            zzda(zzF);
            zzF.zzG();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(zzdI("byte array"), e10);
        }
    }
}
