package pdf.pdfreader.viewer.editor.free.ui.frag;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.w;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.dialog.ChooseConvertImageTypeDialog;
import pdf.pdfreader.viewer.editor.free.merge.MergePdfData;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.q0;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g0;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.u2;
import pdf.pdfreader.viewer.editor.free.utils.GetPDFPasswordProcess;
import pdf.pdfreader.viewer.editor.free.utils.e1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.k0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: PdfReaderFragment.java */
/* loaded from: classes3.dex */
public final class j implements PdfListMoreMenuDialog.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f28043a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f28044b;

    /* compiled from: PdfReaderFragment.java */
    /* loaded from: classes3.dex */
    public class a extends w {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ PdfPreviewEntity f28045d;

        public a(PdfPreviewEntity pdfPreviewEntity) {
            this.f28045d = pdfPreviewEntity;
        }

        @Override // oo.a
        public final void a() {
            ArrayList<PdfPreviewEntity> arrayList = new ArrayList<>();
            arrayList.add(this.f28045d);
            j.this.f28044b.A0(arrayList);
            wk.b.b().e(new qo.o());
        }
    }

    /* compiled from: PdfReaderFragment.java */
    /* loaded from: classes3.dex */
    public class b implements RenameDialog.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PdfPreviewEntity f28047a;

        public b(PdfPreviewEntity pdfPreviewEntity) {
            this.f28047a = pdfPreviewEntity;
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog.a
        public final void c(String str, boolean z10) {
            j jVar = j.this;
            n nVar = jVar.f28044b;
            int i10 = n.f28058c1;
            if (nVar.Y.get() != null) {
                n nVar2 = jVar.f28044b;
                ArrayList<PdfPreviewEntity> arrayList = nVar2.F0;
                PdfPreviewEntity pdfPreviewEntity = this.f28047a;
                int indexOf = arrayList.indexOf(pdfPreviewEntity);
                Object[] L = pdf.pdfreader.viewer.editor.free.utils.v.L(nVar2.Y.get(), pdfPreviewEntity.getFile(), str, nVar2.H0());
                File file = (File) L[0];
                if (1 == ((Integer) L[1]).intValue() && file != null && indexOf >= 0 && indexOf < nVar2.F0.size()) {
                    RenameDialog renameDialog = nVar2.f22172u0;
                    if (renameDialog != null && renameDialog.isShowing()) {
                        nVar2.f22172u0.cancel();
                    }
                    pdfPreviewEntity.getPath();
                    String path = file.getPath();
                    pdfPreviewEntity.setPath(path);
                    pdfPreviewEntity.setName(str);
                    pdfPreviewEntity.setDate(file.lastModified());
                    PdfPreviewEntity pdfPreviewEntity2 = jVar.f28043a;
                    FileRepository.I(pdfPreviewEntity2);
                    nVar2.E0.f27210e.get(indexOf).setPath(path);
                    nVar2.E0.f27210e.get(indexOf).setName(str);
                    nVar2.E0.notifyItemChanged(indexOf);
                    pdf.pdfreader.viewer.editor.free.utils.v.I(nVar2.Y.get(), pdfPreviewEntity);
                    wk.b.b().e(new qo.j(pdfPreviewEntity2));
                    Context r4 = nVar2.r();
                    tn.a.d(r4, "file_more", "filemore_rename_done", nVar2.X0() + "_" + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
                    return;
                }
                RenameDialog renameDialog2 = nVar2.f22172u0;
                if (renameDialog2 != null) {
                    renameDialog2.A();
                }
            }
        }
    }

    /* compiled from: PdfReaderFragment.java */
    /* loaded from: classes3.dex */
    public class c implements g2.f {
        public c() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.g2.f
        public final void c(boolean z10) {
            if (!z10) {
                j jVar = j.this;
                tn.a.d(jVar.f28044b.r(), ea.a.p("KWldZSZtWHJl", "XiZWJhem"), ea.a.p("F2k1ZQlvOGUXcwN0RHMgZGdkPW5l", "xuqYdJLn"), jVar.f28044b.X0(), false);
            }
        }
    }

    /* compiled from: PdfReaderFragment.java */
    /* loaded from: classes3.dex */
    public class d extends androidx.privacysandbox.ads.adservices.topics.d {
        public d() {
        }

        @Override // androidx.privacysandbox.ads.adservices.topics.d, pdf.pdfreader.viewer.editor.free.utils.h0
        public final void c() {
            j jVar = j.this;
            if (jVar.f28044b.i() != null && (jVar.f28044b.i() instanceof jl.a)) {
                ((jl.a) jVar.f28044b.i()).I1();
            }
        }

        @Override // androidx.privacysandbox.ads.adservices.topics.d, pdf.pdfreader.viewer.editor.free.utils.h0
        public final void d() {
            j jVar = j.this;
            if (jVar.f28044b.i() != null && (jVar.f28044b.i() instanceof jl.a)) {
                ((jl.a) jVar.f28044b.i()).V1();
            }
        }
    }

    /* compiled from: PdfReaderFragment.java */
    /* loaded from: classes3.dex */
    public class e extends r.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28051a;

        public e(String str) {
            this.f28051a = str;
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.x
        public final void i(String str, boolean z10) {
            ReaderPdfApplication.k().i(new no.d(this.f28051a, str));
        }
    }

    public j(n nVar, PdfPreviewEntity pdfPreviewEntity, int i10) {
        this.f28044b = nVar;
        this.f28043a = pdfPreviewEntity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void a(PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        ea.a.p("G01U", "9mB1qrBV");
        ea.a.p("fzMAOUs-CT5kPnQ-Sz5WPgs-UD57MVQgC24NZSUgJ288aUVpFm49", "ycIbnyWW");
        n nVar = this.f28044b;
        nVar.p0(nVar.Y.get());
        if (pdfPreviewEntity != null) {
            nVar.E0();
            t1.b(ea.a.p("V2E-IDNoMW4vZTZEckY2dldyO3QsIEZkEiATZTZpLDo=", "wP1HPPyN") + pdfPreviewEntity.getPath() + ea.a.p("E2Yqdjo=", "c5ccihDM") + pdfPreviewEntity.getFavorite());
            ArrayList<PdfPreviewEntity> arrayList = nVar.F0;
            int indexOf = arrayList.indexOf(pdfPreviewEntity);
            if (indexOf < arrayList.size() && indexOf >= 0) {
                pdfPreviewEntity.setFavorite(!z10 ? 1 : 0);
                pdfPreviewEntity.setFavoriteDate(System.currentTimeMillis());
                bm.c.b(nVar.Y.get()).i(pdfPreviewEntity);
                nVar.E0.notifyItemChanged(indexOf);
            } else if (!z10) {
                pdfPreviewEntity.setFavorite(!z10 ? 1 : 0);
                pdfPreviewEntity.setFavoriteDate(System.currentTimeMillis());
                bm.c.b(nVar.Y.get()).i(pdfPreviewEntity);
                nVar.E0.notifyItemChanged(indexOf);
            }
            t1.b(ea.a.p("KmEYIChoCG4vZTZEckY2dldyO3QsIEZkEiAUbjU6", "9PLnKilP") + pdfPreviewEntity.getPath() + ea.a.p("E2Yqdjo=", "0xY3zL5f") + pdfPreviewEntity.getFavorite());
            FileRepository.I(pdfPreviewEntity);
            wk.b.b().e(new qo.j(pdfPreviewEntity));
            if (nVar.r() != null) {
                if (z10) {
                    j1.e(nVar.r(), nVar.r().getString(R.string.arg_res_0x7f1303df, nVar.x(R.string.arg_res_0x7f13036f)), true, null, nVar.H0());
                } else {
                    j1.e(nVar.r(), nVar.r().getString(R.string.arg_res_0x7f130366, nVar.x(R.string.arg_res_0x7f13036f)), false, androidx.core.content.a.getDrawable(nVar.r(), R.drawable.ic_home_bookmark), nVar.H0());
                }
            }
            wk.b.b().e(new qo.o());
        }
        if (z10) {
            Context r4 = nVar.r();
            String p10 = ea.a.p("KWldZSZtWHJl", "LALn4OKX");
            String p11 = ea.a.p("VWknZR5vEGUtdVptCHI9XydsW2Nr", "Z0bcr2DM");
            tn.a.d(r4, p10, p11, nVar.X0() + ea.a.p("Xw==", "6WvEp2EA") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
            return;
        }
        Context r10 = nVar.r();
        String p12 = ea.a.p("KWldZSZtWHJl", "DkdwMPfW");
        String p13 = ea.a.p("VWknZR5vEGUtbVVyAl81bC1jaw==", "Q81Zr858");
        tn.a.d(r10, p12, p13, nVar.X0() + ea.a.p("Xw==", "KGTSdO0k") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void h(String str) {
        n nVar = this.f28044b;
        j1.e(nVar.r(), str, true, null, nVar.H0());
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void i(PdfPreviewEntity pdfPreviewEntity) {
        n nVar = this.f28044b;
        tn.a.d(nVar.r(), ea.a.p("KWldZSZtWHJl", "izId8kef"), ea.a.p("KWldZRRvRWUFci9tGnYNX1ZsB2Nr", "NKtK1zNh"), aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
        p pVar = new p(nVar, pdfPreviewEntity);
        Context I0 = nVar.I0();
        if (I0 != null) {
            if (nVar.f22176y0 == null) {
                nVar.f22176y0 = new u2(I0);
            }
            nVar.p0(I0);
            u2 u2Var = nVar.f22176y0;
            u2Var.getClass();
            u2Var.f23542t = pVar;
            nVar.f22176y0.show();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void j(final PdfPreviewEntity pdfPreviewEntity, boolean z10, final int i10) {
        n nVar = this.f28044b;
        final Context r4 = nVar.r();
        tn.a.d(nVar.r(), ea.a.p("KWldZSZtWHJl", "VdhKAMzi"), ea.a.p("VWknZR5vEGUtc0RsAHQJYyhpUWs=", "WkU54Rf2"), nVar.X0(), false);
        if (r4 != null) {
            if (z10) {
                nVar.O0(pdfPreviewEntity, new DecryptAndCopyUIHelper.b() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.i
                    @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
                    public final void a(List list) {
                        j jVar = j.this;
                        jVar.getClass();
                        if (list.size() > 0) {
                            n nVar2 = jVar.f28044b;
                            tn.a.d(nVar2.r(), ea.a.p("QHAnaXQ=", "5WpTPOsM"), ea.a.p("UGgkbwBlC20VX0doBnc=", "UTF5cfiP"), ea.a.p("VWknZQ==", "WF78zK9S"), false);
                            ReaderSplitPdfActivity.a aVar = ReaderSplitPdfActivity.f26822q0;
                            PdfPreviewEntity z11 = t0.z(((DecryptContainer) list.get(0)).getNewPath(), pdfPreviewEntity);
                            String p10 = ea.a.p("VWknZQ==", "STaaX4Po");
                            aVar.getClass();
                            ReaderSplitPdfActivity.a.a(r4, z11, p10, i10);
                            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(nVar2.i());
                        }
                    }
                });
                return;
            }
            tn.a.d(nVar.r(), ea.a.p("QHAnaXQ=", "5NfTA0I6"), ea.a.p("EmgfbxtlPm0vXxVoW3c=", "vmqphWxF"), ea.a.p("KWldZQ==", "KsDT4yT4"), false);
            ReaderSplitPdfActivity.a aVar = ReaderSplitPdfActivity.f26822q0;
            String p10 = ea.a.p("VWknZQ==", "kSs7L3n6");
            aVar.getClass();
            ReaderSplitPdfActivity.a.a(r4, pdfPreviewEntity, p10, i10);
            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(nVar.i());
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void k(PdfPreviewEntity pdfPreviewEntity) {
        n nVar = this.f28044b;
        Context r4 = nVar.r();
        String p10 = ea.a.p("KWldZSZtWHJl", "AyMRhUMX");
        String p11 = ea.a.p("KWldZRRvRWUFd3hwKmMEaVZr", "GKlQNYhb");
        tn.a.d(r4, p10, p11, nVar.X0() + ea.a.p("Xw==", "rzJ1d3Lh") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
        pdfPreviewEntity.setRecent(1);
        pdfPreviewEntity.setRecentDate(System.currentTimeMillis());
        FileRepository.I(pdfPreviewEntity);
        bm.c.b(nVar.r()).i(pdfPreviewEntity);
        Word2PDFConvertActivity.a aVar = Word2PDFConvertActivity.f26020p1;
        Context r10 = nVar.r();
        String path = pdfPreviewEntity.getPath();
        String p12 = ea.a.p("CVJ-TSZMflMOXwdPJ0U=", "eCVKY6bj");
        aVar.getClass();
        Word2PDFConvertActivity.a.a(r10, path, pdfPreviewEntity, p12);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void l(PdfPreviewEntity pdfPreviewEntity) {
        n nVar = this.f28044b;
        Context r4 = nVar.r();
        String p10 = ea.a.p("N2koZRxtXnJl", "t1QDC1Uq");
        String p11 = ea.a.p("IWkUZR5vOmUXYQ9fV2w-Y2s=", "4RGxsHlf");
        tn.a.d(r4, p10, p11, nVar.X0() + ea.a.p("Xw==", "aYLKy12v") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void m(PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        c cVar = new c();
        n nVar = this.f28044b;
        Context I0 = nVar.I0();
        if (I0 != null) {
            nVar.f22173v0 = new g2(I0, z10, pdfPreviewEntity, cVar, nVar);
            nVar.p0(I0);
            if (z10) {
                tn.a.d(I0, ea.a.p("Q2E4cwRvEGQ=", "K2o05zE6"), ea.a.p("P2FCcyZyR3cFcyJvdw==", "AQgm2Vwc"), ea.a.p("Xm85ZQ==", "OUj0ziat"), false);
            } else {
                tn.a.d(I0, ea.a.p("M2EFcydvBmQ=", "qdCvPtki"), ea.a.p("OWE8cxVzPncXcw5vdw==", "OqIOJN9R"), ea.a.p("Xm85ZQ==", "0H017nnW"), false);
            }
            nVar.f22173v0.show();
        }
        if (z10) {
            tn.a.d(nVar.r(), ea.a.p("LWk2ZWxtHnJl", "y4KZ3qhs"), ea.a.p("J2keZVRvEWUXcgtwR3czX1tsO2Nr", "LAAr9cEH"), nVar.X0(), false);
        } else {
            tn.a.d(nVar.r(), ea.a.p("VWknZSxtDXJl", "xC6R8Mv5"), ea.a.p("UWkUZQdvQWUXcwN0RHMgZGdjPmkqaw==", "lL7xj3Mv"), nVar.X0(), false);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void n(PdfPreviewEntity pdfPreviewEntity) {
        n nVar = this.f28044b;
        tn.a.d(nVar.r(), ea.a.p("KWldZSZtWHJl", "yjBePDTB"), ea.a.p("VWknZR5vEGUtcEZpB3QJYyhpUWs=", "bmBgp0Wz"), nVar.X0(), false);
        Context r4 = nVar.r();
        String path = pdfPreviewEntity.getPath();
        if (r4 != null && !TextUtils.isEmpty(path)) {
            new GetPDFPasswordProcess(r4).b(path, new e(path));
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void p(PdfPreviewEntity pdfPreviewEntity) {
        n nVar = this.f28044b;
        Context r4 = nVar.r();
        String p10 = ea.a.p("VWknZSxtDXJl", "pNQ5vyaH");
        String p11 = ea.a.p("Lmk5ZVpvN2UXcgNuVW0yX1tsO2Nr", "sIHU7Eis");
        tn.a.d(r4, p10, p11, nVar.X0() + ea.a.p("Xw==", "SYuWReg5") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
        b bVar = new b(pdfPreviewEntity);
        Context I0 = nVar.I0();
        if (I0 != null) {
            if (nVar.f22172u0 == null) {
                nVar.f22172u0 = new RenameDialog(I0, pdfPreviewEntity.getPath());
            }
            nVar.f22172u0.B(pdfPreviewEntity.getName(), pdfPreviewEntity.getPath());
            nVar.p0(I0);
            RenameDialog renameDialog = nVar.f22172u0;
            renameDialog.getClass();
            renameDialog.f27479v = bVar;
            nVar.f22172u0.show();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void q(PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        n nVar = this.f28044b;
        Context r4 = nVar.r();
        String p10 = ea.a.p("VWknZSxtDXJl", "aPMiYuxI");
        String p11 = ea.a.p("VWknZR5vEGUtcAZpBGcJYyhpUWs=", "zNi54Qsz");
        tn.a.d(r4, p10, p11, nVar.X0() + ea.a.p("Xw==", "Mhm4KK0R") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
        ChooseConvertImageTypeDialog chooseConvertImageTypeDialog = new ChooseConvertImageTypeDialog(nVar.Y.get());
        nVar.K0 = chooseConvertImageTypeDialog;
        chooseConvertImageTypeDialog.f25473y = new l(nVar, pdfPreviewEntity, z10);
        chooseConvertImageTypeDialog.f25474z = new m(nVar, pdfPreviewEntity, z10);
        chooseConvertImageTypeDialog.show();
        Context r10 = nVar.r();
        String p12 = ea.a.p("KWldZSZtWHJl", "TZdUoT6Y");
        String p13 = ea.a.p("KWldZRRvRWUFcHhpGGc3c11vdw==", "XGrcmomh");
        tn.a.d(r10, p12, p13, nVar.X0() + ea.a.p("Xw==", "Qcogr3kZ") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void r(PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        n nVar = this.f28044b;
        Context r4 = nVar.r();
        String p10 = ea.a.p("M2leZTZtOHJl", "vrU2iWHq");
        String p11 = ea.a.p("KWldZRRvRWUFcHh3KmMEaVZr", "3dwgOc6m");
        tn.a.d(r4, p10, p11, nVar.X0() + ea.a.p("Xw==", "oyPxO3Yu") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
        if (z10) {
            nVar.getClass();
            nVar.O0(pdfPreviewEntity, new f(nVar, pdfPreviewEntity, 0));
            return;
        }
        k0.k(nVar.r(), pdfPreviewEntity.getPath(), "", ea.a.p("dVIETSxMK1MmX3lPO0U=", "9jG325Sh"));
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(nVar.i());
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void s(PdfPreviewEntity pdfPreviewEntity) {
        n nVar = this.f28044b;
        Context r4 = nVar.r();
        String p10 = ea.a.p("KWldZSZtWHJl", "AmmEegXt");
        String p11 = ea.a.p("KWldZRRvRWUFYS5kR2gHbVBfHWgqdw==", "TgLiIEhE");
        tn.a.d(r4, p10, p11, nVar.X0() + ea.a.p("Xw==", "R0mPI4E0") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void t(PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        n nVar = this.f28044b;
        Context r4 = nVar.r();
        tn.a.d(nVar.r(), ea.a.p("X2k1ZTttBnJl", "Gl9Ydi3E"), ea.a.p("KWldZRRvRWUFbS9yEmU3Y1lpDWs=", "KZIvpGBV"), nVar.X0(), false);
        if (r4 != null) {
            if (z10) {
                nVar.O0(pdfPreviewEntity, new q0(1, this, r4));
                return;
            }
            tn.a.d(nVar.r(), ea.a.p("XmU5Z2U=", "Mi4uGTQ0"), ea.a.p("LGhebwplUWk2ZRVzHW93", "PJRWVOFR"), ea.a.p("VWknZQ==", "57aLPWKS"), false);
            ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
            MergePdfData mergePdfData = new MergePdfData(aj.b.l(pdfPreviewEntity), false, "", pdfPreviewEntity.getId());
            String p10 = ea.a.p("KWldZQ==", "Q1xY1RMl");
            aVar.getClass();
            ReaderMergeChooserActivity.a.c(r4, mergePdfData, p10);
            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(nVar.i());
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void u(PdfPreviewEntity pdfPreviewEntity) {
        int i10 = n.f28058c1;
        n nVar = this.f28044b;
        WeakReference<Activity> weakReference = nVar.Y;
        if (weakReference != null && weakReference.get() != null) {
            g0 g0Var = new g0(nVar.Y.get(), pdfPreviewEntity);
            nVar.H0 = g0Var;
            if (!g0Var.isShowing()) {
                nVar.p0(nVar.Y.get());
                nVar.H0.show();
            }
            Context r4 = nVar.r();
            String p10 = ea.a.p("KWldZSZtWHJl", "htGwEbXB");
            String p11 = ea.a.p("VWknZR5vEGUtZFF0CGk6XydsW2Nr", "LrI7QwM5");
            tn.a.d(r4, p10, p11, nVar.X0() + ea.a.p("Xw==", "QN1mr04R") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void v(PdfPreviewEntity pdfPreviewEntity) {
        int indexOf;
        int i10 = n.f28058c1;
        n nVar = this.f28044b;
        if (nVar.f22156e0 == 203) {
            pdfPreviewEntity.setRecent(1);
            pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar = nVar.E0;
            if (dVar != null && (indexOf = dVar.f27210e.indexOf(pdfPreviewEntity)) > -1) {
                dVar.notifyItemChanged(indexOf);
            }
        }
        tn.a.d(nVar.r(), ea.a.p("KWldZSZtWHJl", "kEt6Z3Le"), ea.a.p("KWldZRRvRWUFZS5pAV8LbFxjaw==", "TDXYGgDw"), nVar.X0(), false);
        Context r4 = nVar.r();
        if (r4 == null) {
            return;
        }
        k0.f(0, r4, pdfPreviewEntity.getPath(), ea.a.p("dVIETSxMK1MmX3lPO0U=", "6opx0jGl"), pdfPreviewEntity, new d(), true);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void w(PdfPreviewEntity pdfPreviewEntity) {
        n nVar = this.f28044b;
        Context r4 = nVar.r();
        String p10 = ea.a.p("UmkdZQZtKHJl", "gL4qYG1x");
        String p11 = ea.a.p("KWldZRRvRWUFYSNfBmgHdw==", "hCrVJgTU");
        tn.a.d(r4, p10, p11, nVar.X0() + ea.a.p("Xw==", "VOM4fIqW") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void x(PdfPreviewEntity pdfPreviewEntity) {
        pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f fVar;
        pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b bVar;
        n nVar = this.f28044b;
        tn.a.d(nVar.r(), ea.a.p("KWldZSZtWHJl", "TDQu83b6"), ea.a.p("KWldZRRvRWUFYS5kR2gHbVBfDWwsY2s=", "J3Gx2iyO"), nVar.X0() + ea.a.p("Xw==", "fC1EiF24") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
        if (nVar.i() instanceof androidx.appcompat.app.c) {
            ShortcutHelper.a aVar = ShortcutHelper.f24790a;
            if (ShortcutHelper.Companion.a(nVar.r())) {
                String path = pdfPreviewEntity.getPath();
                androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) nVar.i();
                pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b bVar2 = null;
                if (nVar.i() instanceof ReaderHomeActivity) {
                    fVar = ((ReaderHomeActivity) nVar.i()).f26687t;
                } else if (nVar.i() instanceof RecentAddedActivity) {
                    fVar = ((RecentAddedActivity) nVar.i()).H;
                } else {
                    fVar = null;
                }
                if (nVar.i() instanceof ReaderHomeActivity) {
                    bVar = ((ReaderHomeActivity) nVar.i()).f26690u;
                } else {
                    if (nVar.i() instanceof RecentAddedActivity) {
                        bVar = ((RecentAddedActivity) nVar.i()).I;
                    }
                    ShortcutHelper.Companion.b(path, cVar, fVar, bVar2, new k(this, pdfPreviewEntity));
                }
                bVar2 = bVar;
                ShortcutHelper.Companion.b(path, cVar, fVar, bVar2, new k(this, pdfPreviewEntity));
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void y(PdfPreviewEntity pdfPreviewEntity) {
        n nVar = this.f28044b;
        Context r4 = nVar.r();
        String p10 = ea.a.p("KWldZSZtWHJl", "UdKQnEDY");
        String p11 = ea.a.p("KWldZRRvRWUFcyJhB2U3Y1lpDWs=", "NIIVOmTO");
        tn.a.d(r4, p10, p11, nVar.X0() + ea.a.p("Xw==", "5Nht2ZH9") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
        Context I0 = nVar.I0();
        if (I0 != null) {
            e1.e(I0, pdfPreviewEntity);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void z(PdfPreviewEntity pdfPreviewEntity) {
        n nVar = this.f28044b;
        Context r4 = nVar.r();
        String p10 = ea.a.p("KWldZSZtWHJl", "DBo4E8zy");
        String p11 = ea.a.p("VGkqZStvImUXZANsUXQyX1tsO2Nr", "kx2FFP9v");
        tn.a.d(r4, p10, p11, nVar.X0() + ea.a.p("Xw==", "cZuTc8Ac") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
        a aVar = new a(pdfPreviewEntity);
        Context I0 = nVar.I0();
        if (I0 != null) {
            if (nVar.f22175x0 == null) {
                nVar.f22175x0 = new pdf.pdfreader.viewer.editor.free.ui.dialog.h(I0);
            }
            nVar.p0(I0);
            pdf.pdfreader.viewer.editor.free.ui.dialog.h hVar = nVar.f22175x0;
            hVar.getClass();
            hVar.f23542t = aVar;
            nVar.f22175x0.show();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void o(PdfPreviewEntity pdfPreviewEntity) {
    }
}
