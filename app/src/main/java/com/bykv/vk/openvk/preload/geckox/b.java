package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: GeckoConfig.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: q  reason: collision with root package name */
    private static IThreadPoolCallback f7507q;

    /* renamed from: r  reason: collision with root package name */
    private static ThreadPoolExecutor f7508r;

    /* renamed from: a  reason: collision with root package name */
    public final Context f7509a;

    /* renamed from: b  reason: collision with root package name */
    final com.bykv.vk.openvk.preload.geckox.i.a f7510b;
    public final IStatisticMonitor c;

    /* renamed from: d  reason: collision with root package name */
    public final INetWork f7511d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f7512e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f7513f;

    /* renamed from: g  reason: collision with root package name */
    final com.bykv.vk.openvk.preload.geckox.a.a.a f7514g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f7515h;

    /* renamed from: i  reason: collision with root package name */
    public final String f7516i;

    /* renamed from: j  reason: collision with root package name */
    public final String f7517j;

    /* renamed from: k  reason: collision with root package name */
    public final String f7518k;

    /* renamed from: l  reason: collision with root package name */
    public final String f7519l;

    /* renamed from: m  reason: collision with root package name */
    public final String f7520m;

    /* renamed from: n  reason: collision with root package name */
    public final File f7521n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f7522o;

    /* renamed from: p  reason: collision with root package name */
    public JSONObject f7523p;

    /* compiled from: GeckoConfig.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        INetWork f7524a;

        /* renamed from: b  reason: collision with root package name */
        List<String> f7525b;
        List<String> c;

        /* renamed from: d  reason: collision with root package name */
        Context f7526d;

        /* renamed from: e  reason: collision with root package name */
        com.bykv.vk.openvk.preload.geckox.i.a f7527e;

        /* renamed from: f  reason: collision with root package name */
        IStatisticMonitor f7528f;

        /* renamed from: g  reason: collision with root package name */
        boolean f7529g = true;

        /* renamed from: h  reason: collision with root package name */
        com.bykv.vk.openvk.preload.geckox.a.a.a f7530h;

        /* renamed from: i  reason: collision with root package name */
        Long f7531i;

        /* renamed from: j  reason: collision with root package name */
        String f7532j;

        /* renamed from: k  reason: collision with root package name */
        String f7533k;

        /* renamed from: l  reason: collision with root package name */
        String f7534l;

        /* renamed from: m  reason: collision with root package name */
        File f7535m;

        /* renamed from: n  reason: collision with root package name */
        String f7536n;

        /* renamed from: o  reason: collision with root package name */
        String f7537o;

        public a(Context context) {
            this.f7526d = context.getApplicationContext();
        }
    }

    public /* synthetic */ b(a aVar, byte b10) {
        this(aVar);
    }

    public static Executor a() {
        return c();
    }

    public static Executor b() {
        return c();
    }

    public static ExecutorService c() {
        ExecutorService executorService;
        IThreadPoolCallback iThreadPoolCallback = f7507q;
        if (iThreadPoolCallback != null) {
            executorService = iThreadPoolCallback.getThreadPool();
        } else {
            executorService = null;
        }
        if (executorService != null) {
            return executorService;
        }
        if (f7508r == null) {
            synchronized (b.class) {
                if (f7508r == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    f7508r = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f7508r;
    }

    private b(a aVar) {
        Context context = aVar.f7526d;
        this.f7509a = context;
        if (context != null) {
            List<String> list = aVar.f7525b;
            this.f7512e = list;
            this.f7513f = aVar.c;
            this.f7510b = aVar.f7527e;
            this.f7514g = aVar.f7530h;
            Long l10 = aVar.f7531i;
            this.f7515h = l10;
            if (TextUtils.isEmpty(aVar.f7532j)) {
                this.f7516i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
            } else {
                this.f7516i = aVar.f7532j;
            }
            String str = aVar.f7533k;
            this.f7517j = str;
            this.f7519l = aVar.f7536n;
            this.f7520m = aVar.f7537o;
            File file = aVar.f7535m;
            if (file == null) {
                this.f7521n = new File(context.getFilesDir(), "gecko_offline_res_x");
            } else {
                this.f7521n = file;
            }
            String str2 = aVar.f7534l;
            this.f7518k = str2;
            if (!TextUtils.isEmpty(str2)) {
                if (list == null || list.isEmpty()) {
                    throw new IllegalArgumentException("access key empty");
                }
                if (l10 != null) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f7511d = aVar.f7524a;
                        this.c = aVar.f7528f;
                        this.f7522o = aVar.f7529g;
                        return;
                    }
                    throw new IllegalArgumentException("deviceId key empty");
                }
                throw new IllegalArgumentException("appId == null");
            }
            throw new IllegalArgumentException("host == null");
        }
        throw new IllegalArgumentException("context == null");
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback) {
        f7507q = iThreadPoolCallback;
    }
}
