package com.facebook.ads.internal.util.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import com.facebook.ads.redexgen.X.C0877Im;
import com.facebook.ads.redexgen.X.C0932Kw;
import com.facebook.ads.redexgen.X.C1313Zr;
import com.facebook.ads.redexgen.X.C1314Zs;
import com.facebook.ads.redexgen.X.C8E;
import com.facebook.ads.redexgen.X.C8F;
import com.facebook.ads.redexgen.X.ExecutorC0959Lx;
import com.facebook.ads.redexgen.X.InterfaceC0930Ks;
import com.facebook.ads.redexgen.X.RunnableC0929Kr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class ActivityUtils implements Application.ActivityLifecycleCallbacks {
    public static Context A01;
    public static C1313Zr A02;
    public static byte[] A03;
    public static String[] A04 = {"92eOfmmmV4HUmtBKNwX5jODUm9snbisL", "83A6RHTc3uHHgwZu0l", "xT8NDmJO40EcDZzCFYpPknxtJdrIGRIs", "yd9OYuKBF31VEKohInrUKVptjNnIlgtF", "ffDhLNnwXMIpP", "gJJ", "YtTChd0N7kYfN", "CHt0mr4gyt"};
    public static final C0932Kw A05;
    public static final List<InterfaceC0930Ks> A06;
    public static final List<Runnable> A07;
    public static final Map<Activity, Integer> A08;
    public final Class<? extends Activity> A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {14, 2, Field.QUOTE, Field.FILESIZE, 86, Field.MERGESEQ, Field.HYPERLINK, Field.MERGESEQ, 86, Field.HTMLCONTROL, Field.NUMCHARS, 2, -90, -102, -20, -33, -32, -76, -102, 6, Field.DATA, Field.SYMBOL, Field.DDEAUTO, 59, Field.DDEAUTO, Field.SYMBOL, Field.USERADDRESS, -27, 41, Field.DDEAUTO, 56, Field.DATA, Field.IMPORT, 42, Field.AUTONUMLGL, Field.ASK, Field.MACROBUTTON, Field.DATA, Field.DDEAUTO, 42, 56, -13, 56, 103, 103, 58, 102, 101, 107, Field.BIDIOUTLINE, 111, 107, 23, 96, 106, 23, 101, 102, 107, 23, 56, 103, 103, 99, 96, Field.LISTNUM, Field.HYPERLINK, 107, 96, 102, 101, Field.PAGEREF, -3, 41, Field.DATA, 29, Field.GLOSSARY, 44, 44, 31, Field.DATA, Field.DDEAUTO, -38, Field.FILLIN, 41, 30, Field.QUOTE, 32, Field.QUOTE, 29, Field.NUMWORDS, Field.DDEAUTO, Field.QUOTE, 41, Field.DATA, -38, 31, Field.GOTOBUTTON, 29, 31, 42, Field.DDEAUTO, Field.QUOTE, 41, Field.DATA, -38, Field.DDEAUTO, 34, 44, 41, Field.EQ, Field.DATA, 30, Field.GLOSSARY, 44, Field.QUOTE, Field.DATA, 33, -38, 44, 31, 33, Field.QUOTE, Field.DDE, Field.DDEAUTO, 31, 44, -5, 29, Field.DDEAUTO, Field.QUOTE, 48, Field.QUOTE, Field.DDEAUTO, Field.MACROBUTTON, -3, Field.NUMWORDS, Field.ASK, Field.ASK, Field.NUMCHARS, Field.NUMWORDS, 29, Field.PAGEREF, Field.DDE, 6, Field.QUOTE, Field.DDE, Field.DDEAUTO, 31, Field.DATA, 31, 44, Field.DDE, 74, Field.SECTIONPAGES, -2, Field.BARCODE, Field.SECTION, 82, Field.FORMCHECKBOX, Field.ADVANCE, Field.FORMCHECKBOX, 82, Field.CONTROL, -2, Field.ADDIN, 82, Field.BARCODE, 82, Field.INCLUDEPICTURE, 24, -2, 24, 41, 61, 59, Field.DDE, 44, -24, 41, 43, 60, Field.EQ, Field.USERADDRESS, Field.EQ, 60, Field.SECTION, -24, Field.EQ, 59, -24, Field.AUTONUM, Field.IMPORT, 60, -24, 58, Field.DDE, 59, 61, Field.AUTONUMLGL, Field.DDE, 44, -10, 44, Field.BARCODE, 77, 20, -6, 23, 25, 42, 21, 43, 42, 31, 34, -35, -20, -27, 58, Field.SYMBOL, 12, Field.DDEAUTO, Field.BARCODE, Field.AUTONUMOUT, Field.SECTION, Field.AUTONUMOUT, Field.BARCODE, Field.INCLUDETEXT, 14, 61, 48, 44, Field.BARCODE, 48, Field.GLOSSARY};
        if (A04[0].charAt(5) != 'm') {
            throw new RuntimeException();
        }
        A04[7] = "OT1BI2x3SK";
        A03 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static synchronized void A04(C1313Zr c1313Zr, Class<? extends Activity> cls) {
        synchronized (ActivityUtils.class) {
            A02 = c1313Zr;
            A01 = c1313Zr.getApplicationContext();
            if (A01 instanceof Application) {
                ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = ANActivityLifecycleCallbacksListener.getANActivityLifecycleCallbacksListener();
                if (aNActivityLifecycleCallbacksListener != null) {
                    Map<Activity, Integer> activityStateMap = aNActivityLifecycleCallbacksListener.getActivityStateMap();
                    synchronized (activityStateMap) {
                        try {
                            A08.putAll(activityStateMap);
                        } catch (ConcurrentModificationException unused) {
                            c1313Zr.A07().AA0(A01(208, 8, 61), C8E.A02, new C8F(A01(72, 80, 65)));
                        }
                    }
                    ANActivityLifecycleCallbacksListener.unregisterActivityCallbacks(c1313Zr);
                }
                ((Application) A01).registerActivityLifecycleCallbacks(new ActivityUtils(cls));
            } else {
                c1313Zr.A07().AA0(A01(216, 3, 3), C8E.A0d, new C8F(A01(42, 30, 126)));
            }
        }
    }

    static {
        A02();
        A08 = Collections.synchronizedMap(new WeakHashMap());
        A06 = Collections.synchronizedList(new ArrayList());
        A07 = new ArrayList();
        A05 = C0932Kw.A00();
    }

    public ActivityUtils(Class<? extends Activity> adsActivityClass) {
        this.A00 = adsActivityClass;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: all -> 0x00a0, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x000e, B:8:0x0014, B:10:0x0027, B:13:0x0031, B:19:0x003d, B:20:0x0041, B:24:0x0049), top: B:33:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized android.app.Activity A00() {
        /*
            java.lang.Class<com.facebook.ads.internal.util.activity.ActivityUtils> r8 = com.facebook.ads.internal.util.activity.ActivityUtils.class
            monitor-enter(r8)
            r6 = 0
            java.util.Map<android.app.Activity, java.lang.Integer> r0 = com.facebook.ads.internal.util.activity.ActivityUtils.A08     // Catch: java.lang.Throwable -> La0
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> La0
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> La0
        Le:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L2d
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> La0
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Throwable -> La0
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> La0
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> La0
            r0 = 3
            if (r1 != r0) goto Le
            java.lang.Object r6 = r2.getKey()     // Catch: java.lang.Throwable -> La0
            android.app.Activity r6 = (android.app.Activity) r6     // Catch: java.lang.Throwable -> La0
        L2d:
            r5 = 0
            r7 = 1
            if (r6 == 0) goto L3a
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> La0
            r0 = 28
            if (r1 >= r0) goto L38
            goto L3a
        L38:
            r1 = 0
            goto L3b
        L3a:
            r1 = 1
        L3b:
            if (r1 == 0) goto L41
            android.app.Activity r5 = com.facebook.ads.redexgen.X.AbstractC0927Kp.A00()     // Catch: java.lang.Throwable -> La0
        L41:
            com.facebook.ads.redexgen.X.Zr r0 = com.facebook.ads.internal.util.activity.ActivityUtils.A02     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L9a
            if (r1 == 0) goto L9a
            if (r6 == r5) goto L9a
            r2 = 19
            r1 = 23
            r0 = 76
            java.lang.String r1 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r4.<init>()     // Catch: java.lang.Throwable -> La0
            r3 = 203(0xcb, float:2.84E-43)
            r2 = 5
            r0 = 97
            java.lang.String r0 = A01(r3, r2, r0)     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r0 = r4.append(r0)     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r4 = r0.append(r6)     // Catch: java.lang.Throwable -> La0
            r3 = 12
            r2 = 7
            r0 = 1
            java.lang.String r0 = A01(r3, r2, r0)     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r0 = r4.append(r0)     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La0
            com.facebook.ads.redexgen.X.8F r2 = new com.facebook.ads.redexgen.X.8F     // Catch: java.lang.Throwable -> La0
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> La0
            r2.A05(r7)     // Catch: java.lang.Throwable -> La0
            com.facebook.ads.redexgen.X.Zr r0 = com.facebook.ads.internal.util.activity.ActivityUtils.A02     // Catch: java.lang.Throwable -> La0
            com.facebook.ads.redexgen.X.8D r4 = r0.A07()     // Catch: java.lang.Throwable -> La0
            r3 = 208(0xd0, float:2.91E-43)
            r1 = 8
            r0 = 61
            java.lang.String r0 = A01(r3, r1, r0)     // Catch: java.lang.Throwable -> La0
            int r1 = com.facebook.ads.redexgen.X.C8E.A03     // Catch: java.lang.Throwable -> La0
            r4.AA0(r0, r1, r2)     // Catch: java.lang.Throwable -> La0
        L9a:
            if (r6 == 0) goto L9e
            monitor-exit(r8)
            return r6
        L9e:
            monitor-exit(r8)
            return r5
        La0:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.util.activity.ActivityUtils.A00():android.app.Activity");
    }

    public static void A03(C1314Zs c1314Zs) {
        if (!C0877Im.A1f(c1314Zs) || Build.VERSION.SDK_INT >= 29) {
            return;
        }
        RunnableC0929Kr runnableC0929Kr = new RunnableC0929Kr(c1314Zs);
        synchronized (A07) {
            A07.add(runnableC0929Kr);
        }
        ExecutorC0959Lx.A01.A01().postDelayed(runnableC0929Kr, 2000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        A08.put(activity, 1);
        Iterator<InterfaceC0930Ks> it = A06.iterator();
        boolean hasNext = it.hasNext();
        String[] strArr = A04;
        if (strArr[4].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[3] = "6ucg7ZQRC52PgbYLp0IlsO8L9UBIqtAr";
        strArr2[2] = "XfsAw5zLn3vJHYKMay1aCQiNLVOIwPXI";
        if (hasNext) {
            it.next();
            throw new NullPointerException(A01(219, 17, 82));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        A08.put(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList;
        Integer num = A08.get(activity);
        if (num == null || num.intValue() != 3) {
            C8F c8f = new C8F(A01(ShapeTypes.ACTION_BUTTON_MOVIE, 31, 79), A01(ShapeTypes.FLOW_CHART_OFFLINE_STORAGE, 20, 101) + num + A01(0, 12, 105) + activity);
            c8f.A05(0);
            A02.A07().AA0(A01(208, 8, 61), C8E.A03, c8f);
        }
        A08.put(activity, 4);
        if (activity.getClass() != this.A00) {
            synchronized (A07) {
                arrayList = new ArrayList(A07);
                A07.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ExecutorC0959Lx.A01.A01().removeCallbacks((Runnable) it.next());
            }
        }
        A05.A01();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        A08.put(activity, 3);
        A05.A02();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        A08.put(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        A08.put(activity, 5);
    }
}
