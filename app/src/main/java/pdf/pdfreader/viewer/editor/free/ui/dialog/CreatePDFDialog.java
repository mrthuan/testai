package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.base.a;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFCreatorActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.data.HomeToolsType;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;

/* compiled from: CreatePDFDialog.kt */
/* loaded from: classes3.dex */
public final class CreatePDFDialog extends oo.g implements androidx.lifecycle.x<Integer>, androidx.lifecycle.e {
    public static final /* synthetic */ int E = 0;
    public pdf.pdfreader.viewer.editor.free.ui.adapter.g A;
    public boolean B;
    public a.b C;
    public final a.C0330a D;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.appcompat.app.c f27424y;

    /* renamed from: z  reason: collision with root package name */
    public RecyclerView f27425z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePDFDialog(ReaderHomeActivity readerHomeActivity) {
        super(readerHomeActivity, (Object) null);
        kotlin.jvm.internal.g.e(readerHomeActivity, ea.a.p("UmN0", "J5jdLANZ"));
        this.f27424y = readerHomeActivity;
        this.D = new a.C0330a();
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    public final void H(int i10, Object obj) {
        androidx.appcompat.app.c cVar = this.f27424y;
        if (cVar instanceof a.b) {
            this.C = (a.b) cVar;
        }
        a.C0330a c0330a = this.D;
        c0330a.f24024a = i10;
        c0330a.f24025b = obj;
        a.b bVar = this.C;
        if (bVar != null) {
            bVar.A(c0330a);
        }
    }

    public final void I() {
        pdf.pdfreader.viewer.editor.free.ui.adapter.g gVar = this.A;
        if (gVar != null) {
            Context context = getContext();
            kotlin.jvm.internal.g.d(context, ea.a.p("LG9fdBx4dA==", "XogLfmFo"));
            ArrayList arrayList = new ArrayList();
            String string = context.getString(R.string.arg_res_0x7f13019b);
            kotlin.jvm.internal.g.d(string, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpCGdYaSNhDmVsdCRfA2QEKQ==", "fvNiCGb5"));
            arrayList.add(new no.a(R.drawable.ic_home_imagetopdf, string, HomeToolsType.img2pdf));
            String string2 = context.getString(R.string.arg_res_0x7f130453);
            kotlin.jvm.internal.g.d(string2, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpD2cYcyphFl9HbxRwF2Yp", "a6IxoTL5"));
            arrayList.add(new no.a(R.drawable.ic_home_scan, string2, HomeToolsType.scan2pdf));
            String string3 = context.getString(R.string.arg_res_0x7f13058f);
            kotlin.jvm.internal.g.d(string3, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpKWdPd1lyBl9HbxRwF2Yp", "Ga6bRhoq"));
            arrayList.add(new no.a(R.drawable.ic_home_docxtopdf, string3, HomeToolsType.word2pdf));
            String string4 = context.getString(R.string.arg_res_0x7f1301a7);
            kotlin.jvm.internal.g.d(string4, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpLGd9aVhnMXBXZhR0HF8VbwBka2cZdCk=", "BS5nnSi6"));
            arrayList.add(new no.a(R.drawable.ic_home_pdftodoc, string4, HomeToolsType.pdf2word));
            String string5 = context.getString(R.string.arg_res_0x7f130340);
            kotlin.jvm.internal.g.d(string5, ea.a.p("NG9adCJ4PC4vZRJTQHI-bl8oAC46dERpGmdfcDVmHXQ4X1hvKWcXaSVhAWVrZyd0KQ==", "FnW4GH1z"));
            arrayList.add(new no.a(R.drawable.ic_home_pdftolongimg, string5, HomeToolsType.pdf2longImg));
            String string6 = context.getString(R.string.arg_res_0x7f13033f);
            kotlin.jvm.internal.g.d(string6, ea.a.p("CW86dFJ4Oi4vZRJTQHI-bl8oAC46dERpGmdfcDVmHXQFXz1tVmcrKQ==", "2cjT7NXK"));
            arrayList.add(new no.a(R.drawable.ic_home_pdftoimg, string6, HomeToolsType.pdf2img));
            gVar.j(arrayList);
        }
    }

    @Override // oo.g, l.p, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        String str = NativeSoLoaderHelper.f1933a;
        NativeSoLoaderHelper.f1942k.i(this);
        this.B = false;
        this.f27424y.getLifecycle().c(this);
    }

    @Override // androidx.lifecycle.e
    public final void e(androidx.lifecycle.p pVar) {
        this.B = false;
    }

    @Override // androidx.lifecycle.x
    public final void m(Integer num) {
        pdf.pdfreader.viewer.editor.free.utils.w0.a().f28791b.execute(new qb.a1(this, num.intValue(), 2));
    }

    @Override // oo.g, android.app.Dialog
    public final void show() {
        super.show();
        tn.a.b(getContext(), ea.a.p("W28mZQ==", "r6jp0TRk"), ea.a.p("W28mZSx0DW8ec2tzAW93", "SJEON2N1"));
        I();
        String str = NativeSoLoaderHelper.f1933a;
        NativeSoLoaderHelper.f1942k.f(this);
        this.f27424y.getLifecycle().a(this);
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_create_pdf;
    }

    @Override // oo.g
    public final void z() {
        int i10;
        this.f27425z = (RecyclerView) findViewById(R.id.rv_home_tools);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_dialog_import_files);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.ll_dialog_create_pdf);
        if (linearLayout != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.CreatePDFDialog$initView$1
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                    invoke2(view);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    AppOpenManager.c().f23907g = false;
                    tn.a.b(CreatePDFDialog.this.getContext(), ea.a.p("J29cZQ==", "QFXEYxdh"), ea.a.p("J29cZSZ0WG82cxVpGHAHckFfDWwsY2s=", "XylN1T8Y"));
                    tn.a.a(ReaderPdfApplication.m(), ea.a.p("UG85ZSxmC2xl", "0FGaOqFV"));
                    pdf.pdfreader.viewer.editor.free.utils.t0.i0(CreatePDFDialog.this.f27424y);
                    CreatePDFDialog.this.dismiss();
                }
            });
        }
        if (linearLayout2 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.CreatePDFDialog$initView$2
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                    invoke2(view);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    tn.a.b(CreatePDFDialog.this.getContext(), ea.a.p("Bm8HZQ==", "LbnjWLeq"), ea.a.p("Mm80ZS50CW8kczljRmU2dF1wNmYWY1ppF2s=", "JbZYqfRm"));
                    int i11 = PDFCreatorActivity.G;
                    androidx.appcompat.app.c context = CreatePDFDialog.this.f27424y;
                    kotlin.jvm.internal.g.e(context, "context");
                    Intent intent = new Intent(context, PDFCreatorActivity.class);
                    intent.putExtra(ea.a.p("AG8cbQ==", "QIfnUdL7"), 100);
                    context.startActivity(intent);
                    CreatePDFDialog.this.dismiss();
                }
            });
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.con_bg);
        Context context = getContext();
        kotlin.jvm.internal.g.d(context, ea.a.p("UG8ldBZ4dA==", "uJCLeqma"));
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(context)) {
            if (constraintLayout != null) {
                constraintLayout.setBackgroundResource(R.drawable.img_ai_dialog_background_dark);
            }
        } else if (constraintLayout != null) {
            constraintLayout.setBackgroundResource(R.drawable.bg_tools_ai);
        }
        this.A = new pdf.pdfreader.viewer.editor.free.ui.adapter.g(this.f27424y);
        RecyclerView recyclerView = this.f27425z;
        if (recyclerView != null) {
            Context context2 = recyclerView.getContext();
            kotlin.jvm.internal.g.d(context2, ea.a.p("LG9fdBx4dA==", "FvCgGcYv"));
            if (context2.getResources().getDisplayMetrics().widthPixels >= recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.dp_100) * 5) {
                i10 = 4;
            } else {
                i10 = 3;
            }
            recyclerView.setAdapter(this.A);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new GridLayoutManager(i10));
            pdf.pdfreader.viewer.editor.free.ui.adapter.g gVar = this.A;
            if (gVar != null) {
                gVar.f27248f = i10;
            }
        }
        pdf.pdfreader.viewer.editor.free.ui.adapter.g gVar2 = this.A;
        if (gVar2 != null) {
            gVar2.f24703e = new cg.p<Integer, no.a, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.CreatePDFDialog$initView$4

                /* compiled from: CreatePDFDialog.kt */
                /* loaded from: classes3.dex */
                public /* synthetic */ class a {

                    /* renamed from: a  reason: collision with root package name */
                    public static final /* synthetic */ int[] f27426a;

                    static {
                        int[] iArr = new int[HomeToolsType.values().length];
                        try {
                            iArr[HomeToolsType.img2pdf.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[HomeToolsType.importFiles.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[HomeToolsType.scan2pdf.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[HomeToolsType.word2pdf.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[HomeToolsType.pdf2word.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[HomeToolsType.pdf2img.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[HomeToolsType.pdf2longImg.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        try {
                            iArr[HomeToolsType.createPDF.ordinal()] = 8;
                        } catch (NoSuchFieldError unused8) {
                        }
                        f27426a = iArr;
                    }
                }

                {
                    super(2);
                }

                @Override // cg.p
                public /* bridge */ /* synthetic */ tf.d invoke(Integer num, no.a aVar) {
                    invoke(num.intValue(), aVar);
                    return tf.d.f30009a;
                }

                public final void invoke(int i11, no.a homeToolsUnit) {
                    kotlin.jvm.internal.g.e(homeToolsUnit, "homeToolsUnit");
                    Context context3 = CreatePDFDialog.this.getContext();
                    kotlin.jvm.internal.g.d(context3, ea.a.p("UG8ldBZ4dA==", "Vdi2pB5Y"));
                    HomeToolsType homeToolsType = homeToolsUnit.c;
                    no.b.a(context3, homeToolsType);
                    if (homeToolsType != HomeToolsType.pdf2word) {
                        CreatePDFDialog.this.B = false;
                    }
                    int i12 = a.f27426a[homeToolsType.ordinal()];
                    if (i12 == 1) {
                        tn.a.b(CreatePDFDialog.this.getContext(), ea.a.p("PG8cZQ==", "XATqZpDW"), ea.a.p("W28mZSx0DW8ec2tpBGcJYyhpUWs=", "bbV92xTa"));
                        CreatePDFDialog.this.H(265, ea.a.p("W28mZQ==", "QjSq0LP2"));
                        CreatePDFDialog.this.dismiss();
                        AppCoreFilterEvent.b();
                    } else if (i12 == 3) {
                        tn.a.b(CreatePDFDialog.this.getContext(), ea.a.p("J28JZQ==", "qEOdtvQg"), ea.a.p("Lm8cZR50Pm8kczlzV2E5X1tsO2Nr", "fdFqAQA3"));
                        ImageConvertDataRepository.f26536a.getClass();
                        ImageConvertDataRepository.f();
                        int i13 = CameraActivity.H0;
                        Context context4 = CreatePDFDialog.this.getContext();
                        CameraActivity.a.a(context4, a0.a.i("UG8ldBZ4dA==", "m5dDH02F", context4, "W28mZQ==", "5EQEJ8tP"), ea.a.p("GGMoblllRjI4ZGY=", "VMkI74Ob"), false, true);
                        tn.a.a(ReaderPdfApplication.m(), ea.a.p("LG9DZSZzVGFu", "wcE2tgKs"));
                        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(CreatePDFDialog.this.f27424y);
                        CreatePDFDialog.this.dismiss();
                    } else if (i12 == 4) {
                        tn.a.b(CreatePDFDialog.this.getContext(), ea.a.p("W28mZQ==", "jakj9wOq"), ea.a.p("W28mZSx0DW8ec2tkBmMuXydsW2Nr", "a5u82SIM"));
                        CreatePDFDialog.this.H(264, null);
                        CreatePDFDialog.this.dismiss();
                        AppCoreFilterEvent.f();
                        AppCoreFilterEvent.g(ea.a.p("DTImXyBuQmU6XwVsXWNr", "ANzVE619"));
                    } else if (i12 == 5) {
                        tn.a.b(CreatePDFDialog.this.getContext(), ea.a.p("W28mZQ==", "5QiZvd2o"), ea.a.p("J29cZSZ0WG82cxVwR3c3Y1lpDWs=", "wR11UwUz"));
                        PDF2WordHelper.Companion companion = PDF2WordHelper.f25574a;
                        final CreatePDFDialog createPDFDialog = CreatePDFDialog.this;
                        androidx.appcompat.app.c cVar = createPDFDialog.f27424y;
                        cg.a<tf.d> aVar = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.CreatePDFDialog$initView$4.1
                            {
                                super(0);
                            }

                            @Override // cg.a
                            public /* bridge */ /* synthetic */ tf.d invoke() {
                                invoke2();
                                return tf.d.f30009a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                CreatePDFDialog createPDFDialog2 = CreatePDFDialog.this;
                                int i14 = CreatePDFDialog.E;
                                createPDFDialog2.H(280, null);
                                CreatePDFDialog.this.dismiss();
                                CreatePDFDialog.this.B = false;
                            }
                        };
                        final CreatePDFDialog createPDFDialog2 = CreatePDFDialog.this;
                        cg.a<tf.d> aVar2 = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.CreatePDFDialog$initView$4.2
                            {
                                super(0);
                            }

                            @Override // cg.a
                            public /* bridge */ /* synthetic */ tf.d invoke() {
                                invoke2();
                                return tf.d.f30009a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                CreatePDFDialog.this.B = true;
                            }
                        };
                        final CreatePDFDialog createPDFDialog3 = CreatePDFDialog.this;
                        cg.a<tf.d> aVar3 = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.CreatePDFDialog$initView$4.3
                            {
                                super(0);
                            }

                            @Override // cg.a
                            public /* bridge */ /* synthetic */ tf.d invoke() {
                                invoke2();
                                return tf.d.f30009a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                CreatePDFDialog.this.B = true;
                            }
                        };
                        NativeSoLoaderHelper.DownloadSource downloadSource = NativeSoLoaderHelper.DownloadSource.FromHome;
                        companion.getClass();
                        PDF2WordHelper.Companion.d(cVar, aVar, aVar2, aVar3, downloadSource);
                        AppCoreFilterEvent.e();
                        AppCoreFilterEvent.g(ea.a.p("QzI8XxZuFmUAX1dsAGNr", "NiNaaUBu"));
                    } else if (i12 == 6) {
                        tn.a.b(CreatePDFDialog.this.getContext(), ea.a.p("J29cZQ==", "ynJiUGcO"), ea.a.p("J29cZSZ0WG82cxVwR2kFZ2pjAmkmaw==", "4pYRnvM2"));
                        CreatePDFDialog.this.H(281, null);
                        CreatePDFDialog.this.dismiss();
                    } else if (i12 == 7) {
                        tn.a.b(CreatePDFDialog.this.getContext(), ea.a.p("J29cZQ==", "GpKEDPni"), ea.a.p("W28mZSx0DW8ec2twW2w5biNfUWwvY2s=", "SEwfA73S"));
                        CreatePDFDialog.this.H(288, null);
                        CreatePDFDialog.this.dismiss();
                    }
                    pdf.pdfreader.viewer.editor.free.ui.adapter.g gVar3 = CreatePDFDialog.this.A;
                    if (gVar3 != null) {
                        gVar3.notifyItemChanged(i11);
                    }
                }
            };
        }
        I();
    }

    @Override // androidx.lifecycle.e
    public final void a(androidx.lifecycle.p pVar) {
    }

    @Override // androidx.lifecycle.e
    public final void b(androidx.lifecycle.p pVar) {
    }

    @Override // androidx.lifecycle.e
    public final void h(androidx.lifecycle.p pVar) {
    }

    @Override // androidx.lifecycle.e
    public final void i(androidx.lifecycle.p pVar) {
    }

    @Override // androidx.lifecycle.e
    public final void k(androidx.lifecycle.p pVar) {
    }
}
