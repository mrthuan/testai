package com.tom_roush.fontbox.type1;

import com.tom_roush.fontbox.afm.AFMParser;
import com.tom_roush.fontbox.encoding.BuiltInEncoding;
import com.tom_roush.fontbox.encoding.StandardEncoding;
import com.tom_roush.fontbox.type1.Token;
import com.tom_roush.pdfbox.pdfparser.BaseParser;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes2.dex */
final class Type1Parser {
    private static final int CHARSTRING_KEY = 4330;
    private static final int EEXEC_KEY = 55665;
    private Type1Font font;
    private Type1Lexer lexer;

    private List<Number> arrayToNumbers(List<Token> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size() - 1;
        for (int i10 = 1; i10 < size; i10++) {
            Token token = list.get(i10);
            if (token.getKind() == Token.REAL) {
                arrayList.add(Float.valueOf(token.floatValue()));
            } else if (token.getKind() == Token.INTEGER) {
                arrayList.add(Integer.valueOf(token.intValue()));
            } else {
                throw new IOException("Expected INTEGER or REAL but got " + token + " at array position " + i10);
            }
        }
        return arrayList;
    }

    private byte[] decrypt(byte[] bArr, int i10, int i11) {
        if (i11 == -1) {
            return bArr;
        }
        if (bArr.length != 0 && i11 <= bArr.length) {
            byte[] bArr2 = new byte[bArr.length - i11];
            for (int i12 = 0; i12 < bArr.length; i12++) {
                int i13 = bArr[i12] & FunctionEval.FunctionID.EXTERNAL_FUNC;
                int i14 = (i10 >> 8) ^ i13;
                if (i12 >= i11) {
                    bArr2[i12 - i11] = (byte) i14;
                }
                i10 = 65535 & (((i13 + i10) * 52845) + 22719);
            }
            return bArr2;
        }
        return new byte[0];
    }

    private byte[] hexToBinary(byte[] bArr) {
        int i10 = 0;
        for (byte b10 : bArr) {
            if (Character.digit((char) b10, 16) != -1) {
                i10++;
            }
        }
        byte[] bArr2 = new byte[i10 / 2];
        int i11 = 0;
        int i12 = -1;
        for (byte b11 : bArr) {
            int digit = Character.digit((char) b11, 16);
            if (digit != -1) {
                if (i12 == -1) {
                    i12 = digit;
                } else {
                    bArr2[i11] = (byte) ((i12 * 16) + digit);
                    i12 = -1;
                    i11++;
                }
            }
        }
        return bArr2;
    }

    private boolean isBinary(byte[] bArr) {
        if (bArr.length < 4) {
            return true;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            byte b10 = bArr[i10];
            if (b10 != 10 && b10 != 13 && b10 != 32 && b10 != 9 && Character.digit((char) b10, 16) == -1) {
                return true;
            }
        }
        return false;
    }

    private void parseASCII(byte[] bArr) {
        Token peekToken;
        if (bArr.length != 0) {
            if (bArr.length >= 2) {
                if (bArr[0] == 37 || bArr[1] == 33) {
                    Type1Lexer type1Lexer = new Type1Lexer(bArr);
                    this.lexer = type1Lexer;
                    if (type1Lexer.peekToken().getText().equals("FontDirectory")) {
                        Token.Kind kind = Token.NAME;
                        read(kind, "FontDirectory");
                        read(Token.LITERAL);
                        read(kind, "known");
                        Token.Kind kind2 = Token.START_PROC;
                        read(kind2);
                        readProcVoid();
                        read(kind2);
                        readProcVoid();
                        read(kind, "ifelse");
                    }
                    int intValue = read(Token.INTEGER).intValue();
                    Token.Kind kind3 = Token.NAME;
                    read(kind3, "dict");
                    readMaybe(kind3, "dup");
                    read(kind3, "begin");
                    for (int i10 = 0; i10 < intValue && (peekToken = this.lexer.peekToken()) != null && (peekToken.getKind() != Token.NAME || (!peekToken.getText().equals("currentdict") && !peekToken.getText().equals("end"))); i10++) {
                        String text = read(Token.LITERAL).getText();
                        if (!text.equals("FontInfo") && !text.equals("Fontinfo")) {
                            if (text.equals("Metrics")) {
                                readSimpleDict();
                            } else if (text.equals("Encoding")) {
                                readEncoding();
                            } else {
                                readSimpleValue(text);
                            }
                        } else {
                            readFontInfo(readSimpleDict());
                        }
                    }
                    Token.Kind kind4 = Token.NAME;
                    readMaybe(kind4, "currentdict");
                    read(kind4, "end");
                    read(kind4, "currentfile");
                    read(kind4, "eexec");
                    return;
                }
            }
            throw new IOException("Invalid start of ASCII segment of type 1 font");
        }
        throw new IOException("ASCII segment of type 1 font is empty");
    }

