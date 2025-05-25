package pdf.pdfreader.viewer.editor.free.feature.scan.dialog;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: CameraPermissionDialog.kt */
/* loaded from: classes3.dex */
public final class f extends oo.g {
    public static final /* synthetic */ int D = 0;
    public TextView A;
    public ImageView B;
    public boolean C;

    /* renamed from: y  reason: collision with root package name */
    public final int f25686y;

    /* renamed from: z  reason: collision with root package name */
    public final cg.l<? super Boolean, tf.d> f25687z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, int i10, cg.l<? super Boolean, tf.d> lVar) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG88dC94dA==", "2g3RJk7X"));
        this.f25686y = i10;
        this.f25687z = lVar;
    }

    @Override // oo.g
    public final boolean A() {
        return false;
    }

    @Override // oo.g
    public final boolean B() {
        return false;
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_camera_permission;
    }

    @Override // oo.g
    public final void z() {
        this.A = (TextView) x().findViewById(R.id.tv_ok);
        this.B = (ImageView) x().findViewById(R.id.iv_close);
        ImageView imageView = (ImageView) x().findViewById(R.id.iv_app_widget);
        TextView textView = (TextView) x().findViewById(R.id.tv_desc);
        if (this.f25686y == 0) {
            imageView.setImageResource(R.mipmap.ic_camera_permission1);
            textView.setText(R.string.arg_res_0x7f130050);
            TextView textView2 = this.A;
            if (textView2 != null) {
                textView2.setText(R.string.arg_res_0x7f130373);
            }
        } else {
            imageView.setImageResource(R.mipmap.ic_camera_permission2);
            textView.setText(R.string.arg_res_0x7f130020);
            TextView textView3 = this.A;
            if (textView3 != null) {
                textView3.setText(R.string.arg_res_0x7f130179);
            }
        }
        TextView textView4 = this.A;
        if (textView4 != null) {
            textView4.setOnClickListener(new k9.c(this, 15));
        }
        ImageView imageView2 = this.B;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new u4.g(this, 14));
        }
        setOnShowListener(new d());
        setOnCancelListener(new e(this, 0));
    }
}
