package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Tasks;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import d8.o;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q7.d;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f10834a;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    /* loaded from: classes.dex */
    public static final class IntentActionKeys {
        private IntentActionKeys() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    /* loaded from: classes.dex */
    public static final class IntentKeys {
        private IntentKeys() {
        }
    }

    public CloudMessagingReceiver() {
        com.google.android.gms.internal.cloudmessaging.zze.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f10834a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public abstract int a(Context context, CloudMessage cloudMessage);

    public final int c(Context context, Intent intent) {
        o c;
        if (intent.getExtras() == null) {
            return OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            c = Tasks.e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            zzs a10 = zzs.a(context);
            c = a10.c(new d(a10.b(), bundle));
        }
        int a11 = a(context, new CloudMessage(intent));
        try {
            Tasks.b(c, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            new StringBuilder(String.valueOf(e10).length() + 20);
        }
        return a11;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        this.f10834a.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zze
            @Override // java.lang.Runnable
            public final void run() {
                Intent intent2;
                int c;
                Intent intent3 = intent;
                BroadcastReceiver.PendingResult pendingResult = goAsync;
                CloudMessagingReceiver cloudMessagingReceiver = CloudMessagingReceiver.this;
                cloudMessagingReceiver.getClass();
                try {
                    Parcelable parcelableExtra = intent3.getParcelableExtra("wrapped_intent");
                    if (parcelableExtra instanceof Intent) {
                        intent2 = (Intent) parcelableExtra;
                    } else {
                        intent2 = null;
                    }
                    Context context2 = context;
                    if (intent2 != null) {
                        PendingIntent pendingIntent = (PendingIntent) intent2.getParcelableExtra("pending_intent");
                        if (pendingIntent != null) {
                            try {
                                pendingIntent.send();
                            } catch (PendingIntent.CanceledException unused) {
                            }
                        }
                        Bundle extras = intent2.getExtras();
                        if (extras != null) {
                            extras.remove("pending_intent");
                        } else {
                            extras = new Bundle();
                        }
                        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent2.getAction())) {
                            cloudMessagingReceiver.b(extras);
                            c = -1;
                        } else {
                            c = OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM;
                        }
                    } else {
                        c = cloudMessagingReceiver.c(context2, intent3);
                    }
                    if (isOrderedBroadcast) {
                        pendingResult.setResultCode(c);
                    }
                } finally {
                    pendingResult.finish();
                }
            }
        });
    }

    public void b(Bundle bundle) {
    }
}
