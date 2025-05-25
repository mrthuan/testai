package com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* compiled from: DBMultiUtils.java */
/* loaded from: classes.dex */
public class ac {
    public static void Qhi(Context context, String str, ContentValues contentValues) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            try {
                Qhi.Qhi(context).Qhi().Qhi(str, (String) null, contentValues);
            } catch (Throwable unused) {
            }
        }
    }

    public static void Qhi(Context context, String str, List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> list) {
        if (list != null && !TextUtils.isEmpty(str)) {
            try {
                Qhi.Qhi(context).Qhi().Qhi(str, (String) null, list);
            } catch (Throwable unused) {
            }
        }
    }

    public static int Qhi(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Qhi.Qhi(context).Qhi().Qhi(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int Qhi(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            try {
                return Qhi.Qhi(context).Qhi().Qhi(str, contentValues, str2, strArr);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static Cursor Qhi(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Qhi.Qhi(context).Qhi().Qhi(str, strArr, str2, strArr2, null, null, str5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void Qhi(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Qhi.Qhi(context).Qhi().Qhi(Uri.decode(str));
        } catch (Throwable unused) {
        }
    }
}
