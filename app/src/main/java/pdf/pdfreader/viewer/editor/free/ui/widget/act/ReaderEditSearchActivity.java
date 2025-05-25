package pdf.pdfreader.viewer.editor.free.ui.widget.act;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.w;
import androidx.lifecycle.x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import industries.deepthought.decode.Decoder;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.ThreadMode;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ads.n;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.dialog.ChooseConvertImageTypeDialog;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.o0;
import pdf.pdfreader.viewer.editor.free.ui.adapter.t;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g0;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j1;
import pdf.pdfreader.viewer.editor.free.ui.dialog.u2;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;
import pdf.pdfreader.viewer.editor.free.ui.widget.adapter.e;
import pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver;
import pdf.pdfreader.viewer.editor.free.utils.ReaderWrapContentLinearLayoutManager;
import pdf.pdfreader.viewer.editor.free.utils.e1;
import pdf.pdfreader.viewer.editor.free.utils.g1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.k0;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.v;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import qo.m;
import wn.d;

/* loaded from: classes3.dex */
public class ReaderEditSearchActivity extends jl.a implements View.OnClickListener, d.b, e.a, g1.a, ReaderActBroadCastReceiver.a, xn.c {

    /* renamed from: b0  reason: collision with root package name */
    public static final String f28303b0 = ea.a.p("J2U7XxBlKXIraDl2VWwiZQ==", "EYLBcHvW");
    public RecyclerView A;
    public pdf.pdfreader.viewer.editor.free.ui.widget.adapter.e B;
    public TextView C;
    public RecyclerView D;
    public View E;
    public RelativeLayout F;
    public String G;
    public TextView K;
    public g1<ReaderEditSearchActivity> L;
    public pdf.pdfreader.viewer.editor.free.ui.dialog.d M;
    public ReaderActBroadCastReceiver<ReaderEditSearchActivity> N;
    public PdfListMoreMenuDialog O;
    public g0 P;
    public g2 Q;
    public t R;
    public g T;
    public ChooseConvertImageTypeDialog X;
    public pdf.pdfreader.viewer.editor.free.ui.dialog.h Y;
    public u2 Z;

    /* renamed from: a0  reason: collision with root package name */
    public RenameDialog f28304a0;

    /* renamed from: v  reason: collision with root package name */
    public InterceptTouchFrameLayout f28307v;

    /* renamed from: w  reason: collision with root package name */
    public AppCompatEditText f28308w;

    /* renamed from: x  reason: collision with root package name */
    public AppCompatImageView f28309x;

    /* renamed from: y  reason: collision with root package name */
    public NestedScrollView f28310y;

    /* renamed from: z  reason: collision with root package name */
    public RelativeLayout f28311z;

    /* renamed from: t  reason: collision with root package name */
    public final pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f f28305t = new pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f();

    /* renamed from: u  reason: collision with root package name */
    public final pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b f28306u = new pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b(this);
    public final ArrayList<PdfPreviewEntity> H = new ArrayList<>();
    public boolean I = false;
    public ArrayList<String> J = new ArrayList<>();
    public String S = "";
    public boolean U = false;
    public final StringBuilder V = new StringBuilder();
    public String W = "";

    /* loaded from: classes3.dex */
    public class a extends w {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ PdfPreviewEntity f28312d;

        public a(PdfPreviewEntity pdfPreviewEntity) {
            this.f28312d = pdfPreviewEntity;
        }

