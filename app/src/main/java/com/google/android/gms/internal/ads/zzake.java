package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzake implements zzadp {
    private final zzadp zza;
    private final zzajy zzb;
    private zzaka zzg;
    private zzaf zzh;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzet.zzf;
    private final zzek zzc = new zzek();

    public zzake(zzadp zzadpVar, zzajy zzajyVar) {
        this.zza = zzadpVar;
        this.zzb = zzajyVar;
    }

    private final void zzc(int i10) {
        byte[] bArr;
        int length = this.zzf.length;
        int i11 = this.zze;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.zzd;
        int max = Math.max(i12 + i12, i10 + i12);
        byte[] bArr2 = this.zzf;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.zzd, bArr, 0, i12);
        this.zzd = 0;
        this.zze = i12;
        this.zzf = bArr;
    }

    public final /* synthetic */ void zza(long j10, int i10, zzajs zzajsVar) {
        boolean z10;
        zzdi.zzb(this.zzh);
        zzfxr<zzdb> zzfxrVar = zzajsVar.zza;
        long j11 = zzajsVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzfxrVar.size());
        for (zzdb zzdbVar : zzfxrVar) {
            arrayList.add(zzdbVar.zza());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j11);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        zzek zzekVar = this.zzc;
        int length = marshall.length;
        zzekVar.zzI(marshall, length);
        this.zza.zzq(this.zzc, length);
        long j12 = zzajsVar.zzb;
        if (j12 == -9223372036854775807L) {
            if (this.zzh.zzq == Long.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzdi.zzf(z10);
        } else {
            long j13 = this.zzh.zzq;
            if (j13 == Long.MAX_VALUE) {
                j10 += j12;
            } else {
                j10 = j12 + j13;
            }
        }
        this.zza.zzs(j10, i10, length, 0, null);
    }

    public final void zzb() {
        zzaka zzakaVar = this.zzg;
        if (zzakaVar != null) {
            zzakaVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ int zzf(zzp zzpVar, int i10, boolean z10) {
        return zzadn.zza(this, zzpVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final int zzg(zzp zzpVar, int i10, boolean z10, int i11) {
        if (this.zzg == null) {
            return this.zza.zzg(zzpVar, i10, z10, 0);
        }
        zzc(i10);
        int zza = zzpVar.zza(this.zzf, this.zze, i10);
        if (zza == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.zze += zza;
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzl(zzaf zzafVar) {
        boolean z10;
        zzaka zzakaVar;
        String str = zzafVar.zzm;
        str.getClass();
        if (zzbn.zzb(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzd(z10);
        if (!zzafVar.equals(this.zzh)) {
            this.zzh = zzafVar;
            if (this.zzb.zzc(zzafVar)) {
                zzakaVar = this.zzb.zzb(zzafVar);
            } else {
                zzakaVar = null;
            }
            this.zzg = zzakaVar;
        }
        if (this.zzg == null) {
            this.zza.zzl(zzafVar);
            return;
        }
        zzadp zzadpVar = this.zza;
        zzad zzb = zzafVar.zzb();
        zzb.zzX("application/x-media3-cues");
        zzb.zzz(zzafVar.zzm);
        zzb.zzab(Long.MAX_VALUE);
        zzb.zzD(this.zzb.zza(zzafVar));
        zzadpVar.zzl(zzb.zzad());
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ void zzq(zzek zzekVar, int i10) {
        zzadn.zzb(this, zzekVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzr(zzek zzekVar, int i10, int i11) {
        if (this.zzg == null) {
            this.zza.zzr(zzekVar, i10, i11);
            return;
        }
        zzc(i10);
        zzekVar.zzG(this.zzf, this.zze, i10);
        this.zze += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzs(final long j10, final int i10, int i11, int i12, zzado zzadoVar) {
        boolean z10;
        if (this.zzg == null) {
            this.zza.zzs(j10, i10, i11, i12, zzadoVar);
            return;
        }
        if (zzadoVar == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zze(z10, "DRM on subtitles is not supported");
        int i13 = (this.zze - i12) - i11;
        this.zzg.zza(this.zzf, i13, i11, zzajz.zza(), new zzdn() { // from class: com.google.android.gms.internal.ads.zzakd
            @Override // com.google.android.gms.internal.ads.zzdn
            public final void zza(Object obj) {
                zzake.this.zza(j10, i10, (zzajs) obj);
            }
        });
        int i14 = i13 + i11;
        this.zzd = i14;
        if (i14 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }
}
