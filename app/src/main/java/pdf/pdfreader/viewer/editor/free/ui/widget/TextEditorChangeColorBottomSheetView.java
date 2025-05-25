package pdf.pdfreader.viewer.editor.free.ui.widget;

import am.v2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.text.editor.EditorView;
import lib.zj.pdfeditor.text.editor.TextEditorAction;
import lib.zj.pdfeditor.text.editor.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.n;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchLinearLayout;

/* loaded from: classes3.dex */
public class TextEditorChangeColorBottomSheetView extends BaseBottomSheetView<v2> {
    public static final /* synthetic */ int C = 0;
    public b B;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            mj.h hVar;
            lib.zj.pdfeditor.text.editor.a aVar;
            if (view instanceof AddTextColorView) {
                AddTextColorView addTextColorView = (AddTextColorView) view;
                int i10 = TextEditorChangeColorBottomSheetView.C;
                TextEditorChangeColorBottomSheetView textEditorChangeColorBottomSheetView = TextEditorChangeColorBottomSheetView.this;
                textEditorChangeColorBottomSheetView.getClass();
                if (!addTextColorView.f28165h) {
                    int childCount = ((v2) textEditorChangeColorBottomSheetView.f28172y).f1553d.getChildCount();
                    int i11 = 0;
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = ((v2) textEditorChangeColorBottomSheetView.f28172y).f1553d.getChildAt(i12);
                        if (childAt instanceof AddTextColorView) {
                            AddTextColorView addTextColorView2 = (AddTextColorView) childAt;
                            if (addTextColorView2.f28165h) {
                                addTextColorView2.setColorChecked(false);
                                i11 = i12;
                            }
                        }
                    }
                    addTextColorView.setColorChecked(true);
                    b bVar = textEditorChangeColorBottomSheetView.B;
                    if (bVar != null) {
                        int centerColor = addTextColorView.getCenterColor();
                        n.b bVar2 = (n.b) bVar;
                        ReaderPreviewActivity readerPreviewActivity = n.this.f26454a;
                        if (readerPreviewActivity.f26224n2 != null) {
                            if (androidx.core.content.a.getColor(readerPreviewActivity, R.color.edit_color_2) == centerColor) {
                                ReaderPreviewActivity readerPreviewActivity2 = n.this.f26454a;
                                AddTextColorView addTextColorView3 = readerPreviewActivity2.f26224n2;
                                if (addTextColorView3 != null) {
                                    addTextColorView3.c(centerColor, androidx.core.content.a.getColor(readerPreviewActivity2, R.color.color_20_black_100_white), 0);
                                }
                            } else {
                                n.this.f26454a.f26224n2.c(centerColor, centerColor, 0);
                            }
                        }
                        ReaderPreviewActivity.b0 b0Var = n.this.f26454a.f26276w1;
                        if (b0Var != null && b0Var.F0 == PDFReaderView.Mode.Editor && (hVar = b0Var.L1) != null && (aVar = b0Var.M1) != null) {
                            if (hVar.f22083a == aVar.f21685e) {
                                lib.zj.pdfeditor.text.editor.a aVar2 = b0Var.M1;
                                aVar2.getClass();
                                int i13 = a.f.f21725b[aVar2.f21680b.ordinal()];
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 == 3 && aVar2.f21698p != null && aVar2.f21701s != null) {
                                            aVar2.f21701s.color = centerColor & 16777215;
                                            aVar2.K(aVar2.f21685e, aVar2.f21698p, aVar2.f21701s);
                                        }
                                    } else if (aVar2.f21698p != null && aVar2.f21700r != null) {
                                        aVar2.f21700r.color = centerColor & 16777215;
                                        aVar2.M(aVar2.f21685e, aVar2.f21698p, aVar2.f21700r);
                                    }
                                } else {
                                    EditorView editorView = aVar2.f21687f.getEditorView();
                                    if (editorView != null) {
                                        editorView.d();
                                        editorView.f21670i = true;
                                    }
                                    if (aVar2.F != null) {
                                        aVar2.F.color = 16777215 & centerColor;
                                        aVar2.F.colorWithAlpha = centerColor;
                                        aVar2.z(aVar2.F);
                                    }
                                }
                                if (!b0Var.M1.q()) {
                                    b0Var.f21421v0 = true;
                                    b0Var.setDisplayedViewIndex(b0Var.L1.f22083a);
                                }
                            } else {
                                mj.h hVar2 = b0Var.L1;
                                hVar2.f22087f = TextEditorAction.CHANGE_COLOR;
                                hVar2.f22088g = centerColor;
                                b0Var.setDisplayedViewIndex(hVar2.f22083a);
                            }
                        }
                        gn.b.f17937a.getClass();
                        gn.b.f17938b.add("edt_color_" + i11);
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
    }

    public TextEditorChangeColorBottomSheetView(Context context) {
        super(context);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final v2 D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout_pdf_text_edit_change_color_view, viewGroup, false);
        viewGroup.addView(inflate);
        int i10 = R.id.hsv_text_color;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.hsv_text_color);
        if (horizontalScrollView != null) {
            InterceptTouchLinearLayout interceptTouchLinearLayout = (InterceptTouchLinearLayout) inflate;
            int i11 = R.id.ll_text_color_container;
            LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ll_text_color_container);
            if (linearLayout != null) {
                i11 = R.id.view_text_color1;
                if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_text_color1)) != null) {
                    i11 = R.id.view_text_color10;
                    if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_text_color10)) != null) {
                        i11 = R.id.view_text_color11;
                        if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_text_color11)) != null) {
                            i11 = R.id.view_text_color12;
                            if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_text_color12)) != null) {
                                i11 = R.id.view_text_color13;
                                if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_text_color13)) != null) {
                                    i11 = R.id.view_text_color14;
                                    if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_text_color14)) != null) {
                                        i11 = R.id.view_text_color15;
                                        if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_text_color15)) != null) {
                                            i11 = R.id.view_text_color2;
                                            if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_text_color2)) != null) {
                                                i11 = R.id.view_text_color3;
                                                if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_text_color3)) != null) {
                                                    i11 = R.id.view_text_color4;
                                                    if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_text_color4)) != null) {
                                                        i11 = R.id.view_text_color5;
                                                        if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_text_color5)) != null) {
                                                            i11 = R.id.view_text_color6;
                                                            if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_text_color6)) != null) {
                                                                i11 = R.id.view_text_color7;
                                                                if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_text_color7)) != null) {
                                                                    i11 = R.id.view_text_color8;
                                                                    if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_text_color8)) != null) {
                                                                        i11 = R.id.view_text_color9;
                                                                        if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_text_color9)) != null) {
                                                                            return new v2(interceptTouchLinearLayout, horizontalScrollView, interceptTouchLinearLayout, linearLayout);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i10 = i11;
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpDmh1SQU6IA==", "zUAOTSsA").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final void E() {
        if (this.f28172y != 0) {
            setOnClickListener(new pdf.pdfreader.viewer.editor.free.ui.widget.a(this));
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final void F(Context context) {
        int childCount = ((v2) this.f28172y).f1553d.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ((v2) this.f28172y).f1553d.getChildAt(i10).setOnClickListener(new a());
        }
    }

    public final void J(int i10) {
        int childCount = ((v2) this.f28172y).f1553d.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ((v2) this.f28172y).f1553d.getChildAt(i11);
            if (childAt instanceof AddTextColorView) {
                if (i10 == 0) {
                    ((AddTextColorView) childAt).setColorChecked(false);
                } else {
                    AddTextColorView addTextColorView = (AddTextColorView) childAt;
                    if (addTextColorView.f28165h) {
                        addTextColorView.setColorChecked(false);
                    }
                    if (addTextColorView.getCenterColor() == i10) {
                        addTextColorView.setColorChecked(true);
                    }
                }
            }
        }
        b bVar = this.B;
        if (bVar != null) {
            bVar.getClass();
        }
    }

    public void setOnCallBackListener(b bVar) {
        this.B = bVar;
    }

    public void setTopTouchListener(ro.d dVar) {
        T t4 = this.f28172y;
        if (t4 != 0) {
            ((v2) t4).c.setTopTouchListener(dVar);
        }
    }

    public TextEditorChangeColorBottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextEditorChangeColorBottomSheetView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
