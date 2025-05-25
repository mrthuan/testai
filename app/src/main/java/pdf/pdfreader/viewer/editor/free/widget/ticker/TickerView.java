package pdf.pdfreader.viewer.editor.free.widget.ticker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import k3.j;

/* loaded from: classes3.dex */
public class TickerView extends View {

    /* renamed from: u  reason: collision with root package name */
    public static final AccelerateDecelerateInterpolator f28870u = new AccelerateDecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f28871a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f28872b;
    public final c c;

    /* renamed from: d  reason: collision with root package name */
    public final j f28873d;

    /* renamed from: e  reason: collision with root package name */
    public final ValueAnimator f28874e;

    /* renamed from: f  reason: collision with root package name */
    public a f28875f;

    /* renamed from: g  reason: collision with root package name */
    public a f28876g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f28877h;

    /* renamed from: i  reason: collision with root package name */
    public String f28878i;

    /* renamed from: j  reason: collision with root package name */
    public int f28879j;

    /* renamed from: k  reason: collision with root package name */
    public int f28880k;

    /* renamed from: l  reason: collision with root package name */
    public int f28881l;

    /* renamed from: m  reason: collision with root package name */
    public int f28882m;

    /* renamed from: n  reason: collision with root package name */
    public float f28883n;

    /* renamed from: o  reason: collision with root package name */
    public int f28884o;

    /* renamed from: p  reason: collision with root package name */
    public long f28885p;

    /* renamed from: q  reason: collision with root package name */
    public long f28886q;

    /* renamed from: r  reason: collision with root package name */
    public Interpolator f28887r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f28888s;

    /* renamed from: t  reason: collision with root package name */
    public String f28889t;

    /* loaded from: classes3.dex */
    public enum ScrollingDirection {
        ANY,
        UP,
        DOWN
    }

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f28891a;

        /* renamed from: b  reason: collision with root package name */
        public final long f28892b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final Interpolator f28893d;

