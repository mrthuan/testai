package lib.zj.pdfeditor;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import ao.i2;
import com.google.android.gms.common.api.Api;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import lib.zj.pdfeditor.Annotation;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.ReaderView;
import lib.zj.pdfeditor.text.AdjustAction;
import lib.zj.pdfeditor.text.AdjustActionInfo;
import lib.zj.pdfeditor.text.PDFFreeTextEditView;
import lib.zj.pdfeditor.text.editor.EditorAlignCheck;
import lib.zj.pdfeditor.text.editor.EditorView;
import lib.zj.pdfeditor.text.editor.TextEditorState;
import mj.f;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewAddTextDialog;

/* loaded from: classes3.dex */
public class PDFPageView extends PageView implements a0, mj.b0 {

    /* renamed from: y1  reason: collision with root package name */
    public static final /* synthetic */ int f21175y1 = 0;
    public final WeakReference<lib.zj.pdfeditor.d> F0;
    public ReaderPDFCore G0;
    public RectF[] H0;
    public volatile Annotation[] I0;
    public int J0;
    public final WeakReference<AlertDialog> K0;
    public final EditText L0;
    public final WeakReference<EditText> M0;
    public AsyncTask<String, Void, Void> N0;
    public Runnable O0;
    public final Context P0;

    /* renamed from: c1  reason: collision with root package name */
    public ArrayList<lj.a> f21176c1;

    /* renamed from: i1  reason: collision with root package name */
    public ArrayList<lj.a> f21177i1;

    /* renamed from: j1  reason: collision with root package name */
    public ArrayList<lj.a> f21178j1;

    /* renamed from: k1  reason: collision with root package name */
    public long f21179k1;

    /* renamed from: l1  reason: collision with root package name */
    public final lib.zj.pdfeditor.text.editor.a f21180l1;

    /* renamed from: m1  reason: collision with root package name */
    public final mj.i f21181m1;

    /* renamed from: n1  reason: collision with root package name */
    public final Paint f21182n1;

    /* renamed from: o1  reason: collision with root package name */
    public final Paint f21183o1;

    /* renamed from: p1  reason: collision with root package name */
    public final Paint f21184p1;
    public final Paint q1;

    /* renamed from: r1  reason: collision with root package name */
    public final Paint f21185r1;

    /* renamed from: s1  reason: collision with root package name */
    public final float[] f21186s1;

    /* renamed from: t1  reason: collision with root package name */
    public volatile boolean f21187t1;

    /* renamed from: u1  reason: collision with root package name */
    public volatile boolean f21188u1;

    /* renamed from: v1  reason: collision with root package name */
    public final Paint f21189v1;

    /* renamed from: w1  reason: collision with root package name */
    public final j f21190w1;

    /* renamed from: x1  reason: collision with root package name */
    public int f21191x1;

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f21192a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f21193b;

        /* renamed from: lib.zj.pdfeditor.PDFPageView$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0282a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g0 f21194a;

            /* renamed from: lib.zj.pdfeditor.PDFPageView$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0283a extends androidx.fragment.app.w {
                public C0283a() {
                }

                public final void J(h0 h0Var) {
                    PDFPageView pDFPageView = PDFPageView.this;
                    String[] strArr = h0Var.f21500b;
                    int i10 = PDFPageView.f21175y1;
                    if (pDFPageView.p2()) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(pDFPageView.P0);
                        builder.setTitle(pDFPageView.getContext().getString(R.string.arg_res_0x7f1300ae));
                        builder.setItems(strArr, new r(pDFPageView, strArr));
                        builder.create().show();
                    }
                }

                public final void K(i0 i0Var) {
                    int i10 = k.f21219b[i0Var.f21509b.ordinal()];
                    RunnableC0282a runnableC0282a = RunnableC0282a.this;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                PDFPageView pDFPageView = PDFPageView.this;
                                int i11 = PDFPageView.f21175y1;
                                if (pDFPageView.p2()) {
                                    s sVar = new s(pDFPageView);
                                    pDFPageView.getClass();
                                    sVar.c(new Void[0]);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        PDFPageView pDFPageView2 = PDFPageView.this;
                        int i12 = PDFPageView.f21175y1;
                        if (pDFPageView2.p2()) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(pDFPageView2.P0);
                            builder.setTitle("Select certificate and sign?");
                            builder.setNegativeButton(R.string.arg_res_0x7f130374, new t());
                            builder.setPositiveButton(R.string.arg_res_0x7f1302e7, new u(pDFPageView2));
                            return;
                        }
                        return;
                    }
                    PDFPageView pDFPageView3 = PDFPageView.this;
                    int i13 = PDFPageView.f21175y1;
                    if (pDFPageView3.p2()) {
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(pDFPageView3.P0);
                        builder2.setTitle("Signature checked");
                        builder2.setPositiveButton(R.string.arg_res_0x7f1302e7, new lib.zj.pdfeditor.k());
                        AlertDialog create = builder2.create();
                        create.setTitle("App built with no signature support");
                        create.show();
                    }
                }

                public final void L(j0 j0Var) {
                    PDFPageView.d2(PDFPageView.this, j0Var.f21512b);
                }
            }

            public RunnableC0282a(g0 g0Var) {
                this.f21194a = g0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g0 g0Var = this.f21194a;
                if (g0Var.f21497a) {
                    PDFPageView.this.O0.run();
                }
                g0Var.a(new C0283a());
            }
        }

        public a(float f10, float f11) {
            this.f21192a = f10;
            this.f21193b = f11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g0 g0Var;
            PDFPageView pDFPageView = PDFPageView.this;
            try {
                g0Var = pDFPageView.G0.passClickEvent(pDFPageView.c, this.f21192a, this.f21193b);
            } catch (Exception e10) {
                e10.printStackTrace();
                g0Var = null;
            }
            if (pDFPageView.getActivity() != null && g0Var != null) {
                pDFPageView.getActivity().runOnUiThread(new RunnableC0282a(g0Var));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements s0 {

        /* renamed from: a  reason: collision with root package name */
        public RectF f21197a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f21198b;

        public b(ArrayList arrayList) {
            this.f21198b = arrayList;
        }

        @Override // lib.zj.pdfeditor.s0
        public final void a() {
            if (!this.f21197a.isEmpty()) {
                RectF rectF = this.f21197a;
                PointF pointF = new PointF(rectF.left, rectF.bottom);
                ArrayList arrayList = this.f21198b;
                arrayList.add(pointF);
                RectF rectF2 = this.f21197a;
                arrayList.add(new PointF(rectF2.right, rectF2.bottom));
                RectF rectF3 = this.f21197a;
                arrayList.add(new PointF(rectF3.right, rectF3.top));
                RectF rectF4 = this.f21197a;
                arrayList.add(new PointF(rectF4.left, rectF4.top));
            }
        }

        @Override // lib.zj.pdfeditor.s0
        public final void b(TextChar textChar) {
            this.f21197a.union(textChar);
        }

