package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzagm extends zzagd {
    public static final Parcelable.Creator<zzagm> CREATOR = new zzagl();
    public final String zza;
    public final zzfxr zzb;

    public zzagm(String str, String str2, List list) {
        super(str);
        zzdi.zzd(!list.isEmpty());
        this.zza = str2;
        zzfxr zzk = zzfxr.zzk(list);
        this.zzb = zzk;
        String str3 = (String) zzk.get(0);
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagm.class == obj.getClass()) {
            zzagm zzagmVar = (zzagm) obj;
            if (zzet.zzG(this.zzf, zzagmVar.zzf) && zzet.zzG(this.zza, zzagmVar.zza) && this.zzb.equals(zzagmVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return this.zzb.hashCode() + (((hashCode * 31) + i10) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.zzf);
        sb2.append(": description=");
        return androidx.activity.f.o(sb2, this.zza, ": values=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((String[]) this.zzb.toArray(new String[0]));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzagd, com.google.android.gms.internal.ads.zzbj
    public final void zza(zzbf zzbfVar) {
        char c;
        Integer num;
        String str = this.zzf;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                zzbfVar.zzq((CharSequence) this.zzb.get(0));
                return;
            case 2:
            case 3:
                zzbfVar.zze((CharSequence) this.zzb.get(0));
                return;
            case 4:
            case 5:
                zzbfVar.zzc((CharSequence) this.zzb.get(0));
                return;
            case 6:
            case 7:
                zzbfVar.zzd((CharSequence) this.zzb.get(0));
                return;
            case '\b':
            case '\t':
                int i10 = zzet.zza;
                String[] split = ((String) this.zzb.get(0)).split(PackagingURIHelper.FORWARD_SLASH_STRING, -1);
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    zzbfVar.zzs(Integer.valueOf(parseInt));
                    zzbfVar.zzr(num);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    zzbfVar.zzl(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    String str2 = (String) this.zzb.get(0);
                    int parseInt2 = Integer.parseInt(str2.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str2.substring(0, 2));
                    zzbfVar.zzk(Integer.valueOf(parseInt2));
                    zzbfVar.zzj(Integer.valueOf(parseInt3));
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List zzb = zzb((String) this.zzb.get(0));
                int size = zzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            zzbfVar.zzj((Integer) zzb.get(2));
                        } else {
                            return;
                        }
                    }
                    zzbfVar.zzk((Integer) zzb.get(1));
                }
                zzbfVar.zzl((Integer) zzb.get(0));
                return;
            case 15:
                List zzb2 = zzb((String) this.zzb.get(0));
                int size2 = zzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            zzbfVar.zzm((Integer) zzb2.get(2));
                        } else {
                            return;
                        }
                    }
                    zzbfVar.zzn((Integer) zzb2.get(1));
                }
                zzbfVar.zzo((Integer) zzb2.get(0));
                return;
            case 16:
            case 17:
                zzbfVar.zzf((CharSequence) this.zzb.get(0));
                return;
            case 18:
            case 19:
                zzbfVar.zzg((CharSequence) this.zzb.get(0));
                return;
            case 20:
            case 21:
                zzbfVar.zzt((CharSequence) this.zzb.get(0));
                return;
            case 22:
                Integer zzf = zzgap.zzf((String) this.zzb.get(0), 10);
                if (zzf == null) {
                    zzbfVar.zzi((CharSequence) this.zzb.get(0));
                    return;
                }
                String zza = zzage.zza(zzf.intValue());
                if (zza != null) {
                    zzbfVar.zzi(zza);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
