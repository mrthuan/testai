package com.bumptech.glide;

import a4.a;
import a4.b;
import a4.c;
import a4.d;
import a4.e;
import a4.h;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.i;
import androidx.fragment.app.Fragment;
import c4.l;
import c4.q;
import c4.r;
import c4.w;
import c4.y;
import com.android.billingclient.api.a0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.google.android.gms.common.api.Api;
import d4.a;
import i4.j;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lib.zj.pdfeditor.Annotation;
import x3.h;
import x3.i;
import y3.a;
import z3.a;
import z3.b;
import z3.d;
import z3.e;
import z3.f;
import z3.k;
import z3.t;
import z3.u;
import z3.v;
import z3.w;
import z3.x;

/* compiled from: Glide.java */
/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: i  reason: collision with root package name */
    public static volatile b f6831i;

    /* renamed from: j  reason: collision with root package name */
    public static volatile boolean f6832j;

    /* renamed from: a  reason: collision with root package name */
    public final w3.c f6833a;

    /* renamed from: b  reason: collision with root package name */
    public final h f6834b;
    public final d c;

    /* renamed from: d  reason: collision with root package name */
    public final Registry f6835d;

    /* renamed from: e  reason: collision with root package name */
    public final w3.b f6836e;

    /* renamed from: f  reason: collision with root package name */
    public final j f6837f;

    /* renamed from: g  reason: collision with root package name */
    public final i4.c f6838g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f6839h = new ArrayList();

    /* compiled from: Glide.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public b(Context context, com.bumptech.glide.load.engine.e eVar, h hVar, w3.c cVar, w3.b bVar, j jVar, i4.c cVar2, int i10, c cVar3, y.b bVar2, List list) {
        this.f6833a = cVar;
        this.f6836e = bVar;
        this.f6834b = hVar;
        this.f6837f = jVar;
        this.f6838g = cVar2;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f6835d = registry;
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        androidx.core.content.e eVar2 = registry.f6827g;
        synchronized (eVar2) {
            ((List) eVar2.f3529a).add(defaultImageHeaderParser);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            registry.h(new l());
        }
        List<ImageHeaderParser> f10 = registry.f();
        g4.a aVar = new g4.a(context, f10, cVar, bVar);
        y yVar = new y(cVar, new y.g());
        com.bumptech.glide.load.resource.bitmap.a aVar2 = new com.bumptech.glide.load.resource.bitmap.a(registry.f(), resources.getDisplayMetrics(), cVar, bVar);
        c4.e eVar3 = new c4.e(aVar2);
        com.bumptech.glide.load.resource.bitmap.c cVar4 = new com.bumptech.glide.load.resource.bitmap.c(aVar2, bVar);
        e4.d dVar = new e4.d(context);
        t.c cVar5 = new t.c(resources);
        t.d dVar2 = new t.d(resources);
        t.b bVar3 = new t.b(resources);
        t.a aVar3 = new t.a(resources);
        c4.b bVar4 = new c4.b(bVar);
        h4.a aVar4 = new h4.a();
        aj.b bVar5 = new aj.b(0);
        ContentResolver contentResolver = context.getContentResolver();
        registry.b(ByteBuffer.class, new z3.c(0));
        registry.b(InputStream.class, new a0(bVar, 1));
        registry.d(eVar3, ByteBuffer.class, Bitmap.class, Annotation.KEY_ANNOT_BMP);
        registry.d(cVar4, InputStream.class, Bitmap.class, Annotation.KEY_ANNOT_BMP);
        registry.d(new q(aVar2), ParcelFileDescriptor.class, Bitmap.class, Annotation.KEY_ANNOT_BMP);
        registry.d(yVar, ParcelFileDescriptor.class, Bitmap.class, Annotation.KEY_ANNOT_BMP);
        registry.d(new y(cVar, new y.c()), AssetFileDescriptor.class, Bitmap.class, Annotation.KEY_ANNOT_BMP);
        v.a<?> aVar5 = v.a.f32286a;
        registry.a(Bitmap.class, Bitmap.class, aVar5);
        registry.d(new w(), Bitmap.class, Bitmap.class, Annotation.KEY_ANNOT_BMP);
        registry.c(Bitmap.class, bVar4);
        registry.d(new c4.a(resources, eVar3), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        registry.d(new c4.a(resources, cVar4), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        registry.d(new c4.a(resources, yVar), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        registry.c(BitmapDrawable.class, new i(cVar, bVar4));
        registry.d(new g4.i(f10, aVar, bVar), InputStream.class, g4.c.class, "Gif");
        registry.d(aVar, ByteBuffer.class, g4.c.class, "Gif");
        registry.c(g4.c.class, new z3.c(1));
        registry.a(s3.a.class, s3.a.class, aVar5);
        registry.d(new g4.g(cVar), s3.a.class, Bitmap.class, Annotation.KEY_ANNOT_BMP);
        registry.d(dVar, Uri.class, Drawable.class, "legacy_append");
        registry.d(new r(dVar, cVar), Uri.class, Bitmap.class, "legacy_append");
        registry.i(new a.C0192a());
        registry.a(File.class, ByteBuffer.class, new d.b());
        registry.a(File.class, InputStream.class, new f.e());
        registry.d(new f4.a(), File.class, File.class, "legacy_append");
        registry.a(File.class, ParcelFileDescriptor.class, new f.b());
        registry.a(File.class, File.class, aVar5);
        registry.i(new k.a(bVar));
        registry.i(new ParcelFileDescriptorRewinder.a());
        Class cls = Integer.TYPE;
        registry.a(cls, InputStream.class, cVar5);
        registry.a(cls, ParcelFileDescriptor.class, bVar3);
        registry.a(Integer.class, InputStream.class, cVar5);
        registry.a(Integer.class, ParcelFileDescriptor.class, bVar3);
        registry.a(Integer.class, Uri.class, dVar2);
        registry.a(cls, AssetFileDescriptor.class, aVar3);
        registry.a(Integer.class, AssetFileDescriptor.class, aVar3);
        registry.a(cls, Uri.class, dVar2);
        registry.a(String.class, InputStream.class, new e.c());
        registry.a(Uri.class, InputStream.class, new e.c());
        registry.a(String.class, InputStream.class, new u.c());
        registry.a(String.class, ParcelFileDescriptor.class, new u.b());
        registry.a(String.class, AssetFileDescriptor.class, new u.a());
        registry.a(Uri.class, InputStream.class, new b.a());
        registry.a(Uri.class, InputStream.class, new a.c(context.getAssets()));
        registry.a(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets()));
        registry.a(Uri.class, InputStream.class, new c.a(context));
        registry.a(Uri.class, InputStream.class, new d.a(context));
        if (i11 >= 29) {
            registry.a(Uri.class, InputStream.class, new e.c(context));
            registry.a(Uri.class, ParcelFileDescriptor.class, new e.b(context));
        }
        registry.a(Uri.class, InputStream.class, new w.d(contentResolver));
        registry.a(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver));
        registry.a(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver));
        registry.a(Uri.class, InputStream.class, new x.a());
        registry.a(URL.class, InputStream.class, new h.a());
        registry.a(Uri.class, File.class, new k.a(context));
        registry.a(z3.g.class, InputStream.class, new a.C0001a());
        registry.a(byte[].class, ByteBuffer.class, new b.a());
        registry.a(byte[].class, InputStream.class, new b.d());
        registry.a(Uri.class, Uri.class, aVar5);
        registry.a(Drawable.class, Drawable.class, aVar5);
        registry.d(new e4.e(), Drawable.class, Drawable.class, "legacy_append");
        registry.j(Bitmap.class, BitmapDrawable.class, new f2.t(resources));
        registry.j(Bitmap.class, byte[].class, aVar4);
        registry.j(Drawable.class, byte[].class, new h3.g(cVar, aVar4, bVar5));
        registry.j(g4.c.class, byte[].class, bVar5);
        y yVar2 = new y(cVar, new y.d());
        registry.d(yVar2, ByteBuffer.class, Bitmap.class, "legacy_append");
        registry.d(new c4.a(resources, yVar2), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        this.c = new d(context, bVar, registry, new kotlinx.coroutines.y(0), cVar3, bVar2, list, eVar, i10);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        int i10;
        w3.c dVar;
        if (!f6832j) {
            f6832j = true;
            y.b bVar = new y.b();
            c cVar = new c();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            Log.isLoggable("ManifestParser", 3);
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData == null) {
                    Log.isLoggable("ManifestParser", 3);
                } else {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Objects.toString(applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(j4.e.a(str));
                            Log.isLoggable("ManifestParser", 3);
                        }
                    }
                    Log.isLoggable("ManifestParser", 3);
                }
                if (generatedAppGlideModule != null && !generatedAppGlideModule.c().isEmpty()) {
                    Set<Class<?>> c = generatedAppGlideModule.c();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        j4.c cVar2 = (j4.c) it.next();
                        if (c.contains(cVar2.getClass())) {
                            if (Log.isLoggable("Glide", 3)) {
                                cVar2.toString();
                            }
                            it.remove();
                        }
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((j4.c) it2.next()).getClass().toString();
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((j4.c) it3.next()).b();
                }
                if (y3.a.c == 0) {
                    y3.a.c = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i11 = y3.a.c;
                if (!TextUtils.isEmpty("source")) {
                    y3.a aVar = new y3.a(new ThreadPoolExecutor(i11, i11, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0413a("source", false)));
                    int i12 = y3.a.c;
                    if (!TextUtils.isEmpty("disk-cache")) {
                        y3.a aVar2 = new y3.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0413a("disk-cache", true)));
                        if (y3.a.c == 0) {
                            y3.a.c = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        if (y3.a.c >= 4) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        if (!TextUtils.isEmpty("animation")) {
                            y3.a aVar3 = new y3.a(new ThreadPoolExecutor(i10, i10, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0413a("animation", true)));
                            x3.i iVar = new x3.i(new i.a(applicationContext));
                            i4.e eVar = new i4.e();
                            int i13 = iVar.f31606a;
                            if (i13 > 0) {
                                dVar = new w3.i(i13);
                            } else {
                                dVar = new w3.d();
                            }
                            w3.h hVar = new w3.h(iVar.f31608d);
                            x3.g gVar = new x3.g(iVar.f31607b);
                            b bVar2 = new b(applicationContext, new com.bumptech.glide.load.engine.e(gVar, new x3.f(applicationContext), aVar2, aVar, new y3.a(new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, y3.a.f32039b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.ThreadFactoryC0413a("source-unlimited", false))), aVar3), gVar, dVar, hVar, new j(null), eVar, 4, cVar, bVar, Collections.emptyList());
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                j4.c cVar3 = (j4.c) it4.next();
                                try {
                                    cVar3.a();
                                } catch (AbstractMethodError e10) {
                                    throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(cVar3.getClass().getName()), e10);
                                }
                            }
                            applicationContext.registerComponentCallbacks(bVar2);
                            f6831i = bVar2;
                            f6832j = false;
                            return;
                        }
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                    }
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            } catch (PackageManager.NameNotFoundException e11) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e11);
            }
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    public static b b(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f6831i == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                Log.isLoggable("Glide", 5);
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            }
            synchronized (b.class) {
                if (f6831i == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return f6831i;
    }

    public static j c(Context context) {
        if (context != null) {
            return b(context).f6837f;
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public static f f(Context context) {
        return c(context).f(context);
    }

    public static f g(View view) {
        j c = c(view.getContext());
        c.getClass();
        if (p4.j.f()) {
            return c.f(view.getContext().getApplicationContext());
        }
        if (view.getContext() != null) {
            Activity a10 = j.a(view.getContext());
            if (a10 == null) {
                return c.f(view.getContext().getApplicationContext());
            }
            if (a10 instanceof androidx.fragment.app.u) {
                androidx.fragment.app.u uVar = (androidx.fragment.app.u) a10;
                y.b<View, Fragment> bVar = c.f18454f;
                bVar.clear();
                j.c(bVar, uVar.getSupportFragmentManager().H());
                View findViewById = uVar.findViewById(16908290);
                Fragment fragment = null;
                while (!view.equals(findViewById) && (fragment = bVar.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                bVar.clear();
                if (fragment != null) {
                    return c.g(fragment);
                }
                return c.h(uVar);
            }
            y.b<View, android.app.Fragment> bVar2 = c.f18455g;
            bVar2.clear();
            c.b(a10.getFragmentManager(), bVar2);
            View findViewById2 = a10.findViewById(16908290);
            android.app.Fragment fragment2 = null;
            while (!view.equals(findViewById2) && (fragment2 = bVar2.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            bVar2.clear();
            if (fragment2 == null) {
                return c.e(a10);
            }
            if (fragment2.getActivity() != null) {
                if (!p4.j.f()) {
                    return c.d(fragment2.getActivity(), fragment2.getChildFragmentManager(), fragment2, fragment2.isVisible());
                }
                return c.f(fragment2.getActivity().getApplicationContext());
            }
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        throw new NullPointerException("Unable to obtain a request manager for a view without a Context");
    }

    public final void d(f fVar) {
        synchronized (this.f6839h) {
            if (!this.f6839h.contains(fVar)) {
                this.f6839h.add(fVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public final void e(f fVar) {
        synchronized (this.f6839h) {
            if (this.f6839h.contains(fVar)) {
                this.f6839h.remove(fVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        boolean z10;
        char[] cArr = p4.j.f23703a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ((p4.g) this.f6834b).e(0L);
            this.f6833a.b();
            this.f6836e.b();
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        boolean z10;
        long j10;
        char[] cArr = p4.j.f23703a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Iterator it = this.f6839h.iterator();
            while (it.hasNext()) {
                ((f) it.next()).getClass();
            }
            x3.g gVar = (x3.g) this.f6834b;
            gVar.getClass();
            if (i10 >= 40) {
                gVar.e(0L);
            } else if (i10 >= 20 || i10 == 15) {
                synchronized (gVar) {
                    j10 = gVar.f23699b;
                }
                gVar.e(j10 / 2);
            }
            this.f6833a.a(i10);
            this.f6836e.a(i10);
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
