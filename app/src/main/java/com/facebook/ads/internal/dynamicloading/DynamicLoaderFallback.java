package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
@Keep
/* loaded from: classes.dex */
public class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    /* loaded from: classes.dex */
    public class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f9449a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Map f9450b;
        public final /* synthetic */ List c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ List f9451d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Map f9452e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ List f9453f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ List f9454g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Method f9455h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Method f9456i;

        public a(ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, ArrayList arrayList3, HashMap hashMap2, ArrayList arrayList4, ArrayList arrayList5, Method method, Method method2) {
            this.f9449a = arrayList;
            this.f9450b = hashMap;
            this.c = arrayList2;
            this.f9451d = arrayList3;
            this.f9452e = hashMap2;
            this.f9453f = arrayList4;
            this.f9454g = arrayList5;
            this.f9455h = method;
            this.f9456i = method2;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Object newProxyInstance;
            Map map;
            boolean isPrimitive = method.getReturnType().isPrimitive();
            Map map2 = this.f9450b;
            if (isPrimitive) {
                if (method.getReturnType().equals(Void.TYPE)) {
                    Iterator it = this.f9449a.iterator();
                    while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, map2))) {
                    }
                    for (Method method2 : this.c) {
                        if (DynamicLoaderFallback.equalsMethods(method, method2) && DynamicLoaderFallback.reportError(obj, map2)) {
                            return null;
                        }
                    }
                    return null;
                }
                return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
            } else if (method.getReturnType().equals(String.class)) {
                return "";
            } else {
                if (method.getReturnType().equals(obj.getClass().getInterfaces()[0])) {
                    newProxyInstance = obj;
                } else {
                    newProxyInstance = Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
                }
                Iterator it2 = this.f9451d.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    map = this.f9452e;
                    if (hasNext) {
                        if (DynamicLoaderFallback.equalsMethods(method, (Method) it2.next())) {
                            DynamicLoaderFallback.sApiProxyToAdListenersMap.put(map.get(obj), (AdListener) objArr[0]);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                for (Method method3 : this.f9453f) {
                    if (DynamicLoaderFallback.equalsMethods(method, method3)) {
                        map.put(newProxyInstance, obj);
                    }
                }
                for (Method method4 : this.f9454g) {
                    if (DynamicLoaderFallback.equalsMethods(method, method4)) {
                        for (Object obj2 : objArr) {
                            if (obj2 instanceof Ad) {
                                map2.put(newProxyInstance, (Ad) obj2);
                            }
                        }
                    }
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.f9455h)) {
                    map2.put(objArr[1], (Ad) objArr[0]);
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.f9456i)) {
                    map2.put(objArr[1], (Ad) objArr[0]);
                }
                return newProxyInstance;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdListener f9457a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Ad f9458b;

        public b(AdListener adListener, Ad ad2) {
            this.f9457a = adListener;
            this.f9458b = ad2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f9457a.onError(this.f9458b, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder."));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Method f9459a;

        /* renamed from: b  reason: collision with root package name */
        public final a f9460b = new a();

        /* loaded from: classes.dex */
        public class a implements InvocationHandler {
            public a() {
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if (!"toString".equals(method.getName())) {
                    c.this.f9459a = method;
                    return null;
                }
                return null;
            }
        }

        public final <T> T a(Class<T> cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f9460b));
        }
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        if (method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2)) {
            return true;
        }
        return false;
    }

    @SuppressLint({"Parameter Not Nullable", "CatchGeneralException"})
    public static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        c cVar = new c();
        DynamicLoader dynamicLoader = (DynamicLoader) cVar.a(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(cVar.f9459a);
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(cVar.f9459a);
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(cVar.f9459a);
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(cVar.f9459a);
        dynamicLoader.createNativeAdApi(null, null);
        Method method = cVar.f9459a;
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method method2 = cVar.f9459a;
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) cVar.a(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(cVar.f9459a);
        nativeAdBaseApi.loadAd(null);
        arrayList2.add(cVar.f9459a);
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList4.add(cVar.f9459a);
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) cVar.a(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(cVar.f9459a);
        interstitialAdApi.loadAd(null);
        arrayList2.add(cVar.f9459a);
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.f9459a);
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) cVar.a(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(cVar.f9459a);
        rewardedVideoAdApi.loadAd(null);
        arrayList2.add(cVar.f9459a);
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.f9459a);
        AdViewApi adViewApi = (AdViewApi) cVar.a(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(cVar.f9459a);
        adViewApi.loadAd(null);
        arrayList2.add(cVar.f9459a);
        adViewApi.buildLoadAdConfig();
        arrayList4.add(cVar.f9459a);
        ((AdView.AdViewLoadConfigBuilder) cVar.a(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.f9459a);
        ((NativeAdBase.NativeAdLoadConfigBuilder) cVar.a(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.f9459a);
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) cVar.a(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.f9459a);
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) cVar.a(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.f9459a);
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new a(arrayList, hashMap, arrayList2, arrayList3, hashMap2, arrayList4, arrayList5, method, method2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad2 = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new b(adListener, ad2), 500L);
        return true;
    }
}