        @Override // lib.zj.pdfeditor.s0
        public final void c() {
            this.f21197a = new RectF();
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f21199a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Annotation.Type f21200b;
        public final /* synthetic */ RectF c;

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                PDFPageView.this.G();
            }
        }

        public c(ArrayList arrayList, Annotation.Type type, RectF rectF) {
            this.f21199a = arrayList;
            this.f21200b = type;
            this.c = rectF;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PDFPageView pDFPageView = PDFPageView.this;
            try {
                ArrayList arrayList = this.f21199a;
                Annotation.Type type = this.f21200b;
                RectF rectF = this.c;
                pDFPageView.G0.addMarkupAnnotation(pDFPageView.c, (PointF[]) arrayList.toArray(new PointF[arrayList.size()]), type, rectF);
                if (pDFPageView.getActivity() != null) {
                    pDFPageView.getActivity().runOnUiThread(new a());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f21203a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Annotation[] f21204b;

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                PDFPageView.this.G();
            }
        }

        public d(int i10, Annotation[] annotationArr) {
            this.f21203a = i10;
            this.f21204b = annotationArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ij.b bVar;
            PDFPageView pDFPageView = PDFPageView.this;
            int i10 = this.f21203a;
            if (i10 != -1) {
                try {
                    Annotation[] annotationArr = this.f21204b;
                    if (annotationArr != null) {
                        if (i10 >= 0 && i10 < annotationArr.length) {
                            Annotation annotation = annotationArr[i10];
                            if (annotation.type == Annotation.Type.STAMP) {
                                ReaderPDFCore.getPageStampAnnotMap().remove(Integer.valueOf(pDFPageView.c));
                                ReaderPDFCore.getSavedPageStampAnnotMap().remove(Integer.valueOf(pDFPageView.c));
                            }
                            bVar = pDFPageView.G0.getSelectAnnotRectF(annotation.type, annotation);
                        } else {
                            bVar = null;
                        }
                        pDFPageView.G0.deleteAnnotation(pDFPageView.c, i10, bVar);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            if (pDFPageView.getActivity() != null) {
                pDFPageView.getActivity().runOnUiThread(new a());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f21206a;

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                PDFPageView.this.q1();
            }
        }

        public e(int i10) {
            this.f21206a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = this.f21206a;
            PDFPageView pDFPageView = PDFPageView.this;
            try {
                pDFPageView.H0 = pDFPageView.G0.getWidgetAreas(i10);
                PDFPageView.e2(pDFPageView);
                if (pDFPageView.c == i10) {
                    pDFPageView.getActivity().runOnUiThread(new a());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    public class g implements DialogInterface.OnClickListener {

        /* loaded from: classes3.dex */
        public class a implements Runnable {

            /* renamed from: lib.zj.pdfeditor.PDFPageView$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class RunnableC0284a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ EditText f21211a;

                public RunnableC0284a(EditText editText) {
                    this.f21211a = editText;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PDFPageView.d2(PDFPageView.this, this.f21211a.getText().toString());
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                g gVar = g.this;
                try {
                    WeakReference<EditText> weakReference = PDFPageView.this.M0;
                    if (weakReference != null && weakReference.get() != null) {
                        EditText editText = PDFPageView.this.M0.get();
                        PDFPageView pDFPageView = PDFPageView.this;
                        boolean focusedWidgetText = pDFPageView.G0.setFocusedWidgetText(pDFPageView.c, editText.getText().toString());
                        WeakReference<Context> weakReference2 = PDFPageView.this.f21267a0;
                        if (weakReference2 == null) {
                            return;
                        }
                        Context context = weakReference2.get();
                        if (!focusedWidgetText && (context instanceof Activity)) {
                            ((Activity) context).runOnUiThread(new RunnableC0284a(editText));
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }

        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            ng.d.f22480a.execute(new a());
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PDFFreeTextEditView f21213a;

        public h(PDFFreeTextEditView pDFFreeTextEditView) {
            this.f21213a = pDFFreeTextEditView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PDFPageView.f2(PDFPageView.this, this.f21213a);
        }
    }

    /* loaded from: classes3.dex */
    public class i implements PDFFreeTextEditView.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PDFFreeTextEditView f21215a;

        public i(PDFFreeTextEditView pDFFreeTextEditView) {
            this.f21215a = pDFFreeTextEditView;
        }

        public final void a() {
            long currentTimeMillis = System.currentTimeMillis();
            PDFPageView pDFPageView = PDFPageView.this;
            if (currentTimeMillis - pDFPageView.f21179k1 >= 200) {
                PDFReaderView.Mode readerMode = pDFPageView.getReaderMode();
                PDFReaderView.Mode mode = PDFReaderView.Mode.AdjustText;
                if (readerMode != mode && readerMode != PDFReaderView.Mode.AddText && readerMode != PDFReaderView.Mode.Editor) {
                    return;
                }
                PDFPageView.this.f21179k1 = System.currentTimeMillis();
                PDFPageView pDFPageView2 = PDFPageView.this;
                pDFPageView2.G0.updateCurEditPDFPageView(pDFPageView2);
                if (PDFPageView.this.B.contains(this.f21215a)) {
                    PDFPageView.this.B.remove(this.f21215a);
                    PDFPageView.this.B.add(this.f21215a);
                }
                lj.b textParamChangedListener = PDFPageView.this.getTextParamChangedListener();
                PDFPageView pDFPageView3 = PDFPageView.this;
                PDFFreeTextEditView pDFFreeTextEditView = pDFPageView3.A;
                if (pDFFreeTextEditView == null) {
                    PDFFreeTextEditView pDFFreeTextEditView2 = this.f21215a;
                    pDFPageView3.A = pDFFreeTextEditView2;
                    if (textParamChangedListener != null) {
                        ((i2) textParamChangedListener).e(pDFFreeTextEditView2.getTextColor(), this.f21215a.getOriginFontSize());
                    }
                } else if (pDFFreeTextEditView.get_id() != this.f21215a.get_id()) {
                    PDFPageView.this.A.setShowBox(false);
                    PDFPageView pDFPageView4 = PDFPageView.this;
                    PDFFreeTextEditView pDFFreeTextEditView3 = this.f21215a;
                    pDFPageView4.A = pDFFreeTextEditView3;
                    if (textParamChangedListener != null) {
                        ((i2) textParamChangedListener).a(pDFFreeTextEditView3.getTextColor(), this.f21215a.getOriginFontSize());
                    }
                } else {
                    PDFFreeTextEditView pDFFreeTextEditView4 = PDFPageView.this.A;
                    if (pDFFreeTextEditView4.f21608b0) {
                        if (textParamChangedListener != null) {
                            long j10 = pDFFreeTextEditView4.get_id();
                            String content = PDFPageView.this.A.getText();
                            PDFPageView pDFPageView5 = PDFPageView.this;
                            i2 i2Var = (i2) textParamChangedListener;
                            ReaderPreviewActivity readerPreviewActivity = i2Var.f5074a;
                            if (readerPreviewActivity.f26277w2) {
                                readerPreviewActivity.L4();
                            } else {
                                readerPreviewActivity.f26276w1.m0(false);
                                if (readerPreviewActivity.f26276w1.getMode() == PDFReaderView.Mode.AddText) {
                                    readerPreviewActivity.f26276w1.setMode(mode);
                                }
                                if (readerPreviewActivity.P != null) {
                                    readerPreviewActivity.w3(true);
                                }
                                ViewGroup viewGroup = readerPreviewActivity.V3;
                                if (viewGroup != null) {
                                    viewGroup.setVisibility(8);
                                }
                                readerPreviewActivity.f26205k1 = pDFPageView5;
                                ReaderPreviewActivity readerPreviewActivity2 = i2Var.f5074a;
                                PreviewAddTextDialog previewAddTextDialog = new PreviewAddTextDialog(readerPreviewActivity2, readerPreviewActivity2.U3, readerPreviewActivity2.f26234p0, readerPreviewActivity2.f26240q0);
                                readerPreviewActivity.f26199j1 = previewAddTextDialog;
                                previewAddTextDialog.f27457i = readerPreviewActivity;
                                readerPreviewActivity.f26199j1.setOnDismissListener(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.z(i2Var, 1));
                                ReaderPreviewActivity.i4(ea.a.p("O2VJdA==", "8gjj2dI1"));
                                readerPreviewActivity.r3(false, false);
                                if (TextUtils.isEmpty(content)) {
                                    readerPreviewActivity.f26199j1.show();
                                } else {
                                    PreviewAddTextDialog previewAddTextDialog2 = readerPreviewActivity.f26199j1;
                                    previewAddTextDialog2.getClass();
                                    kotlin.jvm.internal.g.e(content, "content");
                                    previewAddTextDialog2.f27459k = j10;
                                    previewAddTextDialog2.f27460l = content;
                                    previewAddTextDialog2.show();
                                    EditText editText = previewAddTextDialog2.p().c;
                                    editText.setText(content);
                                    editText.setSelection(editText.length());
                                }
                            }
                            PDFPageView.this.A.setShowBox(false);
                            PDFPageView.this.A.setVisibility(8);
                        }
                    } else if (textParamChangedListener != null) {
                        ((i2) textParamChangedListener).a(this.f21215a.getTextColor(), this.f21215a.getOriginFontSize());
                    }
                }
                PDFPageView.this.A.setShowBox(true);
                PDFPageView.this.A.bringToFront();
                ViewParent parent = PDFPageView.this.getParent();
                if (parent instanceof PDFReaderView) {
                    ((PDFReaderView) parent).a1();
                }
            }
        }

        public final void b() {
            lj.b textParamChangedListener = PDFPageView.this.getTextParamChangedListener();
            if (textParamChangedListener != null) {
                ((i2) textParamChangedListener).b();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j10;
            PDFPageView.this.f21188u1 = !PDFPageView.this.f21188u1;
            PDFPageView.this.invalidate();
            PDFPageView pDFPageView = PDFPageView.this;
            pDFPageView.G.removeCallbacks(pDFPageView.f21190w1);
            if (pDFPageView.f21187t1) {
                Handler handler = pDFPageView.G;
                j jVar = pDFPageView.f21190w1;
                if (pDFPageView.f21188u1) {
                    j10 = 650;
                } else {
                    j10 = 500;
                }
                handler.postDelayed(jVar, j10);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class k {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21218a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f21219b;

        static {
            int[] iArr = new int[SignatureState.values().length];
            f21219b = iArr;
            try {
                iArr[SignatureState.NoSupport.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21219b[SignatureState.Unsigned.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21219b[SignatureState.Signed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Annotation.Type.values().length];
            f21218a = iArr2;
            try {
                iArr2[Annotation.Type.HIGHLIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21218a[Annotation.Type.UNDERLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21218a[Annotation.Type.STRIKEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21218a[Annotation.Type.SQUIGGLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21218a[Annotation.Type.FREETEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21218a[Annotation.Type.INK.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21218a[Annotation.Type.STAMP.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class l implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    public PDFPageView(Context context, lib.zj.pdfeditor.d dVar, ReaderPDFCore readerPDFCore, Point point, og.a aVar) {
        super(context, point, aVar);
        this.J0 = -1;
        lib.zj.pdfeditor.text.editor.a aVar2 = new lib.zj.pdfeditor.text.editor.a(this, this);
        this.f21180l1 = aVar2;
        this.f21181m1 = new mj.i(this, aVar2);
        Paint paint = new Paint(1);
        this.f21182n1 = paint;
        Paint paint2 = new Paint(1);
        this.f21183o1 = paint2;
        Paint paint3 = new Paint(1);
        this.f21184p1 = paint3;
        Paint paint4 = new Paint(1);
        this.q1 = paint4;
        Paint paint5 = new Paint(1);
        this.f21185r1 = paint5;
        this.f21186s1 = new float[24];
        Paint paint6 = new Paint(1);
        this.f21189v1 = paint6;
        this.f21190w1 = new j();
        this.P0 = context;
        boolean z10 = context instanceof Activity;
        S1();
        this.F0 = new WeakReference<>(dVar);
        this.G0 = readerPDFCore;
        aVar2.f21683d = readerPDFCore;
        Objects.toString(aVar2.f21680b);
        if (aVar2.f21685e >= 0) {
            aVar2.u(new mj.x(aVar2, aVar2.f21685e));
            aVar2.u(new mj.y(aVar2, aVar2.f21685e));
            aVar2.f21687f.invalidate();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(getContext().getString(R.string.arg_res_0x7f13015d));
        EditText editText = (EditText) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.textentry, (ViewGroup) null);
        this.L0 = editText;
        builder.setView(editText);
        builder.setNegativeButton(R.string.arg_res_0x7f130374, new f());
        this.M0 = new WeakReference<>(editText);
        builder.setPositiveButton(R.string.arg_res_0x7f1302e7, new g());
        this.K0 = new WeakReference<>(builder.create());
        EditText editText2 = new EditText(context);
        editText2.setInputType(128);
        editText2.setTransformationMethod(new PasswordTransformationMethod());
        new WeakReference(editText2);
        AlertDialog.Builder builder2 = new AlertDialog.Builder(context);
        builder2.setTitle(R.string.arg_res_0x7f130389);
        builder2.setView(editText2);
        builder2.setNegativeButton(R.string.arg_res_0x7f130374, new l());
        new WeakReference(builder2.create());
        paint.setColor(-3420975);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.dp_1));
        float[] fArr = {getResources().getDimensionPixelSize(R.dimen.dp_4), getResources().getDimensionPixelSize(R.dimen.dp_4)};
        paint.setPathEffect(new DashPathEffect(fArr, 0.0f));
        paint2.setColor(-2285526);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.dp_1));
        paint3.setColor(-1);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.dp_0_5));
        paint4.setColor(-2141034898);
        paint4.setStyle(Paint.Style.FILL);
        paint6.setColor(-65536);
        paint6.setStyle(Paint.Style.FILL_AND_STROKE);
        paint5.setColor(-2285526);
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.dp_1));
        paint5.setPathEffect(new DashPathEffect(fArr, 0.0f));
    }

    public static void Y1(PDFPageView pDFPageView, PDFFreeTextEditView pDFFreeTextEditView) {
        pDFPageView.getClass();
        if (pDFFreeTextEditView.isAttachedToWindow() && pDFFreeTextEditView.getVisibility() == 0 && pDFFreeTextEditView.f21608b0) {
            lj.b textParamChangedListener = pDFPageView.getTextParamChangedListener();
            int[] iArr = new int[2];
            pDFPageView.getLocationOnScreen(iArr);
            RectF frame = pDFFreeTextEditView.getFrame();
            frame.offset(iArr[0], iArr[1]);
            if (textParamChangedListener != null) {
                p pVar = new p(pDFPageView, pDFFreeTextEditView, textParamChangedListener);
                q qVar = new q(pDFPageView, pDFFreeTextEditView);
                ReaderPreviewActivity readerPreviewActivity = ((i2) textParamChangedListener).f5074a;
                readerPreviewActivity.M4 = pVar;
                readerPreviewActivity.N4 = qVar;
                if (readerPreviewActivity.Q2) {
                    ReaderPreviewActivity.n2(readerPreviewActivity, frame);
                }
            }
        }
    }

    public static void Z1(PDFPageView pDFPageView, PDFFreeTextEditView pDFFreeTextEditView, long j10) {
        if (pDFFreeTextEditView == null) {
            pDFPageView.getClass();
            return;
        }
        pDFPageView.getTextParamChangedListener();
        if (pDFPageView.G0 != null) {
            pDFPageView.G0.addTextAnnotation(pDFPageView.c, pDFFreeTextEditView, new AdjustActionInfo(pDFFreeTextEditView.get_id(), j10, pDFFreeTextEditView.getText(), pDFFreeTextEditView.getContentWithNewLine(), pDFFreeTextEditView.getOriginFontSize(), pDFFreeTextEditView.getTextColor(), pDFPageView.U1(pDFFreeTextEditView.getFrame()), pDFFreeTextEditView.getCopyRootParentId()), pDFPageView.f21275f, pDFPageView.f21277g);
        }
    }

    public static void d2(PDFPageView pDFPageView, String str) {
        if (pDFPageView.p2()) {
            pDFPageView.L0.setText(str);
            WeakReference<AlertDialog> weakReference = pDFPageView.K0;
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().getWindow().setSoftInputMode(5);
                weakReference.get().show();
            }
        }
    }

    public static void e2(PDFPageView pDFPageView) {
        Bitmap bitmap;
        lj.a translateFreeTextAnnotationData;
        pDFPageView.I0 = null;
        try {
            if (pDFPageView.C != null) {
                pDFPageView.C.clear();
            }
            pDFPageView.I0 = pDFPageView.G0.getAnnotations(pDFPageView.c);
            try {
                pDFPageView.r2();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (pDFPageView.r1()) {
                Annotation[] annotations = pDFPageView.G0.getAnnotations(pDFPageView.c, ReaderPDFCore.makeAnnotFlag(Annotation.Type.FREETEXT));
                int pageRotate = pDFPageView.G0.getPageRotate(pDFPageView.c);
                if (annotations != null) {
                    if (pDFPageView.C == null) {
                        pDFPageView.C = new ArrayList<>();
                    }
                    int i10 = 0;
                    for (Annotation annotation : annotations) {
                        Object data = annotation.getData(Annotation.KEY_ANNOT_TEXT_CONTENTS);
                        Object data2 = annotation.getData(Annotation.KEY_ANNOT_TEXT_SIZE);
                        Object data3 = annotation.getData(Annotation.KEY_ANNOT_COLOR);
                        Object data4 = annotation.getData(Annotation.KEY_ANNOT_BMP);
                        Object data5 = annotation.getData(Annotation.KEY_ANNOT_ROTATE);
                        if ((data instanceof String) && (data3 instanceof Integer) && (data2 instanceof Float)) {
                            lj.a aVar = new lj.a();
                            aVar.f21755i = ((Integer) data5).intValue();
                            aVar.f21754h = pageRotate;
                            aVar.f21750d = (String) data;
                            aVar.f21749b = (Integer) data3;
                            aVar.c = (Float) data2;
                            if (data4 instanceof Bitmap) {
                                bitmap = (Bitmap) data4;
                            } else {
                                bitmap = null;
                            }
                            aVar.f21748a = bitmap;
                            aVar.f21751e = new RectF(annotation);
                            ReaderPDFCore readerPDFCore = pDFPageView.G0;
                            if (readerPDFCore != null && (translateFreeTextAnnotationData = readerPDFCore.getTranslateFreeTextAnnotationData(pDFPageView.getPage(), i10, aVar)) != null) {
                                aVar.f21752f = translateFreeTextAnnotationData.f21752f;
                            }
                            pDFPageView.C.add(aVar);
                        }
                        i10++;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static void f2(PDFPageView pDFPageView, PDFFreeTextEditView pDFFreeTextEditView) {
        pDFPageView.getClass();
        if (pDFFreeTextEditView != null) {
            pDFPageView.post(new f0.s(17, pDFPageView, pDFFreeTextEditView));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity getActivity() {
        Activity activity;
        Context context = this.P0;
        if (context != null && (context instanceof Activity)) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        S1();
        return activity;
    }

    private int getEditClickSize() {
        int i10 = this.f21191x1;
        if (i10 != 0) {
            return i10;
        }
        int e12 = PageView.e1(getContext(), 45.0f);
        this.f21191x1 = e12;
        return e12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PDFReaderView.Mode getReaderMode() {
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            return ((PDFReaderView) parent).getMode();
        }
        return PDFReaderView.Mode.Viewing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public lj.b getTextParamChangedListener() {
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            return ((PDFReaderView) parent).getOnTextParamChangedListener();
        }
        return null;
    }

    @Override // lib.zj.pdfeditor.a0
    public final void A(String str, int i10, int i11, lj.c cVar, long j10, float f10, float f11) {
        if (j10 > 0) {
            PDFFreeTextEditView pDFFreeTextEditView = null;
            if (str.isEmpty()) {
                Iterator it = this.B.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    PDFFreeTextEditView pDFFreeTextEditView2 = (PDFFreeTextEditView) it.next();
                    if (pDFFreeTextEditView2.get_id() == j10) {
                        pDFFreeTextEditView = pDFFreeTextEditView2;
                        break;
                    }
                }
                if (pDFFreeTextEditView != null) {
                    l2(pDFFreeTextEditView);
                    return;
                }
                return;
            }
            if (this.A == null) {
                Iterator it2 = this.B.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    PDFFreeTextEditView pDFFreeTextEditView3 = (PDFFreeTextEditView) it2.next();
                    if (pDFFreeTextEditView3.get_id() == j10) {
                        this.A = pDFFreeTextEditView3;
                        pDFFreeTextEditView3.setShowBox(true);
                        pDFFreeTextEditView3.bringToFront();
                        lj.b textParamChangedListener = getTextParamChangedListener();
                        if (textParamChangedListener != null) {
                            ((i2) textParamChangedListener).e(i10, pDFFreeTextEditView3.getOriginFontSize());
                        }
                    }
                }
            }
            PDFFreeTextEditView pDFFreeTextEditView4 = this.A;
            if (pDFFreeTextEditView4 != null) {
                if (!TextUtils.equals(pDFFreeTextEditView4.getText(), str)) {
                    g2(this.A, AdjustAction.AdjustContent, null);
                } else if (i10 != this.A.getTextColor()) {
                    g2(this.A, AdjustAction.TextColor, null);
                }
                this.A.setCopyParam(null);
                this.A.setText(str);
                this.A.setTextColor(i10);
                this.A.setVisibility(0);
                return;
            }
            return;
        }
        PDFFreeTextEditView pDFFreeTextEditView5 = new PDFFreeTextEditView(getContext());
        pDFFreeTextEditView5.set_id(System.currentTimeMillis());
        pDFFreeTextEditView5.setText(str);
        pDFFreeTextEditView5.setTextColor(i10);
        pDFFreeTextEditView5.setFontSize(i11);
        pDFFreeTextEditView5.setPadding(0, 0, 0, 0);
        Rect rect = new Rect();
        getLocalVisibleRect(rect);
        pDFFreeTextEditView5.setVisibleRect(rect);
        if (cVar != null) {
            pDFFreeTextEditView5.setCopyParam(cVar);
            pDFFreeTextEditView5.setCopyRootParentId(cVar.c);
        }
        o2(pDFFreeTextEditView5);
        addView(pDFFreeTextEditView5, new ViewGroup.LayoutParams(-1, -1));
        if (cVar == null) {
            AdjustActionInfo adjustActionInfo = new AdjustActionInfo(pDFFreeTextEditView5.get_id(), AdjustAction.Add, pDFFreeTextEditView5.getText(), pDFFreeTextEditView5.getContentWithNewLine(), pDFFreeTextEditView5.getOriginFontSize(), pDFFreeTextEditView5.getTextColor(), pDFFreeTextEditView5.getFrame(), pDFFreeTextEditView5.getCopyRootParentId());
            adjustActionInfo.initX = f10;
            adjustActionInfo.initY = f11;
            this.G0.addTextAnnotation(this.c, pDFFreeTextEditView5, adjustActionInfo, this.f21275f, this.f21277g);
            pDFFreeTextEditView5.setCopyRootParentId(pDFFreeTextEditView5.get_id());
        }
        this.B.add(pDFFreeTextEditView5);
        t2(pDFFreeTextEditView5.getCopyRootParentId());
        lj.b textParamChangedListener2 = getTextParamChangedListener();
        PDFFreeTextEditView pDFFreeTextEditView6 = this.A;
        if (pDFFreeTextEditView6 == null) {
            this.A = pDFFreeTextEditView5;
            if (textParamChangedListener2 != null) {
                ((i2) textParamChangedListener2).e(pDFFreeTextEditView5.getTextColor(), pDFFreeTextEditView5.getOriginFontSize());
            }
        } else {
            pDFFreeTextEditView6.setShowBox(false);
            this.A = pDFFreeTextEditView5;
            if (textParamChangedListener2 != null) {
                ((i2) textParamChangedListener2).a(pDFFreeTextEditView5.getTextColor(), pDFFreeTextEditView5.getOriginFontSize());
            }
        }
        this.A.setShowBox(true);
        this.A.bringToFront();
        if (textParamChangedListener2 != null) {
            this.B.size();
        }
    }

    public final void A2(ij.b bVar) {
        AdjustActionInfo adjustActionInfo;
        AdjustActionInfo adjustActionInfo2;
        PDFFreeTextEditView pDFFreeTextEditView;
        AdjustActionInfo adjustActionInfo3 = bVar.f18522f;
        if (adjustActionInfo3 == null) {
            return;
        }
        if (adjustActionInfo3.getAction() == AdjustAction.Delete) {
            z2(adjustActionInfo3, bVar.f18523g);
            w2(adjustActionInfo3);
            ReaderPDFCore readerPDFCore = this.G0;
            if (readerPDFCore != null) {
                readerPDFCore.addUndoEditActionList(this.c, bVar);
            }
        } else if (this.B.isEmpty()) {
            AdjustAction action = adjustActionInfo3.getAction();
            AdjustAction adjustAction = AdjustAction.Copy;
            if (action != adjustAction && adjustActionInfo3.getAction() != AdjustAction.Add) {
                if (adjustActionInfo3.getAction() == AdjustAction.Saved) {
                    ReaderPDFCore readerPDFCore2 = this.G0;
                    if (readerPDFCore2 != null) {
                        readerPDFCore2.addUndoEditActionList(this.c, bVar);
                    }
                    PDFFreeTextEditView pDFFreeTextEditView2 = bVar.f18523g;
                    if (pDFFreeTextEditView2 != null) {
                        pDFFreeTextEditView2.setShowBox(false);
                    }
                } else if (this.G0 != null && (pDFFreeTextEditView = bVar.f18523g) != null) {
                    this.G0.addUndoEditActionList(bVar.f18518a, new ij.b(Annotation.Type.FREETEXT, bVar.f18523g, new AdjustActionInfo(pDFFreeTextEditView.get_id(), adjustActionInfo3.getAction(), bVar.f18523g.getText(), bVar.f18523g.getContentWithNewLine(), bVar.f18523g.getOriginFontSize(), bVar.f18523g.getTextColor(), U1(bVar.f18523g.getFrame()), bVar.f18523g.getCopyRootParentId()), bVar.f18524h, bVar.f18525i));
                    bVar.f18523g.m(adjustActionInfo3.getTextContent(), adjustActionInfo3.getTextWithNewLine(), adjustActionInfo3.getTextSize(), adjustActionInfo3.getTextColor(), I1(adjustActionInfo3.getLocation()));
                }
            } else if (this.G0 != null && bVar.f18523g != null) {
                if (adjustActionInfo3.getAction() == adjustAction) {
                    adjustActionInfo2 = new AdjustActionInfo(bVar.f18523g.get_id(), adjustActionInfo3.getParentId(), bVar.f18523g.getText(), bVar.f18523g.getContentWithNewLine(), bVar.f18523g.getOriginFontSize(), bVar.f18523g.getTextColor(), U1(bVar.f18523g.getFrame()), bVar.f18523g.getCopyRootParentId());
                } else {
                    adjustActionInfo2 = new AdjustActionInfo(bVar.f18523g.get_id(), adjustActionInfo3.getAction(), bVar.f18523g.getText(), bVar.f18523g.getContentWithNewLine(), bVar.f18523g.getOriginFontSize(), bVar.f18523g.getTextColor(), U1(bVar.f18523g.getFrame()), bVar.f18523g.getCopyRootParentId());
                }
                this.G0.addUndoEditActionList(bVar.f18518a, new ij.b(Annotation.Type.FREETEXT, bVar.f18523g, adjustActionInfo2, bVar.f18524h, bVar.f18525i));
            }
        } else {
            long parentId = adjustActionInfo3.getParentId();
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                PDFFreeTextEditView pDFFreeTextEditView3 = (PDFFreeTextEditView) it.next();
                if (pDFFreeTextEditView3.get_id() == adjustActionInfo3.getId()) {
                    AdjustAction action2 = adjustActionInfo3.getAction();
                    AdjustAction adjustAction2 = AdjustAction.Copy;
                    if (action2 != adjustAction2 && adjustActionInfo3.getAction() != AdjustAction.Add) {
                        if (adjustActionInfo3.getAction() == AdjustAction.Saved) {
                            ReaderPDFCore readerPDFCore3 = this.G0;
                            if (readerPDFCore3 != null) {
                                readerPDFCore3.addUndoEditActionList(this.c, bVar);
                            }
                            pDFFreeTextEditView3.setShowBox(false);
                            return;
                        }
                        lj.b textParamChangedListener = getTextParamChangedListener();
                        if (this.G0 != null) {
                            this.G0.addUndoEditActionList(this.c, new ij.b(Annotation.Type.FREETEXT, pDFFreeTextEditView3, new AdjustActionInfo(pDFFreeTextEditView3.get_id(), adjustActionInfo3.getAction(), pDFFreeTextEditView3.getText(), pDFFreeTextEditView3.getContentWithNewLine(), pDFFreeTextEditView3.getOriginFontSize(), pDFFreeTextEditView3.getTextColor(), U1(pDFFreeTextEditView3.getFrame()), pDFFreeTextEditView3.getCopyRootParentId()), this.f21275f, this.f21277g));
                        }
                        pDFFreeTextEditView3.m(adjustActionInfo3.getTextContent(), adjustActionInfo3.getTextWithNewLine(), adjustActionInfo3.getTextSize(), adjustActionInfo3.getTextColor(), I1(adjustActionInfo3.getLocation()));
                        PDFFreeTextEditView pDFFreeTextEditView4 = this.A;
                        if (pDFFreeTextEditView4 == null) {
                            this.A = pDFFreeTextEditView3;
                            if (textParamChangedListener != null) {
                                ((i2) textParamChangedListener).e(pDFFreeTextEditView3.getTextColor(), pDFFreeTextEditView3.getOriginFontSize());
                            }
                        } else {
                            pDFFreeTextEditView4.setShowBox(false);
                            this.A = pDFFreeTextEditView3;
                            if (textParamChangedListener != null) {
                                ((i2) textParamChangedListener).a(pDFFreeTextEditView3.getTextColor(), pDFFreeTextEditView3.getOriginFontSize());
                            }
                        }
                        w2(adjustActionInfo3);
                        return;
                    }
                    if (this.G0 != null) {
                        if (adjustActionInfo3.getAction() == adjustAction2) {
                            adjustActionInfo = new AdjustActionInfo(pDFFreeTextEditView3.get_id(), parentId, pDFFreeTextEditView3.getText(), pDFFreeTextEditView3.getContentWithNewLine(), pDFFreeTextEditView3.getOriginFontSize(), pDFFreeTextEditView3.getTextColor(), U1(pDFFreeTextEditView3.getFrame()), pDFFreeTextEditView3.getCopyRootParentId());
                        } else {
                            adjustActionInfo = new AdjustActionInfo(pDFFreeTextEditView3.get_id(), adjustActionInfo3.getAction(), pDFFreeTextEditView3.getText(), pDFFreeTextEditView3.getContentWithNewLine(), pDFFreeTextEditView3.getOriginFontSize(), pDFFreeTextEditView3.getTextColor(), U1(pDFFreeTextEditView3.getFrame()), pDFFreeTextEditView3.getCopyRootParentId());
                        }
                        this.G0.addUndoEditActionList(this.c, new ij.b(Annotation.Type.FREETEXT, pDFFreeTextEditView3, adjustActionInfo, this.f21275f, this.f21277g));
                    }
                    k2(pDFFreeTextEditView3);
                    return;
                }
            }
        }
    }

    @Override // mj.b0
    public final void B() {
        j2(new ha.n(11));
    }

    @Override // mj.b0
    public final void C() {
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            ((PDFReaderView) parent).C();
        }
    }

    @Override // lib.zj.pdfeditor.a0
    public final void E() {
        PDFFreeTextEditView pDFFreeTextEditView = this.A;
        if (pDFFreeTextEditView != null) {
            pDFFreeTextEditView.A0.set(pDFFreeTextEditView.C);
            pDFFreeTextEditView.f21616g = pDFFreeTextEditView.f21614f;
        }
    }

    @Override // mj.b0
    public final void F() {
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            ((PDFReaderView) parent).F();
        }
    }

    @Override // lib.zj.pdfeditor.PageView
    public final void J1() {
        if (this.f21180l1.f21680b == TextEditorState.ADJUST_IMAGE) {
            this.f21180l1.G(-90.0f);
        }
    }

    @Override // lib.zj.pdfeditor.PageView
    public final void K1() {
        if (this.f21180l1.f21680b == TextEditorState.ADJUST_IMAGE) {
            this.f21180l1.G(90.0f);
        }
    }

    @Override // lib.zj.pdfeditor.PageView
    public final void L0() {
        ReaderPDFCore readerPDFCore = this.G0;
        if (readerPDFCore != null) {
            readerPDFCore.addFunctions("copy1");
        }
    }

    @Override // lib.zj.pdfeditor.PageView
    public final void M0(ij.a aVar) {
        if (aVar == null) {
            return;
        }
        this.G0.addInkAnnotation(this.c, aVar);
    }

    @Override // lib.zj.pdfeditor.PageView
    public final void O1(int i10, PointF pointF, float f10, boolean z10) {
        ng.d.f22480a.execute(new e(i10));
        super.O1(i10, pointF, f10, z10);
        if (getReaderMode() == PDFReaderView.Mode.Editor) {
            this.f21180l1.L(this.c);
        }
    }

    @Override // lib.zj.pdfeditor.PageView
    public final void U0() {
        if (this.f21180l1.f21680b == TextEditorState.ADJUST_TEXT_BLOCK) {
            lib.zj.pdfeditor.text.editor.a aVar = this.f21180l1;
            aVar.getClass();
            aVar.u(new mj.s(aVar));
        } else if (this.f21180l1.f21680b == TextEditorState.SELECT_TEXT) {
            lib.zj.pdfeditor.text.editor.a aVar2 = this.f21180l1;
            aVar2.getClass();
            aVar2.u(new mj.t(aVar2));
        }
    }

    @Override // lib.zj.pdfeditor.PageView
    public final void V0() {
        if (this.f21180l1.f21680b == TextEditorState.ADJUST_IMAGE) {
            lib.zj.pdfeditor.text.editor.a aVar = this.f21180l1;
            int i10 = aVar.f21685e;
            mj.e eVar = aVar.f21699q;
            aVar.E();
            aVar.u(new mj.p(aVar, i10, eVar));
        }
    }

    @Override // lib.zj.pdfeditor.PageView
    public final void W0() {
        if (this.f21180l1.f21680b == TextEditorState.ADJUST_TEXT_BLOCK) {
            lib.zj.pdfeditor.text.editor.a aVar = this.f21180l1;
            int i10 = aVar.f21685e;
            mj.a aVar2 = aVar.f21698p;
            aVar.D();
            aVar.g(TextEditorState.NONE);
            aVar.f21687f.invalidate();
            aVar.u(new mj.r(aVar, i10, aVar2));
        } else if (this.f21180l1.f21680b == TextEditorState.SELECT_TEXT) {
            lib.zj.pdfeditor.text.editor.a aVar3 = this.f21180l1;
            aVar3.u(new mj.u(aVar3, aVar3.f21685e));
        }
    }

    @Override // lib.zj.pdfeditor.PageView
    public final void X0() {
        int i10 = this.J0;
        if (i10 != -1) {
            Annotation[] annotationArr = this.I0;
            if (annotationArr != null) {
                if (i10 >= 0 && i10 < annotationArr.length) {
                    Annotation.Type type = annotationArr[i10].type;
                }
                ng.d.f22480a.execute(new d(i10, annotationArr));
            }
            this.J0 = -1;
            setItemSelectBox(null);
            qg.c cVar = this.W;
            if (cVar != null) {
                cVar.b(this.c);
            }
        }
    }

    @Override // lib.zj.pdfeditor.PageView
    public final void X1(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            this.G0.updateInkAnnotation(this.c, arrayList);
        }
    }

    @Override // lib.zj.pdfeditor.PageView
    public final void Y0() {
        this.J0 = -1;
        setItemSelectBox(null);
    }

    @Override // mj.b0
    public final void a(RectF rectF) {
        j2(new d9.g(rectF, 9));
    }

    @Override // lib.zj.pdfeditor.PageView, lib.zj.pdfeditor.a0
    public final void b() {
        super.b();
    }

    @Override // mj.b0
    public final void c(ReaderPDFCore.SelectInfo selectInfo) {
        j2(new com.google.android.tools.d(selectInfo, 13));
    }

    @Override // mj.b0
    public final void d() {
        j2(new t5.g(12));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ReaderPDFCore readerPDFCore = this.G0;
        if (readerPDFCore != null && readerPDFCore.isSavingPdf()) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        RectF rectF;
        super.draw(canvas);
        if (getReaderMode() == PDFReaderView.Mode.Editor) {
            Bitmap bitmap = this.f21291n;
            if (bitmap != null && !bitmap.isRecycled()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                float editorScale = getEditorScale();
                this.q1.setColor(-2141034898);
                ArrayList<mj.a> arrayList = this.f21180l1.f21695m;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (mj.a aVar : arrayList) {
                        if (aVar != null && (rectF = aVar.f22045b) != null && !rectF.isEmpty()) {
                            if (aVar.f22046d) {
                                RectF rectF2 = aVar.f22045b;
                                float f10 = this.f21180l1.f21702t;
                                float[] fArr = this.f21186s1;
                                fArr[0] = rectF2.left * editorScale;
                                float f11 = rectF2.top * editorScale;
                                fArr[1] = f11;
                                float f12 = rectF2.right * editorScale;
                                fArr[2] = f12;
                                fArr[3] = f11;
                                fArr[4] = f12;
                                fArr[5] = f11;
                                fArr[6] = f12;
                                fArr[7] = (rectF2.centerY() * editorScale) - f10;
                                fArr[8] = rectF2.right * editorScale;
                                fArr[9] = (rectF2.centerY() * editorScale) + f10;
                                float f13 = rectF2.right * editorScale;
                                fArr[10] = f13;
                                float f14 = rectF2.bottom * editorScale;
                                fArr[11] = f14;
                                fArr[12] = f13;
                                fArr[13] = f14;
                                float f15 = rectF2.left * editorScale;
                                fArr[14] = f15;
                                fArr[15] = f14;
                                fArr[16] = f15;
                                fArr[17] = f14;
                                fArr[18] = f15;
                                fArr[19] = (rectF2.centerY() * editorScale) + f10;
                                fArr[20] = rectF2.left * editorScale;
                                fArr[21] = (rectF2.centerY() * editorScale) - f10;
                                fArr[22] = rectF2.left * editorScale;
                                fArr[23] = rectF2.top * editorScale;
                                canvas.drawLines(this.f21186s1, this.f21183o1);
                                RectF rectF3 = aVar.f22045b;
                                canvas.drawCircle(rectF3.left * editorScale, rectF3.centerY() * editorScale, this.f21180l1.f21702t, this.f21184p1);
                                RectF rectF4 = aVar.f22045b;
                                canvas.drawCircle(rectF4.right * editorScale, rectF4.centerY() * editorScale, this.f21180l1.f21702t, this.f21184p1);
                                RectF rectF5 = aVar.f22045b;
                                canvas.drawCircle(rectF5.left * editorScale, rectF5.centerY() * editorScale, this.f21180l1.f21702t, this.f21183o1);
                                RectF rectF6 = aVar.f22045b;
                                canvas.drawCircle(rectF6.right * editorScale, rectF6.centerY() * editorScale, this.f21180l1.f21702t, this.f21183o1);
                            } else {
                                RectF rectF7 = aVar.f22045b;
                                canvas.drawRect(rectF7.left * editorScale, rectF7.top * editorScale, rectF7.right * editorScale, rectF7.bottom * editorScale, this.f21182n1);
                            }
                        }
                    }
                    if (this.f21180l1.f21680b == TextEditorState.ADJUST_TEXT_BLOCK && !this.f21180l1.f21707y.isEmpty()) {
                        RectF rectF8 = this.f21180l1.f21707y;
                        canvas.drawRect(rectF8.left * editorScale, rectF8.top * editorScale, rectF8.right * editorScale, rectF8.bottom * editorScale, this.q1);
                        lib.zj.pdfeditor.text.editor.a aVar2 = this.f21180l1;
                        if (aVar2.f21704v) {
                            RectF rectF9 = aVar2.f21707y;
                            float f16 = rectF9.top * editorScale;
                            canvas.drawCircle(rectF9.left * editorScale, (((rectF9.bottom * editorScale) - f16) / 2.0f) + f16, getEditClickSize(), this.q1);
                        } else if (aVar2.f21705w) {
                            RectF rectF10 = aVar2.f21707y;
                            float f17 = rectF10.top * editorScale;
                            canvas.drawCircle(rectF10.right * editorScale, (((rectF10.bottom * editorScale) - f17) / 2.0f) + f17, getEditClickSize(), this.q1);
                        }
                    }
                }
                ArrayList<mj.e> arrayList2 = this.f21180l1.f21697o;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    for (mj.e eVar : arrayList2) {
                        if (eVar != null && !eVar.f22053b.isEmpty()) {
                            if (eVar.c) {
                                mj.f fVar = f.a.f22077a;
                                RectF rectF11 = eVar.f22053b;
                                float f18 = this.f21180l1.f21702t;
                                fVar.getClass();
                                float[] fArr2 = fVar.f22074t;
                                fArr2[0] = (rectF11.left * editorScale) + f18;
                                fArr2[1] = rectF11.top * editorScale;
                                fArr2[2] = (rectF11.centerX() * editorScale) - f18;
                                fArr2[3] = rectF11.top * editorScale;
                                fArr2[4] = (rectF11.centerX() * editorScale) + f18;
                                float f19 = rectF11.top * editorScale;
                                fArr2[5] = f19;
                                float f20 = rectF11.right * editorScale;
                                fArr2[6] = f20 - f18;
                                fArr2[7] = f19;
                                fArr2[8] = f20;
                                fArr2[9] = f19 + f18;
                                fArr2[10] = f20;
                                fArr2[11] = (rectF11.centerY() * editorScale) - f18;
                                fArr2[12] = rectF11.right * editorScale;
                                fArr2[13] = (rectF11.centerY() * editorScale) + f18;
                                float f21 = rectF11.right * editorScale;
                                fArr2[14] = f21;
                                float f22 = rectF11.bottom * editorScale;
                                fArr2[15] = f22 - f18;
                                fArr2[16] = f21 - f18;
                                fArr2[17] = f22;
                                fArr2[18] = (rectF11.centerX() * editorScale) + f18;
                                fArr2[19] = rectF11.bottom * editorScale;
                                fArr2[20] = (rectF11.centerX() * editorScale) - f18;
                                float f23 = rectF11.bottom * editorScale;
                                fArr2[21] = f23;
                                float f24 = rectF11.left * editorScale;
                                fArr2[22] = f24 + f18;
                                fArr2[23] = f23;
                                fArr2[24] = f24;
                                fArr2[25] = f23 - f18;
                                fArr2[26] = f24;
                                fArr2[27] = (rectF11.centerY() * editorScale) + f18;
                                fArr2[28] = rectF11.left * editorScale;
                                fArr2[29] = (rectF11.centerY() * editorScale) - f18;
                                fArr2[30] = rectF11.left * editorScale;
                                fArr2[31] = (rectF11.top * editorScale) + f18;
                                canvas.drawLines(fArr2, this.f21183o1);
                                RectF rectF12 = eVar.f22053b;
                                canvas.drawCircle(rectF12.left * editorScale, rectF12.top * editorScale, this.f21180l1.f21702t, this.f21184p1);
                                canvas.drawCircle(eVar.f22053b.centerX() * editorScale, eVar.f22053b.top * editorScale, this.f21180l1.f21702t, this.f21184p1);
                                RectF rectF13 = eVar.f22053b;
                                canvas.drawCircle(rectF13.right * editorScale, rectF13.top * editorScale, this.f21180l1.f21702t, this.f21184p1);
                                RectF rectF14 = eVar.f22053b;
                                canvas.drawCircle(rectF14.right * editorScale, rectF14.centerY() * editorScale, this.f21180l1.f21702t, this.f21184p1);
                                RectF rectF15 = eVar.f22053b;
                                canvas.drawCircle(rectF15.right * editorScale, rectF15.bottom * editorScale, this.f21180l1.f21702t, this.f21184p1);
                                canvas.drawCircle(eVar.f22053b.centerX() * editorScale, eVar.f22053b.bottom * editorScale, this.f21180l1.f21702t, this.f21184p1);
                                RectF rectF16 = eVar.f22053b;
                                canvas.drawCircle(rectF16.left * editorScale, rectF16.bottom * editorScale, this.f21180l1.f21702t, this.f21184p1);
                                RectF rectF17 = eVar.f22053b;
                                canvas.drawCircle(rectF17.left * editorScale, rectF17.centerY() * editorScale, this.f21180l1.f21702t, this.f21184p1);
                                RectF rectF18 = eVar.f22053b;
                                canvas.drawCircle(rectF18.left * editorScale, rectF18.top * editorScale, this.f21180l1.f21702t, this.f21183o1);
                                canvas.drawCircle(eVar.f22053b.centerX() * editorScale, eVar.f22053b.top * editorScale, this.f21180l1.f21702t, this.f21183o1);
                                RectF rectF19 = eVar.f22053b;
                                canvas.drawCircle(rectF19.right * editorScale, rectF19.top * editorScale, this.f21180l1.f21702t, this.f21183o1);
                                RectF rectF20 = eVar.f22053b;
                                canvas.drawCircle(rectF20.right * editorScale, rectF20.centerY() * editorScale, this.f21180l1.f21702t, this.f21183o1);
                                RectF rectF21 = eVar.f22053b;
                                canvas.drawCircle(rectF21.right * editorScale, rectF21.bottom * editorScale, this.f21180l1.f21702t, this.f21183o1);
                                canvas.drawCircle(eVar.f22053b.centerX() * editorScale, eVar.f22053b.bottom * editorScale, this.f21180l1.f21702t, this.f21183o1);
                                RectF rectF22 = eVar.f22053b;
                                canvas.drawCircle(rectF22.left * editorScale, rectF22.bottom * editorScale, this.f21180l1.f21702t, this.f21183o1);
                                RectF rectF23 = eVar.f22053b;
                                canvas.drawCircle(rectF23.left * editorScale, rectF23.centerY() * editorScale, this.f21180l1.f21702t, this.f21183o1);
                            } else {
                                RectF rectF24 = eVar.f22053b;
                                canvas.drawRect(rectF24.left * editorScale, rectF24.top * editorScale, rectF24.right * editorScale, rectF24.bottom * editorScale, this.f21182n1);
                            }
                        }
                    }
                    if (this.f21180l1.f21680b == TextEditorState.ADJUST_IMAGE) {
                        mj.f fVar2 = f.a.f22077a;
                        if (!fVar2.f22064j.isEmpty()) {
                            RectF rectF25 = fVar2.f22064j;
                            canvas.drawRect(rectF25.left * editorScale, rectF25.top * editorScale, rectF25.right * editorScale, rectF25.bottom * editorScale, this.q1);
                            if (fVar2.f22063i) {
                                RectF rectF26 = fVar2.f22064j;
                                float f25 = rectF26.top * editorScale;
                                canvas.drawCircle(rectF26.left * editorScale, (((rectF26.bottom * editorScale) - f25) / 2.0f) + f25, getEditClickSize(), this.q1);
                            } else if (fVar2.c) {
                                RectF rectF27 = fVar2.f22064j;
                                float f26 = rectF27.left * editorScale;
                                canvas.drawCircle((((rectF27.right * editorScale) - f26) / 2.0f) + f26, rectF27.top * editorScale, getEditClickSize(), this.q1);
                            } else if (fVar2.f22059e) {
                                RectF rectF28 = fVar2.f22064j;
                                float f27 = rectF28.top * editorScale;
                                canvas.drawCircle(rectF28.right * editorScale, (((rectF28.bottom * editorScale) - f27) / 2.0f) + f27, getEditClickSize(), this.q1);
                            } else if (fVar2.f22061g) {
                                RectF rectF29 = fVar2.f22064j;
                                float f28 = rectF29.left * editorScale;
                                canvas.drawCircle((((rectF29.right * editorScale) - f28) / 2.0f) + f28, rectF29.bottom * editorScale, getEditClickSize(), this.q1);
                            } else if (fVar2.f22057b) {
                                RectF rectF30 = fVar2.f22064j;
                                canvas.drawCircle(rectF30.left * editorScale, rectF30.top * editorScale, getEditClickSize(), this.q1);
                            } else if (fVar2.f22058d) {
                                RectF rectF31 = fVar2.f22064j;
                                canvas.drawCircle(rectF31.right * editorScale, rectF31.top * editorScale, getEditClickSize(), this.q1);
                            } else if (fVar2.f22060f) {
                                RectF rectF32 = fVar2.f22064j;
                                canvas.drawCircle(rectF32.right * editorScale, rectF32.bottom * editorScale, getEditClickSize(), this.q1);
                            } else if (fVar2.f22062h) {
                                RectF rectF33 = fVar2.f22064j;
                                canvas.drawCircle(rectF33.left * editorScale, rectF33.bottom * editorScale, getEditClickSize(), this.q1);
                            }
                        }
                    }
                }
                if (this.f21188u1) {
                    lib.zj.pdfeditor.text.editor.a aVar3 = this.f21180l1;
                    RectF rectF34 = aVar3.M;
                    if (!rectF34.isEmpty() && aVar3.N.isEmpty()) {
                        canvas.drawRect((rectF34.centerX() * editorScale) - (aVar3.E / 2.0f), rectF34.top * editorScale, (rectF34.centerX() * editorScale) + (aVar3.E / 2.0f), rectF34.bottom * editorScale, this.f21189v1);
                    }
                }
                lib.zj.pdfeditor.text.editor.a aVar4 = this.f21180l1;
                boolean isEmpty = aVar4.Q.isEmpty();
                Paint paint = this.f21189v1;
                if (isEmpty) {
                    if (!aVar4.P.isEmpty()) {
                        RectF rectF35 = aVar4.M;
                        boolean isEmpty2 = rectF35.isEmpty();
                        Path path = aVar4.L;
                        if (!isEmpty2) {
                            RectF rectF36 = aVar4.P;
                            rectF36.set((rectF35.centerX() * editorScale) - aVar4.H, (rectF35.bottom * editorScale) + aVar4.G, (rectF35.centerX() * editorScale) + aVar4.H, (rectF35.bottom * editorScale) + aVar4.G + aVar4.J);
                            aVar4.R.set((rectF35.centerX() * editorScale) - (aVar4.H * 1.5f), (rectF35.bottom * editorScale) + aVar4.G, ((aVar4.H / 2.0f) * 3.0f) + (rectF35.centerX() * editorScale), (aVar4.J * 1.5f) + (rectF35.bottom * editorScale) + aVar4.G);
                            path.reset();
                            path.moveTo(rectF36.centerX(), rectF36.top);
                            float centerX = rectF36.centerX();
                            float f29 = aVar4.K / 2.0f;
                            path.lineTo(centerX + f29, f29 + rectF36.top);
                            float centerX2 = rectF36.centerX();
                            float f30 = aVar4.K / 2.0f;
                            path.lineTo(centerX2 - f30, f30 + rectF36.top);
                            path.close();
                            float centerX3 = rectF36.centerX();
                            float f31 = rectF36.bottom;
                            float f32 = aVar4.H;
                            path.addCircle(centerX3, f31 - f32, f32, Path.Direction.CW);
                        }
                        canvas.drawPath(path, paint);
                    }
                } else {
                    RectF rectF37 = aVar4.N;
                    boolean isEmpty3 = rectF37.isEmpty();
                    Path path2 = aVar4.L;
                    if (!isEmpty3) {
                        RectF rectF38 = aVar4.Q;
                        rectF38.set((rectF37.centerX() * editorScale) - aVar4.H, (rectF37.bottom * editorScale) + aVar4.G, (rectF37.centerX() * editorScale) + aVar4.H, (rectF37.bottom * editorScale) + aVar4.G + aVar4.J);
                        path2.reset();
                        path2.moveTo(rectF38.centerX(), rectF38.top);
                        float centerX4 = rectF38.centerX();
                        float f33 = aVar4.K / 2.0f;
                        path2.lineTo(centerX4 + f33, f33 + rectF38.top);
                        float centerX5 = rectF38.centerX();
                        float f34 = aVar4.K / 2.0f;
                        path2.lineTo(centerX5 - f34, f34 + rectF38.top);
                        path2.close();
                        float centerX6 = rectF38.centerX();
                        float f35 = rectF38.bottom;
                        float f36 = aVar4.H;
                        path2.addCircle(centerX6, f35 - f36, f36, Path.Direction.CW);
                    }
                    canvas.drawPath(path2, paint);
                }
                if (!aVar4.N.isEmpty()) {
                    float centerX7 = (aVar4.N.centerX() * editorScale) - (aVar4.E / 2.0f);
                    RectF rectF39 = aVar4.N;
                    canvas.drawRect(centerX7, rectF39.top * editorScale, (aVar4.E / 2.0f) + (rectF39.centerX() * editorScale), aVar4.N.bottom * editorScale, paint);
                }
                Paint paint2 = this.q1;
                paint2.setColor(1306337322);
                lib.zj.pdfeditor.text.editor.a aVar5 = this.f21180l1;
                Iterator<RectF> it = aVar5.V.iterator();
                while (it.hasNext()) {
                    RectF next = it.next();
                    canvas.drawRect(next.left * editorScale, next.top * editorScale, next.right * editorScale, next.bottom * editorScale, paint2);
                }
                RectF rectF40 = aVar5.f21686e0;
                if (pdf.pdfreader.viewer.editor.free.utils.t0.Z(rectF40)) {
                    aVar5.O(editorScale, rectF40);
                } else {
                    RectF rectF41 = aVar5.f21682c0;
                    if (!rectF41.isEmpty()) {
                        aVar5.O(editorScale, rectF41);
                    }
                }
                RectF rectF42 = aVar5.Y;
                boolean isEmpty4 = rectF42.isEmpty();
                Paint paint3 = this.f21189v1;
                if (!isEmpty4) {
                    canvas.drawCircle(rectF42.centerX(), rectF42.centerY(), rectF42.width() / 2.0f, paint3);
                    canvas.drawRect(rectF42.centerX(), rectF42.centerY(), rectF42.right, rectF42.bottom, paint3);
                }
                RectF rectF43 = aVar5.f21688f0;
                if (pdf.pdfreader.viewer.editor.free.utils.t0.Z(rectF43)) {
                    aVar5.N(editorScale, rectF43);
                } else {
                    RectF rectF44 = aVar5.f21684d0;
                    if (!rectF44.isEmpty()) {
                        aVar5.N(editorScale, rectF44);
                    }
                }
                RectF rectF45 = aVar5.Z;
                if (!rectF45.isEmpty()) {
                    canvas.drawCircle(rectF45.centerX(), rectF45.centerY(), rectF45.width() / 2.0f, paint3);
                    canvas.drawRect(rectF45.left, rectF45.top, rectF45.centerX(), rectF45.centerY(), paint3);
                }
                ArrayList<mj.a> arrayList3 = this.f21180l1.f21695m;
                ArrayList<mj.e> arrayList4 = this.f21180l1.f21697o;
                if ((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList4 != null && !arrayList4.isEmpty())) {
                    EditorAlignCheck editorAlignCheck = EditorAlignCheck.b.f21666a;
                    float f37 = editorAlignCheck.f21657a;
                    if (f37 >= 0.0f) {
                        float f38 = f37 * editorScale;
                        canvas.drawLine(f38, 0.0f, f38, getMeasuredHeight(), this.f21185r1);
                    }
                    float f39 = editorAlignCheck.f21658b;
                    if (f39 >= 0.0f) {
                        canvas.drawLine(0.0f, f39 * editorScale, getMeasuredWidth(), editorAlignCheck.f21658b * editorScale, this.f21185r1);
                    }
                    float f40 = editorAlignCheck.c;
                    if (f40 >= 0.0f) {
                        float f41 = f40 * editorScale;
                        canvas.drawLine(f41, 0.0f, f41, getMeasuredHeight(), this.f21185r1);
                    }
                    float f42 = editorAlignCheck.f21659d;
                    if (f42 >= 0.0f) {
                        canvas.drawLine(0.0f, f42 * editorScale, getMeasuredWidth(), editorAlignCheck.f21659d * editorScale, this.f21185r1);
                    }
                }
            }
        }
    }

    @Override // lib.zj.pdfeditor.a0
    public final void f(int i10, boolean z10) {
        PDFFreeTextEditView pDFFreeTextEditView = this.A;
        if (pDFFreeTextEditView != null) {
            if (z10) {
                g2(pDFFreeTextEditView, AdjustAction.TextSize, pDFFreeTextEditView.getRecordFrame());
            }
            this.A.d(i10, true);
            this.A.requestLayout();
        }
    }

    @Override // lib.zj.pdfeditor.PageView
    public final void g1() {
        if (this.f21180l1.f21680b == TextEditorState.ADJUST_TEXT_BLOCK) {
            this.f21180l1.r();
            ViewParent parent = getParent();
            if (parent instanceof PDFReaderView) {
                ((PDFReaderView) parent).h();
            }
        }
    }

    public final void g2(PDFFreeTextEditView pDFFreeTextEditView, AdjustAction adjustAction, RectF rectF) {
        RectF rectF2;
        AdjustActionInfo adjustActionInfo;
        if (pDFFreeTextEditView == null) {
            return;
        }
        getTextParamChangedListener();
        if (rectF == null) {
            rectF2 = pDFFreeTextEditView.getFrame();
        } else {
            rectF2 = rectF;
        }
        int originFontSize = pDFFreeTextEditView.getOriginFontSize();
        if (adjustAction == AdjustAction.Scale || adjustAction == AdjustAction.TextSize) {
            originFontSize = pDFFreeTextEditView.getRecordFontSize();
        }
        int i10 = originFontSize;
        if (adjustAction == AdjustAction.Typeset) {
            adjustActionInfo = new AdjustActionInfo(pDFFreeTextEditView.get_id(), adjustAction, pDFFreeTextEditView.getText(), pDFFreeTextEditView.getRecordContentWithNewLine(), i10, pDFFreeTextEditView.getTextColor(), U1(rectF2), pDFFreeTextEditView.getCopyRootParentId());
        } else {
            adjustActionInfo = new AdjustActionInfo(pDFFreeTextEditView.get_id(), adjustAction, pDFFreeTextEditView.getText(), pDFFreeTextEditView.getContentWithNewLine(), i10, pDFFreeTextEditView.getTextColor(), U1(rectF2), pDFFreeTextEditView.getCopyRootParentId());
        }
        this.G0.addTextAnnotationForUpdate(this.c, pDFFreeTextEditView, adjustActionInfo, this.f21275f, this.f21277g);
    }

    public int getAddTextCount() {
        if (this.B != null) {
            return this.B.size();
        }
        return 0;
    }

    public EditorView getEditorView() {
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            return ((PDFReaderView) parent).getEditorView();
        }
        return null;
    }

    @Override // lib.zj.pdfeditor.PageView
    public LinkInfo[] getLinkInfo() {
        ReaderPDFCore readerPDFCore = this.G0;
        if (readerPDFCore == null) {
            return null;
        }
        return readerPDFCore.getPageLinks(this.c);
    }

    public PDFReaderView.Mode getMode() {
        return this.C0;
    }

    @Override // lib.zj.pdfeditor.PageView
    public ReaderPDFCore getPDFCore() {
        return this.G0;
    }

    @Override // lib.zj.pdfeditor.PageView
    public RectF getSelectImageBlockRectF() {
        lib.zj.pdfeditor.text.editor.a aVar = this.f21180l1;
        if (aVar.f21699q != null) {
            return aVar.f21699q.f22053b;
        }
        return null;
    }

    @Override // lib.zj.pdfeditor.PageView
    public RectF getSelectTextBlockRectF() {
        lib.zj.pdfeditor.text.editor.a aVar = this.f21180l1;
        if (aVar.f21698p != null) {
            return aVar.f21698p.f22045b;
        }
        return null;
    }

    @Override // lib.zj.pdfeditor.PageView
    public TextChar[][] getText() {
        try {
            return this.G0.textLines(this.c);
        } catch (Throwable th2) {
            aj.b a10 = pg.a.c().a();
            String th3 = th2.toString();
            a10.getClass();
            aj.b.J(this.P0, th3);
            return new TextChar[0];
        }
    }

    public mj.h getTextEditorFocusInfo() {
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            return ((PDFReaderView) parent).getTextEditorFocusInfo();
        }
        return null;
    }

    public TextEditorState getTextEditorState() {
        return this.f21180l1.f21680b;
    }

    @Override // mj.b0
    public final void h() {
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            ((PDFReaderView) parent).h();
        }
    }

    public final void h2(lj.a aVar) {
        if (this.f21271d == null) {
            return;
        }
        aVar.f21752f = true;
        PDFFreeTextEditView pDFFreeTextEditView = new PDFFreeTextEditView(getContext());
        pDFFreeTextEditView.set_id(System.currentTimeMillis());
        pDFFreeTextEditView.setText(aVar.f21750d);
        pDFFreeTextEditView.setTextColor(aVar.f21749b.intValue());
        pDFFreeTextEditView.setFontSize((int) ((aVar.c.floatValue() / (this.f21271d.x * 0.003f)) * this.f21275f));
        pDFFreeTextEditView.setPadding(0, 0, 0, 0);
        Rect rect = new Rect();
        getLocalVisibleRect(rect);
        pDFFreeTextEditView.setVisibleRect(rect);
        pDFFreeTextEditView.setSavedForUpdate(true);
        pDFFreeTextEditView.setSavedTextIndexInFreeTextAnnotationDatas(aVar.f21753g);
        pDFFreeTextEditView.setPageRotate(aVar.f21754h);
        pDFFreeTextEditView.setAnnotRotate(aVar.f21755i);
        pDFFreeTextEditView.setCopyRootParentId(pDFFreeTextEditView.get_id());
        o2(pDFFreeTextEditView);
        addView(pDFFreeTextEditView, new ViewGroup.LayoutParams(-1, -1));
        AdjustActionInfo adjustActionInfo = new AdjustActionInfo(pDFFreeTextEditView.get_id(), AdjustAction.Saved, pDFFreeTextEditView.getText(), pDFFreeTextEditView.getContentWithNewLine(), pDFFreeTextEditView.getOriginFontSize(), pDFFreeTextEditView.getTextColor(), pDFFreeTextEditView.getFrame(), pDFFreeTextEditView.getCopyRootParentId());
        adjustActionInfo.initX = 0.0f;
        adjustActionInfo.initY = 0.0f;
        this.G0.addTextAnnotationForSaved(this.c, pDFFreeTextEditView, adjustActionInfo, this.f21275f, this.f21277g);
        ReaderPDFCore readerPDFCore = this.G0;
        if (readerPDFCore != null) {
            readerPDFCore.addTranslateFreeTextAnnotationData(getPage(), aVar);
            this.G0.updateCurEditPDFPageView(this);
        }
        float scale = getScale();
        String str = aVar.f21750d;
        int intValue = aVar.f21749b.intValue();
        RectF rectF = aVar.f21751e;
        ng.e.a();
        pDFFreeTextEditView.f21605a = str;
        pDFFreeTextEditView.setFontSize((int) ((aVar.c.floatValue() / (this.f21271d.x * 0.003f)) * this.f21275f));
        pDFFreeTextEditView.setTextColor(intValue);
        float f10 = pDFFreeTextEditView.f21606a0;
        pDFFreeTextEditView.j((int) ((rectF.width() * scale) + f10));
        pDFFreeTextEditView.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, true);
        RectF rectF2 = pDFFreeTextEditView.C;
        float f11 = rectF.left * scale;
        float f12 = f10 / 2.0f;
        float f13 = pDFFreeTextEditView.V;
        float f14 = rectF.top * scale;
        float f15 = pDFFreeTextEditView.T;
        PointF pointF = pDFFreeTextEditView.f21631n0;
        rectF2.set((f11 - f12) - f13, (f14 - f12) - f15, f11 + pointF.x + pDFFreeTextEditView.W + f12 + f13, f14 + pointF.y + pDFFreeTextEditView.U + f12 + f15);
        pDFFreeTextEditView.c();
        PDFFreeTextEditView.b bVar = pDFFreeTextEditView.f21615f0;
        if (bVar != null) {
            i iVar = (i) bVar;
            f2(PDFPageView.this, iVar.f21215a);
        }
        this.B.add(pDFFreeTextEditView);
        q1();
        t2(pDFFreeTextEditView.getCopyRootParentId());
        lj.b textParamChangedListener = getTextParamChangedListener();
        PDFFreeTextEditView pDFFreeTextEditView2 = this.A;
        if (pDFFreeTextEditView2 == null) {
            this.A = pDFFreeTextEditView;
            if (textParamChangedListener != null) {
                ((i2) textParamChangedListener).e(pDFFreeTextEditView.getTextColor(), pDFFreeTextEditView.getOriginFontSize());
            }
        } else {
            pDFFreeTextEditView2.setShowBox(false);
            this.A = pDFFreeTextEditView;
            if (textParamChangedListener != null) {
                ((i2) textParamChangedListener).a(pDFFreeTextEditView.getTextColor(), pDFFreeTextEditView.getOriginFontSize());
            }
        }
        this.A.setShowBox(true);
        this.A.bringToFront();
        if (textParamChangedListener != null) {
            this.B.size();
        }
    }

    @Override // mj.b0
    public final void i() {
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            ((PDFReaderView) parent).i();
        }
    }

    public final void i2() {
        lib.zj.pdfeditor.text.editor.a aVar = this.f21180l1;
        aVar.g(TextEditorState.NONE);
        if (aVar.f21685e >= 0) {
            aVar.D();
            aVar.E();
            aVar.u(new mj.x(aVar, aVar.f21685e));
            aVar.u(new mj.y(aVar, aVar.f21685e));
            return;
        }
        aVar.C();
    }

    @Override // lib.zj.pdfeditor.a0
    public final void j(boolean z10) {
        if (this.B != null && !this.B.isEmpty()) {
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                removeView((PDFFreeTextEditView) it.next());
                it.remove();
            }
            if (r1() && z10) {
                G();
            }
        }
        n2(true);
    }

    public final void j2(x xVar) {
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            xVar.f((PDFReaderView) parent);
        }
    }

    @Override // mj.b0
    public final void k(ReaderPDFCore.FontInfo fontInfo) {
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            ((PDFReaderView) parent).k(fontInfo);
        }
    }

    @Override // lib.zj.pdfeditor.PageView
    public final lib.zj.pdfeditor.l k1(Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, int i15) {
        return new lib.zj.pdfeditor.l(this, this.G0, this.c, bitmap, i10, i11, i12, i13, i14, i15);
    }

    public final void k2(PDFFreeTextEditView pDFFreeTextEditView) {
        lj.b textParamChangedListener = getTextParamChangedListener();
        if (this.B.contains(pDFFreeTextEditView)) {
            PDFFreeTextEditView pDFFreeTextEditView2 = this.A;
            ArrayList<PDFFreeTextEditView> arrayList = null;
            if (pDFFreeTextEditView2 != null && pDFFreeTextEditView2.get_id() == pDFFreeTextEditView.get_id()) {
                this.A = null;
            }
            this.B.remove(pDFFreeTextEditView);
            long copyRootParentId = pDFFreeTextEditView.getCopyRootParentId();
            Iterator it = this.B.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                PDFFreeTextEditView pDFFreeTextEditView3 = (PDFFreeTextEditView) it.next();
                if (pDFFreeTextEditView3.getCopyRootParentId() == copyRootParentId) {
                    i10++;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(pDFFreeTextEditView3);
                }
            }
            if (i10 == 9 && arrayList != null) {
                for (PDFFreeTextEditView pDFFreeTextEditView4 : arrayList) {
                    pDFFreeTextEditView4.setShowCopyButton(true);
                    pDFFreeTextEditView4.invalidate();
                }
            }
            removeView(pDFFreeTextEditView);
            if (textParamChangedListener != null) {
                this.B.size();
                ((i2) textParamChangedListener).b();
            }
        }
    }

    @Override // lib.zj.pdfeditor.a0
    public final LinkInfo l(float f10, float f11) {
        float width = (this.f21275f * getWidth()) / this.f21271d.x;
        float left = (f10 - getLeft()) / width;
        float top = (f11 - getTop()) / width;
        LinkInfo[] linkInfoArr = this.f21307v;
        if (linkInfoArr != null) {
            for (LinkInfo linkInfo : linkInfoArr) {
                if (linkInfo.hitArea.contains(left, top)) {
                    return linkInfo;
                }
            }
            return null;
        }
        return null;
    }

    @Override // lib.zj.pdfeditor.PageView
    public final m l1(Bitmap bitmap, int i10, int i11, int i12, int i13) {
        return new m(this, this.G0, this.c, bitmap, i10, i11, i12, i13);
    }

    public final void l2(PDFFreeTextEditView pDFFreeTextEditView) {
        this.G0.updateCurEditPDFPageView(this);
        g2(pDFFreeTextEditView, AdjustAction.Delete, null);
        k2(pDFFreeTextEditView);
    }

    @Override // lib.zj.pdfeditor.PageView
    public final List<ij.a> m1(boolean z10) {
        ReaderPDFCore readerPDFCore = this.G0;
        if (readerPDFCore != null) {
            return readerPDFCore.getPageInks(this.c, z10);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0160  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2(android.view.MotionEvent r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.pdfeditor.PDFPageView.m2(android.view.MotionEvent, boolean):void");
    }

    @Override // lib.zj.pdfeditor.PageView
    public final o n1(int i10, int i11, int i12, float f10, float f11) {
        return new o(this, this.G0, this.c, i10, i11, i12, f10, f11);
    }

    public final boolean n2(boolean z10) {
        boolean z11;
        PDFFreeTextEditView pDFFreeTextEditView = this.A;
        if (pDFFreeTextEditView != null && pDFFreeTextEditView.f21608b0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        pDFFreeTextEditView.setShowBox(false);
        if (!z10) {
            return true;
        }
        this.A = null;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
    @Override // lib.zj.pdfeditor.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(lib.zj.pdfeditor.Annotation.Type r7) {
        /*
            r6 = this;
            lib.zj.pdfeditor.PageView$SelectPopMode r0 = r6.T
            lib.zj.pdfeditor.PageView$SelectPopMode r1 = lib.zj.pdfeditor.PageView.SelectPopMode.Annot_After_Select
            r2 = 0
            if (r0 != r1) goto L8
            return r2
        L8:
            android.graphics.RectF r0 = r6.f21309w
            r1 = 1
            if (r0 != 0) goto Le
            goto L27
        Le:
            float r3 = r0.left
            float r4 = r0.right
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L1b
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L27
        L1b:
            float r3 = r0.top
            float r0 = r0.bottom
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L29
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L29
        L27:
            r0 = r1
            goto L2a
        L29:
            r0 = r2
        L2a:
            if (r0 == 0) goto L2d
            return r2
        L2d:
            android.graphics.RectF r0 = new android.graphics.RectF
            android.graphics.RectF r3 = r6.f21309w
            r0.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            lib.zj.pdfeditor.PDFPageView$b r4 = new lib.zj.pdfeditor.PDFPageView$b
            r4.<init>(r3)
            r6.B1(r4, r2)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L48
            return r2
        L48:
            java.util.concurrent.ThreadPoolExecutor r2 = ng.d.f22480a
            lib.zj.pdfeditor.PDFPageView$c r4 = new lib.zj.pdfeditor.PDFPageView$c
            r4.<init>(r3, r7, r0)
            r2.execute(r4)
            r6.Z0()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.pdfeditor.PDFPageView.o(lib.zj.pdfeditor.Annotation$Type):boolean");
    }

    @Override // lib.zj.pdfeditor.PageView
    public final n o1(Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, int i15) {
        return new n(this, this.G0, this.c, bitmap, i10, i11, i12, i13, i14, i15);
    }

    public final void o2(PDFFreeTextEditView pDFFreeTextEditView) {
        pDFFreeTextEditView.post(new h(pDFFreeTextEditView));
        pDFFreeTextEditView.setOnAdjustListener(new i(pDFFreeTextEditView));
    }

    @Override // lib.zj.pdfeditor.PageView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getReaderMode() == PDFReaderView.Mode.Editor) {
            this.f21180l1.L(this.c);
        }
    }

    @Override // lib.zj.pdfeditor.PageView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        lib.zj.pdfeditor.text.editor.a aVar = this.f21180l1;
        aVar.getClass();
        int i10 = configuration.orientation;
        if (i10 != aVar.f21692j) {
            aVar.f21692j = i10;
            aVar.f21706x = false;
            if (aVar.f21680b == TextEditorState.SELECT_TEXT) {
                aVar.g(TextEditorState.ADJUST_TEXT_BLOCK);
                aVar.A();
                aVar.F();
                EditorView editorView = aVar.f21687f.getEditorView();
                if (editorView != null) {
                    editorView.c();
                }
            }
            aVar.f21687f.q1();
        }
    }

    @Override // lib.zj.pdfeditor.PageView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Bitmap bitmap;
        super.onDetachedFromWindow();
        if (this.C != null && !this.C.isEmpty()) {
            if (this.f21178j1 == null) {
                this.f21178j1 = new ArrayList<>();
            }
            this.f21178j1.clear();
            this.f21178j1.addAll(this.C);
            Iterator<lj.a> it = this.f21178j1.iterator();
            while (it.hasNext()) {
                lj.a next = it.next();
                if (next != null && (bitmap = next.f21748a) != null && !bitmap.isRecycled()) {
                    next.f21748a.recycle();
                    next.f21748a = null;
                }
            }
        }
        this.f21180l1.B();
        j2(new androidx.appcompat.libconvert.helper.b(this, 9));
    }

    @Override // lib.zj.pdfeditor.a0
    public final Hit p(PDFReaderView.Mode mode, float f10, float f11) {
        boolean z10;
        PDFReaderView pDFReaderView;
        boolean z11;
        RectF rectF;
        ReaderView.g deleteAnnotation;
        ReaderView.g deleteAnnotation2;
        boolean z12;
        boolean z13;
        RectF rectF2;
        float width = (this.f21275f * getWidth()) / this.f21271d.x;
        float left = (f10 - getLeft()) / width;
        float top = (f11 - getTop()) / width;
        boolean z14 = true;
        int i10 = 0;
        if (getReaderMode() == PDFReaderView.Mode.AdjustText) {
            Iterator it = this.B.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((PDFFreeTextEditView) it.next()).getBoxFrame().contains(f10 - getLeft(), f11 - getTop())) {
                        z13 = true;
                        break;
                    }
                } else {
                    z13 = false;
                    break;
                }
            }
            if (!z13) {
                PDFFreeTextEditView pDFFreeTextEditView = this.A;
                if (pDFFreeTextEditView != null) {
                    int originFontSize = pDFFreeTextEditView.getOriginFontSize();
                    int textColor = this.A.getTextColor();
                    this.A.setShowBox(false);
                    this.A = null;
                    lj.b textParamChangedListener = getTextParamChangedListener();
                    if (textParamChangedListener != null) {
                        ((i2) textParamChangedListener).d(originFontSize, textColor);
                    }
                }
                if (this.C != null && !this.C.isEmpty()) {
                    if (this.f21177i1 == null) {
                        this.f21177i1 = new ArrayList<>();
                    }
                    this.f21177i1.clear();
                    this.f21177i1.addAll(this.C);
                    int size = this.f21177i1.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        lj.a aVar = this.f21177i1.get(size);
                        if (aVar != null && (rectF2 = aVar.f21751e) != null && rectF2.contains(left, top) && !aVar.f21752f) {
                            h2(aVar);
                            break;
                        }
                        size--;
                    }
                }
            }
            return Hit.Nothing;
        } else if (getReaderMode() == PDFReaderView.Mode.Stamp) {
            if ((getParent() instanceof ReaderView) && (deleteAnnotation2 = ((ReaderView) getParent()).getDeleteAnnotation()) != null) {
                ReaderPreviewActivity.d0 d0Var = (ReaderPreviewActivity.d0) deleteAnnotation2;
                if (!ReaderPreviewActivity.this.f26197i5.get() && !rj.a.a(65382, 300L)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    S1();
                    return Hit.Annotation;
                }
                ListIterator listIterator = new ArrayList(this.A0).listIterator();
                while (true) {
                    if (!listIterator.hasNext()) {
                        break;
                    }
                    kj.b bVar = (kj.b) listIterator.next();
                    RectF rectF3 = bVar.f19803f;
                    if (rectF3 != null && rectF3.contains(left, top)) {
                        S1();
                        if (bVar.hashCode() != ReaderPreviewActivity.this.f26221m5 && bVar.f19800b != null) {
                            listIterator.remove();
                            this.A0.remove(bVar);
                            ReaderPDFCore.addPageStampAnnotDataMap(Integer.valueOf(this.c), this.A0);
                            q1();
                            int[] iArr = new int[2];
                            getLocationOnScreen(iArr);
                            d0Var.a(this.c, iArr, bVar, width);
                        }
                    }
                }
            }
            Iterator it2 = new ArrayList(this.A0).iterator();
            while (it2.hasNext()) {
                kj.b bVar2 = (kj.b) it2.next();
                if (bVar2 != null && (rectF = bVar2.f19803f) != null && rectF.contains(left, top)) {
                    if ((getParent() instanceof ReaderView) && (deleteAnnotation = ((ReaderView) getParent()).getDeleteAnnotation()) != null) {
                        ReaderPreviewActivity.d0 d0Var2 = (ReaderPreviewActivity.d0) deleteAnnotation;
                        if (!ReaderPreviewActivity.this.f26197i5.get() && !rj.a.a(65382, 300L)) {
                            z14 = false;
                        }
                        if (z14) {
                            S1();
                        } else {
                            S1();
                            int[] iArr2 = new int[2];
                            getLocationOnScreen(iArr2);
                            ListIterator listIterator2 = new ArrayList(this.A0).listIterator();
                            while (true) {
                                if (!listIterator2.hasNext()) {
                                    break;
                                }
                                kj.b bVar3 = (kj.b) listIterator2.next();
                                RectF rectF4 = bVar3.f19803f;
                                if (rectF4 != null && rectF4.contains(left, top)) {
                                    if (bVar3.hashCode() != ReaderPreviewActivity.this.f26221m5 && bVar3.f19800b != null) {
                                        listIterator2.remove();
                                        this.A0.remove(bVar3);
                                        ReaderPDFCore.addPageStampAnnotDataMap(Integer.valueOf(this.c), this.A0);
                                        q1();
                                        d0Var2.a(this.c, iArr2, bVar3, width);
                                    }
                                }
                            }
                        }
                    }
                    return Hit.Annotation;
                }
            }
            return null;
        } else {
            Annotation[] annotationArr = this.I0;
            if (annotationArr != null) {
                z10 = false;
                for (int length = annotationArr.length - 1; length >= 0; length--) {
                    Annotation annotation = annotationArr[length];
                    if (annotation != null && annotation.contains(left, top)) {
                        if (getParent() instanceof PDFReaderView) {
                            pDFReaderView = (PDFReaderView) getParent();
                        } else {
                            pDFReaderView = null;
                        }
                        switch (k.f21218a[annotation.type.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                                if (getReaderMode() == PDFReaderView.Mode.AdjustText) {
                                    continue;
                                } else if (mode == PDFReaderView.Mode.Viewing) {
                                    this.J0 = length;
                                    if (pDFReaderView != null) {
                                        z14 = pDFReaderView.H0(annotation);
                                    }
                                    if (z14) {
                                        ViewParent parent = getParent();
                                        if (parent instanceof PDFReaderView) {
                                            ((PDFReaderView) parent).M0.setEmpty();
                                        }
                                    }
                                    x1(this.J0, annotation);
                                    return Hit.Annotation;
                                } else {
                                    PDFReaderView.Mode mode2 = PDFReaderView.Mode.HIGHLINE;
                                    if (mode != mode2 && mode != PDFReaderView.Mode.UNDERLINE && mode != PDFReaderView.Mode.STRIKEOUTLINE) {
                                        break;
                                    } else {
                                        if ((mode == mode2 && annotation.type == Annotation.Type.HIGHLIGHT) || ((mode == PDFReaderView.Mode.UNDERLINE && annotation.type == Annotation.Type.UNDERLINE) || (mode == PDFReaderView.Mode.STRIKEOUTLINE && annotation.type == Annotation.Type.STRIKEOUT))) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            this.J0 = length;
                                            if (pDFReaderView != null) {
                                                z14 = pDFReaderView.H0(annotation);
                                            }
                                            if (z14) {
                                                ViewParent parent2 = getParent();
                                                if (parent2 instanceof PDFReaderView) {
                                                    ((PDFReaderView) parent2).M0.setEmpty();
                                                }
                                            }
                                            x1(this.J0, annotation);
                                            return Hit.Annotation;
                                        }
                                        break;
                                    }
                                }
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (mode != PDFReaderView.Mode.HIGHLINE && mode != PDFReaderView.Mode.STRIKEOUTLINE && mode != PDFReaderView.Mode.UNDERLINE) {
                                    if (pDFReaderView != null) {
                                        z14 = pDFReaderView.B0(annotation, false);
                                    }
                                    Z0();
                                    if (!z14) {
                                        pDFReaderView.setDelRectFChange(annotation);
                                    }
                                    this.J0 = length;
                                    setItemSelectBox(annotation);
                                    return Hit.Annotation;
                                }
                                break;
                            default:
                                z10 = true;
                                break;
                        }
                    }
                }
            } else {
                z10 = false;
            }
            this.J0 = -1;
            if (getReaderMode() == PDFReaderView.Mode.AdjustText) {
                return Hit.Nothing;
            }
            if (!this.G0.javascriptSupported()) {
                return Hit.Nothing;
            }
            if (this.H0 != null) {
                while (true) {
                    RectF[] rectFArr = this.H0;
                    if (i10 < rectFArr.length && !z10) {
                        if (rectFArr[i10].contains(left, top)) {
                            z10 = true;
                        }
                        i10++;
                    }
                }
            }
            if (z10) {
                ng.d.f22480a.execute(new a(left, top));
                return Hit.Widget;
            }
            return Hit.Nothing;
        }
    }

    public final boolean p2() {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            return true;
        }
        return false;
    }

    @Override // mj.b0
    public final void q() {
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            ((PDFReaderView) parent).q();
        }
    }

    public final boolean q2(float f10, float f11) {
        RectF rectF;
        float width = (this.f21275f * getWidth()) / this.f21271d.x;
        float left = (f10 - getLeft()) / width;
        float top = (f11 - getTop()) / width;
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            if (((PDFFreeTextEditView) it.next()).getBoxFrame().contains(f10 - getLeft(), f11 - getTop())) {
                return true;
            }
        }
        if (this.C != null && !this.C.isEmpty()) {
            if (this.f21176c1 == null) {
                this.f21176c1 = new ArrayList<>();
            }
            this.f21176c1.clear();
            this.f21176c1.addAll(this.C);
            for (int size = this.f21176c1.size() - 1; size >= 0; size--) {
                lj.a aVar = this.f21176c1.get(size);
                if (aVar != null && (rectF = aVar.f21751e) != null && rectF.contains(left, top) && !aVar.f21752f) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // mj.b0
    public final void r(String str) {
        try {
            j2(new lib.zj.pdfeditor.j(this, false, str));
            ((ClipboardManager) this.f21268b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("PDFReader", str));
        } catch (Exception unused) {
        }
    }

    public final void r2() {
        int i10;
        Bitmap bitmap;
        ArrayList arrayList = new ArrayList();
        ReaderPDFCore readerPDFCore = this.G0;
        Annotation[] annotations = readerPDFCore.getAnnotations(this.c, readerPDFCore.makeAnnotsFlag(Annotation.Type.STAMP));
        if (annotations != null) {
            for (Annotation annotation : annotations) {
                Object data = annotation.getData(Annotation.KEY_ANNOT_NAME);
                Object data2 = annotation.getData(Annotation.KEY_ANNOT_ROTATE);
                Object data3 = annotation.getData(Annotation.KEY_ANNOT_COLOR);
                Object data4 = annotation.getData(Annotation.KEY_ANNOT_BMP);
                if ((data instanceof String) && (data3 instanceof Integer)) {
                    kj.b bVar = new kj.b();
                    bVar.f19802e = (String) data;
                    bVar.f19801d = (Integer) data3;
                    if (data2 instanceof Integer) {
                        i10 = ((Integer) data2).intValue();
                    } else {
                        i10 = 0;
                    }
                    bVar.c = Integer.valueOf(i10);
                    if (data4 instanceof Bitmap) {
                        bitmap = (Bitmap) data4;
                    } else {
                        bitmap = null;
                    }
                    bVar.f19800b = bitmap;
                    bVar.f19803f = new RectF(annotation);
                    bVar.f19804g = this.c;
                    bVar.a();
                    arrayList.add(bVar);
                    this.B0.add(new kj.b(bVar));
                }
            }
        }
        if (r1()) {
            ArrayList<kj.b> pageStampAnnotData = ReaderPDFCore.getPageStampAnnotData(this.c);
            if (pageStampAnnotData != null) {
                ArrayList arrayList2 = new ArrayList(pageStampAnnotData);
                this.A0.clear();
                this.A0.addAll(arrayList2);
                return;
            }
            this.A0.clear();
            this.A0.addAll(arrayList);
            ReaderPDFCore.addPageStampAnnotDataMap(Integer.valueOf(this.c), new ArrayList(this.A0));
            return;
        }
        this.A0.clear();
        this.A0.addAll(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r0.getEditFocusPageView() == r4) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1.f22083a == r4.c) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        r2 = true;
     */
    @Override // mj.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(lib.zj.pdfeditor.text.editor.TextEditorState r5) {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof lib.zj.pdfeditor.PDFReaderView
            r2 = 0
            if (r1 == 0) goto L21
            lib.zj.pdfeditor.PDFReaderView r0 = (lib.zj.pdfeditor.PDFReaderView) r0
            mj.h r1 = r0.getTextEditorFocusInfo()
            r3 = 1
            if (r1 == 0) goto L1a
            int r0 = r4.c
            int r1 = r1.f22083a
            if (r1 != r0) goto L21
        L18:
            r2 = r3
            goto L21
        L1a:
            lib.zj.pdfeditor.PDFPageView r0 = r0.getEditFocusPageView()
            if (r0 != r4) goto L21
            goto L18
        L21:
            if (r2 == 0) goto L2d
            com.google.android.tools.d r0 = new com.google.android.tools.d
            r1 = 11
            r0.<init>(r5, r1)
            r4.j2(r0)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.pdfeditor.PDFPageView.s(lib.zj.pdfeditor.text.editor.TextEditorState):void");
    }

    @Override // lib.zj.pdfeditor.PageView
    public final boolean s1() {
        int i10;
        Annotation[] annotationArr = this.I0;
        if (annotationArr == null || (i10 = this.J0) < 0 || i10 >= annotationArr.length || annotationArr[i10].type != Annotation.Type.FREETEXT) {
            return false;
        }
        return true;
    }

    public final void s2() {
        PDFFreeTextEditView pDFFreeTextEditView = this.A;
        if (pDFFreeTextEditView != null) {
            pDFFreeTextEditView.setShowBox(false);
            this.A = null;
            getTextParamChangedListener();
        }
        this.f21180l1.t();
    }

    @Override // lib.zj.pdfeditor.a0
    public void setChangeReporter(Runnable runnable) {
        this.O0 = runnable;
    }

    @Override // lib.zj.pdfeditor.a0
    public void setFreeTextColor(int i10) {
        PDFFreeTextEditView pDFFreeTextEditView = this.A;
        if (pDFFreeTextEditView != null) {
            g2(pDFFreeTextEditView, AdjustAction.TextColor, null);
            this.A.setTextColor(i10);
            this.A.invalidate();
        }
    }

    public void setMode(PDFReaderView.Mode mode) {
        this.C0 = mode;
    }

    public void setNewCore(ReaderPDFCore readerPDFCore) {
        this.G0 = readerPDFCore;
        lib.zj.pdfeditor.text.editor.a aVar = this.f21180l1;
        aVar.f21683d = readerPDFCore;
        Objects.toString(aVar.f21680b);
        if (aVar.f21685e >= 0) {
            aVar.u(new mj.x(aVar, aVar.f21685e));
            aVar.u(new mj.y(aVar, aVar.f21685e));
            aVar.f21687f.invalidate();
        }
    }

    @Override // lib.zj.pdfeditor.a0
    public void setScale(float f10) {
        this.f21277g = f10;
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            PDFFreeTextEditView pDFFreeTextEditView = (PDFFreeTextEditView) it.next();
            if (pDFFreeTextEditView != null) {
                pDFFreeTextEditView.setViewScale(f10);
                pDFFreeTextEditView.requestLayout();
            }
        }
    }

    public void setSelectedAnnotationIndex(int i10) {
        this.J0 = i10;
    }

    @Override // lib.zj.pdfeditor.PageView
    public final boolean t1() {
        RectF rectF;
        if (this.f21180l1.f21680b == TextEditorState.ADJUST_IMAGE) {
            lib.zj.pdfeditor.text.editor.a aVar = this.f21180l1;
            if (aVar.f21699q != null) {
                rectF = aVar.f21699q.f22053b;
            } else {
                rectF = null;
            }
            if (rectF != null && this.f21180l1.f21706x) {
                return true;
            }
        }
        return false;
    }

    public final void t2(long j10) {
        Iterator it = this.B.iterator();
        ArrayList<PDFFreeTextEditView> arrayList = null;
        int i10 = 0;
        while (it.hasNext()) {
            PDFFreeTextEditView pDFFreeTextEditView = (PDFFreeTextEditView) it.next();
            if (pDFFreeTextEditView.getCopyRootParentId() == j10) {
                i10++;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(pDFFreeTextEditView);
            }
        }
        if (i10 == 10 && arrayList != null) {
            for (PDFFreeTextEditView pDFFreeTextEditView2 : arrayList) {
                pDFFreeTextEditView2.setShowCopyButton(false);
                pDFFreeTextEditView2.invalidate();
            }
        }
    }

    @Override // mj.b0
    public final void u() {
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            ((PDFReaderView) parent).u();
        }
    }

    @Override // lib.zj.pdfeditor.PageView
    public final boolean u1() {
        RectF rectF;
        if (this.f21180l1.f21680b == TextEditorState.ADJUST_TEXT_BLOCK) {
            lib.zj.pdfeditor.text.editor.a aVar = this.f21180l1;
            if (aVar.f21698p != null) {
                rectF = aVar.f21698p.f22045b;
            } else {
                rectF = null;
            }
            if (rectF != null && this.f21180l1.f21706x) {
                return true;
            }
        }
        return false;
    }

    public final void u2() {
        PDFFreeTextEditView pDFFreeTextEditView = this.A;
        if (pDFFreeTextEditView != null) {
            int originFontSize = pDFFreeTextEditView.getOriginFontSize();
            int textColor = this.A.getTextColor();
            this.A.setShowBox(false);
            this.A = null;
            lj.b textParamChangedListener = getTextParamChangedListener();
            if (textParamChangedListener != null) {
                ((i2) textParamChangedListener).d(originFontSize, textColor);
            }
        }
    }

    @Override // mj.b0
    public final void v() {
        j2(new com.facebook.appevents.m(10));
    }

    @Override // lib.zj.pdfeditor.PageView
    public final boolean v1() {
        RectF rectF;
        if (this.f21180l1.f21680b == TextEditorState.SELECT_TEXT) {
            lib.zj.pdfeditor.text.editor.a aVar = this.f21180l1;
            if (aVar.f21698p != null) {
                rectF = aVar.f21698p.f22045b;
            } else {
                rectF = null;
            }
            if (rectF != null) {
                return true;
            }
        }
        return false;
    }

    public final void v2(int i10) {
        PDFFreeTextEditView pDFFreeTextEditView;
        AdjustActionInfo adjustActionInfo;
        AdjustActionInfo adjustActionInfo2;
        AdjustActionInfo adjustActionInfo3;
        ReaderPDFCore readerPDFCore = this.G0;
        if (readerPDFCore != null) {
            ArrayList<ij.b> savedUpdateEditActionData = readerPDFCore.getSavedUpdateEditActionData(i10);
            List<ij.b> pageEditActionList = this.G0.getPageEditActionList(i10, Annotation.Type.FREETEXT);
            if ((pageEditActionList != null && !pageEditActionList.isEmpty()) || (savedUpdateEditActionData != null && !savedUpdateEditActionData.isEmpty())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (savedUpdateEditActionData != null && !savedUpdateEditActionData.isEmpty()) {
                    Iterator<ij.b> it = savedUpdateEditActionData.iterator();
                    while (it.hasNext()) {
                        ij.b next = it.next();
                        if (next != null && (adjustActionInfo3 = next.f18522f) != null && adjustActionInfo3.getId() > 0) {
                            linkedHashMap.put(Long.valueOf(next.f18522f.getId()), next);
                        }
                    }
                }
                if (pageEditActionList != null && !pageEditActionList.isEmpty()) {
                    for (ij.b bVar : pageEditActionList) {
                        if (bVar != null && (adjustActionInfo2 = bVar.f18522f) != null && adjustActionInfo2.getId() > 0) {
                            linkedHashMap.put(Long.valueOf(bVar.f18522f.getId()), bVar);
                        }
                    }
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    ij.b bVar2 = (ij.b) entry.getValue();
                    if (bVar2 != null && (pDFFreeTextEditView = bVar2.f18523g) != null && pDFFreeTextEditView.getParent() == null && (adjustActionInfo = bVar2.f18522f) != null && (adjustActionInfo.getAction() == null || adjustActionInfo.getAction() != AdjustAction.Delete)) {
                        PDFFreeTextEditView pDFFreeTextEditView2 = bVar2.f18523g;
                        addView(pDFFreeTextEditView2, new ViewGroup.LayoutParams(-1, -1));
                        lj.b textParamChangedListener = getTextParamChangedListener();
                        if (textParamChangedListener != null) {
                            ((i2) textParamChangedListener).e(pDFFreeTextEditView2.getTextColor(), pDFFreeTextEditView2.getOriginFontSize());
                        }
                        pDFFreeTextEditView2.setShowBox(false);
                        pDFFreeTextEditView2.bringToFront();
                        pDFFreeTextEditView2.requestLayout();
                        o2(pDFFreeTextEditView2);
                        w2(adjustActionInfo);
                        this.B.add(pDFFreeTextEditView2);
                    }
                }
            }
        }
    }

    @Override // mj.b0
    public final void w() {
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            ((PDFReaderView) parent).w();
        }
    }

    public final void w2(AdjustActionInfo adjustActionInfo) {
        lj.b textParamChangedListener = getTextParamChangedListener();
        if (adjustActionInfo.getAction() != AdjustAction.Scale && adjustActionInfo.getAction() != AdjustAction.TextSize) {
            if (adjustActionInfo.getAction() == AdjustAction.TextColor) {
                if (textParamChangedListener != null) {
                    int textColor = adjustActionInfo.getTextColor();
                    ExecutorService executorService = ReaderPreviewActivity.U5;
                    ((i2) textParamChangedListener).f5074a.x2(textColor);
                }
            } else if ((adjustActionInfo.getAction() == AdjustAction.Delete || adjustActionInfo.getAction() == AdjustAction.Copy) && textParamChangedListener != null) {
                int textSize = adjustActionInfo.getTextSize();
                i2 i2Var = (i2) textParamChangedListener;
                ExecutorService executorService2 = ReaderPreviewActivity.U5;
                i2Var.f5074a.r4(textSize);
                i2Var.f5074a.x2(adjustActionInfo.getTextColor());
            }
        } else if (textParamChangedListener != null) {
            int textSize2 = adjustActionInfo.getTextSize();
            ExecutorService executorService3 = ReaderPreviewActivity.U5;
            ((i2) textParamChangedListener).f5074a.r4(textSize2);
        }
    }

    @Override // mj.b0
    public final void x(String str) {
        try {
            j2(new lib.zj.pdfeditor.j(this, true, str));
            ((ClipboardManager) this.f21268b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("PDFReader", str));
        } catch (Exception unused) {
        }
    }

    public final void x2(ij.b bVar) {
        PDFFreeTextEditView pDFFreeTextEditView;
        AdjustActionInfo adjustActionInfo = bVar.f18522f;
        if (adjustActionInfo == null) {
            return;
        }
        if (adjustActionInfo.getAction() == AdjustAction.Add) {
            ReaderPDFCore readerPDFCore = this.G0;
            if (readerPDFCore != null) {
                readerPDFCore.addDoEditActionList(this.c, bVar);
            }
            AdjustActionInfo adjustActionInfo2 = bVar.f18522f;
            if (adjustActionInfo2 != null) {
                PDFFreeTextEditView pDFFreeTextEditView2 = new PDFFreeTextEditView(getContext());
                pDFFreeTextEditView2.set_id(adjustActionInfo2.getId());
                pDFFreeTextEditView2.setCopyRootParentId(adjustActionInfo2.getCopyRootParentId());
                pDFFreeTextEditView2.setText(adjustActionInfo2.getTextContent());
                pDFFreeTextEditView2.setTextColor(adjustActionInfo2.getTextColor());
                pDFFreeTextEditView2.setFontSize(adjustActionInfo2.getTextSize());
                pDFFreeTextEditView2.setPadding(0, 0, 0, 0);
                Rect rect = new Rect();
                getLocalVisibleRect(rect);
                pDFFreeTextEditView2.setVisibleRect(rect);
                o2(pDFFreeTextEditView2);
                addView(pDFFreeTextEditView2, new ViewGroup.LayoutParams(-1, -1));
                this.B.add(pDFFreeTextEditView2);
                t2(pDFFreeTextEditView2.getCopyRootParentId());
                lj.b textParamChangedListener = getTextParamChangedListener();
                PDFFreeTextEditView pDFFreeTextEditView3 = this.A;
                if (pDFFreeTextEditView3 == null) {
                    this.A = pDFFreeTextEditView2;
                    if (textParamChangedListener != null) {
                        ((i2) textParamChangedListener).e(pDFFreeTextEditView2.getTextColor(), pDFFreeTextEditView2.getOriginFontSize());
                    }
                } else {
                    pDFFreeTextEditView3.setShowBox(false);
                    this.A = pDFFreeTextEditView2;
                    if (textParamChangedListener != null) {
                        ((i2) textParamChangedListener).a(pDFFreeTextEditView2.getTextColor(), pDFFreeTextEditView2.getOriginFontSize());
                    }
                }
                if (textParamChangedListener != null) {
                    this.B.size();
                }
            }
            if (this.A != null && adjustActionInfo.getLocation() != null) {
                this.A.m(adjustActionInfo.getTextContent(), adjustActionInfo.getTextWithNewLine(), adjustActionInfo.getTextSize(), adjustActionInfo.getTextColor(), I1(adjustActionInfo.getLocation()));
            }
        } else if (adjustActionInfo.getAction() == AdjustAction.Copy) {
            ReaderPDFCore readerPDFCore2 = this.G0;
            if (readerPDFCore2 != null) {
                readerPDFCore2.addDoEditActionList(this.c, bVar);
            }
            z2(adjustActionInfo, null);
            w2(adjustActionInfo);
        } else if (this.B.isEmpty()) {
            if (adjustActionInfo.getAction() == AdjustAction.Delete) {
                ReaderPDFCore readerPDFCore3 = this.G0;
                if (readerPDFCore3 != null) {
                    readerPDFCore3.addDoEditActionList(bVar.f18518a, bVar);
                }
            } else if (adjustActionInfo.getAction() == AdjustAction.Saved) {
                ReaderPDFCore readerPDFCore4 = this.G0;
                if (readerPDFCore4 != null) {
                    readerPDFCore4.addDoEditActionList(bVar.f18518a, bVar);
                }
            } else if (this.G0 != null && (pDFFreeTextEditView = bVar.f18523g) != null) {
                this.G0.addDoEditActionList(bVar.f18518a, new ij.b(Annotation.Type.FREETEXT, bVar.f18523g, new AdjustActionInfo(pDFFreeTextEditView.get_id(), adjustActionInfo.getAction(), bVar.f18523g.getText(), bVar.f18523g.getContentWithNewLine(), bVar.f18523g.getOriginFontSize(), bVar.f18523g.getTextColor(), U1(bVar.f18523g.getFrame()), bVar.f18523g.getCopyRootParentId()), this.f21275f, this.f21277g));
                bVar.f18523g.m(adjustActionInfo.getTextContent(), adjustActionInfo.getTextWithNewLine(), adjustActionInfo.getTextSize(), adjustActionInfo.getTextColor(), I1(adjustActionInfo.getLocation()));
            }
        } else {
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                PDFFreeTextEditView pDFFreeTextEditView4 = (PDFFreeTextEditView) it.next();
                if (pDFFreeTextEditView4.get_id() == adjustActionInfo.getId()) {
                    if (adjustActionInfo.getAction() == AdjustAction.Delete) {
                        ReaderPDFCore readerPDFCore5 = this.G0;
                        if (readerPDFCore5 != null) {
                            readerPDFCore5.addDoEditActionList(this.c, bVar);
                        }
                        k2(pDFFreeTextEditView4);
                        return;
                    }
                    lj.b textParamChangedListener2 = getTextParamChangedListener();
                    if (adjustActionInfo.getAction() == AdjustAction.Saved) {
                        ReaderPDFCore readerPDFCore6 = this.G0;
                        if (readerPDFCore6 != null) {
                            readerPDFCore6.addDoEditActionList(this.c, bVar);
                        }
                    } else {
                        this.G0.addDoEditActionList(this.c, new ij.b(Annotation.Type.FREETEXT, pDFFreeTextEditView4, new AdjustActionInfo(pDFFreeTextEditView4.get_id(), adjustActionInfo.getAction(), pDFFreeTextEditView4.getText(), pDFFreeTextEditView4.getContentWithNewLine(), pDFFreeTextEditView4.getOriginFontSize(), pDFFreeTextEditView4.getTextColor(), U1(pDFFreeTextEditView4.getFrame()), pDFFreeTextEditView4.getCopyRootParentId()), this.f21275f, this.f21277g));
                        pDFFreeTextEditView4.m(adjustActionInfo.getTextContent(), adjustActionInfo.getTextWithNewLine(), adjustActionInfo.getTextSize(), adjustActionInfo.getTextColor(), I1(adjustActionInfo.getLocation()));
                    }
                    PDFFreeTextEditView pDFFreeTextEditView5 = this.A;
                    if (pDFFreeTextEditView5 == null) {
                        this.A = pDFFreeTextEditView4;
                        if (textParamChangedListener2 != null) {
                            ((i2) textParamChangedListener2).e(pDFFreeTextEditView4.getTextColor(), pDFFreeTextEditView4.getOriginFontSize());
                        }
                    } else {
                        pDFFreeTextEditView5.setShowBox(false);
                        this.A = pDFFreeTextEditView4;
                        if (textParamChangedListener2 != null) {
                            ((i2) textParamChangedListener2).a(pDFFreeTextEditView4.getTextColor(), pDFFreeTextEditView4.getOriginFontSize());
                        }
                    }
                    w2(adjustActionInfo);
                    return;
                }
            }
        }
    }

    @Override // lib.zj.pdfeditor.a0
    public final void y(long j10) {
        if (j10 > 0) {
            PDFFreeTextEditView pDFFreeTextEditView = this.A;
            if (pDFFreeTextEditView == null) {
                Iterator it = this.B.iterator();
                while (it.hasNext()) {
                    PDFFreeTextEditView pDFFreeTextEditView2 = (PDFFreeTextEditView) it.next();
                    if (pDFFreeTextEditView2.get_id() == j10) {
                        this.A = pDFFreeTextEditView2;
                        pDFFreeTextEditView2.setVisibility(0);
                        pDFFreeTextEditView2.setShowBox(true);
                        pDFFreeTextEditView2.bringToFront();
                        return;
                    }
                }
                return;
            }
            pDFFreeTextEditView.setShowBox(true);
            this.A.bringToFront();
            this.A.setVisibility(0);
        }
    }

    @Override // lib.zj.pdfeditor.PageView
    public final void y1() {
        AsyncTask<String, Void, Void> asyncTask = this.N0;
        if (asyncTask != null) {
            asyncTask.a();
            this.N0 = null;
        }
    }

    public final void y2(int i10, int i11, int i12) {
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            PDFReaderView pDFReaderView = (PDFReaderView) parent;
            pDFReaderView.getClass();
            if (i10 >= 0 && (i11 >= 0 || i12 >= 0)) {
                pDFReaderView.L1 = new mj.h(i10, i11);
                lib.zj.pdfeditor.text.editor.a aVar = pDFReaderView.M1;
                lib.zj.pdfeditor.text.editor.a aVar2 = this.f21180l1;
                if (aVar != null && aVar != aVar2) {
                    aVar.t();
                }
                pDFReaderView.M1 = aVar2;
                return;
            }
            pDFReaderView.L1 = null;
        }
    }

    @Override // mj.b0
    public final void z(RectF rectF) {
        j2(new a1.e(rectF, 9));
    }

    @Override // lib.zj.pdfeditor.PageView
    public final void z1() {
        ReaderPDFCore readerPDFCore = this.G0;
        if (readerPDFCore != null) {
            readerPDFCore.resetSelectRectF();
            PDFFreeTextEditView pDFFreeTextEditView = this.A;
            if (pDFFreeTextEditView != null) {
                if (pDFFreeTextEditView.f21608b0) {
                    pDFFreeTextEditView.setShowBox(false);
                }
                this.A = null;
            }
            if (this.B != null && !this.B.isEmpty()) {
                Iterator it = this.B.iterator();
                while (it.hasNext()) {
                    removeView((PDFFreeTextEditView) it.next());
                }
                this.B.clear();
            }
        }
        this.f21180l1.B();
    }

    public final void z2(AdjustActionInfo adjustActionInfo, PDFFreeTextEditView pDFFreeTextEditView) {
        long id2 = adjustActionInfo.getId();
        String textContent = adjustActionInfo.getTextContent();
        String textWithNewLine = adjustActionInfo.getTextWithNewLine();
        int textSize = adjustActionInfo.getTextSize();
        int textColor = adjustActionInfo.getTextColor();
        RectF I1 = I1(adjustActionInfo.getLocation());
        PDFFreeTextEditView pDFFreeTextEditView2 = new PDFFreeTextEditView(getContext());
        pDFFreeTextEditView2.set_id(id2);
        pDFFreeTextEditView2.setCopyRootParentId(adjustActionInfo.getCopyRootParentId());
        Rect rect = new Rect();
        getLocalVisibleRect(rect);
        pDFFreeTextEditView2.setVisibleRect(rect);
        pDFFreeTextEditView2.setCopyParam(null);
        if (pDFFreeTextEditView != null) {
            pDFFreeTextEditView2.setSavedForUpdate(pDFFreeTextEditView.f21611d0);
            pDFFreeTextEditView2.setSavedTextIndexInFreeTextAnnotationDatas(pDFFreeTextEditView.getSavedTextIndexInFreeTextAnnotationDatas());
        }
        o2(pDFFreeTextEditView2);
        pDFFreeTextEditView2.m(textContent, textWithNewLine, textSize, textColor, I1);
        addView(pDFFreeTextEditView2, new ViewGroup.LayoutParams(-1, -1));
        this.B.add(pDFFreeTextEditView2);
        t2(pDFFreeTextEditView2.getCopyRootParentId());
        lj.b textParamChangedListener = getTextParamChangedListener();
        PDFFreeTextEditView pDFFreeTextEditView3 = this.A;
        if (pDFFreeTextEditView3 == null) {
            this.A = pDFFreeTextEditView2;
            if (textParamChangedListener != null) {
                ((i2) textParamChangedListener).e(pDFFreeTextEditView2.getTextColor(), pDFFreeTextEditView2.getOriginFontSize());
            }
        } else {
            pDFFreeTextEditView3.setShowBox(false);
            this.A = pDFFreeTextEditView2;
            if (textParamChangedListener != null) {
                ((i2) textParamChangedListener).a(pDFFreeTextEditView2.getTextColor(), pDFFreeTextEditView2.getOriginFontSize());
            }
        }
        this.A.requestLayout();
        if (textParamChangedListener != null) {
            this.B.size();
        }
    }

    @Override // mj.b0
    public final void n(RectF rectF) {
    }
}
