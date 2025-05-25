package xo;

import android.graphics.Rect;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import kj.a;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignatureImageView;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: MultiTouchSignatureListener.java */
/* loaded from: classes3.dex */
public class a implements View.OnTouchListener {

    /* renamed from: i  reason: collision with root package name */
    public static final Rect f31885i;

    /* renamed from: b  reason: collision with root package name */
    public float f31887b;
    public float c;

    /* renamed from: e  reason: collision with root package name */
    public int f31889e;

    /* renamed from: h  reason: collision with root package name */
    public boolean f31892h;

    /* renamed from: a  reason: collision with root package name */
    public int f31886a = -1;

    /* renamed from: f  reason: collision with root package name */
    public float f31890f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f31891g = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public final kj.a f31888d = new kj.a(new C0411a());

    /* compiled from: MultiTouchSignatureListener.java */
    /* renamed from: xo.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0411a extends a.b {

        /* renamed from: a  reason: collision with root package name */
        public final kj.c f31893a = new kj.c();

        public C0411a() {
        }
    }

    static {
        ea.a.p("HGlWbhh0QnI_TCNzAWUGZUctPg==", "DZB8tkiL");
        f31885i = new Rect(SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public static float b(MotionEvent motionEvent) {
        return (float) Math.toDegrees(Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0)));
    }

    public static void d(View view) {
        VibrationEffect createOneShot;
        try {
            Vibrator vibrator = (Vibrator) view.getContext().getSystemService(ea.a.p("RWkpchJ0DXI=", "03S7aZlF"));
            if (vibrator.hasVibrator()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    createOneShot = VibrationEffect.createOneShot(90L, -1);
                    vibrator.vibrate(createOneShot);
                } else {
                    vibrator.vibrate(90L);
                }
            }
        } catch (Exception unused) {
            if (view != null) {
                view.performHapticFeedback(1, 2);
            }
        }
    }

    public final void a(View view, float f10, float f11) {
        if (f10 != 0.0f || f11 != 0.0f) {
            try {
                this.f31892h = true;
                ExecutorService executorService = ReaderPreviewActivity.U5;
                ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                PopupWindow popupWindow = readerPreviewActivity.f26248r5;
                if (popupWindow != null && popupWindow.isShowing()) {
                    readerPreviewActivity.f26248r5.dismiss();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        ea.a.p("V2UndBJYQjog", "3FSmvjs8");
        ea.a.p("HyAvZR90A1lSOiA=", "B1gJagP0");
        float[] fArr = {f10, f11};
        view.getMatrix().mapVectors(fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        ea.a.p("O3JQbgpPUWYpZT5YVTog", "IARUoRRA");
        ea.a.p("HyA_chJuEU8UZkdlHVl2OiA=", "2dNl5VBF");
        ea.a.p("PWUIclZluLya", "gwYo3WuH");
        view.getRotation();
        int[] iArr = new int[2];
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        ea.a.p("GWk1bgRlEHQcbxY6", "3MjRHvnh");
        Arrays.toString(iArr);
        double radians = Math.toRadians(view.getRotation());
        ea.a.p("FmUUcjRlOg==", "tDrsQ7rV");
        float f14 = width;
        int[] iArr2 = {(int) ((view.getScaleX() * f14 * Math.cos(radians)) + iArr[0]), (int) ((view.getScaleX() * f14 * Math.sin(radians)) + iArr[1])};
        ea.a.p("QGksbiFpBWgGVFtwOg==", "1zJ3Ftba");
        Arrays.toString(iArr2);
        float f15 = height;
        int[] iArr3 = {(int) (iArr[0] - ((view.getScaleY() * f15) * Math.sin(radians))), (int) ((view.getScaleY() * f15 * Math.cos(radians)) + iArr[1])};
        ea.a.p("QGksbj9lBHQwb0B0Bm06", "yJP0D55X");
        Arrays.toString(iArr3);
        int[] iArr4 = {(int) ((((view.getScaleX() * f14) * Math.cos(radians)) + iArr[0]) - ((view.getScaleY() * f15) * Math.sin(radians))), (int) ((f15 * view.getScaleY() * Math.cos(radians)) + (f14 * view.getScaleX() * Math.sin(radians)) + iArr[1])};
        ea.a.p("NmkLbitpNWg8Qgl0QG86Og==", "XkElyRnH");
        Arrays.toString(iArr4);
        Rect T = t0.T(iArr, iArr2, iArr3, iArr4);
        ea.a.p("PWVSdD9yWG0KbyNuATo=", "DzjuvLGX");
        T.toString();
        int i10 = (T.left + T.right) / 2;
        int i11 = (T.top + T.bottom) / 2;
        ea.a.p("UGUldBZyOiBIIA==", "Y9OasiGy");
        ea.a.p("SSAbZSl0H3IRIFwg", "O7exGzcg");
        int i12 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        Rect rect = f31885i;
        if (i12 < 0) {
            int i13 = T.left;
            int i14 = rect.left;
            if (i13 + f12 <= i14) {
                f12 = i14 - i13;
            }
        }
        if (f12 > 0.0f) {
            int i15 = T.right;
            int i16 = rect.right;
            if (i15 + f12 >= i16) {
                f12 = i16 - i15;
            }
        }
        if (f13 < 0.0f && T.top + f13 <= rect.top) {
            ea.a.p("LmRbdQp0Y3I7bjlsFHQBb1s-UD4mZQt0NXI2IEogPVMmZ19hDXVFZR5yK2c3bx1uUS4ab3A=", "iyOQPovP");
            ea.a.p("EyA5ZRB0JHIdbWRvAG4iLjBvQiA=", "Rs0I7D8O");
            f13 = rect.top - T.top;
        }
        if (f13 > 0.0f && T.bottom + f13 >= rect.bottom) {
            ea.a.p("LmRbdQp0Y3I7bjlsFHQBb1s-UD4mZQt0EXJhIGcgP1MmZ19hDXVFZR5yK2c3bx1uUS4MbzF0Cm0=", "UNtJt8YR");
            f13 = rect.bottom - T.bottom;
        }
        ea.a.p("LmRbdQp0Y3I7bjlsFHQBb1s-UD4=", "E1RfzsyX");
        view.setTranslationX(view.getTranslationX() + f12);
        view.setTranslationY(view.getTranslationY() + f13);
    }

    public void c() {
        throw null;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        SignatureImageView signatureImageView;
        int i11;
        kj.a aVar = this.f31888d;
        try {
            ea.a.p("Am4XbzdjUT52PgN2UW4jLl9lJlhhKQsg", "qwmCB9n7");
            motionEvent.getX();
            ea.a.p("FWUfZR50ZmctdD8oHT0=", "tY9ipH1z");
            motionEvent.getY();
            motionEvent.getAction();
            i10 = 0;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (motionEvent.getX() == 0.0f && motionEvent.getY() == 0.0f) {
            return false;
        }
        if (view instanceof SignatureImageView) {
            signatureImageView = (SignatureImageView) view;
        } else {
            signatureImageView = null;
        }
        if (motionEvent.getPointerCount() > 1) {
            if (signatureImageView != null) {
                signatureImageView.i();
            }
            if (motionEvent.getPointerCount() == 2) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 2) {
                    if (actionMasked == 5) {
                        this.f31890f = b(motionEvent);
                        this.f31892h = false;
                    }
                } else {
                    float b10 = this.f31891g + (b(motionEvent) - this.f31890f);
                    this.f31891g = b10;
                    if (b10 != 0.0f && Math.abs(b10) % 360.0f < 3.0f) {
                        if (view.getRotation() != 0.0f && Math.abs(this.f31891g) % 360.0f > 1.0f) {
                            d(view);
                        }
                        view.setRotation(0.0f);
                        this.f31891g = 0.0f;
                    } else {
                        view.setRotation(this.f31891g);
                    }
                }
            }
        }
        if (view.isSelected() && view.getParent() != null) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 2) {
                    this.f31889e = 0;
                }
            } else {
                this.f31892h = false;
                f31885i.set(ReaderPreviewActivity.this.f26227n5);
                if (signatureImageView != null) {
                    float x4 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    if (signatureImageView.f28458q.contains(x4, y10)) {
                        signatureImageView.f28457p = 100;
                    } else if (signatureImageView.f28459r.contains(x4, y10)) {
                        signatureImageView.f28457p = 102;
                    } else if (signatureImageView.f28460s.contains(x4, y10)) {
                        signatureImageView.f28457p = 101;
                    } else if (signatureImageView.f28462u.contains(x4, y10)) {
                        signatureImageView.f28457p = 103;
                    } else {
                        signatureImageView.i();
                    }
                    this.f31889e = signatureImageView.f28457p;
                }
            }
            try {
                i11 = this.f31889e;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (i11 != 103 && i11 != 101 && i11 != 100 && i11 != 102) {
                if (signatureImageView != null) {
                    signatureImageView.i();
                }
                int action2 = motionEvent.getAction();
                int actionMasked2 = motionEvent.getActionMasked() & action2;
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 != 2) {
                            if (actionMasked2 != 3) {
                                if (actionMasked2 == 6) {
                                    int i12 = (65280 & action2) >> 8;
                                    if (motionEvent.getPointerId(i12) == this.f31886a) {
                                        if (i12 == 0) {
                                            i10 = 1;
                                        }
                                        this.f31887b = motionEvent.getX(i10);
                                        this.c = motionEvent.getY(i10);
                                        this.f31886a = motionEvent.getPointerId(i10);
                                    }
                                }
                                return true;
                            }
                        }
                    }
                    this.f31886a = -1;
                    if (signatureImageView != null) {
                        signatureImageView.i();
                    }
                    if (this.f31892h) {
                        c();
                    }
                    return true;
                }
                this.f31892h = false;
                aVar.c();
                this.f31887b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.f31886a = motionEvent.getPointerId(0);
                int findPointerIndex = motionEvent.findPointerIndex(this.f31886a);
                if (findPointerIndex != -1) {
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y11 = motionEvent.getY(findPointerIndex);
                    if (!aVar.f19787b) {
                        a(view, x10 - this.f31887b, y11 - this.c);
                    }
                }
                return true;
            }
            return aVar.b(view, motionEvent);
        }
        return false;
    }
}