    private void parseBinary(byte[] bArr) {
        byte[] decrypt;
        int i10 = 4;
        if (isBinary(bArr)) {
            decrypt = decrypt(bArr, EEXEC_KEY, 4);
        } else {
            decrypt = decrypt(hexToBinary(bArr), EEXEC_KEY, 4);
        }
        Type1Lexer type1Lexer = new Type1Lexer(decrypt);
        this.lexer = type1Lexer;
        Token peekToken = type1Lexer.peekToken();
        while (peekToken != null && !peekToken.getText().equals(StandardStructureTypes.PRIVATE)) {
            this.lexer.nextToken();
            peekToken = this.lexer.peekToken();
        }
        if (peekToken != null) {
            read(Token.LITERAL, StandardStructureTypes.PRIVATE);
            int intValue = read(Token.INTEGER).intValue();
            Token.Kind kind = Token.NAME;
            read(kind, "dict");
            readMaybe(kind, "dup");
            read(kind, "begin");
            for (int i11 = 0; i11 < intValue && this.lexer.peekToken() != null; i11++) {
                Token.Kind kind2 = this.lexer.peekToken().getKind();
                Token.Kind kind3 = Token.LITERAL;
                if (kind2 != kind3) {
                    break;
                }
                String text = read(kind3).getText();
                if ("Subrs".equals(text)) {
                    readSubrs(i10);
                } else if ("OtherSubrs".equals(text)) {
                    readOtherSubrs();
                } else if ("lenIV".equals(text)) {
                    i10 = readDictValue().get(0).intValue();
                } else if ("ND".equals(text)) {
                    read(Token.START_PROC);
                    Token.Kind kind4 = Token.NAME;
                    readMaybe(kind4, "noaccess");
                    read(kind4, BaseParser.DEF);
                    read(Token.END_PROC);
                    readMaybe(kind4, "executeonly");
                    read(kind4, BaseParser.DEF);
                } else if ("NP".equals(text)) {
                    read(Token.START_PROC);
                    Token.Kind kind5 = Token.NAME;
                    readMaybe(kind5, "noaccess");
                    read(kind5);
                    read(Token.END_PROC);
                    readMaybe(kind5, "executeonly");
                    read(kind5, BaseParser.DEF);
                } else if ("RD".equals(text)) {
                    read(Token.START_PROC);
                    readProcVoid();
                    Token.Kind kind6 = Token.NAME;
                    readMaybe(kind6, "bind");
                    readMaybe(kind6, "executeonly");
                    read(kind6, BaseParser.DEF);
                } else {
                    readPrivate(text, readDictValue());
                }
            }
            while (true) {
                Token.Kind kind7 = this.lexer.peekToken().getKind();
                Token.Kind kind8 = Token.LITERAL;
                if (kind7 == kind8 && this.lexer.peekToken().getText().equals("CharStrings")) {
                    read(kind8, "CharStrings");
                    readCharStrings(i10);
                    return;
                }
                this.lexer.nextToken();
            }
        } else {
            throw new IOException("/Private token not found");
        }
    }

    private Token read(Token.Kind kind) {
        Token nextToken = this.lexer.nextToken();
        if (nextToken == null || nextToken.getKind() != kind) {
            throw new IOException("Found " + nextToken + " but expected " + kind);
        }
        return nextToken;
    }

