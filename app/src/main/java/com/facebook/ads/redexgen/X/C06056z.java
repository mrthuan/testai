package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.6z  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06056z implements IA {
    public static byte[] A09;
    public static String[] A0A = {"5g", "bfnfjiUri9kvxuLEKnZU3kJc1ieY23zz", "NIX", "B1MUzprhDDigVQ4p3NlPN3VyWdkPEAJB", "UzK", "rOCmuOM4l5uJjn2akKGm2JxYL79BUlOr", "kAulvLpzcmVynuK8kNGYEaaJbNqcwElD", "7ScKsdjGN77oK2tO1d"};
    public static final String A0B;
    public long A00;
    public InterfaceC1539dl A01;
    public final InterfaceC1538dk A02;
    public final C1530db A03;
    public final C1530db A04;
    public final List<Rect> A05;
    public final Map<String, C1529da> A06;
    public final boolean A07;
    public final boolean A08;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "GBjOApmdB9meVYu3h8dWYwSrfWPE5QmB";
            strArr2[6] = "rSzbUr5mB5cqWCHa6t40U5C3uIAdU8ry";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 73);
            i13++;
        }
    }

    public static void A03() {
        A09 = new byte[]{20, Field.DATA, 41, Field.MACROBUTTON, 96, Field.AUTONUM, 41, Field.PAGEREF, Field.IMPORT, 48, Field.GLOSSARY, 41, Field.DDEAUTO, Field.AUTONUMOUT, 96, Field.DATA, 33, Field.MACROBUTTON, 96, Field.DDEAUTO, Field.GLOSSARY, Field.AUTONUMOUT, 96, 34, Field.PAGEREF, Field.PAGEREF, Field.DDEAUTO, 96, Field.DDE, Field.PAGEREF, 33, Field.MACROBUTTON, Field.AUTONUMLGL, Field.GOTOBUTTON, Field.PAGEREF, 36, 96, Field.GLOSSARY, Field.GOTOBUTTON, 96, 41, Field.MACROBUTTON, 96, 33, 96, Field.FILLIN, Field.GOTOBUTTON, Field.GLOSSARY, Field.AUTONUMLGL, 48, 96, Field.IMPORT, Field.DATA, 41, Field.QUOTE, Field.DATA, 96, Field.IMPORT, 41, 44, 44, 96, Field.DDEAUTO, Field.PAGEREF, Field.AUTONUM, Field.PAGEREF, Field.GOTOBUTTON, 96, Field.GOTOBUTTON, Field.PAGEREF, Field.AUTONUMOUT, Field.AUTONUMLGL, Field.GOTOBUTTON, Field.DDEAUTO, 96, 33, 96, Field.DDE, Field.PAGEREF, 33, Field.MACROBUTTON, Field.AUTONUMLGL, Field.GOTOBUTTON, Field.PAGEREF, Field.DDE, Field.PAGEREF, Field.DDEAUTO, Field.AUTONUMOUT, 96, Field.MACROBUTTON, 41, Field.DDEAUTO, Field.QUOTE, Field.PAGEREF, 96, 41, Field.AUTONUMOUT, 103, Field.MACROBUTTON, 96, Field.DDE, 33, 36, Field.PAGEREF, 96, Field.AUTONUMLGL, 48, 96, Field.GLOSSARY, Field.ASK, 96, Field.MACROBUTTON, Field.AUTONUMLGL, 34, Field.AUTONUM, 41, Field.PAGEREF, Field.IMPORT, Field.MACROBUTTON, 96, Field.AUTONUMOUT, Field.DATA, 33, Field.AUTONUMOUT, 96, Field.QUOTE, Field.GLOSSARY, Field.AUTONUMLGL, 44, 36, 96, 34, Field.PAGEREF, 96, Field.GLOSSARY, Field.ASK, Field.ASK, Field.MACROBUTTON, Field.QUOTE, Field.GOTOBUTTON, Field.PAGEREF, Field.PAGEREF, Field.DDEAUTO, 16, Field.NUMWORDS, 9, Field.DDE, 29, 31, 16, 61, Field.ASK, Field.BARCODE, Field.BARCODE, 115, Field.PAGEREF, 58, Field.AUTONUM, 36, 115, Field.QUOTE, 33, 60, Field.QUOTE, Field.AUTONUM, 33, Field.FILLIN, 42, 115, Field.AUTONUMLGL, 60, 33, 115, 33, Field.AUTONUM, Field.USERADDRESS, 60, Field.PAGEREF, Field.AUTONUM, Field.IMPORT, 115, 58, Field.FILLIN, Field.AUTONUM, Field.USERADDRESS, 115, 30, 2, 11, 25, Field.BARCODE, 8, 29, 2, 31, 25};
    }

    static {
        A03();
        A0B = C06056z.class.getSimpleName();
    }

    public C06056z(InterfaceC1538dk interfaceC1538dk) {
        this(interfaceC1538dk, false, false);
    }

    public C06056z(InterfaceC1538dk interfaceC1538dk, boolean z10, boolean z11) {
        this.A06 = new HashMap();
        this.A04 = new C1530db();
        this.A03 = new C1530db();
        this.A05 = new ArrayList(1);
        this.A02 = interfaceC1538dk;
        this.A08 = z10;
        this.A07 = z11;
    }

    public static Rect A00(C1529da c1529da) {
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        Rect rect5;
        if (c1529da != null) {
            rect = c1529da.A02;
            if (rect.top != Integer.MIN_VALUE) {
                rect2 = c1529da.A02;
                if (rect2.left != Integer.MIN_VALUE) {
                    rect3 = c1529da.A02;
                    if (rect3.right != Integer.MIN_VALUE) {
                        rect4 = c1529da.A02;
                        if (rect4.bottom != Integer.MIN_VALUE) {
                            rect5 = c1529da.A02;
                            return rect5;
                        }
                    }
                }
            }
        }
        throw new IllegalStateException(A02(0, ShapeTypes.FLOW_CHART_CONNECTOR, 9));
    }

    private C1529da A01(Cdo cdo, Rect rect, Rect rect2) {
        boolean A06;
        Rect rect3;
        List list;
        C1529da c1529da = this.A06.get(cdo.A00);
        A06 = this.A04.A06(cdo);
        if (A06) {
            if (c1529da != null) {
                c1529da.A01 = EnumC1533de.A04;
            } else {
                c1529da = C1529da.A03(this.A00);
                this.A06.put(cdo.A00, c1529da);
            }
        }
        rect3 = c1529da.A02;
        rect3.set(rect2);
        list = c1529da.A03;
        list.add(new Rect(rect));
        return c1529da;
    }

    private void A04(C1530db c1530db) {
        Collection<Cdo> A01;
        List list;
        A01 = c1530db.A01();
        for (Cdo cdo : A01) {
            C1529da c1529da = this.A06.get(cdo.A00);
            if (c1529da == null) {
                if (0 != 0) {
                    String str = A02(ShapeTypes.FLOW_CHART_EXTRACT, 36, 26) + cdo.A00;
                    throw new NullPointerException(A02(ShapeTypes.CHART_STAR, 10, 36));
                }
            } else {
                c1529da.A01 = EnumC1533de.A03;
                list = c1529da.A03;
                list.clear();
                cdo.A03(this);
                if (this.A08) {
                    this.A06.remove(c1529da);
                }
            }
        }
    }

    private void A05(C1530db c1530db) {
        Collection<Cdo> A00;
        A00 = c1530db.A00();
        for (Cdo cdo : A00) {
            cdo.A03(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IA
    public final void A3r(Cdo cdo, Rect rect, Rect rect2) {
        boolean A06;
        List list;
        Rect rect3;
        List list2;
        A01(cdo, rect, rect2);
        Cdo cdo2 = cdo.A02;
        Cdo parentViewpointData = Cdo.A08;
        if (cdo2 == parentViewpointData) {
            return;
        }
        A06 = this.A03.A06(cdo2);
        C1529da parentViewProperties = this.A06.get(cdo2.A00);
        if (A06) {
            if (parentViewProperties == null) {
                parentViewProperties = C1529da.A03(this.A00);
                rect3 = parentViewProperties.A02;
                rect3.set(SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID);
                this.A06.put(cdo2.A00, parentViewProperties);
            } else {
                list2 = parentViewProperties.A03;
                list2.clear();
                if (!this.A07 || cdo2.A04()) {
                    parentViewProperties.A01 = EnumC1533de.A04;
                }
            }
        }
        list = parentViewProperties.A03;
        list.add(new Rect(rect));
    }

    @Override // com.facebook.ads.redexgen.X.IA
    public final void A4N(long j10, List<Rect> list) {
        Collection A01;
        Collection<Cdo> A012;
        List list2;
        this.A00 = j10;
        this.A05.clear();
        Iterator<Rect> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "xWg";
            strArr2[2] = "l5f";
            if (hasNext) {
                this.A05.add(new Rect(it.next()));
            } else {
                A01 = this.A04.A01();
                Iterator it2 = A01.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    if (A0A[0].length() == 2) {
                        String[] strArr3 = A0A;
                        strArr3[3] = "KXc0LwnJCEJYYpq44EYPYXvj71LHxLBt";
                        strArr3[1] = "SZ9db6jeJg1WeryC8zmRUBHGUrGxU8hd";
                        if (!hasNext2) {
                            break;
                        }
                        this.A06.remove(((Cdo) it2.next()).A00);
                    } else if (!hasNext2) {
                        break;
                    } else {
                        this.A06.remove(((Cdo) it2.next()).A00);
                    }
                }
                A012 = this.A03.A01();
                if (A0A[0].length() != 2) {
                    throw new RuntimeException();
                }
                A0A[0] = "Au";
                for (Cdo viewpointData : A012) {
                    this.A06.remove(viewpointData.A00);
                }
                for (C1529da c1529da : this.A06.values()) {
                    list2 = c1529da.A03;
                    list2.clear();
                }
                this.A04.A04();
                this.A03.A04();
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.IA
    public final void A5v() {
        Collection A00;
        Collection A002;
        A05(this.A04);
        A04(this.A04);
        A05(this.A03);
        A04(this.A03);
        if (0 != 0) {
            String obj = toString();
            List<Rect> list = this.A05;
            A00 = this.A04.A00();
            A002 = this.A03.A00();
            new C1528dZ(obj, this, list, A00, A002);
            throw new NullPointerException(A02(ShapeTypes.FLOW_CHART_CONNECTOR, 7, 55));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1532dd
    public final void A7W(Cdo cdo, Rect rect) {
        List<Rect> list;
        rect.setEmpty();
        list = this.A06.get(cdo.A00).A03;
        for (Rect rect2 : list) {
            rect.union(rect2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1532dd
    public final EnumC1533de A8h(Cdo cdo) {
        EnumC1533de enumC1533de;
        enumC1533de = this.A06.get(cdo.A00).A01;
        return enumC1533de;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1532dd
    public final void A8j(Rect rect) {
        rect.setEmpty();
        for (Rect rect2 : this.A05) {
            rect.union(rect2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1532dd
    public final float A8k(Cdo cdo) {
        List<Rect> list;
        C1529da c1529da = this.A06.get(cdo.A00);
        if (c1529da != null) {
            Rect A00 = A00(c1529da);
            int height = A00.height() * A00.width();
            int totalVisibleArea = 0;
            list = c1529da.A03;
            for (Rect rect : list) {
                totalVisibleArea += rect.height() * rect.width();
            }
            return totalVisibleArea / height;
        }
        return 0.0f;
    }

    @Override // com.facebook.ads.redexgen.X.IA
    public final void AGh(InterfaceC1539dl interfaceC1539dl) {
        this.A01 = interfaceC1539dl;
    }
}
