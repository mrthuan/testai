package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import d8.n;
import d8.o;
import ja.d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import ma.a0;
import ma.f0;
import ma.g;
import ma.i0;
import ma.j;
import ma.j0;
import ma.s;
import na.i;
import oa.b;
import oa.b0;
import oa.h;
import oa.k;
import oa.v;
import oa.x;
import oa.y;
import oa.z;
import ra.d;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: r  reason: collision with root package name */
    public static final j f13516r = new j();

    /* renamed from: a  reason: collision with root package name */
    public final Context f13517a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f13518b;
    public final w4.a c;

    /* renamed from: d  reason: collision with root package name */
    public final i f13519d;

    /* renamed from: e  reason: collision with root package name */
    public final g f13520e;

    /* renamed from: f  reason: collision with root package name */
    public final f0 f13521f;

    /* renamed from: g  reason: collision with root package name */
    public final d f13522g;

    /* renamed from: h  reason: collision with root package name */
    public final ma.a f13523h;

    /* renamed from: i  reason: collision with root package name */
    public final na.c f13524i;

    /* renamed from: j  reason: collision with root package name */
    public final ja.a f13525j;

    /* renamed from: k  reason: collision with root package name */
    public final ka.a f13526k;

    /* renamed from: l  reason: collision with root package name */
    public final i0 f13527l;

    /* renamed from: m  reason: collision with root package name */
    public c f13528m;

    /* renamed from: n  reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f13529n = new TaskCompletionSource<>();

    /* renamed from: o  reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f13530o = new TaskCompletionSource<>();

    /* renamed from: p  reason: collision with root package name */
    public final TaskCompletionSource<Void> f13531p = new TaskCompletionSource<>();

    /* renamed from: q  reason: collision with root package name */
    public final AtomicBoolean f13532q = new AtomicBoolean(false);

    public b(Context context, g gVar, f0 f0Var, a0 a0Var, d dVar, w4.a aVar, ma.a aVar2, i iVar, na.c cVar, i0 i0Var, ja.a aVar3, ka.a aVar4) {
        this.f13517a = context;
        this.f13520e = gVar;
        this.f13521f = f0Var;
        this.f13518b = a0Var;
        this.f13522g = dVar;
        this.c = aVar;
        this.f13523h = aVar2;
        this.f13519d = iVar;
        this.f13524i = cVar;
        this.f13525j = aVar3;
        this.f13526k = aVar4;
        this.f13527l = i0Var;
    }

    public static void a(b bVar, String str) {
        int i10;
        Integer num;
        bVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Log.isLoggable("FirebaseCrashlytics", 3);
        Locale locale = Locale.US;
        String format = String.format(locale, "Crashlytics Android SDK/%s", "18.3.6");
        f0 f0Var = bVar.f13521f;
        String str2 = f0Var.c;
        ma.a aVar = bVar.f13523h;
        y yVar = new y(str2, aVar.f21868f, aVar.f21869g, f0Var.c(), DeliveryMechanism.determineFrom(aVar.f21866d).getId(), aVar.f21870h);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.CODENAME;
        oa.a0 a0Var = new oa.a0(str3, str4, CommonUtils.j());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        int ordinal = CommonUtils.Architecture.getValue().ordinal();
        String str5 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long g10 = CommonUtils.g();
        boolean i11 = CommonUtils.i();
        int d10 = CommonUtils.d();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        bVar.f13525j.c(str, format, currentTimeMillis, new x(yVar, a0Var, new z(ordinal, str5, availableProcessors, g10, blockCount, i11, d10, str6, str7)));
        bVar.f13524i.a(str);
        i0 i0Var = bVar.f13527l;
        ma.y yVar2 = i0Var.f21907a;
        yVar2.getClass();
        Charset charset = b0.f22909a;
        b.a aVar2 = new b.a();
        aVar2.f22901a = "18.3.6";
        ma.a aVar3 = yVar2.c;
        String str8 = aVar3.f21864a;
        if (str8 != null) {
            aVar2.f22902b = str8;
            f0 f0Var2 = yVar2.f21958b;
            String c = f0Var2.c();
            if (c != null) {
                aVar2.f22903d = c;
                String str9 = aVar3.f21868f;
                if (str9 != null) {
                    aVar2.f22904e = str9;
                    String str10 = aVar3.f21869g;
                    if (str10 != null) {
                        aVar2.f22905f = str10;
                        aVar2.c = 4;
                        h.a aVar4 = new h.a();
                        aVar4.f22948e = Boolean.FALSE;
                        aVar4.c = Long.valueOf(currentTimeMillis);
                        if (str != null) {
                            aVar4.f22946b = str;
                            String str11 = ma.y.f21956g;
                            if (str11 != null) {
                                aVar4.f22945a = str11;
                                String str12 = f0Var2.c;
                                if (str12 != null) {
                                    String c10 = f0Var2.c();
                                    ja.d dVar = aVar3.f21870h;
                                    if (dVar.f19075b == null) {
                                        dVar.f19075b = new d.a(dVar);
                                    }
                                    d.a aVar5 = dVar.f19075b;
                                    String str13 = aVar5.f19076a;
                                    if (aVar5 == null) {
                                        dVar.f19075b = new d.a(dVar);
                                    }
                                    aVar4.f22949f = new oa.i(str12, str9, str10, c10, str13, dVar.f19075b.f19077b);
                                    v.a aVar6 = new v.a();
                                    aVar6.f23033a = 3;
                                    aVar6.f23034b = str3;
                                    aVar6.c = str4;
                                    aVar6.f23035d = Boolean.valueOf(CommonUtils.j());
                                    aVar4.f22951h = aVar6.a();
                                    StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                    String str14 = Build.CPU_ABI;
                                    if (TextUtils.isEmpty(str14) || (num = (Integer) ma.y.f21955f.get(str14.toLowerCase(locale))) == null) {
                                        i10 = 7;
                                    } else {
                                        i10 = num.intValue();
                                    }
                                    int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                    long g11 = CommonUtils.g();
                                    long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                    boolean i12 = CommonUtils.i();
                                    int d11 = CommonUtils.d();
                                    k.a aVar7 = new k.a();
                                    aVar7.f22969a = Integer.valueOf(i10);
                                    aVar7.f22970b = str5;
                                    aVar7.c = Integer.valueOf(availableProcessors2);
                                    aVar7.f22971d = Long.valueOf(g11);
                                    aVar7.f22972e = Long.valueOf(blockCount2);
                                    aVar7.f22973f = Boolean.valueOf(i12);
                                    aVar7.f22974g = Integer.valueOf(d11);
                                    aVar7.f22975h = str6;
                                    aVar7.f22976i = str7;
                                    aVar4.f22952i = aVar7.a();
                                    aVar4.f22954k = 3;
                                    aVar2.f22906g = aVar4.a();
                                    oa.b a10 = aVar2.a();
                                    ra.d dVar2 = i0Var.f21908b.f29494b;
                                    b0.e eVar = a10.f22898h;
                                    if (eVar == null) {
                                        Log.isLoggable("FirebaseCrashlytics", 3);
                                        return;
                                    }
                                    String g12 = eVar.g();
                                    try {
                                        ra.c.f29490f.getClass();
                                        ya.d dVar3 = pa.a.f23839a;
                                        dVar3.getClass();
                                        StringWriter stringWriter = new StringWriter();
                                        try {
                                            dVar3.a(a10, stringWriter);
                                        } catch (IOException unused) {
                                        }
                                        ra.c.e(dVar2.c(g12, "report"), stringWriter.toString());
                                        File c11 = dVar2.c(g12, "start-time");
                                        long i13 = eVar.i();
                                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(c11), ra.c.f29488d);
                                        outputStreamWriter.write("");
                                        c11.setLastModified(i13 * 1000);
                                        outputStreamWriter.close();
                                        return;
                                    } catch (IOException unused2) {
                                        Log.isLoggable("FirebaseCrashlytics", 3);
                                        return;
                                    }
                                }
                                throw new NullPointerException("Null identifier");
                            }
                            throw new NullPointerException("Null generator");
                        }
                        throw new NullPointerException("Null identifier");
                    }
                    throw new NullPointerException("Null displayVersion");
                }
                throw new NullPointerException("Null buildVersion");
            }
            throw new NullPointerException("Null installationUuid");
        }
        throw new NullPointerException("Null gmpAppId");
    }

    public static o b(b bVar) {
        boolean z10;
        o c;
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : ra.d.f(bVar.f13522g.f29496b.listFiles(f13516r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z10 = true;
                } catch (ClassNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    c = Tasks.e(null);
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    c = Tasks.c(new s(bVar, parseLong), new ScheduledThreadPoolExecutor(1));
                }
                arrayList.add(c);
            } catch (NumberFormatException unused2) {
                file.getName();
            }
            file.delete();
        }
        return Tasks.f(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0530 A[LOOP:3: B:167:0x0530->B:169:0x0536, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x06ae A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0304  */
    /* JADX WARN: Type inference failed for: r14v16, types: [ma.e0] */
    /* JADX WARN: Type inference failed for: r30v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r30, ta.f r31) {
        /*
            Method dump skipped, instructions count: 1711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.b.c(boolean, ta.f):void");
    }

    public final void d(long j10) {
        try {
            ra.d dVar = this.f13522g;
            String str = ".ae" + j10;
            dVar.getClass();
            if (!new File(dVar.f29496b, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException unused) {
        }
    }

    public final String e() {
        ra.c cVar = this.f13527l.f21908b;
        cVar.getClass();
        NavigableSet descendingSet = new TreeSet(ra.d.f(cVar.f29494b.c.list())).descendingSet();
        if (!descendingSet.isEmpty()) {
            return (String) descendingSet.first();
        }
        return null;
    }

    @SuppressLint({"TaskMainThread"})
    public final Task f(o oVar) {
        boolean z10;
        o oVar2;
        o oVar3;
        ra.d dVar = this.f13527l.f21908b.f29494b;
        if (ra.d.f(dVar.f29497d.listFiles()).isEmpty() && ra.d.f(dVar.f29498e.listFiles()).isEmpty() && ra.d.f(dVar.f29499f.listFiles()).isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        TaskCompletionSource<Boolean> taskCompletionSource = this.f13529n;
        if (!z10) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            taskCompletionSource.d(Boolean.FALSE);
            return Tasks.e(null);
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        a0 a0Var = this.f13518b;
        if (a0Var.b()) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            taskCompletionSource.d(Boolean.FALSE);
            oVar3 = Tasks.e(Boolean.TRUE);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 3);
            Log.isLoggable("FirebaseCrashlytics", 2);
            taskCompletionSource.d(Boolean.TRUE);
            synchronized (a0Var.c) {
                oVar2 = a0Var.f21873d.f11978a;
            }
            ea.a aVar = new ea.a();
            oVar2.getClass();
            n nVar = TaskExecutors.f11979a;
            o oVar4 = new o();
            oVar2.f16148b.a(new d8.j(nVar, aVar, oVar4));
            oVar2.w();
            Log.isLoggable("FirebaseCrashlytics", 3);
            o oVar5 = this.f13530o.f11978a;
            ExecutorService executorService = j0.f21911a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            h5.a aVar2 = new h5.a(taskCompletionSource2, 4);
            oVar4.s(aVar2);
            oVar5.s(aVar2);
            oVar3 = taskCompletionSource2.f11978a;
        }
        ma.o oVar6 = new ma.o(this, oVar);
        oVar3.getClass();
        n nVar2 = TaskExecutors.f11979a;
        o oVar7 = new o();
        oVar3.f16148b.a(new d8.j(nVar2, oVar6, oVar7));
        oVar3.w();
        return oVar7;
    }
}
