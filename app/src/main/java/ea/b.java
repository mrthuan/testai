package ea;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.internal.measurement.zzjb;
import com.google.android.gms.measurement.internal.zzhd;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.2 */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final zzjb f16526a = zzjb.zzi("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b  reason: collision with root package name */
    public static final zzja f16527b = zzja.zzj("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    public static final zzja c = zzja.zzi("auto", "app", "am");

    /* renamed from: d  reason: collision with root package name */
    public static final zzja f16528d = zzja.zzh("_r", "_dbg");

    /* renamed from: e  reason: collision with root package name */
    public static final zzja f16529e;

    /* renamed from: f  reason: collision with root package name */
    public static final zzja f16530f;

    static {
        zzix zzixVar = new zzix();
        zzixVar.zza(zzhd.f11808a);
        zzixVar.zza(zzhd.f11809b);
        f16529e = zzixVar.zzb();
        f16530f = zzja.zzh("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(Bundle bundle, String str, String str2) {
        char c10;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!c(str) || bundle == null) {
            return false;
        }
        zzja zzjaVar = f16528d;
        int size = zzjaVar.size();
        int i10 = 0;
        while (i10 < size) {
            boolean containsKey = bundle.containsKey((String) zzjaVar.get(i10));
            i10++;
            if (containsKey) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c10 = 2;
                }
                c10 = 65535;
            } else {
                if (str.equals("fdl")) {
                    c10 = 1;
                }
                c10 = 65535;
            }
        } else {
            if (str.equals("fcm")) {
                c10 = 0;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    return false;
                }
                bundle.putString("_cis", "fiam_integration");
                return true;
            }
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        bundle.putString("_cis", "fcm_integration");
        return true;
    }

    public static boolean b(Bundle bundle, String str) {
        if (f16527b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            zzja zzjaVar = f16528d;
            int size = zzjaVar.size();
            int i10 = 0;
            while (i10 < size) {
                boolean containsKey = bundle.containsKey((String) zzjaVar.get(i10));
                i10++;
                if (containsKey) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean c(String str) {
        if (!c.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean d(String str, String str2) {
        if (!"_ce1".equals(str2) && !"_ce2".equals(str2)) {
            if ("_ln".equals(str2)) {
                if (str.equals("fcm") || str.equals("fiam")) {
                    return true;
                }
                return false;
            } else if (f16529e.contains(str2)) {
                return false;
            } else {
                zzja zzjaVar = f16530f;
                int size = zzjaVar.size();
                int i10 = 0;
                while (i10 < size) {
                    boolean matches = str2.matches((String) zzjaVar.get(i10));
                    i10++;
                    if (matches) {
                        return false;
                    }
                }
                return true;
            }
        } else if (str.equals("fcm") || str.equals("frc")) {
            return true;
        } else {
            return false;
        }
    }
}
