package com.tom_roush.pdfbox.pdmodel.common.function.type4;

/* loaded from: classes2.dex */
public final class Parser {

    /* renamed from: com.tom_roush.pdfbox.pdmodel.common.function.type4.Parser$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tom_roush$pdfbox$pdmodel$common$function$type4$Parser$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$com$tom_roush$pdfbox$pdmodel$common$function$type4$Parser$State = iArr;
            try {
                iArr[State.NEWLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tom_roush$pdfbox$pdmodel$common$function$type4$Parser$State[State.WHITESPACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tom_roush$pdfbox$pdmodel$common$function$type4$Parser$State[State.COMMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum State {
        NEWLINE,
        WHITESPACE,
        COMMENT,
        TOKEN
    }

    /* loaded from: classes2.dex */
    public interface SyntaxHandler {
        void comment(CharSequence charSequence);

        void newLine(CharSequence charSequence);

        void token(CharSequence charSequence);

        void whitespace(CharSequence charSequence);
    }

    /* loaded from: classes2.dex */
    public static final class Tokenizer {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final char CR = '\r';
        private static final char EOT = 4;
        private static final char FF = '\f';
        private static final char LF = '\n';
        private static final char NUL = 0;
        private static final char SPACE = ' ';
        private static final char TAB = '\t';
        private final StringBuilder buffer;
        private final SyntaxHandler handler;
        private int index;
        private final CharSequence input;
        private State state;

        public /* synthetic */ Tokenizer(CharSequence charSequence, SyntaxHandler syntaxHandler, int i10) {
            this(charSequence, syntaxHandler);
        }

        private char currentChar() {
            return this.input.charAt(this.index);
        }

        private boolean hasMore() {
            if (this.index < this.input.length()) {
                return true;
            }
            return false;
        }

        private char nextChar() {
            this.index++;
            if (!hasMore()) {
                return EOT;
            }
            return currentChar();
        }

        private State nextState() {
            char currentChar = currentChar();
            if (currentChar != 0 && currentChar != ' ') {
                if (currentChar != '%') {
                    if (currentChar != '\t') {
                        if (currentChar != '\n' && currentChar != '\f' && currentChar != '\r') {
                            this.state = State.TOKEN;
                        } else {
                            this.state = State.NEWLINE;
                        }
                    }
                } else {
                    this.state = State.COMMENT;
                }
                return this.state;
            }
            this.state = State.WHITESPACE;
            return this.state;
        }

        private char peek() {
            if (this.index < this.input.length() - 1) {
                return this.input.charAt(this.index + 1);
            }
            return EOT;
        }

        private void scanComment() {
            char nextChar;
            this.buffer.append(currentChar());
            while (hasMore() && (nextChar = nextChar()) != '\n' && nextChar != '\f' && nextChar != '\r') {
                this.buffer.append(nextChar);
            }
            this.handler.comment(this.buffer);
        }

        private void scanNewLine() {
            char currentChar = currentChar();
            this.buffer.append(currentChar);
            if (currentChar == '\r' && peek() == '\n') {
                this.buffer.append(nextChar());
            }
            this.handler.newLine(this.buffer);
            nextChar();
        }

        private void scanToken() {
            char nextChar;
            char currentChar = currentChar();
            this.buffer.append(currentChar);
            if (currentChar != '{' && currentChar != '}') {
                while (hasMore() && (nextChar = nextChar()) != 0 && nextChar != 4 && nextChar != ' ' && nextChar != '{' && nextChar != '}' && nextChar != '\t' && nextChar != '\n' && nextChar != '\f' && nextChar != '\r') {
                    this.buffer.append(nextChar);
                }
                this.handler.token(this.buffer);
                return;
            }
            this.handler.token(this.buffer);
            nextChar();
        }

        private void scanWhitespace() {
            char nextChar;
            this.buffer.append(currentChar());
            while (hasMore() && ((nextChar = nextChar()) == 0 || nextChar == '\t' || nextChar == ' ')) {
                this.buffer.append(nextChar);
            }
            this.handler.whitespace(this.buffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tokenize() {
            while (hasMore()) {
                this.buffer.setLength(0);
                nextState();
                int i10 = AnonymousClass1.$SwitchMap$com$tom_roush$pdfbox$pdmodel$common$function$type4$Parser$State[this.state.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            scanToken();
                        } else {
                            scanComment();
                        }
                    } else {
                        scanWhitespace();
                    }
                } else {
                    scanNewLine();
                }
            }
        }

        private Tokenizer(CharSequence charSequence, SyntaxHandler syntaxHandler) {
            this.state = State.WHITESPACE;
            this.buffer = new StringBuilder();
            this.input = charSequence;
            this.handler = syntaxHandler;
        }
    }

    private Parser() {
    }

    public static void parse(CharSequence charSequence, SyntaxHandler syntaxHandler) {
        new Tokenizer(charSequence, syntaxHandler, 0).tokenize();
    }

    /* loaded from: classes2.dex */
    public static abstract class AbstractSyntaxHandler implements SyntaxHandler {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Parser.SyntaxHandler
        public void comment(CharSequence charSequence) {
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Parser.SyntaxHandler
        public void newLine(CharSequence charSequence) {
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Parser.SyntaxHandler
        public void whitespace(CharSequence charSequence) {
        }
    }
}
