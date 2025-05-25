package jb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;

/* compiled from: FcmBroadcastProcessor.java */
@KeepForSdk
/* loaded from: classes2.dex */
public final class j {
    public static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static com.google.firebase.messaging.c f19134d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f19135a;

    /* renamed from: b  reason: collision with root package name */
    public final t1.d f19136b = new t1.d(2);

    public j(Context context) {
        this.f19135a = context;
    }

    public static d8.o a(Context context, final Intent intent) {
        Log.isLoggable("FirebaseMessaging", 3);
        if (w.a().c(context)) {
            com.google.firebase.messaging.c b10 = b(context);
            synchronized (f0.f19127b) {
                f0.a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f0.c.a(f0.f19126a);
                }
                b10.b(intent).b(new OnCompleteListener() { // from class: jb.e0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        f0.b(intent);
                    }
                });
            }
        } else {
            b(context).b(intent);
        }
        return Tasks.e(-1);
    }

    public static com.google.firebase.messaging.c b(Context context) {
        com.google.firebase.messaging.c cVar;
        synchronized (c) {
            if (f19134d == null) {
                f19134d = new com.google.firebase.messaging.c(context);
            }
            cVar = f19134d;
        }
        return cVar;
    }

    @KeepForSdk
    public final Task<Integer> c(final Intent intent) {
        boolean z10;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z11 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean a10 = PlatformVersion.a();
        final Context context = this.f19135a;
        if (a10 && context.getApplicationInfo().targetSdkVersion >= 26) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z11 = true;
        }
        if (z10 && !z11) {
            return a(context, intent);
        }
        Callable callable = new Callable() { // from class: jb.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i10;
                ComponentName startService;
                Context context2 = context;
                Intent intent2 = intent;
                w a11 = w.a();
                a11.getClass();
                Log.isLoggable("FirebaseMessaging", 3);
                a11.f19161d.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (a11) {
                    str = a11.f19159a;
                    if (str == null) {
                        ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                            if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                if (str2.startsWith(".")) {
                                    a11.f19159a = context2.getPackageName() + serviceInfo.name;
                                } else {
                                    a11.f19159a = serviceInfo.name;
                                }
                                str = a11.f19159a;
                            }
                            str = null;
                        }
                        str = null;
                    }
                }
                if (str != null) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (a11.c(context2)) {
                        startService = f0.c(context2, intent3);
                    } else {
                        startService = context2.startService(intent3);
                    }
                    if (startService == null) {
                        i10 = TTAdConstant.DEEPLINK_FALLBACK_CODE;
                    } else {
                        i10 = -1;
                    }
                } catch (IllegalStateException e10) {
                    e10.toString();
                    i10 = TTAdConstant.AD_ID_IS_NULL_CODE;
                } catch (SecurityException unused) {
                    i10 = TTAdConstant.MATE_IS_NULL_CODE;
                }
                return Integer.valueOf(i10);
            }
        };
        t1.d dVar = this.f19136b;
        return Tasks.c(callable, dVar).i(dVar, new c5.b(2, context, intent));
    }
}
