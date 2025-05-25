package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzalr {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC)));
        hashMap.put("red", Integer.valueOf(Color.rgb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString zza(java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalr.zza(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static zzcz zzb(String str) {
        zzalq zzalqVar = new zzalq();
        zzh(str, zzalqVar);
        return zzalqVar.zza();
    }

    public static zzalk zzc(zzek zzekVar, List list) {
        Charset charset = zzfuj.zzc;
        String zzy = zzekVar.zzy(charset);
        if (zzy != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzy);
            if (!matcher.matches()) {
                String zzy2 = zzekVar.zzy(charset);
                if (zzy2 != null) {
                    Matcher matcher2 = pattern.matcher(zzy2);
                    if (matcher2.matches()) {
                        return zze(zzy.trim(), matcher2, zzekVar, list);
                    }
                }
            } else {
                return zze(null, matcher, zzekVar, list);
            }
        }
        return null;
    }

    private static int zzd(List list, String str, zzalo zzaloVar) {
        List zzf = zzf(list, str, zzaloVar);
        for (int i10 = 0; i10 < zzf.size(); i10++) {
            zzalj zzaljVar = ((zzalp) zzf.get(i10)).zzb;
            if (zzaljVar.zze() != -1) {
                return zzaljVar.zze();
            }
        }
        return -1;
    }

    private static zzalk zze(String str, Matcher matcher, zzek zzekVar, List list) {
        zzalq zzalqVar = new zzalq();
        try {
            String group = matcher.group(1);
            group.getClass();
            zzalqVar.zza = zzalt.zzb(group);
            String group2 = matcher.group(2);
            group2.getClass();
            zzalqVar.zzb = zzalt.zzb(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            zzh(group3, zzalqVar);
            StringBuilder sb2 = new StringBuilder();
            String zzy = zzekVar.zzy(zzfuj.zzc);
            while (!TextUtils.isEmpty(zzy)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(zzy.trim());
                zzy = zzekVar.zzy(zzfuj.zzc);
            }
            zzalqVar.zzc = zza(str, sb2.toString(), list);
            return new zzalk(zzalqVar.zza().zzp(), zzalqVar.zza, zzalqVar.zzb);
        } catch (NumberFormatException unused) {
            zzea.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, String str, zzalo zzaloVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzalj zzaljVar = (zzalj) list.get(i10);
            int zzf = zzaljVar.zzf(str, zzaloVar.zza, zzaloVar.zzd, zzaloVar.zzc);
            if (zzf > 0) {
                arrayList.add(new zzalp(zzf, zzaljVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void zzg(String str, zzalo zzaloVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c;
        Comparator comparator;
        zzalo zzaloVar2;
        zzalo zzaloVar3;
        zzalo zzaloVar4;
        int i10;
        int i11 = zzaloVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzaloVar.zza;
        int hashCode = str2.hashCode();
        int i12 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode != 3511770) {
                        if (hashCode != 98) {
                            if (hashCode != 99) {
                                if (hashCode != 117) {
                                    if (hashCode == 118 && str2.equals(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT)) {
                                        c = 6;
                                    }
                                    c = 65535;
                                } else {
                                    if (str2.equals("u")) {
                                        c = 3;
                                    }
                                    c = 65535;
                                }
                            } else {
                                if (str2.equals("c")) {
                                    c = 4;
                                }
                                c = 65535;
                            }
                        } else {
                            if (str2.equals("b")) {
                                c = 0;
                            }
                            c = 65535;
                        }
                    } else {
                        if (str2.equals("ruby")) {
                            c = 2;
                        }
                        c = 65535;
                    }
                } else {
                    if (str2.equals("lang")) {
                        c = 5;
                    }
                    c = 65535;
                }
            } else {
                if (str2.equals(OperatorName.SET_FLATNESS)) {
                    c = 1;
                }
                c = 65535;
            }
        } else {
            if (str2.equals("")) {
                c = 7;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i11, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
                break;
            case 2:
                int zzd2 = zzd(list2, str, zzaloVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                comparator = zzaln.zza;
                Collections.sort(arrayList, comparator);
                int i13 = zzaloVar.zzb;
                int i14 = 0;
                int i15 = 0;
                while (i14 < arrayList.size()) {
                    zzaloVar2 = ((zzaln) arrayList.get(i14)).zzb;
                    if ("rt".equals(zzaloVar2.zza)) {
                        zzaln zzalnVar = (zzaln) arrayList.get(i14);
                        zzaloVar3 = zzalnVar.zzb;
                        int zzd3 = zzd(list2, str, zzaloVar3);
                        if (zzd3 == i12) {
                            if (zzd2 != i12) {
                                zzd3 = zzd2;
                            } else {
                                zzd3 = 1;
                            }
                        }
                        zzaloVar4 = zzalnVar.zzb;
                        int i16 = zzaloVar4.zzb - i15;
                        i10 = zzalnVar.zzc;
                        int i17 = i10 - i15;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i16, i17);
                        spannableStringBuilder.delete(i16, i17);
                        spannableStringBuilder.setSpan(new zzdf(subSequence.toString(), zzd3), i13, i16, 33);
                        i15 = subSequence.length() + i15;
                        i13 = i16;
                    }
                    i14++;
                    i12 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
                break;
            case 4:
                for (String str3 : zzaloVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i11, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i11, length, 33);
                        }
                    }
                }
                break;
            case 5:
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List zzf = zzf(list2, str, zzaloVar);
        for (int i18 = 0; i18 < zzf.size(); i18++) {
            zzalj zzaljVar = ((zzalp) zzf.get(i18)).zzb;
            if (zzaljVar != null) {
                if (zzaljVar.zzg() != -1) {
                    zzdg.zza(spannableStringBuilder, new StyleSpan(zzaljVar.zzg()), i11, length, 33);
                }
                if (zzaljVar.zzz()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
                }
                if (zzaljVar.zzy()) {
                    zzdg.zza(spannableStringBuilder, new ForegroundColorSpan(zzaljVar.zzc()), i11, length, 33);
                }
                if (zzaljVar.zzx()) {
                    zzdg.zza(spannableStringBuilder, new BackgroundColorSpan(zzaljVar.zzb()), i11, length, 33);
                }
                if (zzaljVar.zzr() != null) {
                    zzdg.zza(spannableStringBuilder, new TypefaceSpan(zzaljVar.zzr()), i11, length, 33);
                }
                int zzd4 = zzaljVar.zzd();
                if (zzd4 != 1) {
                    if (zzd4 != 2) {
                        if (zzd4 == 3) {
                            zzdg.zza(spannableStringBuilder, new RelativeSizeSpan(zzaljVar.zza() / 100.0f), i11, length, 33);
                        }
                    } else {
                        zzdg.zza(spannableStringBuilder, new RelativeSizeSpan(zzaljVar.zza()), i11, length, 33);
                    }
                } else {
                    zzdg.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzaljVar.zza(), true), i11, length, 33);
                }
                if (zzaljVar.zzw()) {
                    spannableStringBuilder.setSpan(new zzde(), i11, length, 33);
                }
            }
        }
    }

    private static void zzh(String str, zzalq zzalqVar) {
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i10 = 1;
            String group = matcher.group(1);
            group.getClass();
            int i11 = 2;
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                char c = 65535;
                if (!"line".equals(group)) {
                    if (!"align".equals(group)) {
                        if (!"position".equals(group)) {
                            if ("size".equals(group)) {
                                zzalqVar.zzj = zzalt.zza(group2);
                            } else if (!"vertical".equals(group)) {
                                zzea.zzf("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                            } else {
                                int hashCode = group2.hashCode();
                                if (hashCode != 3462) {
                                    if (hashCode == 3642 && group2.equals("rl")) {
                                        c = 0;
                                    }
                                } else if (group2.equals("lr")) {
                                    c = 1;
                                }
                                if (c != 0) {
                                    if (c != 1) {
                                        zzea.zzf("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                                        i10 = SlideAtom.USES_MASTER_SLIDE_ID;
                                    } else {
                                        i10 = 2;
                                    }
                                }
                                zzalqVar.zzk = i10;
                            }
                        } else {
                            int indexOf = group2.indexOf(44);
                            if (indexOf != -1) {
                                String substring = group2.substring(indexOf + 1);
                                switch (substring.hashCode()) {
                                    case -1842484672:
                                        if (substring.equals("line-left")) {
                                            c = 0;
                                            break;
                                        }
                                        break;
                                    case -1364013995:
                                        if (substring.equals("center")) {
                                            c = 2;
                                            break;
                                        }
                                        break;
                                    case -1276788989:
                                        if (substring.equals("line-right")) {
                                            c = 4;
                                            break;
                                        }
                                        break;
                                    case -1074341483:
                                        if (substring.equals("middle")) {
                                            c = 3;
                                            break;
                                        }
                                        break;
                                    case 100571:
                                        if (substring.equals("end")) {
                                            c = 5;
                                            break;
                                        }
                                        break;
                                    case 109757538:
                                        if (substring.equals("start")) {
                                            c = 1;
                                            break;
                                        }
                                        break;
                                }
                                if (c != 0 && c != 1) {
                                    if (c != 2 && c != 3) {
                                        if (c != 4 && c != 5) {
                                            zzea.zzf("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                            i10 = SlideAtom.USES_MASTER_SLIDE_ID;
                                        } else {
                                            i10 = 2;
                                        }
                                    }
                                } else {
                                    i10 = 0;
                                }
                                zzalqVar.zzi = i10;
                                group2 = group2.substring(0, indexOf);
                            }
                            zzalqVar.zzh = zzalt.zza(group2);
                        }
                    } else {
                        switch (group2.hashCode()) {
                            case -1364013995:
                                if (group2.equals("center")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (group2.equals("middle")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (group2.equals("end")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (group2.equals("left")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (group2.equals("right")) {
                                    c = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (group2.equals("start")) {
                                    c = 0;
                                    break;
                                }
                                break;
                        }
                        if (c != 0) {
                            if (c != 1) {
                                if (c != 2 && c != 3) {
                                    if (c != 4) {
                                        i10 = 5;
                                        if (c != 5) {
                                            zzea.zzf("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                        }
                                    } else {
                                        i10 = 3;
                                    }
                                }
                                i10 = 2;
                            } else {
                                i10 = 4;
                            }
                        }
                        zzalqVar.zzd = i10;
                    }
                } else {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1364013995:
                                if (substring2.equals("center")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring2.equals("end")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring2.equals("start")) {
                                    c = 0;
                                    break;
                                }
                                break;
                        }
                        if (c != 0) {
                            if (c != 1 && c != 2) {
                                if (c != 3) {
                                    zzea.zzf("WebvttCueParser", "Invalid anchor value: ".concat(substring2));
                                    i11 = SlideAtom.USES_MASTER_SLIDE_ID;
                                }
                            } else {
                                i11 = 1;
                            }
                        } else {
                            i11 = 0;
                        }
                        zzalqVar.zzg = i11;
                        group2 = group2.substring(0, indexOf2);
                    }
                    if (group2.endsWith("%")) {
                        zzalqVar.zze = zzalt.zza(group2);
                        zzalqVar.zzf = 0;
                    } else {
                        zzalqVar.zze = Integer.parseInt(group2);
                        zzalqVar.zzf = 1;
                    }
                }
            } catch (NumberFormatException unused) {
                zzea.zzf("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
