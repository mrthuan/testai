package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import industries.deepthought.decode.Decoder;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.ThreadMode;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.bean.DataBridge;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.dialog.ChooseConvertImageTypeDialog;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.merge.MergePdfData;
import pdf.pdfreader.viewer.editor.free.ui.adapter.s;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j1;
import pdf.pdfreader.viewer.editor.free.ui.dialog.u2;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;
import pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver;
import pdf.pdfreader.viewer.editor.free.utils.ReaderWrapContentLinearLayoutManager;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.g1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import wn.d;

/* loaded from: classes3.dex */
public class ReaderSearchActivity extends jl.a implements View.OnClickListener, d.b, s.a, g1.a, ReaderActBroadCastReceiver.a, xn.c {

    /* renamed from: c0  reason: collision with root package name */
    public static final String f26794c0 = ea.a.p("JGU6XzFlMHIraDltW2Rl", "9kOCBQ7V");

    /* renamed from: d0  reason: collision with root package name */
    public static final String f26795d0 = ea.a.p("JGVIXwplVnI5aBV2FGwdZQ==", "WsYumIpz");

    /* renamed from: e0  reason: collision with root package name */
    public static final String f26796e0 = ea.a.p("WGUyXwBlA3IRaGtmG29t", "c8AX5rUm");

    /* renamed from: f0  reason: collision with root package name */
    public static final String f26797f0 = ea.a.p("dVIETSxXK0Q1RVQ=", "iV0uky39");

    /* renamed from: g0  reason: collision with root package name */
    public static final String f26798g0 = ea.a.p("dVIETSxOLVQ7Rn1DKFQfT04=", "IaAPiaA3");
    public RecyclerView A;
    public pdf.pdfreader.viewer.editor.free.ui.adapter.s B;
    public TextView C;
    public RecyclerView D;
    public RelativeLayout E;
    public String F;
    public TextView J;
    public pdf.pdfreader.viewer.editor.free.utils.g1<ReaderSearchActivity> K;
    public pdf.pdfreader.viewer.editor.free.ui.dialog.d L;
    public ReaderActBroadCastReceiver<ReaderSearchActivity> M;
    public PdfListMoreMenuDialog N;
    public pdf.pdfreader.viewer.editor.free.ui.dialog.g0 O;
    public g2 P;
    public pdf.pdfreader.viewer.editor.free.ui.adapter.t Q;
    public h S;
    public ChooseConvertImageTypeDialog Y;
    public pdf.pdfreader.viewer.editor.free.ui.dialog.h Z;

    /* renamed from: a0  reason: collision with root package name */
    public u2 f26799a0;

    /* renamed from: b0  reason: collision with root package name */
    public RenameDialog f26800b0;

    /* renamed from: v  reason: collision with root package name */
    public InterceptTouchFrameLayout f26803v;

    /* renamed from: w  reason: collision with root package name */
    public AppCompatEditText f26804w;

    /* renamed from: x  reason: collision with root package name */
    public AppCompatImageView f26805x;

    /* renamed from: y  reason: collision with root package name */
    public NestedScrollView f26806y;

    /* renamed from: z  reason: collision with root package name */
    public RelativeLayout f26807z;

    /* renamed from: t  reason: collision with root package name */
    public final pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f f26801t = new pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f();

    /* renamed from: u  reason: collision with root package name */
    public final pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b f26802u = new pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b(this);
    public final ArrayList<PdfPreviewEntity> G = new ArrayList<>();
    public boolean H = false;
    public ArrayList<String> I = new ArrayList<>();
    public String R = "";
    public boolean T = false;
    public int U = 0;
    public String V = "";
    public final StringBuilder W = new StringBuilder();
    public String X = "";

    /* loaded from: classes3.dex */
    public class a extends androidx.fragment.app.w {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ PdfPreviewEntity f26808d;

        public a(PdfPreviewEntity pdfPreviewEntity) {
            this.f26808d = pdfPreviewEntity;
        }

