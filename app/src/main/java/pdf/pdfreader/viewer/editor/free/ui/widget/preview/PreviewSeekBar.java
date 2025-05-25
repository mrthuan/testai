package pdf.pdfreader.viewer.editor.free.ui.widget.preview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import ea.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ui.widget.AddTextChangeSizeBottomSheetView;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.c;
import wo.b;

/* compiled from: PreviewSeekBar.kt */
/* loaded from: classes3.dex */
public final class PreviewSeekBar extends View {
    public static final /* synthetic */ int C = 0;
    public float A;
    public float B;

    /* renamed from: a  reason: collision with root package name */
    public final int f28411a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28412b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28413d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28414e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28415f;

    /* renamed from: g  reason: collision with root package name */
    public final int f28416g;

    /* renamed from: h  reason: collision with root package name */
    public final int f28417h;

    /* renamed from: i  reason: collision with root package name */
    public final int f28418i;

    /* renamed from: j  reason: collision with root package name */
    public int f28419j;

    /* renamed from: k  reason: collision with root package name */
    public int f28420k;

    /* renamed from: l  reason: collision with root package name */
    public final int f28421l;

    /* renamed from: m  reason: collision with root package name */
    public float f28422m;

    /* renamed from: n  reason: collision with root package name */
    public float f28423n;

    /* renamed from: o  reason: collision with root package name */
    public float f28424o;

    /* renamed from: p  reason: collision with root package name */
    public float f28425p;

    /* renamed from: q  reason: collision with root package name */
    public float f28426q;

    /* renamed from: r  reason: collision with root package name */
    public int f28427r;

    /* renamed from: s  reason: collision with root package name */
    public int f28428s;

    /* renamed from: t  reason: collision with root package name */
    public float f28429t;

    /* renamed from: u  reason: collision with root package name */
    public ValueAnimator f28430u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f28431v;

    /* renamed from: w  reason: collision with root package name */
    public final c f28432w;

    /* renamed from: x  reason: collision with root package name */
    public final c f28433x;

    /* renamed from: y  reason: collision with root package name */
    public b f28434y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f28435z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewSeekBar(Context context) {
        this(context, null, 0, 14);
        g.e(context, a.p("UG8ldBZ4dA==", "veS1y1UC"));
    }

    private final List<Integer> getMarkPosition() {
        return (List) this.f28432w.getValue();
    }

    private final Paint getSeekBarPaint() {
        return (Paint) this.f28433x.getValue();
    }

    public final int a(float f10) {
        if (this.f28435z) {
            f10 = getMeasuredWidth() - f10;
        }
        int i10 = (f10 > this.f28425p ? 1 : (f10 == this.f28425p ? 0 : -1));
        int i11 = this.f28418i;
        if (i10 <= 0) {
            return i11;
        }
        if (f10 >= this.f28426q) {
            return this.f28417h;
        }
        float f11 = ((f10 - this.f28422m) / this.f28424o) + i11;
        int i12 = (int) f11;
        if (f11 - i12 > 0.5d) {
            return t0.o0(f11);
        }
        return i12;
    }

    public final int b(int i10) {
        return (int) (getContext().getResources().getDisplayMetrics().density * i10);
    }

