package com.bytedance.sdk.openadsdk.multipro.Qhi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.activity.r;
import com.bytedance.sdk.component.Tgh.Qhi.ROR;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.Tgh;
import com.bytedance.sdk.openadsdk.multipro.fl;
import com.bytedance.sdk.openadsdk.utils.js;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: DBMultiAdapter.java */
/* loaded from: classes.dex */
public class Qhi {
    public static ROR Qhi;
    private static final ConcurrentHashMap<String, Object> cJ = new ConcurrentHashMap<>();

    public static ROR Qhi(Context context) {
        if (context == null) {
            try {
                HzH.Qhi();
            } catch (Throwable unused) {
                js.Sf("binder error");
            }
        }
        if (Qhi == null) {
            if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                Qhi = ROR.Qhi.Qhi(com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi().Qhi(5));
            } else {
                Qhi = com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.ROR.cJ();
            }
        }
        return Qhi;
    }

    private static String Qhi() {
        return r.g(new StringBuilder(), fl.cJ, "/t_db/ttopensdk.db/");
    }

    public static void Qhi(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (Qhi(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                Tgh.Qhi(context).Qhi().Qhi(str, (String) null, contentValues);
                return;
            }
            ROR Qhi2 = Qhi(context);
            if (Qhi2 != null) {
                Qhi2.Qhi(Uri.parse(Qhi() + str), contentValues);
            }
        }
    }

    public static int Qhi(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (Qhi(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                return Tgh.Qhi(context).Qhi().Qhi(str, str2, strArr);
            }
            ROR Qhi2 = Qhi(context);
            if (Qhi2 != null) {
                return Qhi2.Qhi(Uri.parse(Qhi() + str), str2, strArr);
            }
            return 0;
        }
    }

    public static int Qhi(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (Qhi(str)) {
                if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                    return Tgh.Qhi(context).Qhi().Qhi(str, contentValues, str2, strArr);
                }
                ROR Qhi2 = Qhi(context);
                if (Qhi2 != null) {
                    return Qhi2.Qhi(Uri.parse(Qhi() + str), contentValues, str2, strArr);
                }
            }
        }
        return 0;
    }

    public static Map<String, List<String>> Qhi(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (Qhi(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                return Qhi(Tgh.Qhi(context).Qhi().Qhi(str, strArr, str2, strArr2, str3, str4, str5));
            }
            ROR Qhi2 = Qhi(context);
            if (Qhi2 != null) {
                return Qhi2.Qhi(Uri.parse(Qhi() + str), strArr, str2, strArr2, str5);
            }
            return null;
        }
    }

    public static Map<String, List<String>> Qhi(Cursor cursor) {
        HashMap hashMap = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new LinkedList());
                        }
                        ((List) hashMap.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
            } catch (Throwable unused) {
            }
            cursor.close();
        }
        return hashMap;
    }

    private static Object Qhi(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = cJ;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 == null) {
            synchronized (Qhi.class) {
                obj = concurrentHashMap.get(str);
                if (obj == null) {
                    obj = new Object();
                    concurrentHashMap.put(str, obj);
                }
            }
            return obj;
        }
        return obj2;
    }
}
