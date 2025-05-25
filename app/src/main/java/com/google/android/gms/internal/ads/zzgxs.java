package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxs;
import com.google.android.gms.internal.ads.zzgxy;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public class zzgxs<MessageType extends zzgxy<MessageType, BuilderType>, BuilderType extends zzgxs<MessageType, BuilderType>> extends zzgvu<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    public zzgxs(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzcf()) {
            this.zza = zza();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbj();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzgzt.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgvu
    public /* bridge */ /* synthetic */ zzgvu zzaD(zzgvv zzgvvVar) {
        zzbi((zzgxy) zzgvvVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public /* bridge */ /* synthetic */ zzgvu zzaK(zzgww zzgwwVar, zzgxi zzgxiVar) {
        zzbk(zzgwwVar, zzgxiVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public /* bridge */ /* synthetic */ zzgvu zzaN(byte[] bArr, int i10, int i11) {
        zzbl(bArr, i10, i11);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public /* bridge */ /* synthetic */ zzgvu zzaO(byte[] bArr, int i10, int i11, zzgxi zzgxiVar) {
        zzbm(bArr, i10, i11, zzgxiVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public /* bridge */ /* synthetic */ zzgzi zzaW(zzgww zzgwwVar, zzgxi zzgxiVar) {
        zzbk(zzgwwVar, zzgxiVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public /* bridge */ /* synthetic */ zzgzi zzaZ(byte[] bArr, int i10, int i11) {
        zzbl(bArr, i10, i11);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public /* bridge */ /* synthetic */ zzgzi zzba(byte[] bArr, int i10, int i11, zzgxi zzgxiVar) {
        zzbm(bArr, i10, i11, zzgxiVar);
        return this;
    }

    public final BuilderType zzbg() {
        if (!this.zzb.zzcf()) {
            this.zza = zza();
            return this;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    /* renamed from: zzbh */
    public BuilderType zzaP() {
        BuilderType buildertype = (BuilderType) zzbt().zzcZ();
        buildertype.zza = zzbs();
        return buildertype;
    }

    public BuilderType zzbi(MessageType messagetype) {
        zzbj(messagetype);
        return this;
    }

    public BuilderType zzbj(MessageType messagetype) {
        if (zzbt().equals(messagetype)) {
            return this;
        }
        zzbu();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbk(zzgww zzgwwVar, zzgxi zzgxiVar) {
        zzbu();
        try {
            zzgzt.zza().zzb(this.zza.getClass()).zzh(this.zza, zzgwx.zzq(zzgwwVar), zzgxiVar);
            return this;
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof IOException) {
                throw ((IOException) e10.getCause());
            }
            throw e10;
        }
    }

    public BuilderType zzbl(byte[] bArr, int i10, int i11) {
        int i12 = zzgxi.zzb;
        int i13 = zzgzt.zza;
        zzbm(bArr, i10, i11, zzgxi.zza);
        return this;
    }

    public BuilderType zzbm(byte[] bArr, int i10, int i11, zzgxi zzgxiVar) {
        zzbu();
        try {
            zzgzt.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, i10, i10 + i11, new zzgwa(zzgxiVar));
            return this;
        } catch (zzgyn e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgyn.zzi();
        }
    }

    /* renamed from: zzbn */
    public final MessageType zzbr() {
        MessageType zzbs = zzbs();
        if (zzbs.zzbw()) {
            return zzbs;
        }
        throw zzgvu.zzbb(zzbs);
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    /* renamed from: zzbo */
    public MessageType zzbs() {
        if (!this.zza.zzcf()) {
            return this.zza;
        }
        this.zza.zzbW();
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    /* renamed from: zzbp */
    public MessageType zzbt() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzgzi zzbq() {
        zzbg();
        return this;
    }

    public final void zzbu() {
        if (!this.zza.zzcf()) {
            zzbv();
        }
    }

    public void zzbv() {
        MessageType zza = zza();
        zzb(zza, this.zza);
        this.zza = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final boolean zzbw() {
        return zzgxy.zzce(this.zza, false);
    }
}
