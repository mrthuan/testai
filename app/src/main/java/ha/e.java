package ha;

import am.b2;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.EnhancedIntentService;
import com.inmobi.media.C1761p5;
import ha.h;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIAnswerContent;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIAnswerView;
import pdf.pdfreader.viewer.editor.free.utils.n0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18129a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18130b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f18131d;

    public /* synthetic */ e(int i10, Object obj, Object obj2, Object obj3) {
        this.f18129a = i10;
        this.f18130b = obj;
        this.c = obj2;
        this.f18131d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f18129a;
        Object obj = this.f18131d;
        Object obj2 = this.c;
        Object obj3 = this.f18130b;
        switch (i10) {
            case 0:
                g gVar = (g) obj3;
                gVar.getClass();
                gVar.f18134a.execute(new l1.a(4, (Runnable) obj2, (h.b) obj));
                return;
            case 1:
                EnhancedIntentService enhancedIntentService = (EnhancedIntentService) obj3;
                Intent intent = (Intent) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                int i11 = EnhancedIntentService.f13634f;
                enhancedIntentService.getClass();
                try {
                    enhancedIntentService.c(intent);
                    return;
                } finally {
                    taskCompletionSource.b(null);
                }
            case 2:
                C1761p5.d((C1761p5) obj3, (String) obj2, (String) obj);
                return;
            default:
                b2 b2Var = (b2) obj3;
                AIAnswerContent aIAnswerContent = (AIAnswerContent) obj2;
                AIAnswerView aIAnswerView = (AIAnswerView) obj;
                int i12 = AIAnswerView.f24728g;
                kotlin.jvm.internal.g.e(b2Var, ea.a.p("a3RZaQpfRXVu", "wYewfbi6"));
                kotlin.jvm.internal.g.e(aIAnswerView, ea.a.p("R2gic1cw", "X0b4heyT"));
                b2Var.f760m.setVisibility(0);
                int imgWidth = aIAnswerContent.getImgWidth();
                AppCompatImageView appCompatImageView = b2Var.f755h;
                if (imgWidth > 0 && aIAnswerContent.getImgHeight() > 0) {
                    float imgWidth2 = aIAnswerContent.getImgWidth() / aIAnswerContent.getImgHeight();
                    ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
                    layoutParams.height = (int) (appCompatImageView.getMeasuredWidth() / imgWidth2);
                    appCompatImageView.setLayoutParams(layoutParams);
                }
                ea.a.p("fWU_dxxyCUMeaVFudA==", "RZf10EpR");
                aIAnswerContent.getContent();
                String str = n0.f28727a;
                com.bumptech.glide.e<Bitmap> a10 = com.bumptech.glide.b.f(aIAnswerView.getContext()).a();
                a10.F = aIAnswerContent.getContent();
                a10.I = true;
                com.bumptech.glide.e j10 = a10.o(aIAnswerView.f24731e).n(appCompatImageView.getLayoutParams().width * 2, appCompatImageView.getLayoutParams().height * 2).j(aIAnswerView.f24731e);
                j10.H(new AIAnswerView.e(b2Var, aIAnswerView));
                j10.E(appCompatImageView);
                return;
        }
    }
}
