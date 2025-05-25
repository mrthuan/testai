package com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import androidx.activity.r;
import com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh;
import com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ROR;
import com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Sf;
import com.bytedance.sdk.component.Tgh.Qhi.hm;
import java.util.List;

/* compiled from: EventProviderImpl.java */
/* loaded from: classes.dex */
public class Qhi {
    private static String CJ() {
        return r.g(new StringBuilder(), Sf.cJ, "/ad_log_event/");
    }

    public static void Qhi() {
        if (hm.ROR().Tgh() == null) {
            return;
        }
        try {
            ContentResolver ac2 = ac();
            if (ac2 != null) {
                ac2.getType(Uri.parse(CJ() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    private static ContentResolver ac() {
        try {
            if (hm.ROR().Tgh() != null) {
                return hm.ROR().Tgh().getContentResolver();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void cJ() {
        if (hm.ROR().Tgh() == null) {
            return;
        }
        try {
            ContentResolver ac2 = ac();
            if (ac2 != null) {
                ac2.getType(Uri.parse(CJ() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void Qhi(Tgh tgh) {
        if (tgh == null) {
            return;
        }
        try {
            ContentResolver ac2 = ac();
            if (ac2 != null) {
                String Qhi = ROR.Qhi(tgh.Tgh());
                ac2.getType(Uri.parse(CJ() + "adLogDispatch?event=" + Qhi));
            }
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    public static void Qhi(String str, List<String> list, boolean z10) {
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (String str2 : list) {
                    sb2.append(ROR.Qhi(str2));
                    sb2.append(",");
                }
                String Qhi = ROR.Qhi(sb2.toString());
                String str3 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(Qhi) + "&replace=" + String.valueOf(z10);
                ContentResolver ac2 = ac();
                if (ac2 == null) {
                    return;
                }
                ac2.getType(Uri.parse(CJ() + "trackAdUrl" + str3));
            } catch (Throwable unused) {
            }
        }
    }

    public static void Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentResolver ac2 = ac();
            if (ac2 != null) {
                ac2.getType(Uri.parse(CJ() + "trackAdFailed?did=" + String.valueOf(str)));
            }
        } catch (Throwable unused) {
        }
    }
}
