package pdf.pdfreader.viewer.editor.free.camera.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.ImageView;
import b1.e;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.camera.widget.CameraView;

/* compiled from: CameraView.kt */
/* loaded from: classes3.dex */
public final class a implements CameraView.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CameraView f24121a;

    public a(CameraView cameraView) {
        this.f24121a = cameraView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.camera.widget.CameraView.c
    public final void a(boolean z10) {
        CameraView cameraView = this.f24121a;
        if (z10) {
            ImageView imageView = cameraView.f24116g;
            if (imageView != null) {
                imageView.setSelected(true);
                AnimatorSet animatorSet = cameraView.f24119j;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ImageView imageView2 = cameraView.f24116g;
                if (imageView2 != null) {
                    String p10 = ea.a.p("QGMqbBZY", "RJRESgdm");
                    float[] fArr = new float[2];
                    ImageView imageView3 = cameraView.f24116g;
                    if (imageView3 != null) {
                        fArr[0] = imageView3.getScaleX();
                        fArr[1] = 1.0f;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView2, p10, fArr);
                        ImageView imageView4 = cameraView.f24116g;
                        if (imageView4 != null) {
                            String p11 = ea.a.p("PGNQbBxZ", "Jw2AEPDQ");
                            float[] fArr2 = new float[2];
                            ImageView imageView5 = cameraView.f24116g;
                            if (imageView5 != null) {
                                fArr2[0] = imageView5.getScaleY();
                                fArr2[1] = 1.0f;
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView4, p11, fArr2);
                                ofFloat.setDuration(150L);
                                ofFloat2.setDuration(150L);
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                cameraView.f24120k = animatorSet2;
                                animatorSet2.playTogether(ofFloat, ofFloat2);
                                AnimatorSet animatorSet3 = cameraView.f24120k;
                                if (animatorSet3 != null) {
                                    animatorSet3.start();
                                }
                                cameraView.f24117h.postDelayed(new e(cameraView, 13), 3000L);
                                return;
                            }
                            g.i(ea.a.p("VW8odQBWC2V3", "gcfGh0lp"));
                            throw null;
                        }
                        g.i(ea.a.p("VW8odQBWC2V3", "awb62boN"));
                        throw null;
                    }
                    g.i(ea.a.p("VW8odQBWC2V3", "djfN5DBg"));
                    throw null;
                }
                g.i(ea.a.p("CW9SdQJWDGV3", "XRo1qexl"));
                throw null;
            }
            g.i(ea.a.p("KW9SdQpWXmV3", "1eeFnpfU"));
            throw null;
        }
        ImageView imageView6 = cameraView.f24116g;
        if (imageView6 != null) {
            imageView6.setVisibility(4);
        } else {
            g.i(ea.a.p("VW8odQBWC2V3", "Ut5qjLno"));
            throw null;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.camera.widget.CameraView.c
    public final void b() {
        ImageView imageView = this.f24121a.f24116g;
        if (imageView != null) {
            imageView.setVisibility(4);
        } else {
            g.i(ea.a.p("N28ZdRZWHmV3", "7FQzewcj"));
            throw null;
        }
    }
}