    private void readCharStrings(int i10) {
        int intValue = read(Token.INTEGER).intValue();
        Token.Kind kind = Token.NAME;
        read(kind, "dict");
        read(kind, "dup");
        read(kind, "begin");
        for (int i11 = 0; i11 < intValue && this.lexer.peekToken() != null && (this.lexer.peekToken().getKind() != Token.NAME || !this.lexer.peekToken().getText().equals("end")); i11++) {
            String text = read(Token.LITERAL).getText();
            read(Token.INTEGER);
            this.font.charstrings.put(text, decrypt(read(Token.CHARSTRING).getData(), CHARSTRING_KEY, i10));
            readDef();
        }
        read(Token.NAME, "end");
    }

    private void readDef() {
        Token.Kind kind = Token.NAME;
        readMaybe(kind, "readonly");
        readMaybe(kind, "noaccess");
        Token read = read(kind);
        if (!read.getText().equals("ND") && !read.getText().equals("|-")) {
            if (read.getText().equals("noaccess")) {
                read = read(kind);
            }
            if (read.getText().equals(BaseParser.DEF)) {
                return;
            }
            throw new IOException("Found " + read + " but expected ND");
        }
    }

    private List<Token> readDictValue() {
        List<Token> readValue = readValue();
        readDef();
        return readValue;
    }

    private void readEncoding() {
        Token.Kind kind;
        Token.Kind kind2 = this.lexer.peekToken().getKind();
        Token.Kind kind3 = Token.NAME;
        if (kind2 == kind3) {
            String text = this.lexer.nextToken().getText();
            if (text.equals("StandardEncoding")) {
                this.font.encoding = StandardEncoding.INSTANCE;
                readMaybe(kind3, "readonly");
                read(kind3, BaseParser.DEF);
                return;
            }
            throw new IOException("Unknown encoding: ".concat(text));
        }
        read(Token.INTEGER).intValue();
        readMaybe(kind3, "array");
        while (true) {
            if (this.lexer.peekToken().getKind() != Token.NAME || (!this.lexer.peekToken().getText().equals("dup") && !this.lexer.peekToken().getText().equals("readonly") && !this.lexer.peekToken().getText().equals(BaseParser.DEF))) {
                this.lexer.nextToken();
            }
        }
        HashMap hashMap = new HashMap();
        while (true) {
            Token.Kind kind4 = this.lexer.peekToken().getKind();
            kind = Token.NAME;
            if (kind4 != kind || !this.lexer.peekToken().getText().equals("dup")) {
                break;
            }
            read(kind, "dup");
            int intValue = read(Token.INTEGER).intValue();
            String text2 = read(Token.LITERAL).getText();
            read(kind, "put");
            hashMap.put(Integer.valueOf(intValue), text2);
        }
        this.font.encoding = new BuiltInEncoding(hashMap);
        readMaybe(kind, "readonly");
        read(kind, BaseParser.DEF);
    }

    private void readFontInfo(Map<String, List<Token>> map) {
        for (Map.Entry<String, List<Token>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<Token> value = entry.getValue();
            if (key.equals("version")) {
                this.font.version = value.get(0).getText();
            } else if (key.equals(AFMParser.NOTICE)) {
                this.font.notice = value.get(0).getText();
            } else if (key.equals(AFMParser.FULL_NAME)) {
                this.font.fullName = value.get(0).getText();
            } else if (key.equals(AFMParser.FAMILY_NAME)) {
                this.font.familyName = value.get(0).getText();
            } else if (key.equals(AFMParser.WEIGHT)) {
                this.font.weight = value.get(0).getText();
            } else if (key.equals(AFMParser.ITALIC_ANGLE)) {
                this.font.italicAngle = value.get(0).floatValue();
            } else if (key.equals("isFixedPitch")) {
                this.font.isFixedPitch = value.get(0).booleanValue();
            } else if (key.equals(AFMParser.UNDERLINE_POSITION)) {
                this.font.underlinePosition = value.get(0).floatValue();
            } else if (key.equals(AFMParser.UNDERLINE_THICKNESS)) {
                this.font.underlineThickness = value.get(0).floatValue();
            }
        }
    }

    private Token readMaybe(Token.Kind kind, String str) {
        Token peekToken = this.lexer.peekToken();
        if (peekToken != null && peekToken.getKind() == kind && peekToken.getText().equals(str)) {
            return this.lexer.nextToken();
        }
        return null;
    }

