package com.inmobi.media;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public abstract class L3 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f14418a = 0;

    public static final ArrayList a(Context context) {
        File databasePath;
        kotlin.jvm.internal.g.e(context, "context");
        ArrayList arrayList = new ArrayList();
        String[] databaseList = context.databaseList();
        if (databaseList != null) {
            if (!(databaseList.length == 0)) {
                for (String str : databaseList) {
                    kotlin.jvm.internal.g.b(str);
                    if (new Regex("com\\.im_([0-9]+\\.){3}db").matches(str)) {
                        int i10 = Q2.f14585a;
                        if (!kotlin.jvm.internal.g.a(str, "com.im_10.7.8.db") && (databasePath = context.getDatabasePath(str)) != null && databasePath.exists() && !context.deleteDatabase(str)) {
                            arrayList.add(str);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
        List<String> I = ge.a.I("com.im.keyValueStore.carb_store", "com.im.keyValueStore.aes_key_store", "com.im.keyValueStore.mraid_js_store", "com.im.keyValueStore.omid_js_store", "com.im.keyValueStore.user_info_store", "com.im.keyValueStore.coppa_store", "com.im.keyValueStore.gesture_info_store", "com.im.keyValueStore.display_info_store", "com.im.keyValueStore.unified_id_info_store", "com.im.keyValueStore.app_bundle_store", "com.im.keyValueStore.pub_signals_store");
        if (Build.VERSION.SDK_INT >= 24) {
            for (String str : I) {
                context.deleteSharedPreferences(str);
            }
        } else {
            Iterator it = I.iterator();
            while (it.hasNext()) {
                File file = new File("/data/data/" + context.getPackageName() + "/shared_prefs/" + ((String) it.next()) + ".xml");
                if (file.exists() && file.delete()) {
                    file.getName();
                }
            }
        }
        return !a(context).isEmpty();
    }

    public static final void a(File path) {
        kotlin.jvm.internal.g.e(path, "path");
        try {
            if (path.exists()) {
                File[] listFiles = path.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.isDirectory()) {
                            a(file);
                        } else if (file.delete()) {
                            file.getName();
                        }
                    }
                }
                if (path.delete()) {
                    path.getName();
                }
            }
        } catch (Exception unused) {
        }
    }
}