        @Override // oo.a
        public final void a() {
            ReaderEditSearchActivity readerEditSearchActivity = ReaderEditSearchActivity.this;
            ArrayList<PdfPreviewEntity> arrayList = readerEditSearchActivity.B.f28358f;
            if (arrayList != null && arrayList.size() > 0) {
                PdfPreviewEntity pdfPreviewEntity = this.f28312d;
                int indexOf = arrayList.indexOf(pdfPreviewEntity);
                int indexOf2 = readerEditSearchActivity.H.indexOf(pdfPreviewEntity);
                if (indexOf < arrayList.size() && indexOf >= 0) {
                    int i10 = com.google.android.play.core.assetpacks.c.w(pdfPreviewEntity).f22593n;
                    if (i10 > -1) {
                        yn.a.h0(readerEditSearchActivity, i10);
                    }
                    if (indexOf2 >= 0 && indexOf2 < readerEditSearchActivity.H.size()) {
                        readerEditSearchActivity.H.remove(indexOf2);
                    }
                    arrayList.remove(indexOf);
                    readerEditSearchActivity.B.notifyItemRemoved(indexOf);
                    bm.c.b(readerEditSearchActivity).h(pdfPreviewEntity);
                    ReaderEditSearchActivity.b2(readerEditSearchActivity);
                    m mVar = new m();
                    mVar.f29405a = true;
                    mVar.f29410g = pdfPreviewEntity;
                    wk.b.b().e(mVar);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements RenameDialog.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PdfPreviewEntity f28314a;

        public b(PdfPreviewEntity pdfPreviewEntity) {
            this.f28314a = pdfPreviewEntity;
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog.a
        public final void c(String str, boolean z10) {
            PdfPreviewEntity pdfPreviewEntity;
            int indexOf;
            ReaderEditSearchActivity readerEditSearchActivity = ReaderEditSearchActivity.this;
            ArrayList<PdfPreviewEntity> arrayList = readerEditSearchActivity.B.f28358f;
            if (arrayList != null && arrayList.size() > 0 && (indexOf = arrayList.indexOf((pdfPreviewEntity = this.f28314a))) >= 0 && indexOf < arrayList.size()) {
                Object[] L = v.L(readerEditSearchActivity, pdfPreviewEntity.getFile(), str, -1);
                File file = (File) L[0];
                if (1 == ((Integer) L[1]).intValue() && file != null) {
                    RenameDialog renameDialog = readerEditSearchActivity.f28304a0;
                    if (renameDialog != null && renameDialog.isShowing()) {
                        readerEditSearchActivity.f28304a0.cancel();
                    }
                    pdfPreviewEntity.getPath();
                    String path = file.getPath();
                    pdfPreviewEntity.setDate(file.lastModified());
                    pdfPreviewEntity.setPath(path);
                    pdfPreviewEntity.setName(str);
                    if (str.trim().toLowerCase().contains(readerEditSearchActivity.G.trim().toLowerCase())) {
                        readerEditSearchActivity.B.notifyItemChanged(indexOf);
                    } else {
                        readerEditSearchActivity.B.f28358f.remove(indexOf);
                        readerEditSearchActivity.B.notifyItemRemoved(indexOf);
                        ReaderEditSearchActivity.b2(readerEditSearchActivity);
                    }
                    v.I(readerEditSearchActivity, pdfPreviewEntity);
                    m mVar = new m();
                    mVar.c = true;
                    mVar.f29410g = pdfPreviewEntity;
                    wk.b.b().e(mVar);
                    return;
                }
                RenameDialog renameDialog2 = readerEditSearchActivity.f28304a0;
                if (renameDialog2 != null) {
                    renameDialog2.A();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c extends w {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ PdfPreviewEntity f28316d;

        public c(PdfPreviewEntity pdfPreviewEntity) {
            this.f28316d = pdfPreviewEntity;
        }

        @Override // oo.a
        public final void a() {
            ReaderEditSearchActivity readerEditSearchActivity = ReaderEditSearchActivity.this;
            ArrayList<PdfPreviewEntity> arrayList = readerEditSearchActivity.B.f28358f;
            PdfPreviewEntity pdfPreviewEntity = this.f28316d;
            int indexOf = arrayList.indexOf(pdfPreviewEntity);
            if (indexOf < arrayList.size() && indexOf >= 0) {
                pdfPreviewEntity.setRecent(0);
                readerEditSearchActivity.B.notifyItemChanged(indexOf);
                bm.c.b(readerEditSearchActivity).i(pdfPreviewEntity);
                m mVar = new m();
                mVar.f29406b = true;
                mVar.f29410g = pdfPreviewEntity;
                wk.b.b().e(mVar);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28318a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f28319b;

        public e(String str, boolean z10) {
            this.f28318a = str;
            this.f28319b = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message obtain;
            boolean z10 = this.f28319b;
            String str = this.f28318a;
            ReaderEditSearchActivity readerEditSearchActivity = ReaderEditSearchActivity.this;
            try {
                try {
                    v.b();
                    obtain = Message.obtain();
                    obtain.what = 11;
                    obtain.obj = str;
                    obtain.arg1 = z10 ? 1 : 0;
                    readerEditSearchActivity.L.sendEmptyMessage(14);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    obtain = Message.obtain();
                    obtain.what = 11;
                    obtain.obj = str;
                    obtain.arg1 = z10 ? 1 : 0;
                    readerEditSearchActivity.L.sendEmptyMessage(14);
                }
                readerEditSearchActivity.L.sendMessage(obtain);
            } catch (Throwable th2) {
                Message obtain2 = Message.obtain();
                obtain2.what = 11;
                obtain2.obj = str;
                obtain2.arg1 = z10 ? 1 : 0;
                readerEditSearchActivity.L.sendEmptyMessage(14);
                readerEditSearchActivity.L.sendMessage(obtain2);
                throw th2;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements x<nl.g> {
        @Override // androidx.lifecycle.x
        public final void m(nl.g gVar) {
            if (gVar != null) {
                ReaderPdfApplication.k().g(null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 == 3 || i10 == 0) {
                String charSequence = textView.getText().toString();
                String str = ReaderEditSearchActivity.f28303b0;
                ReaderEditSearchActivity readerEditSearchActivity = ReaderEditSearchActivity.this;
                readerEditSearchActivity.c2();
                if (!TextUtils.isEmpty(charSequence)) {
                    String str2 = charSequence.toString();
                    if (!TextUtils.isEmpty(str2)) {
                        ArrayList<String> arrayList = readerEditSearchActivity.J;
                        if (arrayList != null && !arrayList.contains(str2)) {
                            readerEditSearchActivity.J.add(0, str2);
                            t tVar = readerEditSearchActivity.R;
                            if (tVar != null) {
                                tVar.notifyDataSetChanged();
                            }
                        }
                        readerEditSearchActivity.f28310y.setVisibility(8);
                        readerEditSearchActivity.G = str2;
                        new wn.d(readerEditSearchActivity.H, readerEditSearchActivity).getFilter().filter(str2);
                        return true;
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = ReaderEditChooserActivity.B;
            ReaderEditSearchActivity readerEditSearchActivity = ReaderEditSearchActivity.this;
            readerEditSearchActivity.setResult(100);
            readerEditSearchActivity.finish();
        }
    }

    static {
        ea.a.p("YGUqchBoI2N0", "yam85mqJ");
    }

    public static void a2(ReaderEditSearchActivity readerEditSearchActivity, PdfPreviewEntity pdfPreviewEntity, boolean z10, boolean z11) {
        readerEditSearchActivity.getClass();
        if (z11) {
            readerEditSearchActivity.e2(pdfPreviewEntity, new pdf.pdfreader.viewer.editor.free.ui.frag.g(readerEditSearchActivity, pdfPreviewEntity, z10, 1));
            return;
        }
        int i10 = Pdf2ImagePicPreviewActivity.I0;
        Pdf2ImagePicPreviewActivity.a.a(readerEditSearchActivity, pdfPreviewEntity.getPath(), ea.a.p("dVIETSxMK1MmX3lPO0U=", "gbccBbh0"), "", z10);
        n.f23972a.b(readerEditSearchActivity);
    }

    public static void b2(ReaderEditSearchActivity readerEditSearchActivity) {
        int size = readerEditSearchActivity.B.f28358f.size();
        if (size > 1) {
            readerEditSearchActivity.K.setVisibility(0);
            readerEditSearchActivity.K.setText(readerEditSearchActivity.getString(R.string.arg_res_0x7f130414, b.a.c("", size)));
        } else if (size == 1) {
            readerEditSearchActivity.K.setVisibility(0);
            readerEditSearchActivity.K.setText(readerEditSearchActivity.getString(R.string.arg_res_0x7f130413, b.a.c("", size)));
        } else {
            readerEditSearchActivity.K.setVisibility(0);
            readerEditSearchActivity.K.setText(readerEditSearchActivity.getString(R.string.arg_res_0x7f130413, ea.a.p("MA==", "ylkMCckl")));
        }
    }

    @Override // jl.a
    public final void C1() {
        this.f28307v = (InterceptTouchFrameLayout) findViewById(R.id.intercept_fl);
        TextView textView = (TextView) findViewById(R.id.tv_x_items);
        this.K = textView;
        textView.setVisibility(8);
        this.A = (RecyclerView) findViewById(R.id.search_result_rv);
        this.f28311z = (RelativeLayout) findViewById(R.id.search_no_content);
        this.f28310y = (NestedScrollView) findViewById(R.id.rl_history);
        this.D = (RecyclerView) findViewById(R.id.history_recycleview);
        TextView textView2 = (TextView) findViewById(R.id.tv_continue);
        this.C = textView2;
        textView2.setOnClickListener(this);
        this.F = (RelativeLayout) findViewById(R.id.continue_layout);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.iv_search_clear);
        this.f28309x = appCompatImageView;
        appCompatImageView.setOnClickListener(this);
        this.E = findViewById(R.id.clear_layout);
        findViewById(R.id.iv_back).setOnClickListener(this);
        this.E.setOnClickListener(this);
        AppCompatEditText appCompatEditText = (AppCompatEditText) findViewById(R.id.et_pdf_search);
        this.f28308w = appCompatEditText;
        appCompatEditText.setImeOptions(268435459);
        t1.b(ea.a.p("HWVQZBxycmQzdBllFHILaHRjGmkzaRF5GGYBbihWBGV3", "ZlQE8hLm"));
        d2();
        AppCompatEditText appCompatEditText2 = this.f28308w;
        appCompatEditText2.setHint(" " + getString(R.string.arg_res_0x7f1303e8));
        this.f28308w.postDelayed(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.f(this, 11), 200L);
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_edit_pdf_search;
    }

    @Override // jl.a
    public final void K1() {
        this.L = new g1<>(this);
        this.f28307v.setTopTouchListener(new h5.e(this, 18));
        this.A.setLayoutManager(new ReaderWrapContentLinearLayoutManager());
        pdf.pdfreader.viewer.editor.free.ui.widget.adapter.e eVar = new pdf.pdfreader.viewer.editor.free.ui.widget.adapter.e(this, this);
        this.B = eVar;
        this.A.setAdapter(eVar);
        new Thread(new pdf.pdfreader.viewer.editor.free.ui.widget.act.f(this)).start();
        g gVar = new g();
        this.T = gVar;
        this.f28308w.addTextChangedListener(gVar);
        this.f28311z.setVisibility(8);
        this.f28308w.setOnEditorActionListener(new h());
    }

    @Override // jl.a
    public final void L1() {
        ReaderPdfApplication.k().f28152i.e(this, new o0(this, 1));
        ReaderPdfApplication.k().f28148e.e(this, new f());
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.g1.a
    public final void Q(Message message) {
        int i10;
        ArrayList<PdfPreviewEntity> arrayList;
        int indexOf;
        int i11 = message.what;
        ArrayList<PdfPreviewEntity> arrayList2 = this.H;
        boolean z10 = false;
        boolean z11 = true;
        switch (i11) {
            case 1:
                if (this.M == null) {
                    this.M = new pdf.pdfreader.viewer.editor.free.ui.dialog.d(this, false);
                }
                if (!this.M.isShowing()) {
                    this.M.show();
                    int i12 = message.arg1;
                    if (i12 == 0) {
                        this.M.a(R.string.arg_res_0x7f1303a8);
                        return;
                    } else {
                        this.M.a(i12);
                        return;
                    }
                }
                return;
            case 2:
                pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = this.M;
                if (dVar != null && dVar.isShowing()) {
                    this.M.cancel();
                    return;
                }
                return;
            case 3:
                a aVar = new a((PdfPreviewEntity) message.obj);
                if (this.Y == null) {
                    this.Y = new pdf.pdfreader.viewer.editor.free.ui.dialog.h(this);
                }
                y1(this);
                pdf.pdfreader.viewer.editor.free.ui.dialog.h hVar = this.Y;
                hVar.getClass();
                hVar.f23542t = aVar;
                this.Y.show();
                return;
            case 4:
                PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) message.obj;
                b bVar = new b(pdfPreviewEntity);
                if (this.f28304a0 == null) {
                    this.f28304a0 = new RenameDialog(this, pdfPreviewEntity.getPath());
                }
                y1(this);
                this.f28304a0.B(pdfPreviewEntity.getName(), pdfPreviewEntity.getPath());
                RenameDialog renameDialog = this.f28304a0;
                renameDialog.getClass();
                renameDialog.f27479v = bVar;
                this.f28304a0.show();
                return;
            case 5:
                PdfPreviewEntity pdfPreviewEntity2 = (PdfPreviewEntity) message.obj;
                if (message.arg1 != 0) {
                    z11 = false;
                }
                this.Q = new g2(this, z11, pdfPreviewEntity2, new d(), this);
                y1(this);
                if (z11) {
                    tn.a.d(this, ea.a.p("P2FCcw5vRWQ=", "IyFlfDJK"), ea.a.p("P2FCcyZyR3cFcyJvdw==", "8M2XWGtN"), ea.a.p("Im9DZQ==", "xWUlbzkp"), false);
                } else {
                    tn.a.d(this, ea.a.p("Q2E4cwRvEGQ=", "MwJiSOfC"), ea.a.p("Q2E4cyxzEnctc1xvdw==", "ctRy0QjW"), ea.a.p("Dm9AZQ==", "k9c2FbDf"), false);
                }
                this.Q.show();
                return;
            case 6:
                PdfPreviewEntity pdfPreviewEntity3 = (PdfPreviewEntity) message.obj;
                if (pdfPreviewEntity3 != null) {
                    int indexOf2 = arrayList2.indexOf(pdfPreviewEntity3);
                    if (indexOf2 < arrayList2.size() && indexOf2 >= 0) {
                        PdfPreviewEntity pdfPreviewEntity4 = arrayList2.get(indexOf2);
                        int recent = pdfPreviewEntity4.getRecent();
                        pdfPreviewEntity4.setRecent(1);
                        pdfPreviewEntity4.setRecentDate(System.currentTimeMillis());
                        bm.c.b(this).i(pdfPreviewEntity4);
                        if (recent == 0) {
                            m mVar = new m();
                            mVar.f29408e = true;
                            mVar.f29410g = pdfPreviewEntity4;
                            wk.b.b().e(mVar);
                        }
                    }
                    k0.j(this, pdfPreviewEntity3.getPath(), pdfPreviewEntity3, true, 0, ea.a.p("CVJ-TSZTckEIQ0g=", "BkiQ1Gm6"));
                    this.W = pdfPreviewEntity3.getPath();
                    return;
                }
                return;
            case 7:
            case 12:
            case 13:
            case 14:
            default:
                return;
            case 8:
                PdfPreviewEntity pdfPreviewEntity5 = (PdfPreviewEntity) message.obj;
                if (message.arg1 == 1) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (pdfPreviewEntity5 != null && (arrayList = this.B.f28358f) != null && arrayList.size() > 0 && (indexOf = arrayList.indexOf(pdfPreviewEntity5)) < arrayList.size() && indexOf >= 0) {
                    pdfPreviewEntity5.setFavorite(i10 ^ 1);
                    pdfPreviewEntity5.setFavoriteDate(System.currentTimeMillis());
                    this.B.notifyItemChanged(indexOf);
                    bm.c.b(this).i(pdfPreviewEntity5);
                    m mVar2 = new m();
                    mVar2.f29407d = true;
                    mVar2.f29410g = pdfPreviewEntity5;
                    wk.b.b().e(mVar2);
                    if (pdfPreviewEntity5.getFavorite() == 1) {
                        j1.d(this, getString(R.string.arg_res_0x7f130366, getString(R.string.arg_res_0x7f13038d)), androidx.core.content.a.getDrawable(this, R.drawable.ic_home_bookmark));
                        return;
                    } else {
                        j1.d(this, getString(R.string.arg_res_0x7f1303df, getString(R.string.arg_res_0x7f13038d)), null);
                        return;
                    }
                }
                return;
            case 9:
                c cVar = new c((PdfPreviewEntity) message.obj);
                if (this.Z == null) {
                    this.Z = new u2(this);
                }
                y1(this);
                u2 u2Var = this.Z;
                u2Var.getClass();
                u2Var.f23542t = cVar;
                this.Z.show();
                return;
            case 10:
                PdfPreviewEntity pdfPreviewEntity6 = (PdfPreviewEntity) message.obj;
                if (pdfPreviewEntity6 != null) {
                    e1.e(this, pdfPreviewEntity6);
                    return;
                }
                return;
            case 11:
                g2 g2Var = this.Q;
                if (g2Var != null && g2Var.isShowing()) {
                    this.Q.cancel();
                }
                String str = (String) message.obj;
                if (message.arg1 == 1) {
                    tn.a.d(this, ea.a.p("Q2E4cwRvEGQ=", "ZaOnp2w6"), ea.a.p("P2FCcyZzR3cFZCVuZQ==", "iswnTPoC"), ea.a.p("Im9DZQ==", "6pct6W8G"), false);
                    j1.d(this, getString(R.string.arg_res_0x7f1303aa), androidx.core.content.a.getDrawable(this, R.drawable.ic_more_lock));
                } else {
                    tn.a.d(this, ea.a.p("HmE0c0ZvSmQ=", "oMnG18M7"), ea.a.p("QmExcxdyQXcXZAluZQ==", "EH2BH1U8"), ea.a.p("O28HZQ==", "EeVu7zHe"), false);
                    j1.e(this, getString(R.string.arg_res_0x7f1303c4), true, androidx.core.content.a.getDrawable(this, R.drawable.ic_more_unlock), -1);
                }
                ArrayList<PdfPreviewEntity> arrayList3 = this.B.f28358f;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    PdfPreviewEntity pdfPreviewEntity7 = arrayList3.get(i13);
                    if (pdfPreviewEntity7.getPath().equals(str)) {
                        File file = new File(str);
                        if (file.exists()) {
                            pdfPreviewEntity7.setDate(file.lastModified());
                        }
                        if (message.arg1 == 1) {
                            z10 = true;
                        }
                        pdfPreviewEntity7.setOtherBoolOne(z10);
                        pdfPreviewEntity7.setOtherIntOne(1);
                        this.B.notifyItemChanged(i13);
                        bm.c.b(this).i(pdfPreviewEntity7);
                        m mVar3 = new m();
                        mVar3.f29409f = true;
                        mVar3.f29410g = pdfPreviewEntity7;
                        wk.b.b().e(mVar3);
                        return;
                    }
                }
                return;
            case 15:
                this.U = true;
                if (!TextUtils.isEmpty(this.S)) {
                    this.f28309x.setVisibility(0);
                    new ArrayList();
                    new d.a(arrayList2, this).filter(this.S);
                    this.S = "";
                    return;
                }
                return;
        }
    }

    @Override // jl.a
    public final void T1(Bundle bundle) {
        if (bundle != null) {
            this.S = bundle.getString(f28303b0, "");
        }
    }

    @Override // xn.c
    public final void c(String str, boolean z10) {
        w0.a().f28790a.execute(new e(str, z10));
    }

    public final void c2() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(ea.a.p("Jm5BdQ1fWmUuaCVk", "NP64PLzG"));
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f28308w.getWindowToken(), 0);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver.a
    public final void d0(String str, Intent intent) {
        if (ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpGG8jLiFyHWVhQXJUME95XxJPB0UqVCBVeEI9XwZPKFAgRQVF", "wroDlQGx").equals(str)) {
            this.B.notifyDataSetChanged();
        }
    }

    public final void d2() {
        String p10;
        if ((ea.a.p("HWVQZBxycmQzdBllFHILaHRjGmkzaRF5WnMpbzpIJGQqRFRsHHRSSDNzPm8HeUhtZnAmaTZ0CnIDQylhP3NtcyZ6VCBEIHs=", "g1PBzAMM") + this.J) != null) {
            p10 = String.valueOf(this.J.size());
        } else {
            p10 = ea.a.p("AyA2IA==", "7zaNezgZ");
        }
        t1.b(p10);
        ArrayList<String> arrayList = this.J;
        if (arrayList != null && arrayList.size() > 0 && TextUtils.isEmpty(this.S)) {
            NestedScrollView nestedScrollView = this.f28310y;
            if (nestedScrollView != null) {
                nestedScrollView.setVisibility(0);
                return;
            }
            return;
        }
        NestedScrollView nestedScrollView2 = this.f28310y;
        if (nestedScrollView2 != null) {
            nestedScrollView2.setVisibility(8);
        }
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void dismissDialogEvent(qo.a aVar) {
        if (aVar != null) {
            PdfPreviewEntity pdfPreviewEntity = aVar.f29391a;
            ea.a.p("2oDL5fS6hrr06ZaEgafe6eW1", "L9uSWDS0");
            String str = n0.f28727a;
            if (!TextUtils.isEmpty(this.W)) {
                try {
                    ArrayList<PdfPreviewEntity> arrayList = this.B.f28358f;
                    if (arrayList != null && arrayList.size() > 0) {
                        int size = arrayList.size();
                        PdfPreviewEntity pdfPreviewEntity2 = null;
                        for (int i10 = 0; i10 < size; i10++) {
                            PdfPreviewEntity pdfPreviewEntity3 = arrayList.get(i10);
                            if (this.W.equals(pdfPreviewEntity3.getPath())) {
                                pdfPreviewEntity2 = pdfPreviewEntity3;
                            }
                        }
                        if (pdfPreviewEntity2 != null && pdfPreviewEntity != null) {
                            pdfPreviewEntity2.setFavorite(pdfPreviewEntity.getFavorite());
                            pdfPreviewEntity2.setFavoriteDate(pdfPreviewEntity.getFavoriteDate());
                            this.B.notifyItemChanged(arrayList.indexOf(pdfPreviewEntity2));
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public final void e2(PdfPreviewEntity pdfPreviewEntity, DecryptAndCopyUIHelper.b bVar) {
        y1(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(aj.b.l(pdfPreviewEntity));
        new DecryptAndCopyUIHelper(this, arrayList, bVar).g();
    }

    @Override // wn.d.b
    public final void l1(ArrayList<PdfPreviewEntity> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            t1.b(ea.a.p("YWUqZBZyJ2QbdGdlCHI1aAVjRmkwaTd5THMUYT1jBFJWcz5sByAQZQF1WHQaIDhvMCBXbTZ0eQ==", "lqOlRXrS"));
            this.f28311z.setVisibility(8);
            this.A.setVisibility(0);
            this.f28310y.setVisibility(8);
            pdf.pdfreader.viewer.editor.free.ui.widget.adapter.e eVar = this.B;
            eVar.f28359g = this.G;
            ArrayList<PdfPreviewEntity> arrayList2 = eVar.f28358f;
            arrayList2.clear();
            if (!arrayList.isEmpty()) {
                arrayList2.addAll(arrayList);
            }
            eVar.notifyDataSetChanged();
            this.K.setVisibility(0);
            if (arrayList.size() > 1) {
                TextView textView = this.K;
                textView.setText(getString(R.string.arg_res_0x7f130415, "" + arrayList.size()));
                return;
            }
            TextView textView2 = this.K;
            textView2.setText(getString(R.string.arg_res_0x7f130413, "" + arrayList.size()));
            return;
        }
        t1.b(ea.a.p("YWUqZBZyJ2QbdGdlCHI1aAVjRmkwaTd5QXNRYThjCVJWcz5sByAQZQF1WHQaIGsgKnVebGZ8Y2UMcEB5", "a4JaFUnq"));
        this.f28311z.setVisibility(0);
        this.A.setVisibility(8);
        this.K.setVisibility(8);
        this.K.setText(getString(R.string.arg_res_0x7f130413, ea.a.p("MA==", "364gGXa3")));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.A.getVisibility() == 0 && this.K.getVisibility() == 0 && this.B.getItemCount() > 0) {
            this.f28308w.setText("");
            pdf.pdfreader.viewer.editor.free.ui.widget.adapter.e eVar = this.B;
            ArrayList arrayList = new ArrayList();
            eVar.f28359g = "";
            ArrayList<PdfPreviewEntity> arrayList2 = eVar.f28358f;
            arrayList2.clear();
            if (!arrayList.isEmpty()) {
                arrayList2.addAll(arrayList);
            }
            eVar.notifyDataSetChanged();
            this.A.setVisibility(8);
            this.K.setVisibility(8);
            this.f28311z.setVisibility(8);
            t1.b(ea.a.p("Y2URZChyH2QhdDVlVXI0aHljJmk_aUJ5VG8fQjBjKVBDZQNzKGQ=", "461pMZD7"));
            d2();
            return;
        }
        t1.b(ea.a.p("QWUvIANyDWcAZUdzUyAlZSVyUWhmYiJjDiBWaSNpJ2g=", "e0MTQJot"));
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        PdfPreviewEntity pdfPreviewEntity;
        switch (view.getId()) {
            case R.id.clear_layout /* 2131362262 */:
                ArrayList<String> arrayList = this.J;
                if (arrayList != null && arrayList.size() > 0) {
                    androidx.fragment.app.o0 o0Var = new androidx.fragment.app.o0(1);
                    o0Var.f3891a = getResources().getString(R.string.arg_res_0x7f130379);
                    o0Var.f3892b = getResources().getString(R.string.arg_res_0x7f13037f);
                    o0Var.f3893d = getResources().getString(R.string.arg_res_0x7f130377);
                    i2.b(this, o0Var, new j());
                    return;
                }
                return;
            case R.id.iv_back /* 2131362902 */:
                c2();
                finish();
                return;
            case R.id.iv_search_clear /* 2131362969 */:
                if (!TextUtils.isEmpty(this.f28308w.getText())) {
                    this.f28308w.setText("");
                    this.A.setVisibility(8);
                    t1.b(ea.a.p("CmUjZDVyJmQhdDVlVXI0aHljJmk_aUJ5VGkHXyJlI3I7aB1jPGUCcg==", "rGXBPcq9"));
                    d2();
                    this.K.setVisibility(8);
                    this.K.setText(getString(R.string.arg_res_0x7f130413, ea.a.p("MA==", "XCVOYhF3")));
                    return;
                }
                return;
            case R.id.tv_continue /* 2131364347 */:
                pdf.pdfreader.viewer.editor.free.ui.widget.adapter.e eVar = this.B;
                if (eVar != null) {
                    pdfPreviewEntity = eVar.f28361i;
                } else {
                    pdfPreviewEntity = null;
                }
                if (pdfPreviewEntity != null) {
                    try {
                        String obj = this.f28308w.getText().toString();
                        ArrayList<String> arrayList2 = this.J;
                        if (arrayList2 != null && !arrayList2.contains(obj)) {
                            this.J.add(0, obj);
                            t tVar = this.R;
                            if (tVar != null) {
                                tVar.notifyDataSetChanged();
                            }
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    ArrayList<PdfPreviewEntity> arrayList3 = this.B.f28358f;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        int indexOf = arrayList3.indexOf(pdfPreviewEntity);
                        if (indexOf < arrayList3.size() && indexOf >= 0) {
                            PdfPreviewEntity pdfPreviewEntity2 = arrayList3.get(indexOf);
                            pdfPreviewEntity2.setRecent(1);
                            pdfPreviewEntity2.setRecentDate(System.currentTimeMillis());
                            bm.c.b(this).i(pdfPreviewEntity2);
                            m mVar = new m();
                            mVar.f29408e = true;
                            mVar.f29410g = pdfPreviewEntity2;
                            wk.b.b().e(mVar);
                        }
                        k0.h(this, pdfPreviewEntity.getPath(), pdfPreviewEntity, ea.a.p("CVIoTS5Ue0kaRA==", "q8Ogq3gU"), new i());
                        this.W = pdfPreviewEntity.getPath();
                        return;
                    }
                    return;
                }
                return;
            case R.id.tv_history /* 2131364379 */:
                this.f28308w.setText(((TextView) view).getText());
                return;
            default:
                return;
        }
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c10;
        dp.a.a().getClass();
        dp.a.b(this, ea.a.p("ZmU2ZApyDWQhdDVlVXI0aHljJmk_aUJ5VG8fQyNlI3RRIA==", "4y4WoHkI") + Build.FINGERPRINT);
        t1.b(ea.a.p("YWUqZBZyJ2QbdGdlCHI1aAVjRmkwaTd5TG8NQzRlDHRl", "lcFmQ0Fm"));
        super.onCreate(bundle);
        if (Decoder.f18572a) {
            ic.a.c(this);
            try {
                String substring = ld.a.b(this).substring(2566, 2597);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset = kotlin.text.a.f19966b;
                byte[] bytes = substring.getBytes(charset);
                kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] bytes2 = "01372faecedf6936f5a9bac087986d3".getBytes(charset);
                kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                if (System.currentTimeMillis() % 2 == 0) {
                    int nextInt = ld.a.f20547a.nextInt(0, bytes.length / 2);
                    int i10 = 0;
                    while (true) {
                        if (i10 <= nextInt) {
                            if (bytes[i10] != bytes2[i10]) {
                                c10 = 16;
                                break;
                            }
                            i10++;
                        } else {
                            c10 = 0;
                            break;
                        }
                    }
                    if ((c10 ^ 0) != 0) {
                        ld.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes2, bytes)) {
                    ld.a.a();
                    throw null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                ld.a.a();
                throw null;
            }
        } else {
            ReaderPdfApplication.o(this);
        }
        wk.b.b().i(this);
        b.b.Z(this);
        String a10 = eo.a.a(this);
        t1.b(ea.a.p("Y2UOZB1yAmQhdDVlVXI0aHljJmk_aUJ5VGcUdBlpMXRechZTCEQmdCkgRmRVdDYgBSA=", "FZ1oxG9t") + a10);
        if (!TextUtils.isEmpty(a10)) {
            this.J = new ArrayList<>();
            if (a10.contains(ea.a.p("oL-l", "kNZvw6fT"))) {
                String[] split = a10.split(ea.a.p("oL-l", "3Uvs6ltw"));
                if (split != null && split.length > 0) {
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str.trim())) {
                            this.J.add(str);
                        }
                    }
                }
            } else {
                this.J.add(a10);
            }
        } else {
            this.J = new ArrayList<>();
        }
        t tVar = new t(this.J, new cg.l() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.act.c
            @Override // cg.l
            public final Object invoke(Object obj) {
                String str2 = (String) obj;
                ReaderEditSearchActivity readerEditSearchActivity = ReaderEditSearchActivity.this;
                if (str2 != null) {
                    readerEditSearchActivity.f28308w.setText(str2);
                    readerEditSearchActivity.f28308w.setSelection(str2.length());
                    readerEditSearchActivity.c2();
                    return null;
                }
                String str3 = ReaderEditSearchActivity.f28303b0;
                readerEditSearchActivity.getClass();
                return null;
            }
        }, new pdf.pdfreader.viewer.editor.free.ui.widget.act.e(this));
        this.R = tVar;
        this.D.setAdapter(tVar);
        this.D.setLayoutManager(new LinearLayoutManager(1));
        t1.b(ea.a.p("HWVQZBxycmQzdBllFHILaHRjGmkzaRF5S2kraSRGHm84TFB5FnV0", "uni2kEPr"));
        d2();
        this.N = new ReaderActBroadCastReceiver<>(this);
        p1.a.a(this).b(this.N, new IntentFilter(ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpH28xLhRyCGVhQXJUME95XxJPB0UqVCBVeEI9XwZPKFAnRRdF", "yrEPkCrm")));
        this.F.setVisibility(8);
        this.A.setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.dp_86));
        this.A.setClipToPadding(false);
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        g gVar;
        RenameDialog renameDialog = this.f28304a0;
        if (renameDialog != null && renameDialog.isShowing()) {
            this.f28304a0.cancel();
        }
        u2 u2Var = this.Z;
        if (u2Var != null && u2Var.isShowing()) {
            this.Z.cancel();
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.h hVar = this.Y;
        if (hVar != null && hVar.isShowing()) {
            this.Y.cancel();
        }
        g1<ReaderEditSearchActivity> g1Var = this.L;
        if (g1Var != null) {
            g1Var.removeCallbacksAndMessages(null);
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = this.M;
        if (dVar != null && dVar.isShowing()) {
            this.M.cancel();
        }
        g2 g2Var = this.Q;
        if (g2Var != null && g2Var.isShowing()) {
            this.Q.cancel();
        }
        PdfListMoreMenuDialog pdfListMoreMenuDialog = this.O;
        if (pdfListMoreMenuDialog != null && pdfListMoreMenuDialog.isShowing()) {
            this.O.cancel();
        }
        g0 g0Var = this.P;
        if (g0Var != null && g0Var.isShowing()) {
            this.P.cancel();
        }
        ChooseConvertImageTypeDialog chooseConvertImageTypeDialog = this.X;
        if (chooseConvertImageTypeDialog != null && chooseConvertImageTypeDialog.isShowing()) {
            this.X.cancel();
        }
        InterceptTouchFrameLayout interceptTouchFrameLayout = this.f28307v;
        if (interceptTouchFrameLayout != null) {
            interceptTouchFrameLayout.setTopTouchListener(null);
        }
        AppCompatEditText appCompatEditText = this.f28308w;
        if (appCompatEditText != null && (gVar = this.T) != null) {
            appCompatEditText.removeTextChangedListener(gVar);
        }
        wk.b.b().k(this);
        if (this.N != null) {
            p1.a.a(this).d(this.N);
        }
        super.onDestroy();
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        super.onPause();
        AppCompatEditText appCompatEditText = this.f28308w;
        if (appCompatEditText != null) {
            appCompatEditText.clearFocus();
        }
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        AppOpenManager.c().f23907g = true;
        if (this.I) {
            this.I = false;
        }
        PdfPreviewEntity pdfPreviewEntity = ReaderPdfApplication.f23857i;
        if (pdfPreviewEntity != null) {
            if (!pdf.pdfreader.viewer.editor.free.ads.l.m().g() && !pdf.pdfreader.viewer.editor.free.ads.f.m().g() && !pdf.pdfreader.viewer.editor.free.ads.g.m().g()) {
                k0.g(this, pdfPreviewEntity.getPath(), pdfPreviewEntity, ea.a.p("dVIETSxUKkkgRA==", "nrazd0Wj"));
            }
            ReaderPdfApplication.f23857i = null;
        }
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AppCompatEditText appCompatEditText = this.f28308w;
        if (appCompatEditText != null && appCompatEditText.getText() != null) {
            String obj = this.f28308w.getText().toString();
            t1.b(ea.a.p("HWVQZBxycmQzdBllFHILaHRjGmkzaRF5eW8dUy52PUkhc0VhF2NSUy5hPmVVcw1hR2MGIHgg", "TDLMYsOX") + obj);
            if (!TextUtils.isEmpty(obj)) {
                bundle.putString(f28303b0, obj);
            }
        }
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStop() {
        StringBuilder sb2 = this.V;
        sb2.setLength(0);
        ArrayList<String> arrayList = this.J;
        if (arrayList != null && arrayList.size() > 0) {
            int size = this.J.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(this.J.get(i10));
                if (i10 != size - 1) {
                    sb2.append(ea.a.p("oL-l", "UCrTfsBP"));
                }
            }
        }
        eo.a.b(this, sb2.toString());
        t1.b(ea.a.p("YWUqZBZyJ2QbdGdlCHI1aAVjRmkwaTd5Z28hU0FvISATcykuB28xdABpWmdBKXY9IA==", "GO5QRyZm") + sb2.toString());
        super.onStop();
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void savePdfChangeState(qo.l lVar) {
        PdfPreviewEntity pdfPreviewEntity;
        if (lVar != null) {
            if (lVar.f29403a.equals(ea.a.p("dVIETSxTJ0EgQ0g=", "vlD25Vlw")) && !TextUtils.isEmpty(this.W)) {
                ConcurrentHashMap<String, File> concurrentHashMap = v.f28781a;
                try {
                    ArrayList<PdfPreviewEntity> arrayList = this.B.f28358f;
                    if (arrayList != null && arrayList.size() > 0) {
                        int size = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                pdfPreviewEntity = arrayList.get(i10);
                                if (this.W.equals(pdfPreviewEntity.getPath())) {
                                    break;
                                }
                                i10++;
                            } else {
                                i10 = -1;
                                pdfPreviewEntity = null;
                                break;
                            }
                        }
                        if (pdfPreviewEntity != null) {
                            File file = new File(pdfPreviewEntity.getPath());
                            if (file.exists() && file.length() > 0) {
                                pdfPreviewEntity.setDate(file.lastModified());
                                pdfPreviewEntity.setSize(file.length());
                            }
                            bm.c.b(this).i(pdfPreviewEntity);
                            pdfPreviewEntity.setHighlightOnce(true);
                            if (this.f19289b) {
                                this.I = true;
                            }
                            this.B.notifyItemChanged(i10);
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class j implements j1.c {
        public j() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.j1.c
        public final void b() {
            ReaderEditSearchActivity readerEditSearchActivity = ReaderEditSearchActivity.this;
            ArrayList<String> arrayList = readerEditSearchActivity.J;
            if (arrayList != null && arrayList.size() > 0) {
                readerEditSearchActivity.J.clear();
                t tVar = readerEditSearchActivity.R;
                if (tVar != null) {
                    tVar.notifyDataSetChanged();
                }
            }
            t1.b(ea.a.p("YWUqZBZyJ2QbdGdlCHI1aAVjRmkwaTd5ZGMJZTJyPmxSeSR1dA==", "DeSaghRo"));
            readerEditSearchActivity.d2();
            eo.a.b(readerEditSearchActivity, "");
            i2.a();
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.j1.c
        public final void a() {
        }
    }

    @Override // xn.c
    public final void R0() {
    }

    @Override // xn.c
    public final void g() {
    }

    /* loaded from: classes3.dex */
    public class d implements g2.f {
        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.g2.f
        public final void c(boolean z10) {
        }
    }

    @Override // xn.c
    public final void V(int i10) {
    }

    @Override // xn.c
    public final void w0(Throwable th2) {
    }

    /* loaded from: classes3.dex */
    public class g implements TextWatcher {
        public g() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ReaderEditSearchActivity readerEditSearchActivity = ReaderEditSearchActivity.this;
            if (!readerEditSearchActivity.U) {
                return;
            }
            String obj = editable.toString();
            if (!TextUtils.isEmpty(obj)) {
                readerEditSearchActivity.f28310y.setVisibility(8);
                readerEditSearchActivity.f28309x.setVisibility(0);
                readerEditSearchActivity.G = obj;
                new wn.d(readerEditSearchActivity.H, readerEditSearchActivity).getFilter().filter(obj);
                return;
            }
            readerEditSearchActivity.A.setVisibility(8);
            readerEditSearchActivity.f28309x.setVisibility(8);
            t1.b(ea.a.p("YWUqZBZyJ2QbdGdlCHI1aAVjRmkwaTd5SWEWdAtyZGVLdAhoEm4FZRYgRyBUIDh1KGw=", "ipn0sfGs"));
            readerEditSearchActivity.d2();
            readerEditSearchActivity.f28311z.setVisibility(8);
            readerEditSearchActivity.K.setVisibility(8);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
