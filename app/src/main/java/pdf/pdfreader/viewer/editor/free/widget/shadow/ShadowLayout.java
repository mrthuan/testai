package pdf.pdfreader.viewer.editor.free.widget.shadow;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c4.s;
import com.bumptech.glide.e;
import mp.b;
import mp.c;
import mp.d;
import mp.g;
import mp.h;
import mp.i;
import pdf.pdfreader.viewer.editor.free.R;
import v3.f;

/* loaded from: classes3.dex */
public class ShadowLayout extends FrameLayout {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public float H;
    public int I;
    public int J;
    public float K;
    public float L;
    public boolean M;
    public Drawable N;
    public int O;
    public int P;
    public TextView Q;
    public int R;
    public int S;
    public String T;
    public String U;
    public Paint V;
    public Path W;

    /* renamed from: a  reason: collision with root package name */
    public Paint f28822a;

    /* renamed from: a0  reason: collision with root package name */
    public View.OnClickListener f28823a0;

    /* renamed from: b  reason: collision with root package name */
    public int f28824b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f28825d;

    /* renamed from: e  reason: collision with root package name */
    public float f28826e;

    /* renamed from: f  reason: collision with root package name */
    public float f28827f;

    /* renamed from: g  reason: collision with root package name */
    public float f28828g;

    /* renamed from: h  reason: collision with root package name */
    public float f28829h;

    /* renamed from: i  reason: collision with root package name */
    public float f28830i;

    /* renamed from: j  reason: collision with root package name */
    public float f28831j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f28832k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f28833l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f28834m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f28835n;

    /* renamed from: o  reason: collision with root package name */
    public int f28836o;

    /* renamed from: p  reason: collision with root package name */
    public int f28837p;

    /* renamed from: q  reason: collision with root package name */
    public int f28838q;

    /* renamed from: r  reason: collision with root package name */
    public int f28839r;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f28840s;

    /* renamed from: t  reason: collision with root package name */
    public View f28841t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f28842u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f28843v;

    /* renamed from: w  reason: collision with root package name */
    public int f28844w;

    /* renamed from: x  reason: collision with root package name */
    public GradientDrawable f28845x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f28846y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f28847z;

