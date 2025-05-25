package bg;

import com.google.android.gms.common.api.Api;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import jg.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.g;

/* compiled from: FileTreeWalk.kt */
/* loaded from: classes.dex */
public final class a implements f<File> {

    /* renamed from: a  reason: collision with root package name */
    public final File f5406a;

    /* renamed from: b  reason: collision with root package name */
    public final FileWalkDirection f5407b;
    public final int c;

    /* compiled from: FileTreeWalk.kt */
    /* renamed from: bg.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0037a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC0037a(File rootDir) {
            super(rootDir);
            g.e(rootDir, "rootDir");
        }
    }

    /* compiled from: FileTreeWalk.kt */
    /* loaded from: classes.dex */
    public final class b extends kotlin.collections.a<File> {
        public final ArrayDeque<c> c;

        /* compiled from: FileTreeWalk.kt */
        /* renamed from: bg.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0038a extends AbstractC0037a {

            /* renamed from: b  reason: collision with root package name */
            public boolean f5409b;
            public File[] c;

            /* renamed from: d  reason: collision with root package name */
            public int f5410d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f5411e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ b f5412f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0038a(b bVar, File rootDir) {
                super(rootDir);
                g.e(rootDir, "rootDir");
                this.f5412f = bVar;
            }

            @Override // bg.a.c
            public final File a() {
                boolean z10 = this.f5411e;
                File file = this.f5418a;
                b bVar = this.f5412f;
                if (!z10 && this.c == null) {
                    a.this.getClass();
                    File[] listFiles = file.listFiles();
                    this.c = listFiles;
                    if (listFiles == null) {
                        a.this.getClass();
                        this.f5411e = true;
                    }
                }
                File[] fileArr = this.c;
                if (fileArr != null) {
                    int i10 = this.f5410d;
                    g.b(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.c;
                        g.b(fileArr2);
                        int i11 = this.f5410d;
                        this.f5410d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f5409b) {
                    this.f5409b = true;
                    return file;
                }
                a.this.getClass();
                return null;
            }
        }

        /* compiled from: FileTreeWalk.kt */
        /* renamed from: bg.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0039b extends c {

            /* renamed from: b  reason: collision with root package name */
            public boolean f5413b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0039b(File rootFile) {
                super(rootFile);
                g.e(rootFile, "rootFile");
            }

            @Override // bg.a.c
            public final File a() {
                if (this.f5413b) {
                    return null;
                }
                this.f5413b = true;
                return this.f5418a;
            }
        }

        /* compiled from: FileTreeWalk.kt */
        /* loaded from: classes.dex */
        public final class c extends AbstractC0037a {

            /* renamed from: b  reason: collision with root package name */
            public boolean f5414b;
            public File[] c;

            /* renamed from: d  reason: collision with root package name */
            public int f5415d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ b f5416e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                g.e(rootDir, "rootDir");
                this.f5416e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
                if (r0.length == 0) goto L21;
             */
            @Override // bg.a.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.io.File a() {
                /*
                    r5 = this;
                    boolean r0 = r5.f5414b
                    java.io.File r1 = r5.f5418a
                    bg.a$b r2 = r5.f5416e
                    if (r0 != 0) goto L11
                    bg.a r0 = bg.a.this
                    r0.getClass()
                    r0 = 1
                    r5.f5414b = r0
                    return r1
                L11:
                    java.io.File[] r0 = r5.c
                    r3 = 0
                    if (r0 == 0) goto L25
                    int r4 = r5.f5415d
                    kotlin.jvm.internal.g.b(r0)
                    int r0 = r0.length
                    if (r4 >= r0) goto L1f
                    goto L25
                L1f:
                    bg.a r0 = bg.a.this
                    r0.getClass()
                    return r3
                L25:
                    java.io.File[] r0 = r5.c
                    if (r0 != 0) goto L46
                    java.io.File[] r0 = r1.listFiles()
                    r5.c = r0
                    if (r0 != 0) goto L36
                    bg.a r0 = bg.a.this
                    r0.getClass()
                L36:
                    java.io.File[] r0 = r5.c
                    if (r0 == 0) goto L40
                    kotlin.jvm.internal.g.b(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L46
                L40:
                    bg.a r0 = bg.a.this
                    r0.getClass()
                    return r3
                L46:
                    java.io.File[] r0 = r5.c
                    kotlin.jvm.internal.g.b(r0)
                    int r1 = r5.f5415d
                    int r2 = r1 + 1
                    r5.f5415d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: bg.a.b.c.a():java.io.File");
            }
        }

        /* compiled from: FileTreeWalk.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class d {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f5417a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f5417a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.c = arrayDeque;
            boolean isDirectory = a.this.f5406a.isDirectory();
            File file = a.this.f5406a;
            if (isDirectory) {
                arrayDeque.push(d(file));
            } else if (file.isFile()) {
                arrayDeque.push(new C0039b(file));
            } else {
                b();
            }
        }

        @Override // kotlin.collections.a
        public final void a() {
            File file;
            File a10;
            while (true) {
                ArrayDeque<c> arrayDeque = this.c;
                c peek = arrayDeque.peek();
                if (peek == null) {
                    file = null;
                    break;
                }
                a10 = peek.a();
                if (a10 == null) {
                    arrayDeque.pop();
                } else if (g.a(a10, peek.f5418a) || !a10.isDirectory() || arrayDeque.size() >= a.this.c) {
                    break;
                } else {
                    arrayDeque.push(d(a10));
                }
            }
            file = a10;
            if (file != null) {
                c(file);
            } else {
                b();
            }
        }

        public final AbstractC0037a d(File file) {
            int i10 = d.f5417a[a.this.f5407b.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return new C0038a(this, file);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new c(this, file);
        }
    }

    /* compiled from: FileTreeWalk.kt */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final File f5418a;

        public c(File root) {
            g.e(root, "root");
            this.f5418a = root;
        }

        public abstract File a();
    }

    public a(File start, FileWalkDirection fileWalkDirection) {
        g.e(start, "start");
        this.f5406a = start;
        this.f5407b = fileWalkDirection;
        this.c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // jg.f
    public final Iterator<File> iterator() {
        return new b();
    }
}
