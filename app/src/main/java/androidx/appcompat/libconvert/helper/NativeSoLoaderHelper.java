package androidx.appcompat.libconvert.helper;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.w;
import cg.l;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.b1;
import com.google.android.play.core.assetpacks.c;
import com.google.android.play.core.assetpacks.d;
import com.google.android.play.core.assetpacks.h0;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.x;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper$Companion$convertPDF2Word$1;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: NativeSoLoaderHelper.kt */
/* loaded from: classes.dex */
public final class NativeSoLoaderHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1933a = "python-arm64-v8a/python/arm64-v8a/";

    /* renamed from: b  reason: collision with root package name */
    public static final String f1934b = "python-armeabi-v7a/python/armeabi-v7a/";
    public static String c = "";

    /* renamed from: d  reason: collision with root package name */
    public static final int f1935d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f1936e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final int f1937f = 3;

    /* renamed from: g  reason: collision with root package name */
    public static String f1938g = "pdf2word-arm64-v8a-102P.zip";

    /* renamed from: h  reason: collision with root package name */
    public static String f1939h = "python-arm64-v8a";

    /* renamed from: i  reason: collision with root package name */
    public static String f1940i = "python-arm64-v8a/python/arm64-v8a/";

    /* renamed from: j  reason: collision with root package name */
    public static final w<Integer> f1941j;

    /* renamed from: k  reason: collision with root package name */
    public static final w<Integer> f1942k;

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicBoolean f1943l;

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicBoolean f1944m;

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicBoolean f1945n;

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicBoolean f1946o;

    /* renamed from: p  reason: collision with root package name */
    public static a f1947p;

    /* compiled from: NativeSoLoaderHelper.kt */
    /* loaded from: classes.dex */
    public static final class Companion {

        /* compiled from: NativeSoLoaderHelper.kt */
        /* loaded from: classes.dex */
        public static final class a implements t9.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef<String> f1948a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Ref$LongRef f1949b;
            public final /* synthetic */ Activity c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ com.google.android.play.core.assetpacks.b f1950d;

            public a(Ref$ObjectRef<String> ref$ObjectRef, Ref$LongRef ref$LongRef, Activity activity, com.google.android.play.core.assetpacks.b bVar) {
                this.f1948a = ref$ObjectRef;
                this.f1949b = ref$LongRef;
                this.c = activity;
                this.f1950d = bVar;
            }

            @Override // t9.a
            public final void a(Object obj) {
                AssetPackState state = (AssetPackState) obj;
                g.e(state, "state");
                state.g();
                state.h();
                state.d();
                state.i();
                if (TextUtils.equals(this.f1948a.element, state.g())) {
                    int h10 = state.h();
                    if (h10 != 0) {
                        if (h10 != 2) {
                            Activity activity = this.c;
                            switch (h10) {
                                case 4:
                                    System.currentTimeMillis();
                                    long j10 = this.f1949b.element;
                                    String str = NativeSoLoaderHelper.f1933a;
                                    a aVar = NativeSoLoaderHelper.f1947p;
                                    if (aVar != null) {
                                        tn.a.d(ReaderPdfApplication.m(), ea.a.p("PzJGXx1vQG42bytk", "6ImzVmrB"), ea.a.p("OTIYX11vTm4XcxNjV2Ukcw==", "TjIo99NC"), ReaderPdfApplication.a(ReaderPdfApplication.this), false);
                                    }
                                    Companion.r(activity);
                                    return;
                                case 5:
                                    state.e();
                                    NativeSoLoaderHelper.f1941j.k(Integer.valueOf(NativeSoLoaderHelper.f1937f));
                                    a aVar2 = NativeSoLoaderHelper.f1947p;
                                    if (aVar2 != null) {
                                        ((ReaderPdfApplication.d) aVar2).b();
                                    }
                                    NativeSoLoaderHelper.f1943l.set(false);
                                    return;
                                case 6:
                                    NativeSoLoaderHelper.f1941j.k(Integer.valueOf(NativeSoLoaderHelper.f1937f));
                                    if (NativeSoLoaderHelper.f1947p != null) {
                                        tn.a.b(ReaderPdfApplication.m(), ea.a.p("QzI8XxdvFW4eb1Vk", "v05v4fvP"), ea.a.p("ITINXyxvI24XYwduV2Vs", "3OQzHTNI"));
                                    }
                                    NativeSoLoaderHelper.f1943l.set(false);
                                    return;
                                case 7:
                                    NativeSoLoaderHelper.f1941j.k(0);
                                    NativeSoLoaderHelper.f1943l.set(false);
                                    return;
                                case 8:
                                    NativeSoLoaderHelper.f1941j.k(0);
                                    NativeSoLoaderHelper.f1943l.set(false);
                                    return;
                                case 9:
                                    NativeSoLoaderHelper.f1941j.k(Integer.valueOf(NativeSoLoaderHelper.f1935d));
                                    this.f1950d.c(activity);
                                    NativeSoLoaderHelper.f1943l.set(false);
                                    return;
                                default:
                                    return;
                            }
                        }
                        NativeSoLoaderHelper.f1941j.k(Integer.valueOf(NativeSoLoaderHelper.f1935d));
                        NativeSoLoaderHelper.f1943l.set(false);
                        return;
                    }
                    NativeSoLoaderHelper.f1941j.k(0);
                    NativeSoLoaderHelper.f1943l.set(false);
                }
            }
        }

        /* compiled from: NativeSoLoaderHelper.kt */
        /* loaded from: classes.dex */
        public static final class b implements OnFailureListener {
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                exc.toString();
                NativeSoLoaderHelper.f1941j.k(Integer.valueOf(NativeSoLoaderHelper.f1937f));
                a aVar = NativeSoLoaderHelper.f1947p;
                if (aVar != null) {
                    ((ReaderPdfApplication.d) aVar).b();
                }
                NativeSoLoaderHelper.f1943l.set(false);
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(5:3|(1:5)|14|7|(2:9|10)(2:12|13))|15|16|(2:17|(3:19|(1:32)(3:21|22|(2:30|31)(2:24|(2:26|27)(1:28)))|29)(2:33|34))|14|7|(0)(0)|(1:(6:35|36|(5:38|(2:40|(3:42|7|(0)(0)))(0)|14|7|(0)(0))|43|7|(0)(0)))) */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
            r0.printStackTrace();
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
            if (r0.contains("armeabi-v7a") != false) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void c() {
            /*
                java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS
                int r1 = r0.length
                r2 = 0
                java.lang.String r3 = "ARMv8"
                java.lang.String r4 = "ARMv7"
                if (r1 <= 0) goto L20
                r0 = r0[r2]
                java.lang.String r1 = "arm64-v8a"
                boolean r1 = r0.contains(r1)
                if (r1 == 0) goto L16
                goto L86
            L16:
                java.lang.String r1 = "armeabi-v7a"
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L20
                goto L99
            L20:
                java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L5c
                java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Exception -> L5c
                java.lang.String r5 = "/proc/cpuinfo"
                r1.<init>(r5)     // Catch: java.lang.Exception -> L5c
                r0.<init>(r1)     // Catch: java.lang.Exception -> L5c
            L2c:
                java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L52
                if (r1 == 0) goto L4e
                java.lang.String r5 = "Processor"
                boolean r5 = r1.contains(r5)     // Catch: java.lang.Throwable -> L52
                if (r5 == 0) goto L2c
                boolean r5 = r1.contains(r3)     // Catch: java.lang.Throwable -> L52
                if (r5 == 0) goto L44
                r0.close()     // Catch: java.lang.Exception -> L5c
                goto L86
            L44:
                boolean r1 = r1.contains(r4)     // Catch: java.lang.Throwable -> L52
                if (r1 == 0) goto L2c
                r0.close()     // Catch: java.lang.Exception -> L5c
                goto L99
            L4e:
                r0.close()     // Catch: java.lang.Exception -> L5c
                goto L60
            L52:
                r1 = move-exception
                r0.close()     // Catch: java.lang.Throwable -> L57
                goto L5b
            L57:
                r0 = move-exception
                r1.addSuppressed(r0)     // Catch: java.lang.Exception -> L5c
            L5b:
                throw r1     // Catch: java.lang.Exception -> L5c
            L5c:
                r0 = move-exception
                r0.printStackTrace()
            L60:
                java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Exception -> L95
                java.lang.String r1 = "arch"
                java.lang.Process r0 = r0.exec(r1)     // Catch: java.lang.Exception -> L95
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L95
                java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L95
                java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Exception -> L95
                r5.<init>(r0)     // Catch: java.lang.Exception -> L95
                r1.<init>(r5)     // Catch: java.lang.Exception -> L95
                java.lang.String r0 = r1.readLine()     // Catch: java.lang.Exception -> L95
                if (r0 == 0) goto L91
                java.lang.String r5 = "aarch64"
                boolean r5 = r0.contains(r5)     // Catch: java.lang.Exception -> L95
                if (r5 == 0) goto L88
            L86:
                r4 = r3
                goto L99
            L88:
                java.lang.String r5 = "armv7"
                boolean r0 = r0.contains(r5)     // Catch: java.lang.Exception -> L95
                if (r0 == 0) goto L91
                goto L99
            L91:
                r1.close()     // Catch: java.lang.Exception -> L95
                goto L99
            L95:
                r0 = move-exception
                r0.printStackTrace()
            L99:
                boolean r0 = kotlin.text.k.O(r4, r3, r2)
                java.lang.String r1 = "<set-?>"
                if (r0 == 0) goto Lb1
                java.lang.String r0 = "pdf2word-arm64-v8a-102P.zip"
                androidx.appcompat.libconvert.helper.NativeSoLoaderHelper.f1938g = r0
                java.lang.String r0 = "python-arm64-v8a"
                androidx.appcompat.libconvert.helper.NativeSoLoaderHelper.f1939h = r0
                java.lang.String r0 = androidx.appcompat.libconvert.helper.NativeSoLoaderHelper.f1933a
                kotlin.jvm.internal.g.e(r0, r1)
                androidx.appcompat.libconvert.helper.NativeSoLoaderHelper.f1940i = r0
                goto Lc0
            Lb1:
                java.lang.String r0 = "pdf2word-armeabi-v7a-102P.zip"
                androidx.appcompat.libconvert.helper.NativeSoLoaderHelper.f1938g = r0
                java.lang.String r0 = "python-armeabi-v7a"
                androidx.appcompat.libconvert.helper.NativeSoLoaderHelper.f1939h = r0
                java.lang.String r0 = androidx.appcompat.libconvert.helper.NativeSoLoaderHelper.f1934b
                kotlin.jvm.internal.g.e(r0, r1)
                androidx.appcompat.libconvert.helper.NativeSoLoaderHelper.f1940i = r0
            Lc0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.libconvert.helper.NativeSoLoaderHelper.Companion.c():void");
        }

        public static void d(Activity activity) {
            t0.d0(x.a(j0.f20207b), null, null, new NativeSoLoaderHelper$Companion$deleteDynamicSo$1(activity, null), 3);
        }

        public static void e(Context context) {
            if (context != null) {
                AtomicBoolean atomicBoolean = NativeSoLoaderHelper.f1946o;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean.set(true);
                System.currentTimeMillis();
                if (TextUtils.isEmpty(NativeSoLoaderHelper.c)) {
                    String absolutePath = context.getFilesDir().getAbsolutePath();
                    g.d(absolutePath, "context.filesDir.absolutePath");
                    NativeSoLoaderHelper.c = absolutePath;
                }
                try {
                    try {
                        File file = new File(NativeSoLoaderHelper.c, NativeSoLoaderHelper.f1939h);
                        if (file.exists()) {
                            bg.b.z0(file);
                            a aVar = NativeSoLoaderHelper.f1947p;
                            if (aVar != null) {
                                ((ReaderPdfApplication.d) aVar).a();
                            }
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        atomicBoolean = NativeSoLoaderHelper.f1946o;
                    }
                    atomicBoolean.set(false);
                    System.currentTimeMillis();
                } catch (Throwable th2) {
                    NativeSoLoaderHelper.f1946o.set(false);
                    throw th2;
                }
            }
        }

        public static void f(Activity activity, boolean z10, DownloadSource downloadSource) {
            com.google.android.play.core.assetpacks.b bVar;
            if (activity == null || !NativeSoLoaderHelper.f1943l.compareAndSet(false, true)) {
                return;
            }
            c();
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = "libpdf2docx_v8a";
            if (TextUtils.equals(NativeSoLoaderHelper.f1938g, "pdf2word-arm64-v8a-102P.zip")) {
                ref$ObjectRef.element = "libpdf2docx_v8a";
            } else {
                ref$ObjectRef.element = "libpdf2docx_v7a";
            }
            Context applicationContext = activity.getApplicationContext();
            synchronized (c.class) {
                bVar = (com.google.android.play.core.assetpacks.b) b1.l(applicationContext).f13358a.a();
            }
            g.d(bVar, "getInstance(activity.applicationContext)");
            h0 d10 = bVar.d((String) ref$ObjectRef.element);
            if (z10 && d10 != null && !new File(d10.f13247d, NativeSoLoaderHelper.f1938g).exists()) {
                bVar.f((String) ref$ObjectRef.element);
                d10 = null;
            }
            Ref$LongRef ref$LongRef = new Ref$LongRef();
            if (d10 == null) {
                Objects.toString(NativeSoLoaderHelper.f1942k);
                NativeSoLoaderHelper.f1941j.k(Integer.valueOf(NativeSoLoaderHelper.f1935d));
                bVar.e(new a(ref$ObjectRef, ref$LongRef, activity, bVar));
                bVar.b(ge.a.H(ref$ObjectRef.element)).b(new OnCompleteListener() { // from class: androidx.appcompat.libconvert.helper.a
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:3:0x000c, B:5:0x001b, B:7:0x0027, B:13:0x0033, B:15:0x003d, B:17:0x0042, B:18:0x0046, B:20:0x004c), top: B:25:0x000c }] */
                    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void onComplete(com.google.android.gms.tasks.Task r3) {
                        /*
                            r2 = this;
                            kotlin.jvm.internal.Ref$ObjectRef r0 = kotlin.jvm.internal.Ref$ObjectRef.this
                            java.lang.String r1 = "$assetPackName"
                            kotlin.jvm.internal.g.e(r0, r1)
                            java.lang.String r1 = "task"
                            kotlin.jvm.internal.g.e(r3, r1)
                            r3.m()     // Catch: java.lang.Exception -> L50
                            r3.o()     // Catch: java.lang.Exception -> L50
                            r3.n()     // Catch: java.lang.Exception -> L50
                            boolean r1 = r3.o()     // Catch: java.lang.Exception -> L50
                            if (r1 == 0) goto L46
                            java.lang.Object r3 = r3.k()     // Catch: java.lang.Exception -> L50
                            com.google.android.play.core.assetpacks.d r3 = (com.google.android.play.core.assetpacks.d) r3     // Catch: java.lang.Exception -> L50
                            java.util.Map r3 = r3.b()     // Catch: java.lang.Exception -> L50
                            if (r3 == 0) goto L30
                            boolean r1 = r3.isEmpty()     // Catch: java.lang.Exception -> L50
                            if (r1 == 0) goto L2e
                            goto L30
                        L2e:
                            r1 = 0
                            goto L31
                        L30:
                            r1 = 1
                        L31:
                            if (r1 != 0) goto L54
                            T r0 = r0.element     // Catch: java.lang.Exception -> L50
                            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Exception -> L50
                            com.google.android.play.core.assetpacks.AssetPackState r3 = (com.google.android.play.core.assetpacks.AssetPackState) r3     // Catch: java.lang.Exception -> L50
                            if (r3 == 0) goto L40
                            r3.h()     // Catch: java.lang.Exception -> L50
                        L40:
                            if (r3 == 0) goto L54
                            r3.g()     // Catch: java.lang.Exception -> L50
                            goto L54
                        L46:
                            java.lang.Exception r3 = r3.j()     // Catch: java.lang.Exception -> L50
                            if (r3 == 0) goto L54
                            r3.printStackTrace()     // Catch: java.lang.Exception -> L50
                            goto L54
                        L50:
                            r3 = move-exception
                            r3.toString()
                        L54:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.libconvert.helper.a.onComplete(com.google.android.gms.tasks.Task):void");
                    }
                }).e(new androidx.appcompat.libconvert.helper.b(new l<d, tf.d>() { // from class: androidx.appcompat.libconvert.helper.NativeSoLoaderHelper$Companion$downloadDynamic$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(d dVar) {
                        invoke2(dVar);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(d dVar) {
                        Map<String, AssetPackState> b10 = dVar.b();
                        if (b10 == null || b10.isEmpty()) {
                            return;
                        }
                        AssetPackState assetPackState = b10.get(ref$ObjectRef.element);
                        if (assetPackState != null) {
                            assetPackState.h();
                        }
                        if (assetPackState != null) {
                            assetPackState.g();
                        }
                    }
                }, 0)).r(new b());
                bVar.a(ge.a.H(ref$ObjectRef.element));
                a aVar = NativeSoLoaderHelper.f1947p;
                if (aVar != null) {
                    ReaderPdfApplication.d dVar = (ReaderPdfApplication.d) aVar;
                    if (downloadSource != null) {
                        ReaderPdfApplication.f23866r = downloadSource;
                    }
                    tn.a.d(ReaderPdfApplication.m(), ea.a.p("PzJGXx1vQG42bytk", "WslvIFQA"), ea.a.p("PzJGXx1vQG4FcyJvdw==", "Ip4wn3ZT"), ReaderPdfApplication.a(ReaderPdfApplication.this), false);
                }
                ref$LongRef.element = System.currentTimeMillis();
                return;
            }
            r(activity);
        }

        public static boolean g() {
            Integer d10 = NativeSoLoaderHelper.f1942k.d();
            int i10 = NativeSoLoaderHelper.f1936e;
            if (d10 != null && d10.intValue() == i10) {
                return true;
            }
            return false;
        }

        public static boolean h() {
            Integer d10 = NativeSoLoaderHelper.f1942k.d();
            int i10 = NativeSoLoaderHelper.f1935d;
            if (d10 != null && d10.intValue() == i10) {
                return true;
            }
            return false;
        }

        public static AtomicBoolean i() {
            return NativeSoLoaderHelper.f1944m;
        }

        public static int j() {
            return NativeSoLoaderHelper.f1936e;
        }

        public static String k() {
            return NativeSoLoaderHelper.f1938g;
        }

        public static void l() {
            String str = NativeSoLoaderHelper.f1933a;
        }

        public static String m() {
            return NativeSoLoaderHelper.c;
        }

        public static String n() {
            return NativeSoLoaderHelper.f1939h;
        }

        public static AtomicBoolean o() {
            return NativeSoLoaderHelper.f1945n;
        }

        public static void p(String str) {
            NativeSoLoaderHelper.c = str;
        }

        public static void q(Activity activity, String str, PDF2WordHelper$Companion$convertPDF2Word$1.a aVar) {
            t0.d0(x.a(j0.f20207b), null, null, new NativeSoLoaderHelper$Companion$unZipAndLoadSo$1(activity, aVar, str, null), 3);
        }

        public static void r(Context context) {
            String str;
            com.google.android.play.core.assetpacks.b bVar;
            if (context == null) {
                NativeSoLoaderHelper.f1943l.set(false);
                return;
            }
            if (TextUtils.equals(NativeSoLoaderHelper.f1938g, "pdf2word-arm64-v8a-102P.zip")) {
                str = "libpdf2docx_v8a";
            } else {
                str = "libpdf2docx_v7a";
            }
            Context applicationContext = context.getApplicationContext();
            synchronized (c.class) {
                bVar = (com.google.android.play.core.assetpacks.b) b1.l(applicationContext).f13358a.a();
            }
            g.d(bVar, "getInstance(context.applicationContext)");
            h0 d10 = bVar.d(str);
            if (d10 != null) {
                String str2 = d10.f13247d;
                if (str2 != null) {
                    NativeSoLoaderHelper.c = str2;
                    NativeSoLoaderHelper.f1941j.k(Integer.valueOf(NativeSoLoaderHelper.f1936e));
                }
            } else {
                bVar.f(str);
                NativeSoLoaderHelper.f1941j.k(Integer.valueOf(NativeSoLoaderHelper.f1937f));
            }
            NativeSoLoaderHelper.f1943l.set(false);
        }
    }

    /* compiled from: NativeSoLoaderHelper.kt */
    /* loaded from: classes.dex */
    public enum DownloadSource {
        FromApp,
        FromHome,
        FromTools,
        FromMore,
        FromPreview
    }

    /* compiled from: NativeSoLoaderHelper.kt */
    /* loaded from: classes.dex */
    public enum DynamicErrorCode {
        IllegalActivity(-100),
        Unzipping(-101),
        UnExists(-102),
        Downloading(-103),
        DownloadFailed(-104),
        EmptyPassword(-105),
        ErrorPassword(-106),
        UnzipFailed(-107),
        UnzipCancel(-108),
        NoFoundPython(-109),
        NoSpaceException(-110),
        UnZipException(-111);
        
        private final int value;

        DynamicErrorCode(int i10) {
            this.value = i10;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* compiled from: NativeSoLoaderHelper.kt */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: NativeSoLoaderHelper.kt */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();

        void c(DynamicErrorCode dynamicErrorCode);

        void d(DynamicErrorCode dynamicErrorCode);

        void e(int i10);
    }

    static {
        new Companion();
        w<Integer> wVar = new w<>();
        f1941j = wVar;
        f1942k = wVar;
        f1943l = new AtomicBoolean(false);
        f1944m = new AtomicBoolean(false);
        f1945n = new AtomicBoolean(false);
        f1946o = new AtomicBoolean(false);
    }
}
