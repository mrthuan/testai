package pdf.pdfreader.viewer.editor.free.camera.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.util.Objects;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.camera.widget.CameraView;

/* compiled from: CameraView.kt */
/* loaded from: classes3.dex */
public final class c extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CameraView f24123a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraSurfaceView f24124b;
    public final /* synthetic */ int c;

    public c(CameraView cameraView, CameraSurfaceView cameraSurfaceView, int i10) {
        this.f24123a = cameraView;
        this.f24124b = cameraSurfaceView;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e10) {
        g.e(e10, "e");
        CameraView.b bVar = this.f24123a.c;
        if (bVar != null) {
            bVar.b(-10000.0f);
        }
        return super.onDoubleTap(e10);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e10) {
        int i10;
        g.e(e10, "e");
        int i11 = CameraView.f24110l;
        CameraView cameraView = this.f24123a;
        cameraView.getClass();
        int x4 = (int) e10.getX();
        int y10 = (int) e10.getY();
        ea.a.p("DGFcZQthYWk_dw==", "JBbLIlkQ");
        ea.a.p("cGEmZQFhNGkXdw==", "OsPaAzBl");
        CameraSurfaceView cameraSurfaceView = this.f24124b;
        Objects.toString(cameraSurfaceView);
        Rect rect = new Rect(Math.max(cameraSurfaceView.getLeft(), 0), Math.max(cameraSurfaceView.getTop(), 0), Math.min(cameraSurfaceView.getRight(), cameraView.f24113d.f29823a), Math.min(cameraSurfaceView.getBottom(), cameraView.f24113d.f29824b));
        ea.a.p("cGEmZQFhNGkXdw==", "8AW41vGS");
        rect.toString();
        if (rect.contains(x4, y10)) {
            int i12 = this.c;
            int i13 = i12 / 2;
            if (rect.width() >= i12 && (x4 < (i10 = rect.left + i13) || x4 > (i10 = rect.right - i13))) {
                x4 = i10;
            }
            if (rect.height() >= i12) {
                int i14 = rect.top + i13;
                if (y10 < i14) {
                    y10 = i14;
                } else {
                    int i15 = rect.bottom - i13;
                    if (y10 > i15) {
                        y10 = i15;
                    }
                }
            }
            ea.a.p("DGFcZQthYWk_dw==", "j8EPLNKu");
            int i16 = x4 - i13;
            int i17 = y10 - i13;
            int i18 = x4 + i13;
            int i19 = i13 + y10;
            ea.a.p("DGFcZQthYWk_dw==", "Or3PPp4k");
            ea.a.p("cGEmZQFhNGkXdw==", "V3hlf5nk");
            ImageView imageView = cameraView.f24116g;
            if (imageView != null) {
                imageView.getWidth();
                ImageView imageView2 = cameraView.f24116g;
                if (imageView2 != null) {
                    imageView2.getHeight();
                    ea.a.p("cGEmZQFhNGkXdw==", "ITcybK03");
                    cameraView.getLeft();
                    cameraView.getTop();
                    cameraView.getRight();
                    cameraView.getBottom();
                    ImageView imageView3 = cameraView.f24116g;
                    if (imageView3 != null) {
                        imageView3.layout(i16, i17, i18, i19);
                        ImageView imageView4 = cameraView.f24116g;
                        if (imageView4 != null) {
                            imageView4.setVisibility(0);
                            AnimatorSet animatorSet = cameraView.f24120k;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            ImageView imageView5 = cameraView.f24116g;
                            if (imageView5 != null) {
                                imageView5.setScaleX(1.0f);
                                ImageView imageView6 = cameraView.f24116g;
                                if (imageView6 != null) {
                                    imageView6.setScaleY(1.0f);
                                    ImageView imageView7 = cameraView.f24116g;
                                    if (imageView7 != null) {
                                        imageView7.setSelected(false);
                                        cameraView.f24117h.removeCallbacksAndMessages(null);
                                        ImageView imageView8 = cameraView.f24116g;
                                        if (imageView8 != null) {
                                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView8, ea.a.p("QGMqbBZY", "65R8BXII"), 1.0f, 0.8f);
                                            ImageView imageView9 = cameraView.f24116g;
                                            if (imageView9 != null) {
                                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView9, ea.a.p("PGNQbBxZ", "noZl11O1"), 1.0f, 0.8f);
                                                ofFloat.setDuration(250L);
                                                ofFloat2.setDuration(250L);
                                                AnimatorSet animatorSet2 = new AnimatorSet();
                                                cameraView.f24119j = animatorSet2;
                                                animatorSet2.playTogether(ofFloat, ofFloat2);
                                                AnimatorSet animatorSet3 = cameraView.f24119j;
                                                if (animatorSet3 != null) {
                                                    animatorSet3.start();
                                                }
                                                float left = ((x4 - cameraSurfaceView.getLeft()) * 1.0f) / (cameraSurfaceView.getRight() - cameraSurfaceView.getLeft());
                                                float top = ((y10 - cameraSurfaceView.getTop()) * 1.0f) / (cameraSurfaceView.getBottom() - cameraSurfaceView.getTop());
                                                CameraView.b bVar = cameraView.c;
                                                if (bVar != null) {
                                                    bVar.d(left, top, new a(cameraView));
                                                }
                                            } else {
                                                g.i(ea.a.p("KW9SdQpWXmV3", "dpZgtOr3"));
                                                throw null;
                                            }
                                        } else {
                                            g.i(ea.a.p("Dm9adUtWD2V3", "I9h98fZF"));
                                            throw null;
                                        }
                                    } else {
                                        g.i(ea.a.p("VW8odQBWC2V3", "ciOhSLOS"));
                                        throw null;
                                    }
                                } else {
                                    g.i(ea.a.p("KW9SdQpWXmV3", "fMDJilwJ"));
                                    throw null;
                                }
                            } else {
                                g.i(ea.a.p("VW8odQBWC2V3", "JaDxotj4"));
                                throw null;
                            }
                        } else {
                            g.i(ea.a.p("VW8odQBWC2V3", "b0YO8ofp"));
                            throw null;
                        }
                    } else {
                        g.i(ea.a.p("VW8odQBWC2V3", "5mnxSIff"));
                        throw null;
                    }
                } else {
                    g.i(ea.a.p("CW86dTRWAGV3", "MLoYGi7U"));
                    throw null;
                }
            } else {
                g.i(ea.a.p("KW9SdQpWXmV3", "6NX3BAgA"));
                throw null;
            }
        }
        return super.onSingleTapUp(e10);
    }
}
