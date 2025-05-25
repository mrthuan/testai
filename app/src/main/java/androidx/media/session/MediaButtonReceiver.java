package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* loaded from: classes.dex */
    public static class a extends MediaBrowserCompat.b {
        public final Context c;

        /* renamed from: d  reason: collision with root package name */
        public final Intent f4142d;

        /* renamed from: e  reason: collision with root package name */
        public final BroadcastReceiver.PendingResult f4143e;

        /* renamed from: f  reason: collision with root package name */
        public MediaBrowserCompat f4144f;

        public a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.c = context;
            this.f4142d = intent;
            this.f4143e = pendingResult;
        }

        public final void a() {
            Messenger messenger;
            MediaBrowserCompat.d dVar = this.f4144f.f1707a;
            MediaBrowserCompat.g gVar = dVar.f1719f;
            if (gVar != null && (messenger = dVar.f1720g) != null) {
                try {
                    gVar.a(7, null, messenger);
                } catch (RemoteException unused) {
                }
            }
            dVar.f1716b.disconnect();
            this.f4143e.finish();
        }
    }

    public static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            StringBuilder g10 = b.a.g("Expected 1 service that handles ", str, ", found ");
            g10.append(queryIntentServices.size());
            throw new IllegalStateException(g10.toString());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName a10 = a(context, "android.intent.action.MEDIA_BUTTON");
            if (a10 != null) {
                intent.setComponent(a10);
                if (Build.VERSION.SDK_INT >= 26) {
                    context.startForegroundService(intent);
                    return;
                } else {
                    context.startService(intent);
                    return;
                }
            }
            ComponentName a11 = a(context, "android.media.browse.MediaBrowserService");
            if (a11 != null) {
                BroadcastReceiver.PendingResult goAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                a aVar = new a(applicationContext, intent, goAsync);
                MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a11, aVar);
                aVar.f4144f = mediaBrowserCompat;
                mediaBrowserCompat.f1707a.f1716b.connect();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        Objects.toString(intent);
    }
}
