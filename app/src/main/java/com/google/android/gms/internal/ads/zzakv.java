package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzakv implements zzaka {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzek zze = new zzek();

    public static float zzc(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    private static long zzd(Matcher matcher, int i10) {
        long j10;
        String group = matcher.group(i10 + 1);
        if (group != null) {
            j10 = Long.parseLong(group) * 3600000;
        } else {
            j10 = 0;
        }
        String group2 = matcher.group(i10 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j10;
        String group3 = matcher.group(i10 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i10 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zza(byte[] bArr, int i10, int i11, zzajz zzajzVar, zzdn zzdnVar) {
        String str;
        char c;
        char c10;
        int i12;
        zzdb zzp;
        zzakv zzakvVar = this;
        zzakvVar.zze.zzI(bArr, i10 + i11);
        zzakvVar.zze.zzK(i10);
        Charset zzB = zzakvVar.zze.zzB();
        if (zzB == null) {
            zzB = zzfuj.zzc;
        }
        while (true) {
            String zzy = zzakvVar.zze.zzy(zzB);
            if (zzy != null) {
                if (zzy.length() != 0) {
                    try {
                        Integer.parseInt(zzy);
                        String zzy2 = zzakvVar.zze.zzy(zzB);
                        if (zzy2 == null) {
                            zzea.zzf("SubripParser", "Unexpected end");
                            return;
                        }
                        Matcher matcher = zza.matcher(zzy2);
                        if (matcher.matches()) {
                            long zzd = zzd(matcher, 1);
                            long zzd2 = zzd(matcher, 6);
                            int i13 = 0;
                            zzakvVar.zzc.setLength(0);
                            zzakvVar.zzd.clear();
                            String zzy3 = zzakvVar.zze.zzy(zzB);
                            while (!TextUtils.isEmpty(zzy3)) {
                                if (zzakvVar.zzc.length() > 0) {
                                    zzakvVar.zzc.append("<br>");
                                }
                                StringBuilder sb2 = zzakvVar.zzc;
                                ArrayList arrayList = zzakvVar.zzd;
                                String trim = zzy3.trim();
                                StringBuilder sb3 = new StringBuilder(trim);
                                Matcher matcher2 = zzb.matcher(trim);
                                int i14 = i13;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList.add(group);
                                    int start = matcher2.start() - i14;
                                    int length = group.length();
                                    sb3.replace(start, start + length, "");
                                    i14 += length;
                                }
                                sb2.append(sb3.toString());
                                zzy3 = zzakvVar.zze.zzy(zzB);
                                i13 = 0;
                            }
                            Spanned fromHtml = Html.fromHtml(zzakvVar.zzc.toString());
                            int i15 = 0;
                            while (true) {
                                if (i15 < zzakvVar.zzd.size()) {
                                    str = (String) zzakvVar.zzd.get(i15);
                                    if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                        i15++;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            zzcz zzczVar = new zzcz();
                            zzczVar.zzl(fromHtml);
                            if (str == null) {
                                zzp = zzczVar.zzp();
                            } else {
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                if (c != 0 && c != 1 && c != 2) {
                                    if (c != 3 && c != 4 && c != 5) {
                                        zzczVar.zzi(1);
                                    } else {
                                        zzczVar.zzi(2);
                                    }
                                } else {
                                    zzczVar.zzi(0);
                                }
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c10 = 3;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c10 = 4;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c10 = 5;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    default:
                                        c10 = 65535;
                                        break;
                                }
                                if (c10 != 0 && c10 != 1) {
                                    if (c10 != 2) {
                                        if (c10 != 3 && c10 != 4 && c10 != 5) {
                                            zzczVar.zzf(1);
                                        } else {
                                            zzczVar.zzf(0);
                                        }
                                        zzczVar.zzh(zzc(zzczVar.zzb()));
                                        zzczVar.zze(zzc(zzczVar.zza()), 0);
                                        zzp = zzczVar.zzp();
                                    } else {
                                        i12 = 2;
                                    }
                                } else {
                                    i12 = 2;
                                }
                                zzczVar.zzf(i12);
                                zzczVar.zzh(zzc(zzczVar.zzb()));
                                zzczVar.zze(zzc(zzczVar.zza()), 0);
                                zzp = zzczVar.zzp();
                            }
                            zzdnVar.zza(new zzajs(zzfxr.zzn(zzp), zzd, zzd2 - zzd));
                        } else {
                            zzea.zzf("SubripParser", "Skipping invalid timing: ".concat(zzy2));
                        }
                    } catch (NumberFormatException unused) {
                        zzea.zzf("SubripParser", "Skipping invalid index: ".concat(zzy));
                    }
                }
                zzakvVar = this;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final /* synthetic */ void zzb() {
    }
}
