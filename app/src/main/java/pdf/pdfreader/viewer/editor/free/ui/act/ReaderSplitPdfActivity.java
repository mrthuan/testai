package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.pdf.PdfRenderer;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import industries.deepthought.decode.Decoder;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.base.a;
import pdf.pdfreader.viewer.editor.free.bean.DataBridge;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.split.ReaderSplitPdfManager;
import pdf.pdfreader.viewer.editor.free.split.SplitPdfData;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j2;
import pdf.pdfreader.viewer.editor.free.ui.frag.SplitPreviewFragment;
import pdf.pdfreader.viewer.editor.free.ui.frag.SplitResultFragment;
import pdf.pdfreader.viewer.editor.free.ui.vm.AppViewModel;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.g1;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: ReaderSplitPdfActivity.kt */
/* loaded from: classes3.dex */
public final class ReaderSplitPdfActivity extends pdf.pdfreader.viewer.editor.free.ui.act.a implements g1.a, a.b, pdf.pdfreader.viewer.editor.free.split.a {
    public final String I = "ReaderSplitPdfActivity";
    public View J;
    public ImageView K;
    public TextView L;
    public TextView M;
    public FrameLayout N;
    public PdfPreviewEntity O;
    public RelativeLayout P;
    public CheckBox Q;
    public boolean R;
    public ArrayList<PdfPreviewEntity> S;
    public final String T;
    public final String U;
    public final pdf.pdfreader.viewer.editor.free.utils.g1<ReaderSplitPdfActivity> V;
    public final tf.c W;
    public int X;
    public int Y;
    public long Z;

    /* renamed from: a0  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.utils.y0 f26828a0;

    /* renamed from: b0  reason: collision with root package name */
    public ExecutorService f26829b0;

    /* renamed from: c0  reason: collision with root package name */
    public ReaderSplitPdfManager f26830c0;

    /* renamed from: d0  reason: collision with root package name */
    public String f26831d0;

    /* renamed from: e0  reason: collision with root package name */
    public String f26832e0;

    /* renamed from: f0  reason: collision with root package name */
    public FrameLayout f26833f0;

    /* renamed from: g0  reason: collision with root package name */
    public OperateExecuteTask f26834g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f26835h0;

    /* renamed from: i0  reason: collision with root package name */
    public final androidx.activity.result.c<String[]> f26836i0;

    /* renamed from: j0  reason: collision with root package name */
    public final pdf.pdfreader.viewer.editor.free.feature.scan.ui.f f26837j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f26838k0;

    /* renamed from: l0  reason: collision with root package name */
    public j2 f26839l0;

    /* renamed from: m0  reason: collision with root package name */
    public OperateInterceptDialog f26840m0;

    /* renamed from: n0  reason: collision with root package name */
    public OperatePdfFailedDialog f26841n0;

    /* renamed from: o0  reason: collision with root package name */
    public final tf.c f26842o0;

    /* renamed from: p0  reason: collision with root package name */
    public long f26843p0;

    /* renamed from: r0  reason: collision with root package name */
    public static final String f26823r0 = ea.a.p("WGUyXwBwDmkGX0RkD18zbjBpRnk=", "mUOSVXpO");

    /* renamed from: s0  reason: collision with root package name */
    public static final String f26824s0 = ea.a.p("JGVIXwpwW2kuXzphEmU3ZkdvbQ==", "lifXjfZw");

    /* renamed from: t0  reason: collision with root package name */
    public static final String f26825t0 = ea.a.p("AGUoXzVwC2k8XxZhU2UIY1Z0", "HZkQFgH9");

    /* renamed from: u0  reason: collision with root package name */
    public static final String f26826u0 = ea.a.p("WGUyXwBwDmkGX0RhDmUJYzFyQGUodBxwBGdl", "eQZKpM5z");

    /* renamed from: v0  reason: collision with root package name */
    public static final String f26827v0 = ea.a.p("JGVIXwpwW2kuXzphEmU3Y0ByHGUrdDpmI2Fn", "ZhxPQxcY");

    /* renamed from: q0  reason: collision with root package name */
    public static final a f26822q0 = new a();

