package pdf.pdfreader.viewer.editor.free.ui.widget.sign;

import am.b3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.k1;
import cg.l;
import cg.p;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignCreateView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;
import pdf.pdfreader.viewer.editor.free.utils.l0;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* loaded from: classes3.dex */
public class SignCreateView extends FrameLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f28437d = 0;

    /* renamed from: a  reason: collision with root package name */
    public b3 f28438a;

    /* renamed from: b  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.ui.widget.adapter.f f28439b;
    public f c;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f fVar = SignCreateView.this.c;
            if (fVar != null) {
                ((k1) fVar).a();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements l<SignPathActionInfo, tf.d> {
        public c() {
        }

        @Override // cg.l
        public final tf.d invoke(SignPathActionInfo signPathActionInfo) {
            f fVar;
            SignPathActionInfo signPathActionInfo2 = signPathActionInfo;
            SignCreateView signCreateView = SignCreateView.this;
            f fVar2 = signCreateView.c;
            if ((fVar2 == null || !((k1) fVar2).a()) && (fVar = signCreateView.c) != null) {
                ReaderPreviewActivity readerPreviewActivity = ((k1) fVar).f5093a;
                if (readerPreviewActivity.f26277w2) {
                    readerPreviewActivity.L4();
                    return null;
                }
                readerPreviewActivity.X2();
                if (signPathActionInfo2 != null) {
                    ReaderPreviewActivity.c2(readerPreviewActivity, signPathActionInfo2.getFilePath(), signPathActionInfo2.clone());
                    return null;
                }
                return null;
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public class d extends l0 {
        public d() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            f fVar;
            SignCreateView signCreateView = SignCreateView.this;
            f fVar2 = signCreateView.c;
            if ((fVar2 == null || !((k1) fVar2).a()) && (fVar = signCreateView.c) != null) {
                ((k1) fVar).b();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e extends l0 {
        public e() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            f fVar;
            SignCreateView signCreateView = SignCreateView.this;
            f fVar2 = signCreateView.c;
            if ((fVar2 == null || !((k1) fVar2).a()) && (fVar = signCreateView.c) != null) {
                ((k1) fVar).b();
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface f {
    }

    public SignCreateView(Context context) {
        super(context);
        a(context);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [xo.b] */
    public final void a(Context context) {
        setOnClickListener(new a());
        LayoutInflater.from(context).inflate(R.layout.layout_signature_edit_view, this);
        int i10 = R.id.has_sign_group;
        Group group = (Group) com.google.android.play.core.assetpacks.c.u(this, R.id.has_sign_group);
        if (group != null) {
            i10 = R.id.sign_ll_create;
            LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_ll_create);
            if (linearLayout != null) {
                i10 = R.id.sign_ll_empty_create;
                LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_ll_empty_create);
                if (linearLayout2 != null) {
                    i10 = R.id.sign_preview_rv;
                    RecyclerView recyclerView = (RecyclerView) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_preview_rv);
                    if (recyclerView != null) {
                        i10 = R.id.sign_v_line;
                        View u7 = com.google.android.play.core.assetpacks.c.u(this, R.id.sign_v_line);
                        if (u7 != null) {
                            this.f28438a = new b3(this, group, linearLayout, linearLayout2, recyclerView, u7);
                            getContext();
                            recyclerView.setLayoutManager(new LinearLayoutManager(0));
                            ((RecyclerView) this.f28438a.f770g).r(new b());
                            pdf.pdfreader.viewer.editor.free.ui.widget.adapter.f fVar = new pdf.pdfreader.viewer.editor.free.ui.widget.adapter.f(new p() { // from class: xo.b
                                @Override // cg.p
                                public final Object invoke(Object obj, Object obj2) {
                                    Integer num = (Integer) obj;
                                    SignPathActionInfo signPathActionInfo = (SignPathActionInfo) obj2;
                                    SignCreateView signCreateView = SignCreateView.this;
                                    SignCreateView.f fVar2 = signCreateView.c;
                                    if (fVar2 == null || !((k1) fVar2).a()) {
                                        t0.V().execute(new l1.a(23, signCreateView, signPathActionInfo));
                                        return null;
                                    }
                                    return null;
                                }
                            }, new c());
                            this.f28439b = fVar;
                            ((RecyclerView) this.f28438a.f770g).setAdapter(fVar);
                            ((LinearLayout) this.f28438a.f769f).setOnClickListener(new d());
                            this.f28438a.f766b.setOnClickListener(new e());
                            t0.V().execute(new xo.c(this));
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpMWhBSRA6IA==", "EaTHhoj7").concat(getResources().getResourceName(i10)));
    }

    public void setOnSignCreateViewClickListener(f fVar) {
        this.c = fVar;
    }

    public SignCreateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public SignCreateView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context);
    }

    /* loaded from: classes3.dex */
    public class b implements RecyclerView.q {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final boolean f(RecyclerView recyclerView, MotionEvent motionEvent) {
            f fVar = SignCreateView.this.c;
            if (fVar != null) {
                ((k1) fVar).a();
                return false;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void j(boolean z10) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void c(RecyclerView recyclerView, MotionEvent motionEvent) {
        }
    }
}
