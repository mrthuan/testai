package pdf.pdfreader.viewer.editor.free.ui.feature.tools;

import a6.h;
import am.d1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import androidx.fragment.app.u;
import androidx.lifecycle.x;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import ea.a;
import fn.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.m;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import lm.e;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ads.n;
import pdf.pdfreader.viewer.editor.free.bean.IToolsItem;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFCreatorActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.adapter.b0;
import pdf.pdfreader.viewer.editor.free.ui.data.HomeToolsType;
import pdf.pdfreader.viewer.editor.free.ui.dialog.ScannerInfoDialog;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.event.AIEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.m1;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import qb.g1;
import tf.d;

/* compiled from: ToolsNewFragment.kt */
/* loaded from: classes3.dex */
public final class ToolsNewFragment extends pdf.pdfreader.viewer.editor.free.base.a implements b0.b {

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ int f27946l0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public ScannerInfoDialog f27947d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f27948e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f27949f0 = true;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f27950g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f27951h0;

    /* renamed from: i0  reason: collision with root package name */
    public b0 f27952i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f27953j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f27954k0;

    /* compiled from: ToolsNewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a implements x<Integer> {
        public a() {
        }

        @Override // androidx.lifecycle.x
        public final void m(Integer num) {
            w0.a().f28791b.execute(new g1(ToolsNewFragment.this, num.intValue(), 7));
        }
    }

    /* compiled from: ToolsNewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b extends GridLayoutManager.c {
        public b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i10) {
            IToolsItem.ToolsItemType toolsItemType;
            IToolsItem iToolsItem;
            IToolsItem iToolsItem2;
            ToolsNewFragment toolsNewFragment = ToolsNewFragment.this;
            b0 b0Var = toolsNewFragment.f27952i0;
            IToolsItem.ToolsItemType toolsItemType2 = null;
            if (b0Var != null && (iToolsItem2 = (IToolsItem) m.t0(i10, b0Var.f27124g)) != null) {
                toolsItemType = iToolsItem2.a();
            } else {
                toolsItemType = null;
            }
            if (toolsItemType != IToolsItem.ToolsItemType.header) {
                b0 b0Var2 = toolsNewFragment.f27952i0;
                if (b0Var2 != null && (iToolsItem = (IToolsItem) m.t0(i10, b0Var2.f27124g)) != null) {
                    toolsItemType2 = iToolsItem.a();
                }
                if (toolsItemType2 != IToolsItem.ToolsItemType.AI) {
                    return 1;
                }
                return 4;
            }
            return 4;
        }
    }

    /* compiled from: ToolsNewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class c implements x, e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f27956a;

        public c(l lVar) {
            ea.a.p("MXUAYxNpV24=", "evWng89o");
            this.f27956a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final l a() {
            return this.f27956a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof x) && (obj instanceof e)) {
                return g.a(this.f27956a, ((e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f27956a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f27956a.invoke(obj);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void M(Bundle bundle) {
        super.M(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void O() {
        boolean z10;
        ScannerInfoDialog scannerInfoDialog;
        ScannerInfoDialog scannerInfoDialog2 = this.f27947d0;
        if (scannerInfoDialog2 != null && scannerInfoDialog2.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (scannerInfoDialog = this.f27947d0) != null) {
            scannerInfoDialog.dismiss();
        }
        this.F = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void T() {
        this.F = true;
        this.f27954k0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W() {
        /*
            r5 = this;
            r0 = 1
            r5.F = r0
            android.content.Context r1 = r5.r()
            if (r1 == 0) goto L50
            java.lang.String r2 = "P2RXcxphWW4_cmRzFmEGLkVkCC42YwRuF2VELilyF2U="
            java.lang.String r3 = "8xfwy6Or"
            java.lang.String r2 = ea.a.p(r2, r3)
            boolean r2 = pdf.pdfreader.viewer.editor.free.utils.h1.b(r1, r2)
            boolean r3 = r5.f27951h0
            if (r2 == r3) goto L39
            r5.f27951h0 = r2
            r5.y0()
            boolean r2 = r5.J
            if (r2 == 0) goto L39
            boolean r2 = r5.f27951h0
            if (r2 != 0) goto L39
            boolean r2 = r5.f27949f0
            if (r2 == 0) goto L2b
            goto L39
        L2b:
            r5.f27949f0 = r0
            pdf.pdfreader.viewer.editor.free.ui.adapter.b0 r2 = r5.f27952i0
            if (r2 != 0) goto L32
            goto L34
        L32:
            r2.f27123f = r0
        L34:
            if (r2 == 0) goto L39
            r2.notifyDataSetChanged()
        L39:
            boolean r2 = r5.J
            if (r2 == 0) goto L50
            java.lang.String r2 = "F29YbBlfAHUmYxJpW24="
            java.lang.String r3 = "dZc7jfuq"
            java.lang.String r2 = ea.a.p(r2, r3)
            java.lang.String r3 = "DW82bBFfRGgndw=="
            java.lang.String r4 = "X9yYb7w2"
            java.lang.String r3 = ea.a.p(r3, r4)
            tn.a.b(r1, r2, r3)
        L50:
            android.content.Context r1 = r5.r()
            if (r1 == 0) goto L89
            boolean r1 = pdf.pdfreader.viewer.editor.free.utils.c1.E(r1)
            if (r1 == 0) goto L7c
            boolean r1 = r5.f27953j0
            if (r1 != 0) goto L7c
            r5.f27953j0 = r0
            pdf.pdfreader.viewer.editor.free.ui.adapter.b0 r0 = r5.f27952i0
            if (r0 == 0) goto L86
            android.content.Context r1 = r5.r()
            java.util.ArrayList r1 = pdf.pdfreader.viewer.editor.free.utils.m1.a(r1)
            java.util.ArrayList r2 = r0.f27124g
            r2.clear()
            r2.addAll(r1)
            r0.notifyDataSetChanged()
            tf.d r0 = tf.d.f30009a
            goto L87
        L7c:
            pdf.pdfreader.viewer.editor.free.ui.adapter.b0 r0 = r5.f27952i0
            if (r0 == 0) goto L86
            r0.notifyDataSetChanged()
            tf.d r0 = tf.d.f30009a
            goto L87
        L86:
            r0 = 0
        L87:
            if (r0 != 0) goto L92
        L89:
            pdf.pdfreader.viewer.editor.free.ui.adapter.b0 r0 = r5.f27952i0
            if (r0 == 0) goto L92
            r0.notifyDataSetChanged()
            tf.d r0 = tf.d.f30009a
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.feature.tools.ToolsNewFragment.W():void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.b0.b
    public final void k(boolean z10, String str, boolean z11) {
        String str2;
        Context r4;
        cg.a<d> aVar = new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.tools.ToolsNewFragment$onItemClick$1
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ d invoke() {
                invoke2();
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                b0 b0Var = ToolsNewFragment.this.f27952i0;
                if (b0Var != null) {
                    b0Var.notifyDataSetChanged();
                }
            }
        };
        if (str != null) {
            Locale locale = Locale.getDefault();
            str2 = h.f("VGU_RBZmA3UedBwp", "6klINSij", locale, str, locale);
            g.d(str2, ea.a.p("R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nRC5DbxRvR2VBQypzFigObxFhWGUp", "m7X0tHYn"));
        } else {
            str2 = null;
        }
        if (g.a(str2, "image to pdf")) {
            if (z10) {
                q0.w(r(), "img2pdf_red_dot_show_in_154", false);
            }
            tn.a.b(i(), ea.a.p("O29ebApfUXU0Yz5pGm4=", "mLh6MhKk"), ea.a.p("R28kbABfC20VMkRkD181bC1jaw==", "IQhdWuVa"));
            q0(265, ea.a.p("R28kbHM=", "hSRTARXT"));
            AppCoreFilterEvent.b();
        } else if (g.a(str2, "scan to pdf")) {
            tn.a.b(i(), ea.a.p("Dm8rbERfVXUmYxJpW24=", "7czD73Lw"), ea.a.p("R28kbABfEWMTblplGzImZCJfUWwvY2s=", "EDgSHfjQ"));
            if (z10) {
                jn.a.c.getClass();
                jn.a.f19330k.c(jn.a.f19323d[6], Boolean.TRUE);
            }
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.f();
            Context r10 = r();
            if (r10 != null) {
                int i10 = CameraActivity.H0;
                CameraActivity.a.a(r10, ea.a.p("TG8VbHM=", "lq8zu1XY"), ea.a.p("PGNQbhdlRTIqZGY=", "PDnjNbNG"), false, true);
                tn.a.a(ReaderPdfApplication.m(), ea.a.p("UG85ZSxzAWFu", "340L6rG8"));
            }
            n.f23972a.b(i());
        } else if (g.a(str2, "annotate")) {
            tn.a.b(i(), ea.a.p("R28kbABfBHUcY0BpBm4=", "SVTaRcpz"), ea.a.p("I28CbBtfU24mbxJhQGUIY1RpMWs=", "ihWmh2jq"));
            q0(272, null);
        } else if (g.a(str2, "merge pdf")) {
            tn.a.d(r(), ea.a.p("XmU5Z2U=", "0kIrJfNp"), ea.a.p("UGgkbwBlBGkeZWtzAW93", "BZy9JSGs"), ea.a.p("TG85bHM=", "M28V9xfD"), false);
            tn.a.b(r(), ea.a.p("O29ebApfUXU0Yz5pGm4=", "iJgzlRXm"), ea.a.p("R28kbABfD2UAZ1FfCmw_Y2s=", "5vtaxb5t"));
            tn.a.d(r(), ea.a.p("R28kbABfAWgdb0dl", "AQNK5QU8"), ea.a.p("R28kbABfAWgdb0dlD2k6ZRtzWm93", "M0k3DiQ6"), ea.a.p("ImVDZ2U=", "NE4ZDmrE"), false);
            q0(273, null);
        } else if (g.a(str2, "split pdf")) {
            tn.a.b(i(), ea.a.p("O29ebApfUXU0Yz5pGm4=", "njWhDUFk"), ea.a.p("E28BbD5fQXAkaRJfV2w-Y2s=", "72gnM2Fd"));
            q0(274, null);
        } else if (g.a(str2, "print pdf")) {
            tn.a.b(r(), ea.a.p("O29ebApfUXU0Yz5pGm4=", "NxIJufVl"), ea.a.p("O29ebApfR3Izbj5fFmwBY2s=", "1wvzw1fi"));
            q0(275, null);
        } else if (g.a(str2, "lock pdf")) {
            tn.a.b(r(), ea.a.p("R28kbABfBHUcY0BpBm4=", "1RMToUaw"), ea.a.p("GW83bAJfH28razljWGk0aw==", "CqmXqsdj"));
            q0(276, null);
        } else if (g.a(str2, "unlock pdf")) {
            tn.a.b(r(), ea.a.p("Hm8AbCJfP3UmYxJpW24=", "LLjoQYqh"), ea.a.p("O29ebApfQm42byVrKmMEaVZr", "ktzrcvYP"));
            q0(277, null);
        } else if (g.a(str2, "add text")) {
            if (z10) {
                q0.w(r(), "add_text_red_dot_show_in_158", false);
            }
            tn.a.b(r(), ea.a.p("O29ebApfUXU0Yz5pGm4=", "EmWbFdiF"), ea.a.p("R28kbABfFmUKdGtjBWk1aw==", "cQtjXaDT"));
            q0(278, null);
        } else if (g.a(str2, "image to text")) {
            tn.a.b(r(), ea.a.p("Mm8pbDtfJ3UmYxJpW24=", "OqFFHA81"), ea.a.p("R28kbABfDWMAX1dsAGNr", "FejF2Stz"));
            if (z11) {
                if (h1.b(r(), ea.a.p("Q2QtcxBhDG4XchpzCmE4LjRkVC41YyJuOmUhLjxyDGU=", "TSZisTnb"))) {
                    Context r11 = r();
                    String p10 = ea.a.p("GWQScw1hH24tckhzV2E5LkhkNC46Y1duGmUDLjdyJ2U=", "FditnqLh");
                    try {
                        Intent launchIntentForPackage = r11.getPackageManager().getLaunchIntentForPackage(p10);
                        if (launchIntentForPackage != null && launchIntentForPackage.getAction() != null) {
                            r11.startActivity(launchIntentForPackage);
                        } else {
                            h1.d(r11, p10);
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else {
                    Context r12 = r();
                    if (r12 != null) {
                        ScannerInfoDialog.ScannerType type = ScannerInfoDialog.ScannerType.OCR;
                        if (this.f27947d0 == null) {
                            this.f27947d0 = new ScannerInfoDialog(r12, type);
                        }
                        ScannerInfoDialog scannerInfoDialog = this.f27947d0;
                        if (scannerInfoDialog != null) {
                            g.e(type, "type");
                            scannerInfoDialog.f27485y = type;
                        }
                        ScannerInfoDialog scannerInfoDialog2 = this.f27947d0;
                        if (scannerInfoDialog2 != null) {
                            scannerInfoDialog2.show();
                        }
                    }
                }
            } else {
                if (z10) {
                    q0.w(r(), "ocr_update_red_dot_in_175", false);
                }
                ImageConvertDataRepository.f26536a.getClass();
                ImageConvertDataRepository.f();
                tn.a.a(ReaderPdfApplication.m(), ea.a.p("LG9DZSZvVHI=", "mxCXL1YD"));
                Context r13 = r();
                if (r13 != null) {
                    int i11 = CameraActivity.H0;
                    CameraActivity.a.a(r13, ea.a.p("LWNy", "tqB6vFFh"), ea.a.p("XGNy", "X5UICIBp"), false, true);
                }
            }
        } else if (g.a(str2, "import files")) {
            tn.a.b(r(), ea.a.p("O29ebApfUXU0Yz5pGm4=", "vEvzmvm4"), ea.a.p("LG8nbBZfWWEmYQFlRl80bFFjaw==", "QxXHe4Uy"));
            AppOpenManager.c().f23907g = false;
            tn.a.a(ReaderPdfApplication.m(), ea.a.p("LG9DZSZmXmxl", "N8N6g6tb"));
            t0.i0(i());
        } else if (g.a(str2, "signature")) {
            if (z10) {
                q0.w(r(), "sign_update_red_dot_in_160", false);
            }
            tn.a.b(r(), ea.a.p("R28kbABfBHUcY0BpBm4=", "TSjDBXq0"), ea.a.p("O29ebApfRGk9bhVjGWkLaw==", "MWOuPjBv"));
            q0(279, null);
        } else if (g.a(str2, "docx to pdf")) {
            if (z10) {
                q0.w(r(), "docx2pdf_red_dot_show_in_159", false);
            }
            tn.a.b(r(), ea.a.p("R28kbABfBHUcY0BpBm4=", "uDJvNF0u"), ea.a.p("R28kbABfBm8ReGtjBWk1aw==", "ZmHaXxF5"));
            q0(264, ea.a.p("R28kbHM=", "2um9SR3G"));
            AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.g(ea.a.p("DTIpXyJuQGU6XwVsXWNr", "RMzYG493"));
            AppCoreFilterEvent.f();
        } else if (g.a(str2, "ai")) {
            if (z10) {
                q0.v(r());
            }
            AIEventCenter.f28648a.getClass();
            AIEventCenter.b();
            tn.a.b(r(), ea.a.p("R28kbABfBHUcY0BpBm4=", "GUPcR9q0"), ea.a.p("O29ebApfVmkFYyZpFms=", "As3tbjVM"));
            Context r14 = r();
            if (r14 != null) {
                e.a.b(r14, null, -1, OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, ea.a.p("R28kbHM=", "Zf5I8fRj"), ea.a.p("O29ebHM=", "gI8bYwyU"), true);
            }
            AppOpenSource appOpenSource2 = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.g(ea.a.p("LmluZRd0UnIFYyZpFms=", "Bmiep3b2"));
        } else if (g.a(str2, "pdf to word")) {
            Context r15 = r();
            if (r15 != null && z10) {
                no.b.a(r15, HomeToolsType.pdf2word);
            }
            tn.a.b(r(), ea.a.p("P28DbEdfEHUmYxJpW24=", "9fKl4vXF"), ea.a.p("Bm8mbCZfImQuMhFvRmQIY1RpMWs=", "7WrIURcG"));
            if (i() instanceof androidx.appcompat.app.c) {
                PDF2WordHelper.Companion companion = PDF2WordHelper.f25574a;
                u i12 = i();
                g.c(i12, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuK25Zbg9sNSA7eUFlWWFZZChvI2QNLglwRWMBbTVhES4lcAQuO3ApQyBtQWENQVR0M3YjdHk=", "pB1WDtzY"));
                cg.a<d> aVar2 = new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.tools.ToolsNewFragment$itemClick$6
                    {
                        super(0);
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ d invoke() {
                        invoke2();
                        return d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ToolsNewFragment toolsNewFragment = ToolsNewFragment.this;
                        String p11 = a.p("PG9YbHM=", "wBH7tRmn");
                        int i13 = ToolsNewFragment.f27946l0;
                        toolsNewFragment.q0(280, p11);
                        ToolsNewFragment.this.f27954k0 = false;
                    }
                };
                cg.a<d> aVar3 = new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.tools.ToolsNewFragment$itemClick$7
                    {
                        super(0);
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ d invoke() {
                        invoke2();
                        return d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ToolsNewFragment.this.f27954k0 = true;
                    }
                };
                cg.a<d> aVar4 = new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.tools.ToolsNewFragment$itemClick$8
                    {
                        super(0);
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ d invoke() {
                        invoke2();
                        return d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ToolsNewFragment.this.f27954k0 = true;
                    }
                };
                NativeSoLoaderHelper.DownloadSource downloadSource = NativeSoLoaderHelper.DownloadSource.FromTools;
                companion.getClass();
                PDF2WordHelper.Companion.d((androidx.appcompat.app.c) i12, aVar2, aVar3, aVar4, downloadSource);
            }
            AppOpenSource appOpenSource3 = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.g(ea.a.p("PzJGXxxuQ2UoXylsHGNr", "DEuhw4zj"));
            AppCoreFilterEvent.e();
        } else if (g.a(str2, "pdf to image")) {
            Context r16 = r();
            if (r16 != null && z10) {
                no.b.a(r16, HomeToolsType.pdf2img);
            }
            tn.a.b(r(), ea.a.p("O29ebApfUXU0Yz5pGm4=", "RPJO8Rdf"), ea.a.p("R28kbABfEmQUMl1tDl81bC1jaw==", "O9pCaeOK"));
            q0(281, ea.a.p("O28ZbHM=", "99OvLjml"));
        } else if (g.a(str2, "pdf to long image")) {
            Context r17 = r();
            if (r17 != null && z10) {
                no.b.a(r17, HomeToolsType.pdf2longImg);
            }
            tn.a.b(r(), ea.a.p("R28kbABfBHUcY0BpBm4=", "RR4dCk45"), ea.a.p("O29ebApfR2Q8MiZvG2c3Y1lpDWs=", "DuQhoIQk"));
            q0(288, ea.a.p("O29ebHM=", "OdRZg6zi"));
        } else if (g.a(str2, "edit text")) {
            Context r18 = r();
            if (r18 != null) {
                if (z10) {
                    fn.c.c.getClass();
                    c.a.d(r18);
                }
                tn.a.b(r18, ea.a.p("Am9WbDBfC3UmYxJpW24=", "72v9Cmm8"), ea.a.p("O29ebApfUmQzdD5lDXQ3Y1lpDWs=", "mylV3CEN"));
            }
            q0(290, ea.a.p("O29ebHM=", "4pcsGjhX"));
        } else if (g.a(str2, "create pdf") && (r4 = r()) != null) {
            if (z10) {
                wm.a.c.getClass();
                q0.w(r4, ea.a.p("LXMLcy1vIl88bwlsR18nZF5fMXIsYUJvBl8fZSZfK24bMWMz", "HFDTEUzg"), false);
            }
            tn.a.b(r(), ea.a.p("R28kbABfBHUcY0BpBm4=", "qPnEK0gi"), ea.a.p("O29ebApfVHI_YT5lBWQOX1ZsB2Nr", "6zYiTYFf"));
            int i13 = PDFCreatorActivity.G;
            Intent intent = new Intent(r4, PDFCreatorActivity.class);
            intent.putExtra(ea.a.p("AG8cbQ==", "QIfnUdL7"), 101);
            r4.startActivity(intent);
        }
        if (z10) {
            aVar.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void m0(boolean z10) {
        Context r4;
        b0 b0Var;
        ArrayList arrayList;
        Object obj;
        boolean z11;
        super.m0(z10);
        if (z10) {
            Context r10 = r();
            if (r10 != null && c1.E(r10)) {
                AIEventCenter.f28648a.getClass();
                AIEventCenter.c();
            }
        } else {
            this.f27954k0 = false;
        }
        if (z10 && this.f27948e0 && (r4 = r()) != null) {
            if (!this.f27950g0) {
                this.f27950g0 = true;
                BillingConfigImpl.c.getClass();
                if (BillingConfigImpl.r() && (b0Var = this.f27952i0) != null && (arrayList = b0Var.f27124g) != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            IToolsItem iToolsItem = (IToolsItem) obj;
                            if ((iToolsItem instanceof pdf.pdfreader.viewer.editor.free.bean.c) && j.G(ea.a.p("Jm1QZxwgQ296dC94dA==", "WDvpzYju"), ((pdf.pdfreader.viewer.editor.free.bean.c) iToolsItem).f24036a, true)) {
                                z11 = true;
                                continue;
                            } else {
                                z11 = false;
                                continue;
                            }
                            if (z11) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (((IToolsItem) obj) != null) {
                        tn.a.b(r4, ea.a.p("PG8pbD9fKXUmYxJpW24=", "cNHFLO4O"), ea.a.p("R28kbABfDWMAX0doBnc=", "qlrZASZV"));
                    }
                }
            }
            if (!this.f27951h0 && !this.f27949f0) {
                this.f27949f0 = true;
                b0 b0Var2 = this.f27952i0;
                if (b0Var2 != null) {
                    b0Var2.f27123f = true;
                }
                if (b0Var2 != null) {
                    b0Var2.notifyDataSetChanged();
                }
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final void s0() {
        this.f27948e0 = true;
        this.f27952i0 = new b0(r(), this);
        r();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(4);
        gridLayoutManager.K = new b();
        i2.a aVar = this.f24022b0;
        g.c(aVar, ea.a.p("WXUBbEdjKm4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiBDeR1lR3AvZmZwAmZGZTZkXXJ8diBlQWUGLhRkOHQtchlmH2UCLi9hPGEEaVpkPm5fLhRyKGdbZRp0JW8-bDFOUncvaQlkIm5n", "Xq7mgK7r"));
        ((d1) aVar).f812b.setLayoutManager(gridLayoutManager);
        i2.a aVar2 = this.f24022b0;
        g.c(aVar2, ea.a.p("WXUBbEdjKm4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiBDeR1lR3AvZmZwAmZGZTZkXXJ8diBlQWUGLhRkOHQtchlmH2UCLi9hPGEEaVpkPm5fLhRyKGdbZRp0JW8-bDFOUncvaQlkIm5n", "Xq7mgK7r"));
        ((d1) aVar2).f812b.setAdapter(this.f27952i0);
        Context r4 = r();
        if (r4 != null) {
            this.f27953j0 = c1.E(r4);
        }
        b0 b0Var = this.f27952i0;
        if (b0Var != null) {
            ArrayList a10 = m1.a(r());
            ArrayList arrayList = b0Var.f27124g;
            arrayList.clear();
            arrayList.addAll(a10);
            b0Var.notifyDataSetChanged();
        }
        NativeSoLoaderHelper.f1942k.e(this, new a());
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final i2.a t0(LayoutInflater inflater, ViewGroup viewGroup) {
        g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_tools_new, viewGroup, false);
        if (inflate != null) {
            RecyclerView recyclerView = (RecyclerView) inflate;
            return new d1(recyclerView, recyclerView);
        }
        throw new NullPointerException(ea.a.p("QW8kdCVpB3c=", "jMSX4SQS"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final int u0() {
        return R.layout.fragment_tools_new;
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final void v0() {
        BillingConfigImpl.c.getClass();
        BillingConfigImpl.x().e(A(), new c(new l<Boolean, d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.tools.ToolsNewFragment$initViewModel$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(Boolean bool) {
                invoke2(bool);
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                g.d(bool, a.p("XnQ=", "KW77VYfg"));
                if (bool.booleanValue()) {
                    ToolsNewFragment toolsNewFragment = ToolsNewFragment.this;
                    int i10 = ToolsNewFragment.f27946l0;
                    toolsNewFragment.y0();
                }
            }
        }));
    }

    public final void y0() {
        Context r4 = r();
        if (r4 != null && c1.J(r4) && !BillingConfigImpl.c.w() && !this.f27951h0) {
            this.f27949f0 = false;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final void x0() {
    }
}
