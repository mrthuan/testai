package pdf.pdfreader.viewer.editor.free.feature.pdf_editor.ui.dialog;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import cg.l;
import oo.g;
import pdf.pdfreader.viewer.editor.free.R;
import tf.d;

/* compiled from: PreviewUseEditorGuideDialog.kt */
/* loaded from: classes3.dex */
public final class PreviewUseEditorGuideDialog extends g implements n {
    public TextureView A;
    public in.a B;

    /* renamed from: y  reason: collision with root package name */
    public final Context f25618y;

    /* renamed from: z  reason: collision with root package name */
    public l<? super Boolean, d> f25619z;

    /* compiled from: PreviewUseEditorGuideDialog.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25620a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25620a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewUseEditorGuideDialog(Context context) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("KnkPbyp0PHh0", "cqGLDYtA"));
        this.f25618y = context;
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    @Override // androidx.lifecycle.n
    public final void d(p pVar, Lifecycle.Event event) {
        MediaPlayer mediaPlayer;
        in.a aVar;
        MediaPlayer mediaPlayer2;
        int i10 = a.f25620a[event.ordinal()];
        try {
            if (i10 != 1) {
                if (i10 == 2 && (aVar = this.B) != null) {
                    if (aVar.f18560e && (mediaPlayer2 = aVar.f18557a) != null) {
                        mediaPlayer2.start();
                    } else if (aVar.f18559d != 0 && aVar.f18561f) {
                        aVar.a(aVar.c.getSurfaceTexture());
                    }
                }
            } else {
                in.a aVar2 = this.B;
                if (aVar2 != null) {
                    if (aVar2.f18560e && (mediaPlayer = aVar2.f18557a) != null && mediaPlayer.isPlaying()) {
                        aVar2.f18557a.pause();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // oo.g, l.p, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        Lifecycle lifecycle;
        MediaPlayer mediaPlayer;
        super.dismiss();
        in.a aVar = this.B;
        c cVar = null;
        if (aVar != null && (mediaPlayer = aVar.f18557a) != null) {
            try {
                mediaPlayer.release();
                aVar.f18557a = null;
            } catch (Exception unused) {
            }
            aVar.f18560e = false;
        }
        Context context = this.f25618y;
        if (context instanceof c) {
            cVar = (c) context;
        }
        if (cVar != null && (lifecycle = cVar.getLifecycle()) != null) {
            lifecycle.c(this);
        }
    }

    @Override // oo.g, android.app.Dialog
    public final void show() {
        c cVar;
        Lifecycle lifecycle;
        super.show();
        in.a aVar = this.B;
        if (aVar != null) {
            aVar.f18559d = R.raw.pdf_edit_use_guide;
            if (aVar.f18561f) {
                aVar.a(aVar.c.getSurfaceTexture());
            }
        }
        Context context = this.f25618y;
        if (context instanceof c) {
            cVar = (c) context;
        } else {
            cVar = null;
        }
        if (cVar != null && (lifecycle = cVar.getLifecycle()) != null) {
            lifecycle.a(this);
        }
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_preview_use_editor_guide;
    }

    @Override // oo.g
    public final void z() {
        this.A = (TextureView) findViewById(R.id.editor_guide_surface);
        TextView textView = (TextView) findViewById(R.id.editor_guide_tv_try);
        TextView textView2 = (TextView) findViewById(R.id.editor_guide_tv_skip);
        TextureView textureView = this.A;
        if (textureView != null) {
            textureView.setClipToOutline(true);
        }
        this.B = new in.a(this.f25618y, this.A);
        if (textView != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf_editor.ui.dialog.PreviewUseEditorGuideDialog$initView$1
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
                    PreviewUseEditorGuideDialog.this.dismiss();
                    l<? super Boolean, d> lVar = PreviewUseEditorGuideDialog.this.f25619z;
                    if (lVar != null) {
                        lVar.invoke(Boolean.TRUE);
                    }
                }
            });
        }
        if (textView2 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView2, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf_editor.ui.dialog.PreviewUseEditorGuideDialog$initView$2
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
                    PreviewUseEditorGuideDialog.this.dismiss();
                    l<? super Boolean, d> lVar = PreviewUseEditorGuideDialog.this.f25619z;
                    if (lVar != null) {
                        lVar.invoke(Boolean.FALSE);
                    }
                }
            });
        }
    }
}