    /* compiled from: ReaderSplitPdfActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, PdfPreviewEntity pdf2, String str, int i10) {
            kotlin.jvm.internal.g.e(context, "context");
            kotlin.jvm.internal.g.e(pdf2, "pdf");
            DataBridge.b().clear();
            Intent intent = new Intent(context, ReaderSplitPdfActivity.class);
            intent.putExtra(ea.a.p("JGVIXwpwW2kuXzpkE18NbkFpGnk=", "MX8OkZuA"), pdf2);
            intent.putExtra(ea.a.p("CGUDXxdwVWk8XxZhU2UIZkpvbQ==", "9tczd9F1"), str);
            intent.putExtra(ea.a.p("JGVIXwpwW2kuXzphEmU3Y1t0", "rvePFhPb"), i10);
            context.startActivity(intent);
        }
    }

    public ReaderSplitPdfActivity() {
        String b10 = kotlin.jvm.internal.i.a(SplitPreviewFragment.class).b();
        this.T = b10;
        this.U = kotlin.jvm.internal.i.a(SplitResultFragment.class).b();
        this.V = new pdf.pdfreader.viewer.editor.free.utils.g1<>(this);
        this.W = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.ui.dialog.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity$progressDialog$2
            {
                super(0);
            }

            @Override // cg.a
            public final pdf.pdfreader.viewer.editor.free.ui.dialog.d invoke() {
                pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.d(ReaderSplitPdfActivity.this, false);
                dVar.a(R.string.arg_res_0x7f1303a6);
                return dVar;
            }
        });
        this.f26831d0 = "";
        this.f26832e0 = b10;
        androidx.activity.result.c<String[]> registerForActivityResult = registerForActivityResult(new j.b(), new h(this));
        kotlin.jvm.internal.g.d(registerForActivityResult, ea.a.p("QWUsaQB0B3I0b0ZBCnQ_di10S1IjczZst4DAfUAgayATIGsgUyBCIFJ9PiBJIHYgZCASfQ==", "UfJKkX5m"));
        this.f26836i0 = registerForActivityResult;
        this.f26837j0 = new pdf.pdfreader.viewer.editor.free.feature.scan.ui.f(this, 5);
        this.f26842o0 = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.ui.dialog.y>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity$horProgressDialog$2
            {
                super(0);
            }

            @Override // cg.a
            public final pdf.pdfreader.viewer.editor.free.ui.dialog.y invoke() {
                final ReaderSplitPdfActivity readerSplitPdfActivity = ReaderSplitPdfActivity.this;
                pdf.pdfreader.viewer.editor.free.ui.dialog.y yVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.y(readerSplitPdfActivity, new cg.p<Integer, Integer, String>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity$horProgressDialog$2.1
                    {
                        super(2);
                    }

                    public final String invoke(int i10, int i11) {
                        String string = ReaderSplitPdfActivity.this.getString(R.string.arg_res_0x7f1303fd);
                        kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHIjYSdlmoCWbAN0MGldZxR3GnQKXxxva3AbbzFyIXNBKQ==", "x0jDY2bx"));
                        return string;
                    }

                    @Override // cg.p
                    public /* bridge */ /* synthetic */ String invoke(Integer num, Integer num2) {
                        return invoke(num.intValue(), num2.intValue());
                    }
                });
                final ReaderSplitPdfActivity readerSplitPdfActivity2 = ReaderSplitPdfActivity.this;
                yVar.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.d1
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(final DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                        String p10 = ea.a.p("HGgmc2ww", "rxhOHrmA");
                        final ReaderSplitPdfActivity readerSplitPdfActivity3 = ReaderSplitPdfActivity.this;
                        kotlin.jvm.internal.g.e(readerSplitPdfActivity3, p10);
                        if (i10 == 4 && keyEvent.getAction() == 1) {
                            cg.a<tf.d> aVar = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity$horProgressDialog$2$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    ReaderSplitPdfManager readerSplitPdfManager = ReaderSplitPdfActivity.this.f26830c0;
                                    if (readerSplitPdfManager != null) {
                                        readerSplitPdfManager.g();
                                    }
                                    dialogInterface.cancel();
                                    ReaderSplitPdfActivity.this.startActivity(new Intent(ReaderSplitPdfActivity.this, ReaderHomeActivity.class));
                                }
                            };
                            ReaderSplitPdfActivity.a aVar2 = ReaderSplitPdfActivity.f26822q0;
                            readerSplitPdfActivity3.s2(aVar);
                            return true;
                        }
                        return false;
                    }
                });
                return yVar;
            }
        });
    }

    private final void X1(boolean z10) {
        j2 j2Var = new j2(this);
        this.f26839l0 = j2Var;
        if (z10) {
            u2(3);
            j2Var.c(1);
        } else {
            u2(2);
            j2Var.c(0);
        }
        j2Var.f27638i = new d(this, z10);
        j2 j2Var2 = this.f26839l0;
        if (j2Var2 != null) {
            j2Var2.show();
        }
    }

    public static void l2(ReaderSplitPdfActivity readerSplitPdfActivity, Map map) {
        kotlin.jvm.internal.g.e(readerSplitPdfActivity, ea.a.p("R2gic1cw", "Or8KGv20"));
        readerSplitPdfActivity.V.removeCallbacks(readerSplitPdfActivity.f26837j0);
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                z10 = false;
            }
        }
        if (!z10) {
            if (!k0.b.b(readerSplitPdfActivity, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfcVguRWNOJEwQU2VPK0FwRQ==", "Jjt84z1e")) && !k0.b.b(readerSplitPdfActivity, ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFcUSRdFa0UpVHZSJUF_XxhUPFIjR0U=", "4q3k5jAm"))) {
                readerSplitPdfActivity.X1(true);
            } else {
                readerSplitPdfActivity.X1(false);
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a.b
    public final void A(a.C0330a c0330a) {
        Integer num;
        int i10;
        boolean z10;
        Locale locale;
        Object obj;
        List v10;
        LocaleList locales;
        String p10;
        String p11;
        PdfPreviewEntity pdfPreviewEntity;
        Integer num2;
        int i11;
        if (c0330a != null) {
            int i12 = c0330a.f24024a;
            boolean z11 = false;
            List<Number> list = null;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                Object obj2 = c0330a.f24025b;
                                kotlin.jvm.internal.g.c(obj2, ea.a.p("PHU0bBljCW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAmeShlGWsHdCRpCC52bzhsXWFu", "eDRX9hjj"));
                                boolean booleanValue = ((Boolean) obj2).booleanValue();
                                CheckBox checkBox = this.Q;
                                if (checkBox != null) {
                                    checkBox.setChecked(booleanValue);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        Object obj3 = c0330a.f24025b;
                        if (obj3 instanceof Integer) {
                            num2 = (Integer) obj3;
                        } else {
                            num2 = null;
                        }
                        if (num2 != null) {
                            i11 = num2.intValue();
                        } else {
                            i11 = 0;
                        }
                        TextView textView = this.M;
                        if (textView != null) {
                            String string = getString(R.string.arg_res_0x7f130416);
                            kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHIjYSdlR18rXxBlLmVQdC5kKQ==", "5ScBkycw"));
                            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
                            kotlin.jvm.internal.g.d(format, ea.a.p("VW85bRJ0SnQaaUcsSSo3ciNzKQ==", "u3jaOuZp"));
                            textView.setText(format);
                            TextView textView2 = this.M;
                            if (textView2 != null) {
                                String string2 = getString(R.string.arg_res_0x7f130416);
                                kotlin.jvm.internal.g.d(string2, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHIjYSdlAV9MXwZlA2VQdC5kKQ==", "s4uoTSvK"));
                                String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
                                kotlin.jvm.internal.g.d(format2, ea.a.p("H29KbQx0eXQgaRUsFCo2cl9zKQ==", "3Ky8mQc9"));
                                textView2.setText(format2);
                                CheckBox checkBox2 = this.Q;
                                if (checkBox2 != null) {
                                    if (i11 == this.X) {
                                        z11 = true;
                                    }
                                    checkBox2.setChecked(z11);
                                    return;
                                }
                                return;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("Pmk9bAFUdg==", "VHJIdGxx"));
                            throw null;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("O2lFbBxUdg==", "32yGeUL2"));
                        throw null;
                    }
                    BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
                    billingConfigImpl.getClass();
                    if (BillingConfigImpl.s() && billingConfigImpl.z() && !billingConfigImpl.w()) {
                        this.f26835h0 = true;
                        BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                        String p12 = ea.a.p("PHBdaXQ=", "tosoyohh");
                        aVar.getClass();
                        BaseSubscriptionActivity.a.a(this, p12);
                        return;
                    }
                    String p13 = ea.a.p("PnBeaXQ=", "uPM27lEi");
                    String p14 = ea.a.p("QHAnaQdfEXAeaUBfCmw_Y2s=", "5prULCXH");
                    Object obj4 = c0330a.f24025b;
                    kotlin.jvm.internal.g.c(obj4, ea.a.p("L3UdbGtjVm4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiA1eQFla2tYdCRpCC52bzhsXWFu", "LdAqK72B"));
                    if (((Boolean) obj4).booleanValue()) {
                        p10 = ea.a.p("WQ==", "c6yvekHd");
                    } else {
                        p10 = ea.a.p("Tg==", "ma4NMXfW");
                    }
                    if (DataBridge.c) {
                        p11 = ea.a.p("WQ==", "C6ICe4P8");
                    } else {
                        p11 = ea.a.p("Tg==", "3OWOy2o0");
                    }
                    tn.a.d(this, p13, p14, androidx.activity.f.m(p10, "_", p11), false);
                    if (!pdf.pdfreader.viewer.editor.free.utils.h1.c() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
                        this.V.postDelayed(this.f26837j0, 500L);
                        this.f26836i0.a(new String[]{ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfJlgXRTZOJEwQU2VPK0FwRQ==", "2n68cCde"), ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFJUUoVAtSJUEDX2JUNlJ2R0U=", "VTmJzpNk")});
                        return;
                    }
                    this.Z = 0L;
                    for (SplitPdfData splitPdfData : DataBridge.b()) {
                        long j10 = this.Z;
                        float size = splitPdfData.getPageList().size() / this.X;
                        if (this.O != null) {
                            this.Z = j10 + (size * ((float) pdfPreviewEntity.getSize()));
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("GWQXRSJ0JHR5", "N7iqLM6s"));
                            throw null;
                        }
                    }
                    long j11 = this.Z;
                    PdfPreviewEntity pdfPreviewEntity2 = this.O;
                    if (pdfPreviewEntity2 != null) {
                        this.Z = pdfPreviewEntity2.getSize() + j11;
                        if (!r2()) {
                            tn.a.d(this, ea.a.p("PHBdaXQ=", "VkTvXjUy"), ea.a.p("CnBVaRpfVWEhbANka3M_b3c=", "fKy9n3Jo"), ea.a.p("QW8mMA==", "Mi5uwxbR"), false);
                            new pdf.pdfreader.viewer.editor.free.ui.dialog.x(this, 0).show();
                            return;
                        }
                        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.d(this, null);
                        wk.b.b().e(new qo.i());
                        ReaderSplitPdfManager readerSplitPdfManager = new ReaderSplitPdfManager(this, DataBridge.b());
                        readerSplitPdfManager.f26572f = this;
                        PdfPreviewEntity pdfPreviewEntity3 = this.O;
                        if (pdfPreviewEntity3 != null) {
                            String path = pdfPreviewEntity3.getPath();
                            kotlin.jvm.internal.g.d(path, ea.a.p("P2RXRRd0XnQjLjphAWg=", "2PiiVZGT"));
                            readerSplitPdfManager.f26570d = Executors.newSingleThreadExecutor();
                            pdf.pdfreader.viewer.editor.free.split.a aVar2 = readerSplitPdfManager.f26572f;
                            if (aVar2 != null) {
                                aVar2.I0();
                                readerSplitPdfManager.f26573g.clear();
                                ExecutorService executorService = readerSplitPdfManager.f26570d;
                                if (executorService != null) {
                                    executorService.execute(new pdf.pdfreader.viewer.editor.free.office.l0(2, readerSplitPdfManager, path));
                                }
                            }
                            this.f26830c0 = readerSplitPdfManager;
                            return;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("NGQyRR50UHR5", "gQDTp91f"));
                        throw null;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("P2RXRRd0XnR5", "bGMIET1B"));
                    throw null;
                }
                if (this.f26831d0.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    tn.a.d(this, ea.a.p("EXA9aXQ=", "yqbQt2nh"), ea.a.p("LGhebwplXm09XylvG3QBbkBlMWMpaQZr", "lXE8EWof"), this.f26831d0, false);
                }
                Object obj5 = c0330a.f24025b;
                if (obj5 instanceof List) {
                    list = (List) obj5;
                }
                if (list != null && (!list.isEmpty())) {
                    ArrayList arrayList = new ArrayList();
                    for (Number number : list) {
                        arrayList.add(Integer.valueOf(number.intValue()));
                    }
                    PdfPreviewEntity pdfPreviewEntity4 = this.O;
                    if (pdfPreviewEntity4 != null) {
                        String p15 = ea.a.p("LHkaeSxNKWQsXy5IWW0=", "Q9scUdbf");
                        if (Build.VERSION.SDK_INT >= 24) {
                            locales = getResources().getConfiguration().getLocales();
                            locale = locales.get(0);
                        } else {
                            locale = getResources().getConfiguration().locale;
                        }
                        String format3 = new SimpleDateFormat(p15, locale).format(Long.valueOf(System.currentTimeMillis()));
                        List b10 = DataBridge.b();
                        long currentTimeMillis = System.currentTimeMillis();
                        String fileName = getString(R.string.arg_res_0x7f1303fb) + format3;
                        kotlin.jvm.internal.g.e(fileName, "fileName");
                        String str = fileName;
                        int i13 = 1;
                        while (true) {
                            sn.d d10 = sn.d.d();
                            String str2 = ((Object) str) + ".pdf";
                            String p16 = ea.a.p("QHAnaXQ=", "Fe6Qa8Ep");
                            d10.getClass();
                            if (!sn.d.a(str2, p16)) {
                                break;
                            }
                            str = fileName + "_" + i13;
                            i13++;
                        }
                        int i14 = i13;
                        String str3 = str;
                        int i15 = i14;
                        while (true) {
                            Iterator it = DataBridge.b().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (kotlin.jvm.internal.g.a(((SplitPdfData) obj).getFileName(), str3)) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            if (obj == null) {
                                break;
                            }
                            str3 = fileName + "_" + i15;
                            i15++;
                        }
                        String path2 = pdfPreviewEntity4.getPath();
                        kotlin.jvm.internal.g.d(path2, ea.a.p("NG4caU15ZXApdGg=", "gOQh9K7r"));
                        if (arrayList.size() <= 1) {
                            v10 = kotlin.collections.m.E0(arrayList);
                        } else {
                            Object[] array = arrayList.toArray(new Comparable[0]);
                            Comparable[] comparableArr = (Comparable[]) array;
                            kotlin.jvm.internal.g.e(comparableArr, "<this>");
                            if (comparableArr.length > 1) {
                                Arrays.sort(comparableArr);
                            }
                            v10 = kotlin.collections.f.v(array);
                        }
                        b10.add(new SplitPdfData(currentTimeMillis, str3, path2, v10));
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("Q2QtRR10C3R5", "kj2iSLJw"));
                        throw null;
                    }
                }
                m2(true, true);
                return;
            }
            Object obj6 = c0330a.f24025b;
            if (obj6 instanceof Integer) {
                num = (Integer) obj6;
            } else {
                num = null;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 30;
            }
            PdfPreviewEntity pdfPreviewEntity5 = this.O;
            if (pdfPreviewEntity5 != null) {
                final pdf.pdfreader.viewer.editor.free.utils.y0 y0Var = this.f26828a0;
                ExecutorService executorService2 = this.f26829b0;
                if (executorService2 == null) {
                    q2();
                    return;
                }
                int i16 = this.Y;
                if (i16 == 0) {
                    ea.a.p("HWVQZBxyZHA2aT5QEWYpY0FpGGkxeUXlzaC4mf7ly5-plrbkwrbSpLk=", "4CDNEQZE");
                    String str4 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                    ConcurrentHashMap<String, File> concurrentHashMap = pdf.pdfreader.viewer.editor.free.utils.v.f28781a;
                    File file = new File(pdf.pdfreader.viewer.editor.free.utils.v.C(ea.a.p("G2hEbRtuVmls", "XXW1ZmB3")));
                    if (!file.exists()) {
                        file = null;
                    }
                    if (file != null) {
                        bg.b.z0(file);
                    }
                }
                int i17 = this.X - i16;
                if (i17 > i10) {
                    this.Y += i10;
                } else {
                    this.Y += i17;
                    i10 = i17;
                }
                int i18 = i16 + i10;
                int i19 = i16;
                while (i19 < i18) {
                    final String path3 = pdfPreviewEntity5.getPath();
                    final pdf.pdfreader.viewer.editor.free.utils.g1<ReaderSplitPdfActivity> g1Var = this.V;
                    String str5 = pdf.pdfreader.viewer.editor.free.utils.p0.f28743a;
                    final WeakReference weakReference = new WeakReference(this);
                    final int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_76);
                    final int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp_90);
                    final int i20 = i19;
                    executorService2.execute(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.utils.o0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context;
                            y0 y0Var2 = y0Var;
                            int i21 = dimensionPixelSize;
                            int i22 = dimensionPixelSize2;
                            String str6 = path3;
                            WeakReference weakReference2 = weakReference;
                            if (weakReference2.get() != null) {
                                context = (Context) weakReference2.get();
                            } else {
                                context = null;
                            }
                            int i23 = i20;
                            g1 g1Var2 = g1Var;
                            try {
                                if (context != null) {
                                    p0.b(context, str6, y0Var2.u(i21, i22, i23), i23);
                                    Message obtainMessage = g1Var2.obtainMessage();
                                    obtainMessage.what = 5;
                                    obtainMessage.arg1 = i23;
                                    g1Var2.sendMessage(obtainMessage);
                                } else {
                                    Message obtainMessage2 = g1Var2.obtainMessage();
                                    obtainMessage2.what = 2;
                                    obtainMessage2.arg1 = i23;
                                    g1Var2.sendMessage(obtainMessage2);
                                }
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                dp.a.a().getClass();
                                dp.a.d(context, e10);
                                t1.c(ea.a.p("B3JbYydzNVQgdQtiWmE-bHppJm0ocA==", "IFw4BFK7"), e10);
                                o9.d.s(p0.f28743a, ea.a.p("CnhSZQl0Xm80OiA=", "18gnuiUf") + e10.getMessage());
                                Message obtainMessage3 = g1Var2.obtainMessage();
                                obtainMessage3.what = 2;
                                obtainMessage3.arg1 = i23;
                                g1Var2.sendMessage(obtainMessage3);
                            }
                        }
                    });
                    i19++;
                    pdfPreviewEntity5 = pdfPreviewEntity5;
                }
                StringBuilder f10 = a0.d.f("load pages from:", i16, ", to:", this.Y, " , load count:");
                f10.append(i10);
                t1.b(f10.toString());
                int i21 = this.Y;
                String str6 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                if (i21 >= this.X) {
                    t1.b(ea.a.p("QHAnaQcgA2weIERkDyAmYSNlEnAncjBlZA==", "ESLP2phm"));
                    ea.a.p("YWUqZBZyMXAeaUBQDWYXYzBpRGkyeWNwBma2hZ3pwKjbp-jm7ZCHrv7mm5U=", "bS5CqhvO");
                    SplitPreviewFragment o22 = o2();
                    if (o22 != null) {
                        o22.f27986i0 = true;
                    }
                }
                SplitPreviewFragment o23 = o2();
                if (o23 != null) {
                    int i22 = this.Y;
                    pdf.pdfreader.viewer.editor.free.ui.adapter.w wVar = o23.f27984g0;
                    if (wVar != null) {
                        wVar.h(i22, false);
                        return;
                    }
                    return;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("P2RXRRd0XnR5", "YBcMduml"));
            throw null;
        }
    }

    @Override // jl.a
    public final void C1() {
        View findViewById = findViewById(R.id.rootView);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHG8qdDNpA3cp", "lcyLf4Ip"));
        this.J = findViewById;
        View findViewById2 = findViewById(R.id.view_status_bar);
        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        kotlin.jvm.internal.g.d(layoutParams, ea.a.p("IlZYZQ5TQ2EudTlCFHJGbFR5AXUxUARyJm1z", "PML4GYDt"));
        layoutParams.height = aj.b.B(this);
        findViewById2.setLayoutParams(layoutParams);
        this.f26833f0 = (FrameLayout) findViewById(R.id.frResult);
        View findViewById3 = findViewById(R.id.iv_split_back);
        kotlin.jvm.internal.g.d(findViewById3, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuB3YacxVsD3Q4YlNjGCk=", "YIiTfg2s"));
        this.K = (ImageView) findViewById3;
        View findViewById4 = findViewById(R.id.tv_split_add);
        kotlin.jvm.internal.g.d(findViewById4, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuRnYZczNsJ3Q-YVZkKQ==", "Na2Y1SYi"));
        this.L = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.container);
        kotlin.jvm.internal.g.d(findViewById5, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuDW8rdARpJWUEKQ==", "b1T3Kvek"));
        this.N = (FrameLayout) findViewById5;
        View findViewById6 = findViewById(R.id.title_tv);
        kotlin.jvm.internal.g.d(findViewById6, ea.a.p("ImlcZAJpAHcKeS9kHFJ5aVwuJmk9bFNfAHYp", "7xD2Tegq"));
        this.M = (TextView) findViewById6;
        this.P = (RelativeLayout) findViewById(R.id.layout_all);
        this.Q = (CheckBox) findViewById(R.id.check_all);
    }

    @Override // jl.a
    public final View D1() {
        View view = this.J;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.g.i(ea.a.p("QW8kdCVpB3c=", "6m38Dj75"));
        throw null;
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_split_pdf;
    }

    @Override // pdf.pdfreader.viewer.editor.free.split.a
    public final void I0() {
        this.f26843p0 = System.currentTimeMillis();
        n2().show();
    }

    @Override // jl.a
    public final void K1() {
        ImageView imageView = this.K;
        if (imageView != null) {
            imageView.setOnClickListener(new d9.f(this, 17));
            RelativeLayout relativeLayout = this.P;
            if (relativeLayout != null) {
                relativeLayout.setOnClickListener(new qb.j0(this, 16));
            }
            TextView textView = this.L;
            if (textView != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity$initView$3
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
                        ReaderSplitPdfActivity.this.f26831d0 = ea.a.p("UmRk", "il1MRje0");
                        tn.a.d(ReaderSplitPdfActivity.this, ea.a.p("QHAnaXQ=", "QaekYjT3"), ea.a.p("UGgkbwBlC20VX0doBnc=", "P9kfaSwZ"), ReaderSplitPdfActivity.this.f26831d0, false);
                        tn.a.b(ReaderSplitPdfActivity.this, ea.a.p("HHAhaXQ=", "2goMxYHE"), ea.a.p("OnBdaR9fKWQsZg9sUV80bFFjaw==", "V2I1kHUQ"));
                        ReaderSplitPdfActivity.this.m2(false, true);
                    }
                });
                return;
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("UmQvUwNsC3Q=", "Py0G8HQi"));
                throw null;
            }
        }
        kotlin.jvm.internal.g.i(ea.a.p("LGEUa3BtZw==", "83Nw9T1I"));
        throw null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.split.a
    public final void M(ArrayList filePaths) {
        kotlin.jvm.internal.g.e(filePaths, "filePaths");
        if (filePaths.isEmpty()) {
            ReaderHomeActivity.f26656t2 = false;
            t1.b("query onSplitFinish filePaths.isEmpty skipSilentScanWithMergeOrSplit:false");
            n2().dismiss();
            return;
        }
        if (n2().isShowing()) {
            n2().c(99, 100);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = filePaths.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            if (file.exists()) {
                String A0 = bg.b.A0(file);
                Locale locale = Locale.getDefault();
                String f10 = a6.h.f("UGUFRDdmA3UkdE4p", "h47qRbkg", locale, A0, locale);
                kotlin.jvm.internal.g.d(f10, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnHy4ObyFvBWU9Q1BzHChbbzlhJmUp", "1M3V6zmr"));
                if (kotlin.jvm.internal.g.a(f10, ea.a.p("Q2Rm", "VfaX3e2E"))) {
                    PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                    pdfPreviewEntity.setDate(file.lastModified());
                    pdfPreviewEntity.setPath(file.getAbsolutePath());
                    pdfPreviewEntity.setSize(file.length());
                    pdfPreviewEntity.setName(bg.b.B0(file));
                    pdfPreviewEntity.setOtherStrOne(ea.a.p("Z0RG", "3w7nA7yj"));
                    arrayList.add(pdfPreviewEntity);
                }
            }
        }
        bm.c.b(this).f(arrayList, new e1(this));
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.g1.a
    public final void Q(Message message) {
        if (message != null) {
            int i10 = message.what;
            tf.c cVar = this.W;
            if (i10 != 0) {
                boolean z10 = true;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5) {
                                    String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                                    SplitPreviewFragment o22 = o2();
                                    if (o22 != null) {
                                        int i11 = message.arg1;
                                        pdf.pdfreader.viewer.editor.free.ui.adapter.w wVar = o22.f27984g0;
                                        if (wVar != null) {
                                            ArrayList arrayList = wVar.f27316h;
                                            if (i11 < 0 || i11 >= arrayList.size()) {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                arrayList.set(i11, Boolean.TRUE);
                                                wVar.notifyItemChanged(i11);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            ea.a.p("YWUqZBZyMXAeaUBQDWYXYzBpRGkyeWPmq6yKrPvo9KPVntvl3YyEiJA=", "7lZSvp4z");
                            String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                            if (this.Y >= this.X) {
                                ea.a.p("HWVQZBxyZHA2aT5QEWYpY0FpGGkxeUVwPGawhcvp16inp5Lm55DSrtbm5ZU=", "kOI6XUcT");
                                SplitPreviewFragment o23 = o2();
                                if (o23 != null) {
                                    o23.f27986i0 = true;
                                }
                            }
                            ((pdf.pdfreader.viewer.editor.free.ui.dialog.d) cVar.getValue()).dismiss();
                            SplitPreviewFragment o24 = o2();
                            if (o24 != null) {
                                int i12 = this.Y;
                                pdf.pdfreader.viewer.editor.free.ui.adapter.w wVar2 = o24.f27984g0;
                                if (wVar2 != null) {
                                    wVar2.h(i12, false);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        ea.a.p("HWVQZBxyZHA2aT5QEWYpY0FpGGkxeUXnpZ-ViMRtOVArZhFjFnJS6c6Zoq-v", "Zpbv1sTL");
                        String str3 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                        return;
                    }
                    ea.a.p("GWUvZCdyInAkaRJQUGYWY0xpJGk9eRZCHXQcYSHk_Z2urdblxbqYlJk=", "HgKNBqXQ");
                    String str4 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                    ((pdf.pdfreader.viewer.editor.free.ui.dialog.d) cVar.getValue()).dismiss();
                    return;
                }
                ea.a.p("YWUqZBZyMXAeaUBQDWYXYzBpRGkyeWPlwJWAvOfo9aPVntvp55mKr68=", "MeGRah6U");
                String str5 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                return;
            }
            ea.a.p("YWUqZBZyMXAeaUBQDWYXYzBpRGkyeWPl7oCPp9joxKPVnpA=", "RjScjnRj");
            String str6 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            ((pdf.pdfreader.viewer.editor.free.ui.dialog.d) cVar.getValue()).show();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.split.a
    public final void i0(int i10, int i11, int i12) {
        int i13 = i10 + i11;
        if (n2().isShowing()) {
            n2().c(i13, i12);
        } else {
            n2().d(i13, i12);
        }
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
    }

    public final void m2(boolean z10, boolean z11) {
        String str;
        String format;
        CheckBox checkBox;
        if (!isDestroyed() && (checkBox = this.Q) != null) {
            checkBox.setChecked(false);
        }
        String str2 = this.U;
        String str3 = this.T;
        if (z10) {
            str = str2;
        } else {
            str = str3;
        }
        this.f26832e0 = str;
        TextView textView = this.M;
        if (textView != null) {
            if (z10) {
                format = getString(R.string.arg_res_0x7f130486);
            } else {
                String string = getString(R.string.arg_res_0x7f130416);
                kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQHIgYQFlKF8QXx5lK2UsdFRkKQ==", "AMTUZhmG"));
                format = String.format(string, Arrays.copyOf(new Object[]{0}, 1));
                kotlin.jvm.internal.g.d(format, ea.a.p("JG9DbVN0YHQgaRUsFCo2cl9zKQ==", "LmB12Hxb"));
            }
            textView.setText(format);
            SplitPreviewFragment o22 = o2();
            SplitResultFragment p22 = p2();
            androidx.fragment.app.g0 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            ea.a.p("O3VCcAhyHUY6YQFtUW4jTVluM2cschhiEWcYbgVyI247YVF0Dm8HKCk=", "bgH2giX2");
            if (z11) {
                if (z10) {
                    if (p22 == null) {
                        aVar.e(R.anim.slide_right_in, R.anim.slide_left_out);
                    } else {
                        aVar.e(R.anim.slide_left_in, R.anim.slide_right_out);
                    }
                } else {
                    aVar.e(R.anim.slide_right_in, R.anim.slide_left_out);
                }
            }
            if (z10) {
                if (o22 != null) {
                    aVar.l(o22);
                }
                if (p22 != null) {
                    aVar.o(p22);
                } else {
                    aVar.c(R.id.container, new SplitResultFragment(), str2, 1);
                }
                RelativeLayout relativeLayout = this.P;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                }
                TextView textView2 = this.L;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("LmRVUwlsXnQ=", "Y6R2pcVT"));
                    throw null;
                }
            } else {
                if (p22 != null) {
                    aVar.l(p22);
                }
                if (o22 != null) {
                    aVar.o(o22);
                } else {
                    SplitPreviewFragment.a aVar2 = SplitPreviewFragment.f27979l0;
                    PdfPreviewEntity pdfPreviewEntity = this.O;
                    if (pdfPreviewEntity != null) {
                        aVar2.getClass();
                        SplitPreviewFragment splitPreviewFragment = new SplitPreviewFragment();
                        Bundle bundle = new Bundle();
                        bundle.putSerializable(ea.a.p("EmUhXxRwJGk8XxZyUXY-ZU9fN249aUJ5", "IpyXgHTU"), pdfPreviewEntity);
                        splitPreviewFragment.j0(bundle);
                        aVar.c(R.id.container, splitPreviewFragment, str3, 1);
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("P2RXRRd0XnR5", "PNyKoF6U"));
                        throw null;
                    }
                }
                RelativeLayout relativeLayout2 = this.P;
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(0);
                }
                TextView textView3 = this.L;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("LmRVUwlsXnQ=", "bR8vwsbG"));
                    throw null;
                }
            }
            getSupportFragmentManager().H().size();
            String str4 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            if (!aVar.f3903g) {
                aVar.f3733p.z(aVar, true);
                return;
            }
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        kotlin.jvm.internal.g.i(ea.a.p("O2lFbBxUdg==", "1U8tC3Iv"));
        throw null;
    }

    public final pdf.pdfreader.viewer.editor.free.ui.dialog.y n2() {
        return (pdf.pdfreader.viewer.editor.free.ui.dialog.y) this.f26842o0.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r3 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (kotlin.text.k.O(r1, ea.a.p("AW8RcwlhVGV6bC9mASAHbhVkC3YsY2U=", "edFrBTu6"), false) == true) goto L7;
     */
    @Override // pdf.pdfreader.viewer.editor.free.split.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o0(java.lang.Throwable r6) {
        /*
            r5 = this;
            java.lang.String r0 = "throwable"
            kotlin.jvm.internal.g.e(r6, r0)
            r0 = 0
            pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity.f26656t2 = r0
            java.lang.String r1 = "query onSplitError skipSilentScanWithMergeOrSplit:false"
            pdf.pdfreader.viewer.editor.free.utils.t1.b(r1)
            pdf.pdfreader.viewer.editor.free.ui.dialog.y r1 = r5.n2()
            r1.dismiss()
            boolean r1 = r6 instanceof java.io.IOException
            java.lang.String r2 = "QHAnaQdfBGEbbFFkNnM-b3c="
            if (r1 == 0) goto L34
            java.lang.String r1 = r6.getMessage()
            if (r1 == 0) goto L31
            java.lang.String r3 = "AW8RcwlhVGV6bC9mASAHbhVkC3YsY2U="
            java.lang.String r4 = "edFrBTu6"
            java.lang.String r3 = ea.a.p(r3, r4)
            boolean r1 = kotlin.text.k.O(r1, r3, r0)
            r3 = 1
            if (r1 != r3) goto L31
            goto L32
        L31:
            r3 = r0
        L32:
            if (r3 != 0) goto L3a
        L34:
            boolean r1 = r5.r2()
            if (r1 != 0) goto L6b
        L3a:
            java.lang.String r6 = "QHAnaXQ="
            java.lang.String r1 = "paABLHtT"
            java.lang.String r6 = ea.a.p(r6, r1)
            java.lang.String r1 = "Nnk9IgAa"
            java.lang.String r1 = ea.a.p(r2, r1)
            java.lang.String r2 = "QW8mMQ=="
            java.lang.String r3 = "jt0FXM9u"
            java.lang.String r2 = ea.a.p(r2, r3)
            tn.a.d(r5, r6, r1, r2, r0)
            pdf.pdfreader.viewer.editor.free.ui.dialog.x r6 = new pdf.pdfreader.viewer.editor.free.ui.dialog.x
            r6.<init>(r5, r0)
            h5.a r1 = new h5.a
            r2 = 18
            r1.<init>(r5, r2)
            r6.H = r1
            r6.setCancelable(r0)
            r6.setCanceledOnTouchOutside(r0)
            r6.show()
            return
        L6b:
            boolean r6 = r6 instanceof java.lang.OutOfMemoryError
            if (r6 == 0) goto L94
            java.lang.String r6 = "BHAZaXQ="
            java.lang.String r1 = "Irwuj3qT"
            java.lang.String r6 = ea.a.p(r6, r1)
            java.lang.String r1 = "RTI2SQmC"
            java.lang.String r1 = ea.a.p(r2, r1)
            java.lang.String r2 = "I2UZbyh5"
            java.lang.String r3 = "g8NtZGb9"
            java.lang.String r2 = ea.a.p(r2, r3)
            tn.a.d(r5, r6, r1, r2, r0)
            android.content.res.Resources r6 = r5.getResources()
            r0 = 2131952633(0x7f1303f9, float:1.9541714E38)
            java.lang.String r6 = r6.getString(r0)
            goto Lb9
        L94:
            java.lang.String r6 = "PHBdaXQ="
            java.lang.String r1 = "fAORv4Gw"
            java.lang.String r6 = ea.a.p(r6, r1)
            java.lang.String r1 = "yVZaxX6O"
            java.lang.String r1 = ea.a.p(r2, r1)
            java.lang.String r2 = "LHJFb3I="
            java.lang.String r3 = "K2I7sX2r"
            java.lang.String r2 = ea.a.p(r2, r3)
            tn.a.d(r5, r6, r1, r2, r0)
            android.content.res.Resources r6 = r5.getResources()
            r0 = 2131952634(0x7f1303fa, float:1.9541716E38)
            java.lang.String r6 = r6.getString(r0)
        Lb9:
            java.lang.String r0 = "WmZrKAdoEG8FYVZsDCA_c2RPR3QJZg5lk4DzdClmD2lfZS9fHHQKZQApPiBJIHYgZCASfQ=="
            java.lang.String r1 = "qUvnuiha"
            java.lang.String r0 = ea.a.p(r0, r1)
            kotlin.jvm.internal.g.d(r6, r0)
            pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog r0 = r5.f26841n0
            if (r0 != 0) goto Led
            pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog r0 = new pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog
            pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity$onSplitError$2 r1 = new pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity$onSplitError$2
            r1.<init>()
            r0.<init>(r5, r1)
            android.content.res.Resources r1 = r5.getResources()
            r2 = 2131952632(0x7f1303f8, float:1.9541712E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "PWVCbwxyVGUpLi1lAVMcclxuCSgXLhZ0KmlfZ01yNWErZUNfCnBbaS5fLGEcbA1kKQ=="
            java.lang.String r3 = "LFCoX1cP"
            java.lang.String r2 = ea.a.p(r2, r3)
            kotlin.jvm.internal.g.d(r1, r2)
            r0.H(r1, r6)
            r5.f26841n0 = r0
        Led:
            pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog r6 = r5.f26841n0
            if (r6 == 0) goto Lf4
            r6.show()
        Lf4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity.o0(java.lang.Throwable):void");
    }

    public final SplitPreviewFragment o2() {
        Fragment D = getSupportFragmentManager().D(this.T);
        if (D instanceof SplitPreviewFragment) {
            return (SplitPreviewFragment) D;
        }
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.R) {
            OperateExecuteTask operateExecuteTask = this.f26834g0;
            if (operateExecuteTask != null) {
                operateExecuteTask.n();
            }
            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.c(this, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity$onBackPressed$1
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
                    ReaderSplitPdfActivity readerSplitPdfActivity = ReaderSplitPdfActivity.this;
                    ReaderSplitPdfActivity.a aVar = ReaderSplitPdfActivity.f26822q0;
                    readerSplitPdfActivity.getClass();
                    readerSplitPdfActivity.V.post(new g0(readerSplitPdfActivity, 1));
                }
            }, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity$onBackPressed$2
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
                    ReaderSplitPdfActivity.this.f26838k0 = true;
                }
            });
        } else if (p2() != null) {
            SplitResultFragment p22 = p2();
            boolean z10 = false;
            if (p22 != null && !p22.E()) {
                z10 = true;
            }
            if (z10) {
                s2(new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity$onBackPressed$3
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
                        pdf.pdfreader.viewer.editor.free.ads.n nVar = pdf.pdfreader.viewer.editor.free.ads.n.f23972a;
                        final ReaderSplitPdfActivity readerSplitPdfActivity = ReaderSplitPdfActivity.this;
                        cg.a<tf.d> aVar = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity$onBackPressed$3.1
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
                                ReaderSplitPdfActivity.this.finish();
                            }
                        };
                        final ReaderSplitPdfActivity readerSplitPdfActivity2 = ReaderSplitPdfActivity.this;
                        nVar.c(readerSplitPdfActivity, aVar, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity$onBackPressed$3.2
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
                                ReaderSplitPdfActivity.this.f26838k0 = true;
                            }
                        });
                    }
                });
            } else {
                m2(true, true);
            }
        } else if (kotlin.jvm.internal.g.a(ea.a.p("OWlUdw==", "iyudQgn6"), this.f26831d0)) {
            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.a();
            finish();
        } else {
            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.c(this, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity$onBackPressed$4
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
                    ReaderSplitPdfActivity.this.finish();
                }
            }, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity$onBackPressed$5
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
                    ReaderSplitPdfActivity.this.f26838k0 = true;
                }
            });
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.a, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c10;
        char c11;
        PdfPreviewEntity pdfPreviewEntity;
        String str;
        int i10;
        int i11;
        ArrayList arrayList;
        ArrayList<PdfPreviewEntity> arrayList2 = null;
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable(ea.a.p("PHBdaQ1QU2YTbixv", "YfDBDZIT"));
            if (serializable instanceof ArrayList) {
                arrayList = (ArrayList) serializable;
            } else {
                arrayList = null;
            }
            if (arrayList != null && (!arrayList.isEmpty())) {
                DataBridge.b().clear();
                DataBridge.b().addAll(arrayList);
            }
        }
        super.onCreate(bundle);
        if (Decoder.f18572a) {
            try {
                String substring = rd.a.b(this).substring(1748, 1779);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset = kotlin.text.a.f19966b;
                byte[] bytes = substring.getBytes(charset);
                kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] bytes2 = "0e300c0603551d13040530030101ff3".getBytes(charset);
                kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                long j10 = 2;
                if (System.currentTimeMillis() % j10 == 0) {
                    int nextInt = rd.a.f29504a.nextInt(0, bytes.length / 2);
                    int i12 = 0;
                    while (true) {
                        if (i12 <= nextInt) {
                            if (bytes[i12] != bytes2[i12]) {
                                c11 = 16;
                                break;
                            }
                            i12++;
                        } else {
                            c11 = 0;
                            break;
                        }
                    }
                    if ((c11 ^ 0) != 0) {
                        rd.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes2, bytes)) {
                    rd.a.a();
                    throw null;
                }
                try {
                    String substring2 = nc.a.b(this).substring(2516, 2547);
                    kotlin.jvm.internal.g.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    Charset charset2 = kotlin.text.a.f19966b;
                    byte[] bytes3 = substring2.getBytes(charset2);
                    kotlin.jvm.internal.g.d(bytes3, "this as java.lang.String).getBytes(charset)");
                    byte[] bytes4 = "7384e14e455097fd3f766511ac4e0fc".getBytes(charset2);
                    kotlin.jvm.internal.g.d(bytes4, "this as java.lang.String).getBytes(charset)");
                    if (System.currentTimeMillis() % j10 == 0) {
                        int nextInt2 = nc.a.f22437a.nextInt(0, bytes3.length / 2);
                        int i13 = 0;
                        while (true) {
                            if (i13 <= nextInt2) {
                                if (bytes3[i13] != bytes4[i13]) {
                                    c10 = 16;
                                    break;
                                }
                                i13++;
                            } else {
                                c10 = 0;
                                break;
                            }
                        }
                        if ((c10 ^ 0) != 0) {
                            nc.a.a();
                            throw null;
                        }
                    } else if (!Arrays.equals(bytes4, bytes3)) {
                        nc.a.a();
                        throw null;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    nc.a.a();
                    throw null;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                rd.a.a();
                throw null;
            }
        } else {
            ReaderPdfApplication.o(this);
        }
        t1.b(ea.a.p("Km5FZQsgRHA2aT4gFGMcaUNpGnk=", "ceDoXs3W"));
        Serializable serializableExtra = getIntent().getSerializableExtra(f26823r0);
        if (serializableExtra instanceof PdfPreviewEntity) {
            pdfPreviewEntity = (PdfPreviewEntity) serializableExtra;
        } else {
            pdfPreviewEntity = null;
        }
        if (pdfPreviewEntity == null) {
            return;
        }
        this.O = pdfPreviewEntity;
        String stringExtra = getIntent().getStringExtra(f26824s0);
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f26831d0 = stringExtra;
        this.X = getIntent().getIntExtra(f26825t0, 0);
        PdfPreviewEntity pdfPreviewEntity2 = this.O;
        if (pdfPreviewEntity2 != null) {
            t1.b("enter split activity path : " + pdfPreviewEntity2.getPath());
            String str2 = this.T;
            if (bundle == null || (str = bundle.getString(f26827v0)) == null) {
                str = str2;
            }
            this.f26832e0 = str;
            if (bundle != null) {
                i10 = bundle.getInt(f26826u0);
            } else {
                i10 = 0;
            }
            this.Y = i10;
            if (this.X == 0) {
                PdfPreviewEntity pdfPreviewEntity3 = this.O;
                if (pdfPreviewEntity3 != null) {
                    String path = pdfPreviewEntity3.getPath();
                    String str3 = pdf.pdfreader.viewer.editor.free.utils.p0.f28743a;
                    if (path != null && !TextUtils.isEmpty(path)) {
                        File file = new File(path);
                        if (file.exists() && !file.isDirectory()) {
                            try {
                                i11 = new PdfRenderer(ParcelFileDescriptor.open(file, 268435456)).getPageCount();
                            } catch (Exception unused) {
                            }
                            this.X = i11;
                            t1.b("enter split activity pdf page : " + i11);
                        }
                    }
                    i11 = 0;
                    this.X = i11;
                    t1.b("enter split activity pdf page : " + i11);
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("NGQARSV0XnR5", "49DfK7If"));
                    throw null;
                }
            }
            q2();
            m2(!kotlin.jvm.internal.g.a(this.f26832e0, str2), false);
            if (bundle != null) {
                this.R = bundle.getBoolean(ea.a.p("JnNiaBZ3ZWUpdSZ0JWEPZQ==", "WQeOTtb3"), false);
                Serializable serializable2 = bundle.getSerializable(ea.a.p("HWVCdRV0e2kpdA==", "BvLGXGb2"));
                if (serializable2 instanceof ArrayList) {
                    arrayList2 = (ArrayList) serializable2;
                }
                this.S = arrayList2;
                if (this.R && arrayList2 != null) {
                    t2(arrayList2, false);
                    return;
                }
                return;
            }
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("Q2QtRR10C3R5", "SZ5efZ9o"));
        throw null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        j2 j2Var;
        OperateExecuteTask operateExecuteTask = this.f26834g0;
        if (operateExecuteTask != null) {
            operateExecuteTask.k();
        }
        super.onDestroy();
        j2 j2Var2 = this.f26839l0;
        boolean z10 = false;
        if (j2Var2 != null && j2Var2.isShowing()) {
            z10 = true;
        }
        if (z10 && (j2Var = this.f26839l0) != null) {
            j2Var.dismiss();
        }
        ExecutorService executorService = this.f26829b0;
        if (executorService != null) {
            executorService.shutdown();
        }
        this.f26828a0 = null;
        this.f26829b0 = null;
        ReaderSplitPdfManager readerSplitPdfManager = this.f26830c0;
        if (readerSplitPdfManager != null) {
            readerSplitPdfManager.g();
        }
        OperatePdfFailedDialog operatePdfFailedDialog = this.f26841n0;
        if (operatePdfFailedDialog != null) {
            operatePdfFailedDialog.cancel();
        }
        OperateInterceptDialog operateInterceptDialog = this.f26840m0;
        if (operateInterceptDialog != null) {
            operateInterceptDialog.cancel();
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.y n22 = n2();
        if (n22 != null) {
            n22.cancel();
        }
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        SplitResultFragment p22;
        super.onResume();
        OperateExecuteTask operateExecuteTask = this.f26834g0;
        if (operateExecuteTask != null) {
            operateExecuteTask.l();
        }
        if (this.f26838k0) {
            this.f26838k0 = false;
            if (this.R) {
                this.V.post(new g0(this, 1));
            } else {
                finish();
            }
        }
        if (this.f26835h0) {
            this.f26835h0 = false;
            if (BillingConfigImpl.c.w() && (p22 = p2()) != null) {
                p22.y0();
            }
        }
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString(f26827v0, this.f26832e0);
        outState.putInt(f26826u0, this.Y);
        outState.putBoolean(ea.a.p("LXMdaFx3JWU7dQp0ZGEwZQ==", "o7DN3we9"), this.R);
        outState.putSerializable(ea.a.p("HWVCdRV0e2kpdA==", "R2ZBD3br"), this.S);
        if (!DataBridge.b().isEmpty()) {
            String p10 = ea.a.p("QHAnaQdQBmY7blJv", "ikaHGQNu");
            List b10 = DataBridge.b();
            kotlin.jvm.internal.g.c(b10, ea.a.p("PHUlbEpjCW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAmeTllSmoJdikuE3RdbHlBSnIzeQVpRXRIcBVmf3AmZiBlKGQPckZ2IWURZUYuMmRRdD1yZ2ZEZREuAnA9aTYuAXAlaR5QDGYMYRJhCnt3a1d0PmknLlVvGGwUYyVpLW4hLh15GmUpbCFhFWVHSyMueXIgYTBMX3MAPAFkNy4yZDRyLGEOZRouPmkDd1FyeWVcaSZvOy5QchFlX3MhbCt0fFM5bAN0OGQuRAd0VT53fQ==", "f9RIjhnK"));
            outState.putSerializable(p10, (ArrayList) b10);
        }
    }

    public final SplitResultFragment p2() {
        Fragment D = getSupportFragmentManager().D(this.U);
        if (D instanceof SplitResultFragment) {
            return (SplitResultFragment) D;
        }
        return null;
    }

    public final void q2() {
        if (this.f26828a0 == null) {
            try {
                PdfPreviewEntity pdfPreviewEntity = this.O;
                if (pdfPreviewEntity != null) {
                    pdf.pdfreader.viewer.editor.free.utils.y0 y0Var = new pdf.pdfreader.viewer.editor.free.utils.y0(this, pdfPreviewEntity.getPath());
                    y0Var.countPages();
                    this.f26828a0 = y0Var;
                    t1.b(ea.a.p("AnAraRcgPW4hdEZjW3IyIEt1MWMsc3M=", "RRqGcT3L"));
                    ea.a.p("Wm4idFNjDXIXIEd1CmMzc3M=", "fqo0wSLf");
                    String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("P2RXRRd0XnR5", "oyCpDRdk"));
                    throw null;
                }
            } catch (Exception e10) {
                dp.a.a().getClass();
                dp.a.d(this, e10);
                t1.c(ea.a.p("PHBdaQ0gXm4zdGpjGnINIFByHG9y", "MBwTutdz"), e10);
                ea.a.p("Wm4idFNjDXIXIFJhAGw=", "akdg4vAg");
                String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                e10.printStackTrace();
            }
        }
        if (this.f26829b0 == null) {
            try {
                ge.a.z().getClass();
                int i10 = ge.a.B(this)[1];
                if (3 >= i10) {
                    i10 = 3;
                }
                this.f26829b0 = Executors.newFixedThreadPool(i10);
                t1.b(ea.a.p("QHAnaQcgC24bdBRwBm86IDd1UWMjc3M=", "ToqUY5Jm"));
                ea.a.p("H24odEdwBm8kIBV1V2Myc3M=", "huvAgivq");
                String str3 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            } catch (Exception e11) {
                dp.a.a().getClass();
                dp.a.d(this, e11);
                t1.c(ea.a.p("HHAoaTggGG4hdEZjW3IyIEhvPWw=", "P1oDLqzU"), e11);
                ea.a.p("Wm4idFNwDW8eIFJhAGw=", "B7Mmn2L5");
                String str4 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                e11.printStackTrace();
            }
        }
    }

    public final boolean r2() {
        float a10 = pdf.pdfreader.viewer.editor.free.utils.f0.a();
        float f10 = (((float) this.Z) / 1000.0f) / 1000.0f;
        t1.b("split needSpace: " + f10 + " freeSize: " + a10);
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        if (a10 > f10 * 2) {
            return true;
        }
        return false;
    }

    public final void s2(cg.a<tf.d> aVar) {
        boolean z10;
        if (this.f26840m0 == null) {
            String string = getResources().getString(R.string.arg_res_0x7f1303d1);
            kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0oICQbg8uIWVSZC5yLHEXaQZfR3AFaSJ0LW5VKQ==", "B6hS9f1h"));
            String string2 = getResources().getString(R.string.arg_res_0x7f1303d2);
            kotlin.jvm.internal.g.d(string2, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0PmlbZ1ZyMmFXZTlfAnULdC10W2EadCk=", "L5xWJAVT"));
            this.f26840m0 = new OperateInterceptDialog(this, string, string2);
        }
        OperateInterceptDialog operateInterceptDialog = this.f26840m0;
        if (operateInterceptDialog != null && !operateInterceptDialog.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            OperateInterceptDialog operateInterceptDialog2 = this.f26840m0;
            if (operateInterceptDialog2 != null) {
                operateInterceptDialog2.A = new b(aVar);
            }
            if (operateInterceptDialog2 != null) {
                operateInterceptDialog2.show();
            }
        }
    }

    public final void t2(ArrayList<PdfPreviewEntity> arrayList, boolean z10) {
        FrameLayout frameLayout = this.f26833f0;
        if (frameLayout != null) {
            this.R = true;
            this.S = arrayList;
            frameLayout.setVisibility(0);
            FrameLayout frameLayout2 = this.f26833f0;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
            }
            if (this.f26834g0 == null) {
                this.f26834g0 = new OperateExecuteTask();
            }
            String string = getString(R.string.arg_res_0x7f130487);
            kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHM2bCp0KHMUYzNlPnNsMSk=", "waPMM3YD"));
            tn.a.d(this, ea.a.p("MHA1aXQ=", "g7CY3HLI"), ea.a.p("QHAnaQdfBm8cZWtzHGM1ZTdz", "LP4SjNhJ"), ea.a.p("R28_YWw=", "7R9igaBo"), false);
            tn.a.d(this, ea.a.p("PHBdaXQ=", "1QhBgY3A"), ea.a.p("QHAnaQdfBm8cZWtzHGM1ZTdz", "GcCs2aLg"), String.valueOf(arrayList.size()), false);
            OperateExecuteTask operateExecuteTask = this.f26834g0;
            kotlin.jvm.internal.g.b(operateExecuteTask);
            String p10 = ea.a.p("PnAOaXQ=", "z6MbdXqz");
            FrameLayout frameLayout3 = this.f26833f0;
            kotlin.jvm.internal.g.b(frameLayout3);
            operateExecuteTask.q(3, p10, frameLayout3, string, arrayList, z10, new c(arrayList));
        }
    }

    public final void u2(int i10) {
        String p10 = ea.a.p("QHAnaXQ=", "O0mdjmyI");
        boolean z10 = EventCenter.f28655a;
        EventCenter.f28660g = p10;
        EventCenter.f(ea.a.p("O29ebHM=", "fLDMP3bn"));
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    EventCenter.f28661h = ea.a.p("IGUaMg==", "VHPh68fg");
                }
            } else {
                EventCenter.f28661h = ea.a.p("P2VDMQ==", "JdNPbk8d");
            }
        } else {
            EventCenter.f28661h = ea.a.p("QHk4MTA=", "bX0cijgi");
        }
        EventCenter.c(this);
        EventCenter.d(this);
    }

    /* compiled from: ReaderSplitPdfActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements oo.b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ cg.a<tf.d> f26845b;

        public b(cg.a<tf.d> aVar) {
            this.f26845b = aVar;
        }

        @Override // oo.b
        public final void a() {
            tn.a.b(ReaderSplitPdfActivity.this, ea.a.p("PHBdaXQ=", "8KXJt3XA"), ea.a.p("PHBdaQ1fRHQ1cBVxAGl0", "8DoZggcx"));
            this.f26845b.invoke();
        }

        @Override // oo.b
        public final void cancel() {
        }
    }

    /* compiled from: ReaderSplitPdfActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements OperateExecuteTask.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList<PdfPreviewEntity> f26847b;

        public c(ArrayList<PdfPreviewEntity> arrayList) {
            this.f26847b = arrayList;
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void a() {
            ReaderSplitPdfActivity readerSplitPdfActivity = ReaderSplitPdfActivity.this;
            OperateExecuteTask operateExecuteTask = readerSplitPdfActivity.f26834g0;
            readerSplitPdfActivity.getClass();
            readerSplitPdfActivity.V.post(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(readerSplitPdfActivity, 6));
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void b(PdfPreviewEntity pdfPreviewEntity) {
            String p10 = ea.a.p("QHAnaXQ=", "XS2BvYhq");
            String p11 = ea.a.p("P3AeaRhfCW8mZTlvRGVu", "4qLrlmzK");
            ReaderSplitPdfActivity readerSplitPdfActivity = ReaderSplitPdfActivity.this;
            tn.a.b(readerSplitPdfActivity, p10, p11);
            Iterator<PdfPreviewEntity> it = this.f26847b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PdfPreviewEntity next = it.next();
                if (kotlin.jvm.internal.g.a(next.getPath(), pdfPreviewEntity.getPath())) {
                    next.setRecent(1);
                    next.setRecentDate(System.currentTimeMillis());
                    FileRepository.I(pdfPreviewEntity);
                    bm.c.b(readerSplitPdfActivity).i(next);
                    if (eo.e.c(readerSplitPdfActivity) == 2) {
                        eo.e.n(readerSplitPdfActivity, 1);
                    }
                    if (eo.e.k(readerSplitPdfActivity) == 2) {
                        eo.e.s(readerSplitPdfActivity, 1);
                    }
                    ReaderPdfApplication.h();
                    pdf.pdfreader.viewer.editor.free.utils.k0.i(readerSplitPdfActivity, next.getPath(), next, ea.a.p("dVIETSxBLkw=", "z0Y3KzMX"));
                }
            }
            OperateExecuteTask operateExecuteTask = readerSplitPdfActivity.f26834g0;
            AppViewModel k10 = ReaderPdfApplication.k();
            ToolsType toolsType = DataBridge.f24029a;
            String path = pdfPreviewEntity.getPath();
            kotlin.jvm.internal.g.d(path, ea.a.p("Q2QtUAFlFGkXd3FuHWkieWpwU3Ro", "lUWrB6Ss"));
            k10.g(new nl.g(toolsType, path));
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void c() {
            ReaderSplitPdfActivity readerSplitPdfActivity = ReaderSplitPdfActivity.this;
            OperateExecuteTask operateExecuteTask = readerSplitPdfActivity.f26834g0;
            readerSplitPdfActivity.V.post(new g0(readerSplitPdfActivity, 1));
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void f(PdfPreviewEntity pdfPreviewEntity) {
            String p10 = ea.a.p("QHAnaXQ=", "RXrh8Oe0");
            String p11 = ea.a.p("QHAnaQdfBm8cZWtzAWEkZQ==", "utrmaU6B");
            ReaderSplitPdfActivity readerSplitPdfActivity = ReaderSplitPdfActivity.this;
            tn.a.b(readerSplitPdfActivity, p10, p11);
            pdf.pdfreader.viewer.editor.free.utils.e1.e(readerSplitPdfActivity, pdfPreviewEntity);
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

    /* compiled from: ReaderSplitPdfActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements xn.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26848a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ReaderSplitPdfActivity f26849b;

        public d(ReaderSplitPdfActivity readerSplitPdfActivity, boolean z10) {
            this.f26848a = z10;
            this.f26849b = readerSplitPdfActivity;
        }

        @Override // xn.b
        public final void a() {
            boolean z10 = this.f26848a;
            ReaderSplitPdfActivity readerSplitPdfActivity = this.f26849b;
            if (z10) {
                pdf.pdfreader.viewer.editor.free.utils.h1.i(readerSplitPdfActivity);
            } else {
                readerSplitPdfActivity.f26836i0.a(new String[]{ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFIDQQdfdVgORSVOckxsUx9PIUElRQ==", "0Zw3U2Mr"), ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFLEUoVDNSC0EDX2JUNlJ2R0U=", "j3UBspvE")});
            }
        }

        @Override // xn.b
        public final void b() {
        }
    }
}
