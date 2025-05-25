package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.NetworkType;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o2.h;
import p2.j;
import x2.g;
import x2.i;
import x2.p;
import x2.r;

/* compiled from: CommandHandler.java */
/* loaded from: classes.dex */
public final class a implements p2.a {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f4934d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4935a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f4936b = new HashMap();
    public final Object c = new Object();

    static {
        h.e("CommandHandler");
    }

    public a(Context context) {
        this.f4935a = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // p2.a
    public final void b(String str, boolean z10) {
        synchronized (this.c) {
            p2.a aVar = (p2.a) this.f4936b.remove(str);
            if (aVar != null) {
                aVar.b(str, z10);
            }
        }
    }

    public final boolean d() {
        boolean z10;
        synchronized (this.c) {
            if (!this.f4936b.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(int i10, Intent intent, d dVar) {
        boolean z10;
        boolean z11;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h c = h.c();
            String.format("Handling constraints changed %s", intent);
            c.a(new Throwable[0]);
            b bVar = new b(this.f4935a, i10, dVar);
            ArrayList e10 = ((r) dVar.f4952e.c.p()).e();
            int i11 = ConstraintProxy.f4929a;
            Iterator it = e10.iterator();
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            while (it.hasNext()) {
                o2.b bVar2 = ((p) it.next()).f31566j;
                z12 |= bVar2.f22671d;
                z13 |= bVar2.f22670b;
                z14 |= bVar2.f22672e;
                if (bVar2.f22669a != NetworkType.NOT_REQUIRED) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z15 |= z11;
                if (z12 && z13 && z14 && z15) {
                    break;
                }
            }
            int i12 = ConstraintProxyUpdateReceiver.f4930a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = bVar.f4938a;
            intent2.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z13).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z14).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z15);
            context.sendBroadcast(intent2);
            t2.d dVar2 = bVar.c;
            dVar2.c(e10);
            ArrayList arrayList = new ArrayList(e10.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = e10.iterator();
            while (it2.hasNext()) {
                p pVar = (p) it2.next();
                String str = pVar.f31558a;
                if (currentTimeMillis >= pVar.a() && (!pVar.b() || dVar2.a(str))) {
                    arrayList.add(pVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str2 = ((p) it3.next()).f31558a;
                Intent a10 = a(context, str2);
                h c10 = h.c();
                String.format("Creating a delay_met command for workSpec with id (%s)", str2);
                int i13 = b.f4937d;
                c10.a(new Throwable[0]);
                dVar.f(new d.b(bVar.f4939b, a10, dVar));
            }
            dVar2.d();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            h c11 = h.c();
            String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10));
            c11.a(new Throwable[0]);
            dVar.f4952e.h();
        } else {
            Bundle extras = intent.getExtras();
            String[] strArr = {"KEY_WORKSPEC_ID"};
            if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                h c12 = h.c();
                String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID");
                c12.b(new Throwable[0]);
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
                h c13 = h.c();
                String.format("Handling schedule work for %s", string);
                c13.a(new Throwable[0]);
                WorkDatabase workDatabase = dVar.f4952e.c;
                workDatabase.c();
                try {
                    p i14 = ((r) workDatabase.p()).i(string);
                    if (i14 == null) {
                        h.c().f(new Throwable[0]);
                    } else if (i14.f31559b.isFinished()) {
                        h.c().f(new Throwable[0]);
                    } else {
                        long a11 = i14.a();
                        boolean b10 = i14.b();
                        Context context2 = this.f4935a;
                        j jVar = dVar.f4952e;
                        if (!b10) {
                            h c14 = h.c();
                            String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a11));
                            c14.a(new Throwable[0]);
                            r2.a.b(context2, jVar, string, a11);
                        } else {
                            h c15 = h.c();
                            String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a11));
                            c15.a(new Throwable[0]);
                            r2.a.b(context2, jVar, string, a11);
                            Intent intent3 = new Intent(context2, SystemAlarmService.class);
                            intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                            dVar.f(new d.b(i10, intent3, dVar));
                        }
                        workDatabase.j();
                    }
                } finally {
                    workDatabase.g();
                }
            } else if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.c) {
                    String string2 = extras2.getString("KEY_WORKSPEC_ID");
                    h c16 = h.c();
                    String.format("Handing delay met for %s", string2);
                    c16.a(new Throwable[0]);
                    if (!this.f4936b.containsKey(string2)) {
                        c cVar = new c(this.f4935a, i10, string2, dVar);
                        this.f4936b.put(string2, cVar);
                        cVar.e();
                    } else {
                        h c17 = h.c();
                        String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2);
                        c17.a(new Throwable[0]);
                    }
                }
            } else if ("ACTION_STOP_WORK".equals(action)) {
                String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
                h c18 = h.c();
                String.format("Handing stopWork work for %s", string3);
                c18.a(new Throwable[0]);
                dVar.f4952e.j(string3);
                int i15 = r2.a.f29435a;
                i iVar = (i) dVar.f4952e.c.m();
                g a12 = iVar.a(string3);
                if (a12 != null) {
                    r2.a.a(this.f4935a, a12.f31546b, string3);
                    h c19 = h.c();
                    String.format("Removing SystemIdInfo for workSpecId (%s)", string3);
                    c19.a(new Throwable[0]);
                    iVar.b(string3);
                }
                dVar.b(string3, false);
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                Bundle extras3 = intent.getExtras();
                String string4 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z16 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                h c20 = h.c();
                String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10));
                c20.a(new Throwable[0]);
                b(string4, z16);
            } else {
                h c21 = h.c();
                String.format("Ignoring intent %s", intent);
                c21.f(new Throwable[0]);
            }
        }
    }
}
