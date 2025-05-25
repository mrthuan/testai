package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import lib.zj.office.fc.hssf.record.UnknownRecord;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhad extends zzgwm {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, UnknownRecord.BITMAP_00E9, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Api.BaseClientBuilder.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzgwm zzd;
    private final zzgwm zze;
    private final int zzf;
    private final int zzg;

    public static zzgwm zzC(zzgwm zzgwmVar, zzgwm zzgwmVar2) {
        if (zzgwmVar2.zzd() == 0) {
            return zzgwmVar;
        }
        if (zzgwmVar.zzd() == 0) {
            return zzgwmVar2;
        }
        int zzd = zzgwmVar2.zzd() + zzgwmVar.zzd();
        if (zzd < 128) {
            return zzD(zzgwmVar, zzgwmVar2);
        }
        if (zzgwmVar instanceof zzhad) {
            zzhad zzhadVar = (zzhad) zzgwmVar;
            if (zzgwmVar2.zzd() + zzhadVar.zze.zzd() < 128) {
                return new zzhad(zzhadVar.zzd, zzD(zzhadVar.zze, zzgwmVar2));
            }
            if (zzhadVar.zzd.zzf() > zzhadVar.zze.zzf() && zzhadVar.zzg > zzgwmVar2.zzf()) {
                return new zzhad(zzhadVar.zzd, new zzhad(zzhadVar.zze, zzgwmVar2));
            }
        }
        if (zzd >= zzc(Math.max(zzgwmVar.zzf(), zzgwmVar2.zzf()) + 1)) {
            return new zzhad(zzgwmVar, zzgwmVar2);
        }
        return zzgzz.zza(new zzgzz(null), zzgwmVar, zzgwmVar2);
    }

    private static zzgwm zzD(zzgwm zzgwmVar, zzgwm zzgwmVar2) {
        int zzd = zzgwmVar.zzd();
        int zzd2 = zzgwmVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgwmVar.zzz(bArr, 0, 0, zzd);
        zzgwmVar2.zzz(bArr, 0, zzd, zzd2);
        return new zzgwk(bArr);
    }

    public static int zzc(int i10) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i10 >= 47) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return iArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final boolean equals(Object obj) {
        boolean zzg;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgwm)) {
            return false;
        }
        zzgwm zzgwmVar = (zzgwm) obj;
        if (this.zzc != zzgwmVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgwmVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzhab zzhabVar = new zzhab(this, null);
        zzgwj next = zzhabVar.next();
        zzhab zzhabVar2 = new zzhab(zzgwmVar, null);
        zzgwj next2 = zzhabVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int zzd = next.zzd() - i10;
            int zzd2 = next2.zzd() - i11;
            int min = Math.min(zzd, zzd2);
            if (i10 == 0) {
                zzg = next.zzg(next2, i11, min);
            } else {
                zzg = next2.zzg(next, i10, min);
            }
            if (!zzg) {
                return false;
            }
            i12 += min;
            int i13 = this.zzc;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzhabVar.next();
                i10 = 0;
            } else {
                i10 += min;
            }
            if (min == zzd2) {
                next2 = zzhabVar2.next();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwm, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzgzx(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final byte zza(int i10) {
        zzgwm.zzy(i10, this.zzc);
        return zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final byte zzb(int i10) {
        int i11 = this.zzf;
        if (i10 < i11) {
            return this.zzd.zzb(i10);
        }
        return this.zze.zzb(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else if (i10 >= i14) {
            this.zze.zze(bArr, i10 - i14, i11, i12);
        } else {
            int i15 = i14 - i10;
            this.zzd.zze(bArr, i10, i11, i15);
            this.zze.zze(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final boolean zzh() {
        if (this.zzc >= zzc(this.zzg)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final int zzi(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzi(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzi(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzi(this.zzd.zzi(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final int zzj(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzj(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzj(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzj(this.zzd.zzj(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final zzgwm zzk(int i10, int i11) {
        int zzq = zzgwm.zzq(i10, i11, this.zzc);
        if (zzq == 0) {
            return zzgwm.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i12 = this.zzf;
        if (i11 <= i12) {
            return this.zzd.zzk(i10, i11);
        }
        if (i10 >= i12) {
            return this.zze.zzk(i10 - i12, i11 - i12);
        }
        zzgwm zzgwmVar = this.zzd;
        return new zzhad(zzgwmVar.zzk(i10, zzgwmVar.zzd()), this.zze.zzk(0, i11 - this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final zzgww zzl() {
        ArrayList arrayList = new ArrayList();
        zzhab zzhabVar = new zzhab(this, null);
        while (zzhabVar.hasNext()) {
            arrayList.add(zzhabVar.next().zzn());
        }
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        int i10 = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            i10 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z10 |= true;
            } else if (byteBuffer.isDirect()) {
                z10 |= true;
            } else {
                z10 |= true;
            }
        }
        if (z10) {
            return new zzgwq(arrayList, i10, true, null);
        }
        return zzgww.zzG(new zzgyo(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final void zzo(zzgwd zzgwdVar) {
        this.zzd.zzo(zzgwdVar);
        this.zze.zzo(zzgwdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final boolean zzp() {
        zzgwm zzgwmVar = this.zzd;
        zzgwm zzgwmVar2 = this.zze;
        if (zzgwmVar2.zzj(zzgwmVar.zzj(0, 0, this.zzf), 0, zzgwmVar2.zzd()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final zzgwh zzs() {
        return new zzgzx(this);
    }

    private zzhad(zzgwm zzgwmVar, zzgwm zzgwmVar2) {
        this.zzd = zzgwmVar;
        this.zze = zzgwmVar2;
        int zzd = zzgwmVar.zzd();
        this.zzf = zzd;
        this.zzc = zzgwmVar2.zzd() + zzd;
        this.zzg = Math.max(zzgwmVar.zzf(), zzgwmVar2.zzf()) + 1;
    }
}
