package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o2.h;
import p2.j;
import t2.c;
import t2.d;
import w2.e;
import x2.p;
import y2.l;
import z2.b;

/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes.dex */
public final class a implements c, p2.a {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f4967k = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4968a;

    /* renamed from: b  reason: collision with root package name */
    public final j f4969b;
    public final z2.a c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f4970d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public String f4971e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f4972f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f4973g;

    /* renamed from: h  reason: collision with root package name */
    public final HashSet f4974h;

    /* renamed from: i  reason: collision with root package name */
    public final d f4975i;

    /* renamed from: j  reason: collision with root package name */
    public InterfaceC0029a f4976j;

    /* compiled from: SystemForegroundDispatcher.java */
    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0029a {
    }

    static {
        h.e("SystemFgDispatcher");
    }

    public a(Context context) {
        this.f4968a = context;
        j e10 = j.e(context);
        this.f4969b = e10;
        z2.a aVar = e10.f23629d;
        this.c = aVar;
        this.f4971e = null;
        this.f4972f = new LinkedHashMap();
        this.f4974h = new HashSet();
        this.f4973g = new HashMap();
        this.f4975i = new d(context, aVar, this);
        e10.f23631f.a(this);
    }

    public static Intent a(Context context, String str, o2.d dVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", dVar.f22682a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", dVar.f22683b);
        intent.putExtra("KEY_NOTIFICATION", dVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, o2.d dVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", dVar.f22682a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", dVar.f22683b);
        intent.putExtra("KEY_NOTIFICATION", dVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // p2.a
    public final void b(String str, boolean z10) {
        boolean z11;
        Map.Entry entry;
        synchronized (this.f4970d) {
            try {
                p pVar = (p) this.f4973g.remove(str);
                if (pVar != null) {
                    z11 = this.f4974h.remove(pVar);
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.f4975i.c(this.f4974h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        o2.d dVar = (o2.d) this.f4972f.remove(str);
        if (str.equals(this.f4971e) && this.f4972f.size() > 0) {
            Iterator it = this.f4972f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f4971e = (String) entry.getKey();
            if (this.f4976j != null) {
                o2.d dVar2 = (o2.d) entry.getValue();
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f4976j;
                systemForegroundService.f4964b.post(new w2.c(systemForegroundService, dVar2.f22682a, dVar2.c, dVar2.f22683b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f4976j;
                systemForegroundService2.f4964b.post(new e(systemForegroundService2, dVar2.f22682a));
            }
        }
        InterfaceC0029a interfaceC0029a = this.f4976j;
        if (dVar != null && interfaceC0029a != null) {
            h c = h.c();
            String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(dVar.f22682a), str, Integer.valueOf(dVar.f22683b));
            c.a(new Throwable[0]);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC0029a;
            systemForegroundService3.f4964b.post(new e(systemForegroundService3, dVar.f22682a));
        }
    }

    @Override // t2.c
    public final void d(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                h c = h.c();
                String.format("Constraints unmet for WorkSpec %s", str);
                c.a(new Throwable[0]);
                j jVar = this.f4969b;
                ((b) jVar.f23629d).a(new l(jVar, str, true));
            }
        }
    }

    public final void e(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        h c = h.c();
        String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2));
        c.a(new Throwable[0]);
        if (notification != null && this.f4976j != null) {
            o2.d dVar = new o2.d(intExtra, intExtra2, notification);
            LinkedHashMap linkedHashMap = this.f4972f;
            linkedHashMap.put(stringExtra, dVar);
            if (TextUtils.isEmpty(this.f4971e)) {
                this.f4971e = stringExtra;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f4976j;
                systemForegroundService.f4964b.post(new w2.c(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f4976j;
            systemForegroundService2.f4964b.post(new w2.d(systemForegroundService2, intExtra, notification));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    i10 |= ((o2.d) entry.getValue()).f22683b;
                }
                o2.d dVar2 = (o2.d) linkedHashMap.get(this.f4971e);
                if (dVar2 != null) {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.f4976j;
                    systemForegroundService3.f4964b.post(new w2.c(systemForegroundService3, dVar2.f22682a, dVar2.c, i10));
                }
            }
        }
    }

    @Override // t2.c
    public final void f(List<String> list) {
    }
}
