package com.inmobi.media;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.provider.Settings;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class P5 implements LocationListener {

    /* renamed from: a  reason: collision with root package name */
    public static final P5 f14570a = new P5();

    /* renamed from: b  reason: collision with root package name */
    public static final LocationManager f14571b;
    public static final HandlerThread c;

    /* renamed from: d  reason: collision with root package name */
    public static GoogleApiClient f14572d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f14573e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f14574f;

    static {
        LocationManager locationManager;
        HandlerThread handlerThread = new HandlerThread("LThread");
        c = handlerThread;
        f14573e = "P5";
        J3.a(handlerThread, "LThread");
        Context d10 = Ha.d();
        if (d10 != null) {
            Object systemService = d10.getSystemService("location");
            if (systemService instanceof LocationManager) {
                locationManager = (LocationManager) systemService;
            } else {
                locationManager = null;
            }
            f14571b = locationManager;
        }
    }

    public static boolean c() {
        try {
            if (!AbstractC1684j9.a(Ha.d(), "android.permission.ACCESS_FINE_LOCATION")) {
                if (!AbstractC1684j9.a(Ha.d(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            String TAG = f14573e;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            return false;
        }
    }

    public static boolean e() {
        int i10;
        boolean isLocationEnabled;
        Context d10 = Ha.d();
        if (d10 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            LocationManager locationManager = f14571b;
            if (locationManager != null) {
                isLocationEnabled = locationManager.isLocationEnabled();
                if (!isLocationEnabled) {
                    return false;
                }
                return true;
            }
            return false;
        }
        try {
            i10 = Settings.Secure.getInt(d10.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException unused) {
            i10 = 0;
        }
        if (i10 == 0) {
            return false;
        }
        return true;
    }

    public final void a() {
        LocationManager locationManager = f14571b;
        if (locationManager != null) {
            Criteria criteria = new Criteria();
            criteria.setBearingAccuracy(2);
            criteria.setPowerRequirement(2);
            criteria.setCostAllowed(false);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider != null) {
                String TAG = f14573e;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                locationManager.requestSingleUpdate(bestProvider, this, c.getLooper());
            } else {
                String TAG2 = f14573e;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
            }
        }
        tf.d dVar = tf.d.f30009a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:28|(6:85|86|31|32|(1:36)|82)|30|31|32|(2:34|36)|82) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
        r5 = com.inmobi.media.P5.f14573e;
        kotlin.jvm.internal.g.d(r5, "TAG");
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089 A[Catch: all -> 0x0179, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0011, B:75:0x0133, B:77:0x013f, B:78:0x0144, B:80:0x0151, B:81:0x0159, B:83:0x015f, B:79:0x0149, B:9:0x001f, B:11:0x0025, B:13:0x002b, B:15:0x002f, B:20:0x0059, B:22:0x005d, B:24:0x0069, B:32:0x007f, B:34:0x0089, B:36:0x0095, B:38:0x009c, B:39:0x00ab, B:52:0x00d3, B:54:0x00e3, B:55:0x00f1, B:71:0x0115, B:73:0x0124, B:28:0x0073, B:18:0x004e), top: B:92:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0133 A[Catch: all -> 0x0179, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0011, B:75:0x0133, B:77:0x013f, B:78:0x0144, B:80:0x0151, B:81:0x0159, B:83:0x015f, B:79:0x0149, B:9:0x001f, B:11:0x0025, B:13:0x002b, B:15:0x002f, B:20:0x0059, B:22:0x005d, B:24:0x0069, B:32:0x007f, B:34:0x0089, B:36:0x0095, B:38:0x009c, B:39:0x00ab, B:52:0x00d3, B:54:0x00e3, B:55:0x00f1, B:71:0x0115, B:73:0x0124, B:28:0x0073, B:18:0x004e), top: B:92:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149 A[Catch: all -> 0x0179, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0011, B:75:0x0133, B:77:0x013f, B:78:0x0144, B:80:0x0151, B:81:0x0159, B:83:0x015f, B:79:0x0149, B:9:0x001f, B:11:0x0025, B:13:0x002b, B:15:0x002f, B:20:0x0059, B:22:0x005d, B:24:0x0069, B:32:0x007f, B:34:0x0089, B:36:0x0095, B:38:0x009c, B:39:0x00ab, B:52:0x00d3, B:54:0x00e3, B:55:0x00f1, B:71:0x0115, B:73:0x0124, B:28:0x0073, B:18:0x004e), top: B:92:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015f A[Catch: all -> 0x0179, LOOP:0: B:81:0x0159->B:83:0x015f, LOOP_END, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0011, B:75:0x0133, B:77:0x013f, B:78:0x0144, B:80:0x0151, B:81:0x0159, B:83:0x015f, B:79:0x0149, B:9:0x001f, B:11:0x0025, B:13:0x002b, B:15:0x002f, B:20:0x0059, B:22:0x005d, B:24:0x0069, B:32:0x007f, B:34:0x0089, B:36:0x0095, B:38:0x009c, B:39:0x00ab, B:52:0x00d3, B:54:0x00e3, B:55:0x00f1, B:71:0x0115, B:73:0x0124, B:28:0x0073, B:18:0x004e), top: B:92:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.HashMap b() {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.P5.b():java.util.HashMap");
    }

    public final synchronized void d() {
        try {
            if (c() && e()) {
                a();
                try {
                    kotlin.jvm.internal.i.a(GoogleApiClient.class).b();
                    kotlin.jvm.internal.i.a(FusedLocationProviderClient.class).b();
                    kotlin.jvm.internal.i.a(LocationServices.class).b();
                    a(Ha.d());
                } catch (NoClassDefFoundError unused) {
                }
            }
        } catch (Exception unused2) {
            String TAG = f14573e;
            kotlin.jvm.internal.g.d(TAG, "TAG");
        }
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        LocationManager locationManager;
        kotlin.jvm.internal.g.e(location, "location");
        try {
            String TAG = f14573e;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            location.getTime();
            location.getLatitude();
            location.getLongitude();
            location.getAccuracy();
            if (c() && (locationManager = f14571b) != null) {
                locationManager.removeUpdates(this);
            }
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String provider) {
        kotlin.jvm.internal.g.e(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String provider) {
        kotlin.jvm.internal.g.e(provider, "provider");
    }

    public static void a(Context context) {
        try {
            GoogleApiClient googleApiClient = f14572d;
            if (googleApiClient == null) {
                String TAG = f14573e;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                kotlin.jvm.internal.g.b(context);
                GoogleApiClient.Builder builder = new GoogleApiClient.Builder(context);
                builder.f10917l.add(new O5());
                builder.f10918m.add(new qb.k());
                Api<Api.ApiOptions.NoOptions> api = LocationServices.f11464a;
                Preconditions.k(api, "Api must not be null");
                builder.f10912g.put(api, null);
                Api.AbstractClientBuilder abstractClientBuilder = api.f10897a;
                Preconditions.k(abstractClientBuilder, "Base client builder must not be null");
                List<Scope> impliedScopes = abstractClientBuilder.getImpliedScopes(null);
                builder.f10908b.addAll(impliedScopes);
                builder.f10907a.addAll(impliedScopes);
                zabe a10 = builder.a();
                f14572d = a10;
                a10.b();
            } else {
                googleApiClient.b();
            }
        } catch (Exception unused) {
            String TAG2 = f14573e;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
        }
    }

    public static final void a(ConnectionResult it) {
        kotlin.jvm.internal.g.e(it, "it");
        f14574f = false;
    }

    public static Location a(int i10, int i11) {
        String bestProvider;
        Location location;
        Criteria criteria = new Criteria();
        criteria.setAccuracy(i10);
        criteria.setPowerRequirement(i11);
        criteria.setCostAllowed(false);
        LocationManager locationManager = f14571b;
        Location location2 = null;
        if (locationManager != null && (bestProvider = locationManager.getBestProvider(criteria, true)) != null) {
            try {
                location = locationManager.getLastKnownLocation(bestProvider);
            } catch (Exception unused) {
                location = null;
            }
            if (location != null || i10 == 1) {
                location2 = location;
            } else {
                LocationManager locationManager2 = f14571b;
                if (locationManager2 != null) {
                    List<String> providers = locationManager2.getProviders(true);
                    kotlin.jvm.internal.g.d(providers, "getProviders(...)");
                    int size = providers.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i12 = size - 1;
                            String str = providers.get(size);
                            try {
                                LocationManager locationManager3 = f14571b;
                                if (locationManager3 != null && locationManager3.isProviderEnabled(str)) {
                                    try {
                                        location2 = locationManager3.getLastKnownLocation(str);
                                    } catch (SecurityException unused2) {
                                    }
                                    if (location2 != null) {
                                        break;
                                    }
                                }
                            } catch (Exception unused3) {
                            }
                            if (i12 < 0) {
                                break;
                            }
                            size = i12;
                        }
                    }
                }
            }
        }
        String TAG = f14573e;
        kotlin.jvm.internal.g.d(TAG, "TAG");
        return location2;
    }

    public static HashMap a(Location location, boolean z10, Location location2) {
        HashMap hashMap = new HashMap();
        Context d10 = Ha.d();
        if (d10 == null) {
            return hashMap;
        }
        if (location != null) {
            if (location.getTime() > 0) {
                hashMap.put("u-ll-ts", Long.valueOf(location.getTime()));
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(location.getLatitude());
            sb2.append(',');
            sb2.append(location.getLongitude());
            sb2.append(',');
            sb2.append((int) location.getAccuracy());
            hashMap.put("u-latlong-accu", sb2.toString());
            hashMap.put("sdk-collected", Integer.valueOf(z10 ? 1 : 0));
        }
        String h10 = Ha.f14324a.h();
        if (h10 == null || Na.a(h10).isLocationEnabled()) {
            hashMap.put("loc-allowed", Integer.valueOf(e() ? 1 : 0));
        }
        if (location2 != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(location2.getLatitude());
            sb3.append(',');
            sb3.append(location2.getLongitude());
            sb3.append(',');
            sb3.append((int) location2.getAccuracy());
            hashMap.put("u-latlong-accu-fine", sb3.toString());
            hashMap.put("u-ll-ts-fine", Long.valueOf(location2.getTime()));
        }
        if (e() && c()) {
            if (AbstractC1684j9.a(d10, "android.permission.ACCESS_COARSE_LOCATION")) {
                hashMap.put("loc-granularity", "coarse");
            }
        } else {
            hashMap.put("loc-granularity", "none");
        }
        return hashMap;
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
