package q9;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class f {
    public static void a(PackageManager packageManager, ComponentName componentName) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 516);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i10 = 0;
                    loop0: while (true) {
                        if (i10 < 3) {
                            ComponentInfo[] componentInfoArr2 = componentInfoArr[i10];
                            if (componentInfoArr2 != null) {
                                int length = componentInfoArr2.length;
                                for (int i11 = 0; i11 < length; i11++) {
                                    componentInfo = componentInfoArr2[i11];
                                    if (componentInfo.name.equals(className)) {
                                        break loop0;
                                    }
                                }
                                continue;
                            }
                            i10++;
                        } else {
                            componentInfo = null;
                            break;
                        }
                    }
                    if (componentInfo != null) {
                        if (componentInfo.isEnabled()) {
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }
}