    private void readOtherSubrs() {
        if (this.lexer.peekToken().getKind() == Token.START_ARRAY) {
            readValue();
            readDef();
            return;
        }
        int intValue = read(Token.INTEGER).intValue();
        read(Token.NAME, "array");
        for (int i10 = 0; i10 < intValue; i10++) {
            read(Token.NAME, "dup");
            read(Token.INTEGER);
            readValue();
            readPut();
        }
        readDef();
    }

    private void readPostScriptWrapper(List<Token> list) {
        if (this.lexer.peekToken().getText().equals("systemdict")) {
            Token.Kind kind = Token.NAME;
            read(kind, "systemdict");
            read(Token.LITERAL, "internaldict");
            read(kind, "known");
            Token.Kind kind2 = Token.START_PROC;
            read(kind2);
            readProcVoid();
            read(kind2);
            readProcVoid();
            read(kind, "ifelse");
            read(kind2);
            read(kind, "pop");
            list.clear();
            list.addAll(readValue());
            read(Token.END_PROC);
            read(kind, "if");
        }
    }

    private void readPrivate(String str, List<Token> list) {
        if (str.equals("BlueValues")) {
            this.font.blueValues = arrayToNumbers(list);
        } else if (str.equals("OtherBlues")) {
            this.font.otherBlues = arrayToNumbers(list);
        } else if (str.equals("FamilyBlues")) {
            this.font.familyBlues = arrayToNumbers(list);
        } else if (str.equals("FamilyOtherBlues")) {
            this.font.familyOtherBlues = arrayToNumbers(list);
        } else if (str.equals("BlueScale")) {
            this.font.blueScale = list.get(0).floatValue();
        } else if (str.equals("BlueShift")) {
            this.font.blueShift = list.get(0).intValue();
        } else if (str.equals("BlueFuzz")) {
            this.font.blueFuzz = list.get(0).intValue();
        } else if (str.equals(AFMParser.STD_HW)) {
            this.font.stdHW = arrayToNumbers(list);
        } else if (str.equals(AFMParser.STD_VW)) {
            this.font.stdVW = arrayToNumbers(list);
        } else if (str.equals("StemSnapH")) {
            this.font.stemSnapH = arrayToNumbers(list);
        } else if (str.equals("StemSnapV")) {
            this.font.stemSnapV = arrayToNumbers(list);
        } else if (str.equals("ForceBold")) {
            this.font.forceBold = list.get(0).booleanValue();
        } else if (str.equals("LanguageGroup")) {
            this.font.languageGroup = list.get(0).intValue();
        }
    }

    private List<Token> readProc() {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (true) {
            if (this.lexer.peekToken().getKind() == Token.START_PROC) {
                i10++;
            }
            Token nextToken = this.lexer.nextToken();
            arrayList.add(nextToken);
            if (nextToken.getKind() == Token.END_PROC && i10 - 1 == 0) {
                break;
            }
        }
        Token readMaybe = readMaybe(Token.NAME, "executeonly");
        if (readMaybe != null) {
            arrayList.add(readMaybe);
        }
        return arrayList;
    }

    private void readProcVoid() {
        int i10 = 1;
        while (true) {
            if (this.lexer.peekToken().getKind() == Token.START_PROC) {
                i10++;
            }
            if (this.lexer.nextToken().getKind() == Token.END_PROC && i10 - 1 == 0) {
                readMaybe(Token.NAME, "executeonly");
                return;
            }
        }
    }

    private void readPut() {
        Token.Kind kind = Token.NAME;
        readMaybe(kind, "readonly");
        Token read = read(kind);
        if (!read.getText().equals("NP") && !read.getText().equals("|")) {
            if (read.getText().equals("noaccess")) {
                read = read(kind);
            }
            if (read.getText().equals("put")) {
                return;
            }
            throw new IOException("Found " + read + " but expected NP");
        }
    }

