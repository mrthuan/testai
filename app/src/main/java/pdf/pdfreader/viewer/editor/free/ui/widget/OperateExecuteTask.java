package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.play.core.assetpacks.b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.m;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.o;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderRoundProgressBar;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;

/* compiled from: OperateExecuteTask.kt */
/* loaded from: classes3.dex */
public final class OperateExecuteTask {
    public TextView A;
    public AppCompatImageView B;
    public AppCompatImageView C;
    public ImageView D;
    public Group E;
    public View F;
    public View G;
    public View H;
    public View I;
    public View J;
    public FrameLayout K;
    public boolean L;
    public pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.h M;
    public TextView N;
    public View O;
    public ImageView P;
    public TextView Q;
    public TextView R;
    public TextView S;
    public FrameLayout T;
    public LinearLayout U;
    public PdfPreviewEntity W;
    public AnimatorSet Y;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public TextView f28224a;

    /* renamed from: b  reason: collision with root package name */
    public ReaderRoundProgressBar f28225b;
    public View c;

    /* renamed from: d  reason: collision with root package name */
    public LinearLayout f28226d;

    /* renamed from: e  reason: collision with root package name */
    public View f28227e;

    /* renamed from: f  reason: collision with root package name */
    public View f28228f;

    /* renamed from: g  reason: collision with root package name */
    public LottieAnimationView f28229g;

    /* renamed from: h  reason: collision with root package name */
    public ViewGroup f28230h;

    /* renamed from: i  reason: collision with root package name */
    public RecyclerView f28231i;

    /* renamed from: j  reason: collision with root package name */
    public View f28232j;

    /* renamed from: k  reason: collision with root package name */
    public MotionLayout f28233k;

    /* renamed from: l  reason: collision with root package name */
    public LinearLayout f28234l;

    /* renamed from: m  reason: collision with root package name */
    public LinearLayout f28235m;

    /* renamed from: n  reason: collision with root package name */
    public TextView f28236n;

    /* renamed from: o  reason: collision with root package name */
    public View f28237o;

    /* renamed from: p  reason: collision with root package name */
    public TextView f28238p;

    /* renamed from: q  reason: collision with root package name */
    public TextView f28239q;

    /* renamed from: r  reason: collision with root package name */
    public a f28240r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f28241s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f28242t;

    /* renamed from: u  reason: collision with root package name */
    public int f28243u;

    /* renamed from: v  reason: collision with root package name */
    public String f28244v;

    /* renamed from: x  reason: collision with root package name */
    public Group f28246x;

    /* renamed from: y  reason: collision with root package name */
    public ViewGroup f28247y;

    /* renamed from: z  reason: collision with root package name */
    public ViewGroup f28248z;

    /* renamed from: w  reason: collision with root package name */
    public LayoutMode f28245w = LayoutMode.Normal;
    public boolean V = true;
    public final int X = ReaderPdfApplication.m().getResources().getDimensionPixelSize(R.dimen.dp_40);

    /* compiled from: OperateExecuteTask.kt */
    /* loaded from: classes3.dex */
    public enum LayoutMode {
        Normal,
        Split
    }

