package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class BaseGmsClient<T extends IInterface> {
    @KeepForSdk
    public static final int CONNECT_STATE_CONNECTED = 4;
    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    @KeepForSdk
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private ConnectionResult zzB;
    private boolean zzC;
    private volatile zzk zzD;
    zzv zza;
    final Handler zzb;
    protected ConnectionProgressReportCallbacks zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final GmsClientSupervisor zzn;
    private final GoogleApiAvailabilityLight zzo;
    private final Object zzp;
    private final Object zzq;
    private IGmsServiceBroker zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private zze zzu;
    private int zzv;
    private final BaseConnectionCallbacks zzw;
    private final BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final String zzz;
    private static final Feature[] zze = new Feature[0];
    @KeepForSdk
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public interface BaseConnectionCallbacks {
        @KeepForSdk
        void onConnected(Bundle bundle);

        @KeepForSdk
        void onConnectionSuspended(int i10);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public interface BaseOnConnectionFailedListener {
        @KeepForSdk
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public interface ConnectionProgressReportCallbacks {
        @KeepForSdk
        void a(ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: classes.dex */
    public class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        @KeepForSdk
        public LegacyClientCallbackAdapter() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void a(ConnectionResult connectionResult) {
            boolean f10 = connectionResult.f();
            BaseGmsClient baseGmsClient = BaseGmsClient.this;
            if (f10) {
                baseGmsClient.getRemoteService(null, baseGmsClient.getScopes());
            } else if (baseGmsClient.zzx != null) {
                baseGmsClient.zzx.onConnectionFailed(connectionResult);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public interface SignOutCallbacks {
        @KeepForSdk
        void a();
    }

    @KeepForSdk
    public BaseGmsClient(Context context, Handler handler, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i10, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        if (context != null) {
            this.zzl = context;
            if (handler != null) {
                this.zzb = handler;
                this.zzm = handler.getLooper();
                if (gmsClientSupervisor != null) {
                    this.zzn = gmsClientSupervisor;
                    if (googleApiAvailabilityLight != null) {
                        this.zzo = googleApiAvailabilityLight;
                        this.zzy = i10;
                        this.zzw = baseConnectionCallbacks;
                        this.zzx = baseOnConnectionFailedListener;
                        this.zzz = null;
                        return;
                    }
                    throw new NullPointerException("API availability must not be null");
                }
                throw new NullPointerException("Supervisor must not be null");
            }
            throw new NullPointerException("Handler must not be null");
        }
        throw new NullPointerException("Context must not be null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
        if (r0.f11228a >= r2.f11228a) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zzj(com.google.android.gms.common.internal.BaseGmsClient r2, com.google.android.gms.common.internal.zzk r3) {
        /*
            r2.zzD = r3
            boolean r2 = r2.usesClientTelemetry()
            if (r2 == 0) goto L2c
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r2 = r3.f11304d
            com.google.android.gms.common.internal.RootTelemetryConfigManager r3 = com.google.android.gms.common.internal.RootTelemetryConfigManager.a()
            if (r2 != 0) goto L12
            r2 = 0
            goto L14
        L12:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r2 = r2.f11193a
        L14:
            monitor-enter(r3)
            if (r2 != 0) goto L1d
            com.google.android.gms.common.internal.RootTelemetryConfiguration r2 = com.google.android.gms.common.internal.RootTelemetryConfigManager.c     // Catch: java.lang.Throwable -> L29
        L19:
            r3.f11227a = r2     // Catch: java.lang.Throwable -> L29
        L1b:
            monitor-exit(r3)
            goto L28
        L1d:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r3.f11227a     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L19
            int r0 = r0.f11228a     // Catch: java.lang.Throwable -> L29
            int r1 = r2.f11228a     // Catch: java.lang.Throwable -> L29
            if (r0 >= r1) goto L1b
            goto L19
        L28:
            return
        L29:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.zzj(com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.internal.zzk):void");
    }

    public static /* bridge */ /* synthetic */ void zzk(BaseGmsClient baseGmsClient, int i10) {
        int i11;
        int i12;
        synchronized (baseGmsClient.zzp) {
            i11 = baseGmsClient.zzv;
        }
        if (i11 == 3) {
            baseGmsClient.zzC = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = baseGmsClient.zzb;
        handler.sendMessage(handler.obtainMessage(i12, baseGmsClient.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(BaseGmsClient baseGmsClient, int i10, int i11, IInterface iInterface) {
        synchronized (baseGmsClient.zzp) {
            if (baseGmsClient.zzv != i10) {
                return false;
            }
            baseGmsClient.zzp(i11, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "<parameter1>" is null
        	at java.base/java.util.BitSet.or(Unknown Source)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public static /* bridge */ /* synthetic */ boolean zzo(com.google.android.gms.common.internal.BaseGmsClient r2) {
        /*
            boolean r0 = r2.zzC
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.getServiceDescriptor()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.getLocalStartServiceAction()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.getServiceDescriptor()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.zzo(com.google.android.gms.common.internal.BaseGmsClient):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(int i10, IInterface iInterface) {
        boolean z10;
        boolean z11;
        boolean z12;
        zzv zzvVar;
        zzv zzvVar2;
        if (i10 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (iInterface == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 == z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        Preconditions.b(z12);
        synchronized (this.zzp) {
            try {
                this.zzv = i10;
                this.zzs = iInterface;
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3) {
                        if (i10 == 4) {
                            Preconditions.j(iInterface);
                            onConnectedLocked(iInterface);
                        }
                    } else {
                        zze zzeVar = this.zzu;
                        if (zzeVar != null && (zzvVar2 = this.zza) != null) {
                            String str = zzvVar2.f11308a;
                            GmsClientSupervisor gmsClientSupervisor = this.zzn;
                            Preconditions.j(str);
                            String str2 = this.zza.f11309b;
                            zze();
                            boolean z13 = this.zza.c;
                            gmsClientSupervisor.getClass();
                            gmsClientSupervisor.c(new zzo(str, str2, z13), zzeVar);
                            this.zzd.incrementAndGet();
                        }
                        zze zzeVar2 = new zze(this, this.zzd.get());
                        this.zzu = zzeVar2;
                        if (this.zzv == 3 && getLocalStartServiceAction() != null) {
                            zzvVar = new zzv(getContext().getPackageName(), getLocalStartServiceAction(), false);
                        } else {
                            zzvVar = new zzv(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup());
                        }
                        this.zza = zzvVar;
                        if (zzvVar.c && getMinApkVersion() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f11308a)));
                        }
                        GmsClientSupervisor gmsClientSupervisor2 = this.zzn;
                        String str3 = this.zza.f11308a;
                        Preconditions.j(str3);
                        if (!gmsClientSupervisor2.d(new zzo(str3, this.zza.f11309b, this.zza.c), zzeVar2, zze(), getBindServiceExecutor())) {
                            String str4 = this.zza.f11308a;
                            zzl(16, null, this.zzd.get());
                        }
                    }
                } else {
                    zze zzeVar3 = this.zzu;
                    if (zzeVar3 != null) {
                        GmsClientSupervisor gmsClientSupervisor3 = this.zzn;
                        String str5 = this.zza.f11308a;
                        Preconditions.j(str5);
                        String str6 = this.zza.f11309b;
                        zze();
                        boolean z14 = this.zza.c;
                        gmsClientSupervisor3.getClass();
                        gmsClientSupervisor3.c(new zzo(str5, str6, z14), zzeVar3);
                        this.zzu = null;
                    }
                }
            } finally {
            }
        }
    }

    @KeepForSdk
    public void checkAvailabilityAndConnect() {
        int c = this.zzo.c(this.zzl, getMinApkVersion());
        if (c != 0) {
            zzp(1, null);
            triggerNotAvailable(new LegacyClientCallbackAdapter(), c, null);
            return;
        }
        connect(new LegacyClientCallbackAdapter());
    }

    @KeepForSdk
    public final void checkConnected() {
        if (isConnected()) {
            return;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }

    @KeepForSdk
    public void connect(ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        if (connectionProgressReportCallbacks != null) {
            this.zzc = connectionProgressReportCallbacks;
            zzp(2, null);
            return;
        }
        throw new NullPointerException("Connection progress callbacks cannot be null.");
    }

    @KeepForSdk
    public abstract T createServiceInterface(IBinder iBinder);

    @KeepForSdk
    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((zzc) this.zzt.get(i10)).c();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    @KeepForSdk
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            iGmsServiceBroker = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            printWriter.print("UNKNOWN");
                        } else {
                            printWriter.print("DISCONNECTING");
                        }
                    } else {
                        printWriter.print("CONNECTED");
                    }
                } else {
                    printWriter.print("LOCAL_CONNECTING");
                }
            } else {
                printWriter.print("REMOTE_CONNECTING");
            }
        } else {
            printWriter.print("DISCONNECTED");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.zzh;
            String format = simpleDateFormat.format(new Date(j10));
            append.println(j10 + " " + format);
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        printWriter.append((CharSequence) String.valueOf(i11));
                    } else {
                        printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                    }
                } else {
                    printWriter.append("CAUSE_NETWORK_LOST");
                }
            } else {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.zzg;
            String format2 = simpleDateFormat.format(new Date(j11));
            append2.println(j11 + " " + format2);
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) CommonStatusCodes.a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.zzj;
            String format3 = simpleDateFormat.format(new Date(j12));
            append3.println(j12 + " " + format3);
        }
    }

    @KeepForSdk
    public boolean enableLocalFallback() {
        return false;
    }

    @KeepForSdk
    public Account getAccount() {
        return null;
    }

    @KeepForSdk
    public Feature[] getApiFeatures() {
        return zze;
    }

    @KeepForSdk
    public final Feature[] getAvailableFeatures() {
        zzk zzkVar = this.zzD;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f11303b;
    }

    @KeepForSdk
    public Executor getBindServiceExecutor() {
        return null;
    }

    @KeepForSdk
    public Bundle getConnectionHint() {
        return null;
    }

    @KeepForSdk
    public final Context getContext() {
        return this.zzl;
    }

    @KeepForSdk
    public String getEndpointPackageName() {
        zzv zzvVar;
        if (isConnected() && (zzvVar = this.zza) != null) {
            return zzvVar.f11309b;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @KeepForSdk
    public int getGCoreServiceId() {
        return this.zzy;
    }

    @KeepForSdk
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    @KeepForSdk
    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    @KeepForSdk
    public String getLocalStartServiceAction() {
        return null;
    }

    @KeepForSdk
    public final Looper getLooper() {
        return this.zzm;
    }

    @KeepForSdk
    public int getMinApkVersion() {
        return GoogleApiAvailabilityLight.f10883a;
    }

    @KeepForSdk
    public void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = this.zzA;
        int i10 = GoogleApiAvailabilityLight.f10883a;
        Scope[] scopeArr = GetServiceRequest.f11198o;
        Bundle bundle = new Bundle();
        int i11 = this.zzy;
        Feature[] featureArr = GetServiceRequest.f11199p;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i11, i10, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f11202d = this.zzl.getPackageName();
        getServiceRequest.f11205g = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.f11204f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.f11206h = account;
            if (iAccountAccessor != null) {
                getServiceRequest.f11203e = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f11206h = getAccount();
        }
        getServiceRequest.f11207i = zze;
        getServiceRequest.f11208j = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.f11211m = true;
        }
        try {
            try {
                synchronized (this.zzq) {
                    IGmsServiceBroker iGmsServiceBroker = this.zzr;
                    if (iGmsServiceBroker != null) {
                        iGmsServiceBroker.q(new zzd(this, this.zzd.get()), getServiceRequest);
                    }
                }
            } catch (DeadObjectException unused) {
                triggerConnectionSuspended(3);
            } catch (SecurityException e10) {
                throw e10;
            }
        } catch (RemoteException | RuntimeException unused2) {
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    @KeepForSdk
    public Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    @KeepForSdk
    public final T getService() {
        T t4;
        synchronized (this.zzp) {
            if (this.zzv != 5) {
                checkConnected();
                t4 = (T) this.zzs;
                Preconditions.k(t4, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t4;
    }

    @KeepForSdk
    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            IGmsServiceBroker iGmsServiceBroker = this.zzr;
            if (iGmsServiceBroker == null) {
                return null;
            }
            return iGmsServiceBroker.asBinder();
        }
    }

    @KeepForSdk
    public abstract String getServiceDescriptor();

    @KeepForSdk
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @KeepForSdk
    public abstract String getStartServiceAction();

    @KeepForSdk
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    @KeepForSdk
    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzk zzkVar = this.zzD;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f11304d;
    }

    @KeepForSdk
    public boolean getUseDynamicLookup() {
        if (getMinApkVersion() >= 211700000) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public boolean hasConnectionInfo() {
        if (this.zzD != null) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            if (this.zzv == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @KeepForSdk
    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    @KeepForSdk
    public void onConnectedLocked(T t4) {
        this.zzh = System.currentTimeMillis();
    }

    @KeepForSdk
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzi = connectionResult.f10876b;
        this.zzj = System.currentTimeMillis();
    }

    @KeepForSdk
    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    @KeepForSdk
    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i11, -1, new zzf(this, i10, iBinder, bundle)));
    }

    @KeepForSdk
    public void onUserSignOut(SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.a();
    }

    @KeepForSdk
    public boolean providesSignIn() {
        return false;
    }

    @KeepForSdk
    public boolean requiresAccount() {
        return false;
    }

    @KeepForSdk
    public boolean requiresGooglePlayServices() {
        return true;
    }

    @KeepForSdk
    public boolean requiresSignIn() {
        return false;
    }

    @KeepForSdk
    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    @KeepForSdk
    public void triggerConnectionSuspended(int i10) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i10));
    }

    @KeepForSdk
    public void triggerNotAvailable(ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i10, PendingIntent pendingIntent) {
        if (connectionProgressReportCallbacks != null) {
            this.zzc = connectionProgressReportCallbacks;
            this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i10, pendingIntent));
            return;
        }
        throw new NullPointerException("Connection progress callbacks cannot be null.");
    }

    @KeepForSdk
    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        if (str == null) {
            return this.zzl.getClass().getName();
        }
        return str;
    }

    public final void zzl(int i10, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i11, -1, new zzg(this, i10)));
    }

    @KeepForSdk
    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BaseGmsClient(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r13, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.l r3 = com.google.android.gms.common.internal.GmsClientSupervisor.a(r10)
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.f10884b
            com.google.android.gms.common.internal.Preconditions.j(r13)
            com.google.android.gms.common.internal.Preconditions.j(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener, java.lang.String):void");
    }

    @KeepForSdk
    public BaseGmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i10, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        if (context != null) {
            this.zzl = context;
            if (looper != null) {
                this.zzm = looper;
                if (gmsClientSupervisor != null) {
                    this.zzn = gmsClientSupervisor;
                    if (googleApiAvailabilityLight != null) {
                        this.zzo = googleApiAvailabilityLight;
                        this.zzb = new g(this, looper);
                        this.zzy = i10;
                        this.zzw = baseConnectionCallbacks;
                        this.zzx = baseOnConnectionFailedListener;
                        this.zzz = str;
                        return;
                    }
                    throw new NullPointerException("API availability must not be null");
                }
                throw new NullPointerException("Supervisor must not be null");
            }
            throw new NullPointerException("Looper must not be null");
        }
        throw new NullPointerException("Context must not be null");
    }
}
