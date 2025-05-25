package com.bytedance.sdk.openadsdk.multipro.Qhi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.Tgh;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: DBMultiProviderImpl.java */
/* loaded from: classes.dex */
public class cJ implements com.bytedance.sdk.openadsdk.multipro.Qhi {
    private static final Object cJ = new Object();
    private Context Qhi;

    private boolean cJ(Uri uri) {
        return uri == null || TextUtils.isEmpty(uri.getPath());
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public String Qhi() {
        return "t_db";
    }

    private Context cJ() {
        Context context = this.Qhi;
        return context == null ? HzH.Qhi() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public Cursor Qhi(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        synchronized (cJ) {
            if (cJ(uri)) {
                return null;
            }
            String[] split = uri.getPath().split(PackagingURIHelper.FORWARD_SLASH_STRING);
            if (split != null && split.length >= 4) {
                String str3 = split[2];
                String str4 = split[3];
                if ("ttopensdk.db".equals(str3)) {
                    return Tgh.Qhi(cJ()).Qhi().Qhi(str4, strArr, str, strArr2, null, null, str2);
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public String Qhi(Uri uri) {
        synchronized (cJ) {
            if (cJ(uri)) {
                return null;
            }
            String[] split = uri.getPath().split(PackagingURIHelper.FORWARD_SLASH_STRING);
            if (split != null && split.length >= 5) {
                String str = split[2];
                String str2 = split[4];
                if ("ttopensdk.db".equals(str)) {
                    if ("execSQL".equals(str2)) {
                        String queryParameter = uri.getQueryParameter("sql");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            Tgh.Qhi(cJ()).Qhi().Qhi(Uri.decode(queryParameter));
                        }
                    } else if ("transactionBegin".equals(str2)) {
                        Tgh.Qhi(cJ()).Qhi().cJ();
                    } else if ("transactionSetSuccess".equals(str2)) {
                        Tgh.Qhi(cJ()).Qhi().ac();
                    } else if ("transactionEnd".equals(str2)) {
                        Tgh.Qhi(cJ()).Qhi().CJ();
                    }
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public Uri Qhi(Uri uri, ContentValues contentValues) {
        synchronized (cJ) {
            if (cJ(uri)) {
                return null;
            }
            String[] split = uri.getPath().split(PackagingURIHelper.FORWARD_SLASH_STRING);
            if (split != null && split.length >= 4) {
                String str = split[2];
                String str2 = split[3];
                if ("ttopensdk.db".equals(str)) {
                    Tgh.Qhi(cJ()).Qhi().Qhi(str2, (String) null, contentValues);
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public int Qhi(Uri uri, String str, String[] strArr) {
        synchronized (cJ) {
            if (cJ(uri)) {
                return 0;
            }
            String[] split = uri.getPath().split(PackagingURIHelper.FORWARD_SLASH_STRING);
            if (split != null && split.length >= 4) {
                String str2 = split[2];
                String str3 = split[3];
                if ("ttopensdk.db".equals(str2)) {
                    return Tgh.Qhi(cJ()).Qhi().Qhi(str3, str, strArr);
                }
                return 0;
            }
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public int Qhi(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        synchronized (cJ) {
            if (cJ(uri)) {
                return 0;
            }
            String[] split = uri.getPath().split(PackagingURIHelper.FORWARD_SLASH_STRING);
            if (split != null && split.length >= 4) {
                String str2 = split[2];
                String str3 = split[3];
                if ("ttopensdk.db".equals(str2)) {
                    return Tgh.Qhi(cJ()).Qhi().Qhi(str3, contentValues, str, strArr);
                }
                return 0;
            }
            return 0;
        }
    }
}
