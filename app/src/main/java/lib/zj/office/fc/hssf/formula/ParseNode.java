package lib.zj.office.fc.hssf.formula;

import a0.a;
import lib.zj.office.fc.hssf.formula.ptg.ArrayPtg;
import lib.zj.office.fc.hssf.formula.ptg.AttrPtg;
import lib.zj.office.fc.hssf.formula.ptg.FuncVarPtg;
import lib.zj.office.fc.hssf.formula.ptg.MemAreaPtg;
import lib.zj.office.fc.hssf.formula.ptg.MemFuncPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;

/* loaded from: classes3.dex */
final class ParseNode {
    public static final ParseNode[] EMPTY_ARRAY = new ParseNode[0];
    private final ParseNode[] _children;
    private boolean _isIf;
    private final Ptg _token;
    private final int _tokenCount;

    /* loaded from: classes3.dex */
    public static final class TokenCollector {
        private int _offset = 0;
        private final Ptg[] _ptgs;

        public TokenCollector(int i10) {
            this._ptgs = new Ptg[i10];
        }

        public void add(Ptg ptg) {
            if (ptg != null) {
                Ptg[] ptgArr = this._ptgs;
                int i10 = this._offset;
                ptgArr[i10] = ptg;
                this._offset = i10 + 1;
                return;
            }
            throw new IllegalArgumentException("token must not be null");
        }

        public int createPlaceholder() {
            int i10 = this._offset;
            this._offset = i10 + 1;
            return i10;
        }

        public Ptg[] getResult() {
            return this._ptgs;
        }

        public void setPlaceholder(int i10, Ptg ptg) {
            Ptg[] ptgArr = this._ptgs;
            if (ptgArr[i10] == null) {
                ptgArr[i10] = ptg;
                return;
            }
            throw new IllegalStateException(a.g("Invalid placeholder index (", i10, ")"));
        }

        public int sumTokenSizes(int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                i12 += this._ptgs[i10].getSize();
                i10++;
            }
            return i12;
        }
    }

    public ParseNode(Ptg ptg, ParseNode[] parseNodeArr) {
        if (ptg != null) {
            this._token = ptg;
            this._children = parseNodeArr;
            this._isIf = isIf(ptg);
            int i10 = 1;
            for (ParseNode parseNode : parseNodeArr) {
                i10 += parseNode.getTokenCount();
            }
            this._tokenCount = this._isIf ? i10 + parseNodeArr.length : i10;
            return;
        }
        throw new IllegalArgumentException("token must not be null");
    }

    private void collectIfPtgs(TokenCollector tokenCollector) {
        getChildren()[0].collectPtgs(tokenCollector);
        int createPlaceholder = tokenCollector.createPlaceholder();
        getChildren()[1].collectPtgs(tokenCollector);
        int createPlaceholder2 = tokenCollector.createPlaceholder();
        AttrPtg createIf = AttrPtg.createIf(tokenCollector.sumTokenSizes(createPlaceholder + 1, createPlaceholder2) + 4);
        if (getChildren().length > 2) {
            getChildren()[2].collectPtgs(tokenCollector);
            int createPlaceholder3 = tokenCollector.createPlaceholder();
            AttrPtg createSkip = AttrPtg.createSkip(((tokenCollector.sumTokenSizes(createPlaceholder2 + 1, createPlaceholder3) + 4) + 4) - 1);
            AttrPtg createSkip2 = AttrPtg.createSkip(3);
            tokenCollector.setPlaceholder(createPlaceholder, createIf);
            tokenCollector.setPlaceholder(createPlaceholder2, createSkip);
            tokenCollector.setPlaceholder(createPlaceholder3, createSkip2);
        } else {
            AttrPtg createSkip3 = AttrPtg.createSkip(3);
            tokenCollector.setPlaceholder(createPlaceholder, createIf);
            tokenCollector.setPlaceholder(createPlaceholder2, createSkip3);
        }
        tokenCollector.add(this._token);
    }

    private void collectPtgs(TokenCollector tokenCollector) {
        boolean z10;
        if (isIf(this._token)) {
            collectIfPtgs(tokenCollector);
            return;
        }
        Ptg ptg = this._token;
        if (!(ptg instanceof MemFuncPtg) && !(ptg instanceof MemAreaPtg)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            tokenCollector.add(ptg);
        }
        for (int i10 = 0; i10 < getChildren().length; i10++) {
            getChildren()[i10].collectPtgs(tokenCollector);
        }
        if (!z10) {
            tokenCollector.add(this._token);
        }
    }

    private int getTokenCount() {
        return this._tokenCount;
    }

    private static boolean isIf(Ptg ptg) {
        if ((ptg instanceof FuncVarPtg) && "IF".equals(((FuncVarPtg) ptg).getName())) {
            return true;
        }
        return false;
    }

    public static Ptg[] toTokenArray(ParseNode parseNode) {
        TokenCollector tokenCollector = new TokenCollector(parseNode.getTokenCount());
        parseNode.collectPtgs(tokenCollector);
        return tokenCollector.getResult();
    }

    public ParseNode[] getChildren() {
        return this._children;
    }

    public int getEncodedSize() {
        int size;
        Ptg ptg = this._token;
        if (ptg instanceof ArrayPtg) {
            size = 8;
        } else {
            size = ptg.getSize();
        }
        int i10 = 0;
        while (true) {
            ParseNode[] parseNodeArr = this._children;
            if (i10 < parseNodeArr.length) {
                size += parseNodeArr[i10].getEncodedSize();
                i10++;
            } else {
                return size;
            }
        }
    }

    public Ptg getToken() {
        return this._token;
    }

    public ParseNode(Ptg ptg) {
        this(ptg, EMPTY_ARRAY);
    }

    public ParseNode(Ptg ptg, ParseNode parseNode) {
        this(ptg, new ParseNode[]{parseNode});
    }

    public ParseNode(Ptg ptg, ParseNode parseNode, ParseNode parseNode2) {
        this(ptg, new ParseNode[]{parseNode, parseNode2});
    }
}
