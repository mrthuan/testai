package pdf.pdfreader.viewer.editor.free.ui.widget;

import am.a2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ao.t0;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar;
import pdf.pdfreader.viewer.editor.free.utils.q0;

/* loaded from: classes3.dex */
public class AddTextChangeSizeBottomSheetView extends BaseBottomSheetView<a2> {
    public b B;

    /* loaded from: classes3.dex */
    public class a implements wo.b {
        public a() {
        }

        public final void a(int i10, boolean z10) {
            AddTextChangeSizeBottomSheetView addTextChangeSizeBottomSheetView = AddTextChangeSizeBottomSheetView.this;
            TextView textView = ((a2) addTextChangeSizeBottomSheetView.f28172y).c;
            textView.setText(i10 + "");
            b bVar = addTextChangeSizeBottomSheetView.B;
            if (bVar != null) {
                ReaderPreviewActivity readerPreviewActivity = ((t0) bVar).f5134a;
                if (readerPreviewActivity.f26240q0 != i10) {
                    readerPreviewActivity.f26240q0 = i10;
                }
                if (z10) {
                    q0.x(readerPreviewActivity, i10, "add_text_size_in_158");
                    tn.a.b(ReaderPdfApplication.m(), ea.a.p("UmQvXwdlGnQ=", "R80dxAOC"), ea.a.p("R2UzdCxhBmotc116DF83ZC51QXQ=", "GyGSEBex"));
                }
                ReaderPDFCore readerPDFCore = readerPreviewActivity.f26256t1;
                if (readerPDFCore != null && readerPDFCore.getCurEditPDFPageView() != null) {
                    readerPreviewActivity.f26256t1.getCurEditPDFPageView().f(i10, z10);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
    }

    public AddTextChangeSizeBottomSheetView(Context context) {
        super(context);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final a2 D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout_add_text_edit_change_size_view, viewGroup, false);
        viewGroup.addView(inflate);
        int i10 = R.id.add_text_seekbar;
        PreviewSeekBar previewSeekBar = (PreviewSeekBar) com.google.android.play.core.assetpacks.c.u(inflate, R.id.add_text_seekbar);
        if (previewSeekBar != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_add_text_zoom_in);
            if (textView != null) {
                return new a2(linearLayout, previewSeekBar, textView);
            }
            i10 = R.id.tv_add_text_zoom_in;
        }
        throw new NullPointerException(ea.a.p("FGk5cwNuPSA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "g2YJjZ3q").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final void F(Context context) {
        ((a2) this.f28172y).f716b.setOnProgressChangedListener(new a());
    }

    public void setOnCallBackListener(b bVar) {
        this.B = bVar;
    }

    public void setSaving(boolean z10) {
        ((a2) this.f28172y).f716b.setSaving(z10);
    }

    public AddTextChangeSizeBottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AddTextChangeSizeBottomSheetView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final void E() {
    }
}
