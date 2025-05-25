package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.service.zao;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import y.h;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class GoogleApiManager implements Handler.Callback {

    /* renamed from: p  reason: collision with root package name */
    public static final Status f10936p = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: q  reason: collision with root package name */
    public static final Status f10937q = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: r  reason: collision with root package name */
    public static final Object f10938r = new Object();

    /* renamed from: s  reason: collision with root package name */
    public static GoogleApiManager f10939s;
    public TelemetryData c;

    /* renamed from: d  reason: collision with root package name */
    public zao f10942d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f10943e;

    /* renamed from: f  reason: collision with root package name */
    public final GoogleApiAvailability f10944f;

    /* renamed from: g  reason: collision with root package name */
    public final com.google.android.gms.common.internal.zal f10945g;

    /* renamed from: n  reason: collision with root package name */
    public final com.google.android.gms.internal.base.zau f10952n;

    /* renamed from: o  reason: collision with root package name */
    public volatile boolean f10953o;

    /* renamed from: a  reason: collision with root package name */
    public long f10940a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10941b = false;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicInteger f10946h = new AtomicInteger(1);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f10947i = new AtomicInteger(0);

    /* renamed from: j  reason: collision with root package name */
    public final ConcurrentHashMap f10948j = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: k  reason: collision with root package name */
    public zaae f10949k = null;

    /* renamed from: l  reason: collision with root package name */
    public final y.d f10950l = new y.d();

    /* renamed from: m  reason: collision with root package name */
    public final y.d f10951m = new y.d();

    @KeepForSdk
    public GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        boolean z10 = true;
        this.f10953o = true;
        this.f10943e = context;
        com.google.android.gms.internal.base.zau zauVar = new com.google.android.gms.internal.base.zau(looper, this);
        this.f10952n = zauVar;
        this.f10944f = googleApiAvailability;
        this.f10945g = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        if (DeviceProperties.f11375e == null) {
            DeviceProperties.f11375e = Boolean.valueOf((PlatformVersion.a() && packageManager.hasSystemFeature("android.hardware.type.automotive")) ? z10 : false);
        }
        if (DeviceProperties.f11375e.booleanValue()) {
            this.f10953o = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static Status d(ApiKey apiKey, ConnectionResult connectionResult) {
        return new Status(17, androidx.appcompat.view.menu.d.d("API: ", apiKey.f10930b.c, " is not available on this device. Connection failed with: ", String.valueOf(connectionResult)), connectionResult.c, connectionResult);
    }

    @ResultIgnorabilityUnspecified
    public static GoogleApiManager g(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (f10938r) {
            try {
                if (f10939s == null) {
                    f10939s = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.b().getLooper(), GoogleApiAvailability.f10882d);
                }
                googleApiManager = f10939s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return googleApiManager;
    }

    public final void a(zaae zaaeVar) {
        synchronized (f10938r) {
            if (this.f10949k != zaaeVar) {
                this.f10949k = zaaeVar;
                this.f10950l.clear();
            }
            this.f10950l.addAll(zaaeVar.f11047f);
        }
    }

    public final boolean b() {
        if (this.f10941b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.a().f11227a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.f11229b) {
            return false;
        }
        int i10 = this.f10945g.f11276a.get(203400000, -1);
        if (i10 != -1 && i10 != 0) {
            return false;
        }
        return true;
    }

    @ResultIgnorabilityUnspecified
    public final boolean c(ConnectionResult connectionResult, int i10) {
        PendingIntent pendingIntent;
        GoogleApiAvailability googleApiAvailability = this.f10944f;
        googleApiAvailability.getClass();
        Context context = this.f10943e;
        if (InstantApps.a(context)) {
            return false;
        }
        boolean d10 = connectionResult.d();
        int i11 = connectionResult.f10876b;
        if (d10) {
            pendingIntent = connectionResult.c;
        } else {
            pendingIntent = null;
            Intent b10 = googleApiAvailability.b(context, i11, null);
            if (b10 != null) {
                pendingIntent = PendingIntent.getActivity(context, 0, b10, com.google.android.gms.internal.common.zzd.zza | 134217728);
            }
        }
        if (pendingIntent == null) {
            return false;
        }
        int i12 = GoogleApiActivity.f10904b;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", true);
        googleApiAvailability.i(context, i11, PendingIntent.getActivity(context, 0, intent, com.google.android.gms.internal.base.zap.zaa | 134217728));
        return true;
    }

    @ResultIgnorabilityUnspecified
    public final zabq e(GoogleApi googleApi) {
        ConcurrentHashMap concurrentHashMap = this.f10948j;
        ApiKey apiKey = googleApi.getApiKey();
        zabq zabqVar = (zabq) concurrentHashMap.get(apiKey);
        if (zabqVar == null) {
            zabqVar = new zabq(this, googleApi);
            concurrentHashMap.put(apiKey, zabqVar);
        }
        if (zabqVar.f11111b.requiresSignIn()) {
            this.f10951m.add(apiKey);
        }
        zabqVar.l();
        return zabqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(com.google.android.gms.tasks.TaskCompletionSource r9, int r10, com.google.android.gms.common.api.GoogleApi r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L78
            com.google.android.gms.common.api.internal.ApiKey r3 = r11.getApiKey()
            boolean r11 = r8.b()
            if (r11 != 0) goto Ld
            goto L49
        Ld:
            com.google.android.gms.common.internal.RootTelemetryConfigManager r11 = com.google.android.gms.common.internal.RootTelemetryConfigManager.a()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r11 = r11.f11227a
            r0 = 1
            if (r11 == 0) goto L4b
            boolean r1 = r11.f11229b
            if (r1 == 0) goto L49
            java.util.concurrent.ConcurrentHashMap r1 = r8.f10948j
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.common.api.internal.zabq r1 = (com.google.android.gms.common.api.internal.zabq) r1
            if (r1 == 0) goto L46
            com.google.android.gms.common.api.Api$Client r2 = r1.f11111b
            boolean r4 = r2 instanceof com.google.android.gms.common.internal.BaseGmsClient
            if (r4 == 0) goto L49
            com.google.android.gms.common.internal.BaseGmsClient r2 = (com.google.android.gms.common.internal.BaseGmsClient) r2
            boolean r4 = r2.hasConnectionInfo()
            if (r4 == 0) goto L46
            boolean r4 = r2.isConnecting()
            if (r4 != 0) goto L46
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r11 = com.google.android.gms.common.api.internal.b0.a(r1, r2, r10)
            if (r11 == 0) goto L49
            int r2 = r1.f11120l
            int r2 = r2 + r0
            r1.f11120l = r2
            boolean r0 = r11.c
            goto L4b
        L46:
            boolean r0 = r11.c
            goto L4b
        L49:
            r10 = 0
            goto L67
        L4b:
            com.google.android.gms.common.api.internal.b0 r11 = new com.google.android.gms.common.api.internal.b0
            r1 = 0
            if (r0 == 0) goto L56
            long r4 = java.lang.System.currentTimeMillis()
            goto L57
        L56:
            r4 = r1
        L57:
            if (r0 == 0) goto L5f
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6 = r0
            goto L60
        L5f:
            r6 = r1
        L60:
            r0 = r11
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r11
        L67:
            if (r10 == 0) goto L78
            com.google.android.gms.internal.base.zau r11 = r8.f10952n
            r11.getClass()
            com.google.android.gms.common.api.internal.zabk r0 = new com.google.android.gms.common.api.internal.zabk
            r0.<init>()
            d8.o r9 = r9.f11978a
            r9.c(r0, r10)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.GoogleApiManager.f(com.google.android.gms.tasks.TaskCompletionSource, int, com.google.android.gms.common.api.GoogleApi):void");
    }

    public final void h(ConnectionResult connectionResult, int i10) {
        if (!c(connectionResult, i10)) {
            com.google.android.gms.internal.base.zau zauVar = this.f10952n;
            zauVar.sendMessage(zauVar.obtainMessage(5, i10, 0, connectionResult));
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        zabq zabqVar;
        Status status;
        Feature[] g10;
        int i10 = message.what;
        com.google.android.gms.internal.base.zau zauVar = this.f10952n;
        ConcurrentHashMap concurrentHashMap = this.f10948j;
        Context context = this.f10943e;
        long j10 = 300000;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.f10940a = j10;
                zauVar.removeMessages(12);
                for (ApiKey apiKey : concurrentHashMap.keySet()) {
                    zauVar.sendMessageDelayed(zauVar.obtainMessage(12, apiKey), this.f10940a);
                }
                break;
            case 2:
                ((zal) message.obj).getClass();
                throw null;
            case 3:
                for (zabq zabqVar2 : concurrentHashMap.values()) {
                    Preconditions.c(zabqVar2.f11121m.f10952n);
                    zabqVar2.f11119k = null;
                    zabqVar2.l();
                }
                break;
            case 4:
            case 8:
            case 13:
                zach zachVar = (zach) message.obj;
                zabq zabqVar3 = (zabq) concurrentHashMap.get(zachVar.c.getApiKey());
                if (zabqVar3 == null) {
                    zabqVar3 = e(zachVar.c);
                }
                boolean requiresSignIn = zabqVar3.f11111b.requiresSignIn();
                zai zaiVar = zachVar.f11126a;
                if (requiresSignIn && this.f10947i.get() != zachVar.f11127b) {
                    zaiVar.a(f10936p);
                    zabqVar3.p();
                    break;
                } else {
                    zabqVar3.m(zaiVar);
                    break;
                }
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it = concurrentHashMap.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        zabqVar = (zabq) it.next();
                        if (zabqVar.f11115g == i11) {
                        }
                    } else {
                        zabqVar = null;
                    }
                }
                if (zabqVar != null) {
                    if (connectionResult.f10876b == 13) {
                        this.f10944f.getClass();
                        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f10886a;
                        StringBuilder g11 = b.a.g("Error resolution was canceled by the user, original error message: ", ConnectionResult.h(connectionResult.f10876b), ": ");
                        g11.append(connectionResult.f10877d);
                        zabqVar.c(new Status(17, g11.toString(), null, null));
                        break;
                    } else {
                        zabqVar.c(d(zabqVar.c, connectionResult));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", a0.a.g("Could not find API instance ", i11, " while trying to fail enqueued calls."), new Exception());
                    break;
                }
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    BackgroundDetector.b((Application) context.getApplicationContext());
                    BackgroundDetector backgroundDetector = BackgroundDetector.f10932e;
                    backgroundDetector.a(new u(this));
                    AtomicBoolean atomicBoolean2 = backgroundDetector.f10934b;
                    boolean z10 = atomicBoolean2.get();
                    AtomicBoolean atomicBoolean3 = backgroundDetector.f10933a;
                    if (!z10) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean3.set(true);
                        }
                    }
                    if (!atomicBoolean3.get()) {
                        this.f10940a = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                e((GoogleApi) message.obj);
                break;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    zabq zabqVar4 = (zabq) concurrentHashMap.get(message.obj);
                    Preconditions.c(zabqVar4.f11121m.f10952n);
                    if (zabqVar4.f11117i) {
                        zabqVar4.l();
                        break;
                    }
                }
                break;
            case 10:
                y.d dVar = this.f10951m;
                Iterator it2 = dVar.iterator();
                while (true) {
                    h.a aVar = (h.a) it2;
                    if (aVar.hasNext()) {
                        zabq zabqVar5 = (zabq) concurrentHashMap.remove((ApiKey) aVar.next());
                        if (zabqVar5 != null) {
                            zabqVar5.p();
                        }
                    } else {
                        dVar.clear();
                        break;
                    }
                }
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    zabq zabqVar6 = (zabq) concurrentHashMap.get(message.obj);
                    GoogleApiManager googleApiManager = zabqVar6.f11121m;
                    Preconditions.c(googleApiManager.f10952n);
                    boolean z11 = zabqVar6.f11117i;
                    if (z11) {
                        if (z11) {
                            GoogleApiManager googleApiManager2 = zabqVar6.f11121m;
                            com.google.android.gms.internal.base.zau zauVar2 = googleApiManager2.f10952n;
                            ApiKey apiKey2 = zabqVar6.c;
                            zauVar2.removeMessages(11, apiKey2);
                            googleApiManager2.f10952n.removeMessages(9, apiKey2);
                            zabqVar6.f11117i = false;
                        }
                        if (googleApiManager.f10944f.d(googleApiManager.f10943e) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null);
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.", null, null);
                        }
                        zabqVar6.c(status);
                        zabqVar6.f11111b.disconnect("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((zabq) concurrentHashMap.get(message.obj)).k(true);
                    break;
                }
                break;
            case 14:
                d dVar2 = (d) message.obj;
                ApiKey apiKey3 = dVar2.f10995a;
                boolean containsKey = concurrentHashMap.containsKey(apiKey3);
                TaskCompletionSource taskCompletionSource = dVar2.f10996b;
                if (!containsKey) {
                    taskCompletionSource.b(Boolean.FALSE);
                    break;
                } else {
                    taskCompletionSource.b(Boolean.valueOf(((zabq) concurrentHashMap.get(apiKey3)).k(false)));
                    break;
                }
            case 15:
                y yVar = (y) message.obj;
                if (concurrentHashMap.containsKey(yVar.f11041a)) {
                    zabq zabqVar7 = (zabq) concurrentHashMap.get(yVar.f11041a);
                    if (zabqVar7.f11118j.contains(yVar) && !zabqVar7.f11117i) {
                        if (!zabqVar7.f11111b.isConnected()) {
                            zabqVar7.l();
                            break;
                        } else {
                            zabqVar7.e();
                            break;
                        }
                    }
                }
                break;
            case 16:
                y yVar2 = (y) message.obj;
                if (concurrentHashMap.containsKey(yVar2.f11041a)) {
                    zabq zabqVar8 = (zabq) concurrentHashMap.get(yVar2.f11041a);
                    if (zabqVar8.f11118j.remove(yVar2)) {
                        GoogleApiManager googleApiManager3 = zabqVar8.f11121m;
                        googleApiManager3.f10952n.removeMessages(15, yVar2);
                        googleApiManager3.f10952n.removeMessages(16, yVar2);
                        LinkedList linkedList = zabqVar8.f11110a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it3 = linkedList.iterator();
                        while (true) {
                            boolean hasNext = it3.hasNext();
                            Feature feature = yVar2.f11042b;
                            if (hasNext) {
                                zai zaiVar2 = (zai) it3.next();
                                if ((zaiVar2 instanceof zac) && (g10 = ((zac) zaiVar2).g(zabqVar8)) != null && ArrayUtils.a(feature, g10)) {
                                    arrayList.add(zaiVar2);
                                }
                            } else {
                                int size = arrayList.size();
                                for (int i12 = 0; i12 < size; i12++) {
                                    zai zaiVar3 = (zai) arrayList.get(i12);
                                    linkedList.remove(zaiVar3);
                                    zaiVar3.b(new UnsupportedApiCallException(feature));
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 17:
                TelemetryData telemetryData = this.c;
                if (telemetryData != null) {
                    if (telemetryData.f11234a > 0 || b()) {
                        if (this.f10942d == null) {
                            this.f10942d = new zao(context);
                        }
                        this.f10942d.a(telemetryData);
                    }
                    this.c = null;
                    break;
                }
                break;
            case 18:
                c0 c0Var = (c0) message.obj;
                int i13 = (c0Var.c > 0L ? 1 : (c0Var.c == 0L ? 0 : -1));
                MethodInvocation methodInvocation = c0Var.f10992a;
                int i14 = c0Var.f10993b;
                if (i13 == 0) {
                    TelemetryData telemetryData2 = new TelemetryData(i14, Arrays.asList(methodInvocation));
                    if (this.f10942d == null) {
                        this.f10942d = new zao(context);
                    }
                    this.f10942d.a(telemetryData2);
                    break;
                } else {
                    TelemetryData telemetryData3 = this.c;
                    if (telemetryData3 != null) {
                        List list = telemetryData3.f11235b;
                        if (telemetryData3.f11234a == i14 && (list == null || list.size() < c0Var.f10994d)) {
                            TelemetryData telemetryData4 = this.c;
                            if (telemetryData4.f11235b == null) {
                                telemetryData4.f11235b = new ArrayList();
                            }
                            telemetryData4.f11235b.add(methodInvocation);
                        } else {
                            zauVar.removeMessages(17);
                            TelemetryData telemetryData5 = this.c;
                            if (telemetryData5 != null) {
                                if (telemetryData5.f11234a > 0 || b()) {
                                    if (this.f10942d == null) {
                                        this.f10942d = new zao(context);
                                    }
                                    this.f10942d.a(telemetryData5);
                                }
                                this.c = null;
                            }
                        }
                    }
                    if (this.c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(methodInvocation);
                        this.c = new TelemetryData(i14, arrayList2);
                        zauVar.sendMessageDelayed(zauVar.obtainMessage(17), c0Var.c);
                        break;
                    }
                }
                break;
            case 19:
                this.f10941b = false;
                break;
            default:
                return false;
        }
        return true;
    }
}
