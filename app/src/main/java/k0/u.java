package k0;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import g.a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: NotificationManagerCompat.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: d  reason: collision with root package name */
    public static String f19525d;

    /* renamed from: g  reason: collision with root package name */
    public static c f19528g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f19529a;

    /* renamed from: b  reason: collision with root package name */
    public final NotificationManager f19530b;
    public static final Object c = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static HashSet f19526e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public static final Object f19527f = new Object();

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final String f19531a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19532b;
        public final String c = null;

        /* renamed from: d  reason: collision with root package name */
        public final Notification f19533d;

        public a(int i10, Notification notification, String str) {
            this.f19531a = str;
            this.f19532b = i10;
            this.f19533d = notification;
        }

        @Override // k0.u.d
        public final void a(g.a aVar) {
            String str = this.c;
            aVar.F0(this.f19532b, this.f19533d, this.f19531a, str);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
            sb2.append(this.f19531a);
            sb2.append(", id:");
            sb2.append(this.f19532b);
            sb2.append(", tag:");
            return androidx.activity.r.g(sb2, this.c, "]");
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ComponentName f19534a;

        /* renamed from: b  reason: collision with root package name */
        public final IBinder f19535b;

        public b(ComponentName componentName, IBinder iBinder) {
            this.f19534a = componentName;
            this.f19535b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class c implements Handler.Callback, ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final Context f19536a;

        /* renamed from: b  reason: collision with root package name */
        public final Handler f19537b;
        public final HashMap c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        public HashSet f19538d = new HashSet();

        /* compiled from: NotificationManagerCompat.java */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ComponentName f19539a;
            public g.a c;

            /* renamed from: b  reason: collision with root package name */
            public boolean f19540b = false;

            /* renamed from: d  reason: collision with root package name */
            public final ArrayDeque<d> f19541d = new ArrayDeque<>();

            /* renamed from: e  reason: collision with root package name */
            public int f19542e = 0;

            public a(ComponentName componentName) {
                this.f19539a = componentName;
            }
        }

        public c(Context context) {
            this.f19536a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.f19537b = new Handler(handlerThread.getLooper(), this);
        }

        public final void a(a aVar) {
            boolean z10;
            boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
            ComponentName componentName = aVar.f19539a;
            ArrayDeque<d> arrayDeque = aVar.f19541d;
            if (isLoggable) {
                Objects.toString(componentName);
                arrayDeque.size();
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            if (aVar.f19540b) {
                z10 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f19536a;
                boolean bindService = context.bindService(component, this, 33);
                aVar.f19540b = bindService;
                if (bindService) {
                    aVar.f19542e = 0;
                } else {
                    Objects.toString(componentName);
                    context.unbindService(this);
                }
                z10 = aVar.f19540b;
            }
            if (z10 && aVar.c != null) {
                while (true) {
                    d peek = arrayDeque.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            peek.toString();
                        }
                        peek.a(aVar.c);
                        arrayDeque.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName);
                        }
                    } catch (RemoteException unused2) {
                        Objects.toString(componentName);
                    }
                }
                if (!arrayDeque.isEmpty()) {
                    b(aVar);
                    return;
                }
                return;
            }
            b(aVar);
        }

        public final void b(a aVar) {
            Handler handler = this.f19537b;
            ComponentName componentName = aVar.f19539a;
            if (handler.hasMessages(3, componentName)) {
                return;
            }
            int i10 = aVar.f19542e + 1;
            aVar.f19542e = i10;
            if (i10 > 6) {
                ArrayDeque<d> arrayDeque = aVar.f19541d;
                arrayDeque.size();
                Objects.toString(componentName);
                arrayDeque.clear();
                return;
            }
            Log.isLoggable("NotifManCompat", 3);
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << (i10 - 1)) * 1000);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            HashSet hashSet;
            int i10 = message.what;
            g.a aVar = null;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return false;
                        }
                        a aVar2 = (a) this.c.get((ComponentName) message.obj);
                        if (aVar2 != null) {
                            a(aVar2);
                        }
                        return true;
                    }
                    a aVar3 = (a) this.c.get((ComponentName) message.obj);
                    if (aVar3 != null) {
                        if (aVar3.f19540b) {
                            this.f19536a.unbindService(this);
                            aVar3.f19540b = false;
                        }
                        aVar3.c = null;
                    }
                    return true;
                }
                b bVar = (b) message.obj;
                ComponentName componentName = bVar.f19534a;
                IBinder iBinder = bVar.f19535b;
                a aVar4 = (a) this.c.get(componentName);
                if (aVar4 != null) {
                    int i11 = a.AbstractBinderC0224a.f17325a;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof g.a)) {
                            aVar = (g.a) queryLocalInterface;
                        } else {
                            aVar = new a.AbstractBinderC0224a.C0225a(iBinder);
                        }
                    }
                    aVar4.c = aVar;
                    aVar4.f19542e = 0;
                    a(aVar4);
                }
                return true;
            }
            d dVar = (d) message.obj;
            String string = Settings.Secure.getString(this.f19536a.getContentResolver(), "enabled_notification_listeners");
            synchronized (u.c) {
                if (string != null) {
                    try {
                        if (!string.equals(u.f19525d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            u.f19526e = hashSet2;
                            u.f19525d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = u.f19526e;
            }
            if (!hashSet.equals(this.f19538d)) {
                this.f19538d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f19536a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            componentName2.toString();
                        } else {
                            hashSet3.add(componentName2);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName3 = (ComponentName) it.next();
                    if (!this.c.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName3);
                        }
                        this.c.put(componentName3, new a(componentName3));
                    }
                }
                Iterator it2 = this.c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        a aVar5 = (a) entry.getValue();
                        if (aVar5.f19540b) {
                            this.f19536a.unbindService(this);
                            aVar5.f19540b = false;
                        }
                        aVar5.c = null;
                        it2.remove();
                    }
                }
            }
            for (a aVar6 : this.c.values()) {
                aVar6.f19541d.add(dVar);
                a(aVar6);
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f19537b.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f19537b.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(g.a aVar);
    }

    public u(Context context) {
        this.f19529a = context;
        this.f19530b = (NotificationManager) context.getSystemService("notification");
    }

    public static u d(Context context) {
        return new u(context);
    }

    public final boolean a() {
        boolean areNotificationsEnabled;
        if (Build.VERSION.SDK_INT >= 24) {
            areNotificationsEnabled = this.f19530b.areNotificationsEnabled();
            return areNotificationsEnabled;
        }
        Context context = this.f19529a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i10), packageName)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public final void b(int i10) {
        this.f19530b.cancel(null, i10);
    }

    public final void c(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f19530b.createNotificationChannel(notificationChannel);
        }
    }

    public final void e(int i10, Notification notification) {
        boolean z10;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            z10 = true;
        } else {
            z10 = false;
        }
        NotificationManager notificationManager = this.f19530b;
        if (z10) {
            a aVar = new a(i10, notification, this.f19529a.getPackageName());
            synchronized (f19527f) {
                if (f19528g == null) {
                    f19528g = new c(this.f19529a.getApplicationContext());
                }
                f19528g.f19537b.obtainMessage(0, aVar).sendToTarget();
            }
            notificationManager.cancel(null, i10);
            return;
        }
        notificationManager.notify(null, i10, notification);
    }
}
