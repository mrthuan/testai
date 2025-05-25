package k0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* compiled from: NavUtils.java */
/* loaded from: classes.dex */
public final class l {

    /* compiled from: NavUtils.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Intent a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        public static boolean b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        public static boolean c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    public static Intent a(Activity activity) {
        Intent a10 = a.a(activity);
        if (a10 != null) {
            return a10;
        }
        try {
            String c = c(activity, activity.getComponentName());
            if (c == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, c);
            try {
                if (c(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static Intent b(Context context, ComponentName componentName) {
        String c = c(context, componentName);
        if (c == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), c);
        if (c(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String c(Context context, ComponentName componentName) {
        int i10;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            i10 = 269222528;
        } else if (i11 >= 24) {
            i10 = 787072;
        } else {
            i10 = 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i10);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }
}
