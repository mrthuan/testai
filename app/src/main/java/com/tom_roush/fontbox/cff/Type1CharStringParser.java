package com.tom_roush.fontbox.cff;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class Type1CharStringParser {
    static final int CALLOTHERSUBR = 16;
    static final int CALLSUBR = 10;
    static final int POP = 17;
    static final int RETURN = 11;
    static final int TWO_BYTE = 12;
    private final String fontName;
    private final String glyphName;

    public Type1CharStringParser(String str, String str2) {
        this.fontName = str;
        this.glyphName = str2;
    }

    private CharStringCommand readCommand(DataInput dataInput, int i10) {
        if (i10 == 12) {
            return new CharStringCommand(i10, dataInput.readUnsignedByte());
        }
        return new CharStringCommand(i10);
    }

    private Integer readNumber(DataInput dataInput, int i10) {
        if (i10 >= 32 && i10 <= 246) {
            return Integer.valueOf(i10 - 139);
        }
        if (i10 >= 247 && i10 <= 250) {
            return Integer.valueOf(((i10 - 247) * 256) + dataInput.readUnsignedByte() + 108);
        } else if (i10 >= 251 && i10 <= 254) {
            return Integer.valueOf((((-(i10 - 251)) * 256) - dataInput.readUnsignedByte()) - 108);
        } else if (i10 == 255) {
            return Integer.valueOf(dataInput.readInt());
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static Integer removeInteger(List<Object> list) {
        Object remove = list.remove(list.size() - 1);
        if (remove instanceof Integer) {
            return (Integer) remove;
        }
        CharStringCommand charStringCommand = (CharStringCommand) remove;
        if (charStringCommand.getKey().getValue()[0] == 12 && charStringCommand.getKey().getValue()[1] == 12) {
            return Integer.valueOf(((Integer) list.remove(list.size() - 1)).intValue() / ((Integer) list.remove(list.size() - 1)).intValue());
        }
        throw new IOException("Unexpected char string command: " + charStringCommand.getKey());
    }

    public List<Object> parse(byte[] bArr, List<byte[]> list) {
        return parse(bArr, list, new ArrayList());
    }

    private List<Object> parse(byte[] bArr, List<byte[]> list, List<Object> list2) {
        DataInput dataInput = new DataInput(bArr);
        while (dataInput.hasRemaining()) {
            int readUnsignedByte = dataInput.readUnsignedByte();
            if (readUnsignedByte == 10) {
                Object remove = list2.remove(list2.size() - 1);
                if (!(remove instanceof Integer)) {
                    Objects.toString(remove);
                } else {
                    Integer num = (Integer) remove;
                    if (num.intValue() >= 0 && num.intValue() < list.size()) {
                        parse(list.get(num.intValue()), list, list2);
                        Object obj = list2.get(list2.size() - 1);
                        if ((obj instanceof CharStringCommand) && ((CharStringCommand) obj).getKey().getValue()[0] == 11) {
                            list2.remove(list2.size() - 1);
                        }
                    } else {
                        list.size();
                        while (list2.get(list2.size() - 1) instanceof Integer) {
                            list2.remove(list2.size() - 1);
                        }
                    }
                }
            } else if (readUnsignedByte == 12 && dataInput.peekUnsignedByte(0) == 16) {
                dataInput.readByte();
                Integer num2 = (Integer) list2.remove(list2.size() - 1);
                ArrayDeque arrayDeque = new ArrayDeque();
                int intValue = ((Integer) list2.remove(list2.size() - 1)).intValue();
                if (intValue == 0) {
                    arrayDeque.push(removeInteger(list2));
                    arrayDeque.push(removeInteger(list2));
                    list2.remove(list2.size() - 1);
                    list2.add(0);
                    list2.add(new CharStringCommand(12, 16));
                } else if (intValue == 1) {
                    list2.add(1);
                    list2.add(new CharStringCommand(12, 16));
                } else if (intValue != 3) {
                    for (int i10 = 0; i10 < num2.intValue(); i10++) {
                        arrayDeque.push(removeInteger(list2));
                    }
                } else {
                    arrayDeque.push(removeInteger(list2));
                }
                while (dataInput.peekUnsignedByte(0) == 12 && dataInput.peekUnsignedByte(1) == 17) {
                    dataInput.readByte();
                    dataInput.readByte();
                    list2.add(arrayDeque.pop());
                }
                arrayDeque.size();
            } else if (readUnsignedByte >= 0 && readUnsignedByte <= 31) {
                list2.add(readCommand(dataInput, readUnsignedByte));
            } else if (readUnsignedByte >= 32 && readUnsignedByte <= 255) {
                list2.add(readNumber(dataInput, readUnsignedByte));
            } else {
                throw new IllegalArgumentException();
            }
        }
        return list2;
    }
}
