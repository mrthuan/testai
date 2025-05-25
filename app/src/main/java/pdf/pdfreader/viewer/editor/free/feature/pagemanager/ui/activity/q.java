package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

import am.e2;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25340a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PDFPageManagerActivity f25341b;

    public /* synthetic */ q(PDFPageManagerActivity pDFPageManagerActivity, int i10) {
        this.f25340a = i10;
        this.f25341b = pDFPageManagerActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [int[], java.lang.Object, java.io.Serializable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        View view;
        char c;
        View contentView;
        int i11 = this.f25340a;
        Boolean bool = null;
        final PDFPageManagerActivity pDFPageManagerActivity = this.f25341b;
        switch (i11) {
            case 0:
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "EhA862L2"));
                ReaderPDFCore readerPDFCore = pDFPageManagerActivity.f25317x;
                if (readerPDFCore != null) {
                    readerPDFCore.onDestroy();
                }
                pDFPageManagerActivity.f25317x = null;
                return;
            case 1:
                PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("R2gic1cw", "P2sfgQ5o"));
                ArrayList<bn.a> arrayList = (ArrayList) an.a.c.d();
                if (arrayList != null) {
                    if (arrayList.size() > 1) {
                        kotlin.collections.j.j0(arrayList, new y());
                    }
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.g.h0(arrayList, 10));
                    for (bn.a aVar3 : arrayList) {
                        arrayList2.add(Integer.valueOf(aVar3.f5491e));
                    }
                    ReaderPDFCore readerPDFCore2 = pDFPageManagerActivity.f25317x;
                    if (readerPDFCore2 != null) {
                        bool = Boolean.valueOf(readerPDFCore2.deletePage(kotlin.collections.m.D0(arrayList2)));
                    }
                    if (kotlin.jvm.internal.g.a(bool, Boolean.TRUE)) {
                        ReaderPDFCore readerPDFCore3 = pDFPageManagerActivity.f25317x;
                        if (readerPDFCore3 != null) {
                            ij.e eVar = new ij.e();
                            eVar.f18535a = 2;
                            eVar.f18537d = arrayList2;
                            readerPDFCore3.addPageManagerAction(eVar);
                        }
                        pDFPageManagerActivity.f25313t.post(new f0.s(20, pDFPageManagerActivity, arrayList));
                        return;
                    }
                    return;
                }
                return;
            default:
                PDFPageManagerActivity.a aVar4 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "4PFsfIpv"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(pDFPageManagerActivity) && (i10 = pDFPageManagerActivity.P) >= 0 && i10 < pDFPageManagerActivity.q2().getItemCount()) {
                    RecyclerView.m layoutManager = pDFPageManagerActivity.o2().f1284x.getLayoutManager();
                    if (layoutManager != null) {
                        view = layoutManager.C(pDFPageManagerActivity.P);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        ?? r12 = new int[2];
                        view.getLocationOnScreen(r12);
                        View inflate = LayoutInflater.from(pDFPageManagerActivity).inflate(R.layout.pop_page_manager_tap_guide, (ViewGroup) null, false);
                        int i12 = R.id.iv_arrow_up_center;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_arrow_up_center);
                        if (appCompatImageView != null) {
                            i12 = R.id.iv_arrow_up_end;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_arrow_up_end);
                            if (appCompatImageView2 != null) {
                                i12 = R.id.iv_arrow_up_start;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_arrow_up_start);
                                if (appCompatImageView3 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                    int i13 = R.id.tv_content_title;
                                    TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_content_title);
                                    if (textView != null) {
                                        i13 = R.id.v_content_bg;
                                        LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.v_content_bg);
                                        if (linearLayout != null) {
                                            i13 = R.id.viewPlaceHolder;
                                            View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.viewPlaceHolder);
                                            if (u7 != null) {
                                                e2 e2Var = new e2(constraintLayout, appCompatImageView, appCompatImageView2, appCompatImageView3, constraintLayout, textView, linearLayout, u7);
                                                ea.a.p("Wm4ebCN0CChCIEYgFCB3IBggciBpIBYgloDXLHFmI2xAZXIgYiBNIGggRiAUIHcgGCByKQ==", "b73xBmHJ");
                                                PopupWindow popupWindow = new PopupWindow(constraintLayout, -1, -2);
                                                pDFPageManagerActivity.f25282u0 = popupWindow;
                                                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.x
                                                    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
                                                        if (r0.isRunning() == true) goto L5;
                                                     */
                                                    @Override // android.widget.PopupWindow.OnDismissListener
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                                    */
                                                    public final void onDismiss() {
                                                        /*
                                                            r3 = this;
                                                            pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$a r0 = pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity.H0
                                                            java.lang.String r0 = "R2gic1cw"
                                                            java.lang.String r1 = "lPp9TSCo"
                                                            java.lang.String r0 = ea.a.p(r0, r1)
                                                            pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity r1 = pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity.this
                                                            kotlin.jvm.internal.g.e(r1, r0)
                                                            am.p r0 = r1.o2()
                                                            android.view.View r0 = r0.f1275o
                                                            r2 = 8
                                                            r0.setVisibility(r2)
                                                            android.animation.ObjectAnimator r0 = r1.f25283v0
                                                            if (r0 == 0) goto L26
                                                            boolean r0 = r0.isRunning()
                                                            r2 = 1
                                                            if (r0 != r2) goto L26
                                                            goto L27
                                                        L26:
                                                            r2 = 0
                                                        L27:
                                                            if (r2 == 0) goto L30
                                                            android.animation.ObjectAnimator r0 = r1.f25283v0
                                                            if (r0 == 0) goto L30
                                                            r0.cancel()
                                                        L30:
                                                            return
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.x.onDismiss():void");
                                                    }
                                                });
                                                PopupWindow popupWindow2 = pDFPageManagerActivity.f25282u0;
                                                if (popupWindow2 != null) {
                                                    popupWindow2.setBackgroundDrawable(new ColorDrawable(0));
                                                }
                                                PopupWindow popupWindow3 = pDFPageManagerActivity.f25282u0;
                                                if (popupWindow3 != null) {
                                                    popupWindow3.setOutsideTouchable(false);
                                                }
                                                PopupWindow popupWindow4 = pDFPageManagerActivity.f25282u0;
                                                if (popupWindow4 != null) {
                                                    popupWindow4.setFocusable(false);
                                                }
                                                PopupWindow popupWindow5 = pDFPageManagerActivity.f25282u0;
                                                if (popupWindow5 != null && (contentView = popupWindow5.getContentView()) != null) {
                                                    contentView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                                }
                                                constraintLayout.setOnClickListener(new p(pDFPageManagerActivity, 1));
                                                linearLayout.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.o(1));
                                                ea.a.p("Q287QhpuBmkcZxp2AGUhUChhUWUOby9kEHI=", "uBYaycVM");
                                                pdf.pdfreader.viewer.editor.free.utils.extension.g.e(u7, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$showTapJumpGuidePop$4
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
                                                        PDFPageManagerActivity pDFPageManagerActivity2 = PDFPageManagerActivity.this;
                                                        PDFPageManagerActivity.a aVar5 = PDFPageManagerActivity.H0;
                                                        pDFPageManagerActivity2.j2();
                                                        if (PDFPageManagerActivity.this.t2()) {
                                                            PDFPageManagerActivity pDFPageManagerActivity3 = PDFPageManagerActivity.this;
                                                            String string = pDFPageManagerActivity3.getString(R.string.arg_res_0x7f13010e);
                                                            kotlin.jvm.internal.g.d(string, ea.a.p("EmU2U0dyIW4vKDQuR3QlaVZnfGUtaUJfHW0QZzRfNmkFcx1tQGcp", "GluB3HHh"));
                                                            pDFPageManagerActivity3.M2(1, string);
                                                            return;
                                                        }
                                                        PDFPageManagerActivity pDFPageManagerActivity4 = PDFPageManagerActivity.this;
                                                        int i14 = pDFPageManagerActivity4.P;
                                                        if (pDFPageManagerActivity4.Q != null) {
                                                            pDFPageManagerActivity4.finish();
                                                        }
                                                    }
                                                });
                                                ea.a.p("Q287QhpuBmkcZxp2AGUhUChhUWUOby9kHHI=", "y3LF8Eu5");
                                                ViewGroup.LayoutParams layoutParams = u7.getLayoutParams();
                                                if (layoutParams != null) {
                                                    ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                                                    ((ViewGroup.MarginLayoutParams) bVar).width = view.getWidth();
                                                    ((ViewGroup.MarginLayoutParams) bVar).height = view.getHeight();
                                                    ((ViewGroup.MarginLayoutParams) bVar).leftMargin = r12[0] - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_20);
                                                    u7.setLayoutParams(bVar);
                                                    RecyclerView.m layoutManager2 = pDFPageManagerActivity.o2().f1284x.getLayoutManager();
                                                    kotlin.jvm.internal.g.c(layoutManager2, ea.a.p("OXU8bFZjIm4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAjeSBlVmEtZDpvD2RMLiVlW3kxbCxyQGkRd193OGQlZSMuF3IfZA9hMW8TdHlhOWFfZXI=", "9lWPvCeI"));
                                                    if (((GridLayoutManager) layoutManager2).F == 3) {
                                                        int i14 = pDFPageManagerActivity.P % 3;
                                                        if (i14 == 0) {
                                                            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(pDFPageManagerActivity)) {
                                                                linearLayout.post(new a6.g(2, e2Var, r12, view, pDFPageManagerActivity));
                                                                appCompatImageView3.setVisibility(4);
                                                                appCompatImageView2.setVisibility(0);
                                                                appCompatImageView.setVisibility(4);
                                                            } else {
                                                                ea.a.p("Q287QhpuBmkcZxp2Km84dCFuRkJn", "Jh5UNVPE");
                                                                ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                                                                if (layoutParams2 != null) {
                                                                    ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
                                                                    ((ViewGroup.MarginLayoutParams) bVar2).leftMargin = ((((view.getWidth() / 2) + r12[0]) - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_42)) - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_9)) - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_28);
                                                                    linearLayout.setLayoutParams(bVar2);
                                                                    appCompatImageView3.setVisibility(0);
                                                                    appCompatImageView2.setVisibility(4);
                                                                    appCompatImageView.setVisibility(4);
                                                                } else {
                                                                    throw new NullPointerException(ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuXW5KbgBsHiA7eUFlWWFZZChvI2QNLgtvW3MaciRpC3ReYR5vAHRcdyZkVmUNLnRvNHM-chRpBnR5YRdvMHRLTFN5CHUBUBNyLm1z", "fEms2gur"));
                                                                }
                                                            }
                                                        } else if (i14 == 1) {
                                                            linearLayout.post(new a7.a(2, e2Var, r12, view, pDFPageManagerActivity));
                                                            appCompatImageView3.setVisibility(4);
                                                            appCompatImageView2.setVisibility(4);
                                                            appCompatImageView.setVisibility(0);
                                                        } else if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(pDFPageManagerActivity)) {
                                                            ea.a.p("Q287QhpuBmkcZxp2Km84dCFuRkJn", "YFwDL5aK");
                                                            ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                                                            if (layoutParams3 != null) {
                                                                ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
                                                                ((ViewGroup.MarginLayoutParams) bVar3).leftMargin = ((((view.getWidth() / 2) + r12[0]) - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_42)) - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_9)) - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_28);
                                                                linearLayout.setLayoutParams(bVar3);
                                                                appCompatImageView3.setVisibility(0);
                                                                appCompatImageView2.setVisibility(4);
                                                                appCompatImageView.setVisibility(4);
                                                            } else {
                                                                throw new NullPointerException(ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuBm5pbg9sCyA7eUFlWWFZZChvI2QNLgtvW3MaciRpC3QFYT1vD3RJdyZkVmUNLnRvNHM-chRpBnR5YRdvMHRLTAh5K3UOUAZyLm1z", "YvxViDzg"));
                                                            }
                                                        } else {
                                                            linearLayout.post(new u4.a(e2Var, r12, view, pDFPageManagerActivity, 4));
                                                            appCompatImageView3.setVisibility(4);
                                                            appCompatImageView2.setVisibility(0);
                                                            appCompatImageView.setVisibility(4);
                                                        }
                                                    } else if (pDFPageManagerActivity.P % 2 == 0) {
                                                        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(pDFPageManagerActivity)) {
                                                            linearLayout.post(new qb.e0(4, e2Var, r12, view, pDFPageManagerActivity));
                                                            appCompatImageView3.setVisibility(4);
                                                            appCompatImageView2.setVisibility(0);
                                                            appCompatImageView.setVisibility(4);
                                                        } else {
                                                            ea.a.p("P29BQhBuU2k0Z2R2Nm8GdFBuGkJn", "kIUVXLkO");
                                                            ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
                                                            if (layoutParams4 != null) {
                                                                ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams4;
                                                                ((ViewGroup.MarginLayoutParams) bVar4).leftMargin = ((((view.getWidth() / 2) + r12[0]) - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_42)) - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_9)) - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_28);
                                                                linearLayout.setLayoutParams(bVar4);
                                                                appCompatImageView3.setVisibility(0);
                                                                appCompatImageView2.setVisibility(4);
                                                                appCompatImageView.setVisibility(4);
                                                            } else {
                                                                throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuKG4ZbiFsWSBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQrYU1vIXQbd1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTCZ5W3UgUFRyUm1z", "G4T52lps"));
                                                            }
                                                        }
                                                    } else if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(pDFPageManagerActivity)) {
                                                        ea.a.p("G28VQlFuNmkmZ0h2d285dF1uJkJn", "qlke8RWu");
                                                        ViewGroup.LayoutParams layoutParams5 = linearLayout.getLayoutParams();
                                                        if (layoutParams5 != null) {
                                                            ConstraintLayout.b bVar5 = (ConstraintLayout.b) layoutParams5;
                                                            ((ViewGroup.MarginLayoutParams) bVar5).leftMargin = ((((view.getWidth() / 2) + r12[0]) - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_42)) - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_9)) - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_28);
                                                            linearLayout.setLayoutParams(bVar5);
                                                            appCompatImageView3.setVisibility(0);
                                                            appCompatImageView2.setVisibility(4);
                                                            appCompatImageView.setVisibility(4);
                                                        } else {
                                                            throw new NullPointerException(ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuXG5DbjNsKSA7eUFlWWFZZChvI2QNLgtvW3MaciRpC3RfYRdvM3RrdyZkVmUNLnRvNHM-chRpBnR5YRdvMHRLTFJ5AXUyUCRyLm1z", "IOCx3nFE"));
                                                        }
                                                    } else {
                                                        linearLayout.post(new mj.k(2, e2Var, r12, view, pDFPageManagerActivity));
                                                        appCompatImageView3.setVisibility(4);
                                                        appCompatImageView2.setVisibility(0);
                                                        appCompatImageView.setVisibility(4);
                                                    }
                                                    PopupWindow popupWindow6 = pDFPageManagerActivity.f25282u0;
                                                    if (popupWindow6 != null) {
                                                        c = 1;
                                                        popupWindow6.showAtLocation(pDFPageManagerActivity.o2().f1286z, 48, 0, r12[1]);
                                                    } else {
                                                        c = 1;
                                                    }
                                                    wm.b.c.getClass();
                                                    wm.b.f31380f.c(wm.b.f31378d[c], Boolean.TRUE);
                                                    pDFPageManagerActivity.o2().f1275o.setVisibility(0);
                                                    ea.a.p("Q287QhpuBmkcZxpyBm8iVi1ldw==", "yNafMAyG");
                                                    float dimensionPixelSize = pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_6);
                                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(constraintLayout, ea.a.p("LnI5bgpsK3QhbwhZ", "k7ZXyJPN"), 0.0f, -dimensionPixelSize, dimensionPixelSize, 0.0f);
                                                    pDFPageManagerActivity.f25283v0 = ofFloat;
                                                    if (ofFloat != null) {
                                                        ofFloat.setDuration(1500L);
                                                    }
                                                    ObjectAnimator objectAnimator = pDFPageManagerActivity.f25283v0;
                                                    if (objectAnimator != null) {
                                                        objectAnimator.setInterpolator(new LinearInterpolator());
                                                    }
                                                    ObjectAnimator objectAnimator2 = pDFPageManagerActivity.f25283v0;
                                                    if (objectAnimator2 != null) {
                                                        objectAnimator2.start();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                throw new NullPointerException(ea.a.p("OXUVbGhjD24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAjeQllaGEAZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdz5kHmU8Li1vJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyNm1z", "OGWyHnjm"));
                                            }
                                        }
                                    }
                                    i12 = i13;
                                }
                            }
                        }
                        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpTGhaSXU6IA==", "EeDE8z1P").concat(inflate.getResources().getResourceName(i12)));
                    }
                    return;
                }
                return;
        }
    }
}
