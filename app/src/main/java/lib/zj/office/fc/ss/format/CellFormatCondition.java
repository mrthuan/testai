package lib.zj.office.fc.ss.format;

import b.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class CellFormatCondition {
    private static final int EQ = 4;
    private static final int GE = 3;
    private static final int GT = 2;
    private static final int LE = 1;
    private static final int LT = 0;
    private static final int NE = 5;
    private static final Map<String, Integer> TESTS;

    static {
        HashMap hashMap = new HashMap();
        TESTS = hashMap;
        a.h(0, hashMap, "<", 1, "<=", 2, ">", 3, ">=");
        hashMap.put("=", 4);
        hashMap.put("==", 4);
        hashMap.put("!=", 5);
        hashMap.put("<>", 5);
    }

    public static CellFormatCondition getInstance(String str, String str2) {
        Map<String, Integer> map = TESTS;
        if (map.containsKey(str)) {
            int intValue = map.get(str).intValue();
            final double parseDouble = Double.parseDouble(str2);
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue != 4) {
                                if (intValue == 5) {
                                    return new CellFormatCondition() { // from class: lib.zj.office.fc.ss.format.CellFormatCondition.6
                                        @Override // lib.zj.office.fc.ss.format.CellFormatCondition
                                        public boolean pass(double d10) {
                                            if (d10 != parseDouble) {
                                                return true;
                                            }
                                            return false;
                                        }
                                    };
                                }
                                throw new IllegalArgumentException("Cannot create for test number " + intValue + "(\"" + str + "\")");
                            }
                            return new CellFormatCondition() { // from class: lib.zj.office.fc.ss.format.CellFormatCondition.5
                                @Override // lib.zj.office.fc.ss.format.CellFormatCondition
                                public boolean pass(double d10) {
                                    if (d10 == parseDouble) {
                                        return true;
                                    }
                                    return false;
                                }
                            };
                        }
                        return new CellFormatCondition() { // from class: lib.zj.office.fc.ss.format.CellFormatCondition.4
                            @Override // lib.zj.office.fc.ss.format.CellFormatCondition
                            public boolean pass(double d10) {
                                if (d10 >= parseDouble) {
                                    return true;
                                }
                                return false;
                            }
                        };
                    }
                    return new CellFormatCondition() { // from class: lib.zj.office.fc.ss.format.CellFormatCondition.3
                        @Override // lib.zj.office.fc.ss.format.CellFormatCondition
                        public boolean pass(double d10) {
                            if (d10 > parseDouble) {
                                return true;
                            }
                            return false;
                        }
                    };
                }
                return new CellFormatCondition() { // from class: lib.zj.office.fc.ss.format.CellFormatCondition.2
                    @Override // lib.zj.office.fc.ss.format.CellFormatCondition
                    public boolean pass(double d10) {
                        if (d10 <= parseDouble) {
                            return true;
                        }
                        return false;
                    }
                };
            }
            return new CellFormatCondition() { // from class: lib.zj.office.fc.ss.format.CellFormatCondition.1
                @Override // lib.zj.office.fc.ss.format.CellFormatCondition
                public boolean pass(double d10) {
                    if (d10 < parseDouble) {
                        return true;
                    }
                    return false;
                }
            };
        }
        throw new IllegalArgumentException(a0.a.h("Unknown test: ", str));
    }

    public abstract boolean pass(double d10);
}
