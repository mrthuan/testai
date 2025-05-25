package lib.zj.office.fc.ppt.bulletnumber;

import com.google.android.play.core.assetpacks.b1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.system.f;
import lib.zj.office.system.r;
import m7.g;

/* loaded from: classes3.dex */
public class BulletNumberManage {
    private static BulletNumberManage kit;
    private Map<Integer, Integer> lvlFmt = new HashMap();
    private Map<Integer, Integer> lvlStartAt = new HashMap();
    private Map<Integer, Integer> lvlNum = new HashMap();
    private Map<Integer, Integer> styleBulletIDs = new HashMap();
    private Map<String, Integer> bulletIDs = new HashMap();

    private int convertedNumberFormat(int i10) {
        if (i10 != 18) {
            if (i10 != 38) {
                switch (i10) {
                    case 0:
                        return 4;
                    case 1:
                        return 3;
                    case 2:
                        return 6;
                    case 3:
                    default:
                        return 0;
                    case 4:
                        return 13;
                    case 5:
                        return 8;
                    case 6:
                        return 2;
                    case 7:
                        return 1;
                    case 8:
                        return 15;
                    case 9:
                        return 10;
                    case 10:
                        return 14;
                    case 11:
                        return 9;
                    case 12:
                        return 11;
                    case 13:
                        break;
                    case 14:
                        return 12;
                    case 15:
                        return 7;
                }
            } else {
                return 39;
            }
        }
        return 5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
        if (r3 != 8211) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private char converterNumberChar(int r3) {
        /*
            r2 = this;
            r0 = 8226(0x2022, float:1.1527E-41)
            r1 = 9679(0x25cf, float:1.3563E-41)
            if (r3 == r0) goto L35
            r0 = 108(0x6c, float:1.51E-43)
            if (r3 == r0) goto L35
            r0 = 112(0x70, float:1.57E-43)
            if (r3 != r0) goto Lf
            goto L35
        Lf:
            r0 = 110(0x6e, float:1.54E-43)
            if (r3 == r0) goto L32
            r0 = 167(0xa7, float:2.34E-43)
            if (r3 != r0) goto L18
            goto L32
        L18:
            r0 = 117(0x75, float:1.64E-43)
            if (r3 != r0) goto L1f
            r3 = 9670(0x25c6, float:1.355E-41)
            goto L36
        L1f:
            r0 = 252(0xfc, float:3.53E-43)
            if (r3 != r0) goto L26
            r3 = 8730(0x221a, float:1.2233E-41)
            goto L36
        L26:
            r0 = 216(0xd8, float:3.03E-43)
            if (r3 != r0) goto L2d
            r3 = 9733(0x2605, float:1.3639E-41)
            goto L36
        L2d:
            r0 = 8211(0x2013, float:1.1506E-41)
            if (r3 == r0) goto L36
            goto L35
        L32:
            r3 = 9632(0x25a0, float:1.3497E-41)
            goto L36
        L35:
            r3 = r1
        L36:
            char r3 = (char) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.ppt.bulletnumber.BulletNumberManage.converterNumberChar(int):char");
    }

    private String getBulletText(Element element) {
        int i10;
        String attributeValue;
        int i11;
        String attributeValue2;
        String attributeValue3;
        if (element != null && element.element("buNone") == null) {
            if (element.attribute("lvl") != null && (attributeValue3 = element.attributeValue("lvl")) != null && attributeValue3.length() > 0) {
                i10 = Integer.parseInt(attributeValue3);
            } else {
                i10 = 0;
            }
            Element element2 = element.element("buAutoNum");
            if (element2 != null) {
                if (element2.attribute("startAt") != null && (attributeValue2 = element2.attributeValue("startAt")) != null && attributeValue2.length() > 0) {
                    i11 = Integer.parseInt(attributeValue2);
                } else {
                    i11 = 1;
                }
                return getText(i10, convertedNumberFormat(element2.attributeValue("type")), i11);
            }
            Element element3 = element.element("buBlip");
            if (element3 != null) {
                if (element3.element("blip") != null && element3.element("blip").attributeValue("embed") != null) {
                    char converterNumberChar = converterNumberChar(108);
                    Integer num = this.lvlFmt.get(Integer.valueOf(i10));
                    if (num == null || num.intValue() != converterNumberChar) {
                        if (num != null && i10 == 0) {
                            this.lvlFmt.clear();
                            this.lvlStartAt.clear();
                            this.lvlNum.clear();
                        }
                        this.lvlFmt.put(Integer.valueOf(i10), Integer.valueOf(converterNumberChar));
                    }
                    return String.valueOf(converterNumberChar);
                }
                return null;
            }
            Element element4 = element.element("buChar");
            if (element4 != null && element4.attribute("char") != null && (attributeValue = element4.attributeValue("char")) != null && attributeValue.length() > 0) {
                char converterNumberChar2 = converterNumberChar(attributeValue.charAt(0));
                Integer num2 = this.lvlFmt.get(Integer.valueOf(i10));
                if (num2 == null || num2.intValue() != converterNumberChar2) {
                    if (num2 != null && i10 == 0) {
                        this.lvlFmt.clear();
                        this.lvlStartAt.clear();
                        this.lvlNum.clear();
                    }
                    this.lvlFmt.put(Integer.valueOf(i10), Integer.valueOf(converterNumberChar2));
                }
                return String.valueOf(converterNumberChar2);
            }
            return null;
        }
        return null;
    }

    private String getText(int i10, int i11, int i12) {
        StringBuffer stringBuffer = new StringBuffer();
        Integer num = this.lvlFmt.get(Integer.valueOf(i10));
        int i13 = 1;
        if (num != null && num.intValue() == i11) {
            Integer num2 = this.lvlStartAt.get(Integer.valueOf(i10));
            if (num2 != null && num2.intValue() == i12) {
                i12 = this.lvlNum.get(Integer.valueOf(i10)).intValue() + 1;
                this.lvlNum.put(Integer.valueOf(i10), Integer.valueOf(i12));
            } else {
                this.lvlStartAt.put(Integer.valueOf(i10), Integer.valueOf(i12));
                this.lvlNum.put(Integer.valueOf(i10), Integer.valueOf(i12));
            }
        } else {
            if (num != null && i10 == 0) {
                this.lvlFmt.clear();
                this.lvlStartAt.clear();
                this.lvlNum.clear();
            }
            this.lvlFmt.put(Integer.valueOf(i10), Integer.valueOf(i11));
            this.lvlStartAt.put(Integer.valueOf(i10), Integer.valueOf(i12));
            this.lvlNum.put(Integer.valueOf(i10), Integer.valueOf(i12));
        }
        if (i11 != 5 && i11 != 6 && i11 != 11) {
            if (i11 != 7 && i11 != 12) {
                i13 = (i11 == 8 || i11 == 13) ? 2 : (i11 == 9 || i11 == 14) ? 3 : (i11 == 10 || i11 == 15) ? 4 : i11;
            }
        } else {
            i13 = 0;
        }
        if (i11 >= 11 && i11 <= 15) {
            stringBuffer.append("(");
        }
        stringBuffer.append(b1.E(i12, i13));
        if (i11 >= 6 && i11 <= 15) {
            stringBuffer.append(")");
        } else if (i11 != 5) {
            stringBuffer.append(".");
        }
        return stringBuffer.toString();
    }

    public static BulletNumberManage instance() {
        if (kit == null) {
            kit = new BulletNumberManage();
        }
        return kit;
    }

    public int addBulletNumber(f fVar, int i10, Element element) {
        Integer num = this.styleBulletIDs.get(Integer.valueOf(i10));
        if (num != null) {
            return num.intValue();
        }
        String bulletText = getBulletText(element);
        if (bulletText != null) {
            Integer num2 = this.bulletIDs.get(bulletText);
            if (num2 != null) {
                if (i10 > 0) {
                    this.styleBulletIDs.put(Integer.valueOf(i10), num2);
                }
                return num2.intValue();
            } else if (fVar != null) {
                r o10 = fVar.o();
                if (o10.f21072e == null) {
                    o10.f21072e = new g(5);
                }
                g gVar = o10.f21072e;
                int size = ((List) gVar.f21833a).size();
                ((List) gVar.f21833a).add(bulletText);
                Integer valueOf = Integer.valueOf(size);
                this.bulletIDs.put(bulletText, valueOf);
                if (i10 > 0) {
                    this.styleBulletIDs.put(Integer.valueOf(i10), valueOf);
                }
                return valueOf.intValue();
            } else {
                return -1;
            }
        } else if (element == null || element.element("buNone") == null) {
            return -1;
        } else {
            this.styleBulletIDs.put(Integer.valueOf(i10), -2);
            return -1;
        }
    }

    public void clearData() {
        Map<Integer, Integer> map = this.lvlFmt;
        if (map != null) {
            map.clear();
        }
        Map<Integer, Integer> map2 = this.lvlStartAt;
        if (map2 != null) {
            map2.clear();
        }
        Map<Integer, Integer> map3 = this.lvlNum;
        if (map3 != null) {
            map3.clear();
        }
    }

    public void dispose() {
        Map<Integer, Integer> map = this.lvlFmt;
        if (map != null) {
            map.clear();
        }
        Map<Integer, Integer> map2 = this.lvlStartAt;
        if (map2 != null) {
            map2.clear();
        }
        Map<Integer, Integer> map3 = this.lvlNum;
        if (map3 != null) {
            map3.clear();
        }
        Map<Integer, Integer> map4 = this.styleBulletIDs;
        if (map4 != null) {
            map4.clear();
        }
        Map<String, Integer> map5 = this.bulletIDs;
        if (map5 != null) {
            map5.clear();
        }
        kit = null;
    }

    public int getBulletID(int i10) {
        Integer num = this.styleBulletIDs.get(Integer.valueOf(i10));
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    private int convertedNumberFormat(String str) {
        if ("arabicPeriod".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("romanUcPeriod".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("romanLcPeriod".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("alphaUcPeriod".equalsIgnoreCase(str)) {
            return 3;
        }
        if ("alphaLcPeriod".equalsIgnoreCase(str)) {
            return 4;
        }
        if ("arabicPlain".equalsIgnoreCase(str) || "circleNumDbPlain".equalsIgnoreCase(str)) {
            return 5;
        }
        if ("arabicParenR".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("romanUcParenR".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("romanLcParenR".equalsIgnoreCase(str)) {
            return 8;
        }
        if ("alphaUcParenR".equalsIgnoreCase(str)) {
            return 9;
        }
        if ("alphaLcParenR".equalsIgnoreCase(str)) {
            return 10;
        }
        if ("arabicParenBoth".equalsIgnoreCase(str)) {
            return 11;
        }
        if ("romanUcParentBoth".equalsIgnoreCase(str)) {
            return 12;
        }
        if ("romanLcParenBoth".equalsIgnoreCase(str)) {
            return 13;
        }
        if ("alphaUcParenBoth".equalsIgnoreCase(str)) {
            return 14;
        }
        if ("alphaLcParenBoth".equalsIgnoreCase(str)) {
            return 15;
        }
        return "ea1JpnChsDbPeriod".equalsIgnoreCase(str) ? 39 : 0;
    }

    public int addBulletNumber(f fVar, int i10, int i11, int i12, char c) {
        String valueOf = String.valueOf(converterNumberChar(c));
        Integer num = this.bulletIDs.get(valueOf);
        if (num != null) {
            return num.intValue();
        }
        r o10 = fVar.o();
        if (o10.f21072e == null) {
            o10.f21072e = new g(5);
        }
        g gVar = o10.f21072e;
        int size = ((List) gVar.f21833a).size();
        ((List) gVar.f21833a).add(valueOf);
        Integer valueOf2 = Integer.valueOf(size);
        this.bulletIDs.put(valueOf, valueOf2);
        return valueOf2.intValue();
    }
}
