package jm;

import android.content.Context;
import cg.l;
import java.util.ArrayList;
import java.util.Iterator;
import jm.c;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import qb.m;

/* compiled from: AIChatInstanceStateManager.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList f19315a;

    /* renamed from: b  reason: collision with root package name */
    public static a.InterfaceC0260a f19316b;
    public static boolean c;

    /* compiled from: AIChatInstanceStateManager.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: AIChatInstanceStateManager.kt */
        /* renamed from: jm.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public interface InterfaceC0260a {
            void H();

            void I();

            void W0(km.a aVar);

            void X(km.a aVar, km.a aVar2);

            void g1(km.a aVar);

            void h0(int i10, String str);

            void m1(int i10);

            void p0(km.a aVar);

            void t0();

            void u(Boolean bool, Boolean bool2);

            void u0();
        }

        public static void a(final boolean z10, final Boolean bool, final l lVar, int i10) {
            ArrayList arrayList = c.f19315a;
            final boolean z11 = false;
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            if ((i10 & 4) != 0) {
                bool = Boolean.FALSE;
            }
            if ((i10 & 8) != 0) {
                lVar = null;
            }
            t0.V().execute(new Runnable() { // from class: jm.a
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z12;
                    boolean w7 = BillingConfigImpl.c.w();
                    l lVar2 = lVar;
                    if (w7) {
                        c.c = false;
                        w0.a().f28791b.execute(new c6.b(4));
                        if (lVar2 != null) {
                            lVar2.invoke(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    Boolean bool2 = Boolean.TRUE;
                    if (g.a(bool, bool2)) {
                        if (lVar2 != null) {
                            lVar2.invoke(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    Context m10 = ReaderPdfApplication.m();
                    if (q0.d(m10) > q0.l(m10, 0, "ai_chat_deplete_num_162")) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        if (z10) {
                            Context m11 = ReaderPdfApplication.m();
                            q0.x(m11, q0.l(m11, 0, "ai_chat_deplete_num_162") + 1, "ai_chat_deplete_num_162");
                            q0.d(m11);
                        }
                        final int k10 = q0.k(ReaderPdfApplication.m());
                        c.c = false;
                        if (lVar2 != null) {
                            lVar2.invoke(Boolean.FALSE);
                        }
                        w0.a().f28791b.execute(new Runnable() { // from class: jm.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                c.a.InterfaceC0260a interfaceC0260a = c.f19316b;
                                if (interfaceC0260a != null) {
                                    interfaceC0260a.m1(k10);
                                }
                            }
                        });
                        return;
                    }
                    if (lVar2 != null) {
                        lVar2.invoke(bool2);
                    }
                    w0.a().f28791b.execute(new m(z11, 1));
                }
            });
        }

        public static void b(Boolean bool, Boolean bool2) {
            InterfaceC0260a interfaceC0260a = c.f19316b;
            if (interfaceC0260a != null) {
                interfaceC0260a.u(bool, bool2);
            }
        }

        public static void c(km.a data) {
            g.e(data, "data");
            ArrayList arrayList = c.f19315a;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                int i10 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (g.a(((km.a) it.next()).c, data.c)) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 != -1) {
                    c.f19315a.set(i10, data);
                } else {
                    c.f19315a.add(data);
                }
            }
        }

        public static void d(int i10, String str) {
            km.a aVar;
            ArrayList arrayList = c.f19315a;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                int i11 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (g.a(((km.a) it.next()).c, str)) {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 != -1 && (aVar = (km.a) kotlin.collections.m.t0(i11, c.f19315a)) != null) {
                    aVar.f19881k = i10;
                }
            }
            InterfaceC0260a interfaceC0260a = c.f19316b;
            if (interfaceC0260a != null) {
                interfaceC0260a.h0(i10, str);
            }
        }

        public static void e(km.a data) {
            g.e(data, "data");
            c(data);
            InterfaceC0260a interfaceC0260a = c.f19316b;
            if (interfaceC0260a != null) {
                interfaceC0260a.p0(data);
            }
        }
    }

    static {
        new a();
        f19315a = new ArrayList();
    }
}
