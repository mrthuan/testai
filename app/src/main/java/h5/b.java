package h5;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import com.google.android.play.core.install.InstallState;
import f0.s;
import java.util.Objects;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: BaseUpgradeCheck.kt */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public ComponentActivity f18009a;

    /* renamed from: b  reason: collision with root package name */
    public m f18010b;
    public i5.a c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f18011d = new Handler(Looper.getMainLooper());

    public static void j(Activity activity, m mVar) {
        kotlin.jvm.internal.g.e(activity, "activity");
        if (mVar != null) {
            int g10 = mVar.g(mVar.f18044j);
            if (g10 == 1) {
                mVar.d(activity, new androidx.appcompat.libconvert.a(mVar, 2));
            } else if (g10 == 3) {
                String string = activity.getString(R.string.arg_res_0x7f1301ea);
                c5.a b10 = c5.a.b();
                b10.a();
                d dVar = b10.c.f5583e;
                c5.a b11 = c5.a.b();
                b11.a();
                dVar.d(b11.f5564b, string);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.play.core.install.a, h5.l] */
    public final void a(ComponentActivity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        this.f18009a = activity;
        final m d10 = d();
        d10.f18036a = d10.e(activity);
        d10.f18037b = activity.registerForActivityResult(new j.e(), new a1.e(d10, 1));
        ?? r12 = new com.google.android.play.core.install.a() { // from class: h5.l
            @Override // t9.a
            public final void a(InstallState installState) {
                d5.c cVar;
                InstallState installState2 = installState;
                m mVar = m.this;
                mVar.getClass();
                Objects.toString(installState2);
                m.f();
                int c = installState2.c();
                if (c != 2) {
                    if (c != 11) {
                        if (c != 5) {
                            if (c == 6 && (cVar = mVar.f18043i) != null) {
                                cVar.b();
                                return;
                            }
                            return;
                        }
                        d5.c cVar2 = mVar.f18043i;
                        if (cVar2 != null) {
                            cVar2.a();
                            return;
                        }
                        return;
                    }
                    d5.c cVar3 = mVar.f18043i;
                    if (cVar3 != null) {
                        cVar3.c();
                        return;
                    }
                    return;
                }
                installState2.a();
                long e10 = installState2.e();
                d5.c cVar4 = mVar.f18043i;
                if (cVar4 != null && e10 > 0) {
                    cVar4.d();
                }
            }
        };
        d10.c = r12;
        try {
            o9.b bVar = d10.f18036a;
            if (bVar != 0) {
                bVar.d(r12);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        d().f18043i = new a(activity);
        d().f18042h = new com.google.android.tools.d(this, 0);
        e(activity);
    }

    public abstract m b();

    public final i5.a c() {
        if (this.c == null) {
            c5.a b10 = c5.a.b();
            b10.a();
            this.c = b10.c.f5583e.h();
        }
        i5.a aVar = this.c;
        kotlin.jvm.internal.g.b(aVar);
        return aVar;
    }

    public final m d() {
        if (this.f18010b == null) {
            this.f18010b = b();
        }
        m mVar = this.f18010b;
        kotlin.jvm.internal.g.b(mVar);
        return mVar;
    }

    public abstract void e(Activity activity);

    public void f(i5.a aVar) {
        ComponentActivity componentActivity = this.f18009a;
        if (componentActivity != null) {
            aVar.e(componentActivity);
        }
    }

    /* compiled from: BaseUpgradeCheck.kt */
    /* loaded from: classes.dex */
    public static final class a implements d5.c {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f18013b;

        public a(ComponentActivity componentActivity) {
            this.f18013b = componentActivity;
        }

        @Override // d5.c
        public final void a() {
            b.this.h();
        }

        @Override // d5.c
        public final void b() {
            b.this.g();
        }

        @Override // d5.c
        public final void c() {
            b bVar = b.this;
            bVar.getClass();
            ComponentActivity activity = this.f18013b;
            kotlin.jvm.internal.g.e(activity, "activity");
            bVar.f18011d.postDelayed(new s(2, activity, bVar), 200L);
        }

        @Override // d5.c
        public final void e(boolean z10) {
            b.this.getClass();
            ComponentActivity activity = this.f18013b;
            kotlin.jvm.internal.g.e(activity, "activity");
            if (!z10) {
                String string = activity.getString(R.string.arg_res_0x7f1301ea);
                c5.a b10 = c5.a.b();
                b10.a();
                d dVar = b10.c.f5583e;
                c5.a b11 = c5.a.b();
                b11.a();
                dVar.d(b11.f5564b, string);
            }
        }

        @Override // d5.c
        public final void d() {
        }
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
