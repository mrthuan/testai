package pdf.pdfreader.viewer.editor.free.ui.widget;

import am.z1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import ao.u0;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class AddTextChangeColorBottomSheetView extends BaseBottomSheetView<z1> {
    public static final /* synthetic */ int D = 0;
    public b B;
    public ArrayList C;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view instanceof AddTextColorView) {
                AddTextColorView addTextColorView = (AddTextColorView) view;
                int i10 = AddTextChangeColorBottomSheetView.D;
                AddTextChangeColorBottomSheetView addTextChangeColorBottomSheetView = AddTextChangeColorBottomSheetView.this;
                addTextChangeColorBottomSheetView.getClass();
                if (!addTextColorView.f28165h) {
                    int childCount = ((z1) addTextChangeColorBottomSheetView.f28172y).c.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = ((z1) addTextChangeColorBottomSheetView.f28172y).c.getChildAt(i11);
                        if (childAt instanceof AddTextColorView) {
                            AddTextColorView addTextColorView2 = (AddTextColorView) childAt;
                            if (addTextColorView2.f28165h) {
                                addTextColorView2.setColorChecked(false);
                            }
                        }
                    }
                    addTextColorView.setColorChecked(true);
                    b bVar = addTextChangeColorBottomSheetView.B;
                    if (bVar != null) {
                        ((u0) bVar).a(addTextColorView.getCenterColor(), true);
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
    }

    public AddTextChangeColorBottomSheetView(Context context) {
        super(context);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final z1 D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout_add_text_edit_change_color_view, viewGroup, false);
        viewGroup.addView(inflate);
        int i10 = R.id.hsv_add_text_color;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.hsv_add_text_color);
        if (horizontalScrollView != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            int i11 = R.id.ll_add_text_color_container;
            LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ll_add_text_color_container);
            if (linearLayout2 != null) {
                i11 = R.id.view_add_text_color1;
                if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_add_text_color1)) != null) {
                    i11 = R.id.view_add_text_color10;
                    if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_add_text_color10)) != null) {
                        i11 = R.id.view_add_text_color11;
                        if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_add_text_color11)) != null) {
                            i11 = R.id.view_add_text_color12;
                            if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_add_text_color12)) != null) {
                                i11 = R.id.view_add_text_color13;
                                if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_add_text_color13)) != null) {
                                    i11 = R.id.view_add_text_color14;
                                    if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_add_text_color14)) != null) {
                                        i11 = R.id.view_add_text_color15;
                                        if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_add_text_color15)) != null) {
                                            i11 = R.id.view_add_text_color2;
                                            if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_add_text_color2)) != null) {
                                                i11 = R.id.view_add_text_color3;
                                                if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_add_text_color3)) != null) {
                                                    i11 = R.id.view_add_text_color4;
                                                    if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_add_text_color4)) != null) {
                                                        i11 = R.id.view_add_text_color5;
                                                        if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_add_text_color5)) != null) {
                                                            i11 = R.id.view_add_text_color6;
                                                            if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_add_text_color6)) != null) {
                                                                i11 = R.id.view_add_text_color7;
                                                                if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_add_text_color7)) != null) {
                                                                    i11 = R.id.view_add_text_color8;
                                                                    if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_add_text_color8)) != null) {
                                                                        i11 = R.id.view_add_text_color9;
                                                                        if (((AddTextColorView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_add_text_color9)) != null) {
                                                                            return new z1(linearLayout, horizontalScrollView, linearLayout2);
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
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpFWhsSTM6IA==", "aLwBFUU7").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final void F(Context context) {
        int childCount = ((z1) this.f28172y).c.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ((z1) this.f28172y).c.getChildAt(i10).setOnClickListener(new a());
        }
    }

    public void setOnCallBackListener(b bVar) {
        this.B = bVar;
    }

    public AddTextChangeColorBottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AddTextChangeColorBottomSheetView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final void E() {
    }
}
