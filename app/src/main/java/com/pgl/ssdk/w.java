package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.view.Display;

/* compiled from: VirtualDisplayInfo.java */
/* loaded from: classes2.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f15859a = null;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f15860b = false;
    private static String c;

    /* renamed from: d  reason: collision with root package name */
    private static String f15861d;

    /* renamed from: e  reason: collision with root package name */
    private static String f15862e;

    /* renamed from: f  reason: collision with root package name */
    private static DisplayManager f15863f;

    /* compiled from: VirtualDisplayInfo.java */
    /* loaded from: classes2.dex */
    public static class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
            w.a(i10, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            w.a(i10, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
            w.a(i10, 2);
        }
    }

    private static String a(Display display) {
        String name = display.getName();
        Object a10 = J.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object a11 = J.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object a12 = J.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        return String.format("%s#%s#%b", a11, name, Boolean.valueOf((a10 == null || a12 == null || ((Integer) a10).intValue() != ((Integer) a12).intValue()) ? false : true));
    }

    public static void b(Context context) {
        Q c10;
        if (f15860b) {
            return;
        }
        f15860b = true;
        if (f15859a == null) {
            f15859a = new a();
        }
        if (f15863f == null) {
            f15863f = (DisplayManager) context.getSystemService("display");
        }
        if (f15863f != null && (c10 = M.a().c()) != null) {
            f15863f.registerDisplayListener(f15859a, c10);
        }
    }

    public static void a(int i10, int i11) {
        if (i10 != 0) {
            try {
                Display display = f15863f.getDisplay(i10);
                String a10 = display != null ? a(display) : "pd";
                if (i11 == 1) {
                    if (a10.equals(c)) {
                        return;
                    }
                    c = a10;
                } else if (i11 != 2) {
                    if (i11 != 3 || a10.equals(f15862e)) {
                        return;
                    }
                    f15862e = a10;
                } else if (a10.equals(f15861d)) {
                } else {
                    f15861d = a10;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a(Context context) {
        String str;
        Display[] displays;
        if (c == null && f15861d == null && f15862e == null) {
            if (context != null) {
                if (f15863f == null) {
                    f15863f = (DisplayManager) context.getSystemService("display");
                }
                DisplayManager displayManager = f15863f;
                if (displayManager == null || (displays = displayManager.getDisplays()) == null) {
                    str = "";
                } else {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i10 = 0; i10 < displays.length; i10++) {
                        Display display = displays[i10];
                        if (display != null && display.getDisplayId() != 0) {
                            stringBuffer.append(a(displays[i10]));
                            if (i10 != displays.length - 1) {
                                stringBuffer.append(",");
                            }
                        }
                    }
                    str = stringBuffer.toString();
                }
                if (!TextUtils.isEmpty(str)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
