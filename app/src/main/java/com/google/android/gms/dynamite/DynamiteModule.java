package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import x7.f;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f11412e = null;

    /* renamed from: f  reason: collision with root package name */
    public static String f11413f = null;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f11414g = false;

    /* renamed from: h  reason: collision with root package name */
    public static int f11415h = -1;

    /* renamed from: i  reason: collision with root package name */
    public static Boolean f11416i;

    /* renamed from: m  reason: collision with root package name */
    public static zzq f11420m;

    /* renamed from: n  reason: collision with root package name */
    public static zzr f11421n;

    /* renamed from: a  reason: collision with root package name */
    public final Context f11422a;

    /* renamed from: j  reason: collision with root package name */
    public static final ThreadLocal f11417j = new ThreadLocal();

    /* renamed from: k  reason: collision with root package name */
    public static final x7.e f11418k = new x7.e();

    /* renamed from: l  reason: collision with root package name */
    public static final a f11419l = new a();
    @KeepForSdk

    /* renamed from: b  reason: collision with root package name */
    public static final b f11410b = new b();
    @KeepForSdk
    public static final c c = new c();
    @KeepForSdk

    /* renamed from: d  reason: collision with root package name */
    public static final d f11411d = new d();

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th2, zzp zzpVar) {
            super(str, th2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: classes.dex */
    public interface VersionPolicy {

        /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
        @KeepForSdk
        /* loaded from: classes.dex */
        public interface IVersions {
            int a(Context context, String str, boolean z10);

            int b(Context context, String str);
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
        @KeepForSdk
        /* loaded from: classes.dex */
        public static class SelectionResult {
            @KeepForSdk

            /* renamed from: a  reason: collision with root package name */
            public int f11423a = 0;
            @KeepForSdk

            /* renamed from: b  reason: collision with root package name */
            public int f11424b = 0;
            @KeepForSdk
            public int c = 0;
        }

        @KeepForSdk
        SelectionResult a(Context context, String str, IVersions iVersions);
    }

    public DynamiteModule(Context context) {
        this.f11422a = context;
    }

    @KeepForSdk
    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!Objects.a(declaredField.get(null), str)) {
                String.valueOf(declaredField.get(null));
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e10) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage()));
            return 0;
        }
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static DynamiteModule c(Context context, VersionPolicy versionPolicy, String str) {
        Boolean bool;
        IObjectWrapper K;
        DynamiteModule dynamiteModule;
        DynamiteModule dynamiteModule2;
        zzr zzrVar;
        boolean z10;
        Boolean valueOf;
        IObjectWrapper K2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = f11417j;
            f fVar = (f) threadLocal.get();
            f fVar2 = new f(0);
            threadLocal.set(fVar2);
            x7.e eVar = f11418k;
            long longValue = ((Long) eVar.get()).longValue();
            try {
                eVar.set(Long.valueOf(SystemClock.elapsedRealtime()));
                VersionPolicy.SelectionResult a10 = versionPolicy.a(context, str, f11419l);
                int i10 = a10.f11423a;
                int i11 = a10.f11424b;
                int i12 = a10.c;
                if (i12 != 0) {
                    if (i12 == -1) {
                        if (i10 != 0) {
                            i12 = -1;
                        }
                    }
                    if (i12 != 1 || i11 != 0) {
                        if (i12 == -1) {
                            "Selected local version of ".concat(str);
                            dynamiteModule2 = new DynamiteModule(applicationContext);
                        } else {
                            try {
                                if (i12 == 1) {
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            if (g(context)) {
                                                bool = f11412e;
                                            } else {
                                                throw new LoadingException("Remote loading disabled", null);
                                            }
                                        }
                                        if (bool != null) {
                                            if (bool.booleanValue()) {
                                                synchronized (DynamiteModule.class) {
                                                    zzrVar = f11421n;
                                                }
                                                if (zzrVar != null) {
                                                    f fVar3 = (f) threadLocal.get();
                                                    if (fVar3 != null && fVar3.f31625a != null) {
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor = fVar3.f31625a;
                                                        new ObjectWrapper(null);
                                                        synchronized (DynamiteModule.class) {
                                                            if (f11415h >= 2) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            valueOf = Boolean.valueOf(z10);
                                                        }
                                                        if (valueOf.booleanValue()) {
                                                            K2 = zzrVar.L0(new ObjectWrapper(applicationContext2), str, i11, new ObjectWrapper(cursor));
                                                        } else {
                                                            K2 = zzrVar.K(new ObjectWrapper(applicationContext2), str, i11, new ObjectWrapper(cursor));
                                                        }
                                                        Context context2 = (Context) ObjectWrapper.L0(K2);
                                                        if (context2 != null) {
                                                            dynamiteModule = new DynamiteModule(context2);
                                                        } else {
                                                            throw new LoadingException("Failed to get module context", null);
                                                        }
                                                    } else {
                                                        throw new LoadingException("No result cursor", null);
                                                    }
                                                } else {
                                                    throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                                }
                                            } else {
                                                zzq h10 = h(context);
                                                if (h10 != null) {
                                                    Parcel zzB = h10.zzB(6, h10.zza());
                                                    int readInt = zzB.readInt();
                                                    zzB.recycle();
                                                    if (readInt >= 3) {
                                                        f fVar4 = (f) threadLocal.get();
                                                        if (fVar4 != null) {
                                                            K = h10.L0(new ObjectWrapper(context), str, i11, new ObjectWrapper(fVar4.f31625a));
                                                        } else {
                                                            throw new LoadingException("No cached result cursor holder", null);
                                                        }
                                                    } else if (readInt == 2) {
                                                        K = h10.M0(new ObjectWrapper(context), str, i11);
                                                    } else {
                                                        K = h10.K(new ObjectWrapper(context), str, i11);
                                                    }
                                                    Object L0 = ObjectWrapper.L0(K);
                                                    if (L0 != null) {
                                                        dynamiteModule = new DynamiteModule((Context) L0);
                                                    } else {
                                                        throw new LoadingException("Failed to load remote module.", null);
                                                    }
                                                } else {
                                                    throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                                }
                                            }
                                            dynamiteModule2 = dynamiteModule;
                                        } else {
                                            throw new LoadingException("Failed to determine which loading route to use.", null);
                                        }
                                    } catch (RemoteException e10) {
                                        throw new LoadingException("Failed to load remote module.", e10, null);
                                    } catch (LoadingException e11) {
                                        throw e11;
                                    }
                                } else {
                                    throw new LoadingException("VersionPolicy returned invalid code:" + i12, null);
                                }
                            }
                        }
                        return dynamiteModule2;
                    }
                }
                throw new LoadingException("No acceptable module " + str + " found. Local version is " + a10.f11423a + " and remote version is " + a10.f11424b + ".", null);
            } finally {
                if (longValue == 0) {
                    f11418k.remove();
                } else {
                    f11418k.set(Long.valueOf(longValue));
                }
                Cursor cursor2 = fVar2.f31625a;
                if (cursor2 != null) {
                    cursor2.close();
                }
                f11417j.set(fVar);
            }
        }
        throw new LoadingException("null application Context", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x013f, code lost:
        if (r2 != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a9 A[Catch: all -> 0x01b0, TryCatch #8 {all -> 0x01b0, blocks: (B:3:0x0002, B:60:0x00c4, B:62:0x00ca, B:67:0x00d4, B:95:0x0145, B:101:0x0151, B:120:0x01a9, B:121:0x01ac, B:116:0x01a2, B:65:0x00d0, B:4:0x0003, B:7:0x000a, B:8:0x0026, B:58:0x00c1, B:19:0x0047, B:40:0x009a, B:43:0x009d, B:51:0x00b6, B:59:0x00c3, B:57:0x00bc), top: B:136:0x0002, inners: #13 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
        r8.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e6  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(java.lang.String r8, android.content.Context r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(java.lang.String, android.content.Context, boolean, boolean):int");
    }

    public static void f(ClassLoader classLoader) {
        zzr zzrVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzrVar = (zzr) queryLocalInterface;
                } else {
                    zzrVar = new zzr(iBinder);
                }
            }
            f11421n = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new LoadingException("Failed to instantiate dynamite loader", e10, null);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f11416i)) {
            return true;
        }
        boolean z10 = false;
        if (f11416i == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.f10884b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f11416i = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f11414g = true;
            }
        }
        return z10;
    }

    public static zzq h(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = f11420m;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof zzq) {
                        zzqVar = (zzq) queryLocalInterface;
                    } else {
                        zzqVar = new zzq(iBinder);
                    }
                }
                if (zzqVar != null) {
                    f11420m = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e10) {
                e10.getMessage();
            }
            return null;
        }
    }

    @KeepForSdk
    public final IBinder b(String str) {
        try {
            return (IBinder) this.f11422a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new LoadingException("Failed to instantiate module class: ".concat(str), e10, null);
        }
    }
}
