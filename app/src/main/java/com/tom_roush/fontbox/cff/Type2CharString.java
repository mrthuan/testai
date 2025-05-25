package com.tom_roush.fontbox.cff;

import a0.a;
import com.tom_roush.fontbox.type1.Type1CharStringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class Type2CharString extends Type1CharString {
    private float defWidthX;
    private final int gid;
    private float nominalWidthX;
    private int pathCount;
    private final List<Object> type2sequence;

    public Type2CharString(Type1CharStringReader type1CharStringReader, String str, String str2, int i10, List<Object> list, int i11, int i12) {
        super(type1CharStringReader, str, str2);
        this.pathCount = 0;
        this.gid = i10;
        this.type2sequence = list;
        this.defWidthX = i11;
        this.nominalWidthX = i12;
        convertType1ToType2(list);
    }

    private void addCommand(List<Number> list, CharStringCommand charStringCommand) {
        this.type1Sequence.addAll(list);
        this.type1Sequence.add(charStringCommand);
    }

    private void addCommandList(List<List<Number>> list, CharStringCommand charStringCommand) {
        for (List<Number> list2 : list) {
            addCommand(list2, charStringCommand);
        }
    }

    private List<Number> clearStack(List<Number> list, boolean z10) {
        if (this.type1Sequence.isEmpty()) {
            if (z10) {
                addCommand(Arrays.asList(Float.valueOf(0.0f), Float.valueOf(list.get(0).floatValue() + this.nominalWidthX)), new CharStringCommand(13));
                return list.subList(1, list.size());
            }
            addCommand(Arrays.asList(Float.valueOf(0.0f), Float.valueOf(this.defWidthX)), new CharStringCommand(13));
            return list;
        }
        return list;
    }

    private void closeCharString2Path() {
        CharStringCommand charStringCommand;
        if (this.pathCount > 0) {
            charStringCommand = (CharStringCommand) a.f(this.type1Sequence, -1);
        } else {
            charStringCommand = null;
        }
        CharStringCommand charStringCommand2 = new CharStringCommand(9);
        if (charStringCommand != null && !charStringCommand2.equals(charStringCommand)) {
            addCommand(Collections.emptyList(), charStringCommand2);
        }
    }

    private void convertType1ToType2(List<Object> list) {
        this.type1Sequence = new ArrayList();
        this.pathCount = 0;
        new CharStringHandler() { // from class: com.tom_roush.fontbox.cff.Type2CharString.1
            @Override // com.tom_roush.fontbox.cff.CharStringHandler
            public List<Number> handleCommand(List<Number> list2, CharStringCommand charStringCommand) {
                return Type2CharString.this.handleCommand(list2, charStringCommand);
            }
        }.handleSequence(list);
    }

    private void drawAlternatingCurve(List<Number> list, boolean z10) {
        boolean z11;
        Number number;
        Number number2;
        while (true) {
            int i10 = 4;
            if (list.size() >= 4) {
                if (list.size() == 5) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10) {
                    Number[] numberArr = new Number[6];
                    numberArr[0] = list.get(0);
                    numberArr[1] = 0;
                    numberArr[2] = list.get(1);
                    numberArr[3] = list.get(2);
                    if (z11) {
                        number2 = list.get(4);
                    } else {
                        number2 = 0;
                    }
                    numberArr[4] = number2;
                    numberArr[5] = list.get(3);
                    addCommand(Arrays.asList(numberArr), new CharStringCommand(8));
                } else {
                    Number[] numberArr2 = new Number[6];
                    numberArr2[0] = 0;
                    numberArr2[1] = list.get(0);
                    numberArr2[2] = list.get(1);
                    numberArr2[3] = list.get(2);
                    numberArr2[4] = list.get(3);
                    if (z11) {
                        number = list.get(4);
                    } else {
                        number = 0;
                    }
                    numberArr2[5] = number;
                    addCommand(Arrays.asList(numberArr2), new CharStringCommand(8));
                }
                if (z11) {
                    i10 = 5;
                }
                list = list.subList(i10, list.size());
                z10 = !z10;
            } else {
                return;
            }
        }
    }

    private void drawAlternatingLine(List<Number> list, boolean z10) {
        int i10;
        while (!list.isEmpty()) {
            List<Number> subList = list.subList(0, 1);
            if (z10) {
                i10 = 6;
            } else {
                i10 = 7;
            }
            addCommand(subList, new CharStringCommand(i10));
            list = list.subList(1, list.size());
            z10 = !z10;
        }
    }

    private void drawCurve(List<Number> list, boolean z10) {
        int i10;
        Number number;
        Number number2;
        while (true) {
            int i11 = 4;
            if (list.size() >= 4) {
                int i12 = 1;
                if (list.size() % 4 == 1) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i13 = 3;
                int i14 = 2;
                if (z10) {
                    Number[] numberArr = new Number[6];
                    numberArr[0] = list.get(i10);
                    if (i10 != 0) {
                        number2 = list.get(0);
                    } else {
                        number2 = 0;
                    }
                    numberArr[1] = number2;
                    if (i10 != 0) {
                        i12 = 2;
                    }
                    numberArr[2] = list.get(i12);
                    if (i10 != 0) {
                        i14 = 3;
                    }
                    numberArr[3] = list.get(i14);
                    if (i10 != 0) {
                        i13 = 4;
                    }
                    numberArr[4] = list.get(i13);
                    numberArr[5] = 0;
                    addCommand(Arrays.asList(numberArr), new CharStringCommand(8));
                } else {
                    Number[] numberArr2 = new Number[6];
                    if (i10 != 0) {
                        number = list.get(0);
                    } else {
                        number = 0;
                    }
                    numberArr2[0] = number;
                    numberArr2[1] = list.get(i10);
                    if (i10 != 0) {
                        i12 = 2;
                    }
                    numberArr2[2] = list.get(i12);
                    if (i10 != 0) {
                        i14 = 3;
                    }
                    numberArr2[3] = list.get(i14);
                    numberArr2[4] = 0;
                    if (i10 != 0) {
                        i13 = 4;
                    }
                    numberArr2[5] = list.get(i13);
                    addCommand(Arrays.asList(numberArr2), new CharStringCommand(8));
                }
                if (i10 != 0) {
                    i11 = 5;
                }
                list = list.subList(i11, list.size());
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Number> handleCommand(List<Number> list, CharStringCommand charStringCommand) {
        Number valueOf;
        Number number;
        boolean z10 = true;
        this.commandCount++;
        String str = CharStringCommand.TYPE2_VOCABULARY.get(charStringCommand.getKey());
        boolean z11 = false;
        if ("hstem".equals(str)) {
            if (list.size() % 2 != 0) {
                z11 = true;
            }
            expandStemHints(clearStack(list, z11), true);
            return null;
        } else if ("vstem".equals(str)) {
            if (list.size() % 2 == 0) {
                z10 = false;
            }
            expandStemHints(clearStack(list, z10), false);
            return null;
        } else if ("vmoveto".equals(str)) {
            if (list.size() <= 1) {
                z10 = false;
            }
            List<Number> clearStack = clearStack(list, z10);
            markPath();
            addCommand(clearStack, charStringCommand);
            return null;
        } else if ("rlineto".equals(str)) {
            addCommandList(split(list, 2), charStringCommand);
            return null;
        } else if ("hlineto".equals(str)) {
            drawAlternatingLine(list, true);
            return null;
        } else if ("vlineto".equals(str)) {
            drawAlternatingLine(list, false);
            return null;
        } else if ("rrcurveto".equals(str)) {
            addCommandList(split(list, 6), charStringCommand);
            return null;
        } else if ("endchar".equals(str)) {
            if (list.size() != 5 && list.size() != 1) {
                z10 = false;
            }
            List<Number> clearStack2 = clearStack(list, z10);
            closeCharString2Path();
            if (clearStack2.size() == 4) {
                clearStack2.add(0, 0);
                addCommand(clearStack2, new CharStringCommand(12, 6));
                return null;
            }
            addCommand(clearStack2, charStringCommand);
            return null;
        } else if ("rmoveto".equals(str)) {
            if (list.size() <= 2) {
                z10 = false;
            }
            List<Number> clearStack3 = clearStack(list, z10);
            markPath();
            addCommand(clearStack3, charStringCommand);
            return null;
        } else if ("hmoveto".equals(str)) {
            if (list.size() <= 1) {
                z10 = false;
            }
            List<Number> clearStack4 = clearStack(list, z10);
            markPath();
            addCommand(clearStack4, charStringCommand);
            return null;
        } else if ("vhcurveto".equals(str)) {
            drawAlternatingCurve(list, false);
            return null;
        } else if ("hvcurveto".equals(str)) {
            drawAlternatingCurve(list, true);
            return null;
        } else if ("hflex".equals(str)) {
            addCommandList(Arrays.asList(Arrays.asList(list.get(0), 0, list.get(1), list.get(2), list.get(3), 0), Arrays.asList(list.get(4), 0, list.get(5), Float.valueOf(-list.get(2).floatValue()), list.get(6), 0)), new CharStringCommand(8));
            return null;
        } else if ("flex".equals(str)) {
            addCommandList(Arrays.asList(list.subList(0, 6), list.subList(6, 12)), new CharStringCommand(8));
            return null;
        } else if ("hflex1".equals(str)) {
            addCommandList(Arrays.asList(Arrays.asList(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), 0), Arrays.asList(list.get(5), 0, list.get(6), list.get(7), list.get(8), 0)), new CharStringCommand(8));
            return null;
        } else if ("flex1".equals(str)) {
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = i12 * 2;
                i10 += list.get(i13).intValue();
                i11 += list.get(i13 + 1).intValue();
            }
            List<Number> subList = list.subList(0, 6);
            Number[] numberArr = new Number[6];
            numberArr[0] = list.get(6);
            numberArr[1] = list.get(7);
            numberArr[2] = list.get(8);
            numberArr[3] = list.get(9);
            if (Math.abs(i10) > Math.abs(i11)) {
                valueOf = list.get(10);
            } else {
                valueOf = Integer.valueOf(-i10);
            }
            numberArr[4] = valueOf;
            if (Math.abs(i10) > Math.abs(i11)) {
                number = Integer.valueOf(-i11);
            } else {
                number = list.get(10);
            }
            numberArr[5] = number;
            addCommandList(Arrays.asList(subList, Arrays.asList(numberArr)), new CharStringCommand(8));
            return null;
        } else if ("hstemhm".equals(str)) {
            if (list.size() % 2 != 0) {
                z11 = true;
            }
            expandStemHints(clearStack(list, z11), true);
            return null;
        } else if (!"hintmask".equals(str) && !"cntrmask".equals(str)) {
            if ("vstemhm".equals(str)) {
                if (list.size() % 2 == 0) {
                    z10 = false;
                }
                expandStemHints(clearStack(list, z10), false);
                return null;
            } else if ("rcurveline".equals(str)) {
                if (list.size() >= 2) {
                    addCommandList(split(list.subList(0, list.size() - 2), 6), new CharStringCommand(8));
                    addCommand(list.subList(list.size() - 2, list.size()), new CharStringCommand(5));
                    return null;
                }
                return null;
            } else if ("rlinecurve".equals(str)) {
                if (list.size() >= 6) {
                    addCommandList(split(list.subList(0, list.size() - 6), 2), new CharStringCommand(5));
                    addCommand(list.subList(list.size() - 6, list.size()), new CharStringCommand(8));
                    return null;
                }
                return null;
            } else if ("vvcurveto".equals(str)) {
                drawCurve(list, false);
                return null;
            } else if ("hhcurveto".equals(str)) {
                drawCurve(list, true);
                return null;
            } else {
                addCommand(list, charStringCommand);
                return null;
            }
        } else {
            if (list.size() % 2 == 0) {
                z10 = false;
            }
            List<Number> clearStack5 = clearStack(list, z10);
            if (!clearStack5.isEmpty()) {
                expandStemHints(clearStack5, false);
                return null;
            }
            return null;
        }
    }

    private void markPath() {
        if (this.pathCount > 0) {
            closeCharString2Path();
        }
        this.pathCount++;
    }

    private static <E> List<List<E>> split(List<E> list, int i10) {
        int size = list.size() / i10;
        ArrayList arrayList = new ArrayList(size);
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 * i10;
            i11++;
            arrayList.add(list.subList(i12, i11 * i10));
        }
        return arrayList;
    }

    public int getGID() {
        return this.gid;
    }

    public List<Object> getType2Sequence() {
        return this.type2sequence;
    }

    private void expandStemHints(List<Number> list, boolean z10) {
    }
}
