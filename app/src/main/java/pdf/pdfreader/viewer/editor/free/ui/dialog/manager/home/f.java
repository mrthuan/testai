package pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.w;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: PermissionDialogChain.kt */
/* loaded from: classes3.dex */
public final class f extends po.a {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f27683g = 0;
    public j2 c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f27684d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27685e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27686f;

    /* compiled from: PermissionDialogChain.kt */
    /* loaded from: classes3.dex */
    public static final class a implements xn.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f27687a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ReaderHomeActivity f27688b;

        public a(ReaderHomeActivity readerHomeActivity, f fVar) {
            this.f27687a = fVar;
            this.f27688b = readerHomeActivity;
        }

        @Override // xn.b
        public final void a() {
            t1.b(ea.a.p("J29cZVlwUnI3aTlzHG8GIAsxXyAmbAxjGyAraw==", "R3DdpDuL"));
            tn.a.b(ReaderPdfApplication.m(), ea.a.p("P2VDbRBzRGk1bhUxMQ==", "xUvOuclX"), ea.a.p("Q2U5bRpzEWkdbmsxWF83bChvRV8lbCpjaw==", "iRVA0za1"));
            this.f27688b.H2(true);
            this.f27687a.f27684d = true;
        }

        @Override // xn.b
        public final void b() {
            Boolean bool = Boolean.FALSE;
            f fVar = this.f27687a;
            fVar.f28987b = bool;
            fVar.c = null;
            t1.b(ea.a.p("IG80ZWZwL3IlaRVzXW85IAYxYyAqbF9jHyASYT9jJ2w=", "3rHYFJgR"));
            q0.x(ReaderPdfApplication.m(), 1, ea.a.p("WGUyXx1vFl8TbFhvHl8mZTZtbTEx", "1hakMikv"));
            w<po.b> wVar = c.f27668m;
            c.a.a(fVar);
            String p10 = ea.a.p("Q2UfbRhzAmknbjkxMQ==", "A73mqq8I");
            String p11 = ea.a.p("Q2U5bRpzEWkdbmtjBW8lZRtjXmklaw==", "crkWMSbu");
            ReaderHomeActivity readerHomeActivity = this.f27688b;
            tn.a.b(readerHomeActivity, p10, p11);
            readerHomeActivity.H2(false);
        }
    }

    /* compiled from: PermissionDialogChain.kt */
    /* loaded from: classes3.dex */
    public static final class b implements xn.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ReaderHomeActivity f27689a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f27690b;

        public b(ReaderHomeActivity readerHomeActivity, f fVar) {
            this.f27689a = readerHomeActivity;
            this.f27690b = fVar;
        }

        @Override // xn.b
        public final void a() {
            f fVar = this.f27690b;
            boolean z10 = fVar.f27685e;
            t1.b("home permission <11 click ok, ration=" + z10);
            ReaderHomeActivity readerHomeActivity = this.f27689a;
            readerHomeActivity.H2(true);
            if (fVar.f27685e) {
                fVar.f27686f = true;
                tn.a.b(readerHomeActivity, ea.a.p("P2VDbRBzRGk1bhUxMA==", "6bocEdRT"), ea.a.p("P2VDbRBzRGk1bntfRDA3YVlsAXcaYwlpM2s=", "2yhsP6Az"));
                return;
            }
            fVar.f27686f = false;
            tn.a.b(readerHomeActivity, ea.a.p("OmUqbSNzF2knbjkxMA==", "xxJXJdhH"), ea.a.p("P2VDbRBzRGk1bnhfEm8bZUFfDWwsY2s=", "JxEJPrxE"));
        }

        @Override // xn.b
        public final void b() {
            t1.b(ea.a.p("W28mZVNwB3IfaUdzAG84IHgxAyAlbCpjHCAHYVpjHGw=", "wd4y40da"));
            ReaderHomeActivity readerHomeActivity = this.f27689a;
            boolean z10 = false;
            readerHomeActivity.H2(false);
            j2 j2Var = this.f27690b.c;
            if (j2Var != null && j2Var.f27633d == 1) {
                z10 = true;
            }
            if (z10) {
                tn.a.b(readerHomeActivity, ea.a.p("GWUIbSFzAmknbjkxMA==", "xdizHqHx"), ea.a.p("P2VDbRBzRGk1bnhfFmwHc1BfDWwsY2s=", "WAIV1jbK"));
            } else {
                tn.a.b(readerHomeActivity, ea.a.p("Q2U5bRpzEWkdbmsxMA==", "Zx7Bg5q9"), ea.a.p("IGUGbQJzGmknbldfV2w4c11fMWwgY2s=", "Y7Ptkirc"));
            }
        }
    }

    @Override // po.a
    public final void a() {
        j2 j2Var = this.c;
        if (j2Var != null) {
            j2Var.cancel();
        }
        this.f28987b = Boolean.FALSE;
        this.c = null;
    }

    @Override // po.a
    public final boolean b() {
        return true;
    }

    @Override // po.a
    public final boolean c(Context context) {
        ReaderHomeActivity readerHomeActivity;
        kotlin.jvm.internal.g.e(context, "context");
        if (kotlin.jvm.internal.g.a(this.f28987b, Boolean.TRUE)) {
            Activity l10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.l(context);
            if (l10 instanceof ReaderHomeActivity) {
                readerHomeActivity = (ReaderHomeActivity) l10;
            } else {
                readerHomeActivity = null;
            }
            if (readerHomeActivity == null) {
                return false;
            }
            if (h1.c()) {
                EventCenter.f(ea.a.p("Kmxl", "DDYU3uEQ"));
                j2 j2Var = new j2(context);
                this.c = j2Var;
                j2Var.c(2);
                j2 j2Var2 = this.c;
                if (j2Var2 != null) {
                    j2Var2.f27638i = new a(readerHomeActivity, this);
                }
                t1.b(ea.a.p("W28mZVNwB3IfaUdzAG84IHoxAyAiaSJsA2cVcyZvdw==", "l5NQUTL4"));
                j2 j2Var3 = this.c;
                if (j2Var3 != null) {
                    j2Var3.show();
                }
                tn.a.d(readerHomeActivity, ea.a.p("Q2U5bRpzEWkdbmsxMQ==", "rX53MYma"), ea.a.p("P2VDbRBzRGk1bhUxRF8baFp3", "v1cwszfC"), "", false);
            } else {
                this.f27685e = k0.b.b(readerHomeActivity, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFCUUKVAdSI0EDX2JUNlJ2R0U=", "j4pWVRBm"));
                this.c = new j2(readerHomeActivity);
                if (this.f27685e) {
                    EventCenter.f(ea.a.p("HGUFMQ==", "HMhkULVh"));
                    j2 j2Var4 = this.c;
                    if (j2Var4 != null) {
                        j2Var4.c(0);
                    }
                    tn.a.b(readerHomeActivity, ea.a.p("Q2U5bRpzEWkdbmsxMA==", "xb0Mz7hl"), ea.a.p("QmUKbVhzG2knbldfBTAIc1Bvdw==", "HO2x1hkc"));
                } else {
                    EventCenter.f(ea.a.p("BGUkMg==", "rMpJ3o98"));
                    j2 j2Var5 = this.c;
                    if (j2Var5 != null) {
                        j2Var5.c(1);
                    }
                    tn.a.b(readerHomeActivity, ea.a.p("P2VDbRBzRGk1bhUxMA==", "NF8EMF3c"), ea.a.p("Q2U5bRpzEWkdbgZfWDAJcyxvdw==", "UanpCbBd"));
                }
                j2 j2Var6 = this.c;
                if (j2Var6 != null) {
                    j2Var6.f27638i = new b(readerHomeActivity, this);
                }
                t1.b(ea.a.p("W28mZVNwB3IfaUdzAG84IHgxAyAiaSJsAWdmczhvdw==", "nFPTp5wX"));
                j2 j2Var7 = this.c;
                if (j2Var7 != null) {
                    j2Var7.show();
                }
            }
            j2 j2Var8 = this.c;
            if (j2Var8 != null) {
                j2Var8.setOnCancelListener(new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.b(this, 1));
            }
        }
        j2 j2Var9 = this.c;
        if (j2Var9 == null) {
            return false;
        }
        return j2Var9.isShowing();
    }

    @Override // po.a
    public final boolean d() {
        j2 j2Var = this.c;
        if (j2Var != null) {
            return j2Var.isShowing();
        }
        return false;
    }
}
