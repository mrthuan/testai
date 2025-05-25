package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.android.gms.common.api.Api;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hpsf.Constants;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public class FL extends ViewGroup implements C3A {
    public static byte[] A18;
    public static String[] A19 = {"EVtiEz0XwzmAcv0NfW8PxL5EkbzIoYic", "JvoTrXnfxJUplw5tP56Ros2T7Gsfofpu", "CB3RTx10Tt9OnvYftpvuMygLYd0xmG3f", "iCoGDb0mnoj0sn99iJ8fx9KF0Zt33I3a", "ipdvxhFfLLm3eGkYLsOkZJNxKW1ljoxp", "EVaiAhpvjrLt8PNqQrclR8roKXj174Mb", "AK1oSCSoqExnNm9Bojb7ErrkRophOnjO", "V"};
    public static final Interpolator A1A;
    public static final boolean A1B;
    public static final boolean A1C;
    public static final boolean A1D;
    public static final boolean A1E;
    public static final boolean A1F;
    public static final boolean A1G;
    public static final int[] A1H;
    public static final int[] A1I;
    public static final Class<?>[] A1J;
    public C1378av A00;
    public C4C A01;
    public C1377au A02;
    public C4P A03;
    public AbstractC05364c A04;
    public AbstractC05444k A05;
    public AbstractC05484o A06;
    public InterfaceC05564x A07;
    public AnonymousClass55 A08;
    public C1364ag A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public float A0L;
    public float A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public VelocityTracker A0Y;
    public EdgeEffect A0Z;
    public EdgeEffect A0a;
    public EdgeEffect A0b;
    public EdgeEffect A0c;
    public C3B A0d;
    public InterfaceC05394f A0e;
    public InterfaceC05424i A0f;
    public AbstractC05514r A0g;
    public InterfaceC05524s A0h;
    public AbstractC05534t A0i;
    public RecyclerView$SavedState A0j;
    public Runnable A0k;
    public List<RecyclerView.OnChildAttachStateChangeListener> A0l;
    public List<AbstractC05534t> A0m;
    public boolean A0n;
    public boolean A0o;
    public final Rect A0p;
    public final RectF A0q;
    public final C05554w A0r;
    public final AnonymousClass53 A0s;
    public final C5E A0t;
    public final Runnable A0u;
    public final ArrayList<RecyclerView.ItemDecoration> A0v;
    public final List<AnonymousClass56> A0w;
    public final int A0x;
    public final int A0y;
    public final Rect A0z;
    public final AccessibilityManager A10;
    public final C1366aj A11;
    public final C5D A12;
    public final ArrayList<InterfaceC05524s> A13;
    public final int[] A14;
    public final int[] A15;
    public final int[] A16;
    public final int[] A17;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static FL A0H(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof FL) {
                return (FL) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                FL A0H = A0H(viewGroup.getChildAt(i10));
                if (A0H != null) {
                    return A0H;
                }
            }
            return null;
        }
        return null;
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A18, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            A19[1] = "u7dEJjISLATYPJ53p8QeJMuNBCdH6OYt";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 27);
            i13++;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0N() {
        this.A0s.A04(4);
        A1J();
        A1K();
        this.A0s.A04 = 1;
        if (this.A0s.A0C) {
            for (int A05 = this.A01.A05() - 1; A05 >= 0; A05--) {
                AnonymousClass56 A0F = A0F(this.A01.A09(A05));
                if (!A0F.A0f()) {
                    long A0C = A0C(A0F);
                    C05434j A08 = this.A05.A08(this.A0s, A0F);
                    AnonymousClass56 A052 = this.A0t.A05(A0C);
                    if (A052 == null || A052.A0f()) {
                        this.A0t.A0E(A0F, A08);
                    } else {
                        boolean A0H = this.A0t.A0H(A052);
                        boolean A0H2 = this.A0t.A0H(A0F);
                        if (A0H && A052 == A0F) {
                            this.A0t.A0E(A0F, A08);
                        } else {
                            C05434j A04 = this.A0t.A04(A052);
                            this.A0t.A0E(A0F, A08);
                            C05434j A03 = this.A0t.A03(A0F);
                            if (A04 == null) {
                                A0m(A0C, A0F, A052);
                            } else {
                                A0t(A052, A0F, A04, A03, A0H, A0H2);
                            }
                        }
                    }
                }
            }
            this.A0t.A0G(this.A12);
        }
        this.A06.A1G(this.A0r);
        this.A0s.A05 = this.A0s.A03;
        this.A0C = false;
        this.A0s.A0C = false;
        this.A0s.A0B = false;
        this.A06.A09 = false;
        if (this.A0r.A02 != null) {
            this.A0r.A02.clear();
        }
        if (this.A06.A08) {
            this.A06.A00 = 0;
            this.A06.A08 = false;
            this.A0r.A0O();
        }
        this.A06.A1v(this.A0s);
        A1L();
        A1n(false);
        this.A0t.A06();
        if (A11(this.A14[0], this.A14[1])) {
            A1b(0, 0);
        }
        A0Q();
        A0S();
    }

    public static void A0W() {
        A18 = new byte[]{82, Field.INCLUDETEXT, Field.DDEAUTO, Field.INCLUDETEXT, 122, -115, -119, -101, Field.INCLUDETEXT, 108, -109, -112, -120, -119, -106, Field.INCLUDETEXT, 86, Field.GREETINGLINE, -80, -13, -15, -2, -2, -1, 4, -80, -14, -11, -80, -10, -1, 5, -2, -12, -80, -14, 5, 4, -80, -7, 4, -80, -7, 3, -80, -2, -11, -13, -11, 3, 3, -15, 2, 9, -80, -10, -1, 2, -80, -73, 0, 10, -73, -8, 3, 9, -4, -8, -5, 16, -73, -8, 11, 11, -8, -6, -1, -4, -5, -73, 11, 6, -73, -8, -73, -23, -4, -6, 16, -6, 3, -4, 9, -19, 0, -4, 14, -47, 97, -86, -76, 97, -81, -80, -75, 97, -94, 97, -91, -86, -77, -90, -92, -75, 97, -92, -87, -86, -83, -91, 97, -80, -89, 97, -95, -17, -16, -11, -95, -25, -16, -10, -17, -27, -81, -95, -59, -22, -27, -95, -30, -17, -6, -95, -50, -16, -11, -22, -16, -17, -58, -9, -26, -17, -11, -12, -95, -24, -26, -11, -95, -12, -20, -22, -15, -15, -26, -27, -64, -98, -110, -45, -42, -45, -30, -26, -41, -28, -84, -66, -78, -11, 1, 0, 6, -9, 10, 6, -52, -99, -111, -35, -46, -22, -32, -26, -27, -85, -82, -109, -24, -26, -36, -31, -38, -109, -41, -40, -39, -44, -24, -33, -25, -109, -23, -44, -33, -24, -40, -78, -48, -37, -37, -44, -45, -113, -31, -44, -36, -34, -27, -44, -77, -44, -29, -48, -46, -41, -44, -45, -59, -40, -44, -26, -113, -26, -40, -29, -41, -113, -48, -113, -27, -40, -44, -26, -113, -26, -41, -40, -46, -41, -113, -40, -30, -113, -35, -34, -29, -113, -43, -37, -48, -42, -42, -44, -45, -113, -48, -30, -113, -29, -36, -33, -113, -45, -44, -29, -48, -46, -41, -44, -45, -99, -69, -39, -26, -26, -25, -20, -104, -37, -39, -28, -28, -104, -20, -32, -31, -21, -104, -27, -35, -20, -32, -25, -36, -104, -31, -26, -104, -39, -104, -21, -37, -22, -25, -28, -28, -104, -37, -39, -28, -28, -38, -39, -37, -29, -90, -104, -53, -37, -22, -25, -28, -28, -104, -37, -39, -28, -28, -38, -39, -37, -29, -21, -104, -27, -31, -33, -32, -20, -38, -35, -104, -22, -19, -26, -104, -36, -19, -22, -31, -26, -33, -104, -39, -104, -27, -35, -39, -21, -19, -22, -35, -104, -98, -104, -28, -39, -15, -25, -19, -20, -104, -24, -39, -21, -21, -104, -17, -32, -35, -22, -35, -104, -15, -25, -19, -104, -37, -39, -26, -26, -25, -20, -104, -37, -32, -39, -26, -33, -35, -104, -20, -32, -35, -54, -35, -37, -15, -37, -28, -35, -22, -50, -31, -35, -17, -104, -36, -39, -20, -39, -90, -104, -71, -26, -15, -104, -27, -35, -20, -32, -25, -36, -104, -37, -39, -28, -28, -104, -20, -32, -39, -20, -104, -27, -31, -33, -32, -20, -104, -37, -32, -39, -26, -33, -35, -104, -20, -32, -35, -104, -21, -20, -22, -19, -37, -20, -19, -22, -35, -25, -34, -104, -20, -32, -35, -104, -54, -35, -37, -15, -37, -28, -35, -22, -50, -31, -35, -17, -104, -25, -22, -104, -20, -32, -35, -104, -39, -36, -39, -24, -20, -35, -22, -104, -37, -25, -26, -20, -35, -26, -20, -21, -104, -21, -32, -25, -19, -28, -36, -104, -38, -35, -104, -24, -25, -21, -20, -24, -25, -26, -35, -36, -104, -20, -25, -20, -32, -35, -104, -26, -35, -16, -20, -104, -34, -22, -39, -27, -35, -90, -59, -29, -16, -16, -15, -10, -94, -27, -29, -18, -18, -94, -10, -22, -21, -11, -94, -17, -25, -10, -22, -15, -26, -94, -7, -22, -21, -18, -25, -94, -44, -25, -27, -5, -27, -18, -25, -12, -40, -21, -25, -7, -94, -21, -11, -94, -27, -15, -17, -14, -9, -10, -21, -16, -23, -94, -29, -94, -18, -29, -5, -15, -9, -10, -94, -15, -12, -94, -11, -27, -12, -15, -18, -18, -21, -16, -23, -52, -22, -9, -9, -8, -3, -87, -17, -11, -14, -9, -16, -87, 0, -14, -3, -15, -8, -2, -3, -87, -22, -87, -43, -22, 2, -8, -2, -3, -42, -22, -9, -22, -16, -18, -5, -87, -4, -18, -3, -73, -87, -52, -22, -11, -11, -87, -4, -18, -3, -43, -22, 2, -8, -2, -3, -42, -22, -9, -22, -16, -18, -5, -87, 0, -14, -3, -15, -87, -22, -87, -9, -8, -9, -74, -9, -2, -11, -11, -87, -22, -5, -16, -2, -10, -18, -9, -3, -73, 106, -120, -107, -107, -106, -101, Field.FORMCHECKBOX, -102, -118, -103, -106, -109, -109, Field.FORMCHECKBOX, -101, -106, Field.FORMCHECKBOX, -105, -106, -102, -112, -101, -112, -106, -107, Field.FORMCHECKBOX, -120, Field.FORMCHECKBOX, 115, -120, -96, -106, -100, -101, 116, -120, -107, -120, -114, -116, -103, Field.FORMCHECKBOX, -102, -116, -101, Field.DOCPROPERTY, Field.FORMCHECKBOX, 106, -120, -109, -109, Field.FORMCHECKBOX, -102, -116, -101, 115, -120, -96, -106, -100, -101, 116, -120, -107, -120, -114, -116, -103, Field.FORMCHECKBOX, -98, -112, -101, -113, Field.FORMCHECKBOX, -120, Field.FORMCHECKBOX, -107, -106, -107, Field.ADVANCE, -107, -100, -109, -109, Field.FORMCHECKBOX, -120, -103, -114, -100, -108, -116, -107, -101, Field.DOCPROPERTY, -114, -84, -71, -71, -70, -65, 107, -66, -82, -67, -70, -73, -73, 107, -62, -76, -65, -77, -70, -64, -65, 107, -84, 107, -105, -84, -60, -70, -64, -65, -104, -84, -71, -84, -78, -80, -67, 107, -66, -80, -65, 121, 107, -114, -84, -73, -73, 107, -66, -80, -65, -105, -84, -60, -70, -64, -65, -104, -84, -71, -84, -78, -80, -67, 107, -62, -76, -65, -77, 107, -84, 107, -71, -70, -71, 120, -71, -64, -73, -73, 107, -84, -67, -78, -64, -72, -80, -71, -65, 121, -43, -13, 0, 0, 1, 6, -78, 5, -1, 1, 1, 6, -6, -78, 5, -11, 4, 1, -2, -2, -78, 9, -5, 6, -6, 1, 7, 6, -78, -13, -78, -34, -13, 11, 1, 7, 6, -33, -13, 0, -13, -7, -9, 4, -78, 5, -9, 6, -64, -78, -43, -13, -2, -2, -78, 5, -9, 6, -34, -13, 11, 1, 7, 6, -33, -13, 0, -13, -7, -9, 4, -78, 9, -5, 6, -6, 
        -78, -13, -78, 0, 1, 0, -65, 0, 7, -2, -2, -78, -13, 4, -7, 7, -1, -9, 0, 6, -64, 96, -117, 60, -118, -117, -112, 60, -113, -127, -112, 104, 125, -107, -117, -111, -112, 98, -114, -117, -106, -127, -118, 60, -123, -118, 60, -120, 125, -107, -117, -111, -112, 60, -117, -114, 60, -113, Byte.MAX_VALUE, -114, -117, -120, -120, -94, -49, -49, -52, -49, 125, -51, -49, -52, -64, -62, -48, -48, -58, -53, -60, 125, -48, -64, -49, -52, -55, -55, -104, 125, -51, -52, -58, -53, -47, -62, -49, 125, -58, -53, -63, -62, -43, 125, -61, -52, -49, 125, -58, -63, 125, -111, -90, -66, -76, -70, -71, -110, -90, -77, -90, -84, -86, -73, 101, 119, -104, Field.TOA, -118, -115, -118, -103, -99, -114, -101, Field.TOA, -118, -99, -99, -118, -116, -111, -114, -115, 100, Field.TOA, -100, -108, -110, -103, -103, -110, -105, -112, Field.TOA, -107, -118, -94, -104, -98, -99, 110, -113, 64, -116, -127, -103, -113, -107, -108, 64, -115, -127, -114, -127, -121, -123, -110, 64, -127, -108, -108, -127, -125, -120, -123, -124, Field.HTMLCONTROL, 64, -109, -117, -119, -112, -112, -119, -114, -121, 64, -116, -127, -103, -113, -107, -108, -98, -64, -67, -80, -70, -77, -69, 110, -59, -74, -73, -70, -77, 110, -69, -81, -62, -79, -74, -73, -68, -75, 110, -79, -74, -81, -68, -75, -77, -78, 110, -60, -73, -77, -59, 110, -74, -67, -70, -78, -77, -64, -63, 110, -59, -73, -62, -74, 110, -62, -74, -77, 110, -68, -77, -59, -67, -68, -77, -63, 124, 110, -94, -74, -77, 110, -66, -64, -77, 123, -70, -81, -57, -67, -61, -62, 110, -73, -68, -76, -67, -64, -69, -81, -62, -73, -67, -68, 110, -76, -67, -64, 110, -62, -74, -77, 110, -79, -74, -81, -68, -75, -77, 110, -74, -67, -70, -78, -77, -64, 110, -84, -80, 122, -96, -49, -58, -58, -93, -56, -48, -69, -58, -61, -66, -69, -50, -65, -113, -109, Field.ADDRESSBLOCK, -116, -85, -119, -98, -74, -84, -78, -79, -103, -99, 103, -105, -88, -71, -69, -80, -88, -77, -112, -75, -67, -88, -77, -80, -85, -88, -69, -84, -96, -92, 110, -95, -79, -64, -67, -70, -70, -108, -89, -91, -69, -91, -82, -89, -76, -104, -85, -89, -71, -90, -71, -73, -51, -73, -64, -71, -58, -86, -67, -71, -53, 116, -72, -61, -71, -57, 116, -62, -61, -56, 116, -57, -55, -60, -60, -61, -58, -56, 116, -57, -73, -58, -61, -64, -64, -67, -62, -69, 116, -56, -61, 116, -75, -62, 116, -75, -74, -57, -61, -64, -55, -56, -71, 116, -60, -61, -57, -67, -56, -67, -61, -62, -126, 116, -87, -57, -71, 116, -57, -73, -58, -61, -64, -64, -88, -61, -92, -61, -57, -67, -56, -67, -61, -62, 116, -67, -62, -57, -56, -71, -75, -72, -88, -69, -71, -49, -71, -62, -69, -56, -84, -65, -69, -51, 118, -66, -73, -55, 118, -60, -59, 118, -94, -73, -49, -59, -53, -54, -93, -73, -60, -73, -67, -69, -56, -102, -67, -75, 102, -86, -81, -84, -84, -85, -72, -85, -76, -70, 102, -100, -81, -85, -67, -114, -75, -78, -86, -85, -72, -71, 102, -82, -89, -68, -85, 102, -70, -82, -85, 102, -71, -89, -77, -85, 102, -87, -82, -89, -76, -83, -85, 102, -113, -118, 116, 102, -102, -82, -81, -71, 102, -77, -81, -83, -82, -70, 102, -82, -89, -74, -74, -85, -76, 102, -86, -69, -85, 102, -70, -75, 102, -81, -76, -87, -75, -76, -71, -81, -71, -70, -85, -76, -70, 102, -121, -86, -89, -74, -70, -85, -72, 102, -69, -74, -86, -89, -70, -85, 102, -85, -68, -85, -76, -70, -71, 102, -75, -72, 102, -81, -84, 102, -70, -82, -85, 102, -110, -89, -65, -75, -69, -70, -109, -89, -76, -89, -83, -85, -72, 102, -78, -89, -65, -71, 102, -75, -69, -70, 102, -70, -82, -85, 102, -71, -89, -77, -85, 102, -100, -81, -85, -67, 102, -77, -69, -78, -70, -81, -74, -78, -85, 102, -70, -81, -77, -85, -71, 116, 80, 102, -100, -81, -85, -67, -114, -75, -78, -86, -85, -72, 102, 119, Byte.MIN_VALUE, 126, -95, -103, 74, -114, -109, -112, -112, -113, -100, -113, -104, -98, 74, Byte.MIN_VALUE, -109, -113, -95, 114, -103, -106, -114, -113, -100, -99, 74, -110, -117, -96, -113, 74, -98, -110, -113, 74, -99, -117, -105, -113, 74, -99, -98, -117, -116, -106, -113, 74, 115, 110, Field.HYPERLINK, 74, 125, -98, -117, -116, -106, -113, 74, 115, 110, -99, 74, -109, -104, 74, -93, -103, -97, -100, 74, -117, -114, -117, -102, -98, -113, -100, 74, 119, Byte.MAX_VALUE, 125, 126, 74, 108, 111, 74, -97, -104, -109, -101, -97, -113, 74, -117, -104, -114, 74, 125, 114, 121, Byte.MAX_VALUE, 118, 110, 74, 120, 121, 126, 74, -115, -110, -117, -104, -111, -113, Field.HYPERLINK, Field.AUTONUMOUT, 74, Byte.MIN_VALUE, -109, -113, -95, 114, -103, -106, -114, -113, -100, 74, Field.HTMLCONTROL, 100, -102, -83, -87, -69, 100, -111, -109, -109, -107, -93, -93, -103, -110, -103, -100, -103, -92, -87, -44, -39, -30, -43, -45, -28, -39, -33, -34, -112, -35, -27, -29, -28, -112, -46, -43, -112, -47, -46, -29, -33, -36, -27, -28, -43, -98, -112, -30, -43, -45, -43, -39, -26, -43, -44, -86, -14, -16, -1, -44, -1, -16, -8, -38, -15, -15, -2, -16, -1, -2, -51, -52, -95, -58, -57, -54, -62, -76, -57, -61, -43, -97, -46, -46, -65, -63, -58, -61, -62, -78, -51, -75, -57, -52, -62, -51, -43, -78, -79, -122, -85, -84, -81, -89, -103, -84, -88, -70, -121, -88, -73, -92, -90, -85, -88, -89, -119, -75, -78, -80, -102, -84, -79, -89, -78, -70, -102, -103, 114, -112, -97, 110, -109, -108, -105, -113, 111, -99, -116, -94, -108, -103, -110, 122, -99, -113, -112, -99, -72, -73, -110, -73, -67, -82, -69, -84, -82, -71, -67, -99, -72, -66, -84, -79, -114, -65, -82, -73, -67, -16, -30, -15, -48, -32, -17, 
        -20, -23, -23, -26, -21, -28, -47, -20, -14, -32, -27, -48, -23, -20, -19, -91, -90, -73, -99, -33, -34, -31, -99, -34, -17, -28, -14, -22, -30, -21, -15, -99, -32, -20, -21, -16, -15, -34, -21, -15, -99};
    }

    static {
        A0W();
        A1I = new int[]{16843830};
        A1H = new int[]{16842987};
        A1C = Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20;
        A1B = Build.VERSION.SDK_INT >= 23;
        A1D = Build.VERSION.SDK_INT >= 16;
        A1E = Build.VERSION.SDK_INT >= 21;
        A1F = Build.VERSION.SDK_INT <= 15;
        A1G = Build.VERSION.SDK_INT <= 15;
        Class<?> cls = Integer.TYPE;
        A1J = new Class[]{Context.class, AttributeSet.class, cls, cls};
        A1A = new Interpolator() { // from class: com.facebook.ads.redexgen.X.4b
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        };
    }

    public FL(Context context) {
        this(context, null);
    }

    public FL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FL(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.A11 = new C1366aj(this);
        this.A0r = new C05554w(this);
        this.A0t = new C5E();
        this.A0u = new Runnable() { // from class: com.facebook.ads.redexgen.X.4Z
            public static String[] A01 = {"awShR6rB9hHqIMmEUL0mwXA0Gw52kO", "0DSPYtvGuEhIQI6AF9KMD", "9DdmIjaq0QhBq1nPNAcV72ZM8h0mgj2M", "HfTiJ4VVSMi3nAZk7bTv9mblSiAuey3", "debYtkaMAwIZQZjx6lxSS", "4WrPcoFjyZ6X9UuQXP", "Cz1Bv0fV", "irRdqOAQiRC5NgL3TGbl1LssmB7DQYK"};

            @Override // java.lang.Runnable
            public final void run() {
                if (FL.this.A0D) {
                    FL fl2 = FL.this;
                    String[] strArr = A01;
                    if (strArr[7].length() != strArr[3].length()) {
                        throw new RuntimeException();
                    }
                    A01[2] = "whIRPRaeSzbq6WxYyrgvwj4itopbsVJt";
                    if (fl2.isLayoutRequested()) {
                        return;
                    }
                    if (!FL.this.A0F) {
                        FL.this.requestLayout();
                    } else if (FL.this.A0I) {
                        FL.this.A0J = true;
                    } else {
                        FL.this.A1I();
                    }
                }
            }
        };
        this.A0p = new Rect();
        this.A0z = new Rect();
        this.A0q = new RectF();
        this.A0v = new ArrayList<>();
        this.A13 = new ArrayList<>();
        this.A0O = 0;
        this.A0C = false;
        this.A0U = 0;
        this.A0N = 0;
        this.A05 = new FT();
        this.A0W = 0;
        this.A0V = -1;
        this.A0L = Float.MIN_VALUE;
        this.A0M = Float.MIN_VALUE;
        this.A0o = true;
        this.A08 = new AnonymousClass55(this);
        this.A02 = A1E ? new C1377au() : null;
        this.A0s = new AnonymousClass53();
        this.A0G = false;
        this.A0H = false;
        this.A0f = new C1369am(this);
        this.A0K = false;
        this.A14 = new int[2];
        this.A17 = new int[2];
        this.A16 = new int[2];
        this.A15 = new int[2];
        this.A0w = new ArrayList();
        this.A0k = new Runnable() { // from class: com.facebook.ads.redexgen.X.4a
            @Override // java.lang.Runnable
            public final void run() {
                if (FL.this.A05 != null) {
                    FL.this.A05.A0J();
                }
                FL.this.A0K = false;
            }
        };
        this.A12 = new C1372ap(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1H, i10, 0);
            this.A0B = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.A0B = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0X = viewConfiguration.getScaledTouchSlop();
        this.A0L = C3U.A00(viewConfiguration, context);
        this.A0M = C3U.A01(viewConfiguration, context);
        this.A0y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0x = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.A05.A0B(this.A0f);
        A0e();
        A0O();
        if (C3T.A00(this) == 0) {
            C3T.A09(this, 1);
        }
        this.A10 = (AccessibilityManager) getContext().getSystemService(A0I(1831, 13, 21));
        setAccessibilityDelegateCompat(new C1364ag(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    private int A0B(View view) {
        int id2 = view.getId();
        while (true) {
            boolean isFocused = view.isFocused();
            String[] strArr = A19;
            String str = strArr[0];
            String str2 = strArr[6];
            int charAt = str.charAt(14);
            int lastKnownId = str2.charAt(14);
            if (charAt == lastKnownId) {
                throw new RuntimeException();
            }
            A19[1] = "skNAKCm7G9cheB5S1YDp1BKl7DhhyUWu";
            if (isFocused || !(view instanceof ViewGroup) || !view.hasFocus()) {
                break;
            }
            view = ((ViewGroup) view).getFocusedChild();
            int id3 = view.getId();
            if (id3 != -1) {
                id2 = view.getId();
            }
        }
    }

    private final long A0C(AnonymousClass56 anonymousClass56) {
        return this.A04.A0A() ? anonymousClass56.A0K() : anonymousClass56.A03;
    }

    private View A0D() {
        AnonymousClass56 A1F2;
        int i10 = this.A0s.A01 != -1 ? this.A0s.A01 : 0;
        int A03 = this.A0s.A03();
        if (A19[1].charAt(14) != '5') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[0] = "7qfeZgEkVtoAThUnrGXSh94SPjREp60d";
        strArr[6] = "LKFRBKGk6g3UCUNb2omEsqPfgI9kqX1N";
        for (int startFocusSearchIndex = i10; startFocusSearchIndex < A03; startFocusSearchIndex++) {
            AnonymousClass56 A1F3 = A1F(startFocusSearchIndex);
            if (A1F3 == null) {
                break;
            } else if (A1F3.A0H.hasFocusable()) {
                return A1F3.A0H;
            }
        }
        int startFocusSearchIndex2 = Math.min(A03, i10);
        for (int limit = startFocusSearchIndex2 - 1; limit >= 0 && (A1F2 = A1F(limit)) != null; limit--) {
            if (A1F2.A0H.hasFocusable()) {
                return A1F2.A0H;
            }
        }
        return null;
    }

    private final AnonymousClass56 A0E(long j10) {
        if (this.A04 == null || !this.A04.A0A()) {
            return null;
        }
        int A06 = this.A01.A06();
        AnonymousClass56 anonymousClass56 = null;
        for (int i10 = 0; i10 < A06; i10++) {
            AnonymousClass56 holder = A0F(this.A01.A0A(i10));
            if (holder != null && !holder.A0a()) {
                int childCount = (holder.A0K() > j10 ? 1 : (holder.A0K() == j10 ? 0 : -1));
                if (childCount != 0) {
                    continue;
                } else if (this.A01.A0K(holder.A0H)) {
                    anonymousClass56 = holder;
                } else {
                    return holder;
                }
            }
        }
        return anonymousClass56;
    }

    public static AnonymousClass56 A0F(View view) {
        if (view == null) {
            return null;
        }
        return ((C05494p) view.getLayoutParams()).A00;
    }

    private final AnonymousClass56 A0G(View view) {
        View itemView = A1E(view);
        if (itemView == null) {
            return null;
        }
        return A1G(itemView);
    }

    private void A0J() {
        A0T();
        setScrollState(0);
    }

    private void A0K() {
        int i10 = this.A0P;
        this.A0P = 0;
        if (i10 != 0 && A1o()) {
            AccessibilityEvent event = AccessibilityEvent.obtain();
            event.setEventType(2048);
            AbstractC05213m.A01(event, i10);
            sendAccessibilityEventUnchecked(event);
        }
    }

    private void A0L() {
        boolean z10 = true;
        this.A0s.A04(1);
        A1h(this.A0s);
        this.A0s.A0A = false;
        A1J();
        this.A0t.A06();
        A1K();
        A0P();
        A0U();
        this.A0s.A0E = (this.A0s.A0C && this.A0H) ? false : false;
        this.A0H = false;
        this.A0G = false;
        this.A0s.A09 = this.A0s.A0B;
        this.A0s.A03 = this.A04.A0E();
        A0x(this.A14);
        if (this.A0s.A0C) {
            int A05 = this.A01.A05();
            for (int i10 = 0; i10 < A05; i10++) {
                AnonymousClass56 holder = A0F(this.A01.A09(i10));
                if (!holder.A0f() && (!holder.A0Z() || this.A04.A0A())) {
                    AbstractC05444k abstractC05444k = this.A05;
                    AnonymousClass53 anonymousClass53 = this.A0s;
                    int i11 = AbstractC05444k.A00(holder);
                    this.A0t.A0F(holder, abstractC05444k.A09(anonymousClass53, holder, i11, holder.A0L()));
                    if (this.A0s.A0E && holder.A0d() && !holder.A0a() && !holder.A0f() && !holder.A0Z()) {
                        this.A0t.A08(A0C(holder), holder);
                    }
                }
            }
        }
        if (this.A0s.A0B) {
            A0i();
            boolean z11 = this.A0s.A0D;
            this.A0s.A0D = false;
            this.A06.A1u(this.A0r, this.A0s);
            this.A0s.A0D = z11;
            for (int i12 = 0; i12 < this.A01.A05(); i12++) {
                AnonymousClass56 A0F = A0F(this.A01.A09(i12));
                boolean didStructureChange = A0F.A0f();
                if (!didStructureChange) {
                    boolean didStructureChange2 = this.A0t.A0I(A0F);
                    if (!didStructureChange2) {
                        int A00 = AbstractC05444k.A00(A0F);
                        boolean A0i = A0F.A0i(8192);
                        if (!A0i) {
                            A00 |= 4096;
                        }
                        C05434j A09 = this.A05.A09(this.A0s, A0F, A00, A0F.A0L());
                        if (A0i) {
                            A1i(A0F, A09);
                        } else {
                            this.A0t.A0D(A0F, A09);
                        }
                    }
                }
            }
            A0X();
        } else {
            A0X();
        }
        A1L();
        A1n(false);
        this.A0s.A04 = 2;
    }

    private void A0M() {
        A1J();
        A1K();
        this.A0s.A04(6);
        this.A00.A07();
        this.A0s.A03 = this.A04.A0E();
        this.A0s.A00 = 0;
        this.A0s.A09 = false;
        this.A06.A1u(this.A0r, this.A0s);
        this.A0s.A0D = false;
        this.A0j = null;
        this.A0s.A0C = this.A0s.A0C && this.A05 != null;
        this.A0s.A04 = 4;
        A1L();
        A1n(false);
    }

    private void A0O() {
        this.A01 = new C4C(new C1371ao(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (r0 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0P() {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FL.A0P():void");
    }

    private void A0Q() {
        View viewToFocus;
        if (this.A0o && this.A04 != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() == 131072 && isFocused()) {
                return;
            }
            if (!isFocused()) {
                View focusedChild = getFocusedChild();
                if (A1G && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                    if (this.A01.A05() == 0) {
                        requestFocus();
                        return;
                    }
                } else if (!this.A01.A0K(focusedChild)) {
                    return;
                }
            }
            AnonymousClass56 anonymousClass56 = null;
            long j10 = this.A0s.A08;
            String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            A19[1] = "kf1DBtA0T6eQEv5OJ0aXYpUf8VxTHKxU";
            if (j10 != -1 && this.A04.A0A()) {
                anonymousClass56 = A0E(this.A0s.A08);
            }
            View view = null;
            if (anonymousClass56 == null || this.A01.A0K(anonymousClass56.A0H) || !anonymousClass56.A0H.hasFocusable()) {
                if (this.A01.A05() > 0) {
                    view = A0D();
                }
            } else {
                view = anonymousClass56.A0H;
            }
            if (view != null) {
                if (this.A0s.A02 != -1 && (viewToFocus = view.findViewById(this.A0s.A02)) != null && viewToFocus.isFocusable()) {
                    view = viewToFocus;
                }
                view.requestFocus();
            }
        }
    }

    private void A0R() {
        boolean z10 = false;
        if (this.A0a != null) {
            this.A0a.onRelease();
            z10 = this.A0a.isFinished();
        }
        if (this.A0c != null) {
            this.A0c.onRelease();
            boolean needsInvalidate = this.A0c.isFinished();
            z10 |= needsInvalidate;
        }
        if (this.A0b != null) {
            this.A0b.onRelease();
            boolean needsInvalidate2 = this.A0b.isFinished();
            z10 |= needsInvalidate2;
        }
        EdgeEffect edgeEffect = this.A0Z;
        if (A19[1].charAt(14) != '5') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[4] = "DUYzAwLS0Yoz3H0mkub2uXfjKU6irrBR";
        strArr[5] = "haWSXRvp1CmnNAQfK1MdvfBgKkr4J9QQ";
        if (edgeEffect != null) {
            this.A0Z.onRelease();
            boolean needsInvalidate3 = this.A0Z.isFinished();
            z10 |= needsInvalidate3;
        }
        if (z10) {
            C3T.A07(this);
        }
    }

    private void A0S() {
        this.A0s.A08 = -1L;
        this.A0s.A01 = -1;
        this.A0s.A02 = -1;
    }

    private void A0T() {
        if (this.A0Y != null) {
            this.A0Y.clear();
        }
        A1X(0);
        A0R();
    }

    private void A0U() {
        int A0G;
        View view = null;
        if (this.A0o && hasFocus()) {
            AbstractC05364c abstractC05364c = this.A04;
            String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            A19[7] = "5";
            if (abstractC05364c != null) {
                view = getFocusedChild();
            }
        }
        AnonymousClass56 A0G2 = view == null ? null : A0G(view);
        if (A0G2 == null) {
            A0S();
            return;
        }
        this.A0s.A08 = this.A04.A0A() ? A0G2.A0K() : -1L;
        AnonymousClass53 anonymousClass53 = this.A0s;
        if (this.A0C) {
            A0G = -1;
        } else {
            A0G = A0G2.A0a() ? A0G2.A01 : A0G2.A0G();
        }
        anonymousClass53.A01 = A0G;
        AnonymousClass53 anonymousClass532 = this.A0s;
        View child = A0G2.A0H;
        anonymousClass532.A02 = A0B(child);
    }

    private void A0V() {
        this.A08.A08();
        if (this.A06 != null) {
            this.A06.A0x();
        }
    }

    private final void A0X() {
        int A06 = this.A01.A06();
        for (int i10 = 0; i10 < A06; i10++) {
            AnonymousClass56 A0F = A0F(this.A01.A0A(i10));
            if (!A0F.A0f()) {
                A0F.A0M();
            }
        }
        this.A0r.A0K();
    }

    private final void A0Y() {
        AbstractC05364c abstractC05364c = this.A04;
        String A0I = A0I(1370, 12, 39);
        if (abstractC05364c == null) {
            Log.e(A0I, A0I(1123, 36, 14));
        } else if (this.A06 == null) {
            Log.e(A0I, A0I(1159, 43, 5));
        } else {
            this.A0s.A0A = false;
            if (this.A0s.A04 == 1) {
                A0L();
                this.A06.A1O(this);
                A0M();
            } else if (this.A00.A0C() || this.A06.A0h() != getWidth() || this.A06.A0X() != getHeight()) {
                this.A06.A1O(this);
                A0M();
            } else {
                this.A06.A1O(this);
            }
            A0N();
        }
    }

    private final void A0Z() {
        int state;
        for (int size = this.A0w.size() - 1; size >= 0; size--) {
            AnonymousClass56 anonymousClass56 = this.A0w.get(size);
            if (anonymousClass56.A0H.getParent() == this && !anonymousClass56.A0f() && (state = anonymousClass56.A02) != -1) {
                C3T.A09(anonymousClass56.A0H, state);
                anonymousClass56.A02 = -1;
            }
        }
        this.A0w.clear();
    }

    private final void A0a() {
        if (this.A0Z != null) {
            return;
        }
        this.A0Z = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0Z.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            this.A0Z.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    private final void A0b() {
        if (this.A0a != null) {
            return;
        }
        this.A0a = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            this.A0a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    private final void A0c() {
        if (this.A0b != null) {
            return;
        }
        this.A0b = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0b.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            return;
        }
        EdgeEffect edgeEffect = this.A0b;
        int measuredHeight = getMeasuredHeight();
        if (A19[7].length() != 1) {
            throw new RuntimeException();
        }
        A19[1] = "cbkJKTW5fmkF4V5GELAthVoRFDIiLVou";
        edgeEffect.setSize(measuredHeight, getMeasuredWidth());
    }

    private final void A0d() {
        if (this.A0c != null) {
            return;
        }
        this.A0c = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0c.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        EdgeEffect edgeEffect = this.A0c;
        int measuredWidth = getMeasuredWidth();
        if (A19[7].length() != 1) {
            throw new RuntimeException();
        }
        A19[7] = OperatorName.NON_STROKING_GRAY;
        edgeEffect.setSize(measuredWidth, getMeasuredHeight());
    }

    private final void A0e() {
        this.A00 = new C1378av(new C1370an(this));
    }

    private final void A0f() {
        this.A0Z = null;
        this.A0c = null;
        this.A0b = null;
        this.A0a = null;
    }

    private final void A0g() {
        int A06 = this.A01.A06();
        for (int i10 = 0; i10 < A06; i10++) {
            ((C05494p) this.A01.A0A(i10).getLayoutParams()).A01 = true;
        }
        this.A0r.A0M();
    }

    private final void A0h() {
        int A06 = this.A01.A06();
        for (int i10 = 0; i10 < A06; i10++) {
            AnonymousClass56 A0F = A0F(this.A01.A0A(i10));
            if (A0F != null && !A0F.A0f()) {
                A0F.A0T(6);
            }
        }
        A0g();
        this.A0r.A0N();
    }

    private final void A0i() {
        int A06 = this.A01.A06();
        for (int i10 = 0; i10 < A06; i10++) {
            AnonymousClass56 A0F = A0F(this.A01.A0A(i10));
            if (!A0F.A0f()) {
                A0F.A0R();
            }
        }
    }

    private void A0j(float f10, float f11, float f12, float f13) {
        boolean z10 = false;
        if (f11 < 0.0f) {
            A0b();
            AnonymousClass43.A00(this.A0a, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
            z10 = true;
        } else if (f11 > 0.0f) {
            A0c();
            AnonymousClass43.A00(this.A0b, f11 / getWidth(), f12 / getHeight());
            z10 = true;
        }
        if (f13 < 0.0f) {
            A0d();
            AnonymousClass43.A00(this.A0c, (-f13) / getHeight(), f10 / getWidth());
            z10 = true;
        } else if (f13 > 0.0f) {
            A0a();
            AnonymousClass43.A00(this.A0Z, f13 / getHeight(), 1.0f - (f10 / getWidth()));
            z10 = true;
        }
        if (!z10 && f11 == 0.0f) {
            int i10 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
            if (A19[7].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[0] = "SiLEOgLe53s9c6khchOb02AHEH0FRuha";
            strArr[6] = "5HcivrXWoCNvsp5G28hhclxyRqnGBHgf";
            if (i10 == 0) {
                return;
            }
        }
        C3T.A07(this);
    }

    private final void A0k(int i10) {
        AbstractC05484o abstractC05484o = this.A06;
        if (this.A0i != null) {
            this.A0i.A0L(this, i10);
        }
        if (this.A0m != null) {
            for (int size = this.A0m.size() - 1; size >= 0; size--) {
                this.A0m.get(size).A0L(this, i10);
                String[] strArr = A19;
                String str = strArr[3];
                String str2 = strArr[2];
                int charAt = str.charAt(2);
                int i11 = str2.charAt(2);
                if (charAt == i11) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A19;
                strArr2[4] = "wNO3zluUeYau1J5tWYXYTZjLKyZssSra";
                strArr2[5] = "exw9q3ETOdRCiu35xcNaFWLlKD0n1alI";
            }
        }
    }

    private final void A0l(int i10, int i11, Interpolator interpolator) {
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(924, 97, 119));
        } else if (this.A0I) {
        } else {
            if (!this.A06.A20()) {
                i10 = 0;
            }
            boolean A21 = this.A06.A21();
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            A19[1] = "Tqmtltgb2GXtzJ5pgFbL4REJzj4lGX6R";
            if (!A21) {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                this.A08.A0D(i10, i11, interpolator);
            }
        }
    }

    private void A0m(long j10, AnonymousClass56 anonymousClass56, AnonymousClass56 anonymousClass562) {
        int A05 = this.A01.A05();
        for (int i10 = 0; i10 < A05; i10++) {
            AnonymousClass56 other = A0F(this.A01.A09(i10));
            if (other != anonymousClass56) {
                int childCount = (A0C(other) > j10 ? 1 : (A0C(other) == j10 ? 0 : -1));
                if (childCount == 0) {
                    AbstractC05364c abstractC05364c = this.A04;
                    String[] strArr = A19;
                    String str = strArr[0];
                    String str2 = strArr[6];
                    int i11 = str.charAt(14);
                    int childCount2 = str2.charAt(14);
                    if (i11 == childCount2) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A19;
                    strArr2[3] = "juwPw4JUkqCkrA4IuHnNpcgybF39inA5";
                    strArr2[2] = "0NBeszRVzWCIaFL2RR4GryyHu33afAAx";
                    String A0I = A0I(1, 17, 9);
                    if (abstractC05364c != null && this.A04.A0A()) {
                        throw new IllegalStateException(A0I(1696, ShapeTypes.DOUBLE_WAVE, 15) + other + A0I + anonymousClass56 + A1H());
                    }
                    throw new IllegalStateException(A0I(1508, 188, 43) + other + A0I + anonymousClass56 + A1H());
                }
            }
        }
        Log.e(A0I(1370, 12, 39), A0I(1202, 111, 51) + anonymousClass562 + A0I(18, 41, 117) + anonymousClass56 + A1H());
    }

    private void A0n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int actionIndex2 = this.A0V;
        if (pointerId != actionIndex2) {
            return;
        }
        int i10 = actionIndex == 0 ? 1 : 0;
        int actionIndex3 = motionEvent.getPointerId(i10);
        this.A0V = actionIndex3;
        int actionIndex4 = (int) (motionEvent.getX(i10) + 0.5f);
        this.A0S = actionIndex4;
        this.A0Q = actionIndex4;
        int actionIndex5 = (int) (motionEvent.getY(i10) + 0.5f);
        this.A0T = actionIndex5;
        this.A0R = actionIndex5;
    }

    public static void A0o(View view, Rect rect) {
        C05494p c05494p = (C05494p) view.getLayoutParams();
        Rect rect2 = c05494p.A03;
        rect.set((view.getLeft() - rect2.left) - c05494p.leftMargin, (view.getTop() - rect2.top) - c05494p.topMargin, view.getRight() + rect2.right + c05494p.rightMargin, view.getBottom() + rect2.bottom + c05494p.bottomMargin);
    }

    private void A0p(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.A0p.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C05494p) {
            if (A19[7].length() != 1) {
                throw new RuntimeException();
            }
            A19[1] = "MS6MXnJil8kPq55ThMmX90CfGz9dq6Ir";
            C05494p c05494p = (C05494p) layoutParams;
            if (!c05494p.A01) {
                Rect insets = c05494p.A03;
                this.A0p.left -= insets.left;
                this.A0p.right += insets.right;
                this.A0p.top -= insets.top;
                this.A0p.bottom += insets.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.A0p);
            offsetRectIntoDescendantCoords(view, this.A0p);
        }
        this.A06.A1a(this, view, this.A0p, !this.A0D, view2 == null);
    }

    private void A0q(AbstractC05364c abstractC05364c, boolean z10, boolean z11) {
        if (this.A04 != null) {
            this.A04.A08(this.A11);
        }
        if (!z10 || z11) {
            A1N();
        }
        this.A00.A09();
        AbstractC05364c abstractC05364c2 = this.A04;
        this.A04 = abstractC05364c;
        if (abstractC05364c != null) {
            abstractC05364c.A07(this.A11);
        }
        AbstractC05484o abstractC05484o = this.A06;
        C05554w c05554w = this.A0r;
        AbstractC05364c oldAdapter = this.A04;
        c05554w.A0U(abstractC05364c2, oldAdapter, z10);
        this.A0s.A0D = true;
        A1P();
    }

    private void A0r(AnonymousClass56 anonymousClass56) {
        View view = anonymousClass56.A0H;
        boolean z10 = view.getParent() == this;
        this.A0r.A0Y(A1G(view));
        boolean A0c = anonymousClass56.A0c();
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[3] = "TiCmVlWwgQ6VOJfmkNnlNNx0y9AVJwa2";
        strArr2[2] = "F9jx2AB6s4oeG4sqKvJHQ7CgJaKOJBvs";
        if (A0c) {
            this.A01.A0H(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.A01.A0J(view, true);
        } else {
            this.A01.A0E(view);
        }
    }

    public static void A0s(AnonymousClass56 anonymousClass56) {
        if (anonymousClass56.A09 != null) {
            FL fl2 = anonymousClass56.A09.get();
            while (fl2 != null) {
                View item = anonymousClass56.A0H;
                if (fl2 == item) {
                    return;
                }
                ViewParent parent = fl2.getParent();
                if (parent instanceof View) {
                    fl2 = (View) parent;
                } else {
                    fl2 = null;
                }
            }
            anonymousClass56.A09 = null;
        }
    }

    private void A0t(AnonymousClass56 anonymousClass56, AnonymousClass56 anonymousClass562, C05434j c05434j, C05434j c05434j2, boolean z10, boolean z11) {
        anonymousClass56.A0X(false);
        if (z10) {
            A0r(anonymousClass56);
        }
        if (anonymousClass56 != anonymousClass562) {
            if (z11) {
                A0r(anonymousClass562);
            }
            anonymousClass56.A06 = anonymousClass562;
            A0r(anonymousClass56);
            this.A0r.A0Y(anonymousClass56);
            anonymousClass562.A0X(false);
            anonymousClass562.A07 = anonymousClass56;
        }
        if (this.A05.A0H(anonymousClass56, anonymousClass562, c05434j, c05434j2)) {
            A1M();
        }
    }

    private void A0x(int[] iArr) {
        int A05 = this.A01.A05();
        if (A05 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int maxPositionPreLayout = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int minPositionPreLayout = SlideAtom.USES_MASTER_SLIDE_ID;
        for (int i10 = 0; i10 < A05; i10++) {
            AnonymousClass56 A0F = A0F(this.A01.A09(i10));
            if (!A0F.A0f()) {
                int count = A0F.A0I();
                if (count < maxPositionPreLayout) {
                    maxPositionPreLayout = count;
                }
                if (count > minPositionPreLayout) {
                    minPositionPreLayout = count;
                }
            }
        }
        iArr[0] = maxPositionPreLayout;
        iArr[1] = minPositionPreLayout;
    }

    private boolean A0y() {
        int A05 = this.A01.A05();
        for (int i10 = 0; i10 < A05; i10++) {
            AnonymousClass56 A0F = A0F(this.A01.A09(i10));
            if (A0F != null && !A0F.A0f()) {
                boolean A0d = A0F.A0d();
                int i11 = A19[7].length();
                if (i11 != 1) {
                    throw new RuntimeException();
                }
                A19[1] = "5mbkKWt0hxhFdp5kkkYwhOUPEf80vh4b";
                if (A0d) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean A0z() {
        return this.A05 != null && this.A06.A22();
    }

    private boolean A11(int i10, int i11) {
        A0x(this.A14);
        return (this.A14[0] == i10 && this.A14[1] == i11) ? false : true;
    }

    private final boolean A12(int i10, int i11) {
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(651, 89, 110));
            return false;
        } else if (this.A0I) {
            return false;
        } else {
            boolean A20 = this.A06.A20();
            boolean canScroll = this.A06.A21();
            i10 = (!A20 || Math.abs(i10) < this.A0y) ? 0 : 0;
            i11 = (!canScroll || Math.abs(i11) < this.A0y) ? 0 : 0;
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            float f10 = i10;
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "ReiKJWWZUipUJIZKdTnth4O85KfdJzFe";
            strArr2[2] = "VE75UicjWgpvWTg6gZrF4R3BQlGAuEv7";
            boolean canScrollHorizontal = dispatchNestedPreFling(f10, i11);
            if (!canScrollHorizontal) {
                boolean canScrollVertical = A20 || canScroll;
                dispatchNestedFling(i10, i11, canScrollVertical);
                if (this.A0g != null) {
                    boolean canScrollHorizontal2 = this.A0g.A0B(i10, i11);
                    if (canScrollHorizontal2) {
                        return true;
                    }
                }
                if (canScrollVertical) {
                    int i12 = 0;
                    if (A20) {
                        i12 = 0 | 1;
                    }
                    if (canScroll) {
                        i12 |= 2;
                    }
                    A1s(i12, 1);
                    int nestedScrollAxis = -this.A0x;
                    int max = Math.max(nestedScrollAxis, Math.min(i10, this.A0x));
                    int nestedScrollAxis2 = -this.A0x;
                    this.A08.A09(max, Math.max(nestedScrollAxis2, Math.min(i11, this.A0x)));
                    return true;
                }
            }
            return false;
        }
    }

    private final boolean A13(int consumedX, int consumedY, MotionEvent motionEvent) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        A1I();
        if (this.A04 != null) {
            A1J();
            A1K();
            AbstractC04992q.A01(A0I(Constants.CP_JOHAB, 9, 51));
            A1h(this.A0s);
            if (consumedX != 0) {
                i12 = this.A06.A1d(consumedX, this.A0r, this.A0s);
                i10 = consumedX - i12;
            }
            if (consumedY != 0) {
                i13 = this.A06.A1e(consumedY, this.A0r, this.A0s);
                i11 = consumedY - i13;
            }
            AbstractC04992q.A00();
            A1O();
            A1L();
            A1n(false);
        }
        if (!this.A0v.isEmpty()) {
            invalidate();
        }
        if (A1t(i12, i13, i10, i11, this.A17, 0)) {
            this.A0S -= this.A17[0];
            this.A0T -= this.A17[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation(this.A17[0], this.A17[1]);
            }
            int[] iArr = this.A15;
            iArr[0] = iArr[0] + this.A17[0];
            int[] iArr2 = this.A15;
            iArr2[1] = iArr2[1] + this.A17[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AnonymousClass39.A00(motionEvent, 8194)) {
                A0j(motionEvent.getX(), i10, motionEvent.getY(), i11);
            }
            A1Z(consumedX, consumedY);
        }
        if (i12 != 0 || i13 != 0) {
            A1b(i12, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i12 == 0 && i13 == 0) ? false : true;
    }

    private boolean A14(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (0 != 0) {
            if (action == 0) {
                this.A0h = null;
            } else {
                if (action == 3 || action == 1) {
                    this.A0h = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int action2 = this.A13.size();
            if (0 < action2) {
                this.A13.get(0);
                throw new NullPointerException(A0I(1973, 21, 46));
            }
            return false;
        }
        return false;
    }

    private boolean A15(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.A0h = null;
        }
        int action2 = this.A13.size();
        if (0 < action2) {
            this.A13.get(0);
            throw new NullPointerException(A0I(1973, 21, 46));
        }
        return false;
    }

    private boolean A16(View view, View view2, int i10) {
        int absHorizontal;
        if (view2 == null || view2 == this) {
            return false;
        }
        if (view == null) {
            return true;
        }
        if (i10 == 2 || i10 == 1) {
            boolean absHorizontal2 = this.A06.A0a() == 1;
            boolean rtl = i10 == 2;
            if (rtl ^ absHorizontal2) {
                absHorizontal = 66;
            } else {
                absHorizontal = 17;
            }
            if (A17(view, view2, absHorizontal)) {
                return true;
            }
            if (i10 == 2) {
                return A17(view, view2, ShapeTypes.DOUBLE_WAVE);
            }
            String[] strArr = A19;
            String str = strArr[0];
            String str2 = strArr[6];
            int charAt = str.charAt(14);
            int absHorizontal3 = str2.charAt(14);
            if (charAt != absHorizontal3) {
                String[] strArr2 = A19;
                strArr2[3] = "Ohwc1756uTT166t9FAn6vugoi7AJfc0c";
                strArr2[2] = "5J1fVRqaKzeN2XjLKxMOi2uJr88KN7aK";
                return A17(view, view2, 33);
            }
            throw new RuntimeException();
        }
        return A17(view, view2, i10);
    }

    private boolean A17(View view, View view2, int i10) {
        this.A0p.set(0, 0, view.getWidth(), view.getHeight());
        this.A0z.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.A0p);
        offsetDescendantRectToMyCoords(view2, this.A0z);
        switch (i10) {
            case 17:
                return (this.A0p.right > this.A0z.right || this.A0p.left >= this.A0z.right) && this.A0p.left > this.A0z.left;
            case 33:
                return (this.A0p.bottom > this.A0z.bottom || this.A0p.top >= this.A0z.bottom) && this.A0p.top > this.A0z.top;
            case 66:
                return (this.A0p.left < this.A0z.left || this.A0p.right <= this.A0z.left) && this.A0p.right < this.A0z.right;
            case ShapeTypes.DOUBLE_WAVE /* 130 */:
                if (this.A0p.top >= this.A0z.top) {
                    Rect rect = this.A0p;
                    String[] strArr = A19;
                    if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A19;
                    strArr2[0] = "mOrDrwN7qo6GKKMJ6G3US4mLdoh2ETut";
                    strArr2[6] = "IWP4ZqDDS1db9pl2oaFrT53kmkniKDfl";
                    if (rect.bottom > this.A0z.top) {
                        return false;
                    }
                }
                return this.A0p.bottom < this.A0z.bottom;
            default:
                throw new IllegalArgumentException(A0I(1844, 37, 85) + i10 + A1H());
        }
    }

    private final boolean A18(AccessibilityEvent accessibilityEvent) {
        if (A1q()) {
            int i10 = 0;
            if (accessibilityEvent != null) {
                i10 = AbstractC05213m.A00(accessibilityEvent);
            }
            if (i10 == 0) {
                i10 = 0;
            }
            int type = this.A0P;
            this.A0P = type | i10;
            return true;
        }
        return false;
    }

    public final int A1B(View view) {
        AnonymousClass56 holder = A0F(view);
        if (holder != null) {
            return holder.A0I();
        }
        return -1;
    }

    public final int A1C(AnonymousClass56 anonymousClass56) {
        if (anonymousClass56.A0i(524) || !anonymousClass56.A0Y()) {
            return -1;
        }
        return this.A00.A05(anonymousClass56.A03);
    }

    public final Rect A1D(View view) {
        C05494p c05494p = (C05494p) view.getLayoutParams();
        if (!c05494p.A01) {
            return c05494p.A03;
        }
        if (this.A0s.A07()) {
            boolean A01 = c05494p.A01();
            if (A19[7].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[0] = "RfoZAoElzPqJKaUzlOfJ9JNtEQb3r4Q3";
            strArr[6] = "IQCpaJiMXE8HuUJ13qJ8cPkLmMUIWIfQ";
            if (A01 || c05494p.A03()) {
                return c05494p.A03;
            }
        }
        Rect rect = c05494p.A03;
        rect.set(0, 0, 0, 0);
        if (0 < this.A0v.size()) {
            this.A0p.set(0, 0, 0, 0);
            this.A0v.get(0);
            throw new NullPointerException(A0I(1881, 14, 112));
        }
        c05494p.A01 = false;
        return rect;
    }

    public final View A1E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this) {
            boolean z10 = parent instanceof View;
            if (A19[7].length() == 1) {
                String[] strArr = A19;
                strArr[3] = "J9ctOc3byknHaiu8XEstSyzOEyaFCb7S";
                strArr[2] = "QOdc34hkOqsfpHVshThNFi46vThKtwkT";
                if (!z10) {
                    break;
                }
                view = (View) parent;
                parent = view.getParent();
            } else {
                throw new RuntimeException();
            }
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final AnonymousClass56 A1F(int i10) {
        if (this.A0C) {
            return null;
        }
        int A06 = this.A01.A06();
        AnonymousClass56 hidden = null;
        for (int i11 = 0; i11 < A06; i11++) {
            AnonymousClass56 A0F = A0F(this.A01.A0A(i11));
            if (A0F != null && !A0F.A0a()) {
                int childCount = A1C(A0F);
                if (childCount != i10) {
                    continue;
                } else if (this.A01.A0K(A0F.A0H)) {
                    hidden = A0F;
                } else {
                    return A0F;
                }
            }
        }
        return hidden;
    }

    public final AnonymousClass56 A1G(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return A0F(view);
        }
        throw new IllegalArgumentException(A0I(1826, 5, 41) + view + A0I(98, 26, 38) + this);
    }

    public final String A1H() {
        return A0I(0, 1, 23) + super.toString() + A0I(ShapeTypes.ACTION_BUTTON_RETURN, 10, 87) + this.A04 + A0I(189, 9, 86) + this.A06 + A0I(ShapeTypes.MATH_DIVIDE, 10, 119) + getContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
        if (r3 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
        A0Y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
        if (r3 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
        r5.A00.A06();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1I() {
        /*
            r5 = this;
            boolean r3 = r5.A0D
            r2 = 1313(0x521, float:1.84E-42)
            r1 = 17
            r0 = 63
            java.lang.String r4 = A0I(r2, r1, r0)
            if (r3 == 0) goto L12
            boolean r0 = r5.A0C
            if (r0 == 0) goto L1c
        L12:
            com.facebook.ads.redexgen.X.AbstractC04992q.A01(r4)
            r5.A0Y()
            com.facebook.ads.redexgen.X.AbstractC04992q.A00()
            return
        L1c:
            com.facebook.ads.redexgen.X.av r0 = r5.A00
            boolean r0 = r0.A0B()
            if (r0 != 0) goto L25
            return
        L25:
            com.facebook.ads.redexgen.X.av r3 = r5.A00
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FL.A19
            r0 = 0
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 14
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La2
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FL.A19
            java.lang.String r1 = "cmOs2ngvAj3urs5G14jP2yS9Pox4PNUI"
            r0 = 1
            r2[r0] = r1
            r0 = 4
            boolean r0 = r3.A0D(r0)
            if (r0 == 0) goto Lb1
            com.facebook.ads.redexgen.X.av r1 = r5.A00
            r0 = 11
            boolean r0 = r1.A0D(r0)
            if (r0 != 0) goto Lb1
            r2 = 1341(0x53d, float:1.879E-42)
            r1 = 20
            r0 = 44
            java.lang.String r0 = A0I(r2, r1, r0)
            com.facebook.ads.redexgen.X.AbstractC04992q.A01(r0)
            r5.A1J()
            r5.A1K()
            com.facebook.ads.redexgen.X.av r0 = r5.A00
            r0.A08()
            boolean r0 = r5.A0J
            if (r0 != 0) goto L92
            boolean r3 = r5.A0y()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FL.A19
            r0 = 3
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 2
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La8
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FL.A19
            java.lang.String r1 = "a"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto Lab
        L8f:
            r5.A0Y()
        L92:
            r0 = 1
            r5.A1n(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.FL.A19
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto Lc3
        La2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        La8:
            if (r3 == 0) goto Lab
            goto L8f
        Lab:
            com.facebook.ads.redexgen.X.av r0 = r5.A00
            r0.A06()
            goto L92
        Lb1:
            com.facebook.ads.redexgen.X.av r0 = r5.A00
            boolean r0 = r0.A0B()
            if (r0 == 0) goto Ld5
            com.facebook.ads.redexgen.X.AbstractC04992q.A01(r4)
            r5.A0Y()
            com.facebook.ads.redexgen.X.AbstractC04992q.A00()
            goto Ld5
        Lc3:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FL.A19
            java.lang.String r1 = "rQ0jmwctWvIOIioOAlLcoJlzUDkcSysz"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "N5NmD2ge71vhim7LrdB83J9iYpsRCLkc"
            r0 = 2
            r2[r0] = r1
            r5.A1L()
            com.facebook.ads.redexgen.X.AbstractC04992q.A00()
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FL.A1I():void");
    }

    public final void A1J() {
        this.A0O++;
        if (this.A0O == 1 && !this.A0I) {
            this.A0J = false;
        }
    }

    public final void A1K() {
        this.A0U++;
    }

    public final void A1L() {
        A1m(true);
    }

    public final void A1M() {
        if (!this.A0K && this.A0F) {
            C3T.A0D(this, this.A0k);
            this.A0K = true;
        }
    }

    public final void A1N() {
        if (this.A05 != null) {
            this.A05.A0I();
        }
        if (this.A06 != null) {
            this.A06.A1I(this.A0r);
            this.A06.A1G(this.A0r);
        }
        this.A0r.A0P();
    }

    public final void A1O() {
        int A05 = this.A01.A05();
        for (int left = 0; left < A05; left++) {
            View view = this.A01.A09(left);
            AnonymousClass56 A1G2 = A1G(view);
            if (A1G2 != null && A1G2.A07 != null) {
                View shadowingView = A1G2.A07.A0H;
                int left2 = view.getLeft();
                int top = view.getTop();
                int count = shadowingView.getLeft();
                if (left2 == count) {
                    int count2 = shadowingView.getTop();
                    if (top == count2) {
                    }
                }
                int i10 = shadowingView.getWidth();
                int count3 = shadowingView.getHeight();
                shadowingView.layout(left2, top, i10 + left2, count3 + top);
            }
        }
    }

    public final void A1P() {
        this.A0C = true;
        A0h();
    }

    public final void A1Q() {
        if (this.A0m != null) {
            this.A0m.clear();
        }
    }

    public final void A1R() {
        setScrollState(0);
        A0V();
    }

    public final void A1S(int i10) {
        if (this.A06 == null) {
            return;
        }
        this.A06.A1p(i10);
        awakenScrollBars();
    }

    public final void A1T(int i10) {
        int A05 = this.A01.A05();
        for (int i11 = 0; i11 < A05; i11++) {
            this.A01.A09(i11).offsetLeftAndRight(i10);
        }
    }

    public final void A1U(int i10) {
        int A05 = this.A01.A05();
        for (int i11 = 0; i11 < A05; i11++) {
            this.A01.A09(i11).offsetTopAndBottom(i10);
        }
    }

    public final void A1V(int i10) {
        if (this.A0I) {
            return;
        }
        A1R();
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(740, 94, 12));
            return;
        }
        this.A06.A1p(i10);
        awakenScrollBars();
    }

    public final void A1W(int i10) {
        if (this.A0I) {
            return;
        }
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(924, 97, 119));
        } else {
            this.A06.A1x(this, this.A0s, i10);
        }
    }

    public final void A1X(int i10) {
        getScrollingChildHelper().A03(i10);
    }

    public final void A1Y(int i10, int i11) {
        if (i10 < 0) {
            A0b();
            this.A0a.onAbsorb(-i10);
        } else if (i10 > 0) {
            A0c();
            this.A0b.onAbsorb(i10);
        }
        if (i11 < 0) {
            A0d();
            this.A0c.onAbsorb(-i11);
        } else if (i11 > 0) {
            A0a();
            String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[0] = "Kq4j6FG7zvFvwW4vRC6zLjapwuK9WjkP";
            strArr2[6] = "2Xczf707pBdLKDJ5NVr429bRaPx31sq0";
            this.A0Z.onAbsorb(i11);
        }
        if (i10 != 0 || i11 != 0) {
            C3T.A07(this);
        }
    }

    public final void A1Z(int i10, int i11) {
        boolean z10 = false;
        if (this.A0a != null) {
            boolean needsInvalidate = this.A0a.isFinished();
            if (!needsInvalidate && i10 > 0) {
                this.A0a.onRelease();
                z10 = this.A0a.isFinished();
            }
        }
        if (this.A0b != null) {
            boolean needsInvalidate2 = this.A0b.isFinished();
            if (!needsInvalidate2 && i10 < 0) {
                this.A0b.onRelease();
                boolean needsInvalidate3 = this.A0b.isFinished();
                z10 |= needsInvalidate3;
            }
        }
        EdgeEffect edgeEffect = this.A0c;
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[0] = "hv7OcE78gRUWXZIBx5R2VkE7fvviVqXd";
        strArr2[6] = "NFDR0brV2INlGIZxgJE16fqqg8Mw1YR1";
        if (edgeEffect != null) {
            boolean needsInvalidate4 = this.A0c.isFinished();
            if (!needsInvalidate4 && i11 > 0) {
                this.A0c.onRelease();
                boolean needsInvalidate5 = this.A0c.isFinished();
                z10 |= needsInvalidate5;
            }
        }
        if (this.A0Z != null) {
            boolean needsInvalidate6 = this.A0Z.isFinished();
            if (!needsInvalidate6 && i11 < 0) {
                this.A0Z.onRelease();
                boolean needsInvalidate7 = this.A0Z.isFinished();
                z10 |= needsInvalidate7;
            }
        }
        if (z10) {
            C3T.A07(this);
        }
    }

    public final void A1a(int i10, int i11) {
        int A00 = AbstractC05484o.A00(i10, getPaddingLeft() + getPaddingRight(), C3T.A03(this));
        int paddingTop = getPaddingTop();
        int width = getPaddingBottom();
        int i12 = paddingTop + width;
        int width2 = C3T.A02(this);
        setMeasuredDimension(A00, AbstractC05484o.A00(i11, i12, width2));
    }

    public final void A1b(int i10, int i11) {
        this.A0N++;
        int scrollY = getScrollX();
        int scrollX = getScrollY();
        onScrollChanged(scrollY, scrollX, scrollY, scrollX);
        if (this.A0i != null) {
            this.A0i.A0M(this, i10, i11);
        }
        if (this.A0m != null) {
            for (int scrollY2 = this.A0m.size() - 1; scrollY2 >= 0; scrollY2--) {
                this.A0m.get(scrollY2).A0M(this, i10, i11);
            }
        }
        this.A0N--;
    }

    public final void A1c(int i10, int i11) {
        A0l(i10, i11, null);
    }

    public final void A1d(View view) {
        int cnt;
        A0F(view);
        AbstractC05364c abstractC05364c = this.A04;
        if (this.A0l != null && this.A0l.size() - 1 >= 0) {
            this.A0l.get(cnt);
            throw new NullPointerException(A0I(1895, 27, 67));
        }
    }

    public final void A1e(View view) {
        A0F(view);
        AbstractC05364c abstractC05364c = this.A04;
        if (this.A0l != null) {
            List<RecyclerView.OnChildAttachStateChangeListener> list = this.A0l;
            String[] strArr = A19;
            if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[4] = "Ju6zs0r9efzkyV7LXILEyjCEKckziCxk";
            strArr2[5] = "xtNh9wS4idAx9IKZVnTROlGUKiewUtpM";
            int size = list.size() - 1;
            if (size >= 0) {
                this.A0l.get(size);
                throw new NullPointerException(A0I(1922, 29, 40));
            }
        }
    }

    public final void A1f(AbstractC05534t abstractC05534t) {
        if (this.A0m == null) {
            this.A0m = new ArrayList();
        }
        this.A0m.add(abstractC05534t);
    }

    public final void A1g(AbstractC05534t abstractC05534t) {
        if (this.A0m != null) {
            List<AbstractC05534t> list = this.A0m;
            if (A19[7].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "sOoQs3X4dS853ZpkNjZwaQi0LuRyF7Hc";
            strArr[2] = "YQ1nAsE5QOTVY911s6plJSU2g6bxQXkh";
            list.remove(abstractC05534t);
        }
    }

    public final void A1h(AnonymousClass53 anonymousClass53) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A08.A01;
            anonymousClass53.A06 = overScroller.getFinalX() - overScroller.getCurrX();
            anonymousClass53.A07 = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        anonymousClass53.A06 = 0;
        anonymousClass53.A07 = 0;
    }

    public final void A1i(AnonymousClass56 anonymousClass56, C05434j c05434j) {
        anonymousClass56.A0U(0, 8192);
        if (this.A0s.A0E) {
            boolean A0d = anonymousClass56.A0d();
            if (A19[1].charAt(14) != '5') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[0] = "SaiGfOi3tH24E262D5BQaQwya8XqTMou";
            strArr[6] = "ZNTGZnAbt95d53NkHsORUVfXJkKP7CFB";
            if (A0d && !anonymousClass56.A0a() && !anonymousClass56.A0f()) {
                this.A0t.A08(A0C(anonymousClass56), anonymousClass56);
            }
        }
        this.A0t.A0F(anonymousClass56, c05434j);
    }

    public final void A1j(AnonymousClass56 anonymousClass56, C05434j c05434j, C05434j c05434j2) {
        anonymousClass56.A0X(false);
        if (this.A05.A0E(anonymousClass56, c05434j, c05434j2)) {
            A1M();
        }
    }

    public final void A1k(AnonymousClass56 anonymousClass56, C05434j c05434j, C05434j c05434j2) {
        A0r(anonymousClass56);
        anonymousClass56.A0X(false);
        if (this.A05.A0F(anonymousClass56, c05434j, c05434j2)) {
            A1M();
        }
    }

    public final void A1l(String str) {
        if (A1q()) {
            if (str == null) {
                throw new IllegalStateException(A0I(574, 77, 103) + A1H());
            }
            throw new IllegalStateException(str);
        } else if (this.A0N > 0) {
            Log.w(A0I(1370, 12, 39), A0I(294, 280, 93), new IllegalStateException(A0I(0, 0, 122) + A1H()));
        }
    }

    public final void A1m(boolean z10) {
        this.A0U--;
        if (this.A0U < 1) {
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[4] = "VgsuIcXtp0FweJIL4JjeIuHXK9vcALAx";
            strArr2[5] = "AVlqmC2HCSNpSWUvoITeU6SwKS4OLgxH";
            this.A0U = 0;
            if (z10) {
                A0K();
                A0Z();
            }
        }
    }

    public final void A1n(boolean z10) {
        if (this.A0O < 1) {
            this.A0O = 1;
        }
        if (!z10) {
            this.A0J = false;
        }
        if (this.A0O == 1) {
            if (z10 && this.A0J) {
                boolean z11 = this.A0I;
                if (A19[1].charAt(14) != '5') {
                    throw new RuntimeException();
                }
                A19[7] = OperatorName.NON_STROKING_CMYK;
                if (!z11 && this.A06 != null && this.A04 != null) {
                    A0Y();
                }
            }
            if (!this.A0I) {
                this.A0J = false;
            }
        }
        this.A0O--;
    }

    public final boolean A1o() {
        return this.A10 != null && this.A10.isEnabled();
    }

    public final boolean A1p() {
        if (this.A0D) {
            boolean z10 = this.A0C;
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            A19[7] = OperatorName.STROKING_COLOR_CMYK;
            if (!z10 && !this.A00.A0B()) {
                return false;
            }
        }
        return true;
    }

    public final boolean A1q() {
        return this.A0U > 0;
    }

    public final boolean A1r(int i10) {
        return getScrollingChildHelper().A09(i10);
    }

    public final boolean A1s(int i10, int i11) {
        return getScrollingChildHelper().A0B(i10, i11);
    }

    public final boolean A1t(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().A0D(i10, i11, i12, i13, iArr, i14);
    }

    public final boolean A1u(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().A0F(i10, i11, iArr, iArr2, i12);
    }

    public final boolean A1v(View view) {
        A1J();
        boolean A0L = this.A01.A0L(view);
        if (A0L) {
            AnonymousClass56 viewHolder = A0F(view);
            this.A0r.A0Y(viewHolder);
            this.A0r.A0X(viewHolder);
        }
        boolean removed = !A0L;
        A1n(removed);
        return A0L;
    }

    public final boolean A1w(AnonymousClass56 anonymousClass56) {
        return this.A05 == null || this.A05.A0M(anonymousClass56, anonymousClass56.A0L());
    }

    public final boolean A1x(AnonymousClass56 anonymousClass56, int i10) {
        if (A1q()) {
            anonymousClass56.A02 = i10;
            this.A0w.add(anonymousClass56);
            return false;
        }
        C3T.A09(anonymousClass56.A0H, i10);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> views, int i10, int i11) {
        if (this.A06 == null || !this.A06.A1c(this, views, i10, i11)) {
            super.addFocusables(views, i10, i11);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C05494p) && this.A06.A1Y((C05494p) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        if (this.A06 != null && this.A06.A20()) {
            return this.A06.A1f(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        if (this.A06 != null && this.A06.A20()) {
            return this.A06.A1g(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        if (this.A06 != null && this.A06.A20()) {
            return this.A06.A1h(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        if (this.A06 != null && this.A06.A21()) {
            AbstractC05484o abstractC05484o = this.A06;
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "OwG4fgggKq7icgaaysnCa6zBD064f6Q4";
            strArr2[2] = "UojYTgk0EBa2sJrZvEgoz68xRxvrHNBO";
            return abstractC05484o.A1i(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        if (this.A06 != null && this.A06.A21()) {
            return this.A06.A1j(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        if (this.A06 != null && this.A06.A21()) {
            return this.A06.A1k(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().A08(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().A07(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A0E(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().A0C(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        dispatchThawSelfOnly(container);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        dispatchFreezeSelfOnly(container);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
        throw new java.lang.RuntimeException();
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r8) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FL.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (r8 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r12 == 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r12 != 1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r10.A06.A21() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        if (r12 != 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
        r8 = lib.zj.office.fc.ss.usermodel.ShapeTypes.DOUBLE_WAVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        r9 = r5.findNextFocus(r10, r11, r8);
        r2 = com.facebook.ads.redexgen.X.FL.A19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
        if (r2[0].charAt(14) == r2[6].charAt(14)) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
        r2 = com.facebook.ads.redexgen.X.FL.A19;
        r2[0] = "PHUXCSvj0qVt4bMkXhuKdS2TL18qx3jZ";
        r2[6] = "9Uo8CmEd6ZAjo9pPUWDw01n4G5SCE1PJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
        if (r9 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
        if (com.facebook.ads.redexgen.X.FL.A1F == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
        if (r2 != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
        if (r10.A06.A20() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b1, code lost:
        if (r10.A06.A0a() != 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
        if (r12 != 2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
        if ((r0 ^ r1) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
        r1 = 66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c0, code lost:
        if (r5.findNextFocus(r10, r11, r1) != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
        if (com.facebook.ads.redexgen.X.FL.A1F == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
        if (r2 == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ca, code lost:
        A1I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d1, code lost:
        if (A1E(r11) != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d3, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d4, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d6, code lost:
        r1 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d9, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00db, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dd, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00df, code lost:
        r8 = 33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e9, code lost:
        if (r8 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f0, code lost:
        A1J();
        r10.A06.A1n(r11, r12, r10.A0r, r10.A0s);
        A1n(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ff, code lost:
        r5 = r5.findNextFocus(r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0104, code lost:
        r5 = r5.findNextFocus(r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0108, code lost:
        if (r5 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010a, code lost:
        if (r8 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010c, code lost:
        A1I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0113, code lost:
        if (A1E(r11) != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0115, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0116, code lost:
        A1J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0123, code lost:
        if (com.facebook.ads.redexgen.X.FL.A19[7].length() == 1) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012a, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012b, code lost:
        com.facebook.ads.redexgen.X.FL.A19[7] = "d";
        r5 = r10.A06.A1n(r11, r12, r10.A0r, r10.A0s);
        A1n(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013f, code lost:
        if (r5 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0145, code lost:
        if (r5.hasFocusable() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0147, code lost:
        r4 = getFocusedChild();
        r2 = com.facebook.ads.redexgen.X.FL.A19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015c, code lost:
        if (r2[3].charAt(2) == r2[2].charAt(2)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015e, code lost:
        com.facebook.ads.redexgen.X.FL.A19[1] = "b9MIeYXaHVfTdq5nKFyUZKSBlIH2M87t";
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0165, code lost:
        if (r4 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016b, code lost:
        return super.focusSearch(r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016c, code lost:
        if (r4 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016f, code lost:
        A0p(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0172, code lost:
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0177, code lost:
        if (A16(r11, r5, r12) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0179, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:?, code lost:
        return super.focusSearch(r11, r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r11, int r12) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FL.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.A06 != null) {
            return this.A06.A1o();
        }
        throw new IllegalStateException(A0I(1475, 33, 59) + A1H());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.A06 != null) {
            return this.A06.A0v(getContext(), attributeSet);
        }
        throw new IllegalStateException(A0I(1475, 33, 59) + A1H());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this.A06 != null) {
            return this.A06.A0w(layoutParams);
        }
        throw new IllegalStateException(A0I(1475, 33, 59) + A1H());
    }

    public AbstractC05364c getAdapter() {
        return this.A04;
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.A06 != null) {
            return this.A06.A0V();
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        if (0 == 0) {
            return super.getChildDrawingOrder(i10, i11);
        }
        throw new NullPointerException(A0I(1951, 22, 16));
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.A0B;
    }

    public C1364ag getCompatAccessibilityDelegate() {
        return this.A09;
    }

    public AbstractC05444k getItemAnimator() {
        return this.A05;
    }

    public AbstractC05484o getLayoutManager() {
        return this.A06;
    }

    public int getMaxFlingVelocity() {
        return this.A0x;
    }

    public int getMinFlingVelocity() {
        return this.A0y;
    }

    public long getNanoTime() {
        if (A1E) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC05514r getOnFlingListener() {
        return this.A0g;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0o;
    }

    public C4v getRecycledViewPool() {
        return this.A0r.A0H();
    }

    public int getScrollState() {
        return this.A0W;
    }

    private C3B getScrollingChildHelper() {
        if (this.A0d == null) {
            this.A0d = new C3B(this);
        }
        return this.A0d;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().A05();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.A0F;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A06();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0U = 0;
        boolean z10 = true;
        this.A0F = true;
        this.A0D = (!this.A0D || isLayoutRequested()) ? false : false;
        if (this.A06 != null) {
            this.A06.A1N(this);
        }
        this.A0K = false;
        if (A1E) {
            this.A03 = C4P.A07.get();
            C4P c4p = this.A03;
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[4] = "C0ehsoOGkHH4Yo5xO6QtGogVKP7uVX9B";
            strArr2[5] = "76wleFUxgdDs3CwSlu7sJ9vYK22l9wck";
            if (c4p == null) {
                this.A03 = new C4P();
                Display A04 = C3T.A04(this);
                float f10 = 60.0f;
                if (!isInEditMode() && A04 != null) {
                    float refreshRate = A04.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                this.A03.A00 = 1.0E9f / f10;
                C4P.A07.set(this.A03);
            }
            this.A03.A09(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A05 != null) {
            this.A05.A0I();
        }
        A1R();
        this.A0F = false;
        if (this.A06 != null) {
            this.A06.A1Q(this, this.A0r);
        }
        this.A0w.clear();
        removeCallbacks(this.A0k);
        this.A0t.A07();
        if (A1E && this.A03 != null) {
            this.A03.A0A(this);
            this.A03 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.A0v.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A0v.get(i10);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float vScroll;
        float f10;
        if (this.A06 == null || this.A0I) {
            return false;
        }
        int action = motionEvent.getAction();
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[4] = "SqJdYhJCWRyNUdRTYMkhoX0xKlvJTIzq";
        strArr2[5] = "dLZEV46oohOd8c5dsstKZ2mmKWuZBEje";
        if (action == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.A06.A21()) {
                    vScroll = -motionEvent.getAxisValue(9);
                } else {
                    vScroll = 0.0f;
                }
                if (this.A06.A20()) {
                    f10 = motionEvent.getAxisValue(10);
                } else {
                    f10 = 0.0f;
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                f10 = motionEvent.getAxisValue(26);
                if (this.A06.A21()) {
                    vScroll = -f10;
                    f10 = 0.0f;
                } else if (this.A06.A20()) {
                    vScroll = 0.0f;
                } else {
                    vScroll = 0.0f;
                    f10 = 0.0f;
                }
            } else {
                vScroll = 0.0f;
                f10 = 0.0f;
            }
            if (vScroll != 0.0f || f10 != 0.0f) {
                float hScroll = this.A0L;
                A13((int) (hScroll * f10), (int) (this.A0M * vScroll), motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0I) {
            return false;
        }
        if (A15(motionEvent)) {
            A0J();
            return true;
        } else if (this.A06 == null) {
            return false;
        } else {
            boolean A20 = this.A06.A20();
            boolean startScroll = this.A06.A21();
            if (this.A0Y == null) {
                this.A0Y = VelocityTracker.obtain();
            }
            this.A0Y.addMovement(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            switch (actionMasked) {
                case 0:
                    boolean canScrollHorizontally = this.A0n;
                    if (canScrollHorizontally) {
                        this.A0n = false;
                    }
                    this.A0V = motionEvent.getPointerId(0);
                    int x4 = (int) (motionEvent.getX() + 0.5f);
                    this.A0S = x4;
                    this.A0Q = x4;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.A0T = y10;
                    this.A0R = y10;
                    if (this.A0W == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        String[] strArr = A19;
                        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                            String[] strArr2 = A19;
                            strArr2[4] = "M5UY6PcxpnTLVPVued5fx0ZBKGPv0DD6";
                            strArr2[5] = "epX9q1DqtqLsT3WNVlKQ1OkRKfkr8qoW";
                            setScrollState(1);
                        } else {
                            String[] strArr3 = A19;
                            strArr3[3] = "mz0Spg27ESm6n2CBfiNuhIq158jNl3XC";
                            strArr3[2] = "LXDJrUlN0pxLgDChp5qc6Quk8NcN491z";
                            setScrollState(1);
                        }
                    }
                    int[] iArr = this.A15;
                    this.A15[1] = 0;
                    iArr[0] = 0;
                    int i10 = 0;
                    if (A20) {
                        i10 = 0 | 1;
                    }
                    if (startScroll) {
                        i10 |= 2;
                    }
                    A1s(i10, 0);
                    break;
                case 1:
                    this.A0Y.clear();
                    A1X(0);
                    break;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.A0V);
                    if (findPointerIndex >= 0) {
                        int index = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        if (this.A0W != 1) {
                            int i11 = index - this.A0Q;
                            int dy = y11 - this.A0R;
                            int dx = 0;
                            if (A20) {
                                int x10 = Math.abs(i11);
                                int actionIndex2 = this.A0X;
                                if (A19[1].charAt(14) != '5') {
                                    throw new RuntimeException();
                                }
                                A19[1] = "KTspDQ6S4I31ss5nDId9o94814z1kYXz";
                                if (x10 > actionIndex2) {
                                    this.A0S = index;
                                    dx = 1;
                                }
                            }
                            if (startScroll && Math.abs(dy) > this.A0X) {
                                this.A0T = y11;
                                dx = 1;
                            }
                            if (dx != 0) {
                                setScrollState(1);
                                break;
                            }
                        }
                    } else {
                        Log.e(A0I(1370, 12, 39), A0I(1063, 46, 66) + this.A0V + A0I(124, 45, 102));
                        return false;
                    }
                    break;
                case 3:
                    A0J();
                    break;
                case 5:
                    this.A0V = motionEvent.getPointerId(actionIndex);
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.A0S = x11;
                    this.A0Q = x11;
                    int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.A0T = y12;
                    this.A0R = y12;
                    break;
                case 6:
                    A0n(motionEvent);
                    break;
            }
            return this.A0W == 1;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        AbstractC04992q.A01(A0I(1330, 11, 34));
        A0Y();
        AbstractC04992q.A00();
        this.A0D = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.A06 == null) {
            A1a(i10, i11);
            return;
        }
        boolean z10 = this.A06.A06;
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[3] = "7ZSgCyrANqbSR0bOMUGXtewOYYl5EtQ7";
        strArr2[2] = "EtNqJr4QhL0ASxhb1XseUjRgOzTVtavV";
        int heightMode = 0;
        if (z10) {
            int mode = View.MeasureSpec.getMode(i10);
            int widthMode = View.MeasureSpec.getMode(i11);
            if (mode == 1073741824 && widthMode == 1073741824) {
                heightMode = 1;
            }
            this.A06.A1J(this.A0r, this.A0s, i10, i11);
            if (heightMode != 0 || this.A04 == null) {
                return;
            }
            int widthMode2 = this.A0s.A04;
            if (widthMode2 == 1) {
                A0L();
            }
            this.A06.A11(i10, i11);
            this.A0s.A0A = true;
            A0M();
            this.A06.A12(i10, i11);
            if (this.A06.A1z()) {
                AbstractC05484o abstractC05484o = this.A06;
                int widthMode3 = getMeasuredWidth();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(widthMode3, 1073741824);
                int widthMode4 = getMeasuredHeight();
                abstractC05484o.A11(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(widthMode4, 1073741824));
                this.A0s.A0A = true;
                A0M();
                if (A19[1].charAt(14) != '5') {
                    this.A06.A12(i10, i11);
                    return;
                }
                String[] strArr3 = A19;
                strArr3[3] = "2scJF4Z4oabFWuCQusikCL010xDMrwfy";
                strArr3[2] = "adt4S0RTiAMMvoy66yYvZbK2iUPJlD04";
                this.A06.A12(i10, i11);
            }
        } else if (this.A0E) {
            this.A06.A1J(this.A0r, this.A0s, i10, i11);
        } else {
            if (this.A0A) {
                A1J();
                A1K();
                A0P();
                A1L();
                if (this.A0s.A0B) {
                    this.A0s.A09 = true;
                } else {
                    this.A00.A07();
                    this.A0s.A09 = false;
                }
                this.A0A = false;
                A1n(false);
            } else if (this.A0s.A0B) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            if (this.A04 != null) {
                this.A0s.A03 = this.A04.A0E();
            } else {
                this.A0s.A03 = 0;
            }
            A1J();
            this.A06.A1J(this.A0r, this.A0s, i10, i11);
            A1n(false);
            this.A0s.A09 = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (A1q()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            classLoader = getContext().getClassLoader();
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof RecyclerView$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        this.A0j = (RecyclerView$SavedState) state;
        super.onRestoreInstanceState(this.A0j.A02());
        if (this.A06 != null && this.A0j.A00 != null) {
            this.A06.A1s(this.A0j.A00);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        RecyclerView$SavedState recyclerView$SavedState = new RecyclerView$SavedState(super.onSaveInstanceState());
        RecyclerView$SavedState state = this.A0j;
        if (state != null) {
            RecyclerView$SavedState state2 = this.A0j;
            recyclerView$SavedState.A03(state2);
        } else if (this.A06 != null) {
            recyclerView$SavedState.A00 = this.A06.A1l();
        } else {
            recyclerView$SavedState.A00 = null;
        }
        return new WrappedParcelable(recyclerView$SavedState);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            A0f();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        float f11;
        if (this.A0I || this.A0n) {
            return false;
        }
        if (A14(motionEvent)) {
            A0J();
            return true;
        } else if (this.A06 == null) {
            return false;
        } else {
            boolean A20 = this.A06.A20();
            boolean eventAddedToVelocityTracker = this.A06.A21();
            if (this.A0Y == null) {
                this.A0Y = VelocityTracker.obtain();
            }
            boolean canScrollVertically = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                int[] iArr = this.A15;
                this.A15[1] = 0;
                iArr[0] = 0;
            }
            float f12 = this.A15[0];
            if (A19[1].charAt(14) == '5') {
                String[] strArr = A19;
                strArr[4] = "SmtdwAgCAQ3d1YsOl1YESVhzKEqu7eKK";
                strArr[5] = "J6uBjvS6jISF4fo0G11W738KKcsSrsAN";
                obtain.offsetLocation(f12, this.A15[1]);
                switch (actionMasked) {
                    case 0:
                        this.A0V = motionEvent.getPointerId(0);
                        int dy = (int) (motionEvent.getX() + 0.5f);
                        this.A0S = dy;
                        this.A0Q = dy;
                        int dx = (int) (motionEvent.getY() + 0.5f);
                        this.A0T = dx;
                        this.A0R = dx;
                        int nestedScrollAxis = 0;
                        if (A20) {
                            nestedScrollAxis = 0 | 1;
                        }
                        if (eventAddedToVelocityTracker) {
                            nestedScrollAxis |= 2;
                        }
                        A1s(nestedScrollAxis, 0);
                        break;
                    case 1:
                        this.A0Y.addMovement(obtain);
                        canScrollVertically = true;
                        this.A0Y.computeCurrentVelocity(1000, this.A0x);
                        if (A20) {
                            f10 = -this.A0Y.getXVelocity(this.A0V);
                        } else {
                            f10 = 0.0f;
                        }
                        if (eventAddedToVelocityTracker) {
                            f11 = -this.A0Y.getYVelocity(this.A0V);
                        } else {
                            f11 = 0.0f;
                        }
                        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                        if (A19[1].charAt(14) == '5') {
                            String[] strArr2 = A19;
                            strArr2[0] = "jpSzY3cN6Yd9mC426DHJqMOwyRQLyhoD";
                            strArr2[6] = "NqO1hqm0aSOLr2VmuYam7NnyHk2GnoAg";
                            if ((i10 == 0 && f11 == 0.0f) || !A12((int) f10, (int) f11)) {
                                setScrollState(0);
                            }
                            A0T();
                            break;
                        }
                        break;
                    case 2:
                        int findPointerIndex = motionEvent.findPointerIndex(this.A0V);
                        if (findPointerIndex < 0) {
                            Log.e(A0I(1370, 12, 39), A0I(1063, 46, 66) + this.A0V + A0I(124, 45, 102));
                            return false;
                        }
                        int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int actionIndex2 = this.A0S - x4;
                        int dy2 = this.A0T - y10;
                        if (A1u(actionIndex2, dy2, this.A16, this.A17, 0)) {
                            actionIndex2 -= this.A16[0];
                            dy2 -= this.A16[1];
                            obtain.offsetLocation(this.A17[0], this.A17[1]);
                            int[] iArr2 = this.A15;
                            iArr2[0] = iArr2[0] + this.A17[0];
                            int[] iArr3 = this.A15;
                            iArr3[1] = iArr3[1] + this.A17[1];
                        }
                        if (this.A0W != 1) {
                            boolean z10 = false;
                            if (A20 && Math.abs(actionIndex2) > this.A0X) {
                                if (actionIndex2 > 0) {
                                    actionIndex2 -= this.A0X;
                                } else {
                                    actionIndex2 += this.A0X;
                                }
                                z10 = true;
                            }
                            if (eventAddedToVelocityTracker && Math.abs(dy2) > this.A0X) {
                                if (dy2 > 0) {
                                    dy2 -= this.A0X;
                                } else {
                                    dy2 += this.A0X;
                                }
                                z10 = true;
                            }
                            if (z10) {
                                setScrollState(1);
                            }
                        }
                        if (this.A0W == 1) {
                            this.A0S = x4 - this.A17[0];
                            this.A0T = y10 - this.A17[1];
                            if (A13(A20 ? actionIndex2 : 0, eventAddedToVelocityTracker ? dy2 : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            if (this.A03 != null && (actionIndex2 != 0 || dy2 != 0)) {
                                this.A03.A0B(this, actionIndex2, dy2);
                                break;
                            }
                        }
                        break;
                    case 3:
                        A0J();
                        break;
                    case 5:
                        this.A0V = motionEvent.getPointerId(actionIndex);
                        int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.A0S = x10;
                        this.A0Q = x10;
                        int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.A0T = y11;
                        this.A0R = y11;
                        break;
                    case 6:
                        A0n(motionEvent);
                        break;
                }
                if (!canScrollVertically) {
                    this.A0Y.addMovement(obtain);
                }
                obtain.recycle();
                return true;
            }
            throw new RuntimeException();
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        AnonymousClass56 A0F = A0F(view);
        if (A0F != null) {
            if (A0F.A0c()) {
                A0F.A0P();
            } else if (!A0F.A0f()) {
                throw new IllegalArgumentException(A0I(219, 75, 84) + A0F + A1H());
            }
        }
        view.clearAnimation();
        A1e(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.A06.A1b(this, this.A0s, view, view2) && view2 != null) {
            A0p(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.A06.A1Z(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.A13.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<InterfaceC05524s> arrayList = this.A13;
            int i11 = A19[7].length();
            if (i11 != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "ALuvCB3Uxfwb6USvRsTQeejOaKQGJDVI";
            strArr[2] = "eH5kVfmfggziqkhtmDEzLdVkGL1u4682";
            arrayList.get(i10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.A0O == 0) {
            boolean z10 = this.A0I;
            String[] strArr = A19;
            if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[0] = "DQNG7v2eQntUoXmxdvl3JfddX2pbwEnJ";
            strArr2[6] = "9dlsUD8r2K7vneFeWRut3F36hDYz7ROo";
            if (!z10) {
                super.requestLayout();
                return;
            }
        }
        this.A0J = true;
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(834, 90, 48));
        } else if (this.A0I) {
        } else {
            boolean A20 = this.A06.A20();
            boolean A21 = this.A06.A21();
            if (A20 || A21) {
                String[] strArr = A19;
                if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                    throw new RuntimeException();
                }
                A19[1] = "hukuWuX8c8ikYD5Zh6axQSjgAUqwSCKd";
                if (!A20) {
                    i10 = 0;
                }
                A13(i10, A21 ? i11 : 0, null);
            }
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w(A0I(1370, 12, 39), A0I(1382, 93, 57));
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (A18(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C1364ag c1364ag) {
        this.A09 = c1364ag;
        C3T.A0B(this, this.A09);
    }

    public void setAdapter(AbstractC05364c abstractC05364c) {
        setLayoutFrozen(false);
        A0q(abstractC05364c, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC05394f interfaceC05394f) {
        if (interfaceC05394f == null) {
            return;
        }
        this.A0e = interfaceC05394f;
        setChildrenDrawingOrderEnabled(0 != 0);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.A0B) {
            A0f();
        }
        this.A0B = z10;
        super.setClipToPadding(z10);
        if (this.A0D) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z10) {
        this.A0E = z10;
    }

    public void setItemAnimator(AbstractC05444k abstractC05444k) {
        if (this.A05 != null) {
            this.A05.A0I();
            this.A05.A0B(null);
        }
        this.A05 = abstractC05444k;
        if (this.A05 != null) {
            this.A05.A0B(this.A0f);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.A0r.A0Q(i10);
    }

    public void setLayoutFrozen(boolean z10) {
        if (z10 != this.A0I) {
            A1l(A0I(1021, 42, 1));
            if (!z10) {
                this.A0I = false;
                if (this.A0J && this.A06 != null && this.A04 != null) {
                    requestLayout();
                }
                this.A0J = false;
                return;
            }
            long now = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0));
            String[] strArr = A19;
            if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[0] = "JdEcOawzhGoMi7SJTaKu9jXFd9l8G1Qn";
            strArr2[6] = "ngxMbpV1qHapbkXJW6JrwI2187obRSoG";
            this.A0I = true;
            this.A0n = true;
            A1R();
        }
    }

    public void setLayoutManager(AbstractC05484o abstractC05484o) {
        if (abstractC05484o == this.A06) {
            return;
        }
        A1R();
        if (this.A06 != null) {
            if (this.A05 != null) {
                this.A05.A0I();
            }
            this.A06.A1I(this.A0r);
            this.A06.A1G(this.A0r);
            this.A0r.A0P();
            if (this.A0F) {
                this.A06.A1Q(this, this.A0r);
            }
            this.A06.A1P(null);
            this.A06 = null;
        } else {
            this.A0r.A0P();
        }
        this.A01.A0B();
        this.A06 = abstractC05484o;
        if (abstractC05484o != null) {
            if (abstractC05484o.A03 == null) {
                this.A06.A1P(this);
                if (this.A0F) {
                    this.A06.A1N(this);
                }
            } else {
                throw new IllegalArgumentException(A0I(1109, 14, 42) + abstractC05484o + A0I(59, 39, 124) + abstractC05484o.A03.A1H());
            }
        }
        this.A0r.A0O();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().A04(z10);
    }

    public void setOnFlingListener(AbstractC05514r abstractC05514r) {
        this.A0g = abstractC05514r;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC05534t abstractC05534t) {
        this.A0i = abstractC05534t;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.A0o = z10;
    }

    public void setRecycledViewPool(C4v c4v) {
        this.A0r.A0V(c4v);
    }

    public void setRecyclerListener(InterfaceC05564x interfaceC05564x) {
        this.A07 = interfaceC05564x;
    }

    public void setScrollState(int i10) {
        if (i10 == this.A0W) {
            return;
        }
        this.A0W = i10;
        if (i10 != 2) {
            A0V();
        }
        A0k(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i10) {
            case 0:
                break;
            case 1:
                this.A0X = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                Log.w(A0I(1370, 12, 39), A0I(1994, 47, 98) + i10 + A0I(198, 21, 88));
                break;
        }
        this.A0X = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AnonymousClass54 anonymousClass54) {
        this.A0r.A0W(anonymousClass54);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().A0A(i10);
    }

    @Override // android.view.View, com.facebook.ads.redexgen.X.C3A
    public final void stopNestedScroll() {
        getScrollingChildHelper().A02();
    }
}
