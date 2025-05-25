package com.tom_roush.fontbox.cff;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class Type2CharStringParser {
    private final String fontName;
    private final String glyphName;
    private int hstemCount = 0;
    private int vstemCount = 0;
    private List<Object> sequence = null;

    public Type2CharStringParser(String str, String str2) {
        this.fontName = str;
        this.glyphName = str2;
    }

    private int getMaskLength() {
        int i10 = this.hstemCount + this.vstemCount;
        int i11 = i10 / 8;
        if (i10 % 8 > 0) {
            return i11 + 1;
        }
        return i11;
    }

    private List<Number> peekNumbers() {
        ArrayList arrayList = new ArrayList();
        int size = this.sequence.size();
        while (true) {
            size--;
            if (size > -1) {
                Object obj = this.sequence.get(size);
                if (!(obj instanceof Number)) {
                    return arrayList;
                }
                arrayList.add(0, (Number) obj);
            } else {
                return arrayList;
            }
        }
    }

    private CharStringCommand readCommand(int i10, DataInput dataInput) {
        if (i10 != 1 && i10 != 18) {
            if (i10 == 3 || i10 == 19 || i10 == 20 || i10 == 23) {
                this.vstemCount = (peekNumbers().size() / 2) + this.vstemCount;
            }
        } else {
            this.hstemCount = (peekNumbers().size() / 2) + this.hstemCount;
        }
        if (i10 == 12) {
            return new CharStringCommand(i10, dataInput.readUnsignedByte());
        }
        if (i10 != 19 && i10 != 20) {
            return new CharStringCommand(i10);
        }
        int maskLength = getMaskLength() + 1;
        int[] iArr = new int[maskLength];
        iArr[0] = i10;
        for (int i11 = 1; i11 < maskLength; i11++) {
            iArr[i11] = dataInput.readUnsignedByte();
        }
        return new CharStringCommand(iArr);
    }

    private Number readNumber(int i10, DataInput dataInput) {
        if (i10 == 28) {
            return Integer.valueOf(dataInput.readShort());
        }
        if (i10 >= 32 && i10 <= 246) {
            return Integer.valueOf(i10 - 139);
        }
        if (i10 >= 247 && i10 <= 250) {
            return Integer.valueOf(((i10 - 247) * 256) + dataInput.readUnsignedByte() + 108);
        } else if (i10 >= 251 && i10 <= 254) {
            return Integer.valueOf((((-(i10 - 251)) * 256) - dataInput.readUnsignedByte()) - 108);
        } else if (i10 == 255) {
            return Double.valueOf(dataInput.readShort() + (dataInput.readUnsignedShort() / 65535.0d));
        } else {
            throw new IllegalArgumentException();
        }
    }

    public List<Object> parse(byte[] bArr, byte[][] bArr2, byte[][] bArr3) {
        return parse(bArr, bArr2, bArr3, true);
    }

    private List<Object> parse(byte[] bArr, byte[][] bArr2, byte[][] bArr3, boolean z10) {
        if (z10) {
            this.hstemCount = 0;
            this.vstemCount = 0;
            this.sequence = new ArrayList();
        }
        DataInput dataInput = new DataInput(bArr);
        boolean z11 = bArr3 != null && bArr3.length > 0;
        boolean z12 = bArr2 != null && bArr2.length > 0;
        while (dataInput.hasRemaining()) {
            int readUnsignedByte = dataInput.readUnsignedByte();
            int i10 = 1131;
            if (readUnsignedByte == 10 && z11) {
                List<Object> list = this.sequence;
                Integer num = (Integer) list.remove(list.size() - 1);
                int length = bArr3.length;
                if (length < 1240) {
                    i10 = 107;
                } else if (length >= 33900) {
                    i10 = 32768;
                }
                int intValue = num.intValue() + i10;
                if (intValue < bArr3.length) {
                    parse(bArr3[intValue], bArr2, bArr3, false);
                    List<Object> list2 = this.sequence;
                    Object obj = list2.get(list2.size() - 1);
                    if ((obj instanceof CharStringCommand) && ((CharStringCommand) obj).getKey().getValue()[0] == 11) {
                        List<Object> list3 = this.sequence;
                        list3.remove(list3.size() - 1);
                    }
                }
            } else if (readUnsignedByte == 29 && z12) {
                List<Object> list4 = this.sequence;
                Integer num2 = (Integer) list4.remove(list4.size() - 1);
                int length2 = bArr2.length;
                if (length2 < 1240) {
                    i10 = 107;
                } else if (length2 >= 33900) {
                    i10 = 32768;
                }
                int intValue2 = num2.intValue() + i10;
                if (intValue2 < bArr2.length) {
                    parse(bArr2[intValue2], bArr2, bArr3, false);
                    List<Object> list5 = this.sequence;
                    Object obj2 = list5.get(list5.size() - 1);
                    if ((obj2 instanceof CharStringCommand) && ((CharStringCommand) obj2).getKey().getValue()[0] == 11) {
                        List<Object> list6 = this.sequence;
                        list6.remove(list6.size() - 1);
                    }
                }
            } else if (readUnsignedByte >= 0 && readUnsignedByte <= 27) {
                this.sequence.add(readCommand(readUnsignedByte, dataInput));
            } else if (readUnsignedByte == 28) {
                this.sequence.add(readNumber(readUnsignedByte, dataInput));
            } else if (readUnsignedByte >= 29 && readUnsignedByte <= 31) {
                this.sequence.add(readCommand(readUnsignedByte, dataInput));
            } else if (readUnsignedByte >= 32 && readUnsignedByte <= 255) {
                this.sequence.add(readNumber(readUnsignedByte, dataInput));
            } else {
                throw new IllegalArgumentException();
            }
        }
        return this.sequence;
    }

    public Type2CharStringParser(String str, int i10) {
        this.fontName = str;
        this.glyphName = String.format(Locale.US, "%04x", Integer.valueOf(i10));
    }
}
