package pdf.pdfreader.viewer.editor.free.ui.widget.act;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import industries.deepthought.decode.Decoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.office.l0;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.adapter.a;
import pdf.pdfreader.viewer.editor.free.utils.k0;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import qo.m;

/* compiled from: ReaderEditChooserActivity.kt */
/* loaded from: classes3.dex */
public final class ReaderEditChooserActivity extends BasePdfEditActivity implements a.b {
    public static final String B = ea.a.p("CVJ-TSZXfkQdRVQ=", "IwRvWiEO");
    public final tf.c A;

    /* renamed from: w  reason: collision with root package name */
    public final tf.c f28299w = kotlin.a.a(new cg.a<ImageView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditChooserActivity$backImg$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final ImageView invoke() {
            return (ImageView) ReaderEditChooserActivity.this.findViewById(R.id.iv_select_back);
        }
    });

    /* renamed from: x  reason: collision with root package name */
    public final tf.c f28300x;

    /* renamed from: y  reason: collision with root package name */
    public final tf.c f28301y;

    /* renamed from: z  reason: collision with root package name */
    public final tf.c f28302z;

    public ReaderEditChooserActivity() {
        kotlin.a.a(new cg.a<TextView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditChooserActivity$selectNumberTv$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final TextView invoke() {
                return (TextView) ReaderEditChooserActivity.this.findViewById(R.id.tv_select_num);
            }
        });
        this.f28300x = kotlin.a.a(new cg.a<RecyclerView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditChooserActivity$mergeRv$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final RecyclerView invoke() {
                return (RecyclerView) ReaderEditChooserActivity.this.findViewById(R.id.merge_recycler_view);
            }
        });
        this.f28301y = kotlin.a.a(new cg.a<TextView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditChooserActivity$exportBtn$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final TextView invoke() {
                return (TextView) ReaderEditChooserActivity.this.findViewById(R.id.tv_continue);
            }
        });
        this.f28302z = kotlin.a.a(new cg.a<View>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditChooserActivity$viewSearch$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final View invoke() {
                return ReaderEditChooserActivity.this.findViewById(R.id.img_search);
            }
        });
        this.A = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.ui.widget.adapter.a>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditChooserActivity$editAdapter$2
            {
                super(0);
            }

            @Override // cg.a
            public final pdf.pdfreader.viewer.editor.free.ui.widget.adapter.a invoke() {
                ReaderEditChooserActivity readerEditChooserActivity = ReaderEditChooserActivity.this;
                return new pdf.pdfreader.viewer.editor.free.ui.widget.adapter.a(readerEditChooserActivity, readerEditChooserActivity);
            }
        });
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.adapter.a.b
    public final void E0(PdfPreviewEntity pdfPreviewEntity) {
        c2().post(new l0(5, pdfPreviewEntity, this));
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_edit_pdf_chooser;
    }

    @Override // jl.a
    public final void K1() {
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
            Intent intent = new Intent(this, ReaderHomeActivity.class);
            intent.putExtra(ea.a.p("P2FWZSZmRW9t", "zMKCtry8"), ea.a.p("P2RXRR1pQ0E5dCN2HHR5", "uQYBUjxP"));
            startActivity(intent);
            finish();
            return;
        }
        Object value = this.f28299w.getValue();
        kotlin.jvm.internal.g.d(value, ea.a.p("TWcrdEViMGMjSQtnCih5LhYp", "DsqNhQPx"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e((ImageView) value, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditChooserActivity$initView$1
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
                ReaderEditChooserActivity.this.finish();
            }
        });
        Object value2 = this.f28300x.getValue();
        kotlin.jvm.internal.g.d(value2, ea.a.p("c2dUdFRtUnI9ZRh2SyhGLhsp", "RGcesWrw"));
        RecyclerView recyclerView = (RecyclerView) value2;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(b2());
        View view = (View) this.f28302z.getValue();
        if (view != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditChooserActivity$initView$3
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view2) {
                    invoke2(view2);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    ReaderEditChooserActivity readerEditChooserActivity = ReaderEditChooserActivity.this;
                    Intent intent2 = new Intent(ReaderEditChooserActivity.this, ReaderEditSearchActivity.class);
                    String str = ReaderEditChooserActivity.B;
                    readerEditChooserActivity.startActivityForResult(intent2, 200);
                }
            });
        }
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(c2(), new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditChooserActivity$initView$4
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view2) {
                invoke2(view2);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                ReaderEditChooserActivity readerEditChooserActivity = ReaderEditChooserActivity.this;
                String str = ReaderEditChooserActivity.B;
                PdfPreviewEntity pdfPreviewEntity = readerEditChooserActivity.b2().f28343g;
                if (pdfPreviewEntity != null) {
                    final ReaderEditChooserActivity readerEditChooserActivity2 = ReaderEditChooserActivity.this;
                    ArrayList arrayList = readerEditChooserActivity2.b2().f28342f;
                    if (!arrayList.isEmpty()) {
                        int indexOf = arrayList.indexOf(pdfPreviewEntity);
                        if (indexOf < arrayList.size() && indexOf >= 0) {
                            PdfPreviewEntity pdfPreviewEntity2 = (PdfPreviewEntity) arrayList.get(indexOf);
                            pdfPreviewEntity2.setRecent(1);
                            pdfPreviewEntity2.setRecentDate(System.currentTimeMillis());
                            bm.c.b(readerEditChooserActivity2).i(pdfPreviewEntity2);
                            m mVar = new m();
                            mVar.f29408e = true;
                            mVar.f29410g = pdfPreviewEntity2;
                            wk.b.b().e(mVar);
                        }
                        k0.h(readerEditChooserActivity2, pdfPreviewEntity.getPath(), pdfPreviewEntity, ea.a.p("CVJ-TSZUf0kIRA==", "CWtVVcXo"), new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.act.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                String p10 = ea.a.p("R2gic1cw", "7BMtnXiS");
                                ReaderEditChooserActivity readerEditChooserActivity3 = ReaderEditChooserActivity.this;
                                kotlin.jvm.internal.g.e(readerEditChooserActivity3, p10);
                                readerEditChooserActivity3.finish();
                            }
                        });
                    }
                }
            }
        });
        U1();
        ((pdf.pdfreader.viewer.editor.free.ui.dialog.d) this.f28297t.getValue()).show();
        w0.a().f28790a.execute(new a(this, 0));
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.adapter.a.b
    public final void a(int i10) {
        boolean z10;
        TextView c22 = c2();
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        c22.setEnabled(z10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.act.BasePdfEditActivity
    public final void a2(List<? extends PdfPreviewEntity> list) {
        int i10;
        pdf.pdfreader.viewer.editor.free.ui.widget.adapter.a b22 = b2();
        b22.getClass();
        ArrayList arrayList = b22.f28342f;
        arrayList.clear();
        arrayList.addAll(list);
        if (b22.f28343g == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        b22.f28341e.a(i10);
        b22.notifyDataSetChanged();
        RecyclerView recyclerView = b22.f28345i;
        if (recyclerView != null) {
            recyclerView.r0(0);
        }
        if (list.isEmpty()) {
            View findViewById = findViewById(R.id.emptyView);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View view = (View) this.f28302z.getValue();
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    public final pdf.pdfreader.viewer.editor.free.ui.widget.adapter.a b2() {
        return (pdf.pdfreader.viewer.editor.free.ui.widget.adapter.a) this.A.getValue();
    }

    public final TextView c2() {
        Object value = this.f28301y.getValue();
        kotlin.jvm.internal.g.d(value, ea.a.p("D2cudF5lGnAdckBCHW5oKGouHCk=", "VQEdIo02"));
        return (TextView) value;
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 200 && i11 == 100) {
            finish();
        }
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c;
        super.onCreate(bundle);
        if (Decoder.f18572a) {
            try {
                String substring = id.a.b(this).substring(79, 110);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset = kotlin.text.a.f19966b;
                byte[] bytes = substring.getBytes(charset);
                kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] bytes2 = "92a864886f70d01010b05003074310b".getBytes(charset);
                kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                if (System.currentTimeMillis() % 2 == 0) {
                    int i10 = 0;
                    int nextInt = id.a.f18487a.nextInt(0, bytes.length / 2);
                    while (true) {
                        if (i10 <= nextInt) {
                            if (bytes[i10] != bytes2[i10]) {
                                c = 16;
                                break;
                            }
                            i10++;
                        } else {
                            c = 0;
                            break;
                        }
                    }
                    if ((c ^ 0) != 0) {
                        id.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes2, bytes)) {
                    id.a.a();
                    throw null;
                }
                vc.a.c(this);
            } catch (Exception e10) {
                e10.printStackTrace();
                id.a.a();
                throw null;
            }
        } else {
            ReaderPdfApplication.o(this);
        }
        ReaderPdfApplication.h();
        ReaderPdfApplication.f23865q = Process.myPid();
    }

    @Override // jl.a
    public final void C1() {
    }
}
