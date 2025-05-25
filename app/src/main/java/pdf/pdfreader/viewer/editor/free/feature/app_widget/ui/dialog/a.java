package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cg.l;
import kl.e;
import oo.g;
import pdf.pdfreader.viewer.editor.free.R;
import tf.d;

/* compiled from: HomeScreenPermissionDialog.kt */
/* loaded from: classes3.dex */
public final class a extends g {
    public ImageView A;
    public ImageView B;
    public TextView C;
    public c D;
    public boolean E;

    /* renamed from: y  reason: collision with root package name */
    public final ShortcutType f24837y;

    /* renamed from: z  reason: collision with root package name */
    public TextView f24838z;

    /* compiled from: HomeScreenPermissionDialog.kt */
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0335a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24839a;

        static {
            int[] iArr = new int[ShortcutType.values().length];
            try {
                iArr[ShortcutType.WIDGET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShortcutType.ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24839a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ShortcutType shortcutType) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "isVZj8uC"));
        kotlin.jvm.internal.g.e(shortcutType, ea.a.p("P2gscjVjQXQceRZl", "XqLCA4PE"));
        this.f24837y = shortcutType;
    }

    @Override // oo.g, l.p, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        c cVar;
        super.dismiss();
        if (!this.E && (cVar = this.D) != null) {
            cVar.b();
        }
        this.D = null;
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_home_screen_permission;
    }

    @Override // oo.g
    public final void z() {
        View x4 = x();
        this.f24838z = (TextView) x4.findViewById(R.id.tv_desc);
        this.A = (ImageView) x4.findViewById(R.id.iv_close);
        this.C = (TextView) x4.findViewById(R.id.tv_confirm_button);
        this.B = (ImageView) x4.findViewById(R.id.iv_icon);
        TextView textView = this.C;
        if (textView != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.HomeScreenPermissionDialog$findView$1
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view) {
                    invoke2(view);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    a aVar = a.this;
                    aVar.E = true;
                    c cVar = aVar.D;
                    if (cVar != null) {
                        cVar.a();
                    }
                    a.this.dismiss();
                }
            });
        }
        ImageView imageView = this.A;
        if (imageView != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(imageView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.HomeScreenPermissionDialog$findView$2
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view) {
                    invoke2(view);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    a aVar = a.this;
                    aVar.E = false;
                    aVar.dismiss();
                }
            });
        }
        int i10 = C0335a.f24839a[this.f24837y.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                ImageView imageView2 = this.B;
                if (imageView2 != null) {
                    imageView2.setImageResource(R.drawable.ic_home_short_cut_icon);
                }
                String string = getContext().getString(R.string.arg_res_0x7f130472);
                kotlin.jvm.internal.g.d(string, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpo4DtdBtfPWVBbSJzAGkNbi1uUWUNZTJfI3BGKQ==", "AKhM15hQ"));
                SpannableString b10 = e.b(string, new ForegroundColorSpan(androidx.core.content.a.getColor(getContext(), R.color.color_100_DD202A)));
                TextView textView2 = this.f24838z;
                if (textView2 != null) {
                    textView2.setText(b10);
                }
            }
        } else {
            ImageView imageView3 = this.B;
            if (imageView3 != null) {
                imageView3.setImageResource(R.drawable.ic_widget_permission);
            }
            String string2 = getContext().getString(R.string.arg_res_0x7f130589);
            kotlin.jvm.internal.g.d(string2, ea.a.p("LG9fdBx4Qy49ZT5TAXIBblIoPC42dBdpu4DydCFfIWU9bVhzCmlYbgVuL2URZQxfUnAaKQ==", "u2CmYTRQ"));
            SpannableString b11 = e.b(string2, new ForegroundColorSpan(androidx.core.content.a.getColor(getContext(), R.color.color_100_DD202A)));
            TextView textView3 = this.f24838z;
            if (textView3 != null) {
                textView3.setText(b11);
            }
        }
        kotlin.jvm.internal.g.d(getContext(), ea.a.p("Bm8odF14dA==", "7keF8qQk"));
    }
}
