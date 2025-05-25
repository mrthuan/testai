package pdf.pdfreader.viewer.editor.free.ui.act.tools;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.w;
import cg.l;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import ha.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.m;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.bean.DataBridge;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;
import pdf.pdfreader.viewer.editor.free.feature.ai.data.AIQuickTag;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.v;
import pdf.pdfreader.viewer.editor.free.ui.vm.AppViewModel;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver;
import pdf.pdfreader.viewer.editor.free.utils.e1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.k0;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import qb.f0;

/* compiled from: BaseOperatePDFActivity.kt */
/* loaded from: classes3.dex */
public abstract class BaseOperatePDFActivity extends pdf.pdfreader.viewer.editor.free.ui.act.a implements xn.c, ReaderActBroadCastReceiver.a {
    public static final /* synthetic */ int Z = 0;
    public ToolsType J;
    public i3 L;
    public v M;
    public g2 N;
    public PdfPreviewEntity O;
    public boolean P;
    public FrameLayout Q;
    public OperateExecuteTask R;
    public boolean S;
    public ArrayList<PdfPreviewEntity> T;
    public int U;
    public AIQuickTag V;
    public ReaderActBroadCastReceiver<BaseOperatePDFActivity> W;
    public boolean X;
    public long Y;
    public final tf.c I = kotlin.a.a(new cg.a<ArrayList<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity$pdfFiles$2
        @Override // cg.a
        public final ArrayList<PdfPreviewEntity> invoke() {
            return new ArrayList<>();
        }
    });
    public final tf.c K = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity$mainHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* compiled from: BaseOperatePDFActivity.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26984a;

        static {
            int[] iArr = new int[ToolsType.values().length];
            try {
                iArr[ToolsType.LOCK_PDF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToolsType.UNLOCK_PDF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToolsType.WORD2PDF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ToolsType.AI_UPLOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ToolsType.EDIT_PDF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ToolsType.PDF_ADD_TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ToolsType.MERGE_PDF.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ToolsType.SPLIT_PDF.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ToolsType.PRINT_PDF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ToolsType.SIGN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ToolsType.IMG2PDF.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ToolsType.SCAN2PDF.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ToolsType.PDF2WORD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ToolsType.PDF2IMG.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ToolsType.PDF2LONG_IMG.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ToolsType.HOME_SCREEN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ToolsType.EDIT_TEXT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ToolsType.HOME_GUIDE_EDIT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ToolsType.EDIT_PDF_DEFAULT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            f26984a = iArr;
        }
    }

    /* compiled from: BaseOperatePDFActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b extends androidx.privacysandbox.ads.adservices.topics.d {
        public b() {
        }

        @Override // androidx.privacysandbox.ads.adservices.topics.d, pdf.pdfreader.viewer.editor.free.utils.h0
        public final void a() {
            String p10 = ea.a.p("O29ebApfVGg1bzll", "EbtGKIEB");
            String p11 = ea.a.p("R28kbABfEnMFZGtzAW93", "Lj9kH8L5");
            BaseOperatePDFActivity baseOperatePDFActivity = BaseOperatePDFActivity.this;
            tn.a.d(baseOperatePDFActivity, p10, p11, baseOperatePDFActivity.r2(), false);
        }

        @Override // androidx.privacysandbox.ads.adservices.topics.d, pdf.pdfreader.viewer.editor.free.utils.h0
        public final void c() {
            BaseOperatePDFActivity.this.I1();
        }

        @Override // androidx.privacysandbox.ads.adservices.topics.d, pdf.pdfreader.viewer.editor.free.utils.h0
        public final void d() {
            BaseOperatePDFActivity.this.V1();
        }

        @Override // androidx.privacysandbox.ads.adservices.topics.d, pdf.pdfreader.viewer.editor.free.utils.h0
        public final void e() {
            String p10 = ea.a.p("IW9bbDVfC2gnbxVl", "dqU4Fhkd");
            String p11 = ea.a.p("R28kbABfEnMFZGtlG3I5cg==", "vfUaTTYM");
            BaseOperatePDFActivity baseOperatePDFActivity = BaseOperatePDFActivity.this;
            tn.a.d(baseOperatePDFActivity, p10, p11, baseOperatePDFActivity.r2(), false);
        }
    }

    /* compiled from: BaseOperatePDFActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements pdf.pdfreader.viewer.editor.free.utils.f {
        public c() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.f
        public final void a(PdfPreviewEntity entity) {
            kotlin.jvm.internal.g.e(entity, "entity");
            BaseOperatePDFActivity baseOperatePDFActivity = BaseOperatePDFActivity.this;
            if (baseOperatePDFActivity.f19289b) {
                baseOperatePDFActivity.O = entity;
                baseOperatePDFActivity.P = true;
                return;
            }
            k0.g(baseOperatePDFActivity, entity.getPath(), entity, ea.a.p("f1I_TQZUC0kaRA==", "8s9pYCQ9"));
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.f
        public final void b() {
            BaseOperatePDFActivity baseOperatePDFActivity = BaseOperatePDFActivity.this;
            j1.a(baseOperatePDFActivity, baseOperatePDFActivity.getString(R.string.arg_res_0x7f1303c0));
        }
    }

    public BaseOperatePDFActivity() {
        kotlin.jvm.internal.g.d(registerForActivityResult(new pdf.pdfreader.viewer.editor.free.utils.a(), new androidx.appcompat.libconvert.helper.b(this, 14)), ea.a.p("PWVWaQp0UnIcbzhBFnQBdlx0F1IgcxBspYCeChEgRCBvIBEgWSAXICcpQCBVIEggFSBOfQ==", "fKu3G81d"));
    }

    private final void A2(ArrayList<PdfPreviewEntity> arrayList, boolean z10) {
        String p10;
        String string;
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            int i10 = 1;
            this.S = true;
            this.T = arrayList;
            frameLayout.setVisibility(0);
            FrameLayout frameLayout2 = this.Q;
            kotlin.jvm.internal.g.b(frameLayout2);
            frameLayout2.removeAllViews();
            if (this.R == null) {
                this.R = new OperateExecuteTask();
            }
            if (u2() == ToolsType.LOCK_PDF) {
                p10 = ea.a.p("X28oaw==", "5o8h2S1t");
                string = getString(R.string.arg_res_0x7f13022a);
                kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGwqYw5lFl86dQhjPHM8KQ==", "8ctErIkY"));
            } else {
                p10 = ea.a.p("Rm4nbxBr", "L0oFMiMk");
                string = getString(R.string.arg_res_0x7f130567);
                kotlin.jvm.internal.g.d(string, ea.a.p("H2UdU0NyG24vKDQuR3QlaVZnfHUnbFljH2UVXyJ1IWMdcxop", "uExi7rDU"));
                i10 = 2;
            }
            OperateExecuteTask operateExecuteTask = this.R;
            kotlin.jvm.internal.g.b(operateExecuteTask);
            FrameLayout frameLayout3 = this.Q;
            kotlin.jvm.internal.g.b(frameLayout3);
            operateExecuteTask.q(i10, p10, frameLayout3, string, arrayList, z10, new d());
        }
    }

    public static void l2(String str, BaseOperatePDFActivity baseOperatePDFActivity, boolean z10) {
        kotlin.jvm.internal.g.e(baseOperatePDFActivity, ea.a.p("O2hYc10w", "KOneAt4y"));
        if (baseOperatePDFActivity.R == null) {
            baseOperatePDFActivity.R = new OperateExecuteTask();
        }
        if (baseOperatePDFActivity.R != null) {
            OperateExecuteTask.p(baseOperatePDFActivity, baseOperatePDFActivity.Y);
        }
        baseOperatePDFActivity.Y = 0L;
        g2 g2Var = baseOperatePDFActivity.N;
        Object obj = null;
        if (g2Var != null) {
            if (!g2Var.isShowing()) {
                g2Var = null;
            }
            if (g2Var != null) {
                g2Var.cancel();
            }
        }
        ArrayList<PdfPreviewEntity> arrayList = new ArrayList<>();
        Iterator<T> it = baseOperatePDFActivity.t2().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((PdfPreviewEntity) next).getPath().equals(str)) {
                obj = next;
                break;
            }
        }
        PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) obj;
        if (pdfPreviewEntity != null) {
            pdfPreviewEntity.setDate(System.currentTimeMillis());
            pdfPreviewEntity.setOtherBoolOne(z10);
            pdfPreviewEntity.setOtherIntOne(1);
            bm.c.b(baseOperatePDFActivity).i(pdfPreviewEntity);
            if (baseOperatePDFActivity.u2() == ToolsType.LOCK_PDF || baseOperatePDFActivity.u2() == ToolsType.UNLOCK_PDF) {
                ToolsType toolsType = DataBridge.f24029a;
                DataBridge.f24029a = baseOperatePDFActivity.u2();
                arrayList.add(pdfPreviewEntity);
            }
        }
        baseOperatePDFActivity.w2();
        if (z10) {
            tn.a.d(baseOperatePDFActivity, ea.a.p("GmFKcz9vHmQ=", "yQj9HlWR"), ea.a.p("Q2E4cyxzEnctZFtuZQ==", "BTySk3sJ"), ea.a.p("PW8XbHM=", "tBIxqEHD"), false);
        } else {
            tn.a.d(baseOperatePDFActivity, ea.a.p("B2FAcz9vGmQ=", "4uw3HhUv"), ea.a.p("P2FCcyZyR3cFZCVuZQ==", "RN8emyKk"), ea.a.p("O29ebHM=", "TpiOWKhB"), false);
        }
        baseOperatePDFActivity.A2(arrayList, true);
    }

    public static final void m2(PdfPreviewEntity pdfPreviewEntity, BaseOperatePDFActivity baseOperatePDFActivity) {
        baseOperatePDFActivity.getClass();
        tn.a.d(baseOperatePDFActivity, ea.a.p("O29ebApfVGg1bzll", "t1FYNsW8"), ea.a.p("R28kbABfEnMFZGtzAW93", "oeBt6TUS"), baseOperatePDFActivity.r2(), false);
        baseOperatePDFActivity.z2(pdfPreviewEntity, true, new t5.e(12));
    }

    public static final void n2(PdfPreviewEntity pdfPreviewEntity, BaseOperatePDFActivity baseOperatePDFActivity) {
        baseOperatePDFActivity.getClass();
        baseOperatePDFActivity.z2(pdfPreviewEntity, false, new n(13));
    }

    public static final void o2(BaseOperatePDFActivity baseOperatePDFActivity) {
        baseOperatePDFActivity.getClass();
        baseOperatePDFActivity.startActivity(new Intent(baseOperatePDFActivity, ReaderHomeActivity.class));
        baseOperatePDFActivity.finish();
    }

    private final void z2(PdfPreviewEntity pdfPreviewEntity, boolean z10, g2.f fVar) {
        g2 g2Var = new g2(this, z10, pdfPreviewEntity, fVar, this);
        g2Var.show();
        if (z10) {
            tn.a.d(this, ea.a.p("P2FCcw5vRWQ=", "KCnDfmsd"), ea.a.p("P2FCcyZyR3cFcyJvdw==", "zp2CGspQ"), ea.a.p("R28kbHM=", "uQj0OeGm"), false);
        } else {
            tn.a.d(this, ea.a.p("Q2E4cwRvEGQ=", "SgIlOgzR"), ea.a.p("RmEfcxdzIncXcw5vdw==", "k46lHRcJ"), ea.a.p("R28kbHM=", "m0rpXNrS"), false);
        }
        this.N = g2Var;
    }

    public final void E0(PdfPreviewEntity pdfPreviewEntity) {
        if (pdfPreviewEntity == null) {
            return;
        }
        if (u2() == ToolsType.AI_UPLOAD) {
            y2(pdfPreviewEntity);
        } else if (SystemClock.elapsedRealtime() - pdf.pdfreader.viewer.editor.free.utils.extension.b.f28690a >= 1000) {
            pdf.pdfreader.viewer.editor.free.utils.extension.b.f28690a = SystemClock.elapsedRealtime();
            y2(pdfPreviewEntity);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r0 == null) goto L11;
     */
    @Override // jl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K1() {
        /*
            r4 = this;
            b.b.Z(r4)
            android.content.Intent r0 = r4.getIntent()
            if (r0 == 0) goto L23
            java.lang.String r1 = "R3k7ZSxvEGQbblVs"
            java.lang.String r2 = "EULSV4Zc"
            java.lang.String r1 = ea.a.p(r1, r2)
            pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType r2 = pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType.EDIT_PDF
            int r2 = r2.ordinal()
            int r0 = r0.getIntExtra(r1, r2)
            pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType[] r1 = pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType.values()
            r0 = r1[r0]
            if (r0 != 0) goto L25
        L23:
            pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType r0 = pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType.EDIT_PDF
        L25:
            java.lang.String r1 = "<set-?>"
            kotlin.jvm.internal.g.e(r0, r1)
            r4.J = r0
            android.content.Intent r0 = r4.getIntent()
            r1 = 0
            if (r0 == 0) goto L3f
            java.lang.String r2 = "JGVIX01fQ2UpdBVlGHAceQ=="
            java.lang.String r3 = "p3s4ghRc"
            java.lang.String r2 = ea.a.p(r2, r3)
            boolean r1 = r0.getBooleanExtra(r2, r1)
        L3f:
            r4.X = r1
            pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver r0 = new pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver
            r0.<init>(r4)
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpFm8oLjVyDGUdQQhUOk8sXzpPeUU2VB5VCUJhXwVPDlAuRQ5F"
            java.lang.String r3 = "bZSiUtaf"
            java.lang.String r2 = ea.a.p(r2, r3)
            r1.<init>(r2)
            java.lang.String r2 = "P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpDG8ILg1yNWVhQXJUME95XxZPC0QqRiFMcF8tTwhQKUUsRQ=="
            java.lang.String r3 = "z4TPxzkP"
            java.lang.String r2 = ea.a.p(r2, r3)
            r1.addAction(r2)
            p1.a r2 = p1.a.a(r4)
            r2.b(r0, r1)
            r4.W = r0
            r4.v2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity.K1():void");
    }

    @Override // xn.c
    public final void R0() {
        this.Y = System.currentTimeMillis();
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.d(this, null);
    }

    @Override // xn.c
    public final void c(final String str, final boolean z10) {
        if (str == null) {
            return;
        }
        w0.a().c.execute(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.a
            @Override // java.lang.Runnable
            public final void run() {
                String str2 = str;
                boolean z11 = z10;
                String p10 = ea.a.p("R2gic1cw", "T9Ll0lEF");
                BaseOperatePDFActivity baseOperatePDFActivity = this;
                kotlin.jvm.internal.g.e(baseOperatePDFActivity, p10);
                try {
                    try {
                        pdf.pdfreader.viewer.editor.free.utils.v.b();
                        pdf.pdfreader.viewer.editor.free.utils.v.N(baseOperatePDFActivity, str2);
                        baseOperatePDFActivity.s2().post(new f0(str2, baseOperatePDFActivity, z11));
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        baseOperatePDFActivity.s2().post(new u.h(baseOperatePDFActivity, 2, str2, z11));
                    }
                } catch (Throwable th2) {
                    baseOperatePDFActivity.s2().post(new u.i(baseOperatePDFActivity, 2, str2, z11));
                    throw th2;
                }
            }
        });
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver.a
    public final void d0(String str, Intent intent) {
        if (kotlin.jvm.internal.g.a(str, ea.a.p("Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpNW8ALjNyNmUdQQhUOk8sXz5PdUQ2Rh9MAV9xTwtQD0UVRQ==", "ArUSbP79"))) {
            v2();
            x2();
        } else if (kotlin.jvm.internal.g.a(str, ea.a.p("Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpPW8aLhRyNmUdQQhUOk8sXzpPeUU2VB5VCUJhXwVPDlAFRTxF", "IhrSGUqs"))) {
            int i10 = a.f26984a[u2().ordinal()];
            if (i10 != 1 && i10 != 2) {
                w2();
            } else {
                v2();
            }
        }
    }

    @Override // xn.c
    public final void g() {
        if (u2() == ToolsType.UNLOCK_PDF) {
            tn.a.d(this, ea.a.p("IW89bDtfIWgnbxVl", "gAURHBAl"), ea.a.p("R28kbABfEnMFZGtlG3I5cg==", "G1FUzSoT"), r2(), false);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.S) {
            OperateExecuteTask operateExecuteTask = this.R;
            if (operateExecuteTask != null) {
                operateExecuteTask.n();
            }
            startActivity(new Intent(this, ReaderHomeActivity.class));
            finish();
            return;
        }
        super.onBackPressed();
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.a, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        ArrayList<PdfPreviewEntity> arrayList;
        super.onCreate(bundle);
        if (bundle != null) {
            this.S = bundle.getBoolean(ea.a.p("JnNiaBZ3ZWUpdSZ0JWEPZQ==", "ZJkcYmwP"), false);
            Serializable serializable = bundle.getSerializable(ea.a.p("BmUBdRt0PWk7dA==", "f7TrwqYc"));
            if (serializable instanceof ArrayList) {
                arrayList = (ArrayList) serializable;
            } else {
                arrayList = null;
            }
            this.T = arrayList;
            if (this.S && arrayList != null) {
                kotlin.jvm.internal.g.b(arrayList);
                A2(arrayList, false);
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public void onDestroy() {
        OperateExecuteTask operateExecuteTask = this.R;
        if (operateExecuteTask != null) {
            operateExecuteTask.k();
        }
        super.onDestroy();
        ReaderActBroadCastReceiver<BaseOperatePDFActivity> readerActBroadCastReceiver = this.W;
        if (readerActBroadCastReceiver != null) {
            p1.a.a(this).d(readerActBroadCastReceiver);
        }
        s2().removeCallbacksAndMessages(null);
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public void onResume() {
        super.onResume();
        OperateExecuteTask operateExecuteTask = this.R;
        if (operateExecuteTask != null) {
            operateExecuteTask.l();
        }
        if (this.P) {
            this.P = false;
            PdfPreviewEntity pdfPreviewEntity = this.O;
            this.O = null;
            if (pdfPreviewEntity != null) {
                k0.g(this, pdfPreviewEntity.getPath(), pdfPreviewEntity, ea.a.p("d1IHTTpUOUkaRA==", "pL1Heqyu"));
            }
        }
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(ea.a.p("WnMYaBx3MGUBdVh0OWExZQ==", "SK4mvKkN"), this.S);
        outState.putSerializable(ea.a.p("YWU4dR90LmkBdA==", "NaUo7e7M"), this.T);
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStop() {
        super.onStop();
        i3 i3Var = this.L;
        if (i3Var != null) {
            i3Var.cancel();
        }
        v vVar = this.M;
        if (vVar != null) {
            vVar.cancel();
        }
    }

    public final void p2(PdfPreviewEntity pdfPreviewEntity, l<? super Integer, tf.d> lVar) {
        V1();
        w0.a().c.execute(new v4.a(8, this, pdfPreviewEntity, lVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q2(pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity r10, int r11) {
        /*
            r9 = this;
            if (r10 != 0) goto L3
            return
        L3:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r10.getPath()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L56
            long r4 = r0.length()
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L56
            java.lang.String r1 = bg.b.B0(r0)
            int r1 = r1.length()
            if (r1 <= 0) goto L2a
            r1 = r3
            goto L2b
        L2a:
            r1 = r2
        L2b:
            if (r1 == 0) goto L56
            java.lang.String r0 = bg.b.A0(r0)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = "YU8EVA=="
            java.lang.String r5 = "0bonouE0"
            java.lang.String r0 = a6.h.f(r4, r5, r1, r0, r1)
            java.lang.String r1 = "R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nei5FbwdvNGVBQypzFigObxFhWGUp"
            java.lang.String r4 = "S1KCc6g1"
            java.lang.String r1 = ea.a.p(r1, r4)
            kotlin.jvm.internal.g.d(r0, r1)
            java.lang.String r1 = "P2Rm"
            java.lang.String r4 = "e4hzDKcV"
            java.lang.String r1 = ea.a.p(r1, r4)
            boolean r0 = kotlin.jvm.internal.g.a(r0, r1)
            if (r0 == 0) goto L56
            r0 = r3
            goto L57
        L56:
            r0 = r2
        L57:
            r1 = 0
            if (r0 == 0) goto L5c
            r0 = r3
            goto L8b
        L5c:
            pdf.pdfreader.viewer.editor.free.ui.dialog.i3 r0 = new pdf.pdfreader.viewer.editor.free.ui.dialog.i3
            r4 = 2131952529(0x7f130391, float:1.9541503E38)
            java.lang.String r4 = r9.getString(r4)
            java.lang.String r5 = "VGU_UwdyC24VKGYuGnQkaSpnHHIjYSdlFV8LaRplGWVLYy5wB2kNbik="
            java.lang.String r6 = "gmvFuSdf"
            java.lang.String r5 = ea.a.p(r5, r6)
            kotlin.jvm.internal.g.d(r4, r5)
            r5 = 2131952553(0x7f1303a9, float:1.9541552E38)
            java.lang.String r5 = r9.getString(r5)
            java.lang.String r6 = "KGVFUw1yXm49KBguBnQaaVtnQHIgYQFlN19ebxBhXV8paV1lJmNfYTRnLyk="
            java.lang.String r7 = "msUOE2s1"
            java.lang.String r6 = ea.a.p(r6, r7)
            kotlin.jvm.internal.g.d(r5, r6)
            r0.<init>(r9, r4, r5, r1)
            r0.show()
            r9.L = r0
            r0 = r2
        L8b:
            if (r0 == 0) goto Le1
            java.util.ArrayList r0 = r9.t2()
            java.util.Iterator r0 = r0.iterator()
        L95:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lb4
            java.lang.Object r4 = r0.next()
            r5 = r4
            pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity r5 = (pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity) r5
            long r5 = r5.getId()
            long r7 = r10.getId()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto Lb0
            r5 = r3
            goto Lb1
        Lb0:
            r5 = r2
        Lb1:
            if (r5 == 0) goto L95
            r1 = r4
        Lb4:
            pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity r1 = (pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity) r1
            if (r1 == 0) goto Lc2
            r1.setRecent(r3)
            long r2 = java.lang.System.currentTimeMillis()
            r1.setRecentDate(r2)
        Lc2:
            bm.c r0 = bm.c.b(r9)
            r0.i(r10)
            java.lang.String r3 = r10.getPath()
            r7 = 1
            java.lang.String r0 = "dVIETSxULU8-Uw=="
            java.lang.String r1 = "B0WUIUr3"
            java.lang.String r4 = ea.a.p(r0, r1)
            pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity$b r6 = new pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity$b
            r6.<init>()
            r1 = r11
            r2 = r9
            r5 = r10
            pdf.pdfreader.viewer.editor.free.utils.k0.f(r1, r2, r3, r4, r5, r6, r7)
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity.q2(pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity, int):void");
    }

    public final String r2() {
        switch (a.f26984a[u2().ordinal()]) {
            case 1:
                return ea.a.p("X28oaw==", "0UYhtnrO");
            case 2:
                return ea.a.p("Om5dbxpr", "sXgl2Qtz");
            case 3:
                return ea.a.p("Im87ZHpwI2Y=", "wWUIHG2U");
            case 4:
            case 11:
            case 12:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                return "";
            case 5:
                return ea.a.p("EG4Nbw==", "EwqcpwnC");
            case 6:
                return ea.a.p("R2UzdA==", "Ie0A8peU");
            case 7:
                return ea.a.p("ImVDZ2U=", "syKbTdot");
            case 8:
                return ea.a.p("QHAnaXQ=", "gMD7FiaJ");
            case 9:
                return ea.a.p("P3JYbnQ=", "dUubF2zs");
            case 10:
                return ea.a.p("OWkCbg==", "H9JegNHx");
            case 13:
                return ea.a.p("Q2QtMgRvEGQ=", "f51lY0Rp");
            case 14:
                return ea.a.p("Q2QtMhptZw==", "3tJ5sQxR");
            case 15:
                return ea.a.p("Q2QtMh9vDGc=", "ft6qakIw");
        }
    }

    public final Handler s2() {
        return (Handler) this.K.getValue();
    }

    public final ArrayList<PdfPreviewEntity> t2() {
        return (ArrayList) this.I.getValue();
    }

    public final ToolsType u2() {
        ToolsType toolsType = this.J;
        if (toolsType != null) {
            return toolsType;
        }
        kotlin.jvm.internal.g.i(ea.a.p("O29ebApUTnBl", "RGgttIlQ"));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v2() {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity.v2():void");
    }

    public final void y2(final PdfPreviewEntity pdfPreviewEntity) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        if (pdfPreviewEntity == null) {
            return;
        }
        int i11 = this.U;
        if (13 <= i11 && i11 < 19) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!pdfPreviewEntity.isOtherBoolOne()) {
                long size = pdfPreviewEntity.getSize();
                if (lm.e.f21773a && size > 10485760) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    tn.a.b(this, ea.a.p("UGk=", "Ux1A29AU"), ea.a.p("UmktaR9lPWYbbFFfCmw_Y2s=", "0dZOMsL4"));
                }
            }
        } else {
            tn.a.d(this, ea.a.p("R28kbABfAWgdb0dl", "OaJ0ch27"), ea.a.p("R28kbABfBGkeZWtjBWk1aw==", "JffPiuU5"), r2(), false);
        }
        switch (a.f26984a[u2().ordinal()]) {
            case 1:
            case 2:
                p2(pdfPreviewEntity, new l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity$realItemClick$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                        invoke(num.intValue());
                        return tf.d.f30009a;
                    }

                    public final void invoke(int i12) {
                        if (PdfPreviewEntity.this.isOtherBoolOne()) {
                            if (this.u2() == ToolsType.UNLOCK_PDF) {
                                BaseOperatePDFActivity.m2(PdfPreviewEntity.this, this);
                            }
                        } else if (this.u2() == ToolsType.LOCK_PDF) {
                            BaseOperatePDFActivity.n2(PdfPreviewEntity.this, this);
                        }
                    }
                });
                return;
            case 3:
                pdfPreviewEntity.setRecent(1);
                pdfPreviewEntity.setRecentDate(System.currentTimeMillis());
                FileRepository.I(pdfPreviewEntity);
                bm.c.b(this).i(pdfPreviewEntity);
                if (this.U == 12) {
                    Word2PDFConvertActivity.a aVar = Word2PDFConvertActivity.f26020p1;
                    String path = pdfPreviewEntity.getPath();
                    kotlin.jvm.internal.g.d(path, ea.a.p("Um5MaR95a3ApdGg=", "MU78kE7C"));
                    String p10 = ea.a.p("DFIqTQVUCU8EUw==", "CRJeZF7Y");
                    aVar.getClass();
                    Word2PDFConvertActivity.a.a(this, path, pdfPreviewEntity, p10);
                    return;
                }
                Word2PDFConvertActivity.a aVar2 = Word2PDFConvertActivity.f26020p1;
                String path2 = pdfPreviewEntity.getPath();
                kotlin.jvm.internal.g.d(path2, ea.a.p("Vm4_aQd5THATdGg=", "GaTlPaIu"));
                String p11 = ea.a.p("CVJ-TSZIeE0fXx5POkxT", "EjmMLJe4");
                aVar2.getClass();
                Word2PDFConvertActivity.a.a(this, path2, pdfPreviewEntity, p11);
                return;
            case 4:
                if (pdfPreviewEntity.isOtherBoolOne()) {
                    tn.a.d(this, ea.a.p("Lmk=", "Qi2k44hK"), ea.a.p("UmktaR9lPWUAcltyNnM-b3c=", "Rdbavk7Q"), ea.a.p("I29Saw==", "cfTJ43Dd"), false);
                    j1.e(this, getString(R.string.arg_res_0x7f130116), true, null, -1);
                    return;
                }
                long size2 = pdfPreviewEntity.getSize();
                if (lm.e.f21773a && size2 > 10485760) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    tn.a.d(this, ea.a.p("Umk=", "6HtyaVAe"), ea.a.p("UmktaR9lPWUAcltyNnM-b3c=", "eeuJYxS0"), ea.a.p("AmlLZQ==", "3Zq1cUuH"), false);
                    j1.e(this, getString(R.string.arg_res_0x7f13014f, "10MB"), true, null, -1);
                    return;
                }
                if (TextUtils.equals(pdfPreviewEntity.getOtherStrOne(), ea.a.p("CURG", "BvYC69Xm"))) {
                    i10 = 701;
                } else {
                    i10 = OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD;
                }
                if (this.U == 18) {
                    AIChatActivity.a aVar3 = AIChatActivity.f24356v0;
                    AIQuickTag aIQuickTag = this.V;
                    String path3 = pdfPreviewEntity.getPath();
                    kotlin.jvm.internal.g.d(path3, ea.a.p("Km5FaQ15GXA7dGg=", "4Lz2Fbv2"));
                    aVar3.getClass();
                    AIChatActivity.a.a(this, aIQuickTag, path3, i10, 604);
                } else {
                    AIChatActivity.a aVar4 = AIChatActivity.f24356v0;
                    AIQuickTag aIQuickTag2 = this.V;
                    String path4 = pdfPreviewEntity.getPath();
                    kotlin.jvm.internal.g.d(path4, ea.a.p("UW5NaT95WHApdGg=", "Ap49Kv6c"));
                    aVar4.getClass();
                    AIChatActivity.a.a(this, aIQuickTag2, path4, i10, OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
                }
                finish();
                return;
            case 5:
                q2(pdfPreviewEntity, 1);
                return;
            case 6:
                q2(pdfPreviewEntity, 2);
                return;
            case 7:
            case 11:
            case 12:
            case 16:
            default:
                return;
            case 8:
                p2(pdfPreviewEntity, new l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity$splitPDF$1

                    /* compiled from: BaseOperatePDFActivity.kt */
                    /* loaded from: classes3.dex */
                    public static final class a implements DecryptAndCopyUIHelper.b {

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ BaseOperatePDFActivity f26998a;

                        /* renamed from: b  reason: collision with root package name */
                        public final /* synthetic */ PdfPreviewEntity f26999b;
                        public final /* synthetic */ int c;

                        public a(BaseOperatePDFActivity baseOperatePDFActivity, PdfPreviewEntity pdfPreviewEntity, int i10) {
                            this.f26998a = baseOperatePDFActivity;
                            this.f26999b = pdfPreviewEntity;
                            this.c = i10;
                        }

                        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
                        public final void a(List<DecryptContainer> result) {
                            kotlin.jvm.internal.g.e(result, "result");
                            DecryptContainer decryptContainer = (DecryptContainer) m.s0(result);
                            if (decryptContainer != null) {
                                String p10 = ea.a.p("R3AeaXQ=", "964r8LD2");
                                String p11 = ea.a.p("UGgkbwBlC20VX0doBnc=", "TD1t5hml");
                                String p12 = ea.a.p("O29ebHM=", "ldQIC2Cw");
                                BaseOperatePDFActivity baseOperatePDFActivity = this.f26998a;
                                tn.a.d(baseOperatePDFActivity, p10, p11, p12, false);
                                ReaderSplitPdfActivity.a aVar = ReaderSplitPdfActivity.f26822q0;
                                PdfPreviewEntity z10 = t0.z(decryptContainer.getNewPath(), this.f26999b);
                                String p13 = ea.a.p("R28kbHM=", "EhJWEgS7");
                                aVar.getClass();
                                ReaderSplitPdfActivity.a.a(baseOperatePDFActivity, z10, p13, this.c);
                                baseOperatePDFActivity.finish();
                            }
                        }
                    }

                    /* compiled from: BaseOperatePDFActivity.kt */
                    /* loaded from: classes3.dex */
                    public static final class b implements DecryptAndCopyUIHelper.a {

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ BaseOperatePDFActivity f27000a;

                        public b(BaseOperatePDFActivity baseOperatePDFActivity) {
                            this.f27000a = baseOperatePDFActivity;
                        }

                        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.a
                        public final void a() {
                            String p10 = ea.a.p("GG8BbD9fDWgnbxVl", "OTlnLndH");
                            String p11 = ea.a.p("O29ebApfR3MtZBVlB3IHcg==", "8PZwzkcK");
                            BaseOperatePDFActivity baseOperatePDFActivity = this.f27000a;
                            tn.a.d(baseOperatePDFActivity, p10, p11, baseOperatePDFActivity.r2(), false);
                        }

                        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.a
                        public final void b() {
                            String p10 = ea.a.p("R28kbABfAWgdb0dl", "tAR0Njf0");
                            String p11 = ea.a.p("R28kbABfEnMFZGtzAW93", "hSdfxVFX");
                            BaseOperatePDFActivity baseOperatePDFActivity = this.f27000a;
                            tn.a.d(baseOperatePDFActivity, p10, p11, baseOperatePDFActivity.r2(), false);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                        invoke(num.intValue());
                        return tf.d.f30009a;
                    }

                    public final void invoke(int i12) {
                        ea.a.p("aUQiQ1tvJ3MtQQV0XXY-dHk=", "4Y9d3HxN");
                        String str = n0.f28727a;
                        if (PdfPreviewEntity.this.isOtherBoolOne()) {
                            DecryptAndCopyUIHelper decryptAndCopyUIHelper = new DecryptAndCopyUIHelper(this, ge.a.H(PdfPreviewEntity.this), new a(this, PdfPreviewEntity.this, i12));
                            decryptAndCopyUIHelper.f24225j = new b(this);
                            decryptAndCopyUIHelper.g();
                            return;
                        }
                        tn.a.d(this, ea.a.p("MXAWaXQ=", "DfBzdOnq"), ea.a.p("LGhebwplXm09XzloGnc=", "rMLsQZb8"), ea.a.p("O29ebHM=", "8zxV6l3Q"), false);
                        ReaderSplitPdfActivity.a aVar5 = ReaderSplitPdfActivity.f26822q0;
                        BaseOperatePDFActivity baseOperatePDFActivity = this;
                        PdfPreviewEntity pdfPreviewEntity2 = PdfPreviewEntity.this;
                        String p12 = ea.a.p("Rm8dbHM=", "KN2rlHbZ");
                        aVar5.getClass();
                        ReaderSplitPdfActivity.a.a(baseOperatePDFActivity, pdfPreviewEntity2, p12, i12);
                        this.finish();
                    }
                });
                return;
            case 9:
                p2(pdfPreviewEntity, new l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity$printPDF$1

                    /* compiled from: BaseOperatePDFActivity.kt */
                    /* loaded from: classes3.dex */
                    public static final class a extends w {

                        /* renamed from: d  reason: collision with root package name */
                        public final /* synthetic */ ReaderPDFCore f26994d;

                        /* renamed from: e  reason: collision with root package name */
                        public final /* synthetic */ v f26995e;

                        /* renamed from: f  reason: collision with root package name */
                        public final /* synthetic */ BaseOperatePDFActivity f26996f;

                        /* renamed from: g  reason: collision with root package name */
                        public final /* synthetic */ PdfPreviewEntity f26997g;

                        public a(ReaderPDFCore readerPDFCore, v vVar, BaseOperatePDFActivity baseOperatePDFActivity, PdfPreviewEntity pdfPreviewEntity) {
                            this.f26994d = readerPDFCore;
                            this.f26995e = vVar;
                            this.f26996f = baseOperatePDFActivity;
                            this.f26997g = pdfPreviewEntity;
                        }

                        @Override // oo.a
                        public final void a() {
                            v vVar = this.f26995e;
                            boolean authenticatePassword = this.f26994d.authenticatePassword(vVar.A());
                            BaseOperatePDFActivity baseOperatePDFActivity = this.f26996f;
                            if (authenticatePassword) {
                                vVar.A = 2;
                                vVar.dismiss();
                                int i10 = BaseOperatePDFActivity.Z;
                                Context context = baseOperatePDFActivity.f19296j;
                                if (context != null) {
                                    pdf.pdfreader.viewer.editor.free.utils.v.K(baseOperatePDFActivity, context, this.f26997g.getPath(), vVar.A());
                                    return;
                                }
                                return;
                            }
                            tn.a.d(baseOperatePDFActivity, ea.a.p("R28kbABfAWgdb0dl", "fX5UWQix"), ea.a.p("R28kbABfEnMFZGtlG3I5cg==", "kasljRZy"), baseOperatePDFActivity.r2(), false);
                            vVar.g();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                        invoke(num.intValue());
                        return tf.d.f30009a;
                    }

                    public final void invoke(int i12) {
                        if (PdfPreviewEntity.this.isOtherBoolOne()) {
                            final ReaderPDFCore readerPDFCore = new ReaderPDFCore(this, PdfPreviewEntity.this.getPath());
                            BaseOperatePDFActivity baseOperatePDFActivity = this;
                            v vVar = new v(this);
                            BaseOperatePDFActivity baseOperatePDFActivity2 = this;
                            vVar.f23532h = new a(readerPDFCore, vVar, baseOperatePDFActivity2, PdfPreviewEntity.this);
                            vVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.b
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    String p12 = ea.a.p("EmMLcmU=", "BL6d3ld7");
                                    ReaderPDFCore readerPDFCore2 = ReaderPDFCore.this;
                                    kotlin.jvm.internal.g.e(readerPDFCore2, p12);
                                    readerPDFCore2.onDestroy();
                                }
                            });
                            tn.a.d(baseOperatePDFActivity2, ea.a.p("R28kbABfAWgdb0dl", "UZaqzxNz"), ea.a.p("R28kbABfEnMFZGtzAW93", "mI2Lhy5O"), baseOperatePDFActivity2.r2(), false);
                            vVar.show();
                            baseOperatePDFActivity.M = vVar;
                            return;
                        }
                        BaseOperatePDFActivity baseOperatePDFActivity3 = this;
                        int i13 = BaseOperatePDFActivity.Z;
                        Context context = baseOperatePDFActivity3.f19296j;
                        if (context != null) {
                            pdf.pdfreader.viewer.editor.free.utils.v.K(baseOperatePDFActivity3, context, PdfPreviewEntity.this.getPath(), "");
                        }
                    }
                });
                return;
            case 10:
                q2(pdfPreviewEntity, 4);
                return;
            case 13:
                p2(pdfPreviewEntity, new l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity$pdf2word$1

                    /* compiled from: BaseOperatePDFActivity.kt */
                    /* loaded from: classes3.dex */
                    public static final class a implements DecryptAndCopyUIHelper.b {

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ BaseOperatePDFActivity f26991a;

                        /* renamed from: b  reason: collision with root package name */
                        public final /* synthetic */ PdfPreviewEntity f26992b;

                        public a(PdfPreviewEntity pdfPreviewEntity, BaseOperatePDFActivity baseOperatePDFActivity) {
                            this.f26991a = baseOperatePDFActivity;
                            this.f26992b = pdfPreviewEntity;
                        }

                        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
                        public final void a(List<DecryptContainer> result) {
                            String p10;
                            kotlin.jvm.internal.g.e(result, "result");
                            DecryptContainer decryptContainer = (DecryptContainer) m.s0(result);
                            if (decryptContainer != null) {
                                String path = this.f26992b.getPath();
                                String password = decryptContainer.getPassword();
                                BaseOperatePDFActivity baseOperatePDFActivity = this.f26991a;
                                if (baseOperatePDFActivity.U == 23) {
                                    p10 = ea.a.p("ElIrTSpUGU8EUw==", "nlTduV9O");
                                } else {
                                    p10 = ea.a.p("CVJ-TSZIeE0fXx5POkxT", "XeG2kBGo");
                                }
                                k0.k(baseOperatePDFActivity, path, password, p10);
                            }
                        }
                    }

                    /* compiled from: BaseOperatePDFActivity.kt */
                    /* loaded from: classes3.dex */
                    public static final class b implements DecryptAndCopyUIHelper.a {

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ BaseOperatePDFActivity f26993a;

                        public b(BaseOperatePDFActivity baseOperatePDFActivity) {
                            this.f26993a = baseOperatePDFActivity;
                        }

                        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.a
                        public final void a() {
                            String p10 = ea.a.p("O29ebApfVGg1bzll", "CjFYcBXA");
                            String p11 = ea.a.p("O29ebApfR3MtZBVlB3IHcg==", "mCFDTGT4");
                            BaseOperatePDFActivity baseOperatePDFActivity = this.f26993a;
                            tn.a.d(baseOperatePDFActivity, p10, p11, baseOperatePDFActivity.r2(), false);
                        }

                        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.a
                        public final void b() {
                            String p10 = ea.a.p("R28kbABfAWgdb0dl", "Cc6RLSFO");
                            String p11 = ea.a.p("R28kbABfEnMFZGtzAW93", "zNWHPH07");
                            BaseOperatePDFActivity baseOperatePDFActivity = this.f26993a;
                            tn.a.d(baseOperatePDFActivity, p10, p11, baseOperatePDFActivity.r2(), false);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                        invoke(num.intValue());
                        return tf.d.f30009a;
                    }

                    public final void invoke(int i12) {
                        String p12;
                        if (PdfPreviewEntity.this.isOtherBoolOne()) {
                            DecryptAndCopyUIHelper decryptAndCopyUIHelper = new DecryptAndCopyUIHelper(this, ge.a.H(PdfPreviewEntity.this), new a(PdfPreviewEntity.this, this));
                            decryptAndCopyUIHelper.f24225j = new b(this);
                            decryptAndCopyUIHelper.g();
                            return;
                        }
                        BaseOperatePDFActivity baseOperatePDFActivity = this;
                        String path5 = PdfPreviewEntity.this.getPath();
                        if (this.U == 23) {
                            p12 = ea.a.p("dVIETSxULU8-Uw==", "06Pm2WQk");
                        } else {
                            p12 = ea.a.p("BFI1TR5IO00NXzJPe0xT", "1FBzAt37");
                        }
                        k0.k(baseOperatePDFActivity, path5, "", p12);
                    }
                });
                return;
            case 14:
                p2(pdfPreviewEntity, new l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity$pdf2Image$1

                    /* compiled from: BaseOperatePDFActivity.kt */
                    /* loaded from: classes3.dex */
                    public static final class a implements DecryptAndCopyUIHelper.b {

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ BaseOperatePDFActivity f26988a;

                        /* renamed from: b  reason: collision with root package name */
                        public final /* synthetic */ PdfPreviewEntity f26989b;
                        public final /* synthetic */ boolean c;

                        public a(PdfPreviewEntity pdfPreviewEntity, BaseOperatePDFActivity baseOperatePDFActivity, boolean z10) {
                            this.f26988a = baseOperatePDFActivity;
                            this.f26989b = pdfPreviewEntity;
                            this.c = z10;
                        }

                        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
                        public final void a(List<DecryptContainer> result) {
                            String p10;
                            kotlin.jvm.internal.g.e(result, "result");
                            DecryptContainer decryptContainer = (DecryptContainer) m.s0(result);
                            if (decryptContainer != null) {
                                int i10 = Pdf2ImagePicPreviewActivity.I0;
                                String path = this.f26989b.getPath();
                                kotlin.jvm.internal.g.d(path, ea.a.p("Km5FaQ15GXA7dGg=", "BEEN6kmL"));
                                BaseOperatePDFActivity baseOperatePDFActivity = this.f26988a;
                                int i11 = baseOperatePDFActivity.U;
                                if (i11 != 24 && i11 != 25) {
                                    p10 = ea.a.p("CVJ-TSZIeE0fXx5POkxT", "AIYXsQGj");
                                } else {
                                    p10 = ea.a.p("dVIETSxULU8-Uw==", "01W6Ohfn");
                                }
                                Pdf2ImagePicPreviewActivity.a.a(baseOperatePDFActivity, path, p10, decryptContainer.getPassword(), this.c);
                            }
                        }
                    }

                    /* compiled from: BaseOperatePDFActivity.kt */
                    /* loaded from: classes3.dex */
                    public static final class b implements DecryptAndCopyUIHelper.a {

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ BaseOperatePDFActivity f26990a;

                        public b(BaseOperatePDFActivity baseOperatePDFActivity) {
                            this.f26990a = baseOperatePDFActivity;
                        }

                        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.a
                        public final void a() {
                            String p10 = ea.a.p("O29ebApfVGg1bzll", "cz3JX2GV");
                            String p11 = ea.a.p("R28kbABfEnMFZGtlG3I5cg==", "b0n6v2Cl");
                            BaseOperatePDFActivity baseOperatePDFActivity = this.f26990a;
                            tn.a.d(baseOperatePDFActivity, p10, p11, baseOperatePDFActivity.r2(), false);
                        }

                        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.a
                        public final void b() {
                            String p10 = ea.a.p("O29ebApfVGg1bzll", "I36XmWWy");
                            String p11 = ea.a.p("TG9ebEBfIHM_ZDlzXG93", "jt813P7R");
                            BaseOperatePDFActivity baseOperatePDFActivity = this.f26990a;
                            tn.a.d(baseOperatePDFActivity, p10, p11, baseOperatePDFActivity.r2(), false);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                        invoke(num.intValue());
                        return tf.d.f30009a;
                    }

                    public final void invoke(int i12) {
                        String p12;
                        if (PdfPreviewEntity.this.isOtherBoolOne()) {
                            DecryptAndCopyUIHelper decryptAndCopyUIHelper = new DecryptAndCopyUIHelper(this, ge.a.H(PdfPreviewEntity.this), new a(PdfPreviewEntity.this, this, r3));
                            decryptAndCopyUIHelper.f24225j = new b(this);
                            decryptAndCopyUIHelper.g();
                            return;
                        }
                        int i13 = Pdf2ImagePicPreviewActivity.I0;
                        BaseOperatePDFActivity baseOperatePDFActivity = this;
                        String path5 = PdfPreviewEntity.this.getPath();
                        kotlin.jvm.internal.g.d(path5, ea.a.p("Vm4_aQd5THATdGg=", "Aa6j58VF"));
                        boolean z13 = r3;
                        int i14 = this.U;
                        if (i14 != 24 && i14 != 25) {
                            p12 = ea.a.p("ElIeTWhICk0NXzJPe0xT", "43TQ7EhJ");
                        } else {
                            p12 = ea.a.p("dVIETSxULU8-Uw==", "DZR8SUnk");
                        }
                        Pdf2ImagePicPreviewActivity.a.a(baseOperatePDFActivity, path5, p12, "", z13);
                    }
                });
                return;
            case 15:
                p2(pdfPreviewEntity, new l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity$pdf2Image$1

                    /* compiled from: BaseOperatePDFActivity.kt */
                    /* loaded from: classes3.dex */
                    public static final class a implements DecryptAndCopyUIHelper.b {

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ BaseOperatePDFActivity f26988a;

                        /* renamed from: b  reason: collision with root package name */
                        public final /* synthetic */ PdfPreviewEntity f26989b;
                        public final /* synthetic */ boolean c;

                        public a(PdfPreviewEntity pdfPreviewEntity, BaseOperatePDFActivity baseOperatePDFActivity, boolean z10) {
                            this.f26988a = baseOperatePDFActivity;
                            this.f26989b = pdfPreviewEntity;
                            this.c = z10;
                        }

                        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
                        public final void a(List<DecryptContainer> result) {
                            String p10;
                            kotlin.jvm.internal.g.e(result, "result");
                            DecryptContainer decryptContainer = (DecryptContainer) m.s0(result);
                            if (decryptContainer != null) {
                                int i10 = Pdf2ImagePicPreviewActivity.I0;
                                String path = this.f26989b.getPath();
                                kotlin.jvm.internal.g.d(path, ea.a.p("Km5FaQ15GXA7dGg=", "BEEN6kmL"));
                                BaseOperatePDFActivity baseOperatePDFActivity = this.f26988a;
                                int i11 = baseOperatePDFActivity.U;
                                if (i11 != 24 && i11 != 25) {
                                    p10 = ea.a.p("CVJ-TSZIeE0fXx5POkxT", "AIYXsQGj");
                                } else {
                                    p10 = ea.a.p("dVIETSxULU8-Uw==", "01W6Ohfn");
                                }
                                Pdf2ImagePicPreviewActivity.a.a(baseOperatePDFActivity, path, p10, decryptContainer.getPassword(), this.c);
                            }
                        }
                    }

                    /* compiled from: BaseOperatePDFActivity.kt */
                    /* loaded from: classes3.dex */
                    public static final class b implements DecryptAndCopyUIHelper.a {

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ BaseOperatePDFActivity f26990a;

                        public b(BaseOperatePDFActivity baseOperatePDFActivity) {
                            this.f26990a = baseOperatePDFActivity;
                        }

                        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.a
                        public final void a() {
                            String p10 = ea.a.p("O29ebApfVGg1bzll", "cz3JX2GV");
                            String p11 = ea.a.p("R28kbABfEnMFZGtlG3I5cg==", "b0n6v2Cl");
                            BaseOperatePDFActivity baseOperatePDFActivity = this.f26990a;
                            tn.a.d(baseOperatePDFActivity, p10, p11, baseOperatePDFActivity.r2(), false);
                        }

                        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.a
                        public final void b() {
                            String p10 = ea.a.p("O29ebApfVGg1bzll", "I36XmWWy");
                            String p11 = ea.a.p("TG9ebEBfIHM_ZDlzXG93", "jt813P7R");
                            BaseOperatePDFActivity baseOperatePDFActivity = this.f26990a;
                            tn.a.d(baseOperatePDFActivity, p10, p11, baseOperatePDFActivity.r2(), false);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                        invoke(num.intValue());
                        return tf.d.f30009a;
                    }

                    public final void invoke(int i12) {
                        String p12;
                        if (PdfPreviewEntity.this.isOtherBoolOne()) {
                            DecryptAndCopyUIHelper decryptAndCopyUIHelper = new DecryptAndCopyUIHelper(this, ge.a.H(PdfPreviewEntity.this), new a(PdfPreviewEntity.this, this, r3));
                            decryptAndCopyUIHelper.f24225j = new b(this);
                            decryptAndCopyUIHelper.g();
                            return;
                        }
                        int i13 = Pdf2ImagePicPreviewActivity.I0;
                        BaseOperatePDFActivity baseOperatePDFActivity = this;
                        String path5 = PdfPreviewEntity.this.getPath();
                        kotlin.jvm.internal.g.d(path5, ea.a.p("Vm4_aQd5THATdGg=", "Aa6j58VF"));
                        boolean z13 = r3;
                        int i14 = this.U;
                        if (i14 != 24 && i14 != 25) {
                            p12 = ea.a.p("ElIeTWhICk0NXzJPe0xT", "43TQ7EhJ");
                        } else {
                            p12 = ea.a.p("dVIETSxULU8-Uw==", "DZR8SUnk");
                        }
                        Pdf2ImagePicPreviewActivity.a.a(baseOperatePDFActivity, path5, p12, "", z13);
                    }
                });
                return;
            case 17:
                q2(pdfPreviewEntity, 5);
                return;
            case 18:
                q2(pdfPreviewEntity, 5);
                return;
            case 19:
                q2(pdfPreviewEntity, 0);
                return;
        }
    }

    /* compiled from: BaseOperatePDFActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements OperateExecuteTask.a {
        public d() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void a() {
            BaseOperatePDFActivity baseOperatePDFActivity = BaseOperatePDFActivity.this;
            OperateExecuteTask operateExecuteTask = baseOperatePDFActivity.R;
            baseOperatePDFActivity.getClass();
            Intent intent = new Intent(baseOperatePDFActivity, ReaderHomeActivity.class);
            intent.putExtra(ea.a.p("JGVIXxdlQF8zbj5lG3Q3ZFpfHmRm", "IWNEJKul"), true);
            baseOperatePDFActivity.startActivity(intent);
            baseOperatePDFActivity.finish();
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void b(PdfPreviewEntity pdfPreviewEntity) {
            String str;
            String str2;
            pdfPreviewEntity.setRecent(1);
            pdfPreviewEntity.setRecentDate(System.currentTimeMillis());
            FileRepository.I(pdfPreviewEntity);
            BaseOperatePDFActivity baseOperatePDFActivity = BaseOperatePDFActivity.this;
            bm.c.b(baseOperatePDFActivity).i(pdfPreviewEntity);
            if (eo.e.c(baseOperatePDFActivity) == 2) {
                eo.e.n(baseOperatePDFActivity, 1);
            }
            if (eo.e.k(baseOperatePDFActivity) == 2) {
                eo.e.s(baseOperatePDFActivity, 1);
            }
            String p10 = ea.a.p("Q2E4cwRvEGQ=", "Rl5XjLxv");
            String p11 = ea.a.p("P2FCcx9pWWkpaBVvBWUGX1ZsB2Nr", "bpOKtZe2");
            if (baseOperatePDFActivity.u2() == ToolsType.LOCK_PDF) {
                str = "X28oaw==";
                str2 = "MRTGaiyI";
            } else {
                str = "Rm4nbxBr";
                str2 = "jqac1sRf";
            }
            tn.a.d(baseOperatePDFActivity, p10, p11, ea.a.p(str, str2), false);
            AppViewModel k10 = ReaderPdfApplication.k();
            ToolsType u22 = baseOperatePDFActivity.u2();
            String path = pdfPreviewEntity.getPath();
            kotlin.jvm.internal.g.d(path, ea.a.p("Q2QtUAFlFGkXd3FuHWkieWpwU3Ro", "HS1vxEMz"));
            k10.g(new nl.g(u22, path));
            k0.i(baseOperatePDFActivity, pdfPreviewEntity.getPath(), pdfPreviewEntity, ea.a.p("dVIETSxBLkw=", "SHJSc16s"));
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void c() {
            BaseOperatePDFActivity baseOperatePDFActivity = BaseOperatePDFActivity.this;
            OperateExecuteTask operateExecuteTask = baseOperatePDFActivity.R;
            BaseOperatePDFActivity.o2(baseOperatePDFActivity);
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void f(PdfPreviewEntity pdfPreviewEntity) {
            String str;
            String str2;
            String p10 = ea.a.p("Q2E4cwRvEGQ=", "IagYtGEP");
            String p11 = ea.a.p("J2EDczFpBWk7aDlzXGElZWdjPmkqaw==", "nVWpWk7Q");
            BaseOperatePDFActivity baseOperatePDFActivity = BaseOperatePDFActivity.this;
            if (baseOperatePDFActivity.u2() == ToolsType.LOCK_PDF) {
                str = "X28oaw==";
                str2 = "NYvwPsc5";
            } else {
                str = "Rm4nbxBr";
                str2 = "DDgxroSC";
            }
            tn.a.d(baseOperatePDFActivity, p10, p11, ea.a.p(str, str2), false);
            e1.e(baseOperatePDFActivity, pdfPreviewEntity);
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void d() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void g() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void e(PdfPreviewEntity pdfPreviewEntity) {
        }
    }

    public void w2() {
    }

    public void x2() {
    }

    @Override // xn.c
    public final void V(int i10) {
    }

    @Override // xn.c
    public final void w0(Throwable th2) {
    }
}
