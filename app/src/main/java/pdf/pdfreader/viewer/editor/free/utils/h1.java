package pdf.pdfreader.viewer.editor.free.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.hpsf.Variant;
import x0.t0;

/* compiled from: SystemUtils.java */
/* loaded from: classes3.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    public static String f28703a;

    public static void a(Activity activity, boolean z10) {
        Window window;
        if (com.google.android.play.core.assetpacks.c.W(activity) && (window = activity.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (Build.VERSION.SDK_INT >= 28) {
                if (z10) {
                    attributes.layoutInDisplayCutoutMode = 0;
                } else {
                    attributes.layoutInDisplayCutoutMode = 2;
                }
            }
            window.setAttributes(attributes);
        }
    }

    public static boolean b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getApplicationInfo(str, 8192);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    public static void d(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo == null) {
            return;
        }
        Intent intent = new Intent(ea.a.p("KW4ccj9pBi4hbhJlWnR5YVt0O28nLntBPU4=", "fcHxPbDK"), (Uri) null);
        intent.addCategory(ea.a.p("Um4vchxpBi4bbkBlB3R4YyV0V2cpcjoufkE9ThRIJFI=", "2hWati2V"));
        intent.setPackage(packageInfo.packageName);
        ResolveInfo next = context.getPackageManager().queryIntentActivities(intent, 0).iterator().next();
        if (next != null) {
            ActivityInfo activityInfo = next.activityInfo;
            String str2 = activityInfo.packageName;
            String str3 = activityInfo.name;
            Intent intent2 = new Intent(ea.a.p("Cm4rcllpFC4hbhJlWnR5YVt0O28nLntBPU4=", "sJkO6pkq"));
            intent2.addCategory(ea.a.p("Lm5VchZpUy4zbj5lG3RGY1R0C2cqchwuJUECTipIIlI=", "vvQoiWig"));
            intent2.addFlags(268435456);
            intent2.addFlags(Variant.VT_RESERVED);
            intent2.setComponent(new ComponentName(str2, str3));
            context.startActivity(intent2);
        }
    }

    public static boolean e(Context context) {
        return ((ActivityManager) context.getSystemService(ea.a.p("UmM_aQVpFnk=", "kSdYRUqm"))).isLowRamDevice();
    }

    public static void f(int i10, Activity activity, boolean z10, boolean z11) {
        Window window;
        if (com.google.android.play.core.assetpacks.c.W(activity) && (window = activity.getWindow()) != null) {
            a(activity, true);
            pdf.pdfreader.viewer.editor.free.utils.extension.i.g(window, i10, i10);
            pdf.pdfreader.viewer.editor.free.utils.extension.i.h(window, !z10);
            if (z11) {
                View decorView = window.getDecorView();
                kotlin.jvm.internal.g.d(decorView, ea.a.p("AWUWbzVWHmV3", "t8euGwHB"));
                pdf.pdfreader.viewer.editor.free.utils.extension.i.d(window, decorView, new Integer[]{1}, new Integer[]{2});
                return;
            }
            View decorView2 = window.getDecorView();
            kotlin.jvm.internal.g.d(decorView2, ea.a.p("AWUWbzVWHmV3", "t8euGwHB"));
            pdf.pdfreader.viewer.editor.free.utils.extension.i.d(window, decorView2, new Integer[]{1, 2}, new Integer[0]);
        }
    }

    public static void g(Activity activity, int i10, boolean z10) {
        Window window;
        if (activity == null || activity.isFinishing() || (window = activity.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        int i12 = 5380;
        window.getDecorView().setSystemUiVisibility(5380);
        window.setStatusBarColor(0);
        if (i11 >= 27) {
            window.setNavigationBarColor(i10);
        } else {
            window.addFlags(134217728);
        }
        if (i11 >= 30) {
            x0.t0 h10 = x0.f0.h(window.getDecorView());
            if (h10 != null) {
                h10.b(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(activity));
                t0.e eVar = h10.f31527a;
                eVar.e(2);
                h10.a(1);
                if (z10) {
                    eVar.f(2);
                } else {
                    h10.a(2);
                }
            }
        } else if (z10) {
            if (i11 >= 26 && !pdf.pdfreader.viewer.editor.free.utils.extension.c.h(activity)) {
                i12 = 5396;
            }
            window.clearFlags(1024);
            window.getDecorView().setSystemUiVisibility(i12 & (-515));
        } else {
            window.addFlags(1024);
            window.getDecorView().setSystemUiVisibility(5894);
        }
    }

    public static void h(Context context) {
        boolean z10;
        boolean z11;
        String str;
        ActivityInfo activityInfo;
        int i10;
        try {
            Intent intent = new Intent(ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLiJFGV8ITwJUdk5U", "ArKBMKL3"));
            intent.setType(ea.a.p("GS8q", "hvxR5yBS"));
            intent.addCategory(ea.a.p("Um4vchxpBi4bbkBlB3R4YyV0V2cpcjouA1B9TglCeUU=", "L8H5swax"));
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            HashSet hashSet = new HashSet();
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                z10 = true;
                z11 = false;
                if (it.hasNext()) {
                    ActivityInfo activityInfo2 = it.next().activityInfo;
                    if (activityInfo2 != null) {
                        str = activityInfo2.packageName;
                        if (!TextUtils.isEmpty(str) && !hashSet.contains(str)) {
                            hashSet.add(str);
                            if (str.toLowerCase().contains(ea.a.p("MmlUZQ==", "o9T8HmKg"))) {
                                i10 = 10;
                            } else {
                                i10 = 0;
                            }
                            String str2 = activityInfo2.name;
                            if (str2 != null && str2.toLowerCase().contains(ea.a.p("EWk8ZQ==", "UHwPhqbG"))) {
                                i10 += 10;
                            }
                            ApplicationInfo applicationInfo = activityInfo2.applicationInfo;
                            if (applicationInfo != null && (applicationInfo.flags & 1) != 0) {
                                i10 += 40;
                            }
                            if (str.startsWith(ea.a.p("LG9cLhhuU3I1aWQ=", "ToADdYgI"))) {
                                i10--;
                            }
                            if (i10 >= 50) {
                                break;
                            }
                        }
                    }
                } else {
                    str = null;
                    break;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                Intent intent2 = new Intent(ea.a.p("JG4ucjhpJy4hbhJlWnR5YVt0O28nLntBPU4=", "FREJWC1H"));
                intent2.addCategory(ea.a.p("Lm5VchZpUy4zbj5lG3RGY1R0C2cqchwuDUE8TnBILFI=", "vxQCAi3i"));
                intent2.setPackage(str);
                try {
                    List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(intent2, 0);
                    if (queryIntentActivities2.size() > 0 && (activityInfo = queryIntentActivities2.get(0).activityInfo) != null) {
                        intent2.setClassName(activityInfo.packageName, activityInfo.name);
                        intent2.addFlags(268435456);
                        context.startActivity(intent2);
                    } else {
                        z10 = false;
                    }
                    z11 = z10;
                } catch (Exception unused) {
                }
            }
            if (!z11) {
                Intent intent3 = new Intent(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLg5BfE4=", "5DEB39EC"));
                intent3.setFlags(67108864);
                intent3.addCategory(ea.a.p("FW4BchppXS4hbhJlWnR5Y1l0N2cmck8uPE88RQ==", "esteu9i1"));
                startActivity(context, intent3);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void i(jl.a aVar) {
        try {
            Intent intent = new Intent();
            intent.setAction(ea.a.p("UG4scitpVy47ZRJ0XW4wcxZBAlAFSXVBIEk-Tg5EB1RwSQRTG1N2VBxJKEdT", "G31HD3I6"));
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            intent.setData(Uri.fromParts(ea.a.p("Q2EoaxJnZQ==", "vCfvag4a"), ea.a.p("R2QzLiJkCXItYQJlRi4haV13N3JnZVJpAG8DLjdyJ2U=", "Yx7URoLY"), null));
            startActivity(aVar, intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void startActivity(Context context, Intent intent) {
        if (context == null) {
            return;
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }
}
