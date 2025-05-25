package com.bytedance.sdk.openadsdk.multipro.ac;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.activity.r;
import com.bytedance.sdk.component.Tgh.Qhi.ROR;
import com.bytedance.sdk.openadsdk.core.CJ.hm;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.multipro.fl;
import java.util.Objects;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: FrequentCallProviderImpl.java */
/* loaded from: classes.dex */
public class Qhi implements com.bytedance.sdk.openadsdk.multipro.Qhi {
    private static ROR CJ() {
        try {
            if (HzH.Qhi() != null) {
                return com.bytedance.sdk.openadsdk.multipro.Qhi.Qhi.Qhi(HzH.Qhi());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String ac() {
        if (HzH.Qhi() == null) {
            return null;
        }
        try {
            ROR CJ = CJ();
            if (CJ != null) {
                return CJ.Qhi(Uri.parse(fl() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean cJ() {
        if (HzH.Qhi() == null) {
            return false;
        }
        try {
            ROR CJ = CJ();
            if (CJ != null) {
                return "true".equals(CJ.Qhi(Uri.parse(fl() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static String fl() {
        return r.g(new StringBuilder(), fl.cJ, "/t_frequent/");
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public int Qhi(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public int Qhi(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public Cursor Qhi(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public Uri Qhi(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public String Qhi() {
        return "t_frequent";
    }

    public static boolean Qhi(String str) {
        if (HzH.Qhi() == null) {
            return false;
        }
        try {
            ROR CJ = CJ();
            if (CJ != null) {
                return "true".equals(CJ.Qhi(Uri.parse(fl() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public String Qhi(Uri uri) {
        Objects.toString(uri);
        String str = uri.getPath().split(PackagingURIHelper.FORWARD_SLASH_STRING)[2];
        if ("checkFrequency".equals(str)) {
            return hm.Qhi().Qhi(uri.getQueryParameter("rit")) ? "true" : "false";
        } else if ("isSilent".equals(str)) {
            return hm.Qhi().cJ() ? "true" : "false";
        } else if ("maxRit".equals(str)) {
            return hm.Qhi().ac();
        } else {
            return null;
        }
    }
}
