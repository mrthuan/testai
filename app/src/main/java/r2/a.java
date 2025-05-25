package r2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import o2.h;
import p2.j;
import x2.d;
import x2.g;
import x2.i;
import y2.f;

/* compiled from: Alarms.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f29435a = 0;

    static {
        h.e("Alarms");
    }

    public static void a(Context context, int i10, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.a(context, str), 603979776);
        if (service != null && alarmManager != null) {
            h c = h.c();
            String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10));
            c.a(new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, j jVar, String str, long j10) {
        int i10;
        int i11;
        WorkDatabase workDatabase = jVar.c;
        i iVar = (i) workDatabase.m();
        g a10 = iVar.a(str);
        if (a10 != null) {
            a(context, a10.f31546b, str);
            int i12 = a10.f31546b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i12, androidx.work.impl.background.systemalarm.a.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j10, service);
                return;
            }
            return;
        }
        synchronized (f.class) {
            workDatabase.c();
            Long a11 = ((x2.f) workDatabase.l()).a("next_alarm_manager_id");
            if (a11 != null) {
                i10 = a11.intValue();
            } else {
                i10 = 0;
            }
            if (i10 == Integer.MAX_VALUE) {
                i11 = 0;
            } else {
                i11 = i10 + 1;
            }
            ((x2.f) workDatabase.l()).b(new d("next_alarm_manager_id", i11));
            workDatabase.j();
            workDatabase.g();
        }
        g gVar = new g(str, i10);
        RoomDatabase roomDatabase = iVar.f31547a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            iVar.f31548b.e(gVar);
            roomDatabase.j();
            roomDatabase.g();
            AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service2 = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.a(context, str), 201326592);
            if (alarmManager2 != null) {
                alarmManager2.setExact(0, j10, service2);
            }
        } catch (Throwable th2) {
            roomDatabase.g();
            throw th2;
        }
    }
}
