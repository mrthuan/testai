package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24620a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f24621b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(KeyEvent.Callback callback, Object obj, int i10) {
        this.f24620a = i10;
        this.f24621b = callback;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24620a;
        Object obj = this.c;
        KeyEvent.Callback callback = this.f24621b;
        switch (i10) {
            case 0:
                AIChatActivity aIChatActivity = (AIChatActivity) callback;
                String str = (String) obj;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("R2gic1cw", "416zaRG5"));
                kotlin.jvm.internal.g.e(str, ea.a.p("F3QzdA==", "Wcm5XmIX"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIChatActivity)) {
                    kl.a.a(aIChatActivity, str, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initView$7$4$1$1$1
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // cg.a
                        public /* bridge */ /* synthetic */ tf.d invoke() {
                            invoke2();
                            return tf.d.f30009a;
                        }
                    });
                    return;
                }
                return;
            default:
                View view = (View) callback;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) obj;
                kotlin.jvm.internal.g.e(view, ea.a.p("F3Y=", "WSFtzSiW"));
                kotlin.jvm.internal.g.e(marginLayoutParams, ea.a.p("a21Qch5pWUw7eSV1AVAJclRtcw==", "nrdh23ZZ"));
                view.setLayoutParams(marginLayoutParams);
                return;
        }
    }
}
