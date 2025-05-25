package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter;

import am.o1;
import am.s1;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRBlockFlatten;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRBlockType;

/* compiled from: OCRSelectTextAdapter.kt */
/* loaded from: classes3.dex */
public final class h extends RecyclerView.Adapter<RecyclerView.b0> {

    /* renamed from: d  reason: collision with root package name */
    public final List<OCRBlockFlatten> f25154d;

    /* renamed from: e  reason: collision with root package name */
    public final l<Integer, tf.d> f25155e;

    /* renamed from: f  reason: collision with root package name */
    public final cg.a<tf.d> f25156f;

    /* renamed from: g  reason: collision with root package name */
    public float f25157g;

    /* renamed from: h  reason: collision with root package name */
    public float f25158h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f25159i;

    /* JADX WARN: Multi-variable type inference failed */
    public h(List<OCRBlockFlatten> list, l<? super Integer, tf.d> lVar, cg.a<tf.d> aVar) {
        kotlin.jvm.internal.g.e(list, ea.a.p("JnRUbXM=", "wiCivDZX"));
        kotlin.jvm.internal.g.e(lVar, ea.a.p("XGYtcxZ0Okwbc0BlB2Vy", "GIxPLh04"));
        kotlin.jvm.internal.g.e(aVar, ea.a.p("IG54dBxtdGwzY2s=", "RVYEg4Vd"));
        this.f25154d = list;
        this.f25155e = lVar;
        this.f25156f = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f25154d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        return this.f25154d.get(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"ClickableViewAccessibility"})
    public final void onBindViewHolder(RecyclerView.b0 holder, final int i10) {
        kotlin.jvm.internal.g.e(holder, "holder");
        if (holder instanceof pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.c) {
            pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.c cVar = (pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.c) holder;
            OCRBlockFlatten blockFlatten = this.f25154d.get(i10);
            kotlin.jvm.internal.g.e(blockFlatten, "blockFlatten");
            o1 o1Var = cVar.f25165b;
            ((TextView) o1Var.c).setSelected(blockFlatten.isSelected());
            View view = o1Var.c;
            ((TextView) view).setText(blockFlatten.getText());
            ViewGroup viewGroup = o1Var.f1257b;
            ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
            kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4Ab1t0", "aFQNSqMw"));
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams != null) {
                FlexboxLayoutManager.b bVar = (FlexboxLayoutManager.b) layoutParams;
                bVar.f9983m = blockFlatten.isFirstWordOfBlock();
                constraintLayout.setLayoutParams(bVar);
                if (blockFlatten.getText().length() == 1) {
                    int dimensionPixelSize = ReaderPdfApplication.m().getResources().getDimensionPixelSize(R.dimen.dp_12);
                    ((TextView) view).setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                } else {
                    int dimensionPixelSize2 = ReaderPdfApplication.m().getResources().getDimensionPixelSize(R.dimen.dp_8);
                    ((TextView) view).setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
                }
                ((ConstraintLayout) viewGroup).setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.b(0, blockFlatten, cVar));
                holder.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.g
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        String p10 = ea.a.p("O2hYc10w", "xJyhtux3");
                        h hVar = h.this;
                        kotlin.jvm.internal.g.e(hVar, p10);
                        int action = motionEvent.getAction();
                        if (action != 0) {
                            if (action != 2) {
                                hVar.f25159i = false;
                                return false;
                            } else if (hVar.f25159i) {
                                return false;
                            } else {
                                float x4 = motionEvent.getX();
                                float y10 = motionEvent.getY();
                                if (Math.abs(y10 - hVar.f25158h) < 5.0f && Math.abs(x4 - hVar.f25157g) < 5.0f) {
                                    return false;
                                }
                                hVar.f25159i = true;
                                if (Math.abs(x4 - hVar.f25157g) <= Math.abs(y10 - hVar.f25158h)) {
                                    return false;
                                }
                                hVar.f25155e.invoke(Integer.valueOf(i10));
                                return true;
                            }
                        }
                        hVar.f25157g = motionEvent.getX();
                        hVar.f25158h = motionEvent.getY();
                        hVar.f25159i = false;
                        return false;
                    }
                });
                return;
            }
            throw new NullPointerException(ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuAW5EbiRsNCA7eUFlWWNYbXRnJW8SbA0uVG4KcippAS4IbAx4M28gLglsVHgbb09MO3kldQFNCW5UZwtya0wEeQF1HVAwcjltcw==", "KJRJniQX"));
        } else if (holder instanceof pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.a) {
            ConstraintLayout constraintLayout2 = ((pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.a) holder).f25162b.f1455a;
            kotlin.jvm.internal.g.d(constraintLayout2, ea.a.p("UWklZBpuBS4Ab1t0", "0LmOjkmR"));
            ViewGroup.LayoutParams layoutParams2 = constraintLayout2.getLayoutParams();
            if (layoutParams2 != null) {
                FlexboxLayoutManager.b bVar2 = (FlexboxLayoutManager.b) layoutParams2;
                bVar2.f9983m = true;
                constraintLayout2.setLayoutParams(bVar2);
                return;
            }
            throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuOG5sbh5sByBHeTtlU2MNbVxnW28ObDMuJW5WcilpJy4xbCR4CW8TLnVsLngRbxpME3lbdR1NN24lZ1dyaEwieTh1NVAKcgptcw==", "WAkk5BCO"));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.b0 onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        int ordinal = OCRBlockType.NORMAL.ordinal();
        cg.a<tf.d> aVar = this.f25156f;
        if (i10 == ordinal) {
            o1 a10 = o1.a(LayoutInflater.from(parent.getContext()), parent);
            ea.a.p("K24_bCh0UigEYR9vQXQebl5sM3QschhmloDXLjJvLHQneC0pZSBHYTplCHQYIDFhVHM3KQ==", "dUBYI73c");
            return new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.c(a10, aVar);
        } else if (i10 == OCRBlockType.DIVIDING_LINE.ordinal()) {
            View i11 = androidx.activity.f.i(parent, R.layout.item_ocr_block_dividing_line, parent, false);
            if (i11 != null) {
                s1 s1Var = new s1((ConstraintLayout) i11);
                ea.a.p("Wm4tbBJ0Byg-YU1vHHQfbiJsU3Qjcm1muoD1LhRvCnRWeD8pXyASYQBlWnRFIDBhKHNXKQ==", "XSwdr3eb");
                return new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.a(s1Var);
            }
            throw new NullPointerException(ea.a.p("QW8kdCVpB3c=", "O55yYHIL"));
        } else {
            o1 a11 = o1.a(LayoutInflater.from(parent.getContext()), parent);
            ea.a.p("Jm5XbBh0UigWYTNvAHQhblNsD3QgcktmiYDRLhNvI3QqeEUpVSBHYShlJHRZIA5hWXMLKQ==", "gcpXkwpM");
            return new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.c(a11, aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.b0 holder, int i10, List<Object> payloads) {
        kotlin.jvm.internal.g.e(holder, "holder");
        kotlin.jvm.internal.g.e(payloads, "payloads");
        super.onBindViewHolder(holder, i10, payloads);
        if ((!payloads.isEmpty()) && (holder instanceof pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.c)) {
            OCRBlockFlatten blockFlatten = this.f25154d.get(i10);
            kotlin.jvm.internal.g.e(blockFlatten, "blockFlatten");
            ((TextView) ((pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.c) holder).f25165b.c).setSelected(blockFlatten.isSelected());
        }
    }
}
