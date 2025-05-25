package com.bytedance.adsdk.Qhi.cJ.fl;

import com.bytedance.adsdk.Qhi.cJ.CJ.ROR;
import com.bytedance.adsdk.Qhi.cJ.CJ.Tgh;
import com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.ABk;
import com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.MQ;
import com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.WAv;
import com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.ac;
import com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.fl;
import com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.hm;
import com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.iMK;
import com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.kYc;
import com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.pA;
import com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.tP;
import com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.zc;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/* compiled from: OperatorResultUtil.java */
/* loaded from: classes.dex */
public class cJ {

    /* compiled from: OperatorResultUtil.java */
    /* renamed from: com.bytedance.adsdk.Qhi.cJ.fl.cJ$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Qhi;

        static {
            int[] iArr = new int[Tgh.values().length];
            Qhi = iArr;
            try {
                iArr[Tgh.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Qhi[Tgh.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Qhi[Tgh.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Qhi[Tgh.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Qhi[Tgh.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Qhi[Tgh.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Qhi[Tgh.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Qhi[Tgh.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Qhi[Tgh.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Qhi[Tgh.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Qhi[Tgh.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                Qhi[Tgh.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                Qhi[Tgh.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public static com.bytedance.adsdk.Qhi.cJ.cJ.Qhi Qhi(List<com.bytedance.adsdk.Qhi.cJ.cJ.Qhi> list, String str, int i10) {
        ac(list, str, i10);
        Deque<com.bytedance.adsdk.Qhi.cJ.cJ.Qhi> Qhi = Qhi(cJ(list, str, i10));
        if (Qhi.size() == 1) {
            return Qhi.getFirst();
        }
        throw new IllegalStateException();
    }

    private static void ac(List<com.bytedance.adsdk.Qhi.cJ.cJ.Qhi> list, String str, int i10) {
        for (com.bytedance.adsdk.Qhi.cJ.cJ.Qhi qhi : list) {
            if (ROR.Qhi(qhi.Qhi())) {
                throw new IllegalArgumentException(str.substring(0, i10));
            }
        }
    }

    private static Deque<com.bytedance.adsdk.Qhi.cJ.cJ.Qhi> cJ(List<com.bytedance.adsdk.Qhi.cJ.cJ.Qhi> list, String str, int i10) {
        LinkedList<com.bytedance.adsdk.Qhi.cJ.cJ.Qhi> linkedList = new LinkedList(list);
        int i11 = 5;
        while (i11 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.Qhi.cJ.cJ.Qhi qhi : linkedList) {
                if (!linkedList2.isEmpty() && Tgh.Qhi(((com.bytedance.adsdk.Qhi.cJ.cJ.Qhi) linkedList2.peekLast()).Qhi()) && ((Tgh) ((com.bytedance.adsdk.Qhi.cJ.cJ.Qhi) linkedList2.peekLast()).Qhi()).cJ() == i11) {
                    com.bytedance.adsdk.Qhi.cJ.cJ.Qhi qhi2 = (com.bytedance.adsdk.Qhi.cJ.cJ.Qhi) linkedList2.pollLast();
                    com.bytedance.adsdk.Qhi.cJ.cJ.Qhi qhi3 = (com.bytedance.adsdk.Qhi.cJ.cJ.Qhi) linkedList2.pollLast();
                    if (!Tgh.Qhi(qhi3.Qhi()) && !Tgh.Qhi(qhi.Qhi())) {
                        linkedList2.addLast(Qhi(qhi3, qhi2, qhi));
                    } else {
                        throw new IllegalArgumentException(str.substring(0, i10));
                    }
                } else {
                    linkedList2.addLast(qhi);
                }
            }
            i11--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    private static Deque<com.bytedance.adsdk.Qhi.cJ.cJ.Qhi> Qhi(Deque<com.bytedance.adsdk.Qhi.cJ.cJ.Qhi> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.Qhi.cJ.cJ.Qhi qhi : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.Qhi.cJ.cJ.Qhi) linkedList.peekLast()).Qhi() == Tgh.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.Qhi.cJ.cJ.Qhi qhi2 = (com.bytedance.adsdk.Qhi.cJ.cJ.Qhi) linkedList.pollLast();
                if (((com.bytedance.adsdk.Qhi.cJ.cJ.Qhi) linkedList.pollLast()).Qhi() == Tgh.QUESTION) {
                    MQ mq = new MQ();
                    mq.Qhi((com.bytedance.adsdk.Qhi.cJ.cJ.Qhi) linkedList.pollLast());
                    mq.cJ(qhi2);
                    mq.ac(qhi);
                    linkedList.addLast(mq);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                linkedList.addLast(qhi);
            }
        }
        return linkedList;
    }

    private static com.bytedance.adsdk.Qhi.cJ.cJ.Qhi Qhi(com.bytedance.adsdk.Qhi.cJ.cJ.Qhi qhi, com.bytedance.adsdk.Qhi.cJ.cJ.Qhi qhi2, com.bytedance.adsdk.Qhi.cJ.cJ.Qhi qhi3) {
        kYc zcVar;
        switch (AnonymousClass1.Qhi[((Tgh) qhi2.Qhi()).ordinal()]) {
            case 1:
                zcVar = new zc();
                break;
            case 2:
                zcVar = new tP();
                break;
            case 3:
                zcVar = new com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.Qhi();
                break;
            case 4:
                zcVar = new iMK();
                break;
            case 5:
                zcVar = new ABk();
                break;
            case 6:
                zcVar = new fl();
                break;
            case 7:
                zcVar = new pA();
                break;
            case 8:
                zcVar = new com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.ROR();
                break;
            case 9:
                zcVar = new WAv();
                break;
            case 10:
                zcVar = new com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.Tgh();
                break;
            case 11:
                zcVar = new hm();
                break;
            case 12:
                zcVar = new com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.cJ();
                break;
            case 13:
                zcVar = new ac();
                break;
            default:
                throw new UnsupportedOperationException(qhi2.Qhi().toString());
        }
        zcVar.Qhi(qhi);
        zcVar.cJ(qhi3);
        return zcVar;
    }

    public static boolean Qhi(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
