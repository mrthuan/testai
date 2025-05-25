package y2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PackageManagerHelper.java */
/* loaded from: classes.dex */
public final class g {
    static {
        o2.h.e("PackageManagerHelper");
    }

    public static void a(Context context, Class<?> cls, boolean z10) {
        int i10;
        Object obj;
        String str = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i10, 1);
            o2.h c = o2.h.c();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z10) {
                obj = "enabled";
            } else {
                obj = "disabled";
            }
            objArr[1] = obj;
            String.format("%s %s", objArr);
            c.a(new Throwable[0]);
        } catch (Exception e10) {
            o2.h c10 = o2.h.c();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z10) {
                str = "disabled";
            }
            objArr2[1] = str;
            String.format("%s could not be %s", objArr2);
            c10.a(e10);
        }
    }
}
