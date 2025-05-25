package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import o2.h;
import p2.j;
import s0.a;
import y2.i;

/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public static final long f4977d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4978a;

    /* renamed from: b  reason: collision with root package name */
    public final j f4979b;
    public int c = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        static {
            h.e("ForceStopRunnable$Rcvr");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                int i10 = ((h.a) h.c()).f22686b;
                ForceStopRunnable.c(context);
            }
        }
    }

    static {
        h.e("ForceStopRunnable");
        f4977d = TimeUnit.DAYS.toMillis(3650L);
    }

    public ForceStopRunnable(Context context, j jVar) {
        this.f4978a = context.getApplicationContext();
        this.f4979b = jVar;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void c(Context context) {
        int i10;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (a.a()) {
            i10 = 167772160;
        } else {
            i10 = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long currentTimeMillis = System.currentTimeMillis() + f4977d;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x008b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.a():void");
    }

    public final boolean b() {
        androidx.work.a aVar = this.f4979b.f23628b;
        aVar.getClass();
        if (TextUtils.isEmpty(null)) {
            h.c().a(new Throwable[0]);
            return true;
        }
        boolean a10 = i.a(this.f4978a, aVar);
        h c = h.c();
        String.format("Is default app process = %s", Boolean.valueOf(a10));
        c.a(new Throwable[0]);
        return a10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f4979b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                p2.i.a(this.f4978a);
                h.c().a(new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                    int i10 = this.c + 1;
                    this.c = i10;
                    if (i10 < 3) {
                        h c = h.c();
                        String.format("Retrying after %s", Long.valueOf(i10 * 300));
                        c.a(e10);
                        try {
                            Thread.sleep(this.c * 300);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        h.c().b(e10);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        jVar.f23628b.getClass();
                        throw illegalStateException;
                    }
                }
            }
        } finally {
            jVar.g();
        }
    }
}
