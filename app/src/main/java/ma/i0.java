package ma;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import oa.l;
import oa.m;
import sa.c;

/* compiled from: SessionReportingCoordinator.java */
/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final y f21907a;

    /* renamed from: b  reason: collision with root package name */
    public final ra.c f21908b;
    public final sa.a c;

    /* renamed from: d  reason: collision with root package name */
    public final na.c f21909d;

    /* renamed from: e  reason: collision with root package name */
    public final na.i f21910e;

    public i0(y yVar, ra.c cVar, sa.a aVar, na.c cVar2, na.i iVar) {
        this.f21907a = yVar;
        this.f21908b = cVar;
        this.c = aVar;
        this.f21909d = cVar2;
        this.f21910e = iVar;
    }

    public static oa.l a(oa.l lVar, na.c cVar, na.i iVar) {
        l.a aVar = new l.a(lVar);
        String b10 = cVar.f22374b.b();
        if (b10 != null) {
            aVar.f22984e = new oa.u(b10);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 2);
        }
        ArrayList c = c(iVar.f22395d.f22398a.getReference().a());
        ArrayList c10 = c(iVar.f22396e.f22398a.getReference().a());
        if (!c.isEmpty() || !c10.isEmpty()) {
            m.a f10 = lVar.c.f();
            f10.f22990b = new oa.c0<>(c);
            f10.c = new oa.c0<>(c10);
            aVar.c = f10.a();
        }
        return aVar.a();
    }

    public static i0 b(Context context, f0 f0Var, ra.d dVar, a aVar, na.c cVar, na.i iVar, ua.a aVar2, com.google.firebase.crashlytics.internal.settings.a aVar3, androidx.appcompat.widget.i iVar2) {
        y yVar = new y(context, f0Var, aVar, aVar2, aVar3);
        ra.c cVar2 = new ra.c(dVar, aVar3);
        pa.a aVar4 = sa.a.f29755b;
        v6.w.b(context);
        return new i0(yVar, cVar2, new sa.a(new sa.c(v6.w.a().c(new t6.a(sa.a.c, sa.a.f29756d)).a("FIREBASE_CRASHLYTICS_REPORT", new s6.b("json"), sa.a.f29757e), aVar3.b(), iVar2)), cVar, iVar);
    }

    public static ArrayList c(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new oa.e(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new t0.d(1));
        return arrayList;
    }

    public final void d(Throwable th2, Thread thread, String str, String str2, long j10, boolean z10) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        String str3;
        boolean z11;
        boolean equals = str2.equals("crash");
        y yVar = this.f21907a;
        Context context = yVar.f21957a;
        int i10 = context.getResources().getConfiguration().orientation;
        ua.b bVar = yVar.f21959d;
        v2.g gVar = new v2.g(th2, bVar);
        l.a aVar = new l.a();
        aVar.f22982b = str2;
        aVar.f22981a = Long.valueOf(j10);
        String str4 = yVar.c.f21867e;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        Boolean bool = null;
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                runningAppProcessInfo = it.next();
                if (runningAppProcessInfo.processName.equals(str4)) {
                    break;
                }
            }
        }
        runningAppProcessInfo = null;
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance != 100) {
                z11 = true;
            } else {
                z11 = false;
            }
            bool = Boolean.valueOf(z11);
        }
        Boolean bool2 = bool;
        Integer valueOf = Integer.valueOf(i10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(y.e(thread, (StackTraceElement[]) gVar.c, 4));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(y.e(key, bVar.f(entry.getValue()), 0));
                }
            }
        }
        oa.c0 c0Var = new oa.c0(arrayList);
        oa.p c = y.c(gVar, 0);
        Long l10 = 0L;
        String str5 = "";
        if (l10 != null) {
            str3 = "";
        } else {
            str3 = " address";
        }
        if (str3.isEmpty()) {
            oa.n nVar = new oa.n(c0Var, c, null, new oa.q(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES, PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES, l10.longValue()), yVar.a());
            if (valueOf == null) {
                str5 = "".concat(" uiOrientation");
            }
            if (str5.isEmpty()) {
                aVar.c = new oa.m(nVar, null, null, bool2, valueOf.intValue());
                aVar.f22983d = yVar.b(i10);
                this.f21908b.c(a(aVar.a(), this.f21909d, this.f21910e), str, equals);
                return;
            }
            throw new IllegalStateException("Missing required properties:".concat(str5));
        }
        throw new IllegalStateException("Missing required properties:".concat(str3));
    }

    public final d8.o e(String str, Executor executor) {
        boolean z10;
        TaskCompletionSource<z> taskCompletionSource;
        ArrayList b10 = this.f21908b.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b10.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                pa.a aVar = ra.c.f29490f;
                String d10 = ra.c.d(file);
                aVar.getClass();
                arrayList.add(new b(pa.a.h(d10), file.getName(), file));
            } catch (IOException unused) {
                Objects.toString(file);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            z zVar = (z) it2.next();
            if (str == null || str.equals(zVar.c())) {
                sa.a aVar2 = this.c;
                boolean z11 = true;
                if (str != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sa.c cVar = aVar2.f29758a;
                synchronized (cVar.f29766f) {
                    taskCompletionSource = new TaskCompletionSource<>();
                    if (z10) {
                        ((AtomicInteger) cVar.f29769i.f2600a).getAndIncrement();
                        if (cVar.f29766f.size() >= cVar.f29765e) {
                            z11 = false;
                        }
                        if (z11) {
                            zVar.c();
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            cVar.f29766f.size();
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            cVar.f29767g.execute(new c.a(zVar, taskCompletionSource));
                            zVar.c();
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            taskCompletionSource.d(zVar);
                        } else {
                            cVar.a();
                            zVar.c();
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            ((AtomicInteger) cVar.f29769i.f2601b).getAndIncrement();
                            taskCompletionSource.d(zVar);
                        }
                    } else {
                        cVar.b(zVar, taskCompletionSource);
                    }
                }
                arrayList2.add(taskCompletionSource.f11978a.g(executor, new a1.e(this, 5)));
            }
        }
        return Tasks.f(arrayList2);
    }
}
