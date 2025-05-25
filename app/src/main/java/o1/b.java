package o1;

import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import com.google.android.play.core.assetpacks.b1;
import java.io.PrintWriter;
import n1.c;
import y.j;

/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes.dex */
public final class b extends o1.a {

    /* renamed from: a  reason: collision with root package name */
    public final p f22662a;

    /* renamed from: b  reason: collision with root package name */
    public final C0301b f22663b;

    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class a<D> extends w<D> {
        @Override // androidx.lifecycle.LiveData
        public final void g() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public final void h() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public final void i(x<? super D> xVar) {
            super.i(xVar);
        }

        @Override // androidx.lifecycle.w, androidx.lifecycle.LiveData
        public final void j(D d10) {
            super.j(d10);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #0 : ");
            b1.p(sb2, null);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: o1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0301b extends j0 {

        /* renamed from: e  reason: collision with root package name */
        public static final a f22664e = new a();

        /* renamed from: d  reason: collision with root package name */
        public final j<a> f22665d = new j<>();

        /* compiled from: LoaderManagerImpl.java */
        /* renamed from: o1.b$b$a */
        /* loaded from: classes.dex */
        public static class a implements m0.b {
            @Override // androidx.lifecycle.m0.b
            public final <T extends j0> T a(Class<T> cls) {
                return new C0301b();
            }

            @Override // androidx.lifecycle.m0.b
            public final j0 b(Class cls, c cVar) {
                return a(cls);
            }
        }

        @Override // androidx.lifecycle.j0
        public final void b() {
            j<a> jVar = this.f22665d;
            int i10 = jVar.c;
            if (i10 <= 0) {
                Object[] objArr = jVar.f31946b;
                for (int i11 = 0; i11 < i10; i11++) {
                    objArr[i11] = null;
                }
                jVar.c = 0;
                return;
            }
            ((a) jVar.f31946b[0]).getClass();
            throw null;
        }
    }

    public b(p pVar, o0 o0Var) {
        this.f22662a = pVar;
        this.f22663b = (C0301b) new m0(o0Var, C0301b.f22664e).a(C0301b.class);
    }

    @Deprecated
    public final void b(String str, PrintWriter printWriter) {
        j<a> jVar = this.f22663b.f22665d;
        if (jVar.c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (jVar.c > 0) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(jVar.f31945a[0]);
                printWriter.print(": ");
                printWriter.println(((a) jVar.f31946b[0]).toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        b1.p(sb2, this.f22662a);
        sb2.append("}}");
        return sb2.toString();
