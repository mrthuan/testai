package com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.activity.r;
import com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh;
import com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Sf;
import com.bytedance.sdk.component.Tgh.Qhi.ROR;
import com.bytedance.sdk.component.Tgh.Qhi.hm;
import java.util.List;

/* compiled from: OverSeasEventProviderImpl.java */
/* loaded from: classes.dex */
public class cJ {
    public static ROR Qhi;

    private static String CJ() {
        return r.g(new StringBuilder(), Sf.cJ, "/ad_log_event/");
    }

    public static void cJ() {
        if (hm.ROR().Tgh() == null) {
            return;
        }
        try {
            ROR Qhi2 = Qhi(hm.ROR().Tgh());
            if (Qhi2 != null) {
                Qhi2.Qhi(Uri.parse(CJ() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public int Qhi(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public String ac() {
        return "ad_log_event";
    }

    public int Qhi(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor Qhi(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public Uri Qhi(Uri uri, ContentValues contentValues) {
        return null;
    }

    public static ROR Qhi(Context context) {
        try {
            if (Qhi == null) {
                Qhi = hm.ROR().hpZ().Gm();
            }
        } catch (Exception unused) {
        }
        return Qhi;
    }

    public static void Qhi() {
        if (hm.ROR().Tgh() == null) {
            return;
        }
        try {
            ROR Qhi2 = Qhi(hm.ROR().Tgh());
            if (Qhi2 != null) {
                Qhi2.Qhi(Uri.parse(CJ() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void Qhi(Tgh tgh) {
        if (tgh == null) {
            return;
        }
        try {
            ROR Qhi2 = Qhi(hm.ROR().Tgh());
            if (Qhi2 != null) {
                String Qhi3 = com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ROR.Qhi(tgh.Tgh());
                Qhi2.Qhi(Uri.parse(CJ() + "adLogDispatch?event=" + Qhi3));
            }
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    public static void Qhi(String str, List<String> list, boolean z10, int i10, String str2) {
        if (list != null && !list.isEmpty()) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (String str3 : list) {
                    sb2.append(com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ROR.Qhi(str3));
                    sb2.append(",");
                }
                String Qhi2 = com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ROR.Qhi(sb2.toString());
                String str4 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(Qhi2) + "&replace=" + String.valueOf(z10) + "&urlType=" + String.valueOf(i10) + "&adId=" + str2;
                ROR Qhi3 = Qhi(hm.ROR().Tgh());
                if (Qhi3 == null) {
                    return;
                }
                Qhi3.Qhi(Uri.parse(CJ() + "trackAdUrl" + str4));
            } catch (Throwable unused) {
            }
        }
    }

    public static void Qhi(String str, boolean z10) {
        if (hm.ROR().hpZ().Tgh() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ROR Qhi2 = Qhi(hm.ROR().Tgh());
            if (Qhi2 != null) {
                Qhi2.Qhi(Uri.parse(CJ() + "trackAdFailed?did=" + String.valueOf(str) + "&triggerOnInit=" + z10));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r0.equals("adLogStop") == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String Qhi(android.net.Uri r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.cJ.Qhi(android.net.Uri):java.lang.String");
    }
}
