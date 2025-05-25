package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.util.Internal;

@Internal
@Deprecated
/* loaded from: classes3.dex */
public final class CPSplitCalculator {
    private FileInformationBlock fib;

    public CPSplitCalculator(FileInformationBlock fileInformationBlock) {
        this.fib = fileInformationBlock;
    }

    public int getCommentsEnd() {
        return this.fib.getCcpCommentAtn() + getCommentsStart();
    }

    public int getCommentsStart() {
        return getHeaderStoryEnd();
    }

    public int getEndNoteEnd() {
        return this.fib.getCcpEdn() + getEndNoteStart();
    }

    public int getEndNoteStart() {
        return getCommentsEnd();
    }

    public int getFootnoteEnd() {
        return this.fib.getCcpFtn() + getFootnoteStart();
    }

    public int getFootnoteStart() {
        return getMainDocumentEnd();
    }

    public int getHeaderStoryEnd() {
        return this.fib.getCcpHdd() + getHeaderStoryStart();
    }

    public int getHeaderStoryStart() {
        return getFootnoteEnd();
    }

    public int getHeaderTextboxEnd() {
        return this.fib.getCcpHdrTxtBx() + getHeaderTextboxStart();
    }

    public int getHeaderTextboxStart() {
        return getMainTextboxEnd();
    }

    public int getMainDocumentEnd() {
        return this.fib.getCcpText();
    }

    public int getMainDocumentStart() {
        return 0;
    }

    public int getMainTextboxEnd() {
        return this.fib.getCcpTxtBx() + getMainTextboxStart();
    }

    public int getMainTextboxStart() {
        return getEndNoteEnd();
    }
}
