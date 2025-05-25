package com.tom_roush.fontbox.type1;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
class Type1Lexer {
    private final ByteBuffer buffer;
    private int openParens = 0;
    private Token aheadToken = readToken(null);

    public Type1Lexer(byte[] bArr) {
        this.buffer = ByteBuffer.wrap(bArr);
    }

    private char getChar() {
        return (char) this.buffer.get();
    }

    private Token readCharString(int i10) {
        this.buffer.get();
        byte[] bArr = new byte[i10];
        this.buffer.get(bArr);
        return new Token(bArr, Token.CHARSTRING);
    }

    private String readComment() {
        char c;
        StringBuilder sb2 = new StringBuilder();
        while (this.buffer.hasRemaining() && (c = getChar()) != '\r' && c != '\n') {
            sb2.append(c);
        }
        return sb2.toString();
    }

    private String readRegular() {
        StringBuilder sb2 = new StringBuilder();
        while (this.buffer.hasRemaining()) {
            this.buffer.mark();
            char c = getChar();
            if (!Character.isWhitespace(c) && c != '(' && c != ')' && c != '<' && c != '>' && c != '[' && c != ']' && c != '{' && c != '}' && c != '/' && c != '%') {
                sb2.append(c);
            } else {
                this.buffer.reset();
                break;
            }
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    private Token readString() {
        StringBuilder sb2 = new StringBuilder();
        while (this.buffer.hasRemaining()) {
            char c = getChar();
            if (c != '\n' && c != '\r') {
                if (c != '\\') {
                    if (c != '(') {
                        if (c != ')') {
                            sb2.append(c);
                        } else if (this.openParens == 0) {
                            return new Token(sb2.toString(), Token.STRING);
                        } else {
                            sb2.append(')');
                            this.openParens--;
                        }
                    } else {
                        this.openParens++;
                        sb2.append('(');
                    }
                } else {
                    char c10 = getChar();
                    if (c10 != '(') {
                        if (c10 != ')') {
                            if (c10 != '\\') {
                                if (c10 != 'b') {
                                    if (c10 != 'f') {
                                        if (c10 != 'n' && c10 != 'r') {
                                            if (c10 == 't') {
                                                sb2.append('\t');
                                            }
                                        } else {
                                            sb2.append("\n");
                                        }
                                    } else {
                                        sb2.append('\f');
                                    }
                                } else {
                                    sb2.append('\b');
                                }
                            } else {
                                sb2.append('\\');
                            }
                        } else {
                            sb2.append(')');
                        }
                    } else {
                        sb2.append('(');
                    }
                    if (Character.isDigit(c10)) {
                        try {
                            sb2.append((char) Integer.parseInt(String.valueOf(new char[]{c10, getChar(), getChar()}), 8));
                        } catch (NumberFormatException e10) {
                            throw new IOException(e10);
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                sb2.append("\n");
            }
        }
        return null;
    }

    private Token readToken(Token token) {
        boolean z10;
        do {
            z10 = false;
            while (this.buffer.hasRemaining()) {
                char c = getChar();
                if (c == '%') {
                    readComment();
                } else if (c == '(') {
                    return readString();
                } else {
                    if (c != ')') {
                        if (c == '[') {
                            return new Token(c, Token.START_ARRAY);
                        }
                        if (c == '{') {
                            return new Token(c, Token.START_PROC);
                        }
                        if (c == ']') {
                            return new Token(c, Token.END_ARRAY);
                        }
                        if (c == '}') {
                            return new Token(c, Token.END_PROC);
                        }
                        if (c == '/') {
                            return new Token(readRegular(), Token.LITERAL);
                        }
                        if (c == '<') {
                            if (getChar() == c) {
                                return new Token("<<", Token.START_DICT);
                            }
                            ByteBuffer byteBuffer = this.buffer;
                            byteBuffer.position(byteBuffer.position() - 1);
                            return new Token(c, Token.NAME);
                        } else if (c == '>') {
                            if (getChar() == c) {
                                return new Token(">>", Token.END_DICT);
                            }
                            ByteBuffer byteBuffer2 = this.buffer;
                            byteBuffer2.position(byteBuffer2.position() - 1);
                            return new Token(c, Token.NAME);
                        } else if (Character.isWhitespace(c) || c == 0) {
                            z10 = true;
                        } else {
                            ByteBuffer byteBuffer3 = this.buffer;
                            byteBuffer3.position(byteBuffer3.position() - 1);
                            Token tryReadNumber = tryReadNumber();
                            if (tryReadNumber != null) {
                                return tryReadNumber;
                            }
                            String readRegular = readRegular();
                            if (readRegular != null) {
                                if (!readRegular.equals("RD") && !readRegular.equals("-|")) {
                                    return new Token(readRegular, Token.NAME);
                                }
                                if (token != null && token.getKind() == Token.INTEGER) {
                                    return readCharString(token.intValue());
                                }
                                throw new IOException("expected INTEGER before -| or RD");
                            }
                            throw new DamagedFontException("Could not read token at position " + this.buffer.position());
                        }
                    } else {
                        throw new IOException("unexpected closing parenthesis");
                    }
                }
            }
        } while (z10);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[LOOP:1: B:31:0x008e->B:33:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.tom_roush.fontbox.type1.Token tryReadNumber() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.fontbox.type1.Type1Lexer.tryReadNumber():com.tom_roush.fontbox.type1.Token");
    }

    public Token nextToken() {
        Token token = this.aheadToken;
        this.aheadToken = readToken(token);
        return token;
    }

    public Token peekToken() {
        return this.aheadToken;
    }
}