        @Override // oo.a
        public final void a() {
            ReaderSearchActivity readerSearchActivity = ReaderSearchActivity.this;
            ArrayList<PdfPreviewEntity> arrayList = readerSearchActivity.B.f27290f;
            if (arrayList != null && arrayList.size() > 0) {
                PdfPreviewEntity pdfPreviewEntity = this.f26808d;
                int indexOf = arrayList.indexOf(pdfPreviewEntity);
                int indexOf2 = readerSearchActivity.G.indexOf(pdfPreviewEntity);
                if (indexOf < arrayList.size() && indexOf >= 0) {
                    int i10 = com.google.android.play.core.assetpacks.c.w(pdfPreviewEntity).f22593n;
                    if (i10 > -1) {
                        yn.a.h0(readerSearchActivity, i10);
                    }
                    if (indexOf2 >= 0 && indexOf2 < readerSearchActivity.G.size()) {
                        readerSearchActivity.G.remove(indexOf2);
                    }
                    arrayList.remove(indexOf);
                    readerSearchActivity.B.notifyItemRemoved(indexOf);
                    bm.c.b(readerSearchActivity).h(pdfPreviewEntity);
                    ReaderSearchActivity.b2(readerSearchActivity);
                    qo.m mVar = new qo.m();
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
        public final /* synthetic */ PdfPreviewEntity f26810a;

        public b(PdfPreviewEntity pdfPreviewEntity) {
            this.f26810a = pdfPreviewEntity;
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog.a
        public final void c(String str, boolean z10) {
            PdfPreviewEntity pdfPreviewEntity;
            int indexOf;
            Editable text;
            ReaderSearchActivity readerSearchActivity = ReaderSearchActivity.this;
            ArrayList<PdfPreviewEntity> arrayList = readerSearchActivity.B.f27290f;
            if (arrayList != null && arrayList.size() > 0 && (indexOf = arrayList.indexOf((pdfPreviewEntity = this.f26810a))) >= 0 && indexOf < arrayList.size()) {
                Object[] L = pdf.pdfreader.viewer.editor.free.utils.v.L(readerSearchActivity, pdfPreviewEntity.getFile(), str, -1);
                File file = (File) L[0];
                if (1 == ((Integer) L[1]).intValue() && file != null) {
                    RenameDialog renameDialog = readerSearchActivity.f26800b0;
                    if (renameDialog != null && renameDialog.isShowing()) {
                        readerSearchActivity.f26800b0.cancel();
                    }
                    pdfPreviewEntity.getPath();
                    String path = file.getPath();
                    pdfPreviewEntity.setDate(file.lastModified());
                    pdfPreviewEntity.setPath(path);
                    pdfPreviewEntity.setName(str);
                    if (TextUtils.isEmpty(readerSearchActivity.F) && (text = readerSearchActivity.f26804w.getText()) != null) {
                        readerSearchActivity.F = text.toString();
                    }
                    if (readerSearchActivity.F != null && !str.trim().toLowerCase().contains(readerSearchActivity.F.trim().toLowerCase())) {
                        readerSearchActivity.B.f27290f.remove(indexOf);
                        readerSearchActivity.B.notifyItemRemoved(indexOf);
                        ReaderSearchActivity.b2(readerSearchActivity);
                    } else {
                        readerSearchActivity.B.notifyItemChanged(indexOf);
                    }
                    pdf.pdfreader.viewer.editor.free.utils.v.I(readerSearchActivity, pdfPreviewEntity);
                    qo.m mVar = new qo.m();
                    mVar.c = true;
                    mVar.f29410g = pdfPreviewEntity;
                    wk.b.b().e(mVar);
                    tn.a.d(readerSearchActivity, "file_more", "filemore_rename_done", readerSearchActivity.d2() + "_" + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
                    return;
                }
                RenameDialog renameDialog2 = readerSearchActivity.f26800b0;
                if (renameDialog2 != null) {
                    renameDialog2.A();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c extends androidx.fragment.app.w {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ PdfPreviewEntity f26812d;

        public c(PdfPreviewEntity pdfPreviewEntity) {
            this.f26812d = pdfPreviewEntity;
        }

        @Override // oo.a
        public final void a() {
            ReaderSearchActivity readerSearchActivity = ReaderSearchActivity.this;
            ArrayList<PdfPreviewEntity> arrayList = readerSearchActivity.B.f27290f;
            PdfPreviewEntity pdfPreviewEntity = this.f26812d;
            int indexOf = arrayList.indexOf(pdfPreviewEntity);
            if (indexOf < arrayList.size() && indexOf >= 0) {
                pdfPreviewEntity.setRecent(0);
                readerSearchActivity.B.notifyItemChanged(indexOf);
                bm.c.b(readerSearchActivity).i(pdfPreviewEntity);
                qo.m mVar = new qo.m();
                mVar.f29406b = true;
                mVar.f29410g = pdfPreviewEntity;
                wk.b.b().e(mVar);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements g2.f {
        public d() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.g2.f
        public final void c(boolean z10) {
            if (!z10) {
                String p10 = ea.a.p("Fmk7ZQptWHJl", "pBpWU71U");
                String p11 = ea.a.p("VWknZR5vEGUtc1F0GXMhZBtkXW5l", "pN25DdGY");
                String str = ReaderSearchActivity.f26794c0;
                ReaderSearchActivity readerSearchActivity = ReaderSearchActivity.this;
                tn.a.d(readerSearchActivity, p10, p11, readerSearchActivity.d2(), false);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26815a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f26816b;

        public e(String str, boolean z10) {
            this.f26815a = str;
            this.f26816b = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message obtain;
            boolean z10 = this.f26816b;
            String str = this.f26815a;
            ReaderSearchActivity readerSearchActivity = ReaderSearchActivity.this;
            try {
                try {
                    pdf.pdfreader.viewer.editor.free.utils.v.b();
                    obtain = Message.obtain();
                    obtain.what = 11;
                    obtain.obj = str;
                    obtain.arg1 = z10 ? 1 : 0;
                    readerSearchActivity.K.sendEmptyMessage(14);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    obtain = Message.obtain();
                    obtain.what = 11;
                    obtain.obj = str;
                    obtain.arg1 = z10 ? 1 : 0;
                    readerSearchActivity.K.sendEmptyMessage(14);
                }
                readerSearchActivity.K.sendMessage(obtain);
            } catch (Throwable th2) {
                Message obtain2 = Message.obtain();
                obtain2.what = 11;
                obtain2.obj = str;
                obtain2.arg1 = z10 ? 1 : 0;
                readerSearchActivity.K.sendEmptyMessage(14);
                readerSearchActivity.K.sendMessage(obtain2);
                throw th2;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements androidx.lifecycle.x<nl.g> {
        @Override // androidx.lifecycle.x
        public final void m(nl.g gVar) {
            if (gVar != null) {
                ReaderPdfApplication.k().g(null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppCompatEditText appCompatEditText = ReaderSearchActivity.this.f26804w;
            if (appCompatEditText != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.g.f(appCompatEditText);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class i implements TextView.OnEditorActionListener {
        public i() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 == 3 || i10 == 0) {
                String charSequence = textView.getText().toString();
                String str = ReaderSearchActivity.f26794c0;
                ReaderSearchActivity readerSearchActivity = ReaderSearchActivity.this;
                readerSearchActivity.e2();
                if (!TextUtils.isEmpty(charSequence)) {
                    String str2 = charSequence.toString();
                    if (!TextUtils.isEmpty(str2)) {
                        ArrayList<String> arrayList = readerSearchActivity.I;
                        if (arrayList != null && !arrayList.contains(str2)) {
                            readerSearchActivity.I.add(0, str2);
                            pdf.pdfreader.viewer.editor.free.ui.adapter.t tVar = readerSearchActivity.Q;
                            if (tVar != null) {
                                tVar.notifyDataSetChanged();
                            }
                        }
                        readerSearchActivity.f26806y.setVisibility(8);
                        readerSearchActivity.F = str2;
                        new wn.d(readerSearchActivity.G, readerSearchActivity).getFilter().filter(str2);
                        return true;
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public class j implements DecryptAndCopyUIHelper.a {
        public j() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.a
        public final void a() {
            tn.a.d(ReaderSearchActivity.this, ea.a.p("R28kbABfAWgdb0dl", "kI0JpXsz"), ea.a.p("O29ebApfR3MtZBVlB3IHcg==", "xNFZrQtu"), ea.a.p("LGUdZ2U=", "kmAoFuP9"), false);
        }

        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.a
        public final void b() {
            tn.a.d(ReaderSearchActivity.this, ea.a.p("R28kbABfAWgdb0dl", "VZe710Zs"), ea.a.p("R28kbABfEnMFZGtzAW93", "HpHfz6PS"), ea.a.p("XmU5Z2U=", "8la0VIc8"), false);
        }
    }

    static {
        ea.a.p("HGVQchpodmN0", "bPnA8Ntj");
    }

    public static void a2(final ReaderSearchActivity readerSearchActivity, final PdfPreviewEntity pdfPreviewEntity, final boolean z10, boolean z11) {
        readerSearchActivity.getClass();
        if (z11) {
            readerSearchActivity.i2(pdfPreviewEntity, new DecryptAndCopyUIHelper.b() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.s0
                @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
                public final void a(List list) {
                    String str = ReaderSearchActivity.f26794c0;
                    ReaderSearchActivity readerSearchActivity2 = ReaderSearchActivity.this;
                    readerSearchActivity2.getClass();
                    if (list.size() > 0) {
                        int i10 = Pdf2ImagePicPreviewActivity.I0;
                        Pdf2ImagePicPreviewActivity.a.a(readerSearchActivity2, pdfPreviewEntity.getPath(), ea.a.p("dVIETSxMK1MmX3lPO0U=", "nvslaZqM"), ((DecryptContainer) list.get(0)).getPassword(), z10);
                        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerSearchActivity2);
                    }
                }
            });
            return;
        }
        int i10 = Pdf2ImagePicPreviewActivity.I0;
        Pdf2ImagePicPreviewActivity.a.a(readerSearchActivity, pdfPreviewEntity.getPath(), ea.a.p("D1I-TW5MBVMcXytPZkU=", "sBIq1LXD"), "", z10);
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerSearchActivity);
    }

    public static void b2(ReaderSearchActivity readerSearchActivity) {
        int size = readerSearchActivity.B.f27290f.size();
        if (size > 1) {
            readerSearchActivity.J.setVisibility(0);
            readerSearchActivity.J.setText(readerSearchActivity.getString(R.string.arg_res_0x7f130414, b.a.c("", size)));
        } else if (size == 1) {
            readerSearchActivity.J.setVisibility(0);
            readerSearchActivity.J.setText(readerSearchActivity.getString(R.string.arg_res_0x7f130413, b.a.c("", size)));
        } else {
            readerSearchActivity.J.setVisibility(0);
            readerSearchActivity.J.setText(readerSearchActivity.getString(R.string.arg_res_0x7f130413, ea.a.p("MA==", "z1bwh8Ys")));
        }
    }

    @Override // jl.a
    public final void C1() {
        this.f26803v = (InterceptTouchFrameLayout) findViewById(R.id.intercept_fl);
        TextView textView = (TextView) findViewById(R.id.tv_x_items);
        this.J = textView;
        textView.setVisibility(8);
        this.A = (RecyclerView) findViewById(R.id.search_result_rv);
        this.f26807z = (RelativeLayout) findViewById(R.id.search_no_content);
        this.f26806y = (NestedScrollView) findViewById(R.id.rl_history);
        this.D = (RecyclerView) findViewById(R.id.history_recycleview);
        TextView textView2 = (TextView) findViewById(R.id.tv_continue);
        this.C = textView2;
        textView2.setOnClickListener(this);
        this.E = (RelativeLayout) findViewById(R.id.continue_layout);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.iv_search_clear);
        this.f26805x = appCompatImageView;
        appCompatImageView.setOnClickListener(this);
        View findViewById = findViewById(R.id.clear_layout);
        findViewById(R.id.iv_back).setOnClickListener(this);
        findViewById.setOnClickListener(this);
        AppCompatEditText appCompatEditText = (AppCompatEditText) findViewById(R.id.et_pdf_search);
        this.f26804w = appCompatEditText;
        appCompatEditText.setImeOptions(268435459);
        t1.b(ea.a.p("HWVQZBxyZGU7ciloNGMcaUNpGnllZgxuD1YqZXc=", "WJhokCkF"));
        h2();
        AppCompatEditText appCompatEditText2 = this.f26804w;
        appCompatEditText2.setHint(" " + getResources().getString(R.string.arg_res_0x7f1303e8));
        this.f26804w.postDelayed(new g(), 200L);
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_pdf_search;
    }

    @Override // jl.a
    public final void K1() {
        this.K = new pdf.pdfreader.viewer.editor.free.utils.g1<>(this);
        this.f26803v.setTopTouchListener(new androidx.appcompat.libconvert.helper.b(this, 13));
        this.A.setLayoutManager(new ReaderWrapContentLinearLayoutManager());
        pdf.pdfreader.viewer.editor.free.ui.adapter.s sVar = new pdf.pdfreader.viewer.editor.free.ui.adapter.s(this, this);
        this.B = sVar;
        this.A.setAdapter(sVar);
        FileRepository.f24155a.getClass();
        kotlinx.coroutines.flow.r rVar = FileRepository.f24177x;
        List list = (List) rVar.b();
        if (list != null && !list.isEmpty()) {
            if (this.U == 1) {
                rVar = FileRepository.f24178y;
            }
            pdf.pdfreader.viewer.editor.free.utils.extension.d.a(this, rVar, new a1(this));
        } else if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
            ReaderPdfApplication.k().h(true);
            FileRepository.A(this, new b1(this));
        }
        h hVar = new h();
        this.S = hVar;
        this.f26804w.addTextChangedListener(hVar);
        this.f26807z.setVisibility(8);
        this.f26804w.setOnEditorActionListener(new i());
    }

    @Override // jl.a
    public final void L1() {
        ReaderPdfApplication.k().f28152i.e(this, new androidx.lifecycle.x() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.n0
            @Override // androidx.lifecycle.x
            public final void m(Object obj) {
                no.d dVar = (no.d) obj;
                String str = ReaderSearchActivity.f26794c0;
                ReaderSearchActivity readerSearchActivity = ReaderSearchActivity.this;
                if (dVar != null) {
                    Context context = readerSearchActivity.f19296j;
                    if (context != null) {
                        pdf.pdfreader.viewer.editor.free.utils.v.K(readerSearchActivity, context, dVar.f22614a, dVar.f22615b);
                        ReaderPdfApplication.k().i(null);
                        return;
                    }
                    return;
                }
                readerSearchActivity.getClass();
            }
        });
        ReaderPdfApplication.k().f28148e.e(this, new f());
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.g1.a
    public final void Q(Message message) {
        int i10;
        int indexOf;
        int i11 = message.what;
        ArrayList<PdfPreviewEntity> arrayList = this.G;
        boolean z10 = true;
        boolean z11 = false;
        switch (i11) {
            case 1:
                if (this.L == null) {
                    this.L = new pdf.pdfreader.viewer.editor.free.ui.dialog.d(this, false);
                }
                if (!this.L.isShowing()) {
                    this.L.show();
                    int i12 = message.arg1;
                    if (i12 == 0) {
                        this.L.a(R.string.arg_res_0x7f1303a8);
                        return;
                    } else {
                        this.L.a(i12);
                        return;
                    }
                }
                return;
            case 2:
                pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = this.L;
                if (dVar != null && dVar.isShowing()) {
                    this.L.cancel();
                    return;
                }
                return;
            case 3:
                PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) message.obj;
                if (pdfPreviewEntity != null) {
                    tn.a.d(this, ea.a.p("BGlaZS5tB3Jl", "Nxb6qhHw"), ea.a.p("KWldZRRvRWUFZC9sEHQNX1ZsB2Nr", "MzbEdYYf"), d2() + ea.a.p("Xw==", "30uXNznq") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
                }
                a aVar = new a(pdfPreviewEntity);
                if (this.Z == null) {
                    this.Z = new pdf.pdfreader.viewer.editor.free.ui.dialog.h(this);
                }
                y1(this);
                pdf.pdfreader.viewer.editor.free.ui.dialog.h hVar = this.Z;
                hVar.getClass();
                hVar.f23542t = aVar;
                this.Z.show();
                return;
            case 4:
                PdfPreviewEntity pdfPreviewEntity2 = (PdfPreviewEntity) message.obj;
                if (pdfPreviewEntity2 != null) {
                    tn.a.d(this, ea.a.p("VWknZSxtDXJl", "wISDGFar"), ea.a.p("FWkBZVpvQ2UXcgNuVW0yX1tsO2Nr", "fnsm717s"), d2() + ea.a.p("Xw==", "onmHJh3j") + aj.b.t(pdfPreviewEntity2.getOtherStrOne()), false);
                    b bVar = new b(pdfPreviewEntity2);
                    if (this.f26800b0 == null) {
                        this.f26800b0 = new RenameDialog(this, pdfPreviewEntity2.getPath());
                    }
                    y1(this);
                    this.f26800b0.B(pdfPreviewEntity2.getName(), pdfPreviewEntity2.getPath());
                    RenameDialog renameDialog = this.f26800b0;
                    renameDialog.getClass();
                    renameDialog.f27479v = bVar;
                    this.f26800b0.show();
                    return;
                }
                return;
            case 5:
                PdfPreviewEntity pdfPreviewEntity3 = (PdfPreviewEntity) message.obj;
                if (message.arg1 != 0) {
                    z10 = false;
                }
                this.P = new g2(this, z10, pdfPreviewEntity3, new d(), this);
                y1(this);
                if (z10) {
                    tn.a.d(this, ea.a.p("HGFLcw5vOGQ=", "7wl8yJw4"), ea.a.p("Q2E4cyxyEnctc1xvdw==", "T134sT5G"), ea.a.p("PW8UZQ==", "4FPfqX6G"), false);
                } else {
                    tn.a.d(this, ea.a.p("Q2E4cwRvEGQ=", "6D8LMhaD"), ea.a.p("Q2E4cyxzEnctc1xvdw==", "v4Qqst6S"), ea.a.p("Im9DZQ==", "tyBKDpCB"), false);
                }
                this.P.show();
                if (message.arg1 == 0) {
                    tn.a.d(this, ea.a.p("KWldZSZtWHJl", "UYhc8Ez3"), ea.a.p("KWldZRRvRWUFcidwBncMX1ZsB2Nr", "mcou1U4v"), d2(), false);
                    return;
                } else {
                    tn.a.d(this, ea.a.p("FGkFZW5tHXJl", "7vri1rXb"), ea.a.p("F2khZQtvA2UXcwN0RHMgZGdjPmkqaw==", "6VqMfqnV"), d2(), false);
                    return;
                }
            case 6:
                PdfPreviewEntity pdfPreviewEntity4 = (PdfPreviewEntity) message.obj;
                if (pdfPreviewEntity4 != null) {
                    tn.a.d(this, ea.a.p("VWknZSxtDXJl", "GX5mQahE"), ea.a.p("VWknZR5vEGUtZVBpHV81bC1jaw==", "W4I7acHR"), d2(), false);
                    int indexOf2 = arrayList.indexOf(pdfPreviewEntity4);
                    if (indexOf2 < arrayList.size() && indexOf2 >= 0) {
                        PdfPreviewEntity pdfPreviewEntity5 = arrayList.get(indexOf2);
                        int recent = pdfPreviewEntity5.getRecent();
                        pdfPreviewEntity5.setRecent(1);
                        pdfPreviewEntity5.setRecentDate(System.currentTimeMillis());
                        bm.c.b(this).i(pdfPreviewEntity5);
                        if (recent == 0) {
                            qo.m mVar = new qo.m();
                            mVar.f29408e = true;
                            mVar.f29410g = pdfPreviewEntity5;
                            wk.b.b().e(mVar);
                        }
                    }
                    pdf.pdfreader.viewer.editor.free.utils.k0.j(this, pdfPreviewEntity4.getPath(), pdfPreviewEntity4, true, 0, ea.a.p("CVJ-TSZTckEIQ0g=", "AVsOfV18"));
                    this.X = pdfPreviewEntity4.getPath();
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
                PdfPreviewEntity pdfPreviewEntity6 = (PdfPreviewEntity) message.obj;
                if (message.arg1 == 1) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (pdfPreviewEntity6 != null) {
                    if (i10 != 0) {
                        tn.a.d(this, ea.a.p("VWknZSxtDXJl", "XkoTSoAo"), ea.a.p("KWldZRRvRWUFdSRtFHIDX1ZsB2Nr", "xgGFX1tQ"), d2() + ea.a.p("Xw==", "4PDVVmvH") + aj.b.t(pdfPreviewEntity6.getOtherStrOne()), false);
                    } else {
                        tn.a.d(this, ea.a.p("KWldZSZtWHJl", "Nt1kVwZF"), ea.a.p("VWknZR5vEGUtbVVyAl81bC1jaw==", "5f6826xF"), d2() + ea.a.p("Xw==", "jVRCewXE") + aj.b.t(pdfPreviewEntity6.getOtherStrOne()), false);
                    }
                    ArrayList<PdfPreviewEntity> arrayList2 = this.B.f27290f;
                    if (arrayList2 != null && arrayList2.size() > 0 && (indexOf = arrayList2.indexOf(pdfPreviewEntity6)) < arrayList2.size() && indexOf >= 0) {
                        pdfPreviewEntity6.setFavorite(i10 ^ 1);
                        pdfPreviewEntity6.setFavoriteDate(System.currentTimeMillis());
                        this.B.notifyItemChanged(indexOf);
                        bm.c.b(this).i(pdfPreviewEntity6);
                        qo.m mVar2 = new qo.m();
                        mVar2.f29407d = true;
                        mVar2.f29410g = pdfPreviewEntity6;
                        wk.b.b().e(mVar2);
                        if (pdfPreviewEntity6.getFavorite() == 1) {
                            j1.d(this, getString(R.string.arg_res_0x7f130366, getString(R.string.arg_res_0x7f13036f)), androidx.core.content.a.getDrawable(this, R.drawable.ic_home_bookmark));
                            return;
                        } else {
                            j1.e(this, getString(R.string.arg_res_0x7f1303df, getString(R.string.arg_res_0x7f13036f)), true, null, -1);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 9:
                c cVar = new c((PdfPreviewEntity) message.obj);
                if (this.f26799a0 == null) {
                    this.f26799a0 = new u2(this);
                }
                y1(this);
                u2 u2Var = this.f26799a0;
                u2Var.getClass();
                u2Var.f23542t = cVar;
                this.f26799a0.show();
                return;
            case 10:
                PdfPreviewEntity pdfPreviewEntity7 = (PdfPreviewEntity) message.obj;
                if (pdfPreviewEntity7 != null) {
                    tn.a.d(this, ea.a.p("KWldZSZtWHJl", "v2xwgRRn"), ea.a.p("VWknZR5vEGUtc1xhG2UJYyhpUWs=", "dzguqI1S"), d2() + ea.a.p("Xw==", "R2DoG2bJ") + aj.b.t(pdfPreviewEntity7.getOtherStrOne()), false);
                    pdf.pdfreader.viewer.editor.free.utils.e1.e(this, pdfPreviewEntity7);
                    return;
                }
                return;
            case 11:
                g2 g2Var = this.P;
                if (g2Var != null && g2Var.isShowing()) {
                    this.P.cancel();
                }
                String str = (String) message.obj;
                if (message.arg1 == 1) {
                    tn.a.d(this, ea.a.p("MWE9czJvFGQ=", "mdANEfFH"), ea.a.p("Q2E4cyxzEnctZFtuZQ==", "QTPGSybN"), ea.a.p("Xm85ZQ==", "K2DPbJe0"), false);
                    j1.d(this, getString(R.string.arg_res_0x7f1303aa), androidx.core.content.a.getDrawable(this, R.drawable.ic_more_lock));
                } else {
                    tn.a.d(this, ea.a.p("P2FCcw5vRWQ=", "MUftd8cK"), ea.a.p("KWEacztyFHcXZAluZQ==", "cwYidd7N"), ea.a.p("Xm85ZQ==", "HB5nTPC0"), false);
                    j1.e(this, getString(R.string.arg_res_0x7f1303c4), true, androidx.core.content.a.getDrawable(this, R.drawable.ic_more_unlock), -1);
                }
                ArrayList<PdfPreviewEntity> arrayList3 = this.B.f27290f;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    PdfPreviewEntity pdfPreviewEntity8 = arrayList3.get(i13);
                    if (pdfPreviewEntity8.getPath().equals(str)) {
                        File file = new File(str);
                        if (file.exists()) {
                            pdfPreviewEntity8.setDate(file.lastModified());
                        }
                        if (message.arg1 == 1) {
                            z11 = true;
                        }
                        pdfPreviewEntity8.setOtherBoolOne(z11);
                        pdfPreviewEntity8.setOtherIntOne(1);
                        this.B.notifyItemChanged(i13);
                        bm.c.b(this).i(pdfPreviewEntity8);
                        qo.m mVar3 = new qo.m();
                        mVar3.f29409f = true;
                        mVar3.f29410g = pdfPreviewEntity8;
                        wk.b.b().e(mVar3);
                        return;
                    }
                }
                return;
            case 15:
                this.T = true;
                if (!TextUtils.isEmpty(this.R)) {
                    this.f26805x.setVisibility(0);
                    new ArrayList();
                    new d.a(arrayList, this).filter(this.R);
                    this.R = "";
                    return;
                }
                return;
        }
    }

    @Override // jl.a
    public final void T1(Bundle bundle) {
        if (bundle != null) {
            this.R = bundle.getString(f26795d0, "");
        }
    }

    @Override // xn.c
    public final void c(String str, boolean z10) {
        if (!z10) {
            tn.a.d(this, ea.a.p("KWldZSZtWHJl", "kzWxtJgm"), ea.a.p("KWldZRRvRWUFcidwBncMX1FvAGU=", "Ofrsnu6f"), d2(), false);
        }
        pdf.pdfreader.viewer.editor.free.utils.w0.a().f28790a.execute(new e(str, z10));
    }

    public final void c2() {
        if (f26797f0.equals(this.V)) {
            ReaderPdfApplication.h();
            Intent intent = new Intent(this, ReaderHomeActivity.class);
            intent.putExtra(ea.a.p("WGUyXx1lFV8bbkBlB3QJZCtfXG8yaCpuZw==", "Z9D5gFXy"), true);
            startActivity(intent);
            finish();
            return;
        }
        finish();
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver.a
    public final void d0(String str, Intent intent) {
        if (ea.a.p("Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpO28ULlZyLmUdQQhUOk8sXzpPeUU2VB5VCUJhXwVPDlADRTJF", "Of0K3NPD").equals(str)) {
            this.B.notifyDataSetChanged();
        }
    }

    public final String d2() {
        return ea.a.p("KmUncixo", "vbYFO3qi");
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void dismissDialogEvent(qo.a aVar) {
        if (aVar != null) {
            PdfPreviewEntity pdfPreviewEntity = aVar.f29391a;
            ea.a.p("goDi5cC6qLrO6cSE3Kff6Zm1", "WDkbGL9r");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            if (!TextUtils.isEmpty(this.X)) {
                try {
                    ArrayList<PdfPreviewEntity> arrayList = this.B.f27290f;
                    if (arrayList != null && arrayList.size() > 0) {
                        int size = arrayList.size();
                        PdfPreviewEntity pdfPreviewEntity2 = null;
                        for (int i10 = 0; i10 < size; i10++) {
                            PdfPreviewEntity pdfPreviewEntity3 = arrayList.get(i10);
                            if (this.X.equals(pdfPreviewEntity3.getPath())) {
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

    public final void e2() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(ea.a.p("PG4ZdQBfXmU8aAlk", "H2Uit3Lb"));
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f26804w.getWindowToken(), 0);
        }
    }

    public final void f2() {
        TextView textView;
        if (this.U == 1 && TextUtils.equals(this.V, ea.a.p("R28kbHM=", "1thd09Ed"))) {
            tn.a.d(this, ea.a.p("R28kbABfAWgdb0dl", "zOzvQ0k2"), ea.a.p("O29ebApfUWk2ZRVjGWkLaw==", "UiUxTBj8"), ea.a.p("XmU5Z2U=", "gyi3jSi9"), false);
        }
        pdf.pdfreader.viewer.editor.free.ui.adapter.s sVar = this.B;
        if (sVar != null && (textView = this.C) != null) {
            textView.setEnabled(!sVar.f27296l.isEmpty());
            ArrayList<Long> arrayList = this.B.f27296l;
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    this.C.setText(getResources().getString(R.string.arg_res_0x7f130365));
                    return;
                }
                TextView textView2 = this.C;
                textView2.setText(getResources().getString(R.string.arg_res_0x7f130365) + ea.a.p("KA==", "X13Niij1") + this.B.f27296l.size() + ea.a.p("KQ==", "DglPK6lg"));
            }
        }
    }

    @Override // xn.c
    public final void g() {
        tn.a.d(this, ea.a.p("VWknZSxtDXJl", "jVPUJ35d"), ea.a.p("NmkdZRlvGGUXcgtwR3czX11yIG9y", "ZgPqtjBT"), d2(), false);
    }

    public final void g2(Intent intent) {
        this.U = intent.getIntExtra(f26794c0, 0);
        this.V = intent.getStringExtra(f26796e0);
        pdf.pdfreader.viewer.editor.free.ui.adapter.s sVar = this.B;
        int i10 = this.U;
        sVar.f27293i = i10;
        if (i10 == 1) {
            ArrayList<Long> arrayList = sVar.f27294j;
            arrayList.clear();
            for (MergePdfData mergePdfData : DataBridge.a()) {
                arrayList.add(Long.valueOf(mergePdfData.getId()));
            }
        }
        if (this.U == 1) {
            this.E.setVisibility(0);
            this.A.setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.dp_86));
            this.A.q(new pdf.pdfreader.viewer.editor.free.utils.f1(getResources().getDimensionPixelSize(R.dimen.dp_4)));
            this.A.setClipToPadding(false);
            return;
        }
        this.E.setVisibility(8);
        this.A.setHasFixedSize(true);
    }

    public final void h2() {
        String p10;
        if ((ea.a.p("YWUqZBZyMWUTcldoKGMiaTJpRnlmcytvLkhdZBFEJmxWdC5IGnMWbwB5FG06cB5pN3Rdcj9DK2ErcxRzHXomIA4gew==", "Y4tCAfta") + this.I) != null) {
            p10 = String.valueOf(this.I.size());
        } else {
            p10 = ea.a.p("AyA2IA==", "1VHjaQ1V");
        }
        t1.b(p10);
        ArrayList<String> arrayList = this.I;
        if (arrayList != null && arrayList.size() > 0 && TextUtils.isEmpty(this.R)) {
            NestedScrollView nestedScrollView = this.f26806y;
            if (nestedScrollView != null) {
                nestedScrollView.setVisibility(0);
                return;
            }
            return;
        }
        NestedScrollView nestedScrollView2 = this.f26806y;
        if (nestedScrollView2 != null) {
            nestedScrollView2.setVisibility(8);
        }
    }

    public final void i2(PdfPreviewEntity pdfPreviewEntity, DecryptAndCopyUIHelper.b bVar) {
        y1(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(aj.b.l(pdfPreviewEntity));
        new DecryptAndCopyUIHelper(this, arrayList, bVar).g();
    }

    @Override // wn.d.b
    public final void l1(ArrayList<PdfPreviewEntity> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            t1.b(ea.a.p("YWUqZBZyMWUTcldoKGMiaTJpRnlmcyZhEGM4UgRzMmxHIDllAHUOdAEgWm8dIDNtNHR5", "bPaGPoU6"));
            this.f26807z.setVisibility(8);
            this.A.setVisibility(0);
            this.f26806y.setVisibility(8);
            this.B.h(this.F, arrayList);
            this.J.setVisibility(0);
            if (arrayList.size() > 1) {
                TextView textView = this.J;
                textView.setText(getString(R.string.arg_res_0x7f130415, "" + arrayList.size()));
                return;
            }
            TextView textView2 = this.J;
            textView2.setText(getString(R.string.arg_res_0x7f130413, "" + arrayList.size()));
            return;
        }
        t1.b(ea.a.p("YWUqZBZyMWUTcldoKGMiaTJpRnlmcyZhNWMqUgRzPGxHIDllAHUOdAEgCSAHdTpsZHwSZStwN3k=", "GBaIzc7s"));
        this.f26807z.setVisibility(0);
        this.A.setVisibility(8);
        this.J.setVisibility(8);
        this.J.setText(getString(R.string.arg_res_0x7f130413, ea.a.p("MA==", "eafckWNG")));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.A.getVisibility() == 0 && this.J.getVisibility() == 0 && this.B.getItemCount() > 0) {
            this.f26804w.setText("");
            this.B.h("", new ArrayList());
            this.A.setVisibility(8);
            this.J.setVisibility(8);
            this.f26807z.setVisibility(8);
            t1.b(ea.a.p("HWVQZBxyZGU7ciloNGMcaUNpGnllbwtCVWMHUAVlCnMqZA==", "sxQc4lwy"));
            h2();
            return;
        }
        t1.b(ea.a.p("QWUvIANyDWcAZUdzUyAlZSVyUWhmYiJjMiBWaTdpF2g=", "Y0YdTqNP"));
        c2();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.clear_layout /* 2131362262 */:
                ArrayList<String> arrayList = this.I;
                if (arrayList != null && arrayList.size() > 0) {
                    androidx.fragment.app.o0 o0Var = new androidx.fragment.app.o0(1);
                    o0Var.f3891a = getResources().getString(R.string.arg_res_0x7f130379);
                    o0Var.f3892b = getResources().getString(R.string.arg_res_0x7f13037f);
                    o0Var.f3893d = getResources().getString(R.string.arg_res_0x7f130377);
                    i2.b(this, o0Var, new k());
                    return;
                }
                return;
            case R.id.iv_back /* 2131362902 */:
                e2();
                c2();
                return;
            case R.id.iv_search_clear /* 2131362969 */:
                if (!TextUtils.isEmpty(this.f26804w.getText())) {
                    this.f26804w.setText("");
                    this.A.setVisibility(8);
                    t1.b(ea.a.p("GmUPZB1yHmUpcgVodWMjaU5pJnlpaUBfB2UQcjJoHWMkZQ9y", "zfHnxMYl"));
                    h2();
                    this.J.setVisibility(8);
                    this.J.setText(getString(R.string.arg_res_0x7f130413, ea.a.p("MA==", "RJWvL1xd")));
                    return;
                }
                return;
            case R.id.tv_continue /* 2131364347 */:
                try {
                    String obj = this.f26804w.getText().toString();
                    ArrayList<String> arrayList2 = this.I;
                    if (arrayList2 != null && !arrayList2.contains(obj)) {
                        this.I.add(0, obj);
                        pdf.pdfreader.viewer.editor.free.ui.adapter.t tVar = this.Q;
                        if (tVar != null) {
                            tVar.notifyDataSetChanged();
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                pdf.pdfreader.viewer.editor.free.ui.adapter.s sVar = this.B;
                ArrayList<Long> arrayList3 = sVar.f27295k;
                ArrayList<Long> arrayList4 = sVar.f27296l;
                if (!arrayList3.isEmpty()) {
                    Iterator it = DataBridge.a().iterator();
                    while (it.hasNext()) {
                        if (arrayList3.contains(Long.valueOf(((MergePdfData) it.next()).getId()))) {
                            it.remove();
                        }
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                if (!arrayList4.isEmpty()) {
                    Iterator<Long> it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        Long next = it2.next();
                        Iterator<PdfPreviewEntity> it3 = this.B.f27290f.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                PdfPreviewEntity next2 = it3.next();
                                if (next2.getId() == next.longValue()) {
                                    arrayList5.add(next2);
                                }
                            }
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    WeakReference weakReference = new WeakReference(this);
                    Handler handler = new Handler(Looper.getMainLooper());
                    this.K.sendEmptyMessage(1);
                    pdf.pdfreader.viewer.editor.free.utils.w0.a().f28790a.execute(new lm.b(this, arrayList5, weakReference, arrayList6, handler, 2));
                    return;
                }
                e2();
                finish();
                return;
            case R.id.tv_history /* 2131364379 */:
                this.f26804w.setText(((TextView) view).getText());
                return;
            default:
                return;
        }
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        int i10;
        char c10;
        char c11;
        dp.a.a().getClass();
        dp.a.b(this, ea.a.p("YWUqZBZyMWUTcldoKGMiaTJpRnlmby1DPGUHdFUg", "Nf0o9nqo") + Build.FINGERPRINT);
        t1.b(ea.a.p("HWVQZBxyZGU7ciloNGMcaUNpGnllbwtDAWUNdGU=", "46cgslYR"));
        Intent intent = getIntent();
        String str2 = f26796e0;
        if (intent != null) {
            this.U = intent.getIntExtra(f26794c0, 0);
            this.V = intent.getStringExtra(str2);
        }
        super.onCreate(bundle);
        if (Decoder.f18572a) {
            try {
                String substring = od.a.b(this).substring(2549, 2580);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset = kotlin.text.a.f19966b;
                byte[] bytes = substring.getBytes(charset);
                kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] bytes2 = "affb1bf258ffa9d5401372faecedf69".getBytes(charset);
                kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                long j10 = 2;
                if (System.currentTimeMillis() % j10 == 0) {
                    int nextInt = od.a.f23055a.nextInt(0, bytes.length / 2);
                    int i11 = 0;
                    while (true) {
                        if (i11 <= nextInt) {
                            if (bytes[i11] != bytes2[i11]) {
                                c11 = 16;
                                break;
                            }
                            i11++;
                        } else {
                            c11 = 0;
                            break;
                        }
                    }
                    if ((c11 ^ 0) != 0) {
                        od.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes2, bytes)) {
                    od.a.a();
                    throw null;
                }
                try {
                    String substring2 = wc.a.b(this).substring(1390, 1421);
                    kotlin.jvm.internal.g.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    Charset charset2 = kotlin.text.a.f19966b;
                    byte[] bytes3 = substring2.getBytes(charset2);
                    kotlin.jvm.internal.g.d(bytes3, "this as java.lang.String).getBytes(charset)");
                    byte[] bytes4 = "9dfdacbe4124864a34903a2330a59cb".getBytes(charset2);
                    kotlin.jvm.internal.g.d(bytes4, "this as java.lang.String).getBytes(charset)");
                    if (System.currentTimeMillis() % j10 == 0) {
                        int nextInt2 = wc.a.f31072a.nextInt(0, bytes3.length / 2);
                        int i12 = 0;
                        while (true) {
                            if (i12 <= nextInt2) {
                                if (bytes3[i12] != bytes4[i12]) {
                                    c10 = 16;
                                    break;
                                }
                                i12++;
                            } else {
                                c10 = 0;
                                break;
                            }
                        }
                        if ((c10 ^ 0) != 0) {
                            wc.a.a();
                            throw null;
                        }
                    } else if (!Arrays.equals(bytes4, bytes3)) {
                        wc.a.a();
                        throw null;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    wc.a.a();
                    throw null;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                od.a.a();
                throw null;
            }
        } else {
            ReaderPdfApplication.o(this);
        }
        ReaderPdfApplication.f23865q = Process.myPid();
        ReaderHomeActivity.f26644h2 = true;
        wk.b.b().i(this);
        b.b.Z(this);
        if (getIntent().hasExtra(ea.a.p("I2FfZwxhUGUFci9jFGwEX1tvGmkjaQZhEWk6bjx0Jmc=", "8O4weUcG"))) {
            ReaderPdfApplication.f();
            pdf.pdfreader.viewer.editor.free.service.b.d();
            if (bundle == null) {
                EventCenter.sendLanguageRecallClickEvent(this, getIntent());
            }
        }
        String a10 = eo.a.a(this);
        t1.b(ea.a.p("I2UUZDRyP2UpcgVodWMjaU5pJnlpZ1N0PGkCdD5yO1MBRBR0MCBMZCl0ByAJIA==", "mKquQlVn") + a10);
        if (!TextUtils.isEmpty(a10)) {
            this.I = new ArrayList<>();
            if (a10.contains(ea.a.p("gb-l", "eFnO9OrF"))) {
                String[] split = a10.split(ea.a.p("oL-l", "poRdzxKf"));
                if (split != null && split.length > 0) {
                    for (String str3 : split) {
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str3.trim())) {
                            this.I.add(str3);
                        }
                    }
                }
            } else {
                this.I.add(a10);
            }
        } else {
            this.I = new ArrayList<>();
        }
        pdf.pdfreader.viewer.editor.free.ui.adapter.t tVar = new pdf.pdfreader.viewer.editor.free.ui.adapter.t(this.I, new cg.l() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.p0
            @Override // cg.l
            public final Object invoke(Object obj) {
                String str4 = (String) obj;
                ReaderSearchActivity readerSearchActivity = ReaderSearchActivity.this;
                if (str4 != null) {
                    readerSearchActivity.f26804w.setText(str4);
                    readerSearchActivity.f26804w.setSelection(str4.length());
                    readerSearchActivity.e2();
                    return null;
                }
                String str5 = ReaderSearchActivity.f26794c0;
                readerSearchActivity.getClass();
                return null;
            }
        }, new z0(this));
        this.Q = tVar;
        this.D.setAdapter(tVar);
        this.D.setLayoutManager(new LinearLayoutManager(1));
        t1.b(ea.a.p("YWUqZBZyMWUTcldoKGMiaTJpRnlmaS1pE0YNbz9MDXlcdXQ=", "gaHlQcnO"));
        h2();
        this.M = new ReaderActBroadCastReceiver<>(this);
        p1.a.a(this).b(this.M, new IntentFilter(ea.a.p("Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpJ28FLidyFGUdQQhUOk8sXzpPeUU2VB5VCUJhXwVPDlAfRSNF", "SwAqS7UG")));
        g2(getIntent());
        Intent intent2 = getIntent();
        if (intent2 != null) {
            str = intent2.getStringExtra(str2);
        } else {
            str = "";
        }
        boolean equals = f26797f0.equals(str);
        String str4 = f26798g0;
        if ((equals || str4.equals(str)) && !pdf.pdfreader.viewer.editor.free.utils.h1.c() && androidx.core.content.a.checkSelfPermission(this, ea.a.p("B24xcippAC44ZRRtXXMkaVdufFcbSWJFK0UpVBRSDEEqXwZUClIlR0U=", "HMfUEd9h")) != 0) {
            startActivity(new Intent(this, ReaderHomeActivity.class));
            finish();
        }
        if (bundle == null && TextUtils.equals(str4, str)) {
            i10 = 0;
            tn.a.d(this, ea.a.p("XW8_aRBl", "Hysg9SmY"), ea.a.p("XW8_aRBlPXIXc11kDG4iXydsW2Nr", "01U6XTe8"), ea.a.p("PGVQchpo", "iUDBpWJg"), false);
        } else {
            i10 = 0;
        }
        fo.a.f17317b.e(this, new o0(this, i10));
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        h hVar;
        RenameDialog renameDialog = this.f26800b0;
        if (renameDialog != null && renameDialog.isShowing()) {
            this.f26800b0.cancel();
        }
        u2 u2Var = this.f26799a0;
        if (u2Var != null && u2Var.isShowing()) {
            this.f26799a0.cancel();
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.h hVar2 = this.Z;
        if (hVar2 != null && hVar2.isShowing()) {
            this.Z.cancel();
        }
        pdf.pdfreader.viewer.editor.free.utils.g1<ReaderSearchActivity> g1Var = this.K;
        if (g1Var != null) {
            g1Var.removeCallbacksAndMessages(null);
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = this.L;
        if (dVar != null && dVar.isShowing()) {
            this.L.cancel();
        }
        g2 g2Var = this.P;
        if (g2Var != null && g2Var.isShowing()) {
            this.P.cancel();
        }
        PdfListMoreMenuDialog pdfListMoreMenuDialog = this.N;
        if (pdfListMoreMenuDialog != null && pdfListMoreMenuDialog.isShowing()) {
            this.N.cancel();
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.g0 g0Var = this.O;
        if (g0Var != null && g0Var.isShowing()) {
            this.O.cancel();
        }
        ChooseConvertImageTypeDialog chooseConvertImageTypeDialog = this.Y;
        if (chooseConvertImageTypeDialog != null && chooseConvertImageTypeDialog.isShowing()) {
            this.Y.cancel();
        }
        InterceptTouchFrameLayout interceptTouchFrameLayout = this.f26803v;
        if (interceptTouchFrameLayout != null) {
            interceptTouchFrameLayout.setTopTouchListener(null);
        }
        AppCompatEditText appCompatEditText = this.f26804w;
        if (appCompatEditText != null && (hVar = this.S) != null) {
            appCompatEditText.removeTextChangedListener(hVar);
        }
        wk.b.b().k(this);
        if (this.M != null) {
            p1.a.a(this).d(this.M);
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.f26804w != null && this.A != null && this.J != null) {
            boolean equals = TextUtils.equals(f26798g0, intent.getStringExtra(f26796e0));
            if (!TextUtils.isEmpty(this.f26804w.getText()) && !equals) {
                this.f26804w.setText("");
                this.A.setVisibility(8);
                t1.b(ea.a.p("HWVQZBxyZGU7ciloNGMcaUNpGnllaRNfPWUJci9oBmMjZVBy", "4M3JNhLY"));
                h2();
                this.J.setVisibility(8);
                this.J.setText(getString(R.string.arg_res_0x7f130413, ea.a.p("MA==", "zEE1PoaG")));
            }
            g2(intent);
        }
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        super.onPause();
        AppCompatEditText appCompatEditText = this.f26804w;
        if (appCompatEditText != null) {
            appCompatEditText.clearFocus();
        }
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        AppOpenManager.c().f23907g = true;
        if (this.H) {
            this.H = false;
        }
        PdfPreviewEntity pdfPreviewEntity = ReaderPdfApplication.f23857i;
        if (pdfPreviewEntity != null) {
            if (!pdf.pdfreader.viewer.editor.free.ads.l.m().g() && !pdf.pdfreader.viewer.editor.free.ads.f.m().g() && !pdf.pdfreader.viewer.editor.free.ads.g.m().g()) {
                pdf.pdfreader.viewer.editor.free.utils.k0.g(this, pdfPreviewEntity.getPath(), pdfPreviewEntity, ea.a.p("N1ImTSlUA0kaRA==", "eRqivKKb"));
            }
            ReaderPdfApplication.f23857i = null;
        }
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AppCompatEditText appCompatEditText = this.f26804w;
        if (appCompatEditText != null && appCompatEditText.getText() != null) {
            String obj = this.f26804w.getText().toString();
            t1.b(ea.a.p("HWVQZBxyZGU7ciloNGMcaUNpGnllbwtTV3YcSRtzJWEhY1RTDWFDZXpzL2EHYwAgCCA=", "Td2t6yuQ") + obj);
            if (!TextUtils.isEmpty(obj)) {
                bundle.putString(f26795d0, obj);
            }
        }
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStop() {
        StringBuilder sb2 = this.W;
        sb2.setLength(0);
        ArrayList<String> arrayList = this.I;
        if (arrayList != null && arrayList.size() > 0) {
            int size = this.I.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(this.I.get(i10));
                if (i10 != size - 1) {
                    sb2.append(ea.a.p("3L-l", "cHePZkya"));
                }
            }
        }
        eo.a.b(this, sb2.toString());
        t1.b(ea.a.p("YWUqZBZyMWUTcldoKGMiaTJpRnlmby1TMG82IHpzLi5Hbxh0AWkMZ1opFD0g", "DFZLGoCS") + sb2.toString());
        super.onStop();
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void savePdfChangeState(qo.l lVar) {
        PdfPreviewEntity pdfPreviewEntity;
        if (lVar != null) {
            if (lVar.f29403a.equals(ea.a.p("BVIHTRJTMUEaQ0g=", "WECHMtf8")) && !TextUtils.isEmpty(this.X)) {
                ConcurrentHashMap<String, File> concurrentHashMap = pdf.pdfreader.viewer.editor.free.utils.v.f28781a;
                try {
                    ArrayList<PdfPreviewEntity> arrayList = this.B.f27290f;
                    if (arrayList != null && arrayList.size() > 0) {
                        int size = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                pdfPreviewEntity = arrayList.get(i10);
                                if (this.X.equals(pdfPreviewEntity.getPath())) {
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
                                this.H = true;
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
    public class k implements j1.c {
        public k() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.j1.c
        public final void b() {
            ReaderSearchActivity readerSearchActivity = ReaderSearchActivity.this;
            ArrayList<String> arrayList = readerSearchActivity.I;
            if (arrayList != null && arrayList.size() > 0) {
                readerSearchActivity.I.clear();
                pdf.pdfreader.viewer.editor.free.ui.adapter.t tVar = readerSearchActivity.Q;
                if (tVar != null) {
                    tVar.notifyDataSetChanged();
                }
            }
            t1.b(ea.a.p("ZGUDZDByJWUpcgVodWMjaU5pJnlpY1plFXIubDB5LXV0", "L76bUvkh"));
            readerSearchActivity.h2();
            eo.a.b(readerSearchActivity, "");
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
    public final void V(int i10) {
    }

    @Override // xn.c
    public final void w0(Throwable th2) {
    }

    /* loaded from: classes3.dex */
    public class h implements TextWatcher {
        public h() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ReaderSearchActivity readerSearchActivity = ReaderSearchActivity.this;
            if (!readerSearchActivity.T) {
                return;
            }
            pdf.pdfreader.viewer.editor.free.ui.adapter.s sVar = readerSearchActivity.B;
            if (sVar != null) {
                sVar.f27295k.clear();
                sVar.f27296l.clear();
                readerSearchActivity.f2();
            }
            String obj = editable.toString();
            if (!TextUtils.isEmpty(obj)) {
                readerSearchActivity.f26806y.setVisibility(8);
                readerSearchActivity.f26805x.setVisibility(0);
                readerSearchActivity.F = obj;
                new wn.d(readerSearchActivity.G, readerSearchActivity).getFilter().filter(obj);
                return;
            }
            readerSearchActivity.A.setVisibility(8);
            readerSearchActivity.f26805x.setVisibility(8);
            t1.b(ea.a.p("CGUqZFRyNmUpcgVodWMjaU5pJnlpYVB0EXIlZSl0AWg7bixlVSAWIHUgCHVYbA==", "RLZK1emH"));
            readerSearchActivity.h2();
            readerSearchActivity.f26807z.setVisibility(8);
            readerSearchActivity.J.setVisibility(8);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