    /* loaded from: classes3.dex */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            ShadowLayout shadowLayout = ShadowLayout.this;
            shadowLayout.removeOnLayoutChangeListener(this);
            shadowLayout.setSelected(shadowLayout.isSelected());
        }
    }

    public ShadowLayout(Context context) {
        this(context, null);
    }

    private ColorStateList getColorStateList() {
        int[][] iArr = {new int[]{16842919}, new int[]{16842908}, new int[]{16843518}, new int[0]};
        int i10 = this.A;
        int i11 = this.B;
        return new ColorStateList(iArr, new int[]{i11, i11, i11, i10});
    }

    public final void a() {
        View view;
        if (this.f28844w == 1 && (view = this.f28841t) != null) {
            if (!this.M) {
                if (this.O != -101) {
                    if (this.f28846y != null) {
                        view.getBackground().setAlpha(0);
                    }
                    GradientDrawable gradientDrawable = this.f28845x;
                    int i10 = this.O;
                    gradientDrawable.setColors(new int[]{i10, i10});
                    postInvalidate();
                    return;
                }
                Drawable drawable = this.N;
                if (drawable != null) {
                    e(ea.a.p("LGhQbh5lZHczdCloNmwBY15hDGxl", "cEQfFGXT"), drawable);
                    this.f28845x.setColors(new int[]{Color.parseColor(ea.a.p("EDB7MEMwUjAw", "LRPpaaBu")), Color.parseColor(ea.a.p("EDB7MEMwUjAw", "2m3P5DrY"))});
                    postInvalidate();
                    return;
                }
                return;
            }
            Drawable drawable2 = this.f28846y;
            if (drawable2 != null) {
                e(ea.a.p("UGgqbhRlMXcbdFdoKmw_Yy9hUGxl", "3036QSDK"), drawable2);
            } else if (view.getBackground() != null) {
                this.f28841t.getBackground().setAlpha(0);
            }
            GradientDrawable gradientDrawable2 = this.f28845x;
            int i11 = this.A;
            gradientDrawable2.setColors(new int[]{i11, i11});
            postInvalidate();
        }
    }

    public final float[] b(int i10) {
        int i11;
        float f10 = this.f28828g;
        if (f10 == -1.0f) {
            f10 = this.f28827f;
        }
        float f11 = (int) f10;
        float f12 = i10 / 2.0f;
        if (f11 > f12) {
            f11 = f12;
        }
        float f13 = this.f28829h;
        if (f13 == -1.0f) {
            f13 = this.f28827f;
        }
        float f14 = (int) f13;
        if (f14 > f12) {
            f14 = f12;
        }
        float f15 = this.f28831j;
        if (f15 == -1.0f) {
            f15 = this.f28827f;
        }
        float f16 = (int) f15;
        if (f16 > f12) {
            f16 = f12;
        }
        float f17 = this.f28830i;
        if (f17 == -1.0f) {
            i11 = (int) this.f28827f;
        } else {
            i11 = (int) f17;
        }
        float f18 = i11;
        if (f18 <= f12) {
            f12 = f18;
        }
        return new float[]{f11, f11, f14, f14, f16, f16, f12, f12};
    }

    public final void c(GradientDrawable gradientDrawable) {
        int[] iArr;
        if (!this.M) {
            return;
        }
        int i10 = this.D;
        if (i10 == -101) {
            iArr = new int[]{this.C, this.E};
        } else {
            iArr = new int[]{this.C, i10, this.E};
        }
        gradientDrawable.setColors(iArr);
        int i11 = this.F;
        if (i11 < 0) {
            this.F = (i11 % 360) + 360;
        }
        switch ((this.F % 360) / 45) {
            case 0:
                gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                return;
            case 1:
                gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
                return;
            case 2:
                gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                return;
            case 3:
                gradientDrawable.setOrientation(GradientDrawable.Orientation.BR_TL);
                return;
            case 4:
                gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
                return;
            case 5:
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TR_BL);
                return;
            case 6:
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                return;
            case 7:
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
                return;
            default:
                return;
        }
    }

    public final boolean d() {
        if (this.f28844w == 4) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f28840s;
        int i10 = (int) (rectF.bottom - rectF.top);
        if (getChildAt(0) != null) {
            if (this.f28828g == -1.0f && this.f28830i == -1.0f && this.f28829h == -1.0f && this.f28831j == -1.0f) {
                Path path = new Path();
                float f10 = this.f28827f;
                float f11 = i10 / 2.0f;
                if (f10 > f11) {
                    path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
                } else {
                    path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                }
                canvas.clipPath(path);
            } else {
                float[] b10 = b(i10);
                Path path2 = new Path();
                path2.addRoundRect(this.f28836o, this.f28837p, getWidth() - this.f28838q, getHeight() - this.f28839r, b10, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e(String str, Drawable drawable) {
        int i10;
        this.f28841t.setTag(R.id.action_container, str);
        View view = this.f28841t;
        if (view != null && drawable != null) {
            float f10 = this.f28828g;
            int i11 = (f10 > (-1.0f) ? 1 : (f10 == (-1.0f) ? 0 : -1));
            if (i11 == 0 && this.f28830i == -1.0f && this.f28829h == -1.0f && this.f28831j == -1.0f) {
                float f11 = this.f28827f;
                if (f11 == 0.0f) {
                    view.addOnLayoutChangeListener(new b(view, drawable, str));
                    if (view.getMeasuredWidth() != 0 || view.getMeasuredHeight() != 0) {
                        e<Drawable> b10 = com.bumptech.glide.b.g(view).b();
                        b10.F = drawable;
                        b10.I = true;
                        b10.C(new l4.e().g(f.f30509a)).z(new c4.f(), true).n(view.getMeasuredWidth(), view.getMeasuredHeight()).F(new c(view));
                        return;
                    }
                    return;
                }
                view.addOnLayoutChangeListener(new d(view, drawable, f11, str));
                if (view.getMeasuredWidth() != 0 || view.getMeasuredHeight() != 0) {
                    com.bumptech.glide.b.g(view).m(drawable).A(new c4.f(), new s((int) f11)).n(view.getMeasuredWidth(), view.getMeasuredHeight()).F(new mp.e(view));
                    return;
                }
                return;
            }
            if (i11 == 0) {
                f10 = this.f28827f;
            }
            int i12 = (int) f10;
            float f12 = this.f28830i;
            if (f12 == -1.0f) {
                f12 = this.f28827f;
            }
            int i13 = (int) f12;
            float f13 = this.f28829h;
            if (f13 == -1.0f) {
                f13 = this.f28827f;
            }
            int i14 = (int) f13;
            float f14 = this.f28831j;
            if (f14 == -1.0f) {
                i10 = (int) this.f28827f;
            } else {
                i10 = (int) f14;
            }
            float f15 = i12;
            float f16 = i13;
            float f17 = i14;
            float f18 = i10;
            if (f15 == 0.0f && f16 == 0.0f && f17 == 0.0f && f18 == 0.0f) {
                view.addOnLayoutChangeListener(new mp.f(view, drawable, str));
                if (view.getMeasuredWidth() != 0 || view.getMeasuredHeight() != 0) {
                    com.bumptech.glide.b.g(view).m(drawable).n(view.getMeasuredWidth(), view.getMeasuredHeight()).F(new g(view));
                    return;
                }
                return;
            }
            mp.a aVar = new mp.a(view.getContext(), f15, f16, f17, f18);
            view.addOnLayoutChangeListener(new h(view, drawable, aVar, str));
            if (view.getMeasuredWidth() != 0 || view.getMeasuredHeight() != 0) {
                com.bumptech.glide.b.g(view).m(drawable).z(aVar, true).n(view.getMeasuredWidth(), view.getMeasuredHeight()).F(new i(view, str));
            }
        }
    }

    public float getCornerRadius() {
        return this.f28827f;
    }

    public float getShadowLimit() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (d()) {
            int width = getWidth();
            int height = getHeight();
            if (width > height) {
                this.V.setStrokeWidth(height);
                this.W.reset();
                float f10 = height / 2;
                this.W.moveTo(0.0f, f10);
                this.W.lineTo(width, f10);
            } else {
                this.V.setStrokeWidth(width);
                this.W.reset();
                float f11 = width / 2;
                this.W.moveTo(f11, 0.0f);
                this.W.lineTo(f11, height);
            }
            canvas.drawPath(this.W, this.V);
            return;
        }
        RectF rectF = this.f28840s;
        rectF.left = this.f28836o;
        rectF.top = this.f28837p;
        rectF.right = getWidth() - this.f28838q;
        rectF.bottom = getHeight() - this.f28839r;
        int i10 = (int) (rectF.bottom - rectF.top);
        if (this.I != -101) {
            float f12 = i10 / 2;
            if (this.H > f12) {
                this.H = f12;
            }
        }
        if (this.f28846y == null && this.f28847z == null) {
            float[] b10 = b(i10);
            if (this.f28844w != 3) {
                this.f28845x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                if (this.I != -101) {
                    if (this.K != -1.0f) {
                        this.f28845x.setStroke(Math.round(this.H), this.G, this.K, this.L);
                    } else {
                        this.f28845x.setStroke(Math.round(this.H), this.G);
                    }
                }
                this.f28845x.setCornerRadii(b10);
                this.f28845x.draw(canvas);
                return;
            }
            ColorStateList colorStateList = getColorStateList();
            RoundRectShape roundRectShape = new RoundRectShape(b10, null, null);
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.setShape(roundRectShape);
            shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
            if (this.I != -101) {
                if (this.K != -1.0f) {
                    this.f28845x.setStroke(Math.round(this.H), this.G, this.K, this.L);
                } else {
                    this.f28845x.setStroke(Math.round(this.H), this.G);
                }
            }
            this.f28845x.setCornerRadii(b10);
            if (this.C != -101) {
                c(this.f28845x);
            }
            this.f28841t.setBackground(new RippleDrawable(colorStateList, this.f28845x, shapeDrawable));
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (d()) {
            if (getChildAt(0) == null) {
                return;
            }
            throw new UnsupportedOperationException(ea.a.p("I2grcApNJ2Qt5N66eU8TRWdEE1MBTH9OMe_NjLW4z-bEr6yM7uXlkD5pA3c=", "ChPJoHvZ"));
        }
        int i10 = this.P;
        if (i10 != -1) {
            TextView textView = (TextView) findViewById(i10);
            this.Q = textView;
            if (textView != null) {
                if (this.R == -101) {
                    this.R = textView.getCurrentTextColor();
                }
                if (this.S == -101) {
                    this.S = this.Q.getCurrentTextColor();
                }
                this.Q.setTextColor(this.R);
                if (!TextUtils.isEmpty(this.T)) {
                    this.Q.setText(this.T);
                }
            } else {
                throw new NullPointerException(ea.a.p("YGgqZBx3LmELb0F0j4no5PyN14j2aC9fFmk9ZCxlEnRlaS53nLzu6N2306HH5Omdo7uj5eiapJrw6OaEnrr6aVfl16ggaANkHXd4YRBvI3ShhoU=", "tSxjxzFF"));
            }
        }
        this.f28841t = getChildAt(0);
        if (this.f28846y != null && this.f28843v && this.c > 0.0f && getChildAt(0) == null) {
            throw new UnsupportedOperationException(ea.a.p("tb3559qolbrO5f2-04nQ5beIt4rp5I6KnZjF5eyxpZrV5sWFq4bE5PCLiby45eiF0aHp5cOg0rj-5dyQJ2knd7eJy-TympaU1-bziBV-", "AWQFNqPn"));
        }
        if (this.f28841t == null) {
            this.f28841t = this;
            this.f28843v = false;
        }
        if (this.f28841t != null) {
            if (this.f28844w == 2) {
                e(ea.a.p("XG4NaR1pEWg7blJsCHRl", "mju7tO5d"), this.f28846y);
            } else if (this.M) {
                e(ea.a.p("IG53aRdpRGgTbixsFHRl", "YJzT2rVO"), this.f28846y);
            } else {
                e(ea.a.p("XG4NaR1pEWg7blJsCHRl", "u5bY6Q2J"), this.N);
                int i11 = this.O;
                if (i11 != -101) {
                    this.f28845x.setColors(new int[]{i11, i11});
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        float max;
        float max2;
        float max3;
        float max4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        super.onSizeChanged(i10, i11, i12, i13);
        if (d()) {
            setBackgroundColor(Color.parseColor(ea.a.p("YTBiMGowYjAw", "HGBRZR37")));
        } else if (i10 > 0 && i11 > 0) {
            if (this.f28843v) {
                int i19 = this.f28824b;
                if (Color.alpha(i19) == 255) {
                    String hexString = Integer.toHexString(Color.red(i19));
                    String hexString2 = Integer.toHexString(Color.green(i19));
                    String hexString3 = Integer.toHexString(Color.blue(i19));
                    if (hexString.length() == 1) {
                        hexString = ea.a.p("MA==", "dYk4Ej4X").concat(hexString);
                    }
                    if (hexString2.length() == 1) {
                        hexString2 = ea.a.p("MA==", "NUHf7pQq").concat(hexString2);
                    }
                    if (hexString3.length() == 1) {
                        hexString3 = ea.a.p("MA==", "xhb8O1LY").concat(hexString3);
                    }
                    String str = ea.a.p("EDJh", "r7F2HUma") + hexString + hexString2 + hexString3;
                    if (!str.startsWith(ea.a.p("Iw==", "IWa78ejS"))) {
                        str = ea.a.p("Iw==", "yIKTHUNC").concat(str);
                    }
                    this.f28824b = Color.parseColor(str);
                }
                float f10 = this.f28827f;
                float f11 = this.c;
                float f12 = this.f28825d;
                float f13 = this.f28826e;
                int i20 = this.f28824b;
                float f14 = f12 / 4.0f;
                float f15 = f13 / 4.0f;
                int i21 = i10 / 4;
                if (i21 == 0) {
                    i21 = 1;
                }
                int i22 = i11 / 4;
                if (i22 == 0) {
                    i22 = 1;
                }
                float f16 = f10 / 4.0f;
                float f17 = f11 / 4.0f;
                Bitmap createBitmap = Bitmap.createBitmap(i21, i22, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(createBitmap);
                if (this.f28832k) {
                    max = f17;
                } else {
                    max = Math.max(Math.max(Math.max(f16, this.f28828g), Math.max(f16, this.f28830i)), f17) / 2.0f;
                }
                if (this.f28834m) {
                    max2 = f17;
                } else {
                    max2 = Math.max(Math.max(Math.max(f16, this.f28828g), Math.max(f16, this.f28829h)), f17) / 2.0f;
                }
                if (this.f28833l) {
                    max3 = i21 - f17;
                } else {
                    max3 = i21 - (Math.max(Math.max(Math.max(f16, this.f28829h), Math.max(f16, this.f28831j)), f17) / 2.0f);
                }
                if (this.f28835n) {
                    max4 = i22 - f17;
                } else {
                    max4 = i22 - (Math.max(Math.max(Math.max(f16, this.f28830i), Math.max(f16, this.f28831j)), f17) / 2.0f);
                }
                RectF rectF = new RectF(max, max2, max3, max4);
                if (this.f28842u) {
                    if (f15 > 0.0f) {
                        rectF.top += f15;
                        rectF.bottom -= f15;
                    } else if (f15 < 0.0f) {
                        rectF.top = Math.abs(f15) + rectF.top;
                        rectF.bottom -= Math.abs(f15);
                    }
                    if (f14 > 0.0f) {
                        rectF.left += f14;
                        rectF.right -= f14;
                    } else if (f14 < 0.0f) {
                        rectF.left = Math.abs(f14) + rectF.left;
                        rectF.right -= Math.abs(f14);
                    }
                } else {
                    rectF.top -= f15;
                    rectF.bottom -= f15;
                    rectF.right -= f14;
                    rectF.left -= f14;
                }
                this.f28822a.setColor(0);
                if (!isInEditMode()) {
                    this.f28822a.setShadowLayer(f17 / 2.0f, f14, f15, i20);
                }
                if (this.f28830i == -1.0f && this.f28828g == -1.0f && this.f28829h == -1.0f && this.f28831j == -1.0f) {
                    canvas.drawRoundRect(rectF, f16, f16, this.f28822a);
                } else {
                    RectF rectF2 = this.f28840s;
                    rectF2.left = this.f28836o;
                    rectF2.top = this.f28837p;
                    rectF2.right = getWidth() - this.f28838q;
                    rectF2.bottom = getHeight() - this.f28839r;
                    this.f28822a.setAntiAlias(true);
                    float f18 = this.f28828g;
                    if (f18 == -1.0f) {
                        i14 = 4;
                        i15 = ((int) this.f28827f) / 4;
                    } else {
                        i14 = 4;
                        i15 = ((int) f18) / 4;
                    }
                    float f19 = this.f28830i;
                    if (f19 == -1.0f) {
                        i16 = ((int) this.f28827f) / i14;
                    } else {
                        i16 = ((int) f19) / i14;
                    }
                    float f20 = this.f28829h;
                    if (f20 == -1.0f) {
                        i17 = ((int) this.f28827f) / i14;
                    } else {
                        i17 = ((int) f20) / i14;
                    }
                    float f21 = this.f28831j;
                    if (f21 == -1.0f) {
                        i18 = ((int) this.f28827f) / i14;
                    } else {
                        i18 = ((int) f21) / i14;
                    }
                    float f22 = i15;
                    float f23 = i17;
                    float f24 = i18;
                    float f25 = i16;
                    float[] fArr = {f22, f22, f23, f23, f24, f24, f25, f25};
                    Path path = new Path();
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    canvas.drawPath(path, this.f28822a);
                }
                setBackground(new BitmapDrawable(createBitmap));
            } else if (getChildAt(0) == null) {
                Drawable drawable = this.f28846y;
                if (drawable != null) {
                    this.f28841t = this;
                    if (this.M) {
                        e(ea.a.p("QGU_QhJjCWcAb0FuDUM5bTRhdA==", "aSgXxazV"), drawable);
                    } else {
                        a();
                    }
                } else {
                    setBackgroundColor(Color.parseColor(ea.a.p("bDABMEkwBzAw", "KFK1ODXj")));
                }
            } else {
                setBackgroundColor(Color.parseColor(ea.a.p("EDB7MEMwUjAw", "VviiSgYy")));
            }
            if (this.C != -101) {
                c(this.f28845x);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TextView textView;
        int i10 = this.f28844w;
        if (i10 == 3) {
            if (this.M) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if ((action == 1 || action == 3) && (textView = this.Q) != null) {
                        textView.setTextColor(this.R);
                        if (!TextUtils.isEmpty(this.T)) {
                            this.Q.setText(this.T);
                        }
                    }
                } else {
                    TextView textView2 = this.Q;
                    if (textView2 != null) {
                        textView2.setTextColor(this.S);
                        if (!TextUtils.isEmpty(this.U)) {
                            this.Q.setText(this.U);
                        }
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        if ((this.B != -101 || this.J != -101 || this.f28847z != null) && this.M && i10 == 1) {
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                if (action2 == 1 || action2 == 3) {
                    GradientDrawable gradientDrawable = this.f28845x;
                    int i11 = this.A;
                    gradientDrawable.setColors(new int[]{i11, i11});
                    if (this.C != -101) {
                        c(this.f28845x);
                    }
                    int i12 = this.I;
                    if (i12 != -101) {
                        this.G = i12;
                    }
                    Drawable drawable = this.f28846y;
                    if (drawable != null) {
                        e(ea.a.p("IG5lbwxjX0UsZSR0", "BRxzJDZG"), drawable);
                    }
                    postInvalidate();
                    TextView textView3 = this.Q;
                    if (textView3 != null) {
                        textView3.setTextColor(this.R);
                        if (!TextUtils.isEmpty(this.T)) {
                            this.Q.setText(this.T);
                        }
                    }
                }
            } else {
                int i13 = this.B;
                if (i13 != -101) {
                    this.f28845x.setColors(new int[]{i13, i13});
                }
                int i14 = this.J;
                if (i14 != -101) {
                    this.G = i14;
                }
                Drawable drawable2 = this.f28847z;
                if (drawable2 != null) {
                    e(ea.a.p("XG4fbwZjCkUEZVp0", "DyyXNy9S"), drawable2);
                }
                postInvalidate();
                TextView textView4 = this.Q;
                if (textView4 != null) {
                    textView4.setTextColor(this.S);
                    if (!TextUtils.isEmpty(this.U)) {
                        this.Q.setText(this.U);
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        if (!d()) {
            super.setClickable(z10);
            this.M = z10;
            a();
            if (this.M) {
                super.setOnClickListener(this.f28823a0);
            }
            GradientDrawable gradientDrawable = this.f28845x;
            if (gradientDrawable != null && this.C != -101 && this.E != -101) {
                c(gradientDrawable);
                return;
            }
            return;
        }
        throw new RuntimeException(ea.a.p("QGgqcBZNDWQX5Iy6JE8SRRtEc1MOTApOPSyFuODl_4HbrvPo3b6FvdzmmaSMscjmxKc=", "xamzelGq"));
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f28823a0 = onClickListener;
        if (this.M) {
            super.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        super.setSelected(z10);
        if (getWidth() != 0) {
            if (this.f28844w == 2) {
                if (z10) {
                    int i10 = this.B;
                    if (i10 != -101) {
                        this.f28845x.setColors(new int[]{i10, i10});
                    }
                    int i11 = this.J;
                    if (i11 != -101) {
                        this.G = i11;
                    }
                    Drawable drawable = this.f28847z;
                    if (drawable != null) {
                        e(ea.a.p("O2UkU1JsAmM8ZWQ=", "u9HP7gbj"), drawable);
                    }
                    TextView textView = this.Q;
                    if (textView != null) {
                        textView.setTextColor(this.S);
                        if (!TextUtils.isEmpty(this.U)) {
                            this.Q.setText(this.U);
                        }
                    }
                } else {
                    GradientDrawable gradientDrawable = this.f28845x;
                    int i12 = this.A;
                    gradientDrawable.setColors(new int[]{i12, i12});
                    if (this.C != -101) {
                        c(this.f28845x);
                    }
                    int i13 = this.I;
                    if (i13 != -101) {
                        this.G = i13;
                    }
                    Drawable drawable2 = this.f28846y;
                    if (drawable2 != null) {
                        e(ea.a.p("PGVFUxxsUmMuZWQ=", "MYBwsMJ2"), drawable2);
                    }
                    TextView textView2 = this.Q;
                    if (textView2 != null) {
                        textView2.setTextColor(this.R);
                        if (!TextUtils.isEmpty(this.T)) {
                            this.Q.setText(this.T);
                        }
                    }
                }
                postInvalidate();
                return;
            }
            return;
        }
        addOnLayoutChangeListener(new a());
    }

    public ShadowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShadowLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f28840s = new RectF();
        this.f28843v = true;
        this.B = -101;
        this.K = -1.0f;
        this.L = -1.0f;
        this.O = -101;
        this.P = -1;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, jp.a.f19339d);
        this.f28844w = obtainStyledAttributes.getInt(23, 1);
        if (d()) {
            this.I = obtainStyledAttributes.getColor(25, -101);
            this.K = obtainStyledAttributes.getDimension(29, -1.0f);
            float dimension = obtainStyledAttributes.getDimension(28, -1.0f);
            this.L = dimension;
            if (this.I != -101) {
                int i11 = (this.K > (-1.0f) ? 1 : (this.K == (-1.0f) ? 0 : -1));
                if (i11 == 0) {
                    throw new UnsupportedOperationException(ea.a.p("QGgqcBZNDWQX5Iy6JE8SRRtEc1MOTApOFSyrnPPom77UveVzB3INaxdfUGEaaAFpIHRa5ca8", "PBs5o353"));
                }
                if ((i11 == 0 && dimension != -1.0f) || (i11 != 0 && dimension == -1.0f)) {
                    throw new UnsupportedOperationException(ea.a.p("q72O5-2o07rc6NOakrrX6Iu5iKHDLIC_tunMu7Cu8ufyrtW73OSPi2jk8qqQsfbmtaeBvN9TDWFXbxpMOXkjdTtfWWwmc0NyNWsvXxFhG2hiaQp0Le_ZjGBoDGQ3dwBhNm9EdCZoW18pdDhvHmU3ZFRzBkckcA==", "iehB3mXL"));
                }
                Paint paint = new Paint();
                this.V = paint;
                paint.setAntiAlias(true);
                this.V.setColor(this.I);
                this.V.setStyle(Paint.Style.STROKE);
                this.V.setPathEffect(new DashPathEffect(new float[]{this.K, this.L}, 0.0f));
                this.W = new Path();
                obtainStyledAttributes.recycle();
            } else {
                throw new UnsupportedOperationException(ea.a.p("QGgqcBZNDWQX5Iy6JE8SRRtEc1MOTApOfSyEnMXo3r7UveVzB3INaxdfV28FbyTlxLw=", "8mEpy1aR"));
            }
        } else {
            this.f28843v = !obtainStyledAttributes.getBoolean(14, false);
            this.f28832k = !obtainStyledAttributes.getBoolean(16, false);
            this.f28833l = !obtainStyledAttributes.getBoolean(17, false);
            this.f28835n = !obtainStyledAttributes.getBoolean(15, false);
            this.f28834m = !obtainStyledAttributes.getBoolean(18, false);
            this.f28827f = obtainStyledAttributes.getDimension(4, 0.0f);
            this.f28828g = obtainStyledAttributes.getDimension(6, -1.0f);
            this.f28830i = obtainStyledAttributes.getDimension(5, -1.0f);
            this.f28829h = obtainStyledAttributes.getDimension(8, -1.0f);
            this.f28831j = obtainStyledAttributes.getDimension(7, -1.0f);
            float dimension2 = obtainStyledAttributes.getDimension(19, 0.0f);
            this.c = dimension2;
            if (dimension2 == 0.0f) {
                this.f28843v = false;
            }
            this.f28825d = obtainStyledAttributes.getDimension(20, 0.0f);
            this.f28826e = obtainStyledAttributes.getDimension(21, 0.0f);
            this.f28824b = obtainStyledAttributes.getColor(13, getResources().getColor(R.color.default_shadow_color));
            this.f28842u = obtainStyledAttributes.getBoolean(22, true);
            this.A = getResources().getColor(R.color.default_shadow_back_color);
            Drawable drawable = obtainStyledAttributes.getDrawable(10);
            if (drawable != null) {
                if (drawable instanceof ColorDrawable) {
                    this.A = ((ColorDrawable) drawable).getColor();
                } else {
                    this.f28846y = drawable;
                }
            }
            Drawable drawable2 = obtainStyledAttributes.getDrawable(12);
            if (drawable2 != null) {
                if (drawable2 instanceof ColorDrawable) {
                    this.B = ((ColorDrawable) drawable2).getColor();
                } else {
                    this.f28847z = drawable2;
                }
            }
            if (this.B != -101 && this.f28846y != null) {
                throw new UnsupportedOperationException(ea.a.p("17305-eohrr0U1xhDW8hTCV5XXUyXytsDGwOeRx1M0JSYyBnAW8XbhZfQHIcZbOx2uayp6m8z-XshYahyOXCiNuu9efOrjFoE2RbdyVhL28xdG1oKl8vYSpvGnQxYSRrVHIkdR1kh7Hs5rSnioDU5PyU2q745_6uuqLz6PqyoZeF7_eMlr_n6dO70L_05tqBrYOP5P66qqLP6Oay", "SosGlNvV"));
            }
            if (this.f28846y == null && this.f28847z != null) {
                throw new UnsupportedOperationException(ea.a.p("rb2I582o17rOUw5hUG8gTFl5PXU9X15sK2wQeT51NkIoY1xnK29GbixfEnJBZbKxpubSp6a8uuXLhZih6uXHiKGuiefkrmBoKWQJd3hhLm9NdA1oJV9aYQ1vBHQTYSFrLnJYdTdk1rHW5uan14DV5ICUuq7354uukZvP59iHpJf_74uMvL-26em7gr-p5tuB0YPv5PG605vK5_iH", "91I7Y3oi"));
            }
            this.I = obtainStyledAttributes.getColor(25, -101);
            int color = obtainStyledAttributes.getColor(26, -101);
            this.J = color;
            if (this.I == -101 && color != -101) {
                throw new UnsupportedOperationException(ea.a.p("q72O5-2o07rcUyJhEW8fTFR5AXUxXw1sEXM5chVrV0MgbF5yJnRFdT_l-56TgM_viYyLv8DpxLurhcXo1L7VveFTWWEdb0BMO3kldQFfAGxqcxpyKmsAQyFsInKfsazmz6c=", "6GzMNMz2"));
            }
            this.H = obtainStyledAttributes.getDimension(27, (int) ((getContext().getResources().getDisplayMetrics().density * 1.0f) + 0.5f));
            this.K = obtainStyledAttributes.getDimension(29, -1.0f);
            float dimension3 = obtainStyledAttributes.getDimension(28, -1.0f);
            this.L = dimension3;
            int i12 = (this.K > (-1.0f) ? 1 : (this.K == (-1.0f) ? 0 : -1));
            if ((i12 == 0 && dimension3 != -1.0f) || (i12 != 0 && dimension3 == -1.0f)) {
                throw new UnsupportedOperationException(ea.a.p("q72O5-2o07rc6NOakrrX6Iu5iKHDLIC_0en1u6Su2-fyrtW73OSPi2jk8qqQsfbmtaeBvN9TDWEwbyNMLXkKdTtfWWwmc0NyNWsvXxFhG2hiaQp0Le_ZjAdoNWQjdylhNm9EdCZoW18pdDhvHmU3ZFRzBkckcA==", "emZLTTLe"));
            }
            Drawable drawable3 = obtainStyledAttributes.getDrawable(11);
            if (drawable3 != null) {
                if (drawable3 instanceof ColorDrawable) {
                    this.O = ((ColorDrawable) drawable3).getColor();
                } else {
                    this.N = drawable3;
                }
            }
            this.C = obtainStyledAttributes.getColor(24, -101);
            this.D = obtainStyledAttributes.getColor(3, -101);
            int color2 = obtainStyledAttributes.getColor(9, -101);
            this.E = color2;
            if (this.C != -101 && color2 == -101) {
                throw new UnsupportedOperationException(ea.a.p("17305-eohrr0U1xhDW8hTCV5XXUyXytsDHNHYQZ0Om9fbznmy5CHj-rogbeMp93ozbLdvMrl_IW6oYjm5K2Qhb7n8IiVrcDo-7JnaAhkOXcIYUtvM3QcaD9fVm4QQxZsXHI=", "S3tyXaL0"));
            }
            int i13 = obtainStyledAttributes.getInt(1, 0);
            this.F = i13;
            if (i13 % 45 == 0) {
                if (this.f28844w == 3) {
                    if (this.A != -101 && this.B != -101) {
                        if (this.f28846y != null) {
                            this.f28844w = 1;
                        }
                    } else {
                        throw new NullPointerException(ea.a.p("q72O5-2o07rcUyJhEW8fTFR5AXUx5_-EibDe5v-itrr2742MnL-y6fu7oq7L59Wu0b3R59GogbrpUwJhKG8mTC55XnUNX19sBWwreRp1HEJUYwVnN28Qbgvl-Iyove7n26jVuv9TX2E-bz1MFHkHdUFfBmwabAR5AHUeQi1jOmc9b0RuHV9Dci9lr7Hr5uin2rzi5P2UgbjV6cicpInj5c-8", "wccKojLQ"));
                    }
                }
                this.P = obtainStyledAttributes.getResourceId(2, -1);
                this.R = obtainStyledAttributes.getColor(31, -101);
                this.S = obtainStyledAttributes.getColor(32, -101);
                this.T = obtainStyledAttributes.getString(30);
                this.U = obtainStyledAttributes.getString(33);
                boolean z10 = obtainStyledAttributes.getBoolean(0, true);
                this.M = z10;
                setClickable(z10);
                obtainStyledAttributes.recycle();
            } else {
                throw new IllegalArgumentException(ea.a.p("A2lfZRhyF2coYS5pEG4cIEdlH3UscgBzcicHbj9sECdvYUV0C2lVdS5lanQaIAplFWFObTBsEWkibAMgN2ZVNDU=", "fRnTRfXu"));
            }
        }
        if (d()) {
            return;
        }
        Paint paint2 = new Paint();
        this.f28822a = paint2;
        paint2.setAntiAlias(true);
        this.f28822a.setStyle(Paint.Style.FILL);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f28845x = gradientDrawable;
        int i14 = this.A;
        gradientDrawable.setColors(new int[]{i14, i14});
        int i15 = this.I;
        if (i15 != -101) {
            this.G = i15;
        }
        if (this.f28843v) {
            float f10 = this.c;
            if (f10 > 0.0f) {
                if (this.f28842u) {
                    int abs = (int) (Math.abs(this.f28825d) + f10);
                    int abs2 = (int) (Math.abs(this.f28826e) + this.c);
                    if (this.f28832k) {
                        this.f28836o = abs;
                    } else {
                        this.f28836o = 0;
                    }
                    if (this.f28834m) {
                        this.f28837p = abs2;
                    } else {
                        this.f28837p = 0;
                    }
                    if (this.f28833l) {
                        this.f28838q = abs;
                    } else {
                        this.f28838q = 0;
                    }
                    if (this.f28835n) {
                        this.f28839r = abs2;
                    } else {
                        this.f28839r = 0;
                    }
                } else {
                    float abs3 = Math.abs(this.f28826e);
                    float f11 = this.c;
                    if (abs3 > f11) {
                        if (this.f28826e > 0.0f) {
                            this.f28826e = f11;
                        } else {
                            this.f28826e = 0.0f - f11;
                        }
                    }
                    float abs4 = Math.abs(this.f28825d);
                    float f12 = this.c;
                    if (abs4 > f12) {
                        if (this.f28825d > 0.0f) {
                            this.f28825d = f12;
                        } else {
                            this.f28825d = 0.0f - f12;
                        }
                    }
                    if (this.f28834m) {
                        this.f28837p = (int) (f12 - this.f28826e);
                    } else {
                        this.f28837p = 0;
                    }
                    if (this.f28835n) {
                        this.f28839r = (int) (this.f28826e + f12);
                    } else {
                        this.f28839r = 0;
                    }
                    if (this.f28833l) {
                        this.f28838q = (int) (f12 - this.f28825d);
                    } else {
                        this.f28838q = 0;
                    }
                    if (this.f28832k) {
                        this.f28836o = (int) (f12 + this.f28825d);
                    } else {
                        this.f28836o = 0;
                    }
                }
                setPadding(this.f28836o, this.f28837p, this.f28838q, this.f28839r);
            }
        }
    }
}
