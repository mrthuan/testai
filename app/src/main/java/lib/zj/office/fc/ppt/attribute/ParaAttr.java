package lib.zj.office.fc.ppt.attribute;

import androidx.activity.r;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import ii.e;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.hssf.record.chart.AreaFormatRecord;
import lib.zj.office.fc.hssf.record.chart.ChartRecord;
import lib.zj.office.fc.hssf.record.chart.DataFormatRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesRecord;
import lib.zj.office.fc.hssf.record.chart.UnitsRecord;
import lib.zj.office.fc.ppt.bulletnumber.BulletNumberManage;
import zh.b;
import zh.c;
import zh.f;
import zh.m;
import zh.n;

/* loaded from: classes3.dex */
public class ParaAttr {
    public static final float POINT_PER_LINE_PER_FONTSIZE = 1.2f;
    private static ParaAttr kit = new ParaAttr();

    public static ParaAttr instance() {
        return kit;
    }

    public void processParaWithPct(Element element, f fVar) {
        Element element2;
        String attributeValue;
        Element element3;
        String attributeValue2;
        int maxFontSize = RunAttr.instance().getMaxFontSize();
        if (element != null) {
            Element element4 = element.element("spcBef");
            if (element4 != null && (element3 = element4.element("spcPct")) != null && element3.attribute("val") != null && (attributeValue2 = element3.attributeValue("val")) != null && attributeValue2.length() > 0) {
                b.f32374b.getClass();
                b.M(fVar, (int) ((Integer.parseInt(attributeValue2) / 100000.0f) * maxFontSize * 1.2f * 20.0f));
            }
            Element element5 = element.element("spcAft");
            if (element5 != null && (element2 = element5.element("spcPct")) != null && element2.attribute("val") != null && (attributeValue = element2.attributeValue("val")) != null && attributeValue.length() > 0) {
                b.f32374b.getClass();
                b.L(fVar, (int) ((Integer.parseInt(attributeValue) / 100000.0f) * maxFontSize * 1.2f * 20.0f));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x027c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x028b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int processParagraph(lib.zj.office.system.f r34, th.b r35, th.a r36, th.e r37, zh.l r38, lib.zj.office.fc.dom4j.Element r39, lib.zj.office.fc.dom4j.Element r40, java.lang.String r41, int r42) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.ppt.attribute.ParaAttr.processParagraph(lib.zj.office.system.f, th.b, th.a, th.e, zh.l, lib.zj.office.fc.dom4j.Element, lib.zj.office.fc.dom4j.Element, java.lang.String, int):int");
    }

    public void setParaAfter(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 4101)) {
                int b10 = ((c) fVar).b((short) 4101, true);
                if (b10 == Integer.MIN_VALUE) {
                    b10 = 0;
                }
                b.L(fVar2, b10);
            }
        }
    }

    public void setParaAlign(f fVar, String str) {
        if (str.equals(OperatorName.LINE_TO)) {
            b.f32374b.getClass();
            b.N(fVar, 0);
        } else if (str.equals("ctr")) {
            b.f32374b.getClass();
            b.N(fVar, 1);
        } else if (str.equals("r")) {
            b.f32374b.getClass();
            b.N(fVar, 2);
        }
    }

    public void setParaAttribute(lib.zj.office.system.f fVar, Element element, f fVar2, f fVar3, int i10, int i11, int i12, boolean z10, boolean z11) {
        c cVar;
        c cVar2;
        String attributeValue;
        String attributeValue2;
        String attributeValue3;
        String attributeValue4;
        if (element != null) {
            if (element.attribute("algn") != null) {
                setParaAlign(fVar2, element.attributeValue("algn"));
            } else {
                setParaHorizontalAlign(fVar3, fVar2);
            }
            Element element2 = element.element("spcBef");
            if (element2 != null) {
                Element element3 = element2.element("spcPts");
                if (element3 != null && element3.attribute("val") != null && (attributeValue4 = element3.attributeValue("val")) != null && attributeValue4.length() > 0) {
                    b.f32374b.getClass();
                    b.M(fVar2, (int) ((Integer.parseInt(attributeValue4) / 100) * 20.0f));
                }
            } else {
                setParaBefore(fVar3, fVar2);
            }
            Element element4 = element.element("spcAft");
            if (element4 != null) {
                Element element5 = element4.element("spcPts");
                if (element5 != null && element5.attribute("val") != null && (attributeValue3 = element5.attributeValue("val")) != null && attributeValue3.length() > 0) {
                    b.f32374b.getClass();
                    b.L(fVar2, (int) ((Integer.parseInt(attributeValue3) / 100) * 20.0f));
                }
            } else {
                setParaAfter(fVar3, fVar2);
            }
            Element element6 = element.element("lnSpc");
            if (element6 != null) {
                Element element7 = element6.element("spcPts");
                if (element7 != null && element7.attribute("val") != null && (attributeValue2 = element7.attributeValue("val")) != null && attributeValue2.length() > 0) {
                    b.f32374b.getClass();
                    b.Q(fVar2, 4);
                    b.P(fVar2, (int) ((Integer.parseInt(attributeValue2) / 100) * 20.0f));
                }
                Element element8 = element6.element("spcPct");
                if (element8 != null && element8.attribute("val") != null && (attributeValue = element8.attributeValue("val")) != null && attributeValue.length() > 0) {
                    b.f32374b.getClass();
                    b.Q(fVar2, 5);
                    b.P(fVar2, (Integer.parseInt(attributeValue) - i12) / 100000.0f);
                }
            } else if (i12 > 0) {
                b.f32374b.getClass();
                b.Q(fVar2, 5);
                b.P(fVar2, (100000 - i12) / 100000.0f);
            } else {
                setParaLineSpace(fVar3, fVar2);
            }
            if (element.attribute("marR") != null) {
                String attributeValue5 = element.attributeValue("marR");
                if (attributeValue5 != null && attributeValue5.length() > 0) {
                    b.f32374b.getClass();
                    ((c) fVar2).e((int) r.b(Integer.parseInt(attributeValue5), 72.0f, 914400.0f, 20.0f), SeriesRecord.sid);
                }
            } else {
                setParaIndentRight(fVar3, fVar2);
            }
        } else {
            setParaHorizontalAlign(fVar3, fVar2);
            setParaBefore(fVar3, fVar2);
            setParaAfter(fVar3, fVar2);
            if (i12 > 0) {
                b.f32374b.getClass();
                b.Q(fVar2, 5);
                b.P(fVar2, (100000 - i12) / 100000.0f);
            } else {
                setParaLineSpace(fVar3, fVar2);
            }
            setParaIndentLeft(fVar3, fVar2);
            setParaIndentRight(fVar3, fVar2);
        }
        m a10 = n.f32394b.a(i11);
        if (element != null && element.attribute("marL") != null) {
            String attributeValue6 = element.attributeValue("marL");
            if (attributeValue6 != null && attributeValue6.length() > 0) {
                r12 = (int) r.b(Integer.parseInt(attributeValue6), 72.0f, 914400.0f, 20.0f);
                b.f32374b.getClass();
                ((c) fVar2).e(r12, ChartRecord.sid);
                b.O(fVar2, r12);
            }
        } else if (fVar3 != null) {
            b.f32374b.getClass();
            if (b.u(fVar3, UnitsRecord.sid)) {
                int b10 = ((c) fVar3).b(ChartRecord.sid, true);
                r12 = b10 != Integer.MIN_VALUE ? b10 : 0;
                b.O(fVar2, r12);
            }
        } else if (a10 != null && (cVar = a10.c) != null) {
            b.f32374b.getClass();
            if (b.u(cVar, UnitsRecord.sid)) {
                int b11 = cVar.b(ChartRecord.sid, true);
                r12 = b11 != Integer.MIN_VALUE ? b11 : 0;
                b.O(fVar2, r12);
            }
        }
        if (element != null && element.attribute("indent") != null) {
            String attributeValue7 = element.attributeValue("indent");
            if (attributeValue7 != null && attributeValue7.length() > 0) {
                setSpecialIndent(fVar2, r12, (int) r.b(Integer.parseInt(attributeValue7), 72.0f, 914400.0f, 20.0f), true);
            }
        } else if (fVar3 != null) {
            b.f32374b.getClass();
            if (b.u(fVar3, (short) 4104)) {
                setSpecialIndent(fVar2, r12, b.t(fVar3), true);
            }
        } else if (a10 != null && (cVar2 = a10.c) != null) {
            b.f32374b.getClass();
            if (b.u(cVar2, (short) 4104)) {
                setSpecialIndent(fVar2, r12, b.t(cVar2), true);
            }
        }
        if (z10 && (element == null || element.element("buNone") == null)) {
            int addBulletNumber = BulletNumberManage.instance().addBulletNumber(fVar, -1, element);
            if (addBulletNumber == -1 && fVar3 != null) {
                b.f32374b.getClass();
                addBulletNumber = ((c) fVar3).b((short) 4110, true);
                if (addBulletNumber == Integer.MIN_VALUE) {
                    addBulletNumber = -1;
                }
            }
            if (addBulletNumber == -1 && i10 >= 0) {
                addBulletNumber = BulletNumberManage.instance().getBulletID(i10);
            }
            if (addBulletNumber == -1 && i11 > 0 && !z11) {
                addBulletNumber = BulletNumberManage.instance().getBulletID(i11);
            }
            if (addBulletNumber >= 0) {
                b.f32374b.getClass();
                ((c) fVar2).e(addBulletNumber, (short) 4110);
            }
        }
        if (i11 > 0) {
            b.f32374b.getClass();
            ((c) fVar2).e(i11, (short) 4096);
        }
    }

    public void setParaBefore(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 4100)) {
                int b10 = ((c) fVar).b((short) 4100, true);
                if (b10 == Integer.MIN_VALUE) {
                    b10 = 0;
                }
                b.M(fVar2, b10);
            }
        }
    }

    public void setParaHorizontalAlign(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, DataFormatRecord.sid)) {
                b.N(fVar2, b.q(fVar));
            }
        }
    }

    public void setParaIndentLeft(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, UnitsRecord.sid)) {
                b.O(fVar2, b.r(fVar));
            }
        }
    }

    public void setParaIndentRight(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, SeriesRecord.sid)) {
                int b10 = ((c) fVar).b(SeriesRecord.sid, true);
                if (b10 == Integer.MIN_VALUE) {
                    b10 = 0;
                }
                ((c) fVar2).e(b10, SeriesRecord.sid);
            }
        }
    }

    public void setParaLineSpace(f fVar, f fVar2) {
        float f10;
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, AreaFormatRecord.sid)) {
                int b10 = ((c) fVar).b(AreaFormatRecord.sid, true);
                if (b10 == Integer.MIN_VALUE) {
                    b10 = 1;
                }
                b.Q(fVar2, b10);
            }
            if (b.u(fVar, (short) 4105)) {
                int b11 = ((c) fVar).b((short) 4105, true);
                if (b11 == Integer.MIN_VALUE) {
                    f10 = 1.0f;
                } else {
                    f10 = b11 / 100.0f;
                }
                b.P(fVar2, f10);
            }
        }
    }

    public void setParaSpecialIndent(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 4104)) {
                b.R(fVar2, b.t(fVar));
            }
        }
    }

    public void setSpecialIndent(f fVar, int i10, int i11, boolean z10) {
        if (i11 < 0 && Math.abs(i11) > i10) {
            i11 = -i10;
        }
        b.f32374b.getClass();
        b.R(fVar, i11);
        if (z10 && i11 < 0) {
            b.O(fVar, i10 + i11);
        }
    }

    public void setParaAttribute(e eVar, f fVar, f fVar2) {
        if (eVar == null || fVar2 == null) {
            if (fVar2 != null) {
                setParaHorizontalAlign(fVar2, fVar);
                setParaBefore(fVar2, fVar);
                setParaAfter(fVar2, fVar);
                setParaLineSpace(fVar2, fVar);
                return;
            }
            return;
        }
        int j10 = eVar.j() * 34;
        switch (eVar.i()) {
            case 0:
            case 1:
                c cVar = (c) fVar2;
                cVar.e(Math.round(j10 * 15.0f), UnitsRecord.sid);
                cVar.e(0, SeriesRecord.sid);
                b.f32374b.getClass();
                b.N(fVar, 0);
                break;
            case 2:
            case 4:
            case 5:
            case 6:
                b.f32374b.getClass();
                b.N(fVar, 1);
                break;
            case 3:
                c cVar2 = (c) fVar2;
                cVar2.e(0, UnitsRecord.sid);
                cVar2.e(Math.round(j10 * 15.0f), SeriesRecord.sid);
                b.f32374b.getClass();
                b.N(fVar, 2);
                break;
        }
        setParaBefore(fVar2, fVar);
        setParaAfter(fVar2, fVar);
        setParaLineSpace(fVar2, fVar);
        setParaIndentLeft(fVar2, fVar);
        setParaIndentRight(fVar2, fVar);
        setParaSpecialIndent(fVar2, fVar);
    }
}
