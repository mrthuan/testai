package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.widget.LinearLayout;
import androidx.constraintlayout.motion.widget.MotionLayout;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;

/* compiled from: OperateExecuteTask.kt */
/* loaded from: classes3.dex */
public final class b extends androidx.constraintlayout.motion.widget.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OperateExecuteTask f28375a;

    public b(OperateExecuteTask operateExecuteTask) {
        this.f28375a = operateExecuteTask;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public final void b(int i10, MotionLayout motionLayout) {
        if (motionLayout != null) {
            motionLayout.setVisibility(4);
        }
        OperateExecuteTask operateExecuteTask = this.f28375a;
        LinearLayout linearLayout = operateExecuteTask.f28234l;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        OperateExecuteTask.a aVar = operateExecuteTask.f28240r;
        if (aVar != null) {
            aVar.d();
        }
        operateExecuteTask.r();
    }
}
