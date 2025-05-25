package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: PdfListMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class h0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f27601a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f27602b;
    public final /* synthetic */ boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextView f27603d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ImageView f27604e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f27605f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f27606g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f27607h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f27608i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ View f27609j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f27610k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f27611l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog f27612m;

    /* compiled from: PdfListMoreMenuDialog.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            h0 h0Var = h0.this;
            if (h0Var.f27612m.f27445y) {
                Drawable drawable = androidx.core.content.a.getDrawable(h0Var.f27601a, R.drawable.ic_more_unlock);
                if (!h0Var.c) {
                    h0Var.f27603d.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    h0Var.f27603d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
                h0Var.f27603d.setText(h0Var.f27601a.getResources().getString(R.string.arg_res_0x7f1303dd));
            } else {
                Drawable drawable2 = androidx.core.content.a.getDrawable(h0Var.f27601a, R.drawable.ic_more_lock);
                if (!h0Var.c) {
                    h0Var.f27603d.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    h0Var.f27603d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable2, (Drawable) null);
                }
                h0Var.f27603d.setText(h0Var.f27601a.getResources().getString(R.string.arg_res_0x7f1303ee));
            }
            aj.b.U(h0Var.f27604e, h0Var.f27602b.getPath(), h0Var.f27612m.f27445y, h0Var.f27602b.getOtherStrOne());
            h0Var.f27603d.setVisibility(0);
            h0Var.f27605f.setVisibility(0);
            h0Var.f27606g.setVisibility(0);
            h0Var.f27607h.setVisibility(0);
            h0Var.f27612m.H.setVisibility(0);
            h0Var.f27608i.setVisibility(0);
            View findViewById = h0Var.f27609j.findViewById(R.id.middle_space);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            if (pdf.pdfreader.viewer.editor.free.utils.q0.F(h0Var.f27601a)) {
                h0Var.f27610k.setVisibility(0);
            } else {
                h0Var.f27610k.setVisibility(8);
            }
            if (pdf.pdfreader.viewer.editor.free.utils.q0.G(h0Var.f27601a)) {
                h0Var.f27611l.setVisibility(0);
            } else {
                h0Var.f27611l.setVisibility(8);
            }
        }
    }

    public h0(PdfListMoreMenuDialog pdfListMoreMenuDialog, Context context, PdfPreviewEntity pdfPreviewEntity, boolean z10, TextView textView, ImageView imageView, TextView textView2, TextView textView3, LinearLayout linearLayout, ConstraintLayout constraintLayout, View view, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.f27612m = pdfListMoreMenuDialog;
        this.f27601a = context;
        this.f27602b = pdfPreviewEntity;
        this.c = z10;
        this.f27603d = textView;
        this.f27604e = imageView;
        this.f27605f = textView2;
        this.f27606g = textView3;
        this.f27607h = linearLayout;
        this.f27608i = constraintLayout;
        this.f27609j = view;
        this.f27610k = linearLayout2;
        this.f27611l = linearLayout3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PdfListMoreMenuDialog pdfListMoreMenuDialog = this.f27612m;
        try {
            ReaderPDFCore readerPDFCore = new ReaderPDFCore(this.f27601a, this.f27602b.getPath());
            pdfListMoreMenuDialog.f27445y = readerPDFCore.needsPassword();
            pdfListMoreMenuDialog.f27446z = readerPDFCore.countPages();
            readerPDFCore.onDestroy();
            if (pdfListMoreMenuDialog.f27446z > 0) {
                if (pdfListMoreMenuDialog.E) {
                    return;
                }
                pdf.pdfreader.viewer.editor.free.utils.w0.a().f28791b.execute(new a());
                return;
            }
            throw new IllegalStateException();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