    /* compiled from: OperateExecuteTask.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b(PdfPreviewEntity pdfPreviewEntity);

        void c();

        void d();

        void e(PdfPreviewEntity pdfPreviewEntity);

        void f(PdfPreviewEntity pdfPreviewEntity);

        void g();
    }

    /* compiled from: OperateExecuteTask.kt */
    /* loaded from: classes3.dex */
    public static final class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            LottieAnimationView lottieAnimationView;
            kotlin.jvm.internal.g.e(animation, "animation");
            super.onAnimationEnd(animation);
            OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
            if (operateExecuteTask.V && (lottieAnimationView = operateExecuteTask.f28229g) != null) {
                lottieAnimationView.j();
            }
        }
    }

    /* compiled from: OperateExecuteTask.kt */
    /* loaded from: classes3.dex */
    public static final class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            LottieAnimationView lottieAnimationView;
            kotlin.jvm.internal.g.e(animation, "animation");
            super.onAnimationEnd(animation);
            OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
            if (operateExecuteTask.V && (lottieAnimationView = operateExecuteTask.f28229g) != null) {
                lottieAnimationView.j();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r6 != null) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask r6, android.content.Context r7, int r8) {
        /*
            r6.getClass()
            pdf.pdfreader.viewer.editor.free.ads.n r0 = pdf.pdfreader.viewer.editor.free.ads.n.f23972a
            r0.a()
            pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$LayoutMode r0 = r6.f28245w
            pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$LayoutMode r1 = pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.LayoutMode.Normal
            if (r0 != r1) goto L11
            pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity r6 = r6.W
            goto L32
        L11:
            androidx.recyclerview.widget.RecyclerView r6 = r6.f28231i
            r0 = 0
            if (r6 == 0) goto L1b
            androidx.recyclerview.widget.RecyclerView$Adapter r6 = r6.getAdapter()
            goto L1c
        L1b:
            r6 = r0
        L1c:
            boolean r1 = r6 instanceof pdf.pdfreader.viewer.editor.free.ui.adapter.convert.h
            if (r1 == 0) goto L23
            pdf.pdfreader.viewer.editor.free.ui.adapter.convert.h r6 = (pdf.pdfreader.viewer.editor.free.ui.adapter.convert.h) r6
            goto L24
        L23:
            r6 = r0
        L24:
            if (r6 == 0) goto L34
            java.util.ArrayList r1 = r6.f27202g
            int r6 = r6.f27203h
            java.lang.Object r6 = kotlin.collections.m.t0(r6, r1)
            pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity r6 = (pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity) r6
            if (r6 == 0) goto L34
        L32:
            r2 = r6
            goto L35
        L34:
            r2 = r0
        L35:
            if (r2 == 0) goto L7b
            r6 = 1
            r2.setRecent(r6)
            long r0 = java.lang.System.currentTimeMillis()
            r2.setRecentDate(r0)
            pdf.pdfreader.viewer.editor.free.data.FileRepository.I(r2)
            bm.c r6 = bm.c.b(r7)
            r6.i(r2)
            pdf.pdfreader.viewer.editor.free.ui.vm.AppViewModel r6 = pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.k()
            nl.g r0 = new nl.g
            pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType r1 = pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType.EDIT_PDF
            java.lang.String r3 = r2.getPath()
            java.lang.String r4 = "W3R5cAt0aA=="
            java.lang.String r5 = "Uf2Wjo3H"
            java.lang.String r4 = ea.a.p(r4, r5)
            kotlin.jvm.internal.g.d(r3, r4)
            r0.<init>(r1, r3)
            r6.g(r0)
            java.lang.String r1 = r2.getPath()
            java.lang.String r6 = "dVIETSxDLU4kRWZUNlITUxFMVA=="
            java.lang.String r0 = "Qfe5PHkD"
            java.lang.String r5 = ea.a.p(r6, r0)
            r3 = 1
            r0 = r7
            r4 = r8
            pdf.pdfreader.viewer.editor.free.utils.k0.j(r0, r1, r2, r3, r4, r5)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a(pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask, android.content.Context, int):void");
    }

    public static final void b(OperateExecuteTask operateExecuteTask) {
        boolean z10;
        Context context;
        String str = operateExecuteTask.f28244v;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            TextView textView = operateExecuteTask.f28236n;
            if (textView != null) {
                context = textView.getContext();
            } else {
                context = null;
            }
            tn.a.d(context, ea.a.p("KWlfaQpo", "dCZZoOfF"), ea.a.p("VWklaQBoPW8CZVpfCmw_Y2s=", "GAVt0B9K"), operateExecuteTask.f28244v, false);
        }
    }

    public static final void c(OperateExecuteTask operateExecuteTask) {
        boolean z10;
        Context context;
        String str = operateExecuteTask.f28244v;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            TextView textView = operateExecuteTask.f28236n;
            if (textView != null) {
                context = textView.getContext();
            } else {
                context = null;
            }
            tn.a.d(context, ea.a.p("VWklaQBo", "Tk5rz8sf"), ea.a.p("KWlfaQpoaHI_bittEF8LbFxjaw==", "xQGbRVtp"), operateExecuteTask.g(), false);
        }
    }

    public static final void d(OperateExecuteTask operateExecuteTask) {
        boolean z10;
        Context context;
        String str = operateExecuteTask.f28244v;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            TextView textView = operateExecuteTask.f28236n;
            if (textView != null) {
                context = textView.getContext();
            } else {
                context = null;
            }
            tn.a.d(context, ea.a.p("J2kmaRZo", "tAAHeTBm"), ea.a.p("KWlfaQpoaHMyYThlKmMEaVZr", "w1rx3Djw"), operateExecuteTask.f28244v, false);
        }
    }

    public static ObjectAnimator f(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ea.a.p("Umw7aGE=", "Sx78AHGf"), 0.0f, 1.0f);
        kotlin.jvm.internal.g.d(ofFloat, ea.a.p("XGYNbBxhFigEaVF3RSB0YShwWmFkLGMwASxMMSEp", "glGo0X5a"));
        return ofFloat;
    }

    public static void p(Context context, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        String p10;
        kotlin.jvm.internal.g.e(context, "context");
        if (j10 != 0) {
            long currentTimeMillis = (System.currentTimeMillis() - j10) / 1000;
            boolean z13 = true;
            if (0 <= currentTimeMillis && currentTimeMillis < 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                p10 = ea.a.p("QQ==", "OIAmb9m5");
            } else {
                if (6 <= currentTimeMillis && currentTimeMillis < 11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    p10 = ea.a.p("Qg==", "jIAAfoVL");
                } else {
                    if (11 <= currentTimeMillis && currentTimeMillis < 16) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        p10 = ea.a.p("Qw==", "UqDVjSLu");
                    } else {
                        if (16 > currentTimeMillis || currentTimeMillis >= 21) {
                            z13 = false;
                        }
                        if (z13) {
                            p10 = ea.a.p("RA==", "AcIrI4PX");
                        } else {
                            p10 = ea.a.p("RQ==", "WuGicXrj");
                        }
                    }
                }
            }
            tn.a.d(context, ea.a.p("KWlfaQpo", "nLbBABsb"), ea.a.p("KWlfaQpoaHQzbWU=", "djKWsZsb"), p10, false);
        }
    }

    public final void e() {
        this.f28241s = false;
        ViewGroup viewGroup = this.f28230h;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.f28230h;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        a aVar = this.f28240r;
        if (aVar != null && aVar != null) {
            aVar.d();
        }
    }

    public final String g() {
        if (TextUtils.equals(ea.a.p("QGMqbh1lcg==", "UWwPUSud"), this.f28244v)) {
            return ea.a.p("PGNQbhdlcg==", "kg8LVJOZ");
        }
        if (TextUtils.equals(ea.a.p("SmgmcitfBW1n", "Nw9GNlU2"), this.f28244v)) {
            return ea.a.p("PGhQcmU=", "bjpGL2RB");
        }
        return ea.a.p("Jm1n", "VApKBuNg");
    }

    public final ObjectAnimator h(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ea.a.p("O3JQbgpsVnQzbyRZ", "syhih6BY"), this.X, 0.0f);
        kotlin.jvm.internal.g.d(ofFloat, ea.a.p("XGYNbBxhFigEaVF3RSB0dDZhXHMqYTdpFm4DImkgU3AHMGV0HEYObxN0HClFIGZmKQ==", "yZE75xPD"));
        return ofFloat;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa A[Catch: Exception -> 0x011d, TryCatch #0 {Exception -> 0x011d, blocks: (B:49:0x00a6, B:51:0x00aa, B:54:0x00b2, B:56:0x00b8, B:62:0x00c7, B:65:0x00d0, B:67:0x00d6, B:61:0x00c3), top: B:75:0x00a6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(android.content.Context r8, java.util.List<? extends pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity> r9) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.i(android.content.Context, java.util.List):void");
    }

    public final void j(List<? extends PdfPreviewEntity> list) {
        RecyclerView recyclerView = this.f28231i;
        if (recyclerView != null) {
            if (this.f28243u == 3 && list.size() > 1) {
                TextView textView = this.f28224a;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                recyclerView.setTag(ea.a.p("IG8cZQ==", "QnMnuE9q"));
            } else {
                recyclerView.setTag("");
            }
            Context context = recyclerView.getContext();
            kotlin.jvm.internal.g.d(context, ea.a.p("JnQfYxZuQ2UidA==", "sIhVCWFk"));
            pdf.pdfreader.viewer.editor.free.ui.adapter.convert.h hVar = new pdf.pdfreader.viewer.editor.free.ui.adapter.convert.h(context, this.f28243u);
            kotlin.jvm.internal.g.e(list, "list");
            hVar.f27203h = 0;
            ArrayList arrayList = hVar.f27202g;
            arrayList.clear();
            arrayList.addAll(list);
            hVar.notifyDataSetChanged();
            recyclerView.setAdapter(hVar);
            recyclerView.post(new pdf.pdfreader.viewer.editor.free.feature.ocr.helper.c(this, 7));
        }
    }

    public final void k() {
        pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.h hVar;
        pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.h hVar2 = this.M;
        boolean z10 = false;
        if (hVar2 != null && hVar2.d()) {
            z10 = true;
        }
        if (z10 && (hVar = this.M) != null) {
            hVar.a();
        }
    }

    public final void l() {
        Context context;
        if (this.f28242t) {
            w<ArrayList<PdfPreviewEntity>> wVar = wn.b.f31386a;
            if (wn.b.f31393i) {
                wn.b.f31393i = false;
                try {
                    ViewGroup viewGroup = this.f28230h;
                    if (viewGroup != null) {
                        context = viewGroup.getContext();
                    } else {
                        context = null;
                    }
                    new pdf.pdfreader.viewer.editor.free.ui.dialog.i(context).show();
                } catch (Exception unused) {
                }
                if (this.L) {
                    AppCompatImageView appCompatImageView = this.C;
                    if (appCompatImageView != null) {
                        appCompatImageView.setImageResource(R.drawable.img_enquiry_notreally_check);
                    }
                    ViewGroup viewGroup2 = this.f28248z;
                    if (viewGroup2 != null) {
                        viewGroup2.setEnabled(false);
                    }
                    AppCompatImageView appCompatImageView2 = this.B;
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setVisibility(8);
                    }
                    TextView textView = this.A;
                    if (textView != null) {
                        textView.setEnabled(false);
                    }
                    ViewGroup viewGroup3 = this.f28247y;
                    if (viewGroup3 != null) {
                        viewGroup3.setEnabled(false);
                    }
                } else {
                    s();
                }
            }
        }
        this.L = false;
    }

    public final void m() {
        boolean z10;
        Context context;
        String str = this.f28244v;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            TextView textView = this.f28236n;
            if (textView != null) {
                context = textView.getContext();
            } else {
                context = null;
            }
            tn.a.d(context, ea.a.p("DmknaTVo", "fZhIFI7y"), ea.a.p("CXNSXzJoKnc=", "TEh9AEAK"), this.f28244v, false);
        }
    }

    public final void n() {
        boolean z10;
        Context context;
        String str = this.f28244v;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            TextView textView = this.f28236n;
            if (textView != null) {
                context = textView.getContext();
            } else {
                context = null;
            }
            tn.a.d(context, ea.a.p("VWklaQBo", "42g9b0P0"), ea.a.p("V2k7aSdoZmIpYw1fV2w-Y2s=", "DL1UT9Tk"), this.f28244v, false);
        }
    }

    public final void o() {
        boolean z10;
        Context context;
        String str = this.f28244v;
        boolean z11 = true;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            TextView textView = this.f28236n;
            if (textView != null) {
                context = textView.getContext();
            } else {
                context = null;
            }
            tn.a.d(context, ea.a.p("CWk4aTto", "oVoVHVrP"), ea.a.p("DmkYaT1oZnMgb3c=", "Z8hvN9VM"), this.f28244v, false);
            if (TextUtils.equals(ea.a.p("QGMqbh1lcg==", "4T02Zbyr"), this.f28244v)) {
                AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
                AppCoreFilterEvent.g(ea.a.p("PGNQbktwaGYzbiNzaA==", "6wjChOoT"));
            } else if (!TextUtils.equals(ea.a.p("Jm1n", "KUUEzcMB"), this.f28244v) && !TextUtils.equals(ea.a.p("QGgqchZfC21n", "M8jNSFfO"), this.f28244v)) {
                String str2 = this.f28244v;
                if (str2 == null || !kotlin.text.k.O(str2, ea.a.p("ODJw", "ZMDTRTyo"), false)) {
                    z11 = false;
                }
                if (z11) {
                    AppOpenSource appOpenSource2 = AppCoreFilterEvent.f28650a;
                    AppCoreFilterEvent.g(ea.a.p("RDI7XxVpDGkBaA==", "Qr0zX5ra"));
                }
            } else {
                AppOpenSource appOpenSource3 = AppCoreFilterEvent.f28650a;
                AppCoreFilterEvent.g(ea.a.p("Wm0sMgNfBGkcaUdo", "2RSNF1LY"));
            }
        }
    }

    public final void q(int i10, String str, FrameLayout frameLayout, String str2, List entities, boolean z10, a listener) {
        kotlin.jvm.internal.g.e(entities, "entities");
        kotlin.jvm.internal.g.e(listener, "listener");
        this.Z = true;
        if (i10 != 1 && i10 != 2) {
            b1.Y();
        }
        this.f28243u = i10;
        if (kotlin.jvm.internal.g.a(str, ea.a.p("FWgpcmU=", "gIfHkr3X"))) {
            this.f28244v = ea.a.p("QGgqchZfC21n", "xS0oBRcW");
        } else {
            this.f28244v = str;
        }
        this.V = z10;
        t(i10, frameLayout, "", listener, entities.size());
        MotionLayout motionLayout = this.f28233k;
        if (motionLayout != null) {
            motionLayout.setVisibility(8);
        }
        this.f28241s = false;
        this.f28242t = true;
        TextView textView = this.f28236n;
        if (textView != null) {
            textView.setText(str2);
        }
        if (this.f28245w == LayoutMode.Split) {
            j(entities);
        } else {
            i(frameLayout.getContext(), entities);
        }
        LinearLayout linearLayout = this.f28234l;
        if (linearLayout != null) {
            linearLayout.post(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.f(this, 10));
        }
        o();
        m();
    }

    public final void r() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (this.Z) {
            AnimatorSet animatorSet = this.Y;
            int i10 = 0;
            if (animatorSet != null && animatorSet.isRunning()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (this.f28245w == LayoutMode.Normal) {
                    if (!this.V) {
                        AnimatorSet animatorSet2 = this.Y;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                        }
                        View[] viewArr = {this.f28235m, this.T, this.U, this.K};
                        while (i10 < 4) {
                            View view = viewArr[i10];
                            if (view != null) {
                                view.setAlpha(1.0f);
                                view.setTranslationY(0.0f);
                            }
                            i10++;
                        }
                        return;
                    }
                    List<ViewGroup> I = ge.a.I(this.f28235m, this.T, this.U, this.K);
                    if (!(I instanceof Collection) || !I.isEmpty()) {
                        for (ViewGroup viewGroup : I) {
                            if (viewGroup != null) {
                                z13 = true;
                                continue;
                            } else {
                                z13 = false;
                                continue;
                            }
                            if (!z13) {
                                z14 = false;
                                break;
                            }
                        }
                    }
                    z14 = true;
                    if (z14) {
                        ArrayList arrayList = new ArrayList();
                        int i11 = 0;
                        for (ViewGroup viewGroup2 : I) {
                            if (viewGroup2 != null) {
                                AnimatorSet animatorSet3 = new AnimatorSet();
                                animatorSet3.playTogether(h(viewGroup2), f(viewGroup2));
                                animatorSet3.setDuration(300L);
                                animatorSet3.setStartDelay(Math.max(0, i11 - 1) * ShapeTypes.FLOW_CHART_PREPARATION);
                                if (i11 == 2) {
                                    animatorSet3.addListener(new b());
                                }
                                arrayList.add(animatorSet3);
                                i11++;
                            }
                        }
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        animatorSet4.playTogether(arrayList);
                        animatorSet4.start();
                        this.Z = false;
                        this.Y = animatorSet4;
                    }
                } else if (!this.V) {
                    AnimatorSet animatorSet5 = this.Y;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                    }
                    View[] viewArr2 = {this.f28235m, this.N, this.f28231i, this.f28237o, this.f28226d, this.O, this.K};
                    while (i10 < 7) {
                        View view2 = viewArr2[i10];
                        if (view2 != null) {
                            view2.setAlpha(1.0f);
                            view2.setTranslationY(0.0f);
                        }
                        i10++;
                    }
                } else {
                    List<View> I2 = ge.a.I(this.f28235m, this.N, this.f28231i, this.f28237o, this.f28226d, this.O, this.K);
                    if (!(I2 instanceof Collection) || !I2.isEmpty()) {
                        for (View view3 : I2) {
                            if (view3 != null) {
                                z11 = true;
                                continue;
                            } else {
                                z11 = false;
                                continue;
                            }
                            if (!z11) {
                                z12 = false;
                                break;
                            }
                        }
                    }
                    z12 = true;
                    if (z12) {
                        ArrayList arrayList2 = new ArrayList();
                        int i12 = 0;
                        for (View view4 : I2) {
                            if (view4 != null) {
                                AnimatorSet animatorSet6 = new AnimatorSet();
                                animatorSet6.playTogether(h(view4), f(view4));
                                animatorSet6.setDuration(300L);
                                animatorSet6.setStartDelay(Math.max(0, i12 - 3) * ShapeTypes.FLOW_CHART_PREPARATION);
                                if (i12 == 3) {
                                    animatorSet6.addListener(new c());
                                }
                                arrayList2.add(animatorSet6);
                                i12++;
                            }
                        }
                        AnimatorSet animatorSet7 = new AnimatorSet();
                        animatorSet7.playTogether(arrayList2);
                        animatorSet7.start();
                        this.Z = false;
                        this.Y = animatorSet7;
                    }
                }
            }
        }
    }

    public final void s() {
        Group group = this.E;
        if (group != null) {
            group.setVisibility(0);
        }
        Group group2 = this.f28246x;
        if (group2 != null) {
            group2.setVisibility(8);
        }
    }

    public final void t(int i10, FrameLayout frameLayout, String str, a listener, int i11) {
        int i12;
        Context context;
        String string;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        Context context6;
        Context context7;
        String str2;
        Context context8;
        String str3;
        String str4;
        kotlin.jvm.internal.g.e(listener, "listener");
        this.f28243u = i10;
        this.f28241s = true;
        this.f28242t = false;
        this.f28240r = listener;
        this.f28230h = frameLayout;
        frameLayout.setOnClickListener(new o(9));
        Context context9 = frameLayout.getContext();
        if (i10 == 3 && i11 > 1) {
            this.f28245w = LayoutMode.Split;
            i12 = R.layout.layout_tools_operate_container_r3_large_more;
        } else {
            this.f28245w = LayoutMode.Normal;
            i12 = R.layout.layout_tools_operate_container_r3_large;
        }
        String str5 = null;
        final View inflate = LayoutInflater.from(context9).inflate(i12, (ViewGroup) null, false);
        frameLayout.addView(inflate, new ViewGroup.LayoutParams(-1, -1));
        ((TextView) inflate.findViewById(R.id.tv_desc)).setText(str);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.layout_ad_bottom_result);
        this.c = inflate.findViewById(R.id.fileContainerView);
        this.f28226d = (LinearLayout) inflate.findViewById(R.id.operateOpenLy);
        this.f28227e = inflate.findViewById(R.id.view_ad_bottom_result_space);
        ReaderRoundProgressBar readerRoundProgressBar = (ReaderRoundProgressBar) inflate.findViewById(R.id.progressbar);
        readerRoundProgressBar.setMax(100);
        readerRoundProgressBar.setProgress(1);
        this.f28225b = readerRoundProgressBar;
        View findViewById = inflate.findViewById(R.id.view_tools_status_bar_02);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        kotlin.jvm.internal.g.d(context9, ea.a.p("JW8sdCx4dA==", "g4FBIeqU"));
        layoutParams.height = aj.b.B(context9);
        findViewById.setLayoutParams(layoutParams);
        this.f28231i = (RecyclerView) inflate.findViewById(R.id.operateRv);
        this.f28232j = inflate.findViewById(R.id.rvRuler);
        this.f28228f = inflate.findViewById(R.id.guideCenter);
        this.f28229g = (LottieAnimationView) inflate.findViewById(R.id.doneAnimView);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.lyToast);
        this.f28224a = (TextView) inflate.findViewById(R.id.tvToast);
        ((ImageView) inflate.findViewById(R.id.ivToast)).setImageResource(R.drawable.ic_toast_success);
        TextView textView = this.f28224a;
        if (textView != null) {
            textView.setText(R.string.arg_res_0x7f1300d2);
        }
        Barrier barrier = (Barrier) inflate.findViewById(R.id.barrier);
        this.f28235m = (LinearLayout) inflate.findViewById(R.id.lyTitleTips);
        this.f28236n = (TextView) inflate.findViewById(R.id.tvTitleTips);
        this.f28238p = (TextView) inflate.findViewById(R.id.operateShareTv);
        this.f28239q = (TextView) inflate.findViewById(R.id.operateOpenTv);
        this.F = inflate.findViewById(R.id.enquiry_root_view);
        this.f28246x = (Group) inflate.findViewById(R.id.enquiry_group);
        this.f28247y = (ViewGroup) inflate.findViewById(R.id.enquiry_good_ll);
        this.f28248z = (ViewGroup) inflate.findViewById(R.id.enquiry_not_really_ll);
        this.A = (TextView) inflate.findViewById(R.id.enquiry_tv_good);
        this.B = (AppCompatImageView) inflate.findViewById(R.id.enquiry_good_iv);
        TextView textView2 = (TextView) inflate.findViewById(R.id.enquiry_tv_not_really);
        this.C = (AppCompatImageView) inflate.findViewById(R.id.enquiry_not_really_iv);
        this.D = (ImageView) inflate.findViewById(R.id.enquiry_iv_close);
        this.E = (Group) inflate.findViewById(R.id.enquiry_done_group);
        this.G = inflate.findViewById(R.id.click_annotate);
        this.H = inflate.findViewById(R.id.click_doodle);
        this.I = inflate.findViewById(R.id.click_signature);
        this.J = inflate.findViewById(R.id.click_add_text);
        this.K = (FrameLayout) inflate.findViewById(R.id.operateFl_enquiry);
        TextView textView3 = (TextView) inflate.findViewById(R.id.enquiry_tv_title);
        TextView textView4 = (TextView) inflate.findViewById(R.id.enquiry_tv_don_love_content);
        AppCompatImageView appCompatImageView = this.C;
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(R.drawable.img_emoji_emo);
        }
        AppCompatImageView appCompatImageView2 = this.B;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageResource(R.drawable.img_emoji_happy);
        }
        if (textView4 != null) {
            Resources resources = textView4.getResources();
            if (resources != null) {
                Object[] objArr = new Object[1];
                Resources resources2 = textView4.getResources();
                if (resources2 != null) {
                    str4 = resources2.getString(R.string.arg_res_0x7f13036c);
                } else {
                    str4 = null;
                }
                objArr[0] = str4;
                str3 = resources.getString(R.string.arg_res_0x7f1304ce, objArr);
            } else {
                str3 = null;
            }
            textView4.setText(str3 + "  🎉");
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) inflate.findViewById(R.id.operateHomeImg);
        if (appCompatImageView3 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView3, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findCommonView$1
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
                    OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
                    String str6 = operateExecuteTask.f28244v;
                    if (!(str6 == null || str6.length() == 0)) {
                        TextView textView5 = operateExecuteTask.f28236n;
                        tn.a.d(textView5 != null ? textView5.getContext() : null, ea.a.p("KWlfaQpo", "VJRfUkKB"), ea.a.p("KWlfaQpoaGg1bS9fFmwBY2s=", "suCek1Zt"), operateExecuteTask.f28244v, false);
                    }
                    OperateExecuteTask.a aVar = OperateExecuteTask.this.f28240r;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            });
        }
        switch (this.f28243u) {
            case 0:
                if (textView3 != null && (context = textView3.getContext()) != null) {
                    string = context.getString(R.string.arg_res_0x7f13019b);
                    break;
                }
                string = null;
                break;
            case 1:
                if (textView3 != null && (context2 = textView3.getContext()) != null) {
                    string = context2.getString(R.string.arg_res_0x7f130229);
                    break;
                }
                string = null;
                break;
            case 2:
                if (textView3 != null && (context3 = textView3.getContext()) != null) {
                    string = context3.getString(R.string.arg_res_0x7f130565);
                    break;
                }
                string = null;
                break;
            case 3:
                if (textView3 != null && (context4 = textView3.getContext()) != null) {
                    string = context4.getString(R.string.arg_res_0x7f130486);
                    break;
                }
                string = null;
                break;
            case 4:
                if (textView3 != null && (context5 = textView3.getContext()) != null) {
                    string = context5.getString(R.string.arg_res_0x7f130259);
                    break;
                }
                string = null;
                break;
            case 5:
                if (textView3 != null && (context6 = textView3.getContext()) != null) {
                    string = context6.getString(R.string.arg_res_0x7f13058f);
                    break;
                }
                string = null;
                break;
            case 6:
                if (textView3 != null && (context7 = textView3.getContext()) != null) {
                    string = context7.getString(R.string.arg_res_0x7f130453);
                    break;
                }
                string = null;
                break;
            default:
                if (textView3 != null && (context8 = textView3.getContext()) != null) {
                    string = context8.getString(R.string.arg_res_0x7f13019b);
                    break;
                }
                string = null;
                break;
        }
        if (textView3 != null) {
            Context context10 = textView3.getContext();
            if (context10 != null) {
                str2 = context10.getString(R.string.arg_res_0x7f130445, string);
            } else {
                str2 = null;
            }
            textView3.setText(str2);
        }
        View view = this.G;
        if (view != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findCommonView$2
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
                    OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
                    String str6 = operateExecuteTask.f28244v;
                    if (!(str6 == null || str6.length() == 0)) {
                        TextView textView5 = operateExecuteTask.f28236n;
                        tn.a.d(textView5 != null ? textView5.getContext() : null, ea.a.p("VWklaQBo", "SEUxfWfy"), ea.a.p("VWklaQBoPWEcblt0CHQzXydsW2Nr", "xaNJPuqU"), operateExecuteTask.f28244v, false);
                    }
                    OperateExecuteTask.a(OperateExecuteTask.this, it.getContext(), 1);
                }
            });
        }
        View view2 = this.H;
        if (view2 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findCommonView$3
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view3) {
                    invoke2(view3);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
                    String str6 = operateExecuteTask.f28244v;
                    if (!(str6 == null || str6.length() == 0)) {
                        TextView textView5 = operateExecuteTask.f28236n;
                        tn.a.d(textView5 != null ? textView5.getContext() : null, ea.a.p("H2k6aSNo", "rhyTP9KV"), ea.a.p("EWkmaT5oa2QnbwJsUV80bFFjaw==", "nYwHM4A6"), operateExecuteTask.f28244v, false);
                    }
                    OperateExecuteTask.a(OperateExecuteTask.this, it.getContext(), 3);
                }
            });
        }
        View view3 = this.I;
        if (view3 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view3, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findCommonView$4
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view4) {
                    invoke2(view4);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
                    String str6 = operateExecuteTask.f28244v;
                    if (!(str6 == null || str6.length() == 0)) {
                        TextView textView5 = operateExecuteTask.f28236n;
                        tn.a.d(textView5 != null ? textView5.getContext() : null, ea.a.p("HGkqaQFo", "VwzDrDH2"), ea.a.p("VWklaQBoPXMbZ1pfCmw_Y2s=", "aH7swhnT"), operateExecuteTask.f28244v, false);
                    }
                    OperateExecuteTask.a(OperateExecuteTask.this, it.getContext(), 4);
                }
            });
        }
        View view4 = this.J;
        if (view4 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view4, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findCommonView$5
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view5) {
                    invoke2(view5);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
                    String str6 = operateExecuteTask.f28244v;
                    if (!(str6 == null || str6.length() == 0)) {
                        TextView textView5 = operateExecuteTask.f28236n;
                        tn.a.d(textView5 != null ? textView5.getContext() : null, ea.a.p("VWklaQBo", "PyF0ONHb"), ea.a.p("KWlfaQpoaGE-ZBV0EHgcX1ZsB2Nr", "6FfrG3ey"), operateExecuteTask.f28244v, false);
                    }
                    OperateExecuteTask.a(OperateExecuteTask.this, it.getContext(), 2);
                }
            });
        }
        ImageView imageView = this.D;
        if (imageView != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(imageView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findCommonView$6
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view5) {
                    invoke2(view5);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
                    String str6 = operateExecuteTask.f28244v;
                    if (!(str6 == null || str6.length() == 0)) {
                        TextView textView5 = operateExecuteTask.f28236n;
                        tn.a.d(textView5 != null ? textView5.getContext() : null, ea.a.p("HmkfaQto", "lfxqxWwK"), ea.a.p("UnMgXxBsDXMXX1dsAGNr", "qsVKs2i0"), operateExecuteTask.f28244v, false);
                    }
                    View view5 = OperateExecuteTask.this.F;
                    if (view5 == null) {
                        return;
                    }
                    view5.setVisibility(8);
                }
            });
        }
        ViewGroup viewGroup = this.f28247y;
        if (viewGroup != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(viewGroup, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findCommonView$7
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view5) {
                    invoke2(view5);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
                    String str6 = operateExecuteTask.f28244v;
                    if (!(str6 == null || str6.length() == 0)) {
                        TextView textView5 = operateExecuteTask.f28236n;
                        tn.a.d(textView5 != null ? textView5.getContext() : null, ea.a.p("KWlfaQpo", "UXGLvho3"), ea.a.p("WHNTXxRvP2QXYwppV2s=", "Zc98sPfJ"), operateExecuteTask.f28244v, false);
                    }
                    if (eo.e.l(ReaderPdfApplication.m().getApplicationContext())) {
                        OperateExecuteTask.this.s();
                    } else {
                        eo.d.c(it.getContext(), ea.a.p("Nw==", "EC46GoUz"), new a(OperateExecuteTask.this, it));
                    }
                }

                /* compiled from: OperateExecuteTask.kt */
                /* loaded from: classes3.dex */
                public static final class a implements oe.a {

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ OperateExecuteTask f28252a;

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ View f28253b;

                    public a(OperateExecuteTask operateExecuteTask, View view) {
                        this.f28252a = operateExecuteTask;
                        this.f28253b = view;
                    }

                    @Override // oe.a
                    public final void e(int i10) {
                        if (i10 == -1 || i10 == 5) {
                            OperateExecuteTask operateExecuteTask = this.f28252a;
                            if (i10 == 5) {
                                Context context = this.f28253b.getContext();
                                kotlin.jvm.internal.g.d(context, ea.a.p("WnRlYxxuFmUKdA==", "0UNRngx4"));
                                operateExecuteTask.getClass();
                                pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.h hVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.h();
                                operateExecuteTask.M = hVar;
                                hVar.f28986a = hVar;
                                hVar.c(context);
                            }
                            operateExecuteTask.s();
                        }
                    }

                    @Override // oe.a
                    public final void a() {
                    }

                    @Override // oe.a
                    public final void b() {
                    }

                    @Override // oe.a
                    public final void c() {
                    }

                    @Override // oe.a
                    public final void d() {
                    }
                }
            });
        }
        ViewGroup viewGroup2 = this.f28248z;
        if (viewGroup2 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(viewGroup2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findCommonView$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view5) {
                    invoke2(view5);
                    return tf.d.f30009a;
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:3:0x0005, B:5:0x000d, B:12:0x001a, B:14:0x001e, B:16:0x0024, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0067, B:24:0x006b), top: B:27:0x0005 }] */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:3:0x0005, B:5:0x000d, B:12:0x001a, B:14:0x001e, B:16:0x0024, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0067, B:24:0x006b), top: B:27:0x0005 }] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:3:0x0005, B:5:0x000d, B:12:0x001a, B:14:0x001e, B:16:0x0024, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0067, B:24:0x006b), top: B:27:0x0005 }] */
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void invoke2(android.view.View r8) {
                    /*
                        r7 = this;
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.g.e(r8, r0)
                        pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask r8 = pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.this     // Catch: java.lang.Exception -> L6e
                        java.lang.String r0 = r8.f28244v     // Catch: java.lang.Exception -> L6e
                        r1 = 1
                        r2 = 0
                        if (r0 == 0) goto L16
                        int r0 = r0.length()     // Catch: java.lang.Exception -> L6e
                        if (r0 != 0) goto L14
                        goto L16
                    L14:
                        r0 = r2
                        goto L17
                    L16:
                        r0 = r1
                    L17:
                        r3 = 0
                        if (r0 != 0) goto L3a
                        android.widget.TextView r0 = r8.f28236n     // Catch: java.lang.Exception -> L6e
                        if (r0 == 0) goto L23
                        android.content.Context r0 = r0.getContext()     // Catch: java.lang.Exception -> L6e
                        goto L24
                    L23:
                        r0 = r3
                    L24:
                        java.lang.String r4 = "VWklaQBo"
                        java.lang.String r5 = "Ef0dWzSJ"
                        java.lang.String r4 = ea.a.p(r4, r5)     // Catch: java.lang.Exception -> L6e
                        java.lang.String r5 = "UnMgXx1vFnIXYVhsEF81bC1jaw=="
                        java.lang.String r6 = "xH4T85ZC"
                        java.lang.String r5 = ea.a.p(r5, r6)     // Catch: java.lang.Exception -> L6e
                        java.lang.String r8 = r8.f28244v     // Catch: java.lang.Exception -> L6e
                        tn.a.d(r0, r4, r5, r8, r2)     // Catch: java.lang.Exception -> L6e
                    L3a:
                        pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask r8 = pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.this     // Catch: java.lang.Exception -> L6e
                        r8.L = r1     // Catch: java.lang.Exception -> L6e
                        android.content.Intent r8 = new android.content.Intent     // Catch: java.lang.Exception -> L6e
                        android.view.View r0 = r2     // Catch: java.lang.Exception -> L6e
                        if (r0 == 0) goto L49
                        android.content.Context r0 = r0.getContext()     // Catch: java.lang.Exception -> L6e
                        goto L4a
                    L49:
                        r0 = r3
                    L4a:
                        java.lang.Class<pdf.pdfreader.viewer.editor.free.ui.act.ReaderFeedbackActivity> r1 = pdf.pdfreader.viewer.editor.free.ui.act.ReaderFeedbackActivity.class
                        r8.<init>(r0, r1)     // Catch: java.lang.Exception -> L6e
                        java.lang.String r0 = "R2Fn"
                        java.lang.String r1 = "pBigE03R"
                        java.lang.String r0 = ea.a.p(r0, r1)     // Catch: java.lang.Exception -> L6e
                        java.lang.String r1 = "LG9fdhxyQ18oZTl1GXQ="
                        java.lang.String r2 = "tM8YeCOz"
                        java.lang.String r1 = ea.a.p(r1, r2)     // Catch: java.lang.Exception -> L6e
                        r8.putExtra(r0, r1)     // Catch: java.lang.Exception -> L6e
                        android.view.View r0 = r2     // Catch: java.lang.Exception -> L6e
                        if (r0 == 0) goto L6b
                        android.content.Context r3 = r0.getContext()     // Catch: java.lang.Exception -> L6e
                    L6b:
                        pdf.pdfreader.viewer.editor.free.utils.h1.startActivity(r3, r8)     // Catch: java.lang.Exception -> L6e
                    L6e:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findCommonView$8.invoke2(android.view.View):void");
                }
            });
        }
        if (this.f28245w == LayoutMode.Split) {
            ea.a.p("VG8LdDVpJmU6Vg9ldw==", "V37eTHC1");
            this.N = (TextView) inflate.findViewById(R.id.tvSavePath);
            this.f28237o = inflate.findViewById(R.id.operate_v_more_bg);
            View findViewById2 = inflate.findViewById(R.id.operateFl_continue_editing);
            this.O = findViewById2;
            View[] viewArr = {this.f28235m, this.N, this.f28231i, this.f28237o, this.f28226d, findViewById2, this.K};
            for (int i13 = 0; i13 < 7; i13++) {
                View view5 = viewArr[i13];
                if (view5 != null) {
                    view5.setAlpha(0.0f);
                    view5.setTranslationY(100.0f);
                }
            }
            TextView textView5 = this.f28239q;
            if (textView5 != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView5, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findSplitView$1
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(View view6) {
                        invoke2(view6);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(View it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        RecyclerView recyclerView = OperateExecuteTask.this.f28231i;
                        RecyclerView.Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
                        pdf.pdfreader.viewer.editor.free.ui.adapter.convert.h hVar = adapter instanceof pdf.pdfreader.viewer.editor.free.ui.adapter.convert.h ? (pdf.pdfreader.viewer.editor.free.ui.adapter.convert.h) adapter : null;
                        if (hVar != null) {
                            PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) m.t0(hVar.f27203h, hVar.f27202g);
                            if (pdfPreviewEntity != null) {
                                OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
                                OperateExecuteTask.b(operateExecuteTask);
                                OperateExecuteTask.a aVar = operateExecuteTask.f28240r;
                                if (aVar != null) {
                                    aVar.b(pdfPreviewEntity);
                                }
                            }
                        }
                    }
                });
            }
            TextView textView6 = this.f28238p;
            if (textView6 != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView6, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findSplitView$2
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(View view6) {
                        invoke2(view6);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(View it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        RecyclerView recyclerView = OperateExecuteTask.this.f28231i;
                        RecyclerView.Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
                        pdf.pdfreader.viewer.editor.free.ui.adapter.convert.h hVar = adapter instanceof pdf.pdfreader.viewer.editor.free.ui.adapter.convert.h ? (pdf.pdfreader.viewer.editor.free.ui.adapter.convert.h) adapter : null;
                        if (hVar != null) {
                            PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) m.t0(hVar.f27203h, hVar.f27202g);
                            if (pdfPreviewEntity != null) {
                                OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
                                OperateExecuteTask.d(operateExecuteTask);
                                OperateExecuteTask.a aVar = operateExecuteTask.f28240r;
                                if (aVar != null) {
                                    aVar.f(pdfPreviewEntity);
                                }
                            }
                        }
                    }
                });
            }
        } else {
            ea.a.p("UG8ldBJpDGUAVl1ldw==", "jeNwp4DS");
            this.P = (ImageView) inflate.findViewById(R.id.pdf_cover);
            this.Q = (TextView) inflate.findViewById(R.id.pdf_name);
            this.R = (TextView) inflate.findViewById(R.id.pageIndex);
            this.S = (TextView) inflate.findViewById(R.id.pdf_path);
            this.T = (FrameLayout) inflate.findViewById(R.id.operateContent);
            this.U = (LinearLayout) inflate.findViewById(R.id.operateLl_continue_editing);
            if (i10 == 0 || i10 == 6) {
                View findViewById3 = inflate.findViewById(R.id.pdf_name);
                if (findViewById3 != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.e(findViewById3, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findNormalView$1
                        {
                            super(1);
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ tf.d invoke(View view6) {
                            invoke2(view6);
                            return tf.d.f30009a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(View it) {
                            kotlin.jvm.internal.g.e(it, "it");
                            OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
                            PdfPreviewEntity pdfPreviewEntity = operateExecuteTask.W;
                            if (pdfPreviewEntity != null) {
                                OperateExecuteTask.c(operateExecuteTask);
                                OperateExecuteTask.a aVar = operateExecuteTask.f28240r;
                                if (aVar != null) {
                                    aVar.e(pdfPreviewEntity);
                                }
                            }
                        }
                    });
                }
                View findViewById4 = inflate.findViewById(R.id.rename_iv);
                if (findViewById4 != null) {
                    findViewById4.setVisibility(0);
                }
                if (findViewById4 != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.e(findViewById4, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findNormalView$2
                        {
                            super(1);
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ tf.d invoke(View view6) {
                            invoke2(view6);
                            return tf.d.f30009a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(View it) {
                            kotlin.jvm.internal.g.e(it, "it");
                            OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
                            PdfPreviewEntity pdfPreviewEntity = operateExecuteTask.W;
                            if (pdfPreviewEntity != null) {
                                OperateExecuteTask.c(operateExecuteTask);
                                OperateExecuteTask.a aVar = operateExecuteTask.f28240r;
                                if (aVar != null) {
                                    aVar.e(pdfPreviewEntity);
                                }
                            }
                        }
                    });
                }
                View findViewById5 = inflate.findViewById(R.id.view_rename_dash_line);
                if (findViewById5 != null) {
                    findViewById5.setVisibility(0);
                }
                if (findViewById5 != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.e(findViewById5, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findNormalView$3
                        {
                            super(1);
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ tf.d invoke(View view6) {
                            invoke2(view6);
                            return tf.d.f30009a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(View it) {
                            kotlin.jvm.internal.g.e(it, "it");
                            OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
                            PdfPreviewEntity pdfPreviewEntity = operateExecuteTask.W;
                            if (pdfPreviewEntity != null) {
                                OperateExecuteTask.c(operateExecuteTask);
                                OperateExecuteTask.a aVar = operateExecuteTask.f28240r;
                                if (aVar != null) {
                                    aVar.e(pdfPreviewEntity);
                                }
                            }
                        }
                    });
                }
                TextView textView7 = (TextView) inflate.findViewById(R.id.continue_editing_tv_title);
                if (textView7 != null) {
                    textView7.setText(R.string.arg_res_0x7f130264);
                }
                Group group = (Group) inflate.findViewById(R.id.group_continue_scan);
                if (group != null) {
                    group.setVisibility(0);
                }
                View findViewById6 = inflate.findViewById(R.id.click_continue_scan);
                if (findViewById6 != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.e(findViewById6, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findNormalView$4
                        {
                            super(1);
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ tf.d invoke(View view6) {
                            invoke2(view6);
                            return tf.d.f30009a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(View it) {
                            kotlin.jvm.internal.g.e(it, "it");
                            OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
                            String str6 = operateExecuteTask.f28244v;
                            if (!(str6 == null || str6.length() == 0)) {
                                TextView textView8 = operateExecuteTask.f28236n;
                                tn.a.d(textView8 != null ? textView8.getContext() : null, ea.a.p("VWklaQBo", "QOdTSkgZ"), ea.a.p("KWlfaQpoaHM5YSRfFmwBY2s=", "jRRjEmrF"), operateExecuteTask.g(), false);
                            }
                            OperateExecuteTask.a aVar = OperateExecuteTask.this.f28240r;
                            if (aVar != null) {
                                aVar.g();
                            }
                        }
                    });
                }
            }
            View[] viewArr2 = {this.T, this.f28235m, this.U, this.K};
            for (int i14 = 0; i14 < 4; i14++) {
                View view6 = viewArr2[i14];
                if (view6 != null) {
                    view6.setAlpha(0.0f);
                    view6.setTranslationY(100.0f);
                }
            }
            TextView textView8 = this.f28239q;
            if (textView8 != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView8, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findNormalView$5
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(View view7) {
                        invoke2(view7);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(View it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
                        PdfPreviewEntity pdfPreviewEntity = operateExecuteTask.W;
                        if (pdfPreviewEntity != null) {
                            OperateExecuteTask.b(operateExecuteTask);
                            OperateExecuteTask.a aVar = operateExecuteTask.f28240r;
                            if (aVar != null) {
                                aVar.b(pdfPreviewEntity);
                            }
                        }
                    }
                });
            }
            TextView textView9 = this.f28238p;
            if (textView9 != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView9, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$findNormalView$6
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(View view7) {
                        invoke2(view7);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(View it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        OperateExecuteTask operateExecuteTask = OperateExecuteTask.this;
                        PdfPreviewEntity pdfPreviewEntity = operateExecuteTask.W;
                        if (pdfPreviewEntity != null) {
                            OperateExecuteTask.d(operateExecuteTask);
                            OperateExecuteTask.a aVar = operateExecuteTask.f28240r;
                            if (aVar != null) {
                                aVar.f(pdfPreviewEntity);
                            }
                        }
                    }
                });
            }
        }
        View findViewById7 = inflate.findViewById(R.id.operateCloseImg);
        kotlin.jvm.internal.g.d(findViewById7, ea.a.p("LG9fdBhpWWUoViNlAi4OaVtkOGkgdyd5t4DEZS4-QVJhaVUuFnBScjt0L0MZbxtlfG0JKQ==", "EpvZUbYi"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(findViewById7, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask$start$3
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view7) {
                invoke2(view7);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                OperateExecuteTask.this.n();
                OperateExecuteTask.a aVar = OperateExecuteTask.this.f28240r;
                if (aVar != null) {
                    aVar.c();
                }
            }
        });
        sn.d.d().getClass();
        String c10 = a6.h.c(sn.d.e(), "split");
        TextView textView10 = this.N;
        if (textView10 != null) {
            Resources resources3 = textView10.getResources();
            if (resources3 != null) {
                str5 = resources3.getString(R.string.arg_res_0x7f1302ff, c10);
            }
            textView10.setText(str5);
        }
        this.f28234l = (LinearLayout) frameLayout.findViewById(R.id.motionLayoutContainer2);
        MotionLayout motionLayout = (MotionLayout) frameLayout.findViewById(R.id.motionLayout1);
        motionLayout.setTransitionListener(new pdf.pdfreader.viewer.editor.free.ui.widget.b(this));
        this.f28233k = motionLayout;
    }
}
