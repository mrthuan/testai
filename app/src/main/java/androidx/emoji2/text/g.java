package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f3617i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static volatile g f3618j;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f3619a;

    /* renamed from: b  reason: collision with root package name */
    public final y.d f3620b;
    public volatile int c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f3621d;

    /* renamed from: e  reason: collision with root package name */
    public final a f3622e;

    /* renamed from: f  reason: collision with root package name */
    public final InterfaceC0016g f3623f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3624g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.emoji2.text.e f3625h;

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public volatile k f3626b;
        public volatile o c;
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final g f3627a;

        public b(g gVar) {
            this.f3627a = gVar;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final InterfaceC0016g f3628a;

        /* renamed from: b  reason: collision with root package name */
        public int f3629b = 0;
        public final androidx.emoji2.text.e c = new androidx.emoji2.text.e();

        public c(InterfaceC0016g interfaceC0016g) {
            this.f3628a = interfaceC0016g;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface d {
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f3630a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3631b;

        public f(List list, int i10, Throwable th2) {
            if (list != null) {
                this.f3630a = new ArrayList(list);
                this.f3631b = i10;
                return;
            }
            throw new NullPointerException("initCallbacks cannot be null");
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f3630a;
            int size = arrayList.size();
            int i10 = 0;
            if (this.f3631b != 1) {
                while (i10 < size) {
                    ((e) arrayList.get(i10)).a();
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                ((e) arrayList.get(i10)).b();
                i10++;
            }
        }
    }

    /* compiled from: EmojiCompat.java */
    /* renamed from: androidx.emoji2.text.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0016g {
        void a(h hVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract void a(Throwable th2);

        public abstract void b(o oVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class i {
    }

    public g(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f3619a = reentrantReadWriteLock;
        this.c = 3;
        InterfaceC0016g interfaceC0016g = aVar.f3628a;
        this.f3623f = interfaceC0016g;
        int i10 = aVar.f3629b;
        this.f3624g = i10;
        this.f3625h = aVar.c;
        this.f3621d = new Handler(Looper.getMainLooper());
        this.f3620b = new y.d();
        a aVar2 = new a(this);
        this.f3622e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th2) {
                this.f3619a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                interfaceC0016g.a(new androidx.emoji2.text.f(aVar2));
            } catch (Throwable th3) {
                d(th3);
            }
        }
    }

    public static g a() {
        g gVar;
        boolean z10;
        synchronized (f3617i) {
            gVar = f3618j;
            if (gVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return gVar;
    }

    public final int b() {
        this.f3619a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.f3619a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z10;
        boolean z11 = true;
        if (this.f3624g == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (b() != 1) {
                z11 = false;
            }
            if (z11) {
                return;
            }
            this.f3619a.writeLock().lock();
            try {
                if (this.c == 0) {
                    return;
                }
                this.c = 0;
                this.f3619a.writeLock().unlock();
                a aVar = this.f3622e;
                g gVar = aVar.f3627a;
                try {
                    gVar.f3623f.a(new androidx.emoji2.text.f(aVar));
                    return;
                } catch (Throwable th2) {
                    gVar.d(th2);
                    return;
                }
            } finally {
                this.f3619a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f3619a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.f3620b);
            this.f3620b.clear();
            this.f3619a.writeLock().unlock();
            this.f3621d.post(new f(arrayList, this.c, th2));
        } catch (Throwable th3) {
            this.f3619a.writeLock().unlock();
            throw th3;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f3619a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.f3620b);
            this.f3620b.clear();
            this.f3619a.writeLock().unlock();
            this.f3621d.post(new f(arrayList, this.c, null));
        } catch (Throwable th2) {
            this.f3619a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e1, code lost:
        if (r3.b(r15, r6, r13, r5.f3644d.f3662b) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e3, code lost:
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e5, code lost:
        r0 = new androidx.emoji2.text.t((android.text.Spannable) new android.text.SpannableString(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ef, code lost:
        r10 = r5.f3644d.f3662b;
        r3.f3640a.getClass();
        r0.setSpan(new androidx.emoji2.text.q(r10), r6, r13, 33);
        r7 = r7 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008f, B:50:0x009b, B:51:0x009e, B:53:0x00ab, B:56:0x00b3, B:62:0x00cd, B:68:0x00d9, B:71:0x00e5, B:72:0x00ef, B:74:0x0104, B:76:0x010b, B:77:0x0110, B:79:0x011b, B:80:0x0120, B:82:0x0124, B:84:0x012a, B:86:0x012e, B:91:0x0139, B:94:0x0145, B:95:0x014b, B:97:0x015e, B:40:0x0076), top: B:117:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0145 A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008f, B:50:0x009b, B:51:0x009e, B:53:0x00ab, B:56:0x00b3, B:62:0x00cd, B:68:0x00d9, B:71:0x00e5, B:72:0x00ef, B:74:0x0104, B:76:0x010b, B:77:0x0110, B:79:0x011b, B:80:0x0120, B:82:0x0124, B:84:0x012a, B:86:0x012e, B:91:0x0139, B:94:0x0145, B:95:0x014b, B:97:0x015e, B:40:0x0076), top: B:117:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015e A[Catch: all -> 0x0175, TRY_LEAVE, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008f, B:50:0x009b, B:51:0x009e, B:53:0x00ab, B:56:0x00b3, B:62:0x00cd, B:68:0x00d9, B:71:0x00e5, B:72:0x00ef, B:74:0x0104, B:76:0x010b, B:77:0x0110, B:79:0x011b, B:80:0x0120, B:82:0x0124, B:84:0x012a, B:86:0x012e, B:91:0x0139, B:94:0x0145, B:95:0x014b, B:97:0x015e, B:40:0x0076), top: B:117:0x005a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence f(int r13, int r14, java.lang.CharSequence r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.g.f(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void g(e eVar) {
        if (eVar != null) {
            this.f3619a.writeLock().lock();
            try {
                if (this.c != 1 && this.c != 2) {
                    this.f3620b.add(eVar);
                    return;
                }
                this.f3621d.post(new f(Arrays.asList(eVar), this.c, null));
                return;
            } finally {
                this.f3619a.writeLock().unlock();
            }
        }
        throw new NullPointerException("initCallback cannot be null");
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        public void a() {
        }

        public void b() {
        }
    }
}
