package a8;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzli;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public abstract class p2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f288a;

    /* renamed from: b  reason: collision with root package name */
    public final int f289b;
    public Boolean c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f290d;

    /* renamed from: e  reason: collision with root package name */
    public Long f291e;

    /* renamed from: f  reason: collision with root package name */
    public Long f292f;

    public p2(String str, int i10) {
        this.f288a = str;
        this.f289b = i10;
    }

    @VisibleForTesting
    public static Boolean d(BigDecimal bigDecimal, zzer zzerVar, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.j(zzerVar);
        if (zzerVar.zzg()) {
            boolean z10 = true;
            if (zzerVar.zzm() != 1) {
                if (zzerVar.zzm() == 5) {
                    if (!zzerVar.zzk() || !zzerVar.zzj()) {
                        return null;
                    }
                } else if (!zzerVar.zzh()) {
                    return null;
                }
                int zzm = zzerVar.zzm();
                if (zzerVar.zzm() == 5) {
                    if (zzli.N(zzerVar.zze()) && zzli.N(zzerVar.zzd())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(zzerVar.zze());
                            bigDecimal4 = new BigDecimal(zzerVar.zzd());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!zzli.N(zzerVar.zzc())) {
                    return null;
                } else {
                    try {
                        bigDecimal2 = new BigDecimal(zzerVar.zzc());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (zzm == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i10 = zzm - 1;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4 || bigDecimal3 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        } else if (bigDecimal2 == null) {
                            return null;
                        } else {
                            if (d10 != 0.0d) {
                                if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) >= 0) {
                                    z10 = false;
                                }
                                return Boolean.valueOf(z10);
                            }
                            if (bigDecimal.compareTo(bigDecimal2) != 0) {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        }
                    } else if (bigDecimal2 == null) {
                        return null;
                    } else {
                        if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                } else {
                    if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
            }
        }
        return null;
    }

    @VisibleForTesting
    public static Boolean e(String str, zzey zzeyVar, zzeu zzeuVar) {
        String zzd;
        List<String> zze;
        String str2;
        int i10;
        Preconditions.j(zzeyVar);
        if (str == null || !zzeyVar.zzi() || zzeyVar.zzj() == 1) {
            return null;
        }
        if (zzeyVar.zzj() == 7) {
            if (zzeyVar.zza() == 0) {
                return null;
            }
        } else if (!zzeyVar.zzh()) {
            return null;
        }
        int zzj = zzeyVar.zzj();
        boolean zzf = zzeyVar.zzf();
        if (!zzf && zzj != 2 && zzj != 7) {
            zzd = zzeyVar.zzd().toUpperCase(Locale.ENGLISH);
        } else {
            zzd = zzeyVar.zzd();
        }
        if (zzeyVar.zza() == 0) {
            zze = null;
        } else {
            zze = zzeyVar.zze();
            if (!zzf) {
                ArrayList arrayList = new ArrayList(zze.size());
                for (String str3 : zze) {
                    arrayList.add(str3.toUpperCase(Locale.ENGLISH));
                }
                zze = Collections.unmodifiableList(arrayList);
            }
        }
        if (zzj == 2) {
            str2 = zzd;
        } else {
            str2 = null;
        }
        if (zzj == 7) {
            if (zze == 0 || zze.isEmpty()) {
                return null;
            }
        } else if (zzd == null) {
            return null;
        }
        if (!zzf && zzj != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (zzj - 1) {
            case 1:
                if (str2 == null) {
                    return null;
                }
                if (true != zzf) {
                    i10 = 66;
                } else {
                    i10 = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str2, i10).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    zzeuVar.f11715i.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(zzd));
            case 3:
                return Boolean.valueOf(str.endsWith(zzd));
            case 4:
                return Boolean.valueOf(str.contains(zzd));
            case 5:
                return Boolean.valueOf(str.equals(zzd));
            case 6:
                if (zze == null) {
                    return null;
                }
                return Boolean.valueOf(zze.contains(str));
            default:
                return null;
        }
    }

    @VisibleForTesting
    public static Boolean f(Boolean bool, boolean z10) {
        boolean z11;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
