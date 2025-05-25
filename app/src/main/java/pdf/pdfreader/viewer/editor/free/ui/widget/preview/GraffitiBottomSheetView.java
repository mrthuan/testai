package pdf.pdfreader.viewer.editor.free.ui.widget.preview;

import am.l2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.f0;
import g9.e;
import hj.a;
import java.util.ArrayList;
import kotlin.jvm.internal.g;
import nl.f;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.GraffitiPreviewView;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import xk.c;

/* loaded from: classes3.dex */
public class GraffitiBottomSheetView extends BaseBottomSheetView<l2> {
    public static final /* synthetic */ int E = 0;
    public c.b B;
    public xk.c C;
    public c D;

    /* loaded from: classes3.dex */
    public class b implements c.b {
        public b() {
        }

        @Override // xk.c.b
        public final void a(f fVar, int i10) {
            int i11 = fVar.f22603a;
            GraffitiBottomSheetView graffitiBottomSheetView = GraffitiBottomSheetView.this;
            graffitiBottomSheetView.setPreviewColor(i11);
            c.b bVar = graffitiBottomSheetView.B;
            if (bVar != null) {
                bVar.a(fVar, i10);
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
    }

    public GraffitiBottomSheetView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewColor(int i10) {
        ((l2) this.f28172y).f1074f.setStrokeColor(i10);
        if (i10 == androidx.core.content.a.getColor(getContext(), R.color.edit_color_2)) {
            ((l2) this.f28172y).f1074f.setBackgroundResource(R.drawable.bg_graffiti_preview_white);
        } else {
            ((l2) this.f28172y).f1074f.setBackgroundResource(R.drawable.bg_graffiti_preview);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final l2 D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout_graffiti_size_color_bottom_sheet, viewGroup, false);
        viewGroup.addView(inflate);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i10 = R.id.bottom_sheet_container;
        LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.bottom_sheet_container);
        if (linearLayout2 != null) {
            i10 = R.id.graffiti_color_rv_content;
            RecyclerView recyclerView = (RecyclerView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.graffiti_color_rv_content);
            if (recyclerView != null) {
                i10 = R.id.graffiti_color_tv_title;
                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.graffiti_color_tv_title);
                if (textView != null) {
                    i10 = R.id.graffiti_size_cl_root;
                    ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.graffiti_size_cl_root);
                    if (constraintLayout != null) {
                        i10 = R.id.graffiti_size_preview;
                        GraffitiPreviewView graffitiPreviewView = (GraffitiPreviewView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.graffiti_size_preview);
                        if (graffitiPreviewView != null) {
                            i10 = R.id.graffiti_size_seek_bar;
                            AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) com.google.android.play.core.assetpacks.c.u(inflate, R.id.graffiti_size_seek_bar);
                            if (appCompatSeekBar != null) {
                                i10 = R.id.graffiti_size_tv_size;
                                TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.graffiti_size_tv_size);
                                if (textView2 != null) {
                                    i10 = R.id.graffiti_size_tv_title;
                                    if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.graffiti_size_tv_title)) != null) {
                                        return new l2(linearLayout, linearLayout2, recyclerView, textView, constraintLayout, graffitiPreviewView, appCompatSeekBar, textView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpMGh3SXM6IA==", "DW7n7BjS").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final void F(Context context) {
        zl.b.c.getClass();
        setSize(zl.b.i());
        if (a0.i(context)) {
            ((l2) this.f28172y).f1075g.setLayoutDirection(1);
        } else {
            ((l2) this.f28172y).f1075g.setLayoutDirection(0);
        }
        ((l2) this.f28172y).f1075g.setOnSeekBarChangeListener(new a());
        this.C = new xk.c(context);
        ((l2) this.f28172y).c.setLayoutManager(new LinearLayoutManager(0));
        ((l2) this.f28172y).c.setAdapter(this.C);
        xk.c cVar = this.C;
        ArrayList M = t0.M(context);
        ArrayList arrayList = cVar.f31863g;
        arrayList.clear();
        arrayList.addAll(M);
        cVar.notifyDataSetChanged();
        this.C.f31862f = new b();
    }

    public final void K(int i10) {
        xk.c cVar = this.C;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = cVar.f31863g;
            if (i11 < arrayList.size()) {
                if (((f) arrayList.get(i11)).f22603a == i10) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        ((l2) this.f28172y).c.post(new e(this, i11, 4));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        T t4 = this.f28172y;
        if (t4 != 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((l2) t4).f1073e.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) ((l2) this.f28172y).f1072d.getLayoutParams();
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((l2) this.f28172y).c.getLayoutParams();
            if (configuration.orientation == 1) {
                layoutParams.topMargin = getResources().getDimensionPixelSize(R.dimen.dp_20);
                layoutParams2.topMargin = getResources().getDimensionPixelSize(R.dimen.dp_26);
                layoutParams3.topMargin = getResources().getDimensionPixelSize(R.dimen.dp_20);
            } else {
                layoutParams.topMargin = getResources().getDimensionPixelSize(R.dimen.dp_12);
                layoutParams2.topMargin = getResources().getDimensionPixelSize(R.dimen.dp_16);
                layoutParams3.topMargin = getResources().getDimensionPixelSize(R.dimen.dp_12);
            }
            ((l2) this.f28172y).f1073e.setLayoutParams(layoutParams);
            ((l2) this.f28172y).f1072d.setLayoutParams(layoutParams2);
            ((l2) this.f28172y).c.setLayoutParams(layoutParams3);
        }
    }

    public void setHorizontalPadding(int i10) {
        T t4 = this.f28172y;
        if (t4 == 0) {
            return;
        }
        ((l2) t4).f1071b.setPadding(i10, 0, i10, 0);
    }

    public void setOnColorItemClickListener(c.b bVar) {
        this.B = bVar;
    }

    public void setOnSizeChangeCallBack(c cVar) {
        this.D = cVar;
    }

    public void setSelectColor(int i10) {
        xk.c cVar = this.C;
        cVar.f31861e = i10;
        cVar.notifyDataSetChanged();
        setPreviewColor(i10);
    }

    public void setSize(float f10) {
        int i10 = (int) ((f10 - 0.5f) * 2.0f);
        if (i10 >= 0) {
            ((l2) this.f28172y).f1075g.setProgress(i10);
        } else {
            ((l2) this.f28172y).f1075g.setProgress(0);
        }
        TextView textView = ((l2) this.f28172y).f1076h;
        textView.setText(f10 + "");
        GraffitiPreviewView graffitiPreviewView = ((l2) this.f28172y).f1074f;
        Context context = getContext();
        g.e(context, "context");
        graffitiPreviewView.setStrokeWidth((int) (((f10 / 2.0f) * context.getResources().getDisplayMetrics().density) + 0.5d));
    }

    public GraffitiBottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GraffitiBottomSheetView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final void E() {
    }

    /* loaded from: classes3.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            float f10 = (i10 / 2.0f) + 0.5f;
            int i11 = GraffitiBottomSheetView.E;
            GraffitiBottomSheetView graffitiBottomSheetView = GraffitiBottomSheetView.this;
            TextView textView = ((l2) graffitiBottomSheetView.f28172y).f1076h;
            textView.setText(f10 + "");
            GraffitiPreviewView graffitiPreviewView = ((l2) graffitiBottomSheetView.f28172y).f1074f;
            Context context = graffitiBottomSheetView.getContext();
            g.e(context, "context");
            graffitiPreviewView.setStrokeWidth((int) (((f10 / 2.0f) * context.getResources().getDisplayMetrics().density) + 0.5d));
            c cVar = graffitiBottomSheetView.D;
            if (cVar != null) {
                cVar.getClass();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            String p10;
            c cVar = GraffitiBottomSheetView.this.D;
            if (cVar != null) {
                float progress = (seekBar.getProgress() / 2.0f) + 0.5f;
                ReaderPreviewActivity readerPreviewActivity = ((f0) cVar).f5038a;
                readerPreviewActivity.L4 = progress;
                a.C0246a.f18352a.f18351b = (int) (((progress / 2.0f) * readerPreviewActivity.getResources().getDisplayMetrics().density) + 0.5d);
                zl.b.c.getClass();
                zl.b.f32416i.c(zl.b.f32411d[4], Float.valueOf(progress));
                if (!readerPreviewActivity.f26273v5) {
                    readerPreviewActivity.f26273v5 = true;
                    ea.a.p("MQ==", "udPh3Ipl");
                    if (progress <= 4.0f) {
                        p10 = ea.a.p("MQ==", "gFjdyr5r");
                    } else if (progress <= 8.0f) {
                        p10 = ea.a.p("Mg==", "uaP9JgXE");
                    } else {
                        p10 = ea.a.p("Mw==", "vyoVeESH");
                    }
                    tn.a.d(readerPreviewActivity, ea.a.p("BG4UbzFhBmU=", "m7ezErFc"), ea.a.p("Lm5fbyZnRWE8ZiN0HF8bZXQ=", "TP2d1ZDY"), ea.a.p("O2hYYxJuUnMpXz5vAWEEXw==", "lprhIr4h").concat(p10), false);
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }
    }
}
