package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import lib.zj.pdfeditor.PageView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: PdfReaderViewContainer.kt */
/* loaded from: classes3.dex */
public final class PdfReaderViewContainer extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public float f28264a;

    /* renamed from: b  reason: collision with root package name */
    public float f28265b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f28266d;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f28267e;

    /* renamed from: f  reason: collision with root package name */
    public final Path f28268f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f28269g;

    /* renamed from: h  reason: collision with root package name */
    public ij.f f28270h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PdfReaderViewContainer(Context context) {
        this(context, null);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "kBPZIFpg"));
    }

    public final float a(float f10, PageView pageView) {
        float f11;
        ij.f fVar = this.f28270h;
        kotlin.jvm.internal.g.b(fVar);
        if (fVar.f18542d != null) {
            ij.f fVar2 = this.f28270h;
            kotlin.jvm.internal.g.b(fVar2);
            f11 = fVar2.f18542d.getScale();
        } else {
            f11 = 1.0f;
        }
        if (pageView != null) {
            return (f10 * f11) + pageView.getX();
        }
        return f10;
    }

    public final float b(float f10, PageView pageView) {
        float f11;
        ij.f fVar = this.f28270h;
        kotlin.jvm.internal.g.b(fVar);
        if (fVar.f18542d != null) {
            ij.f fVar2 = this.f28270h;
            kotlin.jvm.internal.g.b(fVar2);
            f11 = fVar2.f18542d.getScale();
        } else {
            f11 = 1.0f;
        }
        if (pageView != null) {
            return (f10 * f11) + pageView.getY();
        }
        return f10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ij.f fVar;
        ij.f fVar2;
        ij.f fVar3;
        ij.f fVar4;
        ij.f fVar5;
        ij.f fVar6;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        kotlin.jvm.internal.g.e(canvas, "canvas");
        super.dispatchDraw(canvas);
        ij.f fVar7 = this.f28270h;
        if (fVar7 != null) {
            kotlin.jvm.internal.g.b(fVar7);
            if (fVar7.f18540a != null) {
                ij.f fVar8 = this.f28270h;
                kotlin.jvm.internal.g.b(fVar8);
                boolean z17 = true;
                if (fVar8.f18540a.left == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ij.f fVar9 = this.f28270h;
                    kotlin.jvm.internal.g.b(fVar9);
                    if (fVar9.f18540a.right == 0.0f) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        ij.f fVar10 = this.f28270h;
                        kotlin.jvm.internal.g.b(fVar10);
                        if (fVar10.f18540a.top == 0.0f) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            ij.f fVar11 = this.f28270h;
                            kotlin.jvm.internal.g.b(fVar11);
                            if (fVar11.f18540a.bottom == 0.0f) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                return;
                            }
                        }
                    }
                }
                ij.f fVar12 = this.f28270h;
                kotlin.jvm.internal.g.b(fVar12);
                float f10 = fVar12.f18540a.left;
                ij.f fVar13 = this.f28270h;
                kotlin.jvm.internal.g.b(fVar13);
                this.f28264a = a(f10, fVar13.f18542d);
                ij.f fVar14 = this.f28270h;
                kotlin.jvm.internal.g.b(fVar14);
                float f11 = fVar14.f18540a.top;
                ij.f fVar15 = this.f28270h;
                kotlin.jvm.internal.g.b(fVar15);
                this.f28265b = b(f11, fVar15.f18542d);
                ij.f fVar16 = this.f28270h;
                kotlin.jvm.internal.g.b(fVar16);
                float f12 = fVar16.f18540a.right;
                ij.f fVar17 = this.f28270h;
                kotlin.jvm.internal.g.b(fVar17);
                this.c = a(f12, fVar17.f18542d);
                ij.f fVar18 = this.f28270h;
                kotlin.jvm.internal.g.b(fVar18);
                float f13 = fVar18.f18540a.bottom;
                ij.f fVar19 = this.f28270h;
                kotlin.jvm.internal.g.b(fVar19);
                float b10 = b(f13, fVar19.f18542d);
                this.f28266d = b10;
                float f14 = this.f28264a;
                if (f14 == 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (this.c == 0.0f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        if (this.f28265b == 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            if (b10 != 0.0f) {
                                z17 = false;
                            }
                            if (z17) {
                                return;
                            }
                        }
                    }
                }
                int i10 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
                Paint paint = this.f28267e;
                if (i10 > 0 && this.f28265b > 0.0f && f14 < getWidth() && this.f28265b < getHeight()) {
                    Path path = this.f28268f;
                    path.reset();
                    path.moveTo(this.f28264a, this.f28265b);
                    float f15 = this.f28264a;
                    kotlin.jvm.internal.g.b(this.f28270h);
                    path.lineTo(f15 - fVar4.c, this.f28265b);
                    float f16 = this.f28264a;
                    kotlin.jvm.internal.g.b(this.f28270h);
                    float f17 = f16 - fVar5.f18541b;
                    float f18 = this.f28265b;
                    kotlin.jvm.internal.g.b(this.f28270h);
                    path.arcTo(f17, f18 - fVar6.f18541b, this.f28264a, this.f28265b, 90.0f, 270.0f, false);
                    path.lineTo(this.f28264a, this.f28265b);
                    path.close();
                    canvas.drawPath(path, paint);
                }
                float f19 = this.c;
                if (f19 > 0.0f && this.f28266d > 0.0f && f19 < getWidth() && this.f28266d < getHeight()) {
                    Path path2 = this.f28269g;
                    path2.reset();
                    path2.moveTo(this.c, this.f28266d);
                    float f20 = this.c;
                    kotlin.jvm.internal.g.b(this.f28270h);
                    path2.lineTo(f20 + fVar.c, this.f28266d);
                    float f21 = this.c;
                    float f22 = this.f28266d;
                    kotlin.jvm.internal.g.b(this.f28270h);
                    float f23 = f21 + fVar2.f18541b;
                    float f24 = this.f28266d;
                    kotlin.jvm.internal.g.b(this.f28270h);
                    path2.arcTo(f21, f22, f23, f24 + fVar3.f18541b, 270.0f, 270.0f, false);
                    path2.lineTo(this.c, this.f28266d);
                    path2.close();
                    canvas.drawPath(path2, paint);
                }
            }
        }
    }

    public final void setPageParam(ij.f param) {
        kotlin.jvm.internal.g.e(param, "param");
        this.f28270h = param;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PdfReaderViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.g.e(context, ea.a.p("KG83dFx4dA==", "m6KY9tF6"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfReaderViewContainer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "loiXbnhx"));
        Paint paint = new Paint(1);
        this.f28267e = paint;
        this.f28268f = new Path();
        this.f28269g = new Path();
        paint.setColor(androidx.core.content.a.getColor(getContext(), R.color.colorAccent));
        paint.setStyle(Paint.Style.FILL);
    }
}