    private Map<String, List<Token>> readSimpleDict() {
        HashMap hashMap = new HashMap();
        int intValue = read(Token.INTEGER).intValue();
        Token.Kind kind = Token.NAME;
        read(kind, "dict");
        readMaybe(kind, "dup");
        read(kind, "begin");
        for (int i10 = 0; i10 < intValue && this.lexer.peekToken() != null; i10++) {
            Token.Kind kind2 = this.lexer.peekToken().getKind();
            Token.Kind kind3 = Token.NAME;
            if (kind2 == kind3 && !this.lexer.peekToken().getText().equals("end")) {
                read(kind3);
            }
            if (this.lexer.peekToken() == null || (this.lexer.peekToken().getKind() == kind3 && this.lexer.peekToken().getText().equals("end"))) {
                break;
            }
            hashMap.put(read(Token.LITERAL).getText(), readDictValue());
        }
        Token.Kind kind4 = Token.NAME;
        read(kind4, "end");
        readMaybe(kind4, "readonly");
        read(kind4, BaseParser.DEF);
        return hashMap;
    }

    private void readSimpleValue(String str) {
        List<Token> readDictValue = readDictValue();
        if (str.equals(AFMParser.FONT_NAME)) {
            this.font.fontName = readDictValue.get(0).getText();
        } else if (str.equals("PaintType")) {
            this.font.paintType = readDictValue.get(0).intValue();
        } else if (str.equals("FontType")) {
            this.font.fontType = readDictValue.get(0).intValue();
        } else if (str.equals("FontMatrix")) {
            this.font.fontMatrix = arrayToNumbers(readDictValue);
        } else if (str.equals(AFMParser.FONT_BBOX)) {
            this.font.fontBBox = arrayToNumbers(readDictValue);
        } else if (str.equals("UniqueID")) {
            this.font.uniqueID = readDictValue.get(0).intValue();
        } else if (str.equals("StrokeWidth")) {
            this.font.strokeWidth = readDictValue.get(0).floatValue();
        } else if (str.equals("FID")) {
            this.font.fontID = readDictValue.get(0).getText();
        }
    }

    private void readSubrs(int i10) {
        int intValue = read(Token.INTEGER).intValue();
        for (int i11 = 0; i11 < intValue; i11++) {
            this.font.subrs.add(null);
        }
        read(Token.NAME, "array");
        for (int i12 = 0; i12 < intValue && this.lexer.peekToken() != null; i12++) {
            Token.Kind kind = this.lexer.peekToken().getKind();
            Token.Kind kind2 = Token.NAME;
            if (kind != kind2 || !this.lexer.peekToken().getText().equals("dup")) {
                break;
            }
            read(kind2, "dup");
            Token.Kind kind3 = Token.INTEGER;
            Token read = read(kind3);
            read(kind3);
            this.font.subrs.set(read.intValue(), decrypt(read(Token.CHARSTRING).getData(), CHARSTRING_KEY, i10));
            readPut();
        }
        readDef();
    }

    private List<Token> readValue() {
        ArrayList arrayList = new ArrayList();
        Token nextToken = this.lexer.nextToken();
        if (this.lexer.peekToken() == null) {
            return arrayList;
        }
        arrayList.add(nextToken);
        if (nextToken.getKind() == Token.START_ARRAY) {
            int i10 = 1;
            while (this.lexer.peekToken() != null) {
                if (this.lexer.peekToken().getKind() == Token.START_ARRAY) {
                    i10++;
                }
                Token nextToken2 = this.lexer.nextToken();
                arrayList.add(nextToken2);
                if (nextToken2.getKind() != Token.END_ARRAY || i10 - 1 != 0) {
                }
            }
            return arrayList;
        } else if (nextToken.getKind() == Token.START_PROC) {
            arrayList.addAll(readProc());
        } else if (nextToken.getKind() == Token.START_DICT) {
            read(Token.END_DICT);
            return arrayList;
        }
        readPostScriptWrapper(arrayList);
        return arrayList;
    }

    public Type1Font parse(byte[] bArr, byte[] bArr2) {
        this.font = new Type1Font(bArr, bArr2);
        parseASCII(bArr);
        if (bArr2.length > 0) {
            parseBinary(bArr2);
        }
        return this.font;
    }

    private void read(Token.Kind kind, String str) {
        Token read = read(kind);
        if (read.getText().equals(str)) {
            return;
        }
        throw new IOException("Found " + read + " but expected " + str);
    }
}