        public a(String str, long j10, long j11, Interpolator interpolator) {
            this.f28891a = str;
            this.f28892b = j10;
            this.c = j11;
            this.f28893d = interpolator;
        }
    }

    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: b  reason: collision with root package name */
        public int f28895b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public float f28896d;

        /* renamed from: e  reason: collision with root package name */
        public float f28897e;

        /* renamed from: f  reason: collision with root package name */
        public String f28898f;

        /* renamed from: h  reason: collision with root package name */
        public float f28900h;

        /* renamed from: i  reason: collision with root package name */
        public int f28901i;

        /* renamed from: g  reason: collision with root package name */
        public int f28899g = -16777216;

        /* renamed from: a  reason: collision with root package name */
        public int f28894a = 8388611;

        public b(Resources resources) {
            this.f28900h = TypedValue.applyDimension(2, 12.0f, resources.getDisplayMetrics());
        }

        public final void a(TypedArray typedArray) {
            this.f28894a = typedArray.getInt(4, this.f28894a);
            this.f28895b = typedArray.getColor(6, this.f28895b);
            this.c = typedArray.getFloat(7, this.c);
            this.f28896d = typedArray.getFloat(8, this.f28896d);
            this.f28897e = typedArray.getFloat(9, this.f28897e);
            this.f28898f = typedArray.getString(5);
            this.f28899g = typedArray.getColor(3, this.f28899g);
            this.f28900h = typedArray.getDimension(1, this.f28900h);
            this.f28901i = typedArray.getInt(2, this.f28901i);
        }
    }

    public TickerView(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f28871a = textPaint;
        this.f28872b = new TextPaint(1);
        c cVar = new c(textPaint);
        this.c = cVar;
        this.f28873d = new j(cVar);
        this.f28874e = ValueAnimator.ofFloat(1.0f);
        this.f28877h = new Rect();
        c(context, null, 0);
    }

    private void setTextInternal(String str) {
        char[] charArray;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        char[] cArr;
        j jVar;
        int i10;
        ArrayList arrayList2;
        boolean z12;
        int i11;
        int i12;
        this.f28878i = str;
        boolean z13 = false;
        if (str == null) {
            charArray = new char[0];
        } else {
            charArray = str.toCharArray();
        }
        j jVar2 = this.f28873d;
        if (((pdf.pdfreader.viewer.editor.free.widget.ticker.a[]) jVar2.c) != null) {
            int i13 = 0;
            while (true) {
                arrayList = (ArrayList) jVar2.f19560a;
                if (i13 >= arrayList.size()) {
                    break;
                }
                pdf.pdfreader.viewer.editor.free.widget.ticker.b bVar = (pdf.pdfreader.viewer.editor.free.widget.ticker.b) arrayList.get(i13);
                bVar.a();
                if (bVar.f28917l > 0.0f) {
                    i13++;
                } else {
                    arrayList.remove(i13);
                }
            }
            int size = arrayList.size();
            char[] cArr2 = new char[size];
            for (int i14 = 0; i14 < size; i14++) {
                cArr2[i14] = ((pdf.pdfreader.viewer.editor.free.widget.ticker.b) arrayList.get(i14)).c;
            }
            Set set = (Set) jVar2.f19562d;
            ArrayList arrayList3 = new ArrayList();
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (i15 == size) {
                    z10 = true;
                } else {
                    z10 = z13;
                }
                if (i16 == charArray.length) {
                    z11 = true;
                } else {
                    z11 = z13;
                }
                if (z10 && z11) {
                    break;
                } else if (z10) {
                    int length = charArray.length - i16;
                    for (int i17 = 0; i17 < length; i17++) {
                        arrayList3.add(1);
                    }
                } else if (z11) {
                    int i18 = size - i15;
                    for (int i19 = 0; i19 < i18; i19++) {
                        arrayList3.add(2);
                    }
                } else {
                    boolean contains = set.contains(Character.valueOf(cArr2[i15]));
                    boolean contains2 = set.contains(Character.valueOf(charArray[i16]));
                    if (contains && contains2) {
                        int i20 = i15 + 1;
                        while (true) {
                            if (i20 < size) {
                                if (!set.contains(Character.valueOf(cArr2[i20]))) {
                                    i11 = i20;
                                    break;
                                }
                                i20++;
                            } else {
                                i11 = size;
                                break;
                            }
                        }
                        int i21 = i16 + 1;
                        while (true) {
                            if (i21 < charArray.length) {
                                if (!set.contains(Character.valueOf(charArray[i21]))) {
                                    break;
                                }
                                i21++;
                            } else {
                                i21 = charArray.length;
                                break;
                            }
                        }
                        int i22 = i21;
                        int i23 = i11 - i15;
                        int i24 = i22 - i16;
                        int max = Math.max(i23, i24);
                        if (i23 == i24) {
                            for (int i25 = 0; i25 < max; i25++) {
                                arrayList3.add(0);
                            }
                            cArr = charArray;
                            jVar = jVar2;
                            i10 = size;
                            arrayList2 = arrayList;
                            z12 = false;
                        } else {
                            int i26 = i23 + 1;
                            int i27 = i24 + 1;
                            int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, i26, i27);
                            for (int i28 = 0; i28 < i26; i28++) {
                                iArr[i28][0] = i28;
                            }
                            z12 = false;
                            for (int i29 = 0; i29 < i27; i29++) {
                                iArr[0][i29] = i29;
                            }
                            for (int i30 = 1; i30 < i26; i30++) {
                                int i31 = 1;
                                while (i31 < i27) {
                                    int i32 = i30 - 1;
                                    j jVar3 = jVar2;
                                    int i33 = i31 - 1;
                                    int i34 = size;
                                    if (cArr2[i32 + i15] == charArray[i33 + i16]) {
                                        i12 = 0;
                                    } else {
                                        i12 = 1;
                                    }
                                    int[] iArr2 = iArr[i30];
                                    int[] iArr3 = iArr[i32];
                                    iArr2[i31] = Math.min(iArr3[i31] + 1, Math.min(iArr2[i33] + 1, iArr3[i33] + i12));
                                    i31++;
                                    jVar2 = jVar3;
                                    size = i34;
                                    charArray = charArray;
                                    arrayList = arrayList;
                                }
                            }
                            cArr = charArray;
                            jVar = jVar2;
                            i10 = size;
                            arrayList2 = arrayList;
                            ArrayList arrayList4 = new ArrayList(max * 2);
                            int i35 = i26 - 1;
                            while (true) {
                                i27--;
                                while (true) {
                                    if (i35 <= 0 && i27 <= 0) {
                                        break;
                                    } else if (i35 == 0) {
                                        arrayList4.add(1);
                                        break;
                                    } else {
                                        if (i27 == 0) {
                                            arrayList4.add(2);
                                        } else {
                                            int i36 = i27 - 1;
                                            int i37 = iArr[i35][i36];
                                            int i38 = i35 - 1;
                                            int[] iArr4 = iArr[i38];
                                            int i39 = iArr4[i27];
                                            int i40 = iArr4[i36];
                                            if (i37 < i39 && i37 < i40) {
                                                arrayList4.add(1);
                                                break;
                                            } else if (i39 < i40) {
                                                arrayList4.add(2);
                                            } else {
                                                arrayList4.add(0);
                                                i35 = i38;
                                                break;
                                            }
                                        }
                                        i35--;
                                    }
                                }
                            }
                            for (int size2 = arrayList4.size() - 1; size2 >= 0; size2--) {
                                arrayList3.add((Integer) arrayList4.get(size2));
                            }
                        }
                        i15 = i11;
                        i16 = i22;
                    } else {
                        cArr = charArray;
                        jVar = jVar2;
                        i10 = size;
                        arrayList2 = arrayList;
                        z12 = false;
                        if (contains) {
                            arrayList3.add(1);
                        } else if (contains2) {
                            arrayList3.add(2);
                            i15++;
                        } else {
                            arrayList3.add(0);
                            i15++;
                        }
                        i16++;
                    }
                    z13 = z12;
                    jVar2 = jVar;
                    size = i10;
                    charArray = cArr;
                    arrayList = arrayList2;
                }
            }
            int size3 = arrayList3.size();
            int[] iArr5 = new int[size3];
            for (int i41 = 0; i41 < arrayList3.size(); i41++) {
                iArr5[i41] = ((Integer) arrayList3.get(i41)).intValue();
            }
            int i42 = 0;
            int i43 = 0;
            for (int i44 = 0; i44 < size3; i44++) {
                int i45 = iArr5[i44];
                if (i45 != 0) {
                    if (i45 != 1) {
                        if (i45 == 2) {
                            ((pdf.pdfreader.viewer.editor.free.widget.ticker.b) arrayList.get(i42)).c((char) 0);
                            i42++;
                        } else {
                            throw new IllegalArgumentException(ea.a.p("JW4ybjV3CyApYxJpW25tIA==", "dYpYZeqR") + iArr5[i44]);
                        }
                    } else {
                        arrayList.add(i42, new pdf.pdfreader.viewer.editor.free.widget.ticker.b((pdf.pdfreader.viewer.editor.free.widget.ticker.a[]) jVar2.c, (c) jVar2.f19561b));
                    }
                }
                ((pdf.pdfreader.viewer.editor.free.widget.ticker.b) arrayList.get(i42)).c(charArray[i43]);
                i42++;
                i43++;
            }
            setContentDescription(str);
            return;
        }
        throw new IllegalStateException(ea.a.p("AWVUZFl0WCA5YSZsVSMbZUFDBmE3YQZ0VnIbaQR0NSApaUNzDS4=", "zkGY3WwF"));
    }

    public final void a() {
        boolean z10;
        boolean z11 = true;
        if (this.f28879j != b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f28880k == getPaddingBottom() + getPaddingTop() + ((int) this.c.c)) {
            z11 = false;
        }
        if (z10 || z11) {
            requestLayout();
        }
    }

    public final int b() {
        float f10;
        boolean z10 = this.f28888s;
        j jVar = this.f28873d;
        if (z10) {
            f10 = jVar.a();
        } else {
            ArrayList arrayList = (ArrayList) jVar.f19560a;
            int size = arrayList.size();
            float f11 = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                pdf.pdfreader.viewer.editor.free.widget.ticker.b bVar = (pdf.pdfreader.viewer.editor.free.widget.ticker.b) arrayList.get(i10);
                bVar.a();
                f11 += bVar.f28919n;
            }
            f10 = f11;
        }
        return getPaddingRight() + getPaddingLeft() + ((int) f10);
    }

    public final void c(Context context, AttributeSet attributeSet, int i10) {
        boolean z10 = true;
        setLayerType(1, null);
        TextPaint textPaint = this.f28872b;
        textPaint.setColor(-93336);
        textPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
        textPaint.setStyle(Paint.Style.FILL);
        b bVar = new b(context.getResources());
        int[] iArr = jp.a.f19341f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId != -1) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, iArr);
            bVar.a(obtainStyledAttributes2);
            obtainStyledAttributes2.recycle();
        }
        bVar.a(obtainStyledAttributes);
        this.f28887r = f28870u;
        this.f28886q = obtainStyledAttributes.getInt(11, 350);
        this.f28888s = obtainStyledAttributes.getBoolean(10, false);
        this.f28881l = bVar.f28894a;
        int i11 = bVar.f28895b;
        TextPaint textPaint2 = this.f28871a;
        if (i11 != 0) {
            textPaint2.setShadowLayer(bVar.f28897e, bVar.c, bVar.f28896d, i11);
        }
        this.f28884o = bVar.f28901i;
        setTypeface(textPaint2.getTypeface());
        setTextColor(bVar.f28899g);
        setTextSize(bVar.f28900h);
        int i12 = obtainStyledAttributes.getInt(12, 0);
        if (i12 != 1) {
            if (i12 != 2) {
                if (isInEditMode()) {
                    setCharacterLists(ea.a.p("AzF5M0c1VDdKOQ==", "Cu5fdKmI"));
                }
            } else {
                setCharacterLists(ea.a.p("LGJXZC5mCGghag1sWW44cElyIXQ8dkF4DXowQhJEB0YKSH1KAEwiTgdQN1JnVAJWb1gLWg==", "PHM4Ko4t"));
            }
        } else {
            setCharacterLists(ea.a.p("AzF5M0c1VDdKOQ==", "Cu5fdKmI"));
        }
        int i13 = obtainStyledAttributes.getInt(13, 0);
        c cVar = this.c;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    cVar.f28926e = ScrollingDirection.DOWN;
                } else {
                    throw new IllegalArgumentException(ea.a.p("Gm5CdQlwWHIuZS4gAWkLa1ByMWQgZgR1OXQycixmIHI9ZVVTGnJYbDZpJGcxaRplVnQHbys6IA==", "VTPpUbIE") + i13);
                }
            } else {
                cVar.f28926e = ScrollingDirection.UP;
            }
        } else {
            cVar.f28926e = ScrollingDirection.ANY;
        }
        if (((pdf.pdfreader.viewer.editor.free.widget.ticker.a[]) this.f28873d.c) == null) {
            z10 = false;
        }
        if (z10) {
            d(bVar.f28898f, false);
        } else {
            this.f28889t = bVar.f28898f;
        }
        obtainStyledAttributes.recycle();
        op.a aVar = new op.a(this);
        ValueAnimator valueAnimator = this.f28874e;
        valueAnimator.addUpdateListener(aVar);
        valueAnimator.addListener(new op.c(this, new op.b(this)));
    }

    public final void d(String str, boolean z10) {
        if (TextUtils.equals(str, this.f28878i)) {
            return;
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.f28874e;
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
                this.f28876g = null;
                this.f28875f = null;
            }
        }
        if (z10) {
            this.f28876g = new a(str, this.f28885p, this.f28886q, this.f28887r);
            if (this.f28875f == null) {
                e();
                return;
            }
            return;
        }
        setTextInternal(str);
        j jVar = this.f28873d;
        jVar.c(1.0f);
        jVar.b();
        a();
        invalidate();
    }

    public final void e() {
        a aVar = this.f28876g;
        this.f28875f = aVar;
        this.f28876g = null;
        if (aVar == null) {
            return;
        }
        setTextInternal(aVar.f28891a);
        long j10 = aVar.f28892b;
        ValueAnimator valueAnimator = this.f28874e;
        valueAnimator.setStartDelay(j10);
        valueAnimator.setDuration(aVar.c);
        valueAnimator.setInterpolator(aVar.f28893d);
        valueAnimator.start();
    }

    public boolean getAnimateMeasurementChange() {
        return this.f28888s;
    }

    public long getAnimationDelay() {
        return this.f28885p;
    }

    public long getAnimationDuration() {
        return this.f28886q;
    }

    public Interpolator getAnimationInterpolator() {
        return this.f28887r;
    }

    public int getGravity() {
        return this.f28881l;
    }

    public String getText() {
        return this.f28878i;
    }

    public int getTextColor() {
        return this.f28882m;
    }

    public float getTextSize() {
        return this.f28883n;
    }

    public Typeface getTypeface() {
        return this.f28871a.getTypeface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        super.onDraw(canvas);
        canvas.save();
        j jVar = this.f28873d;
        float a10 = jVar.a();
        c cVar = this.c;
        float f12 = cVar.c;
        int i10 = this.f28881l;
        Rect rect = this.f28877h;
        int width = rect.width();
        int height = rect.height();
        if ((i10 & 16) == 16) {
            f10 = a0.a.m(height, f12, 2.0f, rect.top);
        } else {
            f10 = 0.0f;
        }
        if ((i10 & 1) == 1) {
            f11 = a0.a.m(width, a10, 2.0f, rect.left);
        } else {
            f11 = 0.0f;
        }
        if ((i10 & 48) == 48) {
            f10 = 0.0f;
        }
        if ((i10 & 80) == 80) {
            f10 = rect.top + (height - f12);
        }
        if ((i10 & 8388611) == 8388611) {
            f11 = 0.0f;
        }
        if ((i10 & 8388613) == 8388613) {
            f11 = (width - a10) + rect.left;
        }
        canvas.translate(f11, f10);
        canvas.clipRect(0.0f, 0.0f, a10, f12);
        canvas.translate(0.0f, cVar.f28925d);
        TextPaint textPaint = this.f28871a;
        ArrayList arrayList = (ArrayList) jVar.f19560a;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            pdf.pdfreader.viewer.editor.free.widget.ticker.b bVar = (pdf.pdfreader.viewer.editor.free.widget.ticker.b) arrayList.get(i11);
            if (pdf.pdfreader.viewer.editor.free.widget.ticker.b.b(canvas, textPaint, bVar.f28910e, bVar.f28913h, bVar.f28914i)) {
                int i12 = bVar.f28913h;
                if (i12 >= 0) {
                    bVar.c = bVar.f28910e[i12];
                }
                bVar.f28920o = bVar.f28914i;
            }
            pdf.pdfreader.viewer.editor.free.widget.ticker.b.b(canvas, textPaint, bVar.f28910e, bVar.f28913h + 1, bVar.f28914i - bVar.f28915j);
            pdf.pdfreader.viewer.editor.free.widget.ticker.b.b(canvas, textPaint, bVar.f28910e, bVar.f28913h - 1, bVar.f28914i + bVar.f28915j);
            bVar.a();
            canvas.translate(bVar.f28917l, 0.0f);
        }
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f28872b);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.f28879j = b();
        this.f28880k = getPaddingBottom() + getPaddingTop() + ((int) this.c.c);
        int resolveSize = View.resolveSize(this.f28879j, i10);
        int resolveSize2 = View.resolveSize(this.f28880k, i11);
        String str = this.f28878i;
        TextPaint textPaint = this.f28871a;
        float measureText = textPaint.measureText(str);
        float f10 = resolveSize;
        if (measureText > f10) {
            setTextSize((textPaint.getTextSize() * f10) / measureText);
        }
        setMeasuredDimension(resolveSize, resolveSize2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f28877h.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
    }

    public void setAnimateMeasurementChange(boolean z10) {
        this.f28888s = z10;
    }

    public void setAnimationDelay(long j10) {
        this.f28885p = j10;
    }

    public void setAnimationDuration(long j10) {
        this.f28886q = j10;
    }

    public void setAnimationInterpolator(Interpolator interpolator) {
        this.f28887r = interpolator;
    }

    public void setCharacterLists(String... strArr) {
        j jVar = this.f28873d;
        jVar.getClass();
        jVar.c = new pdf.pdfreader.viewer.editor.free.widget.ticker.a[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            ((pdf.pdfreader.viewer.editor.free.widget.ticker.a[]) jVar.c)[i10] = new pdf.pdfreader.viewer.editor.free.widget.ticker.a(strArr[i10]);
        }
        jVar.f19562d = new HashSet();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            ((Set) jVar.f19562d).addAll(((pdf.pdfreader.viewer.editor.free.widget.ticker.a[]) jVar.c)[i11].c.keySet());
        }
        Iterator it = ((ArrayList) jVar.f19560a).iterator();
        while (it.hasNext()) {
            ((pdf.pdfreader.viewer.editor.free.widget.ticker.b) it.next()).f28907a = (pdf.pdfreader.viewer.editor.free.widget.ticker.a[]) jVar.c;
        }
        String str = this.f28889t;
        if (str != null) {
            d(str, false);
            this.f28889t = null;
        }
    }

    public void setGravity(int i10) {
        if (this.f28881l != i10) {
            this.f28881l = i10;
            invalidate();
        }
    }

    public void setPaintFlags(int i10) {
        this.f28871a.setFlags(i10);
        c cVar = this.c;
        cVar.f28924b.clear();
        Paint.FontMetrics fontMetrics = cVar.f28923a.getFontMetrics();
        float f10 = fontMetrics.bottom;
        float f11 = fontMetrics.top;
        cVar.c = f10 - f11;
        cVar.f28925d = -f11;
        a();
        invalidate();
    }

    public void setPreferredScrollingDirection(ScrollingDirection scrollingDirection) {
        this.c.f28926e = scrollingDirection;
    }

    public void setText(String str) {
        d(str, !TextUtils.isEmpty(this.f28878i));
    }

    public void setTextColor(int i10) {
        if (this.f28882m != i10) {
            this.f28882m = i10;
            this.f28871a.setColor(i10);
            invalidate();
        }
    }

    public void setTextSize(float f10) {
        if (this.f28883n != f10) {
            this.f28883n = f10;
            this.f28871a.setTextSize(f10);
            c cVar = this.c;
            cVar.f28924b.clear();
            Paint.FontMetrics fontMetrics = cVar.f28923a.getFontMetrics();
            float f11 = fontMetrics.bottom;
            float f12 = fontMetrics.top;
            cVar.c = f11 - f12;
            cVar.f28925d = -f12;
            a();
            invalidate();
        }
    }

    public void setTypeface(Typeface typeface) {
        int i10 = this.f28884o;
        if (i10 == 3) {
            typeface = Typeface.create(typeface, 3);
        } else if (i10 == 1) {
            typeface = Typeface.create(typeface, 1);
        } else if (i10 == 2) {
            typeface = Typeface.create(typeface, 2);
        }
        this.f28871a.setTypeface(typeface);
        c cVar = this.c;
        cVar.f28924b.clear();
        Paint.FontMetrics fontMetrics = cVar.f28923a.getFontMetrics();
        float f10 = fontMetrics.bottom;
        float f11 = fontMetrics.top;
        cVar.c = f10 - f11;
        cVar.f28925d = -f11;
        a();
        invalidate();
    }

    public TickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextPaint textPaint = new TextPaint(1);
        this.f28871a = textPaint;
        this.f28872b = new TextPaint(1);
        c cVar = new c(textPaint);
        this.c = cVar;
        this.f28873d = new j(cVar);
        this.f28874e = ValueAnimator.ofFloat(1.0f);
        this.f28877h = new Rect();
        c(context, attributeSet, 0);
    }

    public TickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TextPaint textPaint = new TextPaint(1);
        this.f28871a = textPaint;
        this.f28872b = new TextPaint(1);
        c cVar = new c(textPaint);
        this.c = cVar;
        this.f28873d = new j(cVar);
        this.f28874e = ValueAnimator.ofFloat(1.0f);
        this.f28877h = new Rect();
        c(context, attributeSet, i10);
    }
}
