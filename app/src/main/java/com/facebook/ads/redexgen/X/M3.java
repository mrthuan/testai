package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.Layout;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public abstract class M3 {
    public static byte[] A00;
    public static String[] A01 = {"aXQ8cQ350VCAT2mitcvykUGHubvGx6C9", "NAK0YApfoevBcA8nU2", "YHwKc8bJ3fYIczYaga21kucMEh7K8adi", "qYAOAoZ496ND8", "6pHjubFxbGGqNA8P9d", "3r9qhhsI1oDbETggKvxV5tdwn", "sRn13xQSljRP603ULBb8dNJbjS", "vNgqutu69Vtz3tnibxv52jRaXo"};
    public static final int A02;
    public static final int A03;
    public static final ConcurrentHashMap<Integer, Integer> A04;
    public static final AtomicInteger A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Drawable A09(int i10, int i11, int i12, int i13) {
        return Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(ColorStateList.valueOf(i11), A06(i10, i13), A07(i12, i13)) : A0A(i10, i11, i13);
    }

    public static String A0D(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A00 = new byte[]{120, 118, -127, -127, 122, -121, 105, -114, -123, 122, -35, -26, -29, -35, -27, -39, -19, -23, -17, -20, -35, -33, -124, -121, -118, -110, -125, -112, -125, -126, 125, -127, -118, -121, -127, -119, 125, -126, -125, -118, Byte.MAX_VALUE, -105, 125, -117, -111, -40, -35, -29, -44, -31, -30, -29, -40, -29, -40, -48, -37, -39, -29, -49, -45, -47, -45, -49, -42, -39, -36, -28, -43, -30, -49, -45, -36, -39, -45, -37, -29, -49, -33, -34, -49, -45, -28, -47, -125, -115, 121, 125, -116, Byte.MAX_VALUE, 123, -114, -125, -112, Byte.MAX_VALUE, 121, 123, -115, 121, 125, -114, 123, 121, -112, 76, -90, -103, -85, -107, -90, -104, -103, -104, -109, -86, -99, -104, -103, -93, -50, -53, -66, -53, -48, -53, -119, -55, -63, -64, -59, -47, -55, -11, -29, -16, -11, -81, -11, -25, -12, -21, -24, -81, -17, -25, -26, -21, -9, -17, -36, -43, -48, -40, -36, -52, -80, -53, -66, -68, -82, -69, -84, -75, -78, -84, -76};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static boolean A0g(C1314Zs c1314Zs, EnumC04380g enumC04380g, Map<String, String> map) {
        String str = map.get(A0D(84, 21, 11));
        boolean z10 = str != null && str.equals(Boolean.TRUE.toString());
        if (z10 && (A0f(c1314Zs, enumC04380g) || A0d(enumC04380g, map))) {
            return true;
        }
        String str2 = map.get(A0D(57, 27, 97));
        return z10 && (str2 != null && str2.equals(Boolean.TRUE.toString())) && A0e(enumC04380g, map);
    }

    static {
        A0E();
        A03 = AbstractC04982p.A01(-1, 0);
        A02 = AbstractC04982p.A01(-16777216, 115);
        A05 = new AtomicInteger(1);
        A04 = new ConcurrentHashMap<>();
    }

    public static int A00() {
        int i10;
        int newValue;
        do {
            i10 = A05.get();
            newValue = i10 + 1;
            if (newValue > 16777215) {
                newValue = 1;
            }
        } while (!A05.compareAndSet(i10, newValue));
        return i10;
    }

    public static int A01(int i10) {
        return (int) TypedValue.applyDimension(2, i10, LP.A03);
    }

    public static int A02(int i10) {
        if (A0c(i10)) {
            return AbstractC04982p.A02(i10, -1, 0.4f);
        }
        return AbstractC04982p.A02(i10, -16777216, 0.2f);
    }

    public static int A03(TextView textView) {
        Layout layout;
        int lineCount;
        if (textView == null || textView.getLayout() == null || (lineCount = (layout = textView.getLayout()).getLineCount()) <= 0) {
            return 0;
        }
        double ellipsisCount = layout.getEllipsisCount(lineCount - 1);
        double ellipsisCount2 = ellipsisCount / (textView.getText().length() - ellipsisCount);
        if (A01[3].length() != 20) {
            A01[3] = "IkK7ljd8WWfE470H6O9Fo";
            return (int) Math.ceil(ellipsisCount2);
        }
        throw new RuntimeException();
    }

    public static int A04(TextView textView, int i10) {
        int lineHeightTitle = A03(textView);
        int lines = 0;
        int extraLinesRequired = textView.getLineHeight();
        while (i10 > extraLinesRequired && lines < lineHeightTitle) {
            lines++;
            i10 -= extraLinesRequired;
        }
        return lines;
    }

    public static Drawable A05(int i10, int i11) {
        return A08(i10, A02(i10), i11);
    }

    public static Drawable A06(int i10, int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(i11);
        return gradientDrawable;
    }

    public static Drawable A07(int i10, int i11) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, i11);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(i10);
        return shapeDrawable;
    }

    public static Drawable A08(int i10, int i11, int i12) {
        return A09(i10, i11, i10, i12);
    }

    public static StateListDrawable A0A(int i10, int i11, int i12) {
        return A0B(new int[][]{new int[]{16842919}, new int[0]}, new int[]{i11, i10}, i12);
    }

    public static StateListDrawable A0B(int[][] iArr, int[] iArr2, int i10) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        int i11 = 0;
        while (true) {
            int length = iArr.length;
            String[] strArr = A01;
            String str = strArr[7];
            String str2 = strArr[6];
            int i12 = str.length();
            if (i12 != str2.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "YKf7NEmPl3xejVzEDC";
            strArr2[1] = "WRDdubv1OiIiL9yW5q";
            if (i11 < length) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iArr2[i11]);
                gradientDrawable.setCornerRadius(i10);
                stateListDrawable.addState(iArr[i11], gradientDrawable);
                i11++;
            } else {
                return stateListDrawable;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.widget.TextView A0C(android.view.ViewGroup r4) {
        /*
            r1 = 0
        L1:
            int r0 = r4.getChildCount()
            if (r1 >= r0) goto L3d
            android.view.View r3 = r4.getChildAt(r1)
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L2b
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.M3.A01
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 20
            if (r1 == r0) goto L37
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.M3.A01
            java.lang.String r1 = "6RJtTYzLBnUcHRvsTatmkmWKIun16hlE"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "BwINbhkVgYMYeGJED3O8k6L5SNrYNN6g"
            r0 = 2
            r2[r0] = r1
            return r3
        L2b:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L34
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            A0C(r3)
        L34:
            int r1 = r1 + 1
            goto L1
        L37:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.M3.A0C(android.view.ViewGroup):android.widget.TextView");
    }

    public static void A0F(int i10, View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i10 / 3);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration((i10 / 3) * 2);
        scaleAnimation2.setInterpolator(new BounceInterpolator());
        scaleAnimation.setAnimationListener(new C1203Vh(view, scaleAnimation2));
        view.startAnimation(scaleAnimation);
    }

    public static void A0G(int i10, View view) {
        Integer viewId = A04.get(Integer.valueOf(i10));
        if (viewId != null) {
            view.setId(viewId.intValue());
        } else {
            A0K(view);
        }
    }

    public static void A0H(View view) {
        A0N(view, 8);
    }

    public static void A0I(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            A0T((ViewGroup) parent);
        }
    }

    public static void A0J(View view) {
        if (view == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (A01[3].length() == 20) {
            throw new RuntimeException();
        }
        A01[3] = "DU33ZJN3ug5gIBKNKyYbqVVAVCFz";
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public static void A0K(View view) {
        if (view == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            view.setId(View.generateViewId());
        } else {
            view.setId(A00());
        }
    }

    public static void A0L(View view) {
        A0N(view, 0);
    }

    public static void A0M(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(new ColorDrawable(i10));
        } else {
            view.setBackgroundDrawable(new ColorDrawable(i10));
        }
    }

    public static void A0N(View view, int i10) {
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public static void A0O(View view, int i10, int i11) {
        A0S(view, A08(i10, A02(i10), i11));
    }

    public static void A0P(View view, int i10, int i11, int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A03, A02});
        gradientDrawable.setCornerRadius(i10);
        gradientDrawable.setStroke(i11, i12);
        A0S(view, gradientDrawable);
    }

    public static void A0Q(View view, int i10, int i11, int i12) {
        A0S(view, A09(i10, A02(i10), i11, i12));
    }

    public static void A0R(View view, Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A03, A02});
        gradientDrawable.setCornerRadius(0.0f);
        A0S(view, gradientDrawable);
    }

    public static void A0S(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void A0T(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT > 19) {
            A0U(viewGroup, 200);
        }
    }

    public static void A0U(ViewGroup viewGroup, int i10) {
        if (Build.VERSION.SDK_INT > 19) {
            A0W(viewGroup, new AutoTransition(), i10);
        }
    }

    public static void A0V(ViewGroup viewGroup, Transition transition) {
        if (Build.VERSION.SDK_INT > 19) {
            A0W(viewGroup, transition, 200);
        }
    }

    public static void A0W(ViewGroup viewGroup, Transition transition, int i10) {
        transition.setDuration(i10);
        transition.setInterpolator(new AccelerateDecelerateInterpolator());
        TransitionManager.beginDelayedTransition(viewGroup, transition);
    }

    public static void A0X(Button button) {
        Typeface typeface;
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = A01;
            if (strArr[0].charAt(20) != strArr[2].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "0eysB36Fl0fjQH1dJXMQGfNSZ7";
            strArr2[6] = "2uEiWgVZ3g024XFvQ4YapgJ5oH";
            typeface = Typeface.create(A0D(119, 13, 77), 0);
        } else {
            typeface = Typeface.create(Typeface.SANS_SERIF, 1);
        }
        button.setTypeface(typeface);
    }

    public static void A0Y(TextView textView, boolean z10, int i10) {
        Typeface typeface;
        if (!z10) {
            typeface = Typeface.create(Typeface.SANS_SERIF, 0);
        } else if (Build.VERSION.SDK_INT < 21) {
            typeface = Typeface.create(Typeface.SANS_SERIF, 1);
        } else if (A01[5].length() != 25) {
            throw new RuntimeException();
        } else {
            A01[3] = "EYVeEO4Fu";
            typeface = Typeface.create(A0D(ShapeTypes.FLOW_CHART_PROCESS, 17, 115), 0);
        }
        textView.setTypeface(typeface);
        textView.setTextSize(2, i10);
    }

    public static void A0Z(Toast toast, String str, int i10, int i11, int i12) {
        if (toast == null) {
            return;
        }
        toast.setGravity(i10, i11, i12);
        TextView A0C = A0C((ViewGroup) toast.getView());
        if (A0C != null) {
            A0C.setText(str);
            A0C.setGravity(17);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void A0a(Map<String, String> map, AbstractC1456cD abstractC1456cD) {
        char c;
        if (abstractC1456cD == null) {
            return;
        }
        String A0c = abstractC1456cD.A0c();
        switch (A0c.hashCode()) {
            case -1364000502:
                if (A0c.equals(A0D(105, 14, 37))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 604727084:
                String A0D = A0D(45, 12, 96);
                if (A01[3].length() == 20) {
                    throw new RuntimeException();
                }
                A01[3] = "p9FB";
                if (A0c.equals(A0D)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String A0D2 = A0D(0, 10, 6);
        switch (c) {
            case 0:
                map.put(A0D2, AdPlacementType.INTERSTITIAL.name());
                break;
            case 1:
                map.put(A0D2, AdPlacementType.REWARDED_VIDEO.name());
                break;
        }
        map.put(A0D(ShapeTypes.FLOW_CHART_SORT, 8, 88), abstractC1456cD.A0X());
        map.put(A0D(84, 21, 11), String.valueOf(abstractC1456cD.A17()));
        map.put(A0D(57, 27, 97), String.valueOf(abstractC1456cD.A13()));
        map.put(A0D(22, 23, 15), String.valueOf(abstractC1456cD.A0U()));
    }

    public static void A0b(View... viewArr) {
        for (View view : viewArr) {
            A0J(view);
        }
    }

    public static boolean A0c(int i10) {
        return AbstractC04982p.A00(i10) < 0.5d;
    }

    public static boolean A0d(EnumC04380g enumC04380g, Map<String, String> extraData) {
        boolean nonIabDestination = !A0D(ShapeTypes.FLOW_CHART_DISPLAY, 9, 58).equals(extraData.get(A0D(10, 12, 107)));
        boolean nonCtaClick = enumC04380g != EnumC04380g.A08;
        return nonIabDestination && nonCtaClick;
    }

    public static boolean A0e(EnumC04380g enumC04380g, Map<String, String> extraData) {
        boolean equals = A0D(ShapeTypes.FLOW_CHART_DISPLAY, 9, 58).equals(extraData.get(A0D(10, 12, 107)));
        boolean ctaClick = enumC04380g != EnumC04380g.A08;
        return equals && ctaClick;
    }

    public static boolean A0f(C1314Zs c1314Zs, EnumC04380g enumC04380g) {
        return enumC04380g == EnumC04380g.A08 && C0877Im.A2j(c1314Zs);
    }
}
