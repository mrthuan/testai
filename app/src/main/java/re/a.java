package re;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import androidx.activity.f;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: StorageUtil.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f29505a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f29506b;

    static {
        System.getenv("EXTERNAL_STORAGE");
        f29505a = System.getenv("SECONDARY_STORAGE");
        f29506b = System.getenv("EMULATED_STORAGE_TARGET");
    }

    public static String[] a(Context context) {
        File[] externalFilesDirs;
        String[] strArr;
        String[] split;
        HashSet hashSet = new HashSet();
        String str = f29506b;
        if (!TextUtils.isEmpty(str)) {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            String str2 = File.separator;
            String str3 = absolutePath.split(str2)[split.length - 1];
            str3 = (TextUtils.isEmpty(str3) || !TextUtils.isDigitsOnly(str3)) ? "" : "";
            if (!TextUtils.isEmpty(str3)) {
                str = f.m(str, str2, str3);
            }
            hashSet.add(str);
        } else {
            HashSet hashSet2 = new HashSet();
            for (File file : context.getExternalFilesDirs(null)) {
                if (file != null) {
                    String absolutePath2 = file.getAbsolutePath();
                    hashSet2.add(absolutePath2.substring(0, absolutePath2.indexOf("Android/data")));
                }
            }
            hashSet.addAll(hashSet2);
        }
        String str4 = f29505a;
        if (!TextUtils.isEmpty(str4)) {
            strArr = str4.split(File.pathSeparator);
        } else {
            strArr = new String[0];
        }
        Collections.addAll(hashSet, strArr);
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }
}
