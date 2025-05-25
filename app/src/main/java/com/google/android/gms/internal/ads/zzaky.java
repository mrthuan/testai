package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaky {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzale zzf;
    public final String zzg;
    public final String zzh;
    public final zzaky zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzaky(String str, String str2, long j10, long j11, zzale zzaleVar, String[] strArr, String str3, String str4, zzaky zzakyVar) {
        boolean z10;
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzaleVar;
        this.zzj = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzc = z10;
        this.zzd = j10;
        this.zze = j11;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzakyVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzaky zzb(String str, long j10, long j11, zzale zzaleVar, String[] strArr, String str2, String str3, zzaky zzakyVar) {
        return new zzaky(str, null, j10, j11, zzaleVar, strArr, str2, str3, zzakyVar);
    }

    public static zzaky zzc(String str) {
        return new zzaky(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcz zzczVar = new zzcz();
            zzczVar.zzl(new SpannableStringBuilder());
            map.put(str, zzczVar);
        }
        CharSequence zzq = ((zzcz) map.get(str)).zzq();
        zzq.getClass();
        return (SpannableStringBuilder) zzq;
    }

    private final void zzj(TreeSet treeSet, boolean z10) {
        String str = this.zza;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z10 || equals || (equals2 && this.zzh != null)) {
            long j10 = this.zzd;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.zze;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.zzm != null) {
            for (int i10 = 0; i10 < this.zzm.size(); i10++) {
                zzaky zzakyVar = (zzaky) this.zzm.get(i10);
                boolean z11 = true;
                if (!z10 && !equals) {
                    z11 = false;
                }
                zzakyVar.zzj(treeSet, z11);
            }
        }
    }

    private final void zzk(long j10, String str, List list) {
        String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (zzg(j10) && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < zza(); i10++) {
            zzd(i10).zzk(j10, str, list);
        }
    }

    private final void zzl(long j10, Map map, Map map2, String str, Map map3) {
        String str2;
        int i10;
        zzaky zzakyVar;
        int i11;
        int i12;
        zzale zza;
        int i13;
        if (zzg(j10)) {
            if (!"".equals(this.zzg)) {
                str2 = this.zzg;
            } else {
                str2 = str;
            }
            for (Map.Entry entry : this.zzl.entrySet()) {
                String str3 = (String) entry.getKey();
                if (this.zzk.containsKey(str3)) {
                    i10 = ((Integer) this.zzk.get(str3)).intValue();
                } else {
                    i10 = 0;
                }
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i10 != intValue) {
                    zzcz zzczVar = (zzcz) map3.get(str3);
                    zzczVar.getClass();
                    zzalc zzalcVar = (zzalc) map2.get(str2);
                    zzalcVar.getClass();
                    zzale zza2 = zzald.zza(this.zzf, this.zzj, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzczVar.zzq();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzczVar.zzl(spannableStringBuilder);
                    }
                    if (zza2 != null) {
                        zzaky zzakyVar2 = this.zzi;
                        if (zza2.zzh() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zza2.zzh()), i10, intValue, 33);
                        }
                        if (zza2.zzI()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, intValue, 33);
                        }
                        if (zza2.zzJ()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, intValue, 33);
                        }
                        if (zza2.zzH()) {
                            zzdg.zza(spannableStringBuilder, new ForegroundColorSpan(zza2.zzd()), i10, intValue, 33);
                        }
                        if (zza2.zzG()) {
                            zzdg.zza(spannableStringBuilder, new BackgroundColorSpan(zza2.zzc()), i10, intValue, 33);
                        }
                        if (zza2.zzD() != null) {
                            zzdg.zza(spannableStringBuilder, new TypefaceSpan(zza2.zzD()), i10, intValue, 33);
                        }
                        if (zza2.zzk() != null) {
                            zzakx zzk = zza2.zzk();
                            zzk.getClass();
                            int i14 = zzk.zza;
                            if (i14 == -1) {
                                int i15 = zzalcVar.zzj;
                                if (i15 != 2 && i15 != 1) {
                                    i14 = 1;
                                } else {
                                    i14 = 3;
                                }
                                i13 = 1;
                            } else {
                                i13 = zzk.zzb;
                            }
                            int i16 = zzk.zzc;
                            if (i16 == -2) {
                                i16 = 1;
                            }
                            zzdg.zza(spannableStringBuilder, new zzdh(i14, i13, i16), i10, intValue, 33);
                        }
                        int zzg = zza2.zzg();
                        if (zzg != 2) {
                            if (zzg == 3 || zzg == 4) {
                                spannableStringBuilder.setSpan(new zzakw(), i10, intValue, 33);
                            }
                        } else {
                            while (true) {
                                if (zzakyVar2 != null) {
                                    zzale zza3 = zzald.zza(zzakyVar2.zzf, zzakyVar2.zzj, map);
                                    if (zza3 != null && zza3.zzg() == 1) {
                                        break;
                                    }
                                    zzakyVar2 = zzakyVar2.zzi;
                                } else {
                                    zzakyVar2 = null;
                                    break;
                                }
                            }
                            if (zzakyVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzakyVar2);
                                while (true) {
                                    if (!arrayDeque.isEmpty()) {
                                        zzaky zzakyVar3 = (zzaky) arrayDeque.pop();
                                        zzale zza4 = zzald.zza(zzakyVar3.zzf, zzakyVar3.zzj, map);
                                        if (zza4 != null && zza4.zzg() == 3) {
                                            zzakyVar = zzakyVar3;
                                            break;
                                        }
                                        for (int zza5 = zzakyVar3.zza() - 1; zza5 >= 0; zza5--) {
                                            arrayDeque.push(zzakyVar3.zzd(zza5));
                                        }
                                    } else {
                                        zzakyVar = null;
                                        break;
                                    }
                                }
                                if (zzakyVar != null) {
                                    if (zzakyVar.zza() == 1 && zzakyVar.zzd(0).zzb != null) {
                                        String str4 = zzakyVar.zzd(0).zzb;
                                        int i17 = zzet.zza;
                                        zzale zza6 = zzald.zza(zzakyVar.zzf, zzakyVar.zzj, map);
                                        if (zza6 != null) {
                                            i12 = zza6.zzf();
                                            i11 = -1;
                                        } else {
                                            i11 = -1;
                                            i12 = -1;
                                        }
                                        if (i12 == i11 && (zza = zzald.zza(zzakyVar2.zzf, zzakyVar2.zzj, map)) != null) {
                                            i12 = zza.zzf();
                                        }
                                        spannableStringBuilder.setSpan(new zzdf(str4, i12), i10, intValue, 33);
                                    } else {
                                        zzea.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    }
                                }
                            }
                        }
                        if (zza2.zzF()) {
                            zzdg.zza(spannableStringBuilder, new zzde(), i10, intValue, 33);
                        }
                        int zze = zza2.zze();
                        if (zze != 1) {
                            if (zze != 2) {
                                if (zze == 3) {
                                    zzdg.zza(spannableStringBuilder, new RelativeSizeSpan(zza2.zza() / 100.0f), i10, intValue, 33);
                                }
                            } else {
                                zzdg.zza(spannableStringBuilder, new RelativeSizeSpan(zza2.zza()), i10, intValue, 33);
                            }
                        } else {
                            zzdg.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zza2.zza(), true), i10, intValue, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zza2.zzb() != Float.MAX_VALUE) {
                                zzczVar.zzj((zza2.zzb() * (-90.0f)) / 100.0f);
                            }
                            if (zza2.zzj() != null) {
                                zzczVar.zzm(zza2.zzj());
                            }
                            if (zza2.zzi() != null) {
                                zzczVar.zzg(zza2.zzi());
                            }
                        }
                    }
                }
            }
            for (int i18 = 0; i18 < zza(); i18++) {
                zzd(i18).zzl(j10, map, map2, str2, map3);
            }
        }
    }

    private final void zzm(long j10, boolean z10, String str, Map map) {
        boolean z11;
        this.zzk.clear();
        this.zzl.clear();
        if (!"metadata".equals(this.zza)) {
            if (!"".equals(this.zzg)) {
                str = this.zzg;
            }
            if (this.zzc && z10) {
                SpannableStringBuilder zzi = zzi(str, map);
                String str2 = this.zzb;
                str2.getClass();
                zzi.append((CharSequence) str2);
            } else if ("br".equals(this.zza) && z10) {
                zzi(str, map).append('\n');
            } else if (zzg(j10)) {
                for (Map.Entry entry : map.entrySet()) {
                    CharSequence zzq = ((zzcz) entry.getValue()).zzq();
                    zzq.getClass();
                    this.zzk.put((String) entry.getKey(), Integer.valueOf(zzq.length()));
                }
                boolean equals = "p".equals(this.zza);
                for (int i10 = 0; i10 < zza(); i10++) {
                    zzaky zzd = zzd(i10);
                    if (!z10 && !equals) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    zzd.zzm(j10, z11, str, map);
                }
                if (equals) {
                    SpannableStringBuilder zzi2 = zzi(str, map);
                    int length = zzi2.length();
                    do {
                        length--;
                        if (length < 0) {
                            break;
                        }
                    } while (zzi2.charAt(length) == ' ');
                    if (length >= 0 && zzi2.charAt(length) != '\n') {
                        zzi2.append('\n');
                    }
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    CharSequence zzq2 = ((zzcz) entry2.getValue()).zzq();
                    zzq2.getClass();
                    this.zzl.put((String) entry2.getKey(), Integer.valueOf(zzq2.length()));
                }
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzaky zzd(int i10) {
        List list = this.zzm;
        if (list != null) {
            return (zzaky) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j10, Map map, Map map2, Map map3) {
        zzakw[] zzakwVarArr;
        ArrayList arrayList = new ArrayList();
        zzk(j10, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j10, false, this.zzg, treeMap);
        zzl(j10, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                zzalc zzalcVar = (zzalc) map2.get(pair.first);
                zzalcVar.getClass();
                zzcz zzczVar = new zzcz();
                zzczVar.zzc(decodeByteArray);
                zzczVar.zzh(zzalcVar.zzb);
                zzczVar.zzi(0);
                zzczVar.zze(zzalcVar.zzc, 0);
                zzczVar.zzf(zzalcVar.zze);
                zzczVar.zzk(zzalcVar.zzf);
                zzczVar.zzd(zzalcVar.zzg);
                zzczVar.zzo(zzalcVar.zzj);
                arrayList2.add(zzczVar.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzalc zzalcVar2 = (zzalc) map2.get(entry.getKey());
            zzalcVar2.getClass();
            zzcz zzczVar2 = (zzcz) entry.getValue();
            CharSequence zzq = zzczVar2.zzq();
            zzq.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzq;
            for (zzakw zzakwVar : (zzakw[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzakw.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzakwVar), spannableStringBuilder.getSpanEnd(zzakwVar), (CharSequence) "");
            }
            int i11 = 0;
            while (i11 < spannableStringBuilder.length()) {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i13 = i12;
                    while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                        i13++;
                    }
                    int i14 = i13 - i12;
                    if (i14 > 0) {
                        spannableStringBuilder.delete(i11, i14 + i11);
                    }
                }
                i11 = i12;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i15 = 0;
            while (i15 < spannableStringBuilder.length() - 1) {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i15) == '\n' && spannableStringBuilder.charAt(i16) == ' ') {
                    spannableStringBuilder.delete(i16, i15 + 2);
                }
                i15 = i16;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i17 = 0;
            while (i17 < spannableStringBuilder.length() - 1) {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i17) == ' ' && spannableStringBuilder.charAt(i18) == '\n') {
                    spannableStringBuilder.delete(i17, i18);
                }
                i17 = i18;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzczVar2.zze(zzalcVar2.zzc, zzalcVar2.zzd);
            zzczVar2.zzf(zzalcVar2.zze);
            zzczVar2.zzh(zzalcVar2.zzb);
            zzczVar2.zzk(zzalcVar2.zzf);
            zzczVar2.zzn(zzalcVar2.zzi, zzalcVar2.zzh);
            zzczVar2.zzo(zzalcVar2.zzj);
            arrayList2.add(zzczVar2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(zzaky zzakyVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzakyVar);
    }

    public final boolean zzg(long j10) {
        long j11 = this.zzd;
        if (j11 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j11 = -9223372036854775807L;
        }
        int i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i10 <= 0 && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j11 == -9223372036854775807L && j10 < this.zze) {
            return true;
        }
        if (i10 <= 0 && j10 < this.zze) {
            return true;
        }
        return false;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }
}
