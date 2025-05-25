package com.google.android.gms.internal.ads;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzazi {
    private final zzayx zza;
    private final int zzb;
    private final int zzc;

    public zzazi(int i10, int i11, int i12) {
        this.zzb = i10;
        i11 = (i11 > 64 || i11 < 0) ? 64 : i11;
        if (i12 <= 0) {
            this.zzc = 1;
        } else {
            this.zzc = i12;
        }
        this.zza = new zzazg(i11);
    }

    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        Collections.sort(arrayList2, new zzazh(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((zzayw) arrayList2.get(i10)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str2 : split) {
                    if (str2.contains(OperatorName.SHOW_TEXT_LINE)) {
                        StringBuilder sb2 = new StringBuilder(str2);
                        int i11 = 1;
                        boolean z10 = false;
                        while (true) {
                            int i12 = i11 + 2;
                            if (i12 > sb2.length()) {
                                break;
                            }
                            if (sb2.charAt(i11) == '\'') {
                                if (sb2.charAt(i11 - 1) != ' ') {
                                    int i13 = i11 + 1;
                                    if ((sb2.charAt(i13) == 's' || sb2.charAt(i13) == 'S') && (i12 == sb2.length() || sb2.charAt(i12) == ' ')) {
                                        sb2.insert(i11, ' ');
                                        i11 = i12;
                                        z10 = true;
                                    }
                                }
                                sb2.setCharAt(i11, ' ');
                                z10 = true;
                            }
                            i11++;
                        }
                        if (z10) {
                            str = sb2.toString();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            str2 = str;
                        }
                    }
                    String[] zzb = zzazb.zzb(str2, true);
                    if (zzb.length >= this.zzc) {
                        for (int i14 = 0; i14 < zzb.length; i14++) {
                            String str3 = "";
                            for (int i15 = 0; i15 < this.zzc; i15++) {
                                int i16 = i14 + i15;
                                if (i16 >= zzb.length) {
                                    break;
                                }
                                if (i15 > 0) {
                                    str3 = str3.concat(" ");
                                }
                                str3 = str3.concat(String.valueOf(zzb[i16]));
                            }
                            hashSet.add(str3);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
                continue;
            }
        }
        zzayz zzayzVar = new zzayz();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzayzVar.zzb.write(this.zza.zzb((String) it.next()));
            } catch (IOException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
            }
        }
        return zzayzVar.toString();
    }
}
