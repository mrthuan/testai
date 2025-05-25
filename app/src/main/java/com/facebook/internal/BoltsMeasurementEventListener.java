package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Set;
import kotlin.text.Regex;

/* compiled from: BoltsMeasurementEventListener.kt */
/* loaded from: classes.dex */
public final class BoltsMeasurementEventListener extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static BoltsMeasurementEventListener f9730b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9731a;

    /* compiled from: BoltsMeasurementEventListener.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Context context) {
            if (BoltsMeasurementEventListener.a() != null) {
                BoltsMeasurementEventListener.a();
                return;
            }
            BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context);
            if (!k6.a.b(BoltsMeasurementEventListener.class)) {
                try {
                    if (!k6.a.b(boltsMeasurementEventListener)) {
                        p1.a a10 = p1.a.a(boltsMeasurementEventListener.f9731a);
                        kotlin.jvm.internal.g.d(a10, "getInstance(applicationContext)");
                        a10.b(boltsMeasurementEventListener, new IntentFilter("com.parse.bolts.measurement_event"));
                    }
                } catch (Throwable th2) {
                    k6.a.a(BoltsMeasurementEventListener.class, th2);
                }
            }
            if (!k6.a.b(BoltsMeasurementEventListener.class)) {
                try {
                    BoltsMeasurementEventListener.f9730b = boltsMeasurementEventListener;
                } catch (Throwable th3) {
                    k6.a.a(BoltsMeasurementEventListener.class, th3);
                }
            }
            BoltsMeasurementEventListener.a();
        }
    }

    public BoltsMeasurementEventListener(Context context) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.g.d(applicationContext, "context.applicationContext");
        this.f9731a = applicationContext;
    }

    public static final /* synthetic */ BoltsMeasurementEventListener a() {
        if (k6.a.b(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return f9730b;
        } catch (Throwable th2) {
            k6.a.a(BoltsMeasurementEventListener.class, th2);
            return null;
        }
    }

    public final void finalize() {
        if (k6.a.b(this)) {
            return;
        }
        try {
            if (!k6.a.b(this)) {
                p1.a a10 = p1.a.a(this.f9731a);
                kotlin.jvm.internal.g.d(a10, "getInstance(applicationContext)");
                a10.d(this);
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        Bundle bundle;
        if (k6.a.b(this)) {
            return;
        }
        try {
            Set<String> set = null;
            com.facebook.appevents.l lVar = new com.facebook.appevents.l(context, (String) null);
            StringBuilder sb2 = new StringBuilder("bf_");
            if (intent != null) {
                str = intent.getStringExtra("event_name");
            } else {
                str = null;
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            if (intent != null) {
                bundle = intent.getBundleExtra("event_args");
            } else {
                bundle = null;
            }
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                set = bundle.keySet();
            }
            if (set != null) {
                for (String key : set) {
                    kotlin.jvm.internal.g.d(key, "key");
                    bundle2.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(key, "-"), ""), ""), (String) bundle.get(key));
                }
            }
            com.facebook.d dVar = com.facebook.d.f9685a;
            if (com.facebook.n.c()) {
                lVar.d(bundle2, sb3);
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
