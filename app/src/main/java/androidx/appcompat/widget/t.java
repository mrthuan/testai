package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f2675l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    public static final ConcurrentHashMap<String, Method> f2676m = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f2677a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2678b = false;
    public float c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f2679d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f2680e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f2681f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f2682g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f2683h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f2684i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f2685j;

    /* renamed from: k  reason: collision with root package name */
    public final d f2686k;

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static final class c {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
            }
            return obtain.build();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static class d extends f {
        @Override // androidx.appcompat.widget.t.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            Object obj = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            try {
                obj = t.d("getTextDirectionHeuristic").invoke(textView, new Object[0]);
            } catch (Exception unused) {
            }
            builder.setTextDirection((TextDirectionHeuristic) obj);
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static class e extends d {
        @Override // androidx.appcompat.widget.t.d, androidx.appcompat.widget.t.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.t.f
        public boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static class f {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean b(TextView textView) {
            Object obj = Boolean.FALSE;
            try {
                obj = t.d("getHorizontallyScrolling").invoke(textView, new Object[0]);
            } catch (Exception unused) {
            }
            return ((Boolean) obj).booleanValue();
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public t(TextView textView) {
        this.f2684i = textView;
        this.f2685j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2686k = new e();
        } else {
            this.f2686k = new d();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f2676m;
            Method method = concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a() {
        boolean z10;
        int measuredWidth;
        if (h() && this.f2677a != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        if (this.f2678b) {
            if (this.f2684i.getMeasuredHeight() > 0 && this.f2684i.getMeasuredWidth() > 0) {
                if (this.f2686k.b(this.f2684i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f2684i.getMeasuredWidth() - this.f2684i.getTotalPaddingLeft()) - this.f2684i.getTotalPaddingRight();
                }
                int height = (this.f2684i.getHeight() - this.f2684i.getCompoundPaddingBottom()) - this.f2684i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f2675l;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c10 = c(rectF);
                        if (c10 != this.f2684i.getTextSize()) {
                            e(c10, 0);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f2678b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5 */
    public final int c(RectF rectF) {
        boolean z10;
        CharSequence transformation;
        int length = this.f2681f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                int i14 = this.f2681f[i13];
                TextView textView = this.f2684i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int b10 = a.b(textView);
                TextPaint textPaint = this.f2683h;
                if (textPaint == null) {
                    this.f2683h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f2683h.set(textView.getPaint());
                this.f2683h.setTextSize(i14);
                Object obj = Layout.Alignment.ALIGN_NORMAL;
                try {
                    obj = d("getLayoutAlignment").invoke(textView, new Object[0]);
                } catch (Exception unused) {
                }
                StaticLayout a10 = c.a(text, obj, Math.round(rectF.right), b10, this.f2684i, this.f2683h, this.f2686k);
                if ((b10 != -1 && (a10.getLineCount() > b10 || a10.getLineEnd(a10.getLineCount() - 1) != text.length())) || a10.getHeight() > rectF.bottom) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    int i15 = i13 + 1;
                    i12 = i11;
                    i11 = i15;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f2681f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void e(float f10, int i10) {
        Resources resources;
        Context context = this.f2685j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics());
        TextView textView = this.f2684i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a10 = b.a(textView);
            if (textView.getLayout() != null) {
                this.f2678b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(textView, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!a10) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean f() {
        if (h() && this.f2677a == 1) {
            if (!this.f2682g || this.f2681f.length == 0) {
                int floor = ((int) Math.floor((this.f2680e - this.f2679d) / this.c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((i10 * this.c) + this.f2679d);
                }
                this.f2681f = b(iArr);
            }
            this.f2678b = true;
        } else {
            this.f2678b = false;
        }
        return this.f2678b;
    }

    public final boolean g() {
        int[] iArr;
        int length;
        boolean z10;
        if (this.f2681f.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2682g = z10;
        if (z10) {
            this.f2677a = 1;
            this.f2679d = iArr[0];
            this.f2680e = iArr[length - 1];
            this.c = -1.0f;
        }
        return z10;
    }

    public final boolean h() {
        return !(this.f2684i instanceof AppCompatEditText);
    }

    public final void i(float f10, float f11, float f12) {
        if (f10 > 0.0f) {
            if (f11 > f10) {
                if (f12 > 0.0f) {
                    this.f2677a = 1;
                    this.f2679d = f10;
                    this.f2680e = f11;
                    this.c = f12;
                    this.f2682g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
    }
}