    public final void c(int i10, boolean z10, boolean z11) {
        b bVar;
        this.f28419j = i10;
        boolean z12 = false;
        int i11 = this.f28418i;
        int i12 = this.f28417h;
        if (i11 <= i10 && i10 <= i12) {
            z12 = true;
        }
        if (!z12) {
            if (i10 < i11) {
                this.f28419j = i11;
            }
            if (this.f28419j > i12) {
                this.f28419j = i12;
            }
        }
        if (z10 && (bVar = this.f28434y) != null) {
            ((AddTextChangeSizeBottomSheetView.a) bVar).a(i10, z11);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && Math.abs(motionEvent.getX() - this.A) > Math.abs(motionEvent.getY() - this.B)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else {
            this.A = motionEvent.getX();
            this.B = motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int getMaxProgress() {
        return this.f28417h;
    }

    public final int getMinProgress() {
        return this.f28418i;
    }

    public final int getProgress() {
        return this.f28419j;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28422m = 0.0f;
        this.f28423n = 0.0f;
        this.f28425p = 0.0f;
        this.f28426q = 0.0f;
        this.f28424o = 0.0f;
        this.f28434y = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        g.e(canvas, "canvas");
        super.onDraw(canvas);
        boolean z10 = this.f28435z;
        if (z10) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        float measuredHeight = getMeasuredHeight() / 2.0f;
        getSeekBarPaint().setColor(this.f28411a);
        Paint seekBarPaint = getSeekBarPaint();
        int i11 = this.f28416g;
        seekBarPaint.setStrokeWidth(i11);
        canvas.drawLine(this.f28422m - 0.0f, measuredHeight, this.f28423n + 0.0f, measuredHeight, getSeekBarPaint());
        Iterator<T> it = getMarkPosition().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i10 = this.f28418i;
            if (!hasNext) {
                break;
            }
            int intValue = ((Number) it.next()).intValue();
            getSeekBarPaint().setColor(this.c);
            canvas.drawCircle((this.f28424o * (intValue - i10)) + this.f28422m, getMeasuredHeight() / 2.0f, i11 / 2.0f, getSeekBarPaint());
        }
        Paint seekBarPaint2 = getSeekBarPaint();
        int i12 = this.f28412b;
        seekBarPaint2.setColor(i12);
        int i13 = this.f28419j;
        if (i13 == i10) {
            float f10 = this.f28422m;
            canvas.drawLine(f10 - 0.0f, measuredHeight, (this.f28424o * (i13 - i10)) + f10 + this.f28429t, measuredHeight, getSeekBarPaint());
        } else if (i13 == this.f28417h) {
            float f11 = this.f28422m;
            canvas.drawLine(f11 - 0.0f, measuredHeight, (this.f28424o * (i13 - i10)) + f11 + 0.0f + this.f28429t, measuredHeight, getSeekBarPaint());
        } else {
            float f12 = this.f28422m;
            canvas.drawLine(f12 - 0.0f, measuredHeight, (this.f28424o * (i13 - i10)) + f12 + this.f28429t, measuredHeight, getSeekBarPaint());
        }
        for (Number number : getMarkPosition()) {
            int intValue2 = number.intValue();
            if (this.f28419j >= intValue2) {
                getSeekBarPaint().setColor(this.f28413d);
                canvas.drawCircle((this.f28424o * (intValue2 - i10)) + this.f28422m, getMeasuredHeight() / 2.0f, i11 / 2.0f, getSeekBarPaint());
            }
        }
        getSeekBarPaint().setColor(-1);
        float f13 = (this.f28424o * (this.f28419j - i10)) + this.f28422m + this.f28429t;
        int i14 = this.f28414e;
        canvas.drawCircle(f13, measuredHeight, i14 / 2.0f, getSeekBarPaint());
        getSeekBarPaint().setColor(i12);
        canvas.drawCircle((this.f28424o * (this.f28419j - i10)) + this.f28422m + this.f28429t, measuredHeight, (i14 / 2.0f) - this.f28415f, getSeekBarPaint());
        if (z10) {
            canvas.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r0.isRunning() == true) goto L13;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSizeChanged(int r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            super.onSizeChanged(r3, r4, r5, r6)
            if (r3 <= 0) goto L54
            if (r3 != r5) goto L8
            goto L54
        L8:
            int r4 = r2.getPaddingStart()
            float r4 = (float) r4
            int r5 = r2.f28414e
            float r5 = (float) r5
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r4 = r4 + r5
            int r0 = r2.getPaddingEnd()
            int r3 = r3 - r0
            float r3 = (float) r3
            float r3 = r3 - r5
            float r5 = r3 - r4
            int r0 = r2.f28421l
            float r0 = (float) r0
            float r5 = r5 / r0
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 > 0) goto L31
            r2.f28422m = r0
            r2.f28423n = r0
            r2.f28425p = r0
            r2.f28426q = r0
            r2.f28424o = r0
            return
        L31:
            android.animation.ValueAnimator r0 = r2.f28430u
            if (r0 == 0) goto L3d
            boolean r0 = r0.isRunning()
            r1 = 1
            if (r0 != r1) goto L3d
            goto L3e
        L3d:
            r1 = 0
        L3e:
            if (r1 == 0) goto L47
            android.animation.ValueAnimator r0 = r2.f28430u
            if (r0 == 0) goto L47
            r0.cancel()
        L47:
            r2.f28422m = r4
            r2.f28423n = r3
            r2.f28424o = r5
            float r5 = r5 / r6
            float r4 = r4 + r5
            r2.f28425p = r4
            float r3 = r3 - r5
            r2.f28426q = r3
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar.onSizeChanged(int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
        if (r1 != 3) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnProgressChangedListener(b listener) {
        g.e(listener, "listener");
        this.f28434y = listener;
    }

    public final void setProgress(int i10) {
        c(i10, false, false);
    }

    public final void setSaving(boolean z10) {
        this.f28431v = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        g.e(context, a.p("LG9fdBx4dA==", "Tt33AyLs"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewSeekBar(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 8);
        g.e(context, a.p("UG8ldBZ4dA==", "58S8DQeu"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PreviewSeekBar(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10) {
        /*
            r6 = this;
            r0 = r10 & 2
            if (r0 == 0) goto L5
            r8 = 0
        L5:
            r0 = 4
            r10 = r10 & r0
            r1 = 0
            if (r10 == 0) goto Lb
            r9 = r1
        Lb:
            java.lang.String r10 = "LG9fdBx4dA=="
            java.lang.String r2 = "c2yRhVjL"
            java.lang.String r10 = ea.a.p(r10, r2)
            kotlin.jvm.internal.g.e(r7, r10)
            r6.<init>(r7, r8, r9, r1)
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.f28411a = r10
            r2 = -1
            r6.f28412b = r2
            r3 = -7829368(0xffffffffff888888, float:NaN)
            r6.c = r3
            r6.f28413d = r3
            r4 = 50
            r6.f28417h = r4
            r4 = 5
            r6.f28418i = r4
            r5 = 10
            r6.f28419j = r5
            pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$markPosition$2 r5 = new cg.a<java.util.List<java.lang.Integer>>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$markPosition$2
                static {
                    /*
                        pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$markPosition$2 r0 = new pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$markPosition$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$markPosition$2) pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$markPosition$2.INSTANCE pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$markPosition$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$markPosition$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$markPosition$2.<init>():void");
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ java.util.List<java.lang.Integer> invoke() {
                    /*
                        r1 = this;
                        java.util.List r0 = r1.invoke()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$markPosition$2.invoke():java.lang.Object");
                }

                @Override // cg.a
                public final java.util.List<java.lang.Integer> invoke() {
                    /*
                        r3 = this;
                        r0 = 9
                        java.lang.Integer[] r0 = new java.lang.Integer[r0]
                        r1 = 10
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                        r2 = 0
                        r0[r2] = r1
                        r1 = 15
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                        r2 = 1
                        r0[r2] = r1
                        r1 = 20
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                        r2 = 2
                        r0[r2] = r1
                        r1 = 25
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                        r2 = 3
                        r0[r2] = r1
                        r1 = 30
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                        r2 = 4
                        r0[r2] = r1
                        r1 = 35
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                        r2 = 5
                        r0[r2] = r1
                        r1 = 40
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                        r2 = 6
                        r0[r2] = r1
                        r1 = 45
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                        r2 = 7
                        r0[r2] = r1
                        r1 = 50
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                        r2 = 8
                        r0[r2] = r1
                        java.util.ArrayList r0 = ge.a.J(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$markPosition$2.invoke():java.util.List");
                }
            }
            tf.c r5 = kotlin.a.a(r5)
            r6.f28432w = r5
            pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$seekBarPaint$2 r5 = new cg.a<android.graphics.Paint>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$seekBarPaint$2
                static {
                    /*
                        pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$seekBarPaint$2 r0 = new pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$seekBarPaint$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$seekBarPaint$2) pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$seekBarPaint$2.INSTANCE pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$seekBarPaint$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$seekBarPaint$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$seekBarPaint$2.<init>():void");
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ android.graphics.Paint invoke() {
                    /*
                        r1 = this;
                        android.graphics.Paint r0 = r1.invoke()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$seekBarPaint$2.invoke():java.lang.Object");
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // cg.a
                public final android.graphics.Paint invoke() {
                    /*
                        r2 = this;
                        android.graphics.Paint r0 = new android.graphics.Paint
                        r1 = 1
                        r0.<init>(r1)
                        android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
                        r0.setStyle(r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar$seekBarPaint$2.invoke():android.graphics.Paint");
                }
            }
            tf.c r5 = kotlin.a.a(r5)
            r6.f28433x = r5
            android.content.res.Resources$Theme r7 = r7.getTheme()
            int[] r5 = pdf.pdfreader.viewer.editor.free.a.f23895f
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8, r5, r9, r1)
            java.lang.String r8 = "Bm8tdDF4IS48aANtUS44YkxhO24adE9sloDXUzRlKUIEcm8gMGUzUzx5CmV1dCNyFCBiKQ=="
            java.lang.String r9 = "O7eCTULU"
            java.lang.String r8 = ea.a.p(r8, r9)
            kotlin.jvm.internal.g.d(r7, r8)
            r8 = 1
            int r9 = r7.getColor(r1, r10)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r6.f28411a = r9     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            int r9 = r7.getColor(r0, r2)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r6.f28412b = r9     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            int r9 = r7.getColor(r8, r3)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r6.c = r9     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r9 = 2
            int r9 = r7.getColor(r9, r3)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r6.f28413d = r9     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r9 = 18
            int r9 = r6.b(r9)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r10 = 6
            int r9 = r7.getDimensionPixelSize(r10, r9)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r6.f28414e = r9     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r9 = 3
            int r10 = r6.b(r9)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r2 = 7
            int r10 = r7.getDimensionPixelSize(r2, r10)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r6.f28415f = r10     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            int r10 = r6.b(r0)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            int r10 = r7.getDimensionPixelSize(r4, r10)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r6.f28416g = r10     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            int r10 = r6.b(r0)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r7.getDimensionPixelSize(r9, r10)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            goto La2
        L9c:
            r8 = move-exception
            goto Le6
        L9e:
            r9 = move-exception
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L9c
        La2:
            r7.recycle()
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 24
            if (r7 < r9) goto Lc0
            android.content.Context r7 = r6.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            android.os.LocaleList r7 = com.bytedance.sdk.openadsdk.component.reward.b.d(r7)
            java.util.Locale r7 = androidx.emoji2.text.s.g(r7)
            goto Lce
        Lc0:
            android.content.Context r7 = r6.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
        Lce:
            int r9 = v0.f.f30479a
            int r7 = v0.f.a.a(r7)
            if (r7 != r8) goto Ld7
            r1 = r8
        Ld7:
            r6.f28435z = r1
            int r7 = r6.f28417h
            int r8 = r6.f28418i
            int r7 = r7 - r8
            r6.f28421l = r7
            int r7 = r6.f28419j
            r6.setProgress(r7)
            return
        Le6:
            r7.recycle()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
