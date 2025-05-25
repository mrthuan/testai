package com.bytedance.sdk.openadsdk.multipro.aidl.Qhi;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.sdk.component.Tgh.Qhi.ROR;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.settings.ABk;
import java.util.Map;

/* compiled from: ProviderListenerManagerImpl.java */
/* loaded from: classes.dex */
public class ROR extends ROR.Qhi {
    private static volatile ROR Qhi;

    public static ROR cJ() {
        if (Qhi == null) {
            synchronized (ROR.class) {
                if (Qhi == null) {
                    Qhi = new ROR();
                }
            }
        }
        return Qhi;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.ROR
    public Map Qhi(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (ABk.Qhi()) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.Qhi.Qhi.Qhi(com.bytedance.sdk.openadsdk.multipro.Tgh.Qhi(HzH.Qhi()).Qhi(uri, strArr, str, strArr2, str2));
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.ROR
    public String Qhi(Uri uri) {
        if (ABk.Qhi()) {
            return com.bytedance.sdk.openadsdk.multipro.Tgh.Qhi(HzH.Qhi()).Qhi(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.ROR
    public String Qhi(Uri uri, ContentValues contentValues) {
        Uri Qhi2;
        if (ABk.Qhi() && (Qhi2 = com.bytedance.sdk.openadsdk.multipro.Tgh.Qhi(HzH.Qhi()).Qhi(uri, contentValues)) != null) {
            return Qhi2.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.ROR
    public int Qhi(Uri uri, String str, String[] strArr) {
        if (ABk.Qhi()) {
            return com.bytedance.sdk.openadsdk.multipro.Tgh.Qhi(HzH.Qhi()).Qhi(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.ROR
    public int Qhi(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (ABk.Qhi()) {
            return com.bytedance.sdk.openadsdk.multipro.Tgh.Qhi(HzH.Qhi()).Qhi(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
