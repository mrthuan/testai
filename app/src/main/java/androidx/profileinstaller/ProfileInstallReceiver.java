package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.c;
import java.io.File;
import u.j;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        File codeCacheDir;
        Context createDeviceProtectedStorageContext;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            c.b(context, new t1.d(1), new a(), true);
        } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    a aVar = new a();
                    try {
                        c.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        new j(aVar, 10, null, 1).run();
                    } catch (PackageManager.NameNotFoundException e10) {
                        new j(aVar, 7, e10, 1).run();
                    }
                } else if ("DELETE_SKIP_FILE".equals(string)) {
                    a aVar2 = new a();
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    new j(aVar2, 11, null, 1).run();
                }
            }
        } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            if (Build.VERSION.SDK_INT >= 24) {
                Process.sendSignal(Process.myPid(), 10);
                setResultCode(12);
                return;
            }
            setResultCode(13);
        } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
            if ("DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
                if (Build.VERSION.SDK_INT >= 24) {
                    createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                    codeCacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
                } else {
                    codeCacheDir = context.getCodeCacheDir();
                }
                if (androidx.profileinstaller.a.a(codeCacheDir)) {
                    setResultCode(14);
                    return;
                } else {
                    setResultCode(15);
                    return;
                }
            }
            setResultCode(16);
        }
    }

    /* loaded from: classes.dex */
    public class a implements c.InterfaceC0021c {
        public a() {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0021c
        public final void b(int i10, Object obj) {
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Throwable th2 = (Throwable) obj;
            }
            ProfileInstallReceiver.this.setResultCode(i10);
        }

        @Override // androidx.profileinstaller.c.InterfaceC0021c
        public final void a() {
        }
    }
}
